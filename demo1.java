class a {
    String a = "HELLO";
}

class b extends a {
    String b = new String("WORLD");
}

class display extends b {
    void prnt() {
        // Use super.a to access the 'a' variable from class 'a'
        System.out.println(super.a + " " + b);

	String x = "HELLO";
        System.out.println(super.a.hashCode()); // Hashcode of 'a'
	System.out.println(x.hashCode());

	String y = new String("WORLD");
        System.out.println(b.hashCode());       // Hashcode of 'b'
	System.out.println(y.hashCode()); 
	a ob = new a();
	System.out.println(ob.a.hashCode()); 
    }
}

class demo1 {
    public static void main(String a[]) {
        display ob = new display();
        ob.prnt();
    }
}
