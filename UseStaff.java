package com.onesoft.Streams;
import java.util.*;
import java.util.stream.Collectors;
public class UseStaff {
	public static void main(String[] args) {
		
		Staff s1 = new Staff(120,"Suresh",25,"male",24000);
		ArrayList<Staff> staffs = new ArrayList<>();
		ArrayList<Staff> staffs1=new ArrayList<>();
		staffs.add(new Staff(101,"Hari",25,"male",20000));
		staffs.add(new Staff(121,"Raja",23,"male",18000));
		staffs.add(new Staff(110,"Kavitha",22,"female",22000));
		staffs.add(new Staff(112,"Harini",23,"female",23000));
		staffs.add(new Staff(106,"Ravi",26,"male",26000));
		staffs1.add(new Staff(113,"Rajesh",28,"male",30000));
		staffs1.add(new Staff(103,"Surya",21,"female",18000));
		staffs1.add(new Staff(117,"Deepa",23,"female",21000));
		staffs1.add(new Staff(118,"Rakesh",27,"male",25000));
		staffs1.add(new Staff(120,"Suresh",25,"male",24000));
		staffs1.add(s1);
		
		List<Staff> femaleStaff	=staffs.stream().filter(x->x.getGender().equals("female")).collect(Collectors.toList());
		/*long femaleCount = femaleStaff.stream().count();
		long maleCount= staffs.stream().filter(x->x.getGender().equals("male")).count();
		
		
		for(Staff s : femaleStaff)
		{
			System.out.println(s);
		}
		
		System.out.println("\n");
		System.out.println("Female count : "+femaleCount);
		System.out.println("Male count : "+maleCount);
		
		List<Staff> salaryList = staffs.stream().filter(x->(x.getSalary()>=25000&&x.getSalary()<=30000)).collect(Collectors.toList()); 
		System.out.println();
		for(Staff s : salaryList)
		{
			System.out.println(s);
		}
		List<Integer>seniorSalaryList= staffs.stream().filter(x->x.getAge()>25).map(y->y.getSalary()).collect(Collectors.toList());
		for(Integer s : seniorSalaryList)
		{
			System.out.println(s);
		}
		
		Map<Integer,Staff> highSalaryStaff = staffs.stream().filter(x->x.getSalary()>25000).collect(Collectors.toMap(y->y.getId(),z->z));
		highSalaryStaff.forEach((x,y)->System.out.println(x+" "+y));*/
		
		//Staff highSalary = staffs.stream().map(x->x.getSalary()).max(Comparator.comparingInt(Staff::getSalary)).get();
		
		staffs.stream().map(x->x.getAge()).distinct().collect(Collectors.toList()).forEach(y->System.out.println(y));
		
		List<List<Staff>> staffList = Arrays.asList(staffs,staffs1);
		staffList.forEach(x->System.out.println(x));
		
		
		System.out.println("____________________________________________________");
		List<Staff> finalStaffList = staffList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		finalStaffList.forEach(x->System.out.println(x));
		
		
		System.out.println("____________________________________________________");
		finalStaffList.stream().sorted(Comparator.comparingInt(Staff::getSalary)).collect(Collectors.toList()).forEach(x->System.out.println(x));
		System.out.println("____________________________________________________");
		
		finalStaffList.stream().limit(5).forEach(x->System.out.println(x));
		
		boolean b =finalStaffList.stream().map(x->x.getName()).anyMatch(y->y.contains("male"));
		System.out.println(b);
	}

}
