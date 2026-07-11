package collectionsQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class J006 {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(5);
		al.add(3);
		al.add(15);
		al.add(7);
		al.add(1);
		al.add(12);
		String a = m1(al);
		System.out.println(a);

	}

	private static String m1(List<Integer> al) {
		ArrayDeque<Integer> q = new ArrayDeque<>(al);
		Random r = new Random();
		int n = al.size();
		int i = 0;
		int p1 = 0;
		int p2 = 0;
		boolean p1Chance = true;
		while(!q.isEmpty()) {
			int s = r.nextInt();
			if(p1Chance) {
				if(s%2==0) {
					p1+=q.getFirst();
				}
				p1Chance = !p1Chance;
			}else {
				if(s%2 == 1) {
					p2+=q.getFirst();
				}
				p1Chance = !p1Chance;
			}
			
		}
		if(p1>p2) {
			return "p1 winner";
		}
		return "p2 winner";
	}

}
