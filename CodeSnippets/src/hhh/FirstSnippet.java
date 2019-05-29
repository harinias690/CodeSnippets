package hhh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FirstSnippet {


	static void fileCreation() {
		File f = new File(
				"D:\\softwares\\DailyPractice\\YouCanDeleteThisFolder\\290519\\file1.txt");

		try {
			if (f.createNewFile()) {
				System.out.println("file created successfully");
			} else {
				System.out.println("file creation failed");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void folderAndFileCreation() {
		File fol = new File(
				"D:\\softwares\\DailyPractice\\YouCanDeleteThisFolder\\290519\\sampleFolder");
		if (!fol.exists()) {
			fol.mkdirs();
		}

		File f = new File(fol, "file2.txt");
		try {
			if (f.createNewFile()) {
				System.out.println("file created");
			} else {
				System.out.println("file NOT created");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void writeDataToFile() {
		File f = new File(
				"D:\\softwares\\DailyPractice\\YouCanDeleteThisFolder\\290519\\file1.txt");

		String s = "hey! I am practising!";

		FileOutputStream fos;
		try {
			fos = new FileOutputStream(f);
			try {
				fos.write(s.getBytes());
				System.out.println("Data is written to the file");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	static void stringReplaceDemo() {
		File f = new File(
				"D:/softwares/DailyPractice/YouCanDeleteThisFolder/290519/SampleFolder/file2.txt");
		int len = (int) f.length();
		System.out.println("size of the file is: " + len);
		try (FileInputStream fis = new FileInputStream(f)) {
			byte[] b = new byte[len];
			fis.read(b);
			String str = new String(b);

			System.out.println("-------------------------------------------");
			System.out.println("replace");
			System.out.println(str.replace("intA>?<", "intA>10<"));
			System.out.println("-------------------------------------------");
			System.out.println("replace all");
			System.out.println(str.replaceAll("intA>\\?<", "intA>10<"));
			System.out.println("-------------------------------------------");
			System.out.println("replace first");
			System.out.println(str.replaceFirst("int.>\\?<", "intA>10<"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void removeUnfilledNodes() {
		File f = new File(
				"D:/softwares/DailyPractice/YouCanDeleteThisFolder/290519/SampleFolder/file2.txt");
		int len = (int) f.length();
		System.out.println("size of the file is: " + len);
		try (FileInputStream fis = new FileInputStream(f)) {
			byte[] b = new byte[len];
			fis.read(b);
			String str = new String(b);
			System.out.println("-------------------------------------------");
			System.out.println("String before removing empty child nodes");
			System.out.println(str);
			System.out.println("-------------------------------------------");
			System.out.println("remove unfilled nodes using replace all");
			System.out.println(str.replaceAll("(<.*>)+[\\?\\n\\r\\s]*(</.*>)+", ""));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(f.toString());

	}

	public static void main(String[] args) {
		// folderAndFileCreation();
		// writeDataToFile();
		removeUnfilledNodes();
		System.out.println("done");

	}

}
