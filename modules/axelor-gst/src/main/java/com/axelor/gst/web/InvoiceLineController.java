package com.axelor.gst.web;

import java.math.BigDecimal;

import com.axelor.gst.db.Invoice;
import com.axelor.gst.db.InvoiceLine;
import com.axelor.gst.service.InvoiceLineService;
import com.axelor.inject.Beans;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.google.inject.servlet.RequestScoped;

@RequestScoped
public class InvoiceLineController {
	
	
	public void generateNetAmount(ActionRequest request, ActionResponse response) {
		InvoiceLine invoiceLine = request.getContext().asType(InvoiceLine.class); 
		BigDecimal netAmount = Beans.get(InvoiceLineService.class).generateNetAmount(invoiceLine);
		response.setValue("netAmount", netAmount);
	}
	
	public void generateGrossAmount(ActionRequest request, ActionResponse response) {
		InvoiceLine invoiceLine = request.getContext().asType(InvoiceLine.class); 
		Invoice invoice = request.getContext().getParent().asType(Invoice.class); 
		BigDecimal grossAmount = Beans.get(InvoiceLineService.class).generateGrossAmount(invoiceLine, invoice);
		response.setValue("grossAmount", grossAmount);
	}
	
	public void generateGrossAmountSG(ActionRequest request, ActionResponse response) {
		InvoiceLine invoiceLine = request.getContext().asType(InvoiceLine.class); 
		Invoice invoice = request.getContext().getParent().asType(Invoice.class); 
		BigDecimal grossAmount = Beans.get(InvoiceLineService.class).generateGrossAmount(invoiceLine, invoice);
		response.setValue("grossAmount", grossAmount);
	}

	
	public void generateIgst(ActionRequest request, ActionResponse response) {
		InvoiceLine invoiceLine = request.getContext().asType(InvoiceLine.class);
		Invoice invoice = request.getContext().getParent().asType(Invoice.class); 
		BigDecimal igst = Beans.get(InvoiceLineService.class).generateIgst(invoiceLine, invoice);
		response.setValue("igst", igst);
	}
	
	
	public void generateSgst(ActionRequest request, ActionResponse response) {
		InvoiceLine invoiceLine = request.getContext().asType(InvoiceLine.class);
		Invoice invoice = request.getContext().getParent().asType(Invoice.class); 
		BigDecimal sgst = Beans.get(InvoiceLineService.class).generateSgst(invoiceLine, invoice);
		response.setValue("sgst", sgst);
	}
	
	public void generateCgst(ActionRequest request, ActionResponse response) {
		InvoiceLine invoiceLine = request.getContext().asType(InvoiceLine.class);
		Invoice invoice = request.getContext().getParent().asType(Invoice.class); 
		BigDecimal cgst = Beans.get(InvoiceLineService.class).generateCgst(invoiceLine, invoice);
		response.setValue("cgst", cgst);
	}
	
}
