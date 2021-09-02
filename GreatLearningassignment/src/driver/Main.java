package driver;

import model.AdminDepartment;
import model.HRDepartment;
import model.TechDepartment;

public class Main {
	public static void main(String[] args) {
		AdminDepartment ad = new AdminDepartment();
		HRDepartment hr = new HRDepartment();
		TechDepartment td = new TechDepartment();
		System.out.println("Welcome to"+" "+ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		System.out.println("\n");
		System.out.println("Welcome to"+" "+hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println("\n");
		System.out.println("Welcome to"+" "+td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.isTodayAHoliday());
		System.out.println(td.getTechStackInformation());
		System.out.println("\n");


	}
}
