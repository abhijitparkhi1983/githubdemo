package subproject;

public class DemoSubproject {

	public static void main(String[] args) {
		int k_subproject;
		
	}
	
	private static DemoSubproject foo = null;
	
	
	//multiple simultaneous callers may see partially initialized objects

 public static DemoSubproject getFoo() {
     if (foo==null) {
         foo = new DemoSubproject();
     }
    return foo;
 }

}