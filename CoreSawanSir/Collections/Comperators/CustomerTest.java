package Comperators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Customer{
	int id;
	String name;
	String address;
	public Customer(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}

public class CustomerTest {
	public static Comparator<Customer> c=new Comparator<Customer>() {
		
		@Override
		public int compare(Customer o1, Customer o2) {
			if(o1.id==o2.id && o1.name==o2.name) {
				return o2.address.compareTo(o1.address);
			}else {
				return o1.id-o2.id;
			}
		}
	};
	public static void main(String[] args) {
		List l=new ArrayList<Customer>();
		l.add(new Customer(1, "rrr", "zdd"));
		l.add(new Customer(1, "rrr", "sss"));
		l.add(new Customer(2, "dd", "ppp"));
		l.add(new Customer(1, "rrr", "tdd"));
		Collections.sort(l,CustomerTest.c);
		Iterator<Customer>it=l.iterator();
		while(it.hasNext()) {
			Customer cus=it.next();
			System.out.println(cus);
		}
		
	}

}
