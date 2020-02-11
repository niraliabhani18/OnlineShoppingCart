package main;

public class Name {

	//fields
	private String firstName;
	private String familyName;
	
	public Name() {
		firstName = "-";
		familyName = "-";
	}

	public Name(String firstname, String familyname) {
		this.firstName = firstname;
		this.familyName = familyname;
	}
	
	
	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}

	public void setFamilyname(String familyname) {
		this.familyName = familyname;
	}

	public String getFirstname() {
		return firstName;
	}

	public String getFamilyname() {
		return familyName;
	}

	public String getFullName() {
		return firstName + " " + familyName;
	}

	@Override
	public String toString() {
		return "main.Name: first name=" + firstName + " surname=" + familyName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj==null || this.getClass()!=obj.getClass())
			return false;
		
		Name n = (Name) obj;
		return this.firstName.equals(n.firstName);
	}
}
