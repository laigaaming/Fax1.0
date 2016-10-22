package main.fx;

public class FXModel {

	private String appKey;
	private String sign;
	private String format;
	
	private String[] scur;
	private String[] tcur;
	
	public String[] getScur() {
		return scur;
	}
	public void setScur(String[] scur) {
		this.scur = scur;
	}
	public String[] getTcur() {
		return tcur;
	}
	public void setTcur(String[] tcur) {
		this.tcur = tcur;
	}
	public String getAppKey() {
		return appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	
	
}
