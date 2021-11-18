package com.axelor.gst.service;

import java.util.List;

import com.axelor.gst.db.Contact;
import com.axelor.gst.db.Invoice;

public class ContactServiceImpl implements ContactService {

	@Override
	public Contact generateContact(Invoice invoice) {
		List<Contact> contact = invoice.getParty().getContact();
		Contact result = new Contact();
		if (contact!= null) {
			
			for (Contact con : contact) {
				if (con.getType().equals("primary")) {
					System.out.println(con);
					result = con;
					break;
				}
			}
			
		}
		return result;
	}

}
