package com.axelor.gst.web;

import com.axelor.gst.db.Contact;
import com.axelor.gst.db.Invoice;
import com.axelor.gst.service.ContactService;
import com.axelor.inject.Beans;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.google.inject.servlet.RequestScoped;

@RequestScoped
public class ContactController {

	public void generateContact(ActionRequest request, ActionResponse response) {
		Invoice invoice = request.getContext().asType(Invoice.class);
		Contact partyContact  = Beans.get(ContactService.class).generateContact(invoice);
		response.setValue("partyContact", partyContact);
		
	}
}
