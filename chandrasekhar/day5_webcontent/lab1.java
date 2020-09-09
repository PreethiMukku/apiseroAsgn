package demoo;
/*class -> Final
	create a class -> 1. only use it 
	Can create instance of that class 
	Can't be used as parent class 
-> Final Method - can not be overriden
*/
abstract class D{
	void x(){
	System.out.println("hi");
	}
	abstract void y();
}
class Di extends D{
	void y(){
		System.out.println("hello");
	}
}
public class lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Di d=new Di();
        d.y();
	}

}
