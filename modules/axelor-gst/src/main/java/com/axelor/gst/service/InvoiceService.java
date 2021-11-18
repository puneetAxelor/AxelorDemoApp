package com.axelor.gst.service;

import java.math.BigDecimal;

import com.axelor.gst.db.Invoice;

public interface InvoiceService {

	BigDecimal generateInvoiceNetAmount(Invoice invoice);

	BigDecimal generateNetIgst(Invoice invoice);

	BigDecimal generateNetSgst(Invoice invoice);
	
	BigDecimal generateInvoiceGrossAmount(Invoice invoice);

	BigDecimal generateNetCgst(Invoice invoice);

}
