//Write a program to find the number of days taken for a frog to reach n steps ,
//
//Every day in the morning frog  jumps a steps up and in the night it falls down b steps,
//
//how many days frog will take to reach n  steps
//
//
//Constraints:
//Input : First line of input n represents no.of steps
//
//           Second line of input a represents no.of steps frog climbs everyday
//
//           Third line of input b represents no.of steps frog falls down everyday
//
// 
//
//Output : No.of steps taken for a frog to reach n steps 
//
// 
//
//Constrains : 
//
//if b is negative then take that value as zero
//
//n and a must be greater than zero or else print "Invalid Input because of negative values" ,
//
//a must be greater than b or else print  "Invalid Inputs"
//
// 
//
//
//Example:
//Input : 10
//
//            5
//
//            4
//
//Output : 6
//
// 
//
//Input : 20
//
//            5
//
//            3
//
//Output : 9
//
// 
//
//
//Explanation:
//Input : 10
//
//            5
//
//            4
//
//Output : 6
//
// 
//
//Explanation :
//
//Every day morning it jumps a steps and if it doesn't reach n steps it falls b steps in the night
//
//So,
//
//1st day it climbs 5 steps and falls down 4 steps ,now frog is at 1st step
//
//2nd day it climbs 5 steps from 1st step and falls down 4 steps ,now frog is at 2nd step
//
//3rd day it climbs 5 steps from 2nd step and falls down 4 steps ,now frog is at 3rd step
//
//4th day it climbs 5 steps from 3rd step and falls down 4 steps ,now frog is at 4th step
//
//5th day it climbs 5 steps from 4th step and falls down 4 steps ,now frog is at 5th step
//
//6th day it climbs 5 steps from 5th step and it will reach 10th step.
//
//So,total no.of days are 6 
//
//

package practice;

import java.util.Scanner;

public class frogJump {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int b  = s.nextInt();
        if(b<0){
            b=0;
        }
        if(n>0&&a>0){
            if(a>b){
                int x = 0;
                int c = 0;
                while(x<n) {
                	c++;
                	x += a;
                	if(x>=n) {
                		break;
                	}
                	x -= b;
                }
//                while(x<n){
//                    if(x == n-a){
//                        x += a;
//                        c++;
//                    }else{
//                        x += a;
//                        x -= b;
//                        c++;
//                    }
//                }
                System.out.print(c);
            }else{
                System.out.print("Invalid Inputs");
            }
        }else{
            System.out.print("Invalid Input because of negative values");
        }

	}

}
