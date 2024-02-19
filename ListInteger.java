package LamdaExpression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListInteger {
	public static void main(String[] args) {
		List<Integer> val = new ArrayList<>();
		val.add(52);
		val.add(25);
		val.add(75);
		
		Task t1 = (a) -> "max is "+ a.stream().max(Comparator.comparingInt(Integer::intValue)).get();
		System.out.println(t1.findValue(val));

	}

}
@FunctionalInterface
interface Task{
	public String findValue(List<Integer> num);
}