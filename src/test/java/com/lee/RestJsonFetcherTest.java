package com.lee;

import com.lee.Controller.RestJsonFetcher;
import com.lee.Model.Broadcast;
import com.lee.Model.ResponseData;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

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
