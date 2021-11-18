package com.axelor.gst.service;

import java.math.BigDecimal;

import com.axelor.gst.db.Invoice;
import com.axelor.gst.db.InvoiceLine;

public interface InvoiceLineService {

	BigDecimal generateIgst(InvoiceLine invoiceLine, Invoice invoice);

	BigDecimal generateSgst(InvoiceLine invoiceLine, Invoice invoice);

	BigDecimal generateCgst(InvoiceLine invoiceLine, Invoice invoice);
	
	BigDecimal generateNetAmount(InvoiceLine invoiceLine);
	
	BigDecimal generateGrossAmount(InvoiceLine invoiceLine, Invoice invoice);
	
	BigDecimal generateGrossAmountSG(InvoiceLine invoiceLine, Invoice invoice);
}
