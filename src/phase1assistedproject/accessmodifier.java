package phase1assistedproject;

public class accessmodifier {
	  void display() 
	     { 
	         System.out.println("You are using defalut access specifier"); 
	     } 


	public static void main(String[] args) {
		////default
		System.out.println("Dafault Access Specifier");
		 accessmodifier obj = new  accessmodifier(); 		  
       obj.display(); 

	}
// TODO Auto-generated method stub

	
}


