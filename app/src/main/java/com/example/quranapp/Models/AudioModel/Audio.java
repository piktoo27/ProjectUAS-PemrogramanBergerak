package com.example.quranapp.Models.AudioModel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Audio{

	@SerializedName("audio_files")
	private List<AudioItem> audioFiles;

	public List<AudioItem> getAudioFiles(){
		return audioFiles;
	}

	@Override
 	public String toString(){
		return 
			"Audio{" + 
			"audio_files = '" + audioFiles + '\'' + 
			"}";
		}
}