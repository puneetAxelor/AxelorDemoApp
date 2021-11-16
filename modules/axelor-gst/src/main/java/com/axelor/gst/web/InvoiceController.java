package com.axelor.gst.web;

import com.axelor.gst.service.InvoiceService;
import com.axelor.meta.CallMethod;
import com.google.inject.Inject;
import com.google.inject.servlet.RequestScoped;

@RequestScoped
public class InvoiceController {

	
	@Inject
	private InvoiceService service;
	
	@CallMethod
	public double generateInvoiceNetAmount(double netAmount) {
		

		return service.generateInvoiceNetAmount(netAmount);
		
	}
	
	@CallMethod
	public double generateNetIgst(double igst) {
		return service.generateNetIgst(igst);
		
	}
	
	@CallMethod
	public double generateNetSgst(double sgst) {
		return service.generateNetIgst(sgst);
		
	}
	
	@CallMethod
	public double generateNetCgst(double cgst) {
		return service.generateNetCgst(cgst);
		
	}
	
	@CallMethod
	public double generateInvoiceGrossAmount(double grossAmount) {
		return service.generateInvoiceNetAmount(grossAmount);
		
	}
	
}
