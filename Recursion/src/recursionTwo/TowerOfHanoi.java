package recursionTwo;

public class TowerOfHanoi {
	public static void towerOfHanoi(int n, char src, char aux, char dest) {
        if (n == 1) {
            System.out.println(src + " -> " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, aux);
        System.out.println(src + " -> " + dest);
        towerOfHanoi(n - 1, aux, src, dest);
    }

    public static void main(String[] args) {
        int n = 3; // number of disks
        towerOfHanoi(n, 'A', 'B', 'C');
    }


}
