package finalkey;

public class superprogram {
	int maxspeed=60;
	void display() {
		System.out.println("max speed is"+maxspeed);
	}
}
 class seltos extends superprogram
 {
	 int maxspeed=180;
	 void display() {
		 super.display();
	 }
	 public class kis_motors
	 {
		 public static void main(String[] args)
		 {
			 seltos obj=new seltos();
			 obj.display();
		 }
	 }
 }
}
