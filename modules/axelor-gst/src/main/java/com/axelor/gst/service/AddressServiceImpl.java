package com.axelor.gst.service;

import java.util.List;

import com.axelor.gst.db.Address;
import com.axelor.gst.db.Invoice;

public class AddressServiceImpl implements AddressService {

	@Override
	public Address generateInvoiceAddress(Invoice invoice) {
		List<Address> address = invoice.getParty().getAddress();
		Address result = new Address();
		if (address!= null) {
			
			for (Address addr : address) {
				if (addr.getType().equals("default") || addr.getType().equals("invoice")) {
					System.out.println(addr);
					result = addr;
					break;
				}
			}
			
		}
		return result;
	}
	
	@Override
	public Address generateShippingAddress(Invoice invoice) {
		
		List<Address> address = invoice.getParty().getAddress();
		Address result = new Address();
		if (address!= null) {
			
			for (Address addr : address) {
				if (addr.getType().equals("default") || addr.getType().equals("shipping")) {
					result = addr;
					break;
				}
			}
			
		}
		return result;
	}
	
}
