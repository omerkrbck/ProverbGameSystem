import java.util.ArrayList;

public class TurkishProverb extends Proverb {  // Sub Class

	static ArrayList<TurkishProverb> turkishProverbList =new ArrayList<TurkishProverb>();
	
	
    public TurkishProverb(String fullTxt, String promptTxt, String origin) {
		
		super(fullTxt, promptTxt, origin);
	}
	
    
    

	public String getTurkishProverbPrompt(TurkishProverb turkishProverb) {
		return "Origin is " + turkishProverb.getOrigin() + " proverb : " + turkishProverb.getPromptTxt() + ".....";
	}
	
	
	public String getTurkishProverbFullText(TurkishProverb turkishProverb) {
		return "Origin is " + turkishProverb.getOrigin() + " proverb : " + turkishProverb.getFullTxt();
	}
	
	
	static void AddTurkishProverb(TurkishProverb turkishProverb) {
		
		turkishProverbList.add(turkishProverb);
	}
	
	public TurkishProverb() {
		
	}
	
	String bring_information_turkishproverb(TurkishProverb turkishProverb) {
	   	 
	   	 String info="proverb fulltxt : " + turkishProverb.getFullTxt() + "\nproverb prompt : " + turkishProverb.getPromptTxt() + "\norigin : " + turkishProverb.getOrigin();
	   	                              
	   	    return info;
	    }


}
