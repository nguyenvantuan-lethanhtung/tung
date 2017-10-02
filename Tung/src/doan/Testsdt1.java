package doan;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testsdt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String link ="http://simsodep.com.vn/";
		URL url;
		String content="";
		String check = "";
		ArrayList<String> al1 = new ArrayList<String>();// mảng lưu tất cả các email
		ArrayList<String> al2 = new ArrayList<String>(); // mảng lưu những sdt đã lọc ra
		try {
			
			url = new URL(link);
			URLConnection connection = url.openConnection();
			InputStream inputstream = connection.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(inputstream));
			String line = br.readLine();
			
			while(line!=null)
			{
				content = content + line;
				line = br.readLine();
				
				
			}
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
//		"";
			String pattern="[0-9]{10,11}";
			Pattern p=Pattern.compile(pattern);
			Matcher m=p.matcher(content);
			String str_email="";
			while(m.find())
			{
				str_email += m.group(0);
				System.out.println(m.group(0));

			}
	}

}
