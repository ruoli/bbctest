package com.lee.AppMain;


import com.lee.Controller.RestJsonFetcher;
import com.lee.Model.Broadcast;
import com.lee.Model.Programme;
import com.lee.Service.BroadcastService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class BBCMain {
    public static void main(String[] args) {
        System.out.println("load context");
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        RestJsonFetcher fetcher = new RestJsonFetcher();
        List<Broadcast> broadCastsList = fetcher.getBroadCastModelList();

        BroadcastService broadcastService = (BroadcastService) context.getBean("broadcastService");

        for (int i = 0; i < broadCastsList.size(); i++){
            broadcastService.persistBroadCast(broadCastsList.get(i));
        }

        context.close();

    }
}
