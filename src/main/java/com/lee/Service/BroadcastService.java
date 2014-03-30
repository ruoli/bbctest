package com.lee.Service;

import com.lee.Model.Broadcast;


public interface BroadcastService {
    void persistBroadCast(Broadcast broadcast);
    Broadcast findBroadcastById(String pid);
}
