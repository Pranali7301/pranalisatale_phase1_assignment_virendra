package Java.Collection;

import java.util.*;

class Fruit{
	public static void main(String[] args){
		
		
		HashSet<String> hs=new HashSet<String>();
		//LinkedHashSet<String> ls=new LinkedHashSet<String>();
		
		hs.add("Mango");
		hs.add("Orange");
		hs.add("Apple");
		hs.add("Pineapple");
		hs.add("Watermelon");
		hs.add("Cherries");
		hs.add("Kiwi");
		hs.add("Plum");
		hs.add("Grapes");
		hs.add("Banana");
				
		System.out.println("Hashset is "+hs);
		System.out.println("Size of Hashset is "+ hs.size());
		hs.add("Guava");
		hs.add("Pear");
		hs.add("Mulberry");
		System.out.println("Hashset is "+hs);
		System.out.println("Size of Hashset is "+ hs.size());
		System.out.println("Does hashset contains this 'Orange' element  " + hs.contains("Orange"));		
		System.out.println("is hashset empty  " + hs.isEmpty());
		//System.out.println("remove the element "+hs.remove("i"));
		    
	  	}
}