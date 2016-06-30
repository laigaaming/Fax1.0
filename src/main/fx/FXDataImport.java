package main.fx;

import io.IO;
import net.sf.json.JSONObject;
import util.HttpRequestUtil;
import config.PathConfig;
import datetime.Datetime;

public class FXDataImport {
	public static final String DEF_CHATSET = "UTF-8";
	public static final int DEF_CONN_TIMEOUT = 30000;
	public static final int DEF_READ_TIMEOUT = 30000;
	public static String userAgent = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";

	// ≈‰÷√ƒ˙…Í«ÎµƒKEY
	public static final String APPKEY = "cef3fd57796e4fa5b45b2c7ee5b3bf22";

	public static void getFXData() {
		HttpRequestUtil hru = new HttpRequestUtil();
		String appKey = "18895";
		String sign = "f3b4032d0b5db704d8cc4e261203cf9d";
		String format = "json";
		String[] scur = new String[] { "USD", "CNY", "AUD", "CAD", "EUR", "GBP" };
		String[] tcur = new String[] { "USD", "CNY", "AUD", "CAD", "EUR", "GBP" };
		double rate;
		

		for (int i = 0; i < scur.length; i++) {
			for (int j = 0; j < tcur.length; j++) {
				if (!scur[i].equals(tcur[j])) {
					String url = "http://api.k780.com:88/?app=finance.rate&scur="+scur[i]+"&tcur="+tcur[j]+"&appkey="
							+ appKey + "&sign=" + sign + "&format=" + format;
					Object fx = hru.HttpRequest(url);
//					System.out.println(fx);
					JSONObject fxDataObject=JSONObject.fromObject(fx);
					JSONObject resultObject=fxDataObject.getJSONObject("result");
//					System.out.println(resultObject);
					
					rate=resultObject.getDouble("rate");
//					String rate=fxObject.getString("rate");
					System.out.println(scur[i]+"/"+tcur[j]+" "+rate);
					
					FXDB fxdb=new FXDB();
					int result=fxdb.insertDB("fx", scur[i], tcur[j], rate);
					if (result==1) {
						System.out.println("success insert "+scur[i]+"/"+tcur[j]+" "+rate);
					}
				}
				
			}

		}

	}
	
	public static void main(String agrs[]) {
		getFXData();
		System.out.println("INPUT FX DATA INTO DB COMPLETE!");
	}
}
