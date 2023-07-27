import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ProverbClient {      // MAIN CLASS

	static boolean continue_yes () {
		boolean cont = false;
		Scanner scanner = new Scanner(System.in);   // Scanner Class
		
		try {      // Continue or Stop Game ...  // try-catch
			
			System.out.println("#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#");
			System.out.println("Do You Want To Continue Playing The Proverb Guessing Game ? Please Enter " + "\nYES --->> 1 " + "\nNO --->> 2");
			int cont_input = scanner.nextInt();
			
			if (cont_input == 1) {
				cont = true;
			}
			else if (cont_input == 2) {
				return cont;
			}
			else {
				System.out.println("You Entered The Wrong Input. The Program Is Closing....");
				return cont;
			}
			
		} catch (Exception e) {
			
			System.out.println("You Entered The Wrong Input. The Program Is Closing....");
		}finally {
			return cont;
		}
	}
	
	public static void main(String[] args) throws IOException {       // The Proverb Guessing Game

		try {
			
		String filenameEnglishFullTxt="c:\\fulltextenglishproverbs.txt";
		String filenameEnglishPromptTxt="c:\\prompttextenglishproverbs.txt";
		
		String filenameChineseFullTxt="c:\\fulltextchineseproverbs.txt";
		String filenameChinesePromptTxt="c:\\prompttextchineseproverbs.txt";
		
		String filenameTurkishFullTxt="c:\\fulltextturkishproverbs.txt";
		String filenameTurkishPromptTxt="c:\\prompttextturkishproverbs.txt";
		
		
		
		Path pathEnglishFullTxt=Paths.get(filenameEnglishFullTxt.toString());
		Path pathEnglishPromptTxt=Paths.get(filenameEnglishPromptTxt.toString());
		
		Path pathChineseFullTxt=Paths.get(filenameChineseFullTxt.toString());
		Path pathChinesePromptTxt=Paths.get(filenameChinesePromptTxt.toString());
		
		Path pathTurkishFullTxt=Paths.get(filenameTurkishFullTxt.toString());
		Path pathTurkishPromptTxt=Paths.get(filenameTurkishPromptTxt.toString());
		
		
		
		InputStream inputEnglishFullTxt= Files.newInputStream(pathEnglishFullTxt);
		BufferedReader readerEnglishFullTxt =new BufferedReader(new InputStreamReader(inputEnglishFullTxt));
		
		InputStream inputChineseFullTxt= Files.newInputStream(pathChineseFullTxt);
		BufferedReader readerChineseFullTxt =new BufferedReader(new InputStreamReader(inputChineseFullTxt));
		
		InputStream inputTurkishFullTxt= Files.newInputStream(pathTurkishFullTxt);
		BufferedReader readerTurkishFullTxt =new BufferedReader(new InputStreamReader(inputTurkishFullTxt));
		
		
		
		InputStream inputEnglishPromptTxt= Files.newInputStream(pathEnglishPromptTxt);
		BufferedReader readerEnglishPromptTxt =new BufferedReader(new InputStreamReader(inputEnglishPromptTxt));
		
		InputStream inputChinesePromptTxt= Files.newInputStream(pathChinesePromptTxt);
		BufferedReader readerChinesePromptTxt =new BufferedReader(new InputStreamReader(inputChinesePromptTxt));
		
		InputStream inputTurkishPromptTxt= Files.newInputStream(pathTurkishPromptTxt);
		BufferedReader readerTurkishPromptTxt =new BufferedReader(new InputStreamReader(inputTurkishPromptTxt));
		
		
		String proverbEnglishFull= null;
		String proverbEnglishPrompt=null;
		String originEng="English";
		EnglishProverb englishProverb1=new EnglishProverb();
		
		
		String proverbChineseFull= null;
		String proverbChinesePrompt=null;
		String originChn="Chinese";
		ChineseProverb chineseProverb1=new ChineseProverb();
		
		
		String proverbTurkishFull= null;
		String proverbTurkishPrompt=null;
		String originTr="Turkish";
		TurkishProverb turkishProverb1=new TurkishProverb();
		
		String line="------------------------------------------------------------------------------------------------------------";
		
		System.out.println(line);
		
        while (((proverbEnglishFull=readerEnglishFullTxt.readLine()) != null) & ((proverbEnglishPrompt=readerEnglishPromptTxt.readLine() )!= null) ) {
        	
        	EnglishProverb englishProverb2=new EnglishProverb(proverbEnglishFull, proverbEnglishPrompt, originEng);
			englishProverb1.AddEnglishProverb(englishProverb2);
        	
        	
		}
        /*
        System.out.println("*****   All English Proverb List   *****");
        for (EnglishProverb string : EnglishProverb.englishProverbList) {
      		 
			System.out.println(englishProverb1.bring_information_englishproverb(string));
		}
        
        System.out.println(line);*/
        
        while (((proverbChineseFull=readerChineseFullTxt.readLine()) != null) & ((proverbChinesePrompt=readerChinesePromptTxt.readLine() )!= null) ) {
        	
        	ChineseProverb chineseProverb2=new ChineseProverb(proverbChineseFull, proverbChinesePrompt, originChn);
        	chineseProverb1.AddChineseProverb(chineseProverb2);
        	
		}
        /*
        System.out.println("*****   All Chinese Proverb List   *****");
        for (ChineseProverb string : ChineseProverb.chineseProverbList) {
      		 
			System.out.println(chineseProverb1.bring_information_chineseproverb(string));
		}
        
        System.out.println(line);*/
        
        
        while (((proverbTurkishFull=readerTurkishFullTxt.readLine()) != null) & ((proverbTurkishPrompt=readerTurkishPromptTxt.readLine() )!= null) ) {
        	
        	TurkishProverb turkishProverb2 =new TurkishProverb(proverbTurkishFull, proverbTurkishPrompt, originTr);
        	turkishProverb1.AddTurkishProverb(turkishProverb2);
        	
        	
		}
        /*
        System.out.println("*****   All Turkish Proverb List   *****");
        for (TurkishProverb string : TurkishProverb.turkishProverbList) {
      		 
			System.out.println(turkishProverb1.bring_information_turkishproverb(string));
		}
        
        
        System.out.println(line);*/
        
        
        
        TotalProverb totalProverb1=new TotalProverb();
        
        
        for (EnglishProverb string : EnglishProverb.englishProverbList) {
     		 
        	String newfulltext= string.getFullTxt();
        	String newprompttext= string.getPromptTxt();
        	String neworigin= string.getOrigin();
        	TotalProverb totalProverb2=new TotalProverb(newfulltext, newprompttext, neworigin);
        	totalProverb1.AddProverbClient(totalProverb2);
		}
        
        for (ChineseProverb string : ChineseProverb.chineseProverbList) {
    		 
        	String newfulltext= string.getFullTxt();
        	String newprompttext= string.getPromptTxt();
        	String neworigin= string.getOrigin();
        	TotalProverb totalProverb2=new TotalProverb(newfulltext, newprompttext, neworigin);
        	totalProverb1.AddProverbClient(totalProverb2);
		}
        
        for (TurkishProverb string : TurkishProverb.turkishProverbList) {
   		 
        	String newfulltext= string.getFullTxt();
        	String newprompttext= string.getPromptTxt();
        	String neworigin= string.getOrigin();
        	TotalProverb totalProverb2=new TotalProverb(newfulltext, newprompttext, neworigin);
        	totalProverb1.AddProverbClient(totalProverb2);
		}
        
        /*
        System.out.println(line);
        System.out.println("*****   Total Proverb List   *****");
        for (TotalProverb string : TotalProverb.totalProverbList) {
    		 
			System.out.println(totalProverb1.bring_information_totalproverb(string));
		}
        
        System.out.println(line);*/
        
        
        Scanner scanner= new Scanner(System.in);
        
        
        while (true) {
			
        	
        	Random rnd = new Random();
            
            int allProverbsListSize=englishProverb1.englishProverbList.size()+chineseProverb1.chineseProverbList.size()+turkishProverb1.turkishProverbList.size();
            
            //System.out.println("Total size of all proverb lists : " + allProverbsListSize);
            
            int randomIndex=rnd.nextInt(allProverbsListSize);
            
            //System.out.println("Random index to predict : " + randomIndex);
            
            
            
           
            
            ArrayList<String> newarray=new ArrayList<String>();
            
            for (TotalProverb string : TotalProverb.totalProverbList) {
            	
            	if (totalProverb1.totalProverbList.indexOf(string)== randomIndex) {
            		
            		newarray.add(string.getPromptTxt());
            		newarray.add(string.getFullTxt());
            		newarray.add(string.getOrigin());
    			}
    		}
            /*
            System.out.println(line);
            
            System.out.println("Random prompt : " + newarray.get(0));
            System.out.println("Random fulltext : " + newarray.get(1));
            System.out.println("Random origin : " + newarray.get(2));
            
            System.out.println(line);*/
		
            System.out.println("**********     Welcome To The Proverb Guessing Game     **********");
            System.out.println("\n");
            System.out.println("Origin is " + newarray.get(2) + " proverb : " + newarray.get(0) + " ..... ");
        
            System.out.println("Let's Take A Guess ... (Please Enter Full Text Proverb)  : ");
		    String writeproverb = scanner.nextLine();
		
		
		
		
		if (writeproverb.equals(newarray.get(1))) {
			System.out.println(line);
			System.out.println("*****   Congratulations You Guessed Right :)   *****");
			System.out.println("Origin " + newarray.get(2) + " proverb : " + newarray.get(1));
			System.out.println(line);
			
			
			if (continue_yes()) {
	    		continue;
			}
	    	else {
				System.out.println("The Proverb Guessing Game Is Closing .....");
				Thread.sleep(2000);
				System.out.println("The Proverb Guessing Game Closed  .....  SEE YOU SOON !!");
				return;
			}
		}
		else {
			System.out.println(line);
			System.out.println("*****   Unfortunately You Didn't Know   *****");
			System.out.println("The Correct Proverb ----->>> " + " Origin " + newarray.get(2) + " proverb : " + newarray.get(1));
			System.out.println(line);
			
			
			if (continue_yes()) {
	    		continue;
			}
	    	else {
				System.out.println("The Proverb Guessing Game Is Closing .....");
				Thread.sleep(2000);
				System.out.println("The Proverb Guessing Game Closed  .....  SEE YOU SOON !!");
				return;
			}
		}
        }
		}
		catch (Exception e) {

			System.out.println("*****   You Entered Invalid Input. Please Try Again. Warning : " + e + "   *****");
		
		}
	}

}
