package com.loganalyser;

import java.util.List;

import com.loganalyser.runtime.Executor;

public class LogAnalyser {

	public static void main(String args[]) {
		Executor exc = new Executor();

		List<String> results = exc.search(args[0]);

		for (String result : results) {
			System.out.println(result);
		}
	}

}
