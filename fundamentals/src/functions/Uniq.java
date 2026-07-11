//package functions;
//
//public class Uniq {
//	public static int func(int arr[]) {
//		for(int i = 0;i < arr.length;i++) {
//			for(int j = 0;j < arr.length;j++) {
//				if(i != j) {
//					if (arr[i] == arr[j]) {
//						break;
//					}
//				}
//			}int j;
//			if(j == arr.length) {
//				int i;
//				return arr[i];
//		}return Integer.MAX_VALUE;
//		}
//	}
//
//	public static void main(String[] args) {
//
//
//	}
//
//}
package functions;

public class Uniq {
    public static int findUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return arr[i];
            }
        }
        return Integer.MAX_VALUE; // Return a default value if no unique element is found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        int unique = findUnique(arr);
        System.out.println("Unique element: " + unique);
    }
}
