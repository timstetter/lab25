package co.grandcircus.lab25.model.gcinfo;

public class Language {

	private String name;
	private Person creator;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person getCreator() {
		return creator;
	}
	public void setCreator(Person creator) {
		this.creator = creator;
	}
	@Override
	public String toString() {
		return "Language [name=" + name + ", creator=" + creator + "]";
	}
	
	
	
}
