package jmasters.algorithms.exercises;

import sdossey.algorithms.datasets.Words;

public class SortedArraySearch 
{
    //Reimplement this method to be faster. 
    //It is okay to create other methods that are called,
    //and it is okay to use methods of String (such as equals)
    static int lastIndex = 0;

    public static boolean contains(String[] data, String searchString)
    {
        // int i = data.length / 2;
        while (data[i]) {
            
        }
        // SOLUTION 1
        // for(int i = lastIndex; i < data.length; i++){

        //     if(searchString.equals(data[i]))
        //         {
        //             lastIndex = i;
        //             return true;
        //         }
        //     }
        //     return false;
        // ORIGINAL SOLUTION
        //     for (String value:data){
        
        //     if(searchString.equals(value)) {
        //         return true;
        //         }
        
        //     }
        // return false;

        // You could implement something where the dataset that is checked is shortened after every match. Since everything is alphabetized 
        // you would never need to check earlier strings again. I dont know if this is possible by solely modifying the contains method though.
        
        // Could also convert strings to numeral values and compare those, which would be way quicker
        
        // Binary Search
    }

    public static final void main(String[] args)
    {
        String[] data = Words.ENGLISH;   
        String[] checkData = Words.SPANISH;
        
        int counter=0;

        long start = System.currentTimeMillis();
        for( String value : checkData )
        {
            if(contains(data, value))
            {                
                counter += 1;
            }
        }        
        long end = System.currentTimeMillis();        
        System.out.println("There are "+counter+" words shared between our Spanish and English dictionary.");
        System.out.println("It took "+(end-start)+ " milliseconds to do this calculation.");
    }
}
