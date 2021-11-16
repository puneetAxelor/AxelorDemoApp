package com.axelor.gst.service;

public interface InvoiceService {

	double generateInvoiceNetAmount(double netAmount);

	double generateNetIgst(double igst);

	double generateNetSgst(double sgst);
	
	double generateInvoiceGrossAmount(double grossAmount);

	double generateNetCgst(double cgst);

}
