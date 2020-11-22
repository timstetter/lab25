package co.grandcircus.lab25.model.gcinfo;

import java.util.List;

public class GCResponse {

	private String organization;
	private List<Room> rooms;
	private Person ceo;
	private List<Language> languages;
	
	
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	public Person getCeo() {
		return ceo;
	}
	public void setCeo(Person ceo) {
		this.ceo = ceo;
	}
	public List<Language> getLanguages() {
		return languages;
	}
	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}
	@Override
	public String toString() {
		return "GCResponse [organization=" + organization + ", rooms=" + rooms + ", ceo=" + ceo + ", languages="
				+ languages + "]";
	}
	
	
	
}
