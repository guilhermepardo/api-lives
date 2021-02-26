package com.spring.agendalive.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
public class Config {


    MongoClientURI uri = new MongoClientURI(
            "mongodb://dbGprda:admin@aprendizado-shard-00-00.wspke.mongodb.net:27017,aprendizado-shard-00-01.wspke.mongodb.net:27017,aprendizado-shard-00-02.wspke.mongodb.net:27017/live-database?ssl=true&replicaSet=atlas-ewjogj-shard-0&authSource=admin&retryWrites=true&w=majority");
    MongoClient mongoClient = new MongoClient(uri);
    MongoDatabase database = mongoClient.getDatabase("live-database");


}
