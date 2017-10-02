package doan;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
public class Ketnoi_Web {
	public static ArrayList<String> Ketnoi_Web() {
		ArrayList<String> str = new ArrayList<String>();
		String inputLine;
		try {
			String urlstr="http://rongbay.com/TP-HCM/O-to-c19.html";
			URL url = new URL(urlstr);
			URLConnection conn = url.openConnection();

			// open the stream and put it into BufferedReader
			BufferedReader br = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			while ((inputLine = br.readLine()) != null) {
				//System.out.println(inputLine);
				str.add(inputLine);
			}
			br.close();
			System.out.println("Done");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
}



