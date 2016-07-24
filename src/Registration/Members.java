package Registration;

import java.util.List;
import java.util.Arrays;

public class Members {

	int memberId;
	String firstName;
	String lastName;
	String clubCategory;
	String emailAddress;
	String mobileNumber;
	String address;
	
	public Members(){
		
	}
	
	public Members(int id, String fname, String lname, String clubcategory, String email, String mobile, String address){
		memberId=id;
		firstName=fname;
		lastName=lname;
		clubCategory=clubcategory;
		emailAddress=email;
		mobileNumber=mobile;
		this.address = address;
	}
	
	public int getmemberid(){
		return memberId;
		
	}
	public void setmemberid(int id){
		this.memberId= id;
	}
	
	public String getFirstname(){
		return firstName;	
	}
	
	public void setFirstname(String fname){
		this.firstName=fname;
	}
	
	public String setLastname(){
		return lastName;
	}
	
	public void getLastname(String lname){
		this.lastName=lname;
	}
	
	public String getclubCategory(){
		return clubCategory;
	}
	public void setclubCategory(String clubcategory){
		this.clubCategory=clubcategory;
	}
	
	public String getemail(){
		return emailAddress;
	} 
	
	public void setemail(String email){
		this.emailAddress=email;
	}
	
	public String getMob(){
			return mobileNumber;	
	} 
		
	public void setMob(String mobile){
		this.mobileNumber=mobile;	
	}
	
	public String getAddress(){
		return address;			
	} 
			
	public void setAddres(String address){
		this.address=address;
	}
	
	public String toString()
	{	
		return String.format("%d, %s, %s, %s, %s, %s, %s", memberId,  firstName,  lastName,  clubCategory,  emailAddress,  mobileNumber,  address);
	}
	public void print(){
		 
		 List<Members>table= Arrays.asList(
					
				 new Members(1,"AAA","BBB","XYZ","BC@GMAIL.COM","011223355","COLOMBO"),
				 new Members(2,"AAA","BBB","ABC","BC@GMAIL.COM","011223355","COLOMBO"),
				 new Members(3,"AAA","BBB","PQR","BC@GMAIL.COM","011223355","COLOMBO"),
				 new Members(4,"AAA","BBB","PQR","BC@GMAIL.COM","011223355","COLOMBO"),
				 new Members(5,"AAA","BBB","XYZ","BC@GMAIL.COM","011223355","COLOMBO"));

				 {
					System.out.println();
					System.out.println("--------------------------");
					System.out.println("ALL MEMBERS");
				    System.out.println("--------------------------");
				 table.stream().forEach(x -> System.out.println(x));
				 	System.out.println();
					System.out.println();
					System.out.println("--------------------------");
					System.out.println("ABC MEMBERS");
					System.out.println("--------------------------");
				 table.stream().filter(Members ->Members.getclubCategory() == "ABC").forEach(System.out::println);
				 	System.out.println();
					System.out.println("--------------------------");
					System.out.println("XYZ MEMBERS");
					System.out.println("--------------------------");
				 table.stream().filter(Members ->Members.getclubCategory() == "XYZ").forEach(System.out::println);
				 	System.out.println();
					System.out.println("--------------------------");
					System.out.println("PQR MEMBERS");
					System.out.println("--------------------------");
				 table.stream().filter(Members ->Members.getclubCategory() == "PQR").forEach(System.out::println);
				 //table.parallelStream().forEach(System.out::println);
				 }

	}
}
