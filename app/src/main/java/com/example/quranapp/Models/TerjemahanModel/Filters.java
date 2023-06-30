package com.example.quranapp.Models.TerjemahanModel;
import com.google.gson.annotations.SerializedName;

public class Filters {
    @SerializedName("resource_id")
    private int resourceId;

    public int getResourceId(){
        return resourceId;
    }

    @Override
    public String toString(){
        return
                "Filters{" +
                        "resource_id = '" + resourceId + '\'' +
                        "}";
    }
}
