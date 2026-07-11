//A Tournament is happening in CvCorp So here C No of Players is Playing Cricket Match and R No of Matches played So take the Scores in 2D Array And Print the Highest Scorer in Every Match and Print the Highest Scorer in All Matches?
//
//
//Constraints:
//Input            : First Line of The Input Consists of One Integer Value Which Represents No of Matches
//
//                       Second Line of the Input Consists of One Integer Value Which Represents No of Players 
//
//                       And Next Line Consists of Match -1 Scores of All Players and in Next Line Consists of Match -2 Scores of All Players and so on for All R No of Matches 
//
//Output         : Print the Highest Scorer Name And Score In Each and Every Match Separately after that Print the Highest Individual Scorer in All Matches.
//
//Constraints  : NA
//
//
//Example:
//Input 1 :            3
//
//                           3
//
//                           3 5 6
//
//                           7 8 9
//
//                          12 15 12
//
//Outupt 1 :         Player3 - 6
//
//                          Player3 - 9
//
//                          Player2 - 15
//
//                          Player2 - 28
//
// 
//
//Input 2 :            5
//
//                           4
//
//                           2 15 12 13
//
//                           8 5 0 19
//
//                          18 17 4 7
//
//                           9 18 4 19
//
//                          15 14 13 2
//
//Outupt 2 :         Player2 - 15
//
//                          Player4 - 19
//
//                          Player1 - 18
//
//                          Player4 - 19
//
//                          Player1 - 15
//
//                          Player2 - 69
//
// 
//
//
//Explanation:
//Input 1 :            3
//
//                           3
//
//                           3 5 6
//
//                           7 8 9
//
//                          12 15 12
//
//Outupt 1 :         Player3 - 6
//
//                          Player3 - 9
//
//                          Player2 - 15
//
//                          Player2 - 28
//
//Explanation:
//
//In This Tournament We Have 3 Matches (Match -1, Match -2, Match -3) with 3 Players (Player-1, Player-2, Player-3) 
//
//In Match-1 ->  Player - 1 Score is 3, Player - 2 Score is 5, Player - 3 Score is 6, Here Highest Score is Player - 3 With Score 6, So Print Player3 - 6. 
//
//In Match-2 ->  Player - 1 Score is 7, Player - 2 Score is 8, Player - 3 Score is 9, Here Highest Score is Player - 3 With Score 9, So Print Player3 - 9. 
//
//In Match-3 ->  Player - 1 Score is 12, Player - 2 Score is 15, Player - 3 Score is 12, Here Highest Score is Player - 2 With Score 15, So Print Player2 - 15.
//
// 
//
//In All the 3 Matches
//
//Player1 Scores  3, 7, 12. So Total Score is 3 + 7 + 12 = 22 
//
//Player2 Scores  5, 8, 15. So Total Score is 5 + 8 + 15 = 28 
//
//Player3 Scores  6, 9, 12. So Total Score is 6 + 9 + 12 = 27
//
//Here Player2 Scores Highest Score in The Tournament, So Print Player2 - 28  
//
// 
//
// 
//
//Input 2 :            5
//
//                           4
//
//                           2 15 12 13
//
//                           8 5 0 19
//
//                          18 17 4 7
package practice;

import java.util.Scanner;

public class cricketMatch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int m = s.nextInt();
	    int p = s.nextInt();
	    int[][] a = new int[m][p];
	    for(int i = 0;i<m;i++){
	        for(int j = 0;j<p;j++){
	            a[i][j] = s.nextInt();
	        }
	    }
	    for(int i = 0;i<m;i++){
	        int max = 0;
	        int h = 0;
	        for(int j = 0;j<p;j++){
	            if(a[i][j]>max){
	                max = a[i][j];
	                h = j;
	            }
	        }
	        h = h+1;
	        System.out.println("Player"+h+" - "+max);
	    }
	    int[] f = new int[p];
	    for(int i = 0;i<m;i++) {
	    	for(int j = 0;j<p;j++) {
	    		f[j] += a[i][j];
	    	}
	    }
	    int max = 0;
	    int v = 0;
	    for(int i = 0;i<p;i++) {
	    	if(f[i]>max) {
	    		max = f[i];
	    		v = i;
	    	}
	    }
	    System.out.println("Player"+(v+1)+" - "+max);

	    
	}

}
