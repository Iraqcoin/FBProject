/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vng.fresher.za.model;

import org.json.simple.JSONObject;

/**
 *
 * @author quanvd
 */
public class Browser extends BaseModel{
    
    private int appId;
    private String browserName;
    private int sessions;

    public Browser() {
    }

    @Override
    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        json.put("appId", appId);
        json.put("browserName", browserName);
        json.put("sessions", sessions);
        return json;
    }
    
    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    public int getSessions() {
        return sessions;
    }

    public void setSessions(int sessions) {
        this.sessions = sessions;
    }
    
}