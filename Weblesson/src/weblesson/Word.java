package weblesson;


public class Word{
	private String english;
	private String japanese;

	public String getEnglish(){
		return english;
	}
	public void setEnglish(String english){
		this.english = english;
	}
	public String getJapanese(){
		return japanese;
	}
	public void setJapanese(String japanese){
		this.japanese = japanese;
	}

	public Word(String english, String japanese){
		super();
		this.english = english;
		this.japanese = japanese;
	}

	public String toString(){
		return "英単語： " + this.english + "　日本語： " + this.japanese;
	}
}