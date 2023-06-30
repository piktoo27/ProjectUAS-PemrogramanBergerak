package com.example.quranapp.Models.TerjemahanModel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Indonesia {
    @SerializedName("translations")
    private List<TranslateItem> translations;

    @SerializedName("meta")
    private Meta meta;

    public List<TranslateItem> getTranslations(){
        return translations;
    }

    public Meta getMeta(){
        return meta;
    }

    @Override
    public String toString(){
        return
                "Indo{" +
                        "translations = '" + translations + '\'' +
                        ",meta = '" + meta + '\'' +
                        "}";
    }
}
