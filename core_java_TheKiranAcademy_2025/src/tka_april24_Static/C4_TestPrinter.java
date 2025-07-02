package tka_april24_Static;

public class C4_TestPrinter{
	
	public static void main(String[] args) throws ClassNotFoundException {
		
//		C3_Printer espn = new C3_Printer();
//		C3_Printer.m1();
//		espn.print();
//		espn.scanDocuments();
//		espn.print();
//		C3_Printer.m1();
		
//		C3_Printer espn2 = new C3_Printer();
//		espn2.print();
		
		System.out.println("---------------");
		
//		C3_PrinterDriver driver2 = new C3_PrinterDriver();
		int getPort = C3_PrinterDriver.port;
		System.out.println(getPort);
		
//		C3_PrinterDriver load()
		
//		This method is used to class in memory
		Class.forName("tka_april24_Static.C3_PrinterDriver");		// used to load class level item
		Class.forName("tka_april24_Static.C3_Printer");
		
	}
}

