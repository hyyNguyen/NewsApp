package com.example.asus.newsapp.Model;

import java.util.Objects;

/**
 * Created by ASUS on 11/10/17.
 */

public class Icon {
    private String url;
    private int width,height, bytes;
    private String format,shalsum;
    private Objects error;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBytes() {
        return bytes;
    }

    public void setBytes(int bytes) {
        this.bytes = bytes;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getShalsum() {
        return shalsum;
    }

    public void setShalsum(String shalsum) {
        this.shalsum = shalsum;
    }

    public Objects getError() {
        return error;
    }

    public void setError(Objects error) {
        this.error = error;
    }
}
