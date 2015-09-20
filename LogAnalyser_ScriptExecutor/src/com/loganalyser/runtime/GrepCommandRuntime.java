package com.loganalyser.runtime;

public class GrepCommandRuntime{
	
	private String filePath;
	public GrepCommandRuntime(String filePath){
		this.filePath = filePath;
	}
	
	public Process excProcess(String searchPattern){
		
		Runtime rt = null;
		Process process = null;
		try {
	        rt = Runtime.getRuntime();
	        String[] cmd = {"/bin/sh", "-c", "grep '" + searchPattern + "' " +this.filePath};
	        process = rt.exec(cmd);
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
		
		return process;
	}

}
