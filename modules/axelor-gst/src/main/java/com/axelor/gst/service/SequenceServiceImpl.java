package com.axelor.gst.service;

public class SequenceServiceImpl implements SequenceService {

	@Override
	public String generateSequence(String prefix, int padding, String suffix) {
	
		String pad = "";
		for(int i=0; i < padding; i++) {
			pad += "0";
		}
		
		return prefix+pad+suffix;
	}
	
	

}
