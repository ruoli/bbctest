package com.lee.DAO;

import com.lee.Model.Broadcast;


public interface BroadcastDAO {
    void persistBroadCast(Broadcast broadcast);
    Broadcast findBroadcastByPid(String pid);
}
