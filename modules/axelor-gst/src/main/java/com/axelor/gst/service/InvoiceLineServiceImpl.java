package com.axelor.gst.service;

import java.math.BigDecimal;

import com.axelor.gst.db.Invoice;
import com.axelor.gst.db.InvoiceLine;

public class InvoiceLineServiceImpl implements InvoiceLineService {

	@Override
	public BigDecimal generateNetAmount(InvoiceLine invoiceLine) {
		BigDecimal price = invoiceLine.getPrice();
		BigDecimal qty = new BigDecimal(invoiceLine.getQty());
		BigDecimal result = BigDecimal.ZERO;
		if (price != null && qty != null) {
				result = qty.multiply(price);
		}
		
		return result;
	}
	
	@Override
	public BigDecimal generateGrossAmount(InvoiceLine invoiceLine, Invoice invoice) {
		BigDecimal igst = invoiceLine.getIgst();
		BigDecimal net = invoiceLine.getNetAmount();
		BigDecimal result = BigDecimal.ZERO;
		if (igst != null && net != null) {
			if (invoice.getInvoiceAddress().getState() != invoice.getCompany().getAddress().getState()) {
				result = igst.add(net);			
			}
		}
		return result;
	}
	
	@Override
	public BigDecimal generateGrossAmountSG(InvoiceLine invoiceLine, Invoice invoice) {
		BigDecimal igst = invoiceLine.getIgst();
		BigDecimal net = invoiceLine.getNetAmount();
		BigDecimal result = BigDecimal.ZERO;
		if (igst != null && net != null) {
			if (invoice.getInvoiceAddress().getState() == invoice.getCompany().getAddress().getState()) {
				result = igst.add(net);			
			}
		}
		return result;
	}
	
	@Override
	public BigDecimal generateIgst(InvoiceLine invoiceLine, Invoice invoice) {
		System.out.println("Inside igst invoice line");
		BigDecimal gst = invoiceLine.getGstRate();
		BigDecimal net = invoiceLine.getNetAmount();
		BigDecimal result = BigDecimal.ZERO;
		if (gst != null && net != null) {
			if (invoice.getInvoiceAddress().getState() != invoice.getCompany().getAddress().getState()) {
				result = gst.multiply(net);
			}	
		}	
		return result;
	}
	
	@Override
	public BigDecimal generateCgst(InvoiceLine invoiceLine, Invoice invoice) {	
		BigDecimal gst = invoiceLine.getGstRate();
		BigDecimal net = invoiceLine.getNetAmount();
		BigDecimal result = BigDecimal.ZERO;
		BigDecimal divisor = new BigDecimal("2");
		if (gst != null && net != null) {
			if (invoice.getInvoiceAddress().getState() == invoice.getCompany().getAddress().getState()) {
				result = gst.multiply(net);
			}
		}
		return result.divide(divisor);
	}
	
	@Override
	public BigDecimal generateSgst(InvoiceLine invoiceLine, Invoice invoice) {
		
		BigDecimal gst = invoiceLine.getGstRate();
		BigDecimal net = invoiceLine.getNetAmount();
		BigDecimal result = BigDecimal.ZERO;
		BigDecimal divisor = new BigDecimal("2");
		if (gst != null && net != null) {
			if (invoice.getInvoiceAddress().getState() == invoice.getCompany().getAddress().getState()) {
				result = gst.multiply(net);
			}	
		}
		return result.divide(divisor);
	}	

}
