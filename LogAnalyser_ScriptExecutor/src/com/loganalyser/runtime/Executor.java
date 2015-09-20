package com.loganalyser.runtime;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import com.loganalyser.constats.StringConstants;
import com.loganalyser.runtime.io.ProcessReader;

public class Executor {

	private GrepCommandRuntime runtime;

	public Executor() {
		runtime = new GrepCommandRuntime(System.getProperty(StringConstants.LOG_FILE_PATH_PROPERTY_NAME));
	}

	public List<String> search(String pattern) {
		Process process = runtime.excProcess(pattern);

		ProcessReader reader = new ProcessReader(process);

		try {
			return reader.getMessages();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Collections.emptyList();
	}
}
