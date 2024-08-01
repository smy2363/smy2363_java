package study0801;

public class Movie {
	private String title;
	private String dic;
	private int year;
	
	
	
	@Override
	public String toString() {
		return title+","+dic+","+year;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDic() {
		return dic;
	}
	public void setDic(String dic) {
		this.dic = dic;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

}
