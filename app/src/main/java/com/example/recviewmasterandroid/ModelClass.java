package com.example.recviewmasterandroid;

public class ModelClass
{
    String name;
    String location;
    int imgId;
    public ModelClass(String n,String l,int mi)
    {
        this.name=n;
        this.location=l;
        this.imgId=mi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
