package Project11;

import java.util.ArrayList;
import java.util.List;

public class Earning {
	public static void main(String[] args) {
		Staff emp1= new Staff("Roy","01");
		Staff emp2= new Staff("Tom","02");
		Staff emp3= new Staff("Jessica","03");
		Staff emp4= new Staff("Mark","04");
		Staff emp5= new Staff("Amy","04");
		
		
		List<Staff> list= new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		
		Customer cus1= new Customer("Harry",1234,4321);
		Customer cus2= new Customer("Pablo",7593,5046);
		Customer cus3= new Customer("Troy",4390,8272);
		Customer cus4= new Customer("Harry",7524,8442);
		Customer cus5= new Customer("chris",6513,3742);
		
		
		List<Customer> customerList=new ArrayList<>();
		customerList.add(cus1);
		customerList.add(cus2);
		customerList.add(cus3);
		customerList.add(cus4);
		customerList.add(cus5);
		
		Maintenance man =new Maintenance("Cleaning","Electricity");
		Maintenance mant2= new Maintenance("decoration","Furniture");
		
		List<Maintenance> list1=new ArrayList<>();
		list1.add(man);
		
		PG hotel =new PG (list,customerList,list1);
		cus1.paidAmount(3000);
		cus2.paidAmount(3800);
		cus3.paidAmount(1000);
		cus4.paidAmount(1800);
		cus5.paidAmount(2200);
		
		emp1.salaryEarned(250);
		emp2.salaryEarned(370);
		emp3.salaryEarned(350);
		emp4.salaryEarned(270);
		emp5.salaryEarned(290);
		
		man.totalMaintainance(710);
		mant2.totalMaintainance(490);
		
		System.out.println("Total Money Earned is "+hotel.getMoneyEarned());
		System.out.println("Money left after giving salary "+hotel.getMoneySpent());
        	
	}
}
