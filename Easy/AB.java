/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ab;

/**
 *
 * @author kenbui
 */
public class AB{
    public String createString(int N, int K){
        int aCount = N / 2;
	    int bCount = N - aCount;
        String string = "";
        String tail = "";
        
        int totalPair = aCount * bCount; //K must be less than or equal to totalPair
        
        if(inRange(N, K) && validPairs(totalPair, K)){
         	for(int i = 0; i < aCount; i++)
               string += 'A';
            for(int i = 0; i < bCount; i++)
               string += 'B';
            
            for(int i = 0; i < totalPair - K; i++){
            	if(string.charAt(string.length() -1) == 'A'){
                    tail += 'A';
                	string = string.substring(0, string.length() - 1);    
                }
                string = switchLetters(string); 
            }
        }
        return string + tail;
    }
    
    public String switchLetters(String s){
        int lastA = s.lastIndexOf('A');
        int firstB = lastA + 1;
     	StringBuilder newString = new StringBuilder(s);   
        newString.setCharAt(firstB, 'A');
        newString.setCharAt(lastA, 'B');
        return newString.toString();
    }
    
    public boolean validPairs(int totalPairs, int K){
     	   if(totalPairs < K) return false;
        else return true;
    }
    
    public boolean inRange(int N, int K){
     	return N >= 2 && N <= 50 && K >= 0 && K <= N*(N-1)/2; 
        
    }
    
    public static void main(String[] args){
        AB ab = new AB();
        System.out.println(ab.createString(20, 29));
    }
}
