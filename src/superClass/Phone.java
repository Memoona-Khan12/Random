package superClass;

public class Phone {
	String Model;
	int year;
	String Brand;
	
	//Constructor1
	Phone(){
	System.out.println("This is a Phone Model");
	}
	//Constructor2
	public Phone(String Model){
		this.Model=Model;
		System.out.println(this.Model);
	}
	//Constructor3
	public Phone(String Model, int year, String Brand){
		this.Model=Model;
		this.year=year;
		this.Brand=Brand;
		System.out.println(this.Model + " "+ this.year + " "+ this.Brand);
	}
}