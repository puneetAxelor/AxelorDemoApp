package com.axelor.gst.service;

import com.axelor.gst.db.Address;
import com.axelor.gst.db.Invoice;

public interface AddressService {

	Address generateInvoiceAddress(Invoice invoice);

	Address generateShippingAddress(Invoice invoice);

}
