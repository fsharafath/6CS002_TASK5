package Registration;

import java.util.Arrays;
import java.util.List;

public class ClubCategory {
	int clubCategoryId;
	String clubCategoryName;

	
	public ClubCategory(int id, String name){
		clubCategoryId=id;
		clubCategoryName=name;
	}
	
	public ClubCategory() {
	
	}

	public int getclubid(){
		return clubCategoryId;
		
	}
	public void setclubid(int id){
		this.clubCategoryId= id;
	}
	
	public String getclubname(){
		return clubCategoryName;
		
	}
	public void setclubname(String name){
		this.clubCategoryName= name;
	}
	
	public String toString()
	{	
		return String.format("%d, %s ", clubCategoryId, clubCategoryName );
	}
	
	public void print(){
		 
		 List<ClubCategory>table= Arrays.asList(
					
				 new ClubCategory(1,"XYZ"),
				 new ClubCategory(2,"ABC"),
				 new ClubCategory(3,"PQR"));

				 {
					System.out.println();
					System.out.println("--------------------------");
					System.out.println("ALL CATEGORY");
				    System.out.println("--------------------------");
				 table.stream().forEach(x -> System.out.println(x));
				 	System.out.println();
					System.out.println();
					System.out.println("--------------------------");
					System.out.println("ABC CATEGORY");
					System.out.println("--------------------------");
				 table.stream().filter(Members ->Members.getclubname() == "ABC").forEach(System.out::println);
				 	System.out.println();
					System.out.println("--------------------------");
					System.out.println("XYZ CATEGORY");
					System.out.println("--------------------------");
				 table.stream().filter(Members ->Members.getclubname() == "XYZ").forEach(System.out::println);
				 	System.out.println();
					System.out.println("--------------------------");
					System.out.println("PQR CATEGORY");
					System.out.println("--------------------------");
				 table.stream().filter(Members ->Members.getclubname() == "PQR").forEach(System.out::println);
				 }

	}
}
