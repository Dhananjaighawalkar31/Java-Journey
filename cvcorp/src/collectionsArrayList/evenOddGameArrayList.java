package collectionsArrayList;

import java.util.ArrayList;
import java.util.Random;

public class evenOddGameArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		Random r = new Random();
		for(int i = 0;i<10;i++) {
			a.add(r.nextInt(10));
		}
		System.out.println(a);
		System.out.println(evenOdd(a));
		
	}

	private static String evenOdd(ArrayList<Integer> arr) {
		int left = 0;
		int right = arr.size()-1;
		int p1 = 0;
		int p2 = 0;
		boolean turnP1 = true;
        boolean takeFromLeft = true;

        while (left <= right) {
            int picked;
            if (takeFromLeft) {
                picked = arr.get(left);
                arr.remove(left);
                right--;
            } else {
                picked = arr.get(right);
                arr.remove(right);
                right--;
            }

            if (turnP1) {
                p1 += picked;
            } else {
                p2 += picked;
            }

            if (picked % 2 == 0) {
                takeFromLeft = !takeFromLeft;
            }

            turnP1 = !turnP1;
        }

        
        System.out.println("P1 = " + p1);
        System.out.println("P2 = " + p2);
        
		if(p1>p2) {
			return "p1 won";
		}else if(p2>p1) {
			return "p2 won";
		}
		return "draw";
	}

}
