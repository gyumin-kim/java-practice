package com.gyumin.lambda;

import java.io.File;
import java.io.FileFilter;

public class LambdaEx4 {
	public static void main(String[] args) {
		FileFilter filter =
			pathname -> pathname.getName().endsWith(".java");

		File file = new File("./tmp");
		File[] files = file.listFiles(filter);

		for (File f : files) {
			System.out.println(f);
		}
	}
}
