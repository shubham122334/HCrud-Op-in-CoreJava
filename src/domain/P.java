package domain;

public class P extends St{

    private String firstName;
    private String lastName;

    public P(){}
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