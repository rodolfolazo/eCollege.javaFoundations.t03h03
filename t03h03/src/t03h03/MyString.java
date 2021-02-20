package t03h03;

public class MyString {
	
	int age;
	String name;
	
	public static void main(String[] args){
		MyString t1 = new MyString();
		t1.age = 10;
		t1.name = "Bill";
		System.out.println(t1.toString());
	  
	 }
	
	public String toString(){
		return "Name: " + name + "\n" + "Age: " + age;
	}
	
}
