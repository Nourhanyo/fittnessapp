package com.example.fittnessapp;

public class myitem {
    private String itemname;
    private int imageicon;

    public myitem(String itemname, int imageicon) {
        this.itemname = itemname;
        this.imageicon = imageicon;
    }

    public String getItemname() {
        return itemname;
    }

    public int getVedioicon() {
        return imageicon;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public void setVedioicon(int imageicon) {
        this.imageicon = imageicon;
    }

    public String tostring(){
        return getItemname();
    }
}
