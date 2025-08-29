package demo;

public  class CarImplementation extends CarAbstract {
public void twoWheeler() {
	System.out.println("Honda Motercycle");
	
}
public void fourWheeler() {
	System.out.println("maruti");
}
public static void main(String[] args) {
	CarImplementation carImplementation=new CarImplementation();
	carImplementation.twoWheeler();
	carImplementation.fourWheeler();
}
}
