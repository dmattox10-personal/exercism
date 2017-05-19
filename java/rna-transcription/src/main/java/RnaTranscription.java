public class RnaTranscription 
{
    public String ofDna(String dnaString) 
    {
    	char[] dnaChar = dnaString.toCharArray();
    	String rnaString = "";
    	String outString = "";
    	for (int i = 0; i < dnaString.length(); i++ )
    	{
			System.out.println(i);
			// For loop takes each character in the string, uses switch/case to output the correct pairing
    		// then, the string is assembled
    		switch (dnaChar[i]) 
    		{
    			case 'C':
    			outString = "G";
    			break;

    			case 'G':
    			outString = "C";
    			break;

    			case 'T':
    			outString = "A";
    			break;

    			case 'A':
    			outString = "U";
    			break;
    		}
    		rnaString = rnaString + outString;
    	}
        return rnaString;
    }
}