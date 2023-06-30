package com.example.quranapp.retrofit;

import com.example.quranapp.Models.AudioModel.Audio;
import com.example.quranapp.Models.AyatModel.Verses;
import com.example.quranapp.Models.SurahModel.Chapters;
import com.example.quranapp.Models.TerjemahanModel.Indonesia;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiEndpoint {
    @GET("chapters?language=id")
    Call<Chapters> getSurah();
    @GET("chapter_recitations/33?")
    Call<Audio> getAudio();
    @GET("quran/verses/uthmani?")
    Call<Verses> getAyat (@Query("chapter_number") int id);
    @GET("quran/translations/33?")
    Call<Indonesia> getIndo (@Query("chapter_number") int id);
}
