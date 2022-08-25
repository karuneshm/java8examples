package programmingcustom;

public class PrintableMain {

	public static void main(String[] args) {
		
		Printable thingToPrint = (s)->System.out.println("Hello World, " +s);
		printable(thingToPrint);
		
	}
	
	public static void printable(Printable thingToPrint) {
		thingToPrint.print("Karunesh");
		
	}

}
