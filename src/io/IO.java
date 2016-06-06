package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class IO {
	public static void outputToText(String string, String fileName) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.print(string);
		pw.flush();
		pw.close();
	}
	
	public static void outputToText(StringBuffer stringBuffer, String fileName) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.print(stringBuffer);
		pw.flush();
		pw.close();
	}

	public static String loadText(String fileName) {
		// if(file.isFile() && file.exists())

		File file = new File(fileName);

		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String content = "";
		StringBuilder sb = new StringBuilder();

		while (content != null) {
			try {
				content = bf.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (content == null) {
				break;
			}

			sb.append(content.trim());

		}

		try {
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		return removeSymbol(sb.toString());
		return sb.toString();

	}
	
	public static String removeSymbol(String string) {
		// String str =
		// ",.!锛岋紝D_NAME銆傦紒锛涒�鈥欌�鈥溿�銆�*dfs  #$%^&()-+1431221涓浗123婕㈠瓧銇嬨仼銇嗐亱銇甹ava銈掓焙瀹�;
		String result = string.replaceAll("[\\pP鈥樷�鈥溾�]", "");
		System.out.println(string);
		return result;

	}
}
