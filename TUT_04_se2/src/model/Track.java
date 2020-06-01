package model;

public class Track {
	
	private int id;
	private String name;
	private int track_number;
	private int duration;
	public Track(int id, String name, int track_number, int duration) {
		super();
		this.id = id;
		this.name = name;
		this.track_number = track_number;
		this.duration = duration;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTrack_number() {
		return track_number;
	}
	public void setTrack_number(int track_number) {
		this.track_number = track_number;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
