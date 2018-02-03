package basicpackage;

import java.util.Collections;
import java.util.Comparator;
import java.lang.Comparable;


public class Compare implements Comparable<Compare>{

	private String name;
	private int dept;
	private int age;
	
	public Compare(String name, int dept, int age){
		this.name = name;
		this.dept = dept;
		this.age = age;
	}
	
	@Override
	public int compareTo(Compare emp) {
	
		if(this.dept < emp.dept)
			return 1;
		else if (this.dept > emp.dept)
			return -1;
		else
			return 0;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compare c1 = new Compare("AAA", 2, 35);
		Compare c2 = new Compare("ABA", 2, 25);
		Compare c3 = new Compare("ABC", 3, 35);
		
		//Collections.sort(c1, new Compare());
		int result = c1.compareTo(c2);
			System.out.println(result);
	}

}
