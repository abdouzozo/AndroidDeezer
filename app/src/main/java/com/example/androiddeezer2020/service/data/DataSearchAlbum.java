
package com.example.androiddeezer2020.service.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataSearchAlbum {

    @SerializedName("data")
    private List<Album> mData = null;
    @SerializedName("total")
    private Integer mTotal;
    @SerializedName("next")
    private String mNext;

    public List<Album> getData() {
        return mData;
    }

    public void setData(List<Album> data) {
        this.mData = data;
    }

    public Integer getTotal() {
        return mTotal;
    }

    public void setTotal(Integer total) {
        this.mTotal = total;
    }

    public String getNext() {
        return mNext;
    }

    public void setNext(String next) {
        this.mNext = next;
    }
}
