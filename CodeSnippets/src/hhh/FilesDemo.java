package hhh;

import java.io.File;
import java.io.IOException;

public class FilesDemo {

	static void createAndUpdate() {
		File f = new File("sample.text");

		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Size of file " + f.getName() + " is " + f.length());
		System.out.println("Absolute file path: " + f.getAbsolutePath());
		System.out.println(f.getPath());

		File f2 = new File(
				"D:\\softwares\\MyGitRepos\\CodeSnippets\\CodeSnippets\\Data\\config.properties");
		System.out.println(f2.getAbsolutePath());

	}

	static void allMethods() {
		createAndUpdate();
	}

}
