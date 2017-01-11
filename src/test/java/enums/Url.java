package enums;

public enum Url {

	BASE_URL("http://valtech.com"),
	INVESTORS_URL("http://valtech.com/investors"),
	WORK_URL("https://www.valtech.com/cases/"),
	INDUSTRIES_URL("https://valtech.com/industries"),
	INSIGHTS_URL("https://www.valtech.com/blog/"),
	CAREERS_URL("https://www.valtech.com/jobs/");
	
	
	String url;
	
	Url(String url){
		this.url = url;
	}
	
	public String getUrl(){
		return url;
	}
}
