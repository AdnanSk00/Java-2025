package tka_april16_super_this;

public class C4_Np {
	
	// First line code -- create user data
	// days = 0
	
	public C4_Np() {
		this(111333);		// this with constructor(__){}
		System.out.println("NP is now free for 1 month***");
		
		// days > 30 --> msg
		 new C4_Np(999);
	}
	
	public C4_Np(int key) {
		this(111, "bro");		//	Constructor chaining - must be on first line
		System.out.println("key -- user");
	}

	public C4_Np(int key, String pp) {
		System.out.println("key -- user");
	}

	void scan() {
		System.out.println("Antivirus is scanning....");
		this.m1();
	}

	void m1() {
		System.out.println("Antivirus...");
	}
	void m2() {
		System.out.println("Antivirus...");		
	}
}
