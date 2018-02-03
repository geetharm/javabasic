package basicpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;


public class CompareComparator{

	String name;
	int dept;
	int age;
	
	public CompareComparator(String name, int dept, int age){
		this.name = name;
		this.dept = dept;
		this.age = age;
	}

	public static void printList(List<CompareComparator> list) {
		for(CompareComparator c: list) {
			System.out.println(c.name + " " + c.dept + " " + c.age);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<CompareComparator> c = new ArrayList<CompareComparator>();
		
		c.add(new CompareComparator("BAA", 2, 35));
		c.add(new CompareComparator("ABA", 2, 25));
		c.add(new CompareComparator("ABC", 3, 35));
		
		System.out.println("Name Comparison");
		Collections.sort(c, new NameComparator());
		CompareComparator.printList(c);
		
		System.out.println("Age Comparison");
		Collections.sort(c, new AgeComparator());
		CompareComparator.printList(c);
		
		System.out.println("Dept Comparison");
		Collections.sort(c, new DeptComparator());
		CompareComparator.printList(c);
	}
}


class NameComparator implements Comparator<CompareComparator>{
	@Override
	public int compare(CompareComparator emp1, CompareComparator emp2) {
	
		return (emp1.name.compareTo(emp2.name));
	}
}

class AgeComparator implements Comparator<CompareComparator>{
	@Override
	public int compare(CompareComparator emp1, CompareComparator emp2) {
	
		if(emp1.age < emp2.age) {
			return -1;
		} else if (emp1.age > emp2.age) {
			return 1;
		} else
			return 0;
	}
}
	
class DeptComparator implements Comparator<CompareComparator>{
	@Override
	public int compare(CompareComparator emp1, CompareComparator emp2) {
	
		if(emp1.dept < emp2.dept) {
			return -1;
		} else if (emp1.dept > emp2.dept) {
			return 1;
		} else
			return 0;
	}
}


