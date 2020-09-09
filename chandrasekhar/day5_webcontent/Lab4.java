package demoo;

interface Sort {
	public void dosort();
}
class Bubble implements Sort{
	@Override
	public void dosort() {
		System.out.println("Bubble - dosort");
		
	}
}
class Shell implements Sort{
	@Override
	public void dosort() {
		System.out.println("Shell - dosort");
		
	}
	
	
}
public class Lab4 {

	public static void main(String[] args) {
		String ch ="s";
		Sort sort = null;
		if (ch.equals("b"))
			sort = new Bubble();
		else
			 sort  = new Shell();
		sort.dosort();
	}

}
