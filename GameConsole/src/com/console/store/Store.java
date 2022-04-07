package com.console.store;

import java.util.ArrayList;
import com.console.media.*;

public class Store {

	ArrayList<Music> musicStore = new ArrayList<Music>();
	ArrayList<Video> videoStore = new ArrayList<Video>();
	ArrayList<VideoGame> gameStore = new ArrayList<VideoGame>();
	
	//gameStore.add()
	
	public ArrayList<Music> getMusicStore() {
		return musicStore;
	}

	public void setMusicStore(ArrayList<Music> musicStore) {
		this.musicStore = musicStore;
	}

	public ArrayList<Video> getVideoStore() {
		return videoStore;
	}

	public void setVideoStore(ArrayList<Video> videoStore) {
		this.videoStore = videoStore;
	}

	public ArrayList<VideoGame> getGameStore() {
		return gameStore;
	}

	public void setGameStore(ArrayList<VideoGame> gameStore) {
		this.gameStore = gameStore;
	}

}
