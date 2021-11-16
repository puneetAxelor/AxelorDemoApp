package com.axelor.gst.service;

public class InvoiceLineServiceImpl implements InvoiceLineService {

	@Override
	public double generateNetAmount(int qty, double price) {
		return qty * price;
	}

	@Override
	public double generateIgst(double net, double gst) {
		
		return net * gst;
	}

	@Override
	public double generateSgst(double net, double gst) {
		return net * gst / 2;
	}

	@Override
	public double generateGrossAmount(double net, double igst) {
		return net + igst;
	}

	@Override
	public double generateGrossAmountSG(double net, double sgst, double cgst) {
		return net + sgst + cgst;
	}

}
