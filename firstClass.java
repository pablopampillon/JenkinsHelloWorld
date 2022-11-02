package primerProyectoPackage;

public class firstClass {
	static int number;
	
	public void primerMetodo() {
		
	}
	public static void main(String[] args) {
		Calculator calculator1 = new Calculator(5);
		Calculator calculator2= new Calculator(150);
		
		System.out.println("Created two calculator objects with factor 5 and 150");
		System.out.println("===========================================");
		
		int calcResultSum = calculator1.suma(4, 5);
		int calcResultFactor = calculator1.factor(3);
		
		System.out.println("The result of summing 4 + 5 is: "+calcResultSum);
		System.out.println("The result of Calculator 1 with input 3 is: "+calcResultFactor);
		
		int calc2ResultSum = calculator2.suma(4, 5);
		int calc2ResultFactor = calculator2.factor(3);
		
		System.out.println("The result of summing 4 + 5 is: "+calc2ResultSum);
		System.out.println("The result of Calculator 1 with input 3 is: "+calc2ResultFactor);
		
		System.out.println("Hello World!");
	}

}
class Calculator{
	private int factor;
	public Calculator(int factor) {
		this.factor=factor;
		// TODO Auto-generated constructor stub
	}
	public int suma(int a, int b) {
		int result=a+b;
		return result;
		
	}
	public int factor(int x) {
		int result =1;
		for (int i=0;i<factor;i++) {
			result *= x;
		}
		return result;
	}
}
