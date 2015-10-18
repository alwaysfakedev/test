package by.owm.service.db.impl;

import by.owm.service.db.DataService;
import by.owm.service.db.client.OWMMongoClient;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

/**
 * Created by haria on 13.10.2015.
 */
public class DataServiceImpl implements DataService
{
    private OWMMongoClient mongoClient;


    public boolean logIn(String name, String password)
    {
        boolean result = false;
        DBObject credtials = new BasicDBObject("name", name).append("password", password);
        result = mongoClient.getCollection("users").find(credtials).count() > 0;

        return result;
    }

    public OWMMongoClient getMongoClient() {
        return mongoClient;
    }

    public void setMongoClient(OWMMongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }


}
