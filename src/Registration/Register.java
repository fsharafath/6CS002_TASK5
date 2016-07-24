package Registration;

import java.text.ParseException;



public class Register {

		
		public static void main(String[] args) throws ParseException {
			
			Members members= new Members();
			members.print();
			ClubCategory clubCategory= new ClubCategory();
			clubCategory.print();
			Payment payment = new Payment();
			payment.print();
			 
		}
}
