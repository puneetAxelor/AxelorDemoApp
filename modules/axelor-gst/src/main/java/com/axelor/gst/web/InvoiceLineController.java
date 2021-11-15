package com.axelor.gst.web;

import com.axelor.gst.service.InvoiceLineService;
import com.axelor.meta.CallMethod;
import com.google.inject.Inject;
import com.google.inject.servlet.RequestScoped;

@RequestScoped
public class InvoiceLineController {
	
	@Inject
	private InvoiceLineService service;
	
	@CallMethod
	public double generateNetAmount(int qty, double price) {
		

		return service.generateNetAmount(qty, price);
		
	}
	
	@CallMethod
	public double generateIgst(double net, double gst) {
		return service.generateIgst(net, gst);
		
	}
	
	@CallMethod
	public double generateSgst(double net, double gst) {
		return service.generateSgst(net, gst);
		
	}
	
	@CallMethod
	public double generateGrossAmount(double net, double igst) {
		return service.generateGrossAmount(net, igst);
		
	}
	
	@CallMethod
	public double generateGrossAmount(double net, double sgst, double cgst) {
		return service.generateGrossAmount(net, sgst, cgst);
		
	}
}
