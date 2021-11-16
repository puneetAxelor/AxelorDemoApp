package com.axelor.gst.service;

public class InvoiceServiceImpl implements InvoiceService {

	double tempNetAmount = 0;
	double tempSgst = 0;
	double tempIgst = 0;
	double tempCgst = 0;
	double tempGrossAmount = 0;
	

	@Override
	public double generateInvoiceNetAmount(double netAmount) {
		tempNetAmount += tempNetAmount; 
		return tempNetAmount + netAmount;
	}

	@Override
	public double generateNetIgst(double igst) {
		tempIgst += igst;
		return tempIgst;
	}

	@Override
	public double generateNetSgst(double sgst) {
		return tempSgst + sgst;
	}
	
	@Override
	public double generateNetCgst(double cgst) {
		return tempCgst + cgst;
	}

	@Override
	public double generateInvoiceGrossAmount(double grossAmount) {
		return tempGrossAmount + grossAmount;
	}

}
