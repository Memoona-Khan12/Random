package superClass;

public class smartPhone extends Phone {

	public smartPhone(){
		System.out.println("THis is a new Phone");
	}
	public smartPhone(String Model, int year, String brand){
		super(Model, year, brand);
		
	}
	public void getPhoneInfo(){
		System.out.println("This is a Samsung phone");
	}
	public void phoneModel(){
		super.Model="S8";
		System.out.println("The model is: "+ Model);
		
	}
}
