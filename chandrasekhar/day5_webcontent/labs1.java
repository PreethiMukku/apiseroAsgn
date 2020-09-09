package demoo;
class Base1{
	protected void m1(){
		System.out.println("hello");
	}
	public void m2(){
		
	}
}
class Dev1 extends Base1{
	public void m3(){
		
	}
}
public class labs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Dev1 der=new Dev1();
       der.m1();
	}

}
