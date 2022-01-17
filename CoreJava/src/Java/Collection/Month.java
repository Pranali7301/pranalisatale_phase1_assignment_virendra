package Java.Collection;
import java.util.*;


public class Month {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("May");
		ll.add("June");
		ll.add("July");
		ll.add("August");
		
		ll.add("November");
		
		ll.addLast("December");
		ll.addFirst("January");
		
		ll.add(1,"March");
		
		ll.add(1,"February");
		ll.add(7,"September");
		ll.add(8,"October");
		ll.add(3,"April");
		System.out.println("Month : "+ll);
		
					
		Iterator itr=ll.iterator();
        while(itr.hasNext()) {
        System.out.println("Iterator Month is : "+ itr.next());
        
        }
        System.out.println("\n");
        System.out.println("First and Last Month is : "+ll.getFirst() +" "+ ll.getLast());
        System.out.println("\n");
        System.out.println("Remove Birthday Month :" +ll.remove(0));
        System.out.println("\n");
        System.out.println("Print Months : "+ll);
        
	}
}

