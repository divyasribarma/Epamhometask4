/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epamtask4;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CalculateInterest {

	public static void CalInterest() {
		PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));
		Scanner sc = new Scanner(System.in);
		ps.println("Enter the principle amount: ");
		try {
			double principal = sc.nextDouble();
			ps.println("Enter the time period(in years) : ");
			double timePeriod = sc.nextDouble();
			ps.println("Enter the rate: ");
			double rate = sc.nextDouble();
			ps.println("The simple interest = " +((principal * timePeriod * rate) / 100));
			ps.println("The compound interest = " +((principal * Math.pow(1 + (rate / 100), timePeriod)) - principal));
			
		} catch (Exception e) {
			ps.println("Please enter a valid input!");
			
		}
		ps.println("*******************************************");
		
		
	}
		
}