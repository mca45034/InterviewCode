package Camparable_Comperator;

import java.util.ArrayList;

class Book {
	int id;
	String name;
	int price;

	public Book(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

}
//int tmp=0;
//int count=0;
//for (int i = 0; i < num.length; i++) {
//	if(num[i]>tmp) {
//		count=tmp;
//		tmp=num[i];
//	}if(count<num[i]&&num[i]<tmp) {
//		count=num[i];
//	}
//}

public class MaxBooks {
	void maxprice(ArrayList<Book>al) {
		Book b=al.get(0);
		int max=b.price;
		int id=0;String name=null;
		for(int i=0;i<al.size();i++) {
			Book bo=al.get(i);
			if(bo.price>max) {
				max=bo.price;
				id=bo.id;name=bo.name;
				
			}
		}
		System.out.println(id+name+max);
	}
	public static void main(String[] args) {
		MaxBooks mb=new MaxBooks();
		ArrayList<Book>al=new ArrayList<Book>();
		al.add(new Book(101, "sham", 300));
		al.add(new Book(109, "dev", 900));
		al.add(new Book(102, "ram", 500));
		mb.maxprice(al);
	}

}
