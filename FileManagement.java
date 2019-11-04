package edu.suu.antoniomarroquin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManagement extends Encryption{
	
	private static int tempID;
	
	public static String[] getUserInfoArray() {
		return null;
		
	}
	
	public static void setUserInfoArray(String[] userInfo) throws IOException {
		FileWriter writer = new FileWriter("C://Desktop//ID//" + tempID);
		for (String x : userInfo) {
			writer.write(x + '\n');
		}
		writer.close();
	}
	
	public static int setTempID() {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your CyberCard ID number?");
		boolean check = false;
		while (!check) {
			String tempIDString = sc.nextLine();
			if (tempIDString.length() == 8) {
				try {
					tempID = Integer.parseInt(tempIDString);
					break;
				}
				catch (NumberFormatException error) {
					System.out.println("That is not a proper ID! Try again.");
				}
			}
		}
		sc.close();
		return tempID;
	}
}
