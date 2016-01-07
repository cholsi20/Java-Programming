/*
 * Courtney Holsinger
 * 11/8/2015
 * Chapter 9 & 10
 * Problems10.8 & 10.10
 */

package payroll;

import java.time.LocalDate;

//Fig. 10.9: PayrollSystemTest.java
//Employee hierarchy test program.

public class PayrollSystemTest 
{
public static void main(String[] args) 
{
	//create new local date time 
	LocalDate currentDate = LocalDate.now();
	
	//create new date objects
	Date salariedBirthDay = new Date(2,15,1975); 
	Date hourlyBirthDay = new Date(3,5,1999);
	Date commissionBirthDay = new Date(11,19,1995);
	Date baseBirthDay = new Date(4,20,1966);
	Date pieceBirthDay = new Date(11, 27, 1977);
	
	
   // create subclass objects
   SalariedEmployee salariedEmployee = 
      new SalariedEmployee("John", "Smith", "111-11-1111", salariedBirthDay, 800.00);
   HourlyEmployee hourlyEmployee = 
      new HourlyEmployee("Karen", "Price", "222-22-2222", hourlyBirthDay, 16.75, 40);
   CommissionEmployee commissionEmployee = 
      new CommissionEmployee(
      "Sue", "Jones", "333-33-3333", commissionBirthDay, 10000, .06);
   BasePlusCommissionEmployee basePlusCommissionEmployee = 
      new BasePlusCommissionEmployee(
      "Bob", "Lewis", "444-44-4444", baseBirthDay, 5000, .04, 300);
   PieceworkerEmployee pieceWorkerEmployee = new PieceworkerEmployee("Lisa", "DeBois", "555-55-5555", pieceBirthDay, 120.30, 40);

   System.out.println("Employees processed individually:");
   
   System.out.printf("%n%s%n%s: $%,.2f%n%n", 
      salariedEmployee, "earned", salariedEmployee.earnings());
   System.out.printf("%s%n%s: $%,.2f%n%n",
      hourlyEmployee, "earned", hourlyEmployee.earnings());
   System.out.printf("%s%n%s: $%,.2f%n%n",
      commissionEmployee, "earned", commissionEmployee.earnings());
   System.out.printf("%s%n%s: $%,.2f%n%n", 
      basePlusCommissionEmployee, 
      "earned", basePlusCommissionEmployee.earnings());
   System.out.printf("%s\n%s: $%,.2f\n\n", pieceWorkerEmployee, "earned", pieceWorkerEmployee.earnings());

   // create four-element Employee array
   Employee[] employees = new Employee[5]; 

   // initialize array with Employees
   employees[0] = salariedEmployee;
   employees[1] = hourlyEmployee;
   employees[2] = commissionEmployee; 
   employees[3] = basePlusCommissionEmployee;
   employees[4] = pieceWorkerEmployee;
   

   System.out.printf("Employees processed polymorphically:%n%n");
   
   // generically process each element in array employees
   for (Employee currentEmployee : employees) 
   {
      System.out.println(currentEmployee); // invokes toString

      // determine whether element is a BasePlusCommissionEmployee
      if (currentEmployee instanceof BasePlusCommissionEmployee) 
      {
         // downcast Employee reference to 
         // BasePlusCommissionEmployee reference
         BasePlusCommissionEmployee employee = 
            (BasePlusCommissionEmployee) currentEmployee;

         employee.setBaseSalary(1.10 * employee.getBaseSalary());

         System.out.printf(
            "new base salary with 10%% increase is: $%,.2f%n",
            employee.getBaseSalary());
      } 
      
      int currentMonth = currentDate.getMonthValue();
		
		if (currentEmployee.getBirthDay().getIntMonth() == currentMonth) {
			
			double bonus = 0;
			bonus = currentEmployee.earnings() + 1000.00;
			System.out.printf("Total with Bonus is: %,.2f\n", bonus);
			
		} // end if statement

      System.out.printf(
         "earned $%,.2f%n%n", currentEmployee.earnings());
   } 

   // get type name of each object in employees array
   for (int j = 0; j < employees.length; j++){
      System.out.printf("Employee %d is a %s%n", j, 
         employees[j].getClass().getName()); 
   }
} // end main
} // end class PayrollSystemTest

/**************************************************************************
* (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
* Pearson Education, Inc. All Rights Reserved.                           *
*                                                                        *
* DISCLAIMER: The authors and publisher of this book have used their     *
* best efforts in preparing the book. These efforts include the          *
* development, research, and testing of the theories and programs        *
* to determine their effectiveness. The authors and publisher make       *
* no warranty of any kind, expressed or implied, with regard to these    *
* programs or to the documentation contained in these books. The authors *
* and publisher shall not be liable in any event for incidental or       *
* consequential damages in connection with, or arising out of, the       *
* furnishing, performance, or use of these programs.                     *
*************************************************************************/

