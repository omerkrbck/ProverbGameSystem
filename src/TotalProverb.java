import java.util.ArrayList;

public class TotalProverb extends Proverb {

	
    static ArrayList <TotalProverb> totalProverbList = new ArrayList<TotalProverb>();
    
    
    
    static void AddProverbClient(TotalProverb totalProverb) {
		
		totalProverbList.add(totalProverb);
	}
    
    public TotalProverb() {
		
	}
    
    public TotalProverb(String fullTxt, String promptTxt, String origin) {
		
		super(fullTxt, promptTxt, origin);
		
	}
    
    
    public String getTotalProverbPrompt(TotalProverb totalProverb) {
		return "Origin is " + totalProverb.getOrigin() + " proverb : " + totalProverb.getPromptTxt() + ".....";
	}
	
	
	public String getTotalProverbFullText(TotalProverb totalProverb) {
		return "Origin is " + totalProverb.getOrigin() + " proverb : " + totalProverb.getFullTxt();
	}
    
    String bring_information_totalproverb(TotalProverb totalProverb) {
	   	 
	   	 String info="proverb fulltxt : " + totalProverb.getFullTxt() + "\nproverb prompt : " + totalProverb.getPromptTxt() + "\norigin : " + totalProverb.getOrigin();
	   	                              
	   	    return info;
	    }
}
