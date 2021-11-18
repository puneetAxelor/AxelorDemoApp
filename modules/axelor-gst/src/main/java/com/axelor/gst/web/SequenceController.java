package com.axelor.gst.web;

import com.axelor.gst.service.SequenceService;
import com.axelor.meta.CallMethod;
import com.google.inject.Inject;
import com.google.inject.servlet.RequestScoped;

@RequestScoped
public class SequenceController {

	
	@Inject
	private SequenceService service;
	
	@CallMethod
	public String generateSequence(String prefix, int padding, String suffix) {
		

		return service.generateSequence(prefix, padding, suffix);
		
	}
}
