import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class arrayListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("ashish");
		a.add("sneha");
		a.add(0, "love");
		System.out.println(a);
		a.remove(2);
		
		//HashSet TreeSet LinkedHashSet implements Set interface
		//does not accept duplicate values
		//elements stored randomply, no sequence guarantee
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("dhekun");
		hs.add("pillu");
		hs.add("bala");
		hs.add("rey");
		hs.add("taak");
		hs.add("na");
		hs.add("kahitari");
		hs.add("bala");
		hs.add("rey");
		System.out.println(hs);
		hs.remove("rey");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		
		//Iterator
		
		Iterator<String> i = hs.iterator();
		
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0, "thandi");
		hm.put(1, "nko");
		hm.put(2, "vajun");
		hm.put(3, "deu");
		hm.put(4, "na");
		hm.put(5, "I");
		hm.put(69, "love");
		hm.put(7, "u");
		
		System.out.println(hm.get(69));
		
		Set sn = hm.entrySet();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
