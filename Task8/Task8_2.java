public class Task8_2{
	public static void main(String args[]){
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(5);
		li.add(9);
		li.add(0,1); // add 1 to 0th place
		long time = System.nanoTime();
		Collections.sort(li);
		long elapsed = System.nanoTime()-time;
		System.out.println(elapsed+" nanoseconds passed, "+elapsed/1000000000+" seconds passed");
	}
}
