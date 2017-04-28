package oop.inheritance;

public class GraphingCalculator extends ScientificCalculator implements Wifiprint{
	public void Quadratic(){
		System.out.println("Make a quadratic graph");
	}
	public void Cubic(){
		System.out.println("Make a cubic graph");
	}
	//Wifiprint
	public void printcalculations() {
		System.out.println("Print out the calculations by connecting to Wifi");
	}
	public void log(){
		System.out.println("Find the logarithm");
	}

}
