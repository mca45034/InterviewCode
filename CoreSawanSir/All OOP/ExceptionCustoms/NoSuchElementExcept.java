package ExceptionCustoms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class NoSuchElementExcept {
	public static void main(String[] args) {
		
		try {
			ArrayList<String> al = new ArrayList<String>();
			al.add("Rahul");
			al.add("kirar");
			Iterator<String> it = al.iterator();
			while (it.hasNext()) {
				String s = it.next();
				System.out.println(s);
			}
			System.out.println(it.next());
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}
	}

}
