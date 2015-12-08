package by.owm.service.db.impl;

import by.owm.service.db.DataService;
import by.owm.service.db.client.OWMMongoClient;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class DataServiceImpl implements DataService
{
    private OWMMongoClient mongoClient;


    public boolean logIn(String name, String password)
    {
        boolean result = false;
        DBObject credtials = new BasicDBObject("name", name).append("password", md5(password));
        result = mongoClient.getCollection("users").find(credtials).count() > 0;

        return result;
    }

    public OWMMongoClient getMongoClient() {
        return mongoClient;
    }

    public void setMongoClient(OWMMongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    private String md5(String input) {

        String md5 = null;

        if(null == input) return null;

        try {

            //Create MessageDigest object for MD5
            MessageDigest digest = MessageDigest.getInstance("MD5");

            //Update input string in message digest
            digest.update(input.getBytes(), 0, input.length());

            //Converts message digest value in base 16 (hex)
            md5 = new BigInteger(1, digest.digest()).toString(16);

        } catch (NoSuchAlgorithmException e) {

            e.printStackTrace();
        }
        return md5;
    }
}
