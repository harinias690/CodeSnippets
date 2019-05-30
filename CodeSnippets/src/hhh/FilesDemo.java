package hhh;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FilesDemo {

	static void createAndUpdate() {
		File f = new File("sample.text");

		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Size of file " + f.getName() + " is " + f.length());
		System.out.println(f.getPath());

		File f2 = new File(
				"D:\\softwares\\MyGitRepos\\CodeSnippets\\CodeSnippets\\Data\\config.properties");
		System.out.println("Absolute path of config.properties: "
				+ f2.getAbsolutePath());

		System.out
				.println("********************** Printing list of files in a folder ****************************");

		File[] fs = {
				new File(
						"D:\\softwares\\MyGitRepos\\CodeSnippets\\CodeSnippets\\Data\\text2.txt"),
				new File(
						"D:\\softwares\\MyGitRepos\\CodeSnippets\\CodeSnippets\\Data\\text3.txt"),
				new File(
						"D:\\softwares\\MyGitRepos\\CodeSnippets\\CodeSnippets\\Data\\text4.txt") };

		for (File efs : fs) {
			if (!efs.exists()) {
				try {
					efs.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		File folderWithFiles = new File(
				"D:\\softwares\\MyGitRepos\\CodeSnippets\\CodeSnippets\\Data");
		File[] fa = folderWithFiles.listFiles();
		for (File ef : fa) {
			System.out.println(ef.getName());
		}

	}

	static void allMethods() {
		createAndUpdate();
	}

}
