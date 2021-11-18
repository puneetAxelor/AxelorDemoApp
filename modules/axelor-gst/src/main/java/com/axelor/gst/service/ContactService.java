package com.axelor.gst.service;

import com.axelor.gst.db.Contact;
import com.axelor.gst.db.Invoice;

public interface ContactService {

	Contact generateContact(Invoice invoice);

}
