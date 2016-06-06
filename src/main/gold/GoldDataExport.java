package main.gold;

import io.IO;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Array;
import java.util.HashMap;
import java.util.Map;
 









import config.PathConfig;
import datetime.Datetime;
import util.HttpRequestUtil;
import util.JsonUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
 
/**
*�ƽ����ݵ���ʾ������ �� �ۺ�����
*���߽ӿ��ĵ���http://www.juhe.cn/docs/29
**/
 
public class GoldDataExport {
    public static final String DEF_CHATSET = "UTF-8";
    public static final int DEF_CONN_TIMEOUT = 30000;
    public static final int DEF_READ_TIMEOUT = 30000;
    public static String userAgent =  "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";
 
    //�����������KEY
    public static final String APPKEY ="cef3fd57796e4fa5b45b2c7ee5b3bf22";
    
    public static void getGoldData() {
    	HttpRequestUtil hru=new HttpRequestUtil();
		String appKey="18895";
		String sign="f3b4032d0b5db704d8cc4e261203cf9d";
		String format="json";
		int[] goldArray=new int[]{1,4,5,6,7,10,11,12,13,15,16};
		StringBuffer goldStrbu = new StringBuffer();
		
		String url="http://api.k780.com:88/?app=finance.shgold&appkey="+appKey+"&sign="+sign+"&format="+format;
		String gold=hru.HttpRequest(url);
		

		JSONObject goldDataObject=JSONObject.fromObject(gold);
		JSONObject resultgoldData=goldDataObject.getJSONObject("result");
		System.out.println(resultgoldData);
		/*************** Au99.95 ***************/
		for (int i = 0; i < goldArray.length; i++) {
			String index=Integer.toString(goldArray[i]);
			Object goldResult10=resultgoldData.get(index);
			JSONObject goldDataObject10=JSONObject.fromObject(goldResult10);
			String variety=goldDataObject10.getString("variety");
			System.out.println("����: "+variety);
			goldStrbu.append("����: "+variety+"\r\n");
			
			String last_price=goldDataObject10.getString("last_price");
			System.out.println("���¼�: "+last_price);
			goldStrbu.append("���¼�: "+last_price+"\r\n");
			
			String high_price=goldDataObject10.getString("high_price");
			System.out.println("��߼�: "+high_price);
			goldStrbu.append("��߼�: "+high_price+"\r\n");
			
			String low_price=goldDataObject10.getString("low_price");
			System.out.println("��ͼ�: "+low_price);
			goldStrbu.append("��ͼ�: "+low_price+"\r\n");
			
			String open_price=goldDataObject10.getString("open_price");
			System.out.println("������: "+open_price);
			goldStrbu.append("������: "+open_price+"\r\n");
			
			String yesy_price=goldDataObject10.getString("yesy_price");
			System.out.println("�����: "+yesy_price);
			goldStrbu.append("�����: "+yesy_price+"\r\n");
			
			String change_margin=goldDataObject10.getString("change_margin");
			System.out.println("�ǵ���: "+change_margin);
			goldStrbu.append("�ǵ���: "+change_margin+"\r\n");
			
			String uptime=goldDataObject10.getString("uptime");
			System.out.println("����ʱ��: "+uptime);
			System.out.println("");
			goldStrbu.append("����ʱ��: "+uptime+"\r\n");
			goldStrbu.append("\r\n");
		}
		
		IO io=new IO();
		Datetime dt=new Datetime();
		String dateime=dt.getTime();
		PathConfig pathConfig=new PathConfig();
		String pri_path=pathConfig.path;
		io.outputToText(goldStrbu, pri_path+"\\gold\\Gold_Data_"+dateime+".gold");
		/*************** iAu99.99 ***************//*
		String goldResult15=resultgoldData.getString("15");
		System.out.println(goldResult15);
		*//*************** Pt99.95 ***************//*
		String goldResult12=resultgoldData.getString("12");
		System.out.println(goldResult12);
		*//*************** Au(T+D) ***************//*
		String goldResult4=resultgoldData.getString("4");
		System.out.println(goldResult4);
		*//*************** iAu100g ***************//*
		String goldResult13=resultgoldData.getString("13");
		System.out.println(goldResult13);
		*//*************** Au(T+N1) ***************//*
		String goldResult5=resultgoldData.getString("5");
		System.out.println(goldResult5);
		*//*************** Au(T+N2) ***************//*
		String goldResult6=resultgoldData.getString("6");
		System.out.println(goldResult6);
		*//*************** Au100g ***************//*
		String goldResult7=resultgoldData.getString("7");
		System.out.println(goldResult7);
		*//*************** mAu(T+D) ***************//*
		String goldResult16=resultgoldData.getString("16");
		System.out.println(goldResult16);
		*//*************** Ag(T+D) ***************//*
		String goldResult1=resultgoldData.getString("1");
		System.out.println(goldResult1);
		*//*************** Au99.99 ***************//*
		String goldResult11=resultgoldData.getString("11");
		System.out.println(goldResult11);*/
		
	}
    
    
    //1.�Ϻ��ƽ�����
    public static void getRequestshgold(){
        String result =null;
        String url ="http://apis.haoservice.com/lifeservice/gold/shgold";//����ӿڵ�ַ
        Map params = new HashMap();//�������
            params.put("key",APPKEY);//APP Key
            params.put("v","");//JSON��ʽ�汾(0��1)Ĭ��Ϊ0
        
        try {
            result =net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if(object.getInt("error_code")==0){
                System.out.println(object.get("result"));
                
            }else{
                System.out.println(object.get("error_code")+":"+object.get("reason"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }
 
    //2.�Ϻ��ڻ�������
    public static void getRequest2(){
        String result =null;
        String url ="http://web.juhe.cn:8080/finance/gold/shfuture";//����ӿڵ�ַ
        Map params = new HashMap();//�������
            params.put("key",APPKEY);//APP Key
            params.put("v","");//JSON��ʽ�汾(0��1)Ĭ��Ϊ0
 
        try {
            result =net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if(object.getInt("error_code")==0){
                System.out.println(object.get("result"));
            }else{
                System.out.println(object.get("error_code")+":"+object.get("reason"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    //3.�����˻��ƽ�
    public static void getRequest3(){
        String result =null;
        String url ="http://web.juhe.cn:8080/finance/gold/bankgold";//����ӿڵ�ַ
        Map params = new HashMap();//�������
            params.put("key",APPKEY);//APP Key
 
        try {
            result =net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if(object.getInt("error_code")==0){
                System.out.println(object.get("result"));
            }else{
                System.out.println(object.get("error_code")+":"+object.get("reason"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
 
 
    public static void main(String[] args) {
//    	getRequestshgold();
    	getGoldData();
    }
 
    /**
     *
     * @param strUrl �����ַ
     * @param params �������
     * @param method ���󷽷�
     * @return  ���������ַ���
     * @throws Exception
     */
    public static String net(String strUrl, Map params,String method) throws Exception {
        HttpURLConnection conn = null;
        BufferedReader reader = null;
        String rs = null;
        try {
            StringBuffer sb = new StringBuffer();
            if(method==null || method.equals("GET")){
                strUrl = strUrl+"?"+urlencode(params);
            }
            URL url = new URL(strUrl);
            conn = (HttpURLConnection) url.openConnection();
            if(method==null || method.equals("GET")){
                conn.setRequestMethod("GET");
            }else{
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);
            }
            conn.setRequestProperty("User-agent", userAgent);
            conn.setUseCaches(false);
            conn.setConnectTimeout(DEF_CONN_TIMEOUT);
            conn.setReadTimeout(DEF_READ_TIMEOUT);
            conn.setInstanceFollowRedirects(false);
            conn.connect();
            if (params!= null && method.equals("POST")) {
                try {
                    DataOutputStream out = new DataOutputStream(conn.getOutputStream());
                        out.writeBytes(urlencode(params));
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
            InputStream is = conn.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, DEF_CHATSET));
            String strRead = null;
            while ((strRead = reader.readLine()) != null) {
                sb.append(strRead);
            }
            rs = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (conn != null) {
                conn.disconnect();
            }
        }
        return rs;
    }
 
    //��map��תΪ���������
    public static String urlencode(Map<String,Object>data) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry i : data.entrySet()) {
            try {
                sb.append(i.getKey()).append("=").append(URLEncoder.encode(i.getValue()+"","UTF-8")).append("&");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}
