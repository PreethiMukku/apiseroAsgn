import java.util.Arrays;
public class DeptManager {
	private Dept[] deptArr= new Dept[5]; 
	
	public void print(Dept[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	public void modify(int i, Dept d) {
		deptArr[i] = d;
	}
	
	public static void main(String[] args) {
		
		DeptManager deptManger = new DeptManager();
		deptManger.print(deptManger.deptArr);
		
		Dept temp = new Dept();
		temp.setDname("Santosh");
		temp.setDeptno(1);
		temp.setLoc("Hyd");
		deptManger.modify(0,temp);
		
		temp = new Dept();
		temp.setDname("User1");
		temp.setDeptno(2);
		temp.setLoc("Del");
		deptManger.modify(2,temp);
		
		temp = new Dept();
		temp.setDname("USer2");
		temp.setDeptno(3);
		temp.setLoc("Pun");
		deptManger.modify(3,temp);
		
		temp = new Dept();
		temp.setDname("User3");
		temp.setDeptno(4);
		temp.setLoc("Ban");
		deptManger.modify(4,temp);
		
		deptManger.print(deptManger.deptArr);
	}
}