package Registration;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Payment {
	
	int paymentId;
	int memberId;
	String clubCategory;
	double payAmount;
	Date payDate;
	
	public Payment(int paymentId, int memberId,  String clubCategory, double payAmount, Date payDate) {
		this.paymentId= paymentId;
		this.memberId=memberId;
		this.clubCategory=clubCategory;
		this.payAmount=payAmount;
		this.payDate=payDate;	
	}
	
	public Payment() {
	
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	
	public double getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(int payAmount) {
		this.payAmount = payAmount;
	}

	public Date getDate() {
		return payDate;
	}

	public void setDate(Date payDate) {
		this.payDate = payDate;
	}
	
	public String toString()
	{	
		return String.format("%d, %s, %s, %s, %s", paymentId, memberId, clubCategory , payAmount, payDate);
	}
	public void print() throws ParseException{
			DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
			
		 List<Payment>table= Arrays.asList(
				
				 
				 new Payment(1,1,"XYZ",10000.00,dateFormat.parse("08-08-2015")),
				 new Payment(1,2,"XYZ",20000.00,dateFormat.parse("18-02-2016")),
				 new Payment(1,3,"XYZ",30000.00,dateFormat.parse("28-04-2014")),
				 new Payment(1,4,"XYZ",40000.00,dateFormat.parse("17-01-2016")),
				 new Payment(1,5,"XYZ",50000.00,dateFormat.parse("23-11-2015")));

				 {
					System.out.println();
					System.out.println("--------------------------");
					System.out.println("ALL PAYMENTS");
				    System.out.println("--------------------------");
				 table.stream().forEach(x -> System.out.println(x));
				 }

	}
}
