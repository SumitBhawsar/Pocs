package com.loganalyser.runtime.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ProcessReader {

	private BufferedReader reader;

	public ProcessReader(Process process) {
		reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

	}

	public String getNextMessage() throws IOException {
		return reader.readLine();
	}

	public List<String> getMessages() throws IOException {
		List<String> messages = new ArrayList<String>();

		String line = null;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		return messages;
	}
}
