package phase1assistedproject;

import java.util.ArrayList;
import java.util.Scanner;
public class emailid {
public static void main(String[] args) {
// TODO Auto-generated method stub
ArrayList<String> list = new ArrayList<>();
list.add("chandu@gmail.com");
list.add("chandul23@gmail.com");
list.add("akhilagreddy@gmail.com");
list.add("g.akhilareddy@gmail.com");
System.out.println(list);
System.out.println("enter the mailid to find : ");
try (Scanner sc = new Scanner(System.in)) {
	String mailid=sc.nextLine();
	for(String ref : list) {
	if (list.contains(mailid)){
	System.out.println("mailid you entered is true");
	break;
	}
	else {
	System.out.println("plese enter the correct mail id ");
	break;
	}
	}
}
}
}


