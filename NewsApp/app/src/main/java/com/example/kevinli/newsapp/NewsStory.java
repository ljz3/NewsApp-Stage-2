package com.example.kevinli.newsapp;

public class NewsStory {

    private String mTitle;
    private String mAuthor;
    private String mWebUrl;
    private String mDate;
    private String mSection;

    public NewsStory(String title, String author, String date, String section, String webUrl) {
        mTitle = title;
        mAuthor = author;
        mWebUrl = webUrl;
        mDate = date;
        mSection = section;
    }


    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getWebUrl() {
        return mWebUrl;
    }

    public String getDate() {
        return mDate;
    }

    public String getSection() {
        return mSection;
    }
}
