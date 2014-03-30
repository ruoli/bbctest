package com.lee;

import com.lee.Controller.RestJsonFetcher;
import com.lee.Model.Broadcast;
import com.lee.Model.ResponseData;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
* Created with IntelliJ IDEA.
* User: apple
* Date: 27/03/2014
* Time: 23:00
* To change this template use File | Settings | File Templates.
*/
public class RestJsonFetcherTest {
    RestJsonFetcher restJsonFetcher;
    @Before
    public void setup(){
        restJsonFetcher = new RestJsonFetcher();
    }

    @Test
    public void isAbleToGetJsonData(){
        ResponseData result = restJsonFetcher.getSchduleModel();
        assertTrue("result is not empty", result != null);
    }

    @Test
    public void isBroadCastListExist(){
        assertTrue("broadcast list has 13 objects", restJsonFetcher.getBroadCastModelList().size() > 0);
    }

    @Test
    public void isProgrammeExistInAllBroadcast(){
        assertTrue("all broadcast has programme", isProgrammeExist());
    }

    private boolean isProgrammeExist(){
        List<Broadcast> broadcastList = restJsonFetcher.getBroadCastModelList();
        boolean isProgrammeExist = true;
        for (int i = 0; i < broadcastList.size(); i++){
            if(broadcastList.get(i).getProgramme() == null){
                isProgrammeExist = false;
            }
        }
        return isProgrammeExist;
    }
}
