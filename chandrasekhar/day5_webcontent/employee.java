import java.util.ArrayList;
import java.util.List;

//import testing.Emp;

//import testing.Emp;
class emp{
	private int num;
	private String name;
	private int salary;	
	public String getName() {
	    return name;
	  }
	  public void setName(String newname) {
	    this.name = newname;
	  }
	  public int getNum() {
		    return num;
		  }

		  // Setter
		  public void setNum(int numb) {
		    this.num = numb;
		  }
		  public int getSal(){
			  return salary;
		  }
		  public void setSal(int sal){
			  this.salary=sal;
		  }
}
class employee{
	public void add(emp e){}
	
	public static void main(String[] args)
	{
		
		List<emp> ob=new ArrayList();
		emp e1=new emp();
		e1.setNum(10);
		e1.setName("chandu");
		e1.setSal(2000);
		ob.add(e1);
		System.out.println(e1.toString());
	
	  }
}