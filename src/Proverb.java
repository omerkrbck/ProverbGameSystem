
public class Proverb {  // Super Class // Base Class

	private String fullTxt;
	
	private String promptTxt;
	
	private String origin;
	
	
	// Generate Proverb () Constructors.
	
	public Proverb() {
		
	}
	
	// Generate Constructor using fields , Proverb(String fullTxt, String promptTxt, String origin){} ..
	
	public Proverb(String fullTxt, String promptTxt, String origin) {
		super();
		this.fullTxt = fullTxt;
		this.promptTxt = promptTxt;
		this.origin = origin;
	}


	// Generate Getters And Setters For fullTxt, promptTxt, origin variables.
	
	public String getFullTxt() {
		return fullTxt;
	}

	public void setFullTxt(String fullTxt) {
		this.fullTxt = fullTxt;
	}

	public String getPromptTxt() {
		return promptTxt;
	}

	public void setPromptTxt(String promptTxt) {
		this.promptTxt = promptTxt;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	
}
