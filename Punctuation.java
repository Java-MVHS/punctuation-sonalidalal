/* Sonali Dalal
 * December 11, 2024
 * Punctuation.java
 * working on String methods
 * working on using counters
 * 
 * Prompt: get a paragraph. CHeck if the words
 * in the paragraph have punctuation. 
 * If they have punctuation, print them
 * 
 * Testing: Winston Churchill speech 
 * as well as your own quotes
 * Make sure that the only words that print are the words with punctuation
 */
 
 public class Punctuation //class header
 {
	 public static void main(String [] args) //main method
	 {
		 System.out.println("\n\n\n"); //three new lines
		 Punctuation bring = new Punctuation(); //make an instance of Punctuation (static method)
		 bring.searchIt(); //call the searchIt method
	 }
		 public static void searchIt() //method searchIt
		 {
			 String everything = new String (""); //initialize + declare everything as a String
			 everything = getPunctuation(); //make everything equal to getPunctuation()
			 printWords(everything); //call the printWords method, with everything as a parameter
		 }
		 
		 public static String getPunctuation() //getPunctuation method
		 {
			 String passage = new String("Blood, Sweat, and Tears by Winston Churchill " + //initialize Winston Churchill's speech as passage
										"May 13, 1940" + "Mr. Speaker:" + " On Friday evening last I received His Majesty’s commission to form a new " + 
										"Administration. It was the evident wish and will of Parliament and the nation that this should be conceived on the broadest " +
										 "possible basis and that it should" +
										"include all parties, both those who supported the late Government and also the parties" + "of the Opposition. " +
										"I have completed the most important part of this task. A War Cabinet has " +
										"been formed of five Members, representing, with the Liberal Opposition, the unity of the " +
										"nation. The three party Leaders have agreed to serve, either in the War Cabinet or in " +
										"high executive office. The three Fighting Services have been filled. It was necessary " +
										"that this should be done in one single day, on account of the extreme urgency and " +
										"rigour of events. A number of other key positions were filled yesterday, and I am " +
										"submitting a further list to His Majesty tonight. I hope to complete the appointment of the " +
										"principal Ministers during tomorrow. The appointment of the other Ministers usually " +
										"takes a little longer, but I trust that, when Parliament meets again, this part of my task " +
										"will be completed, and that the Administration will be complete in all respects. " +
										"Sir, I considered it in the public interest to suggest that the House should " +
										"be summoned to meet today. Mr. Speaker agreed and took the necessary steps, in " +
										"accordance with the powers conferred upon him by the Resolution of the House. At the " +
										"end of the proceedings today, the Adjournment of the House will be proposed until " +
										"Tuesday, the 21st May, with, of course, provision for earlier meeting, if need be. The " +
										"business to be considered during that week will be notified to Members at the earliest " +
										"opportunity. I now invite the House, by the Resolution which stands in my name, to " +
										"record its approval of the steps taken and to declare its confidence in the new " +
										"Government." + " Sir, to form an Administration of this scale and complexity is a serious " +
										"undertaking in itself, but it must be remembered that we are in the preliminary stage of " +
										"one of the greatest battles in history, that we are in action at many points in Norway and " +
										"in Holland, that we have to be prepared in the Mediterranean, that the air battle is " +
										"continuous and that many preparations have to be made here at home. In this crisis I " +
										"hope I may be pardoned if I do not address the House at any length today. I hope that " +
										"any of my friends and colleagues, or former colleagues, who are affected by the political " +
										"reconstruction, will make all allowances for any lack of ceremony with which it has been " +
										"necessary to act. I would say to the House, as I said to those who’ve joined this " +
										"government: \"I have nothing to offer but blood, toil, tears and sweat.\"" +
										"We have before us an ordeal of the most grievous kind. We have before " +
										"us many, many long months of struggle and of suffering. You ask, what is our policy? I " +
										"will say: It is to wage war, by sea, land and air, with all our might and with all the " +
										"strength that God can give us; to wage war against a monstrous tyranny, never " +
										"surpassed in the dark and lamentable catalogue of human crime. That is our policy. You " +
										"ask, what is our aim? I can answer in one word: victory. Victory at all costs, victory in " +
										"spite of all terror, victory, however long and hard the road may be; for without victory, " +
										"there is no survival. Let that be realised; no survival for the British Empire, no survival " +
										"for all that the British Empire has stood for, no survival for the urge and impulse of the " +
										"ages, that mankind will move forward towards its goal. " +
										"But I take up my task with buoyancy and hope. I feel sure that our cause " +
										"will not be suffered to fail among men. At this time I feel entitled to claim the aid of all, " +
										"and I say, \"Come then, let us go forward together with our united strength.\"");
			 int lengthOf = passage.length(); //make lengthOf equal to the length of the passage
			 char checkSpace; //declare
			 String word = new String(""); //declare and initialize
			 int startOfWord = 0; //declare and initiazlize
			 String allWords = new String(""); //declare and initialize
			 String punctuationWords = new String(""); //declare and initialize
			 int lengthOfWord = 0; //declare and initialize
			 
			 for(int i=0; i<lengthOf; i++) //initialzie i, the loop will run until i is equal to the length, i is bsically the indice since it started at 0
			 {
				 checkSpace = passage.charAt(i); //checkSpace is equal to the chracter at indice i
				 if(checkSpace == ' ') //if checkSpace is a space
				 {
					 word = passage.substring(startOfWord,i); //word is equal to what is between startOfWord and i
					 lengthOfWord = word.length(); //lengthOfWord is equal to the length of word
					 punctuationWords = checkForPunctuation(word); //call checkForPunctuation and send word
					 allWords = (allWords  + punctuationWords); //allWords is equal to the words coming from checkForPuntcuation method
					 startOfWord = startOfWord + lengthOfWord; //startOfWord is equal to i plus the length of the previous word

				 }
			 }	
			 return allWords;	//return allWords
		 } 
		 
		 
		 public static String checkForPunctuation(String word) //checkForPunctuation method; parameter is word
		 {
			 String essay = new String(word); //make essay equal to word
			 String book = new String (""); //declare and initilize
			 if(essay.indexOf('.') != -1) //if the word has a period
			 {
				 book = essay; //make book equal to essay
				 
			 }
			 else if (essay.indexOf(',') != -1) //if essay has a comma
			 { 
				 	 book = essay; //make book equal to essay

			 }
			  else if (essay.indexOf(';') != -1) //if essay has a semicolon
			 { 
				 	book = essay; //make book equal to essay

			 }
			  else if (essay.indexOf(':') != -1) //if essay has a colon
			 { 
				 	 book = essay; //make book equal to essay

			 }
			  else if (essay.indexOf('!') != -1) //if essay has a exclamation mark
			 { 
				 	book = essay; //make book equal to essay

			 }
			  else if (essay.indexOf('-') != -1) //if essay has a dash
			 { 
				 	book = essay; //make book equal to essay

			 }
			  else if (essay.indexOf('?') != -1) //if essay has a question mark
			 { 
				 	book = essay; //make book equal to essay

			 }
			  else if (essay.indexOf('"') != -1) //if essay has a double quote
			 { 
				 	book = essay; //make book equal to essay
				 	
			 }
			 else if (essay.indexOf('\'') != -1) //if essay has a (
			 {
				 book = essay; //make book equal to essay
			 }
			 else if (essay.indexOf('\\') != -1) //if essay has a )
			 {
				 book = essay;  //make book equal to essay
			 }
			 
			return book; //return book to where it was called from
			 
		 }
		 	
		 public static void printWords(String everything) //method printWords
		 {
			 System.out.println(everything); //print everything
			 System.out.println("\n\n\n"); //three new lines
		 }
	 }
