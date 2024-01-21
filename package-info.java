 package Abstract;
 abstract class person extends Student{
	 abstract void display();
	 void print() {
		 System.out.println("This is Abstract Class");
	 }
	 public static void main(String args[]) {
		 Student sc=new Student()	;
		 sc.display();
	 }
	 
	 
 }