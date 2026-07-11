package Strings;
/*
56.	Write a Program to print to the given String characters as shown in example?
Ex:-	Input:-	I am preparing myself for MNC’s and Product based companies.
Output:-	I
am
pre
pari
ngmys
elffor
MNC’san
dProduct
basedcomp
anies.
*/

public class P56 {

	public static void main(String[] args) {
		String s = "I am preparing myself for MNC’s and Product based companies.";
		div(s);
	}

//	private static void div(String s) {
//		int n = s.length();
//		s = s.replace(" ", "");
//		int c = 0;
//		int j = 0;
//		for(int i = 0;i<n;i++) {
//			c++;
//			System.out.println(s.substring(i,j+1));
//			i = j+1;
//			j = c+1;
//			
//		}
//		
//		
//		
//		
//	}
	private static void div(String s) {
        String[] words = s.split(" ");
        String result = "";
        for (String word : words) {
            int c = 0;
            String temp = "";
            for (char ch : word.toCharArray()) {
                temp += ch;
                c++;
                if (c == 3) {
                    result += temp + " ";
                    temp = "";
                    c = 0;
                }
            }
            if (!temp.isEmpty()) {
                result += temp;
            }
            result += " ";
        }
        String[] finalResult = result.split(" ");
        for (String str : finalResult) {
            System.out.println(str);
        }
    }

}
