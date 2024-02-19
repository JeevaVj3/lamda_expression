package LamdaExpression;

public class SalaryUse {
	public static void main(String[] args) {
		
		int[] num = {25,30,120,85,10};
		
		Slary max =  (a -> {
			int b = a[0];
			for(int x:a) {
				if(x>b) {
					b=x;
				}
			}
			return "The Maximum is "+b;
		});
	
		System.out.println(max.find(num));
	}
}
