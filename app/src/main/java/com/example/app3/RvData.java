package com.example.app3;

public class RvData {
    private String title,userId,link;
    public RvData(String title,String userId,String link){
        this.link=link;
        this.userId=userId;
        this.title=title;
    }
    public String getLink() {
        return link;
    }
    public String getTitle() {
        return title;
    }
    public String getUserId() {
        return userId;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
