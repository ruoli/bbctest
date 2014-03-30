package com.lee.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: apple
 * Date: 29/03/2014
 * Time: 13:46
 * To change this template use File | Settings | File Templates.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Day {
    private List<Broadcast> broadcasts;

    public List<Broadcast> getBroadcasts() {
        return broadcasts;
    }

    public void setBroadcasts(List<Broadcast> broadcasts) {
        this.broadcasts = broadcasts;
    }
}
