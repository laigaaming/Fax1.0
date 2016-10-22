package main.fx;

import net.sf.json.JSONObject;
import util.HttpRequestUtil;
import config.Config;

public class FXDataImport {
	public static final String DEF_CHATSET = "UTF-8";
	public static final int DEF_CONN_TIMEOUT = 30000;
	public static final int DEF_READ_TIMEOUT = 30000;
	public static String userAgent = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";
	
	public String getURL(String scur, String tcur) {
		Config config=new Config();
		String url = "http://api.k780.com:88/?app=finance.rate&scur="+scur+"&tcur="+tcur+"&appkey="
				+ config.appKey + "&sign=" + config.sign + "&format=" + config.format;
//		System.out.println("URL: "+url);
		return url;
	}

	public void getFXData() {
		Config config=new Config();	
		HttpRequestUtil hru = new HttpRequestUtil();
		String[] scur=config.scur;
		String[] tcur=config.tcur;
		double rate;
		for (int i = 0; i < scur.length; i++) {
			for (int j = 0; j < tcur.length; j++) {
				if (!scur[i].equals(tcur[j])) {
					String url=getURL(scur[i], tcur[j]);
					Object fx = hru.HttpRequest(url);
//					System.out.println(fx);
					JSONObject fxDataObject=JSONObject.fromObject(fx);
					JSONObject resultObject=fxDataObject.getJSONObject("result");
//					System.out.println(resultObject);
					
					rate=resultObject.getDouble("rate");
//					System.out.println(scur[i]+"/"+tcur[j]+" "+rate);
					
					FXDB fxdb=new FXDB();
					int result=fxdb.insertDB("fx", scur[i], tcur[j], rate);
					if (result==1) {
						System.out.println("success insert "+scur[i]+"/"+tcur[j]+" "+rate);
					}
				}
				
			}

		}

	}
	
}
