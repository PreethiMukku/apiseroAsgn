package demo2;
class Emp{
	protected int empno;
	protected String ename;
	public Emp(){
		System.out.println("emp constructor");
	}
	public void m1(){
		System.out.println("in m1 of Emp");
	}

}
class Fresher extends Emp{
	protected int college;
	@Override
	public void m1(){
		System.out.println("in m1 of Fresher");
	}
	public Fresher(){
		System.out.println("Fresher Constructor");
	}
	public void m2(){
		System.out.println("in m2 of fresher");
	}

}
public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Fresher fresher =new Fresher();
     fresher.m1();
     fresher.m2();
     System.out.println(fresher);
	}

}
