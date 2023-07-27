import java.util.ArrayList;

public class EnglishProverb extends Proverb {  // Sub Class

	static ArrayList<EnglishProverb> englishProverbList =new ArrayList<EnglishProverb>();
	
	
	
	public EnglishProverb(String fullTxt, String promptTxt, String origin) {
		
		super(fullTxt, promptTxt, origin);
	}
	
	
	public String getEnglishProverbPrompt(EnglishProverb englishProverb) {
		return "Origin is " + englishProverb.getOrigin() + " proverb : " + englishProverb.getPromptTxt() + ".....";
	}
	
	
	public String getEnglishProverbFullText(EnglishProverb englishProverb) {
		return "Origin is " + englishProverb.getOrigin() + " proverb : " + englishProverb.getFullTxt();
	}
	
	
	static void AddEnglishProverb(EnglishProverb englishProverb) {
		
		englishProverbList.add(englishProverb);
	}
	
	public EnglishProverb() {
		
	}
	
	String bring_information_englishproverb(EnglishProverb englishProverb) {
	   	 
	   	 String info="proverb fulltxt : " + englishProverb.getFullTxt() + "\nproverb prompt : " + englishProverb.getPromptTxt() + "\norigin : " + englishProverb.getOrigin();
	   	                              
	   	    return info;
	    }

}
