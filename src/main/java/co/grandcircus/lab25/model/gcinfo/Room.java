package co.grandcircus.lab25.model.gcinfo;

public class Room {

	private String name;
	private Integer level;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "Room [name=" + name + ", level=" + level + "]";
	}
	
	
}
