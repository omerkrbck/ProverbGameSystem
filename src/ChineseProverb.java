import java.util.ArrayList;

public class ChineseProverb extends Proverb {    // Sub Class

	static ArrayList<ChineseProverb> chineseProverbList = new ArrayList<ChineseProverb>();
	
	
	
    public ChineseProverb(String fullTxt, String promptTxt, String origin) {
		
		super(fullTxt, promptTxt, origin);
	}
	

	public String getChineseProverbPrompt(ChineseProverb chineseProverb) {
		return "Origin is " + chineseProverb.getOrigin() + " proverb : " + chineseProverb.getPromptTxt() + ".....";
	}
	
	
	public String getChineseProverbFullText(ChineseProverb chineseProverb) {
		return "Origin is " + chineseProverb.getOrigin() + " proverb : " + chineseProverb.getFullTxt();
	}
	
	
	static void AddChineseProverb(ChineseProverb chineseProverb) {
		
		chineseProverbList.add(chineseProverb);
	}
	
	public ChineseProverb() {
		
	}
	
	String bring_information_chineseproverb(ChineseProverb chineseProverb) {
	   	 
	   	 String info="proverb fulltxt : " + chineseProverb.getFullTxt() + "\nproverb prompt : " + chineseProverb.getPromptTxt() + "\norigin : " + chineseProverb.getOrigin();
	   	                              
	   	    return info;
	    }
    
}
