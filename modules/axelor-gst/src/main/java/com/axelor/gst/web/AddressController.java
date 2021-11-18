package com.axelor.gst.web;

import com.axelor.gst.db.Address;
import com.axelor.gst.db.Invoice;
import com.axelor.gst.service.AddressService;
import com.axelor.inject.Beans;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.google.inject.servlet.RequestScoped;

@RequestScoped
public class AddressController {


	public void generateInvoiceAddress(ActionRequest request, ActionResponse response) {
		Invoice invoice = request.getContext().asType(Invoice.class);
		Address invoiceAddress  = Beans.get(AddressService.class).generateInvoiceAddress(invoice);
		response.setValue("invoiceAddress", invoiceAddress);
		
	}
	
	public void generateShippingAddress(ActionRequest request, ActionResponse response) {
		Invoice invoice = request.getContext().asType(Invoice.class);
		Address shippingAddress  = Beans.get(AddressService.class).generateShippingAddress(invoice);
		response.setValue("shippingAddress", shippingAddress);
		
	}
}
