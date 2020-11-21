package co.grandcircus.lab25.model;

public class Complete implements Comparable<Complete> {

	private String firstName;
	private String lastName;
	private String innovation;
	private Integer year;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getInnovation() {
		return innovation;
	}

	public void setInnovation(String innovation) {
		this.innovation = innovation;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Complete [firstName=" + firstName + ", lastName=" + lastName + ", innovation=" + innovation + ", year="
				+ year + "]";
	}

	@Override
	public int compareTo(Complete o) {
		if (getYear() == null || o.getYear() == null) {
			return 0;
		}
		return getYear().compareTo(o.getYear());
	}

}
