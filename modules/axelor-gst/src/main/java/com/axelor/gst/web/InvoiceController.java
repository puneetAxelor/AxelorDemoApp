package com.axelor.gst.web;

import java.math.BigDecimal;

import com.axelor.gst.db.Invoice;
import com.axelor.gst.service.InvoiceService;
import com.axelor.inject.Beans;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.google.inject.servlet.RequestScoped;

@RequestScoped
public class InvoiceController {

	
	
	public void generateInvoiceNetAmount(ActionRequest request, ActionResponse response) {
		Invoice invoice = request.getContext().asType(Invoice.class);
		BigDecimal netAmount = Beans.get(InvoiceService.class).generateInvoiceNetAmount(invoice);
		response.setValue("netAmountIn", netAmount);
		
	}
	
	public void generateNetIgst(ActionRequest request, ActionResponse response) {
		Invoice invoice = request.getContext().asType(Invoice.class);
		BigDecimal igst = Beans.get(InvoiceService.class).generateNetIgst(invoice);
		response.setValue("netIGST", igst);
	}
	
	public void generateNetSgst(ActionRequest request, ActionResponse response) {
		Invoice invoice = request.getContext().asType(Invoice.class);
		BigDecimal sgst = Beans.get(InvoiceService.class).generateNetSgst(invoice);
		response.setValue("netSGST", sgst);
		
	}
	
	public void generateNetCgst(ActionRequest request, ActionResponse response) {
		Invoice invoice = request.getContext().asType(Invoice.class);
		BigDecimal cgst = Beans.get(InvoiceService.class).generateNetCgst(invoice);
		response.setValue("netCGST", cgst);
		
	}
	
	public void generateInvoiceGrossAmount(ActionRequest request, ActionResponse response) {
		Invoice invoice = request.getContext().asType(Invoice.class);
		BigDecimal grossAmount = Beans.get(InvoiceService.class).generateInvoiceGrossAmount(invoice);
		response.setValue("grossAmountIn", grossAmount);
		
	}
	
}
