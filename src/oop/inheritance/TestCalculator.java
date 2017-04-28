package oop.inheritance;

public class TestCalculator {

	public static void main(String[] args) {
		SimpleCalculator simple=new SimpleCalculator();
		simple.subtract();

	
		ScientificCalculator sci=new ScientificCalculator();
		sci.subtract();
		sci.cosine();
	
		GraphingCalculator graph = new GraphingCalculator();
		graph.add();
		graph.subtract();
		graph.cosine();
		graph.Quadratic();
		graph.printcalculations();
	}	
		
}
