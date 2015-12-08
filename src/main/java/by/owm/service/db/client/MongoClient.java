package by.owm.service.db.client;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;

import org.apache.log4j.Logger;

public class MongoClient {

    private final Logger logger = Logger.getLogger(MongoClient.class);

    private String host;
    private String port;
    private String dbName;
    private String userName;
    private String password;

    private DB database;

    public MongoClient() throws UnknownHostException
    {
        super();
    }

    public DBCollection getCollection(String collectionName)
    {
        return getDatabase().getCollection(collectionName);
    }

    public String getHost()
    {
        return host;
    }

    public void setHost(String host)
    {
        this.host = host;
    }

    public String getPort()
    {
        return port;
    }

    public void setPort(String port)
    {
        this.port = port;
    }

    public String getDbName()
    {
        return dbName;
    }

    public void setDbName(String dbName)
    {
        this.dbName = dbName;
    }

    public DB getDatabase()
    {
        if (database == null)
        {
            com.mongodb.MongoClient mongo;
            try
            {
                mongo = new com.mongodb.MongoClient(getHost(), Integer.valueOf(getPort()));
                database = mongo.getDB(getDbName());
                database.authenticate(getUserName(), getPassword().toCharArray());
            }
            catch (NumberFormatException e)
            {
                logger.error(e.getMessage());
            }
            catch (UnknownHostException e)
            {
                logger.error(e.getMessage());
            }

        }
        return database;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
