public class PangramChecker {

    public boolean isPangram(String input) {
        input.toLowerCase();
        char[] inputChar = input.toCharArray();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabetChar = alphabet.toCharArray();
        int pangram = 0;
        int noChar = 0;
        int[] count = new int[alphabet.length()];
        int letters = 0;


        for (int i = 0; i < alphabet.length(); i++ )
        {

            for (int j = 0; j < input.length(); j++)
            {
                if (alphabetChar[i] == inputChar[j])
                {
                    //pangram++;
                    count[i]++;
                    System.out.println(count[i]);
                    //System.out.println(pangram + " Letters");
                }
                else
                {
                    noChar++;
                }

            }

        }
        //if (pangram >= 26) //This instead needs to be a for loop, checking how many times each character appears
        //{
        //    return true;
        //}
        //else if (noChar > 26)
        //{
        //    return false;
        //}
        //else
        //{
        //    return false;
        //}
        // PUT FOR LOOP HERE!
        // IF adding the segments of the array is over 1, reduce to one, then count the total, and if 26, proceed, true
        for (int c = 0; c < alphabet.length(); c++ )
        {
            if (count[c] > 1)
            {
                count[c] = 1;
            }
            if (count[c] > 0)
            {
                letters++;
            }
        }
        if (letters == 26)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    // Sanitize the input if possible?

    // Check for the alphabet, in order, using a premade array

}
