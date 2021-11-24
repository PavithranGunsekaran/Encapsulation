package org.eng;

import java.util.LinkedList;
import java.util.List;

import javax.xml.soap.Detail;

public class EncapList {
	public static void main(String[] args) {
		List<Encap> li = new LinkedList<Encap>();
		Encap ep = new Encap();
		ep.setId(100);
		ep.setName("pavish");
		ep.setPhone(8825669987l);
		
		Encap ep1 = new Encap();
		ep1.setId(200);
		ep1.setName("maddy");
		ep1.setPhone(8244997568l);
		
		li.add(ep);
		li.add(ep1);
		/*for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getId());
			System.out.println(li.get(i).getName());
			System.out.println(li.get(i).getPhone());
			
		}*/
		
		for (Encap x : li) {
			System.out.println(x.getId());
			System.out.println(x.getName());
			System.out.println(x.getPhone());
			
		}
		
		
		
		
	}

}
