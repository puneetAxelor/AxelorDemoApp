package com.axelor.gst.service;

public interface InvoiceLineService {

	double generateNetAmount(int qty, double price);

	double generateIgst(double net, double gst);

	double generateSgst(double net, double gst);

	double generateGrossAmount(double net, double igst);

	double generateGrossAmount(double net, double sgst, double cgst);
}
