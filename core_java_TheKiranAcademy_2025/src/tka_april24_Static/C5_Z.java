package tka_april24_Static;

public class C5_Z{
	
	static {
		System.out.println("statc {...}");				
	}
	
	{		// class instance - Anonymous block > without name
		System.out.println("instance {...}");
	}
	
	C5_Z(){
		System.out.println("Constructor() { }");
	}
}

