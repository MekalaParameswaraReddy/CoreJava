/*interface D1{
	public void draw();
	public void draw1();
}*/
public class D {

	public static void main(String[] args) {		
		int width = 11;
		 new D1() {
			public void draw() {
				System.out.println("Drawing " + width);
			}

			@Override
			public void draw1() {
				// TODO Auto-generated method stub
				
			}
		}.draw();
	}
}
