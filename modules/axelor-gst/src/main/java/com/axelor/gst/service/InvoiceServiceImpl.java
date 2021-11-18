package com.axelor.gst.service;

import java.math.BigDecimal;
import java.util.List;

import com.axelor.gst.db.Invoice;
import com.axelor.gst.db.InvoiceLine;

public class InvoiceServiceImpl implements InvoiceService {

	@Override
	public BigDecimal generateInvoiceNetAmount(Invoice invoice) {
		List<InvoiceLine> invoiceItems = invoice.getInvoiceItems();
		BigDecimal sum = BigDecimal.ZERO;
		if (invoiceItems!= null) {
			for (InvoiceLine invoiceLine : invoiceItems) {
				sum = sum.add(invoiceLine.getNetAmount());
			}
		}
		return sum;
	}

	@Override
	public BigDecimal generateNetIgst(Invoice invoice) {
		List<InvoiceLine> invoiceItems = invoice.getInvoiceItems();
		BigDecimal sum = BigDecimal.ZERO;
		if (invoiceItems!= null) {
			for (InvoiceLine invoiceLine : invoiceItems) {
				sum = sum.add(invoiceLine.getIgst());
			}
		}
		return sum;
	}

	@Override
	public BigDecimal generateNetSgst(Invoice invoice) {
		List<InvoiceLine> invoiceItems = invoice.getInvoiceItems();
		BigDecimal sum = BigDecimal.ZERO;
		if (invoiceItems!= null) {
			for (InvoiceLine invoiceLine : invoiceItems) {
				sum = sum.add(invoiceLine.getSgst());
			}
		}
		return sum;
	}
	
	@Override
	public BigDecimal generateNetCgst(Invoice invoice) {
		List<InvoiceLine> invoiceItems = invoice.getInvoiceItems();
		BigDecimal sum = BigDecimal.ZERO;
		if (invoiceItems!= null) {
			for (InvoiceLine invoiceLine : invoiceItems) {
				sum = sum.add(invoiceLine.getCgst());
			}
		}
		return sum;
	}

	@Override
	public BigDecimal generateInvoiceGrossAmount(Invoice invoice) {
		List<InvoiceLine> invoiceItems = invoice.getInvoiceItems();
		BigDecimal sum = BigDecimal.ZERO;
		if (invoiceItems!= null) {
			for (InvoiceLine invoiceLine : invoiceItems) {
				sum = sum.add(invoiceLine.getGrossAmount());
			}
		}
		return sum;
	}

}
