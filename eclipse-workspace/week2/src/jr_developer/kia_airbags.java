package jr_developer;

public class kia_airbags {
int a=10;
//this method is protected and is accesses in another package named sr_developed 
protected void display_air()
{
	System.out.println("car has airbags");
}
//this method is public and is accesses in sr_developer within same project
public void display_air2()
{
	System.out.println("this class is public");
}
private void show()
{
	System.out.println("this method is private");
}
	public static void main(String[] args) {
		kia_airbags ob=new kia_airbags();
		ob.show();

	}

}
