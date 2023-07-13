package domain;

public class Employee extends IdEntity{

    private String firstName;
    private String lastName;

    public Employee(){}
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
	@Override
	public String toString() {
		return " Id:"+getId()+", firstName:" + firstName + ", lastName:" + lastName;
	}
    

}