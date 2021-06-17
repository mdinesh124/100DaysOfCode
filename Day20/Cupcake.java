import java.util.*;
public class Cupcake{

    public static void reverse(int[] array)
	{
		int n = array.length;
		for (int i = 0; i < n / 2; i++) {
			int temp = array[i];
			array[i] = array[n - i - 1];
			array[n - i - 1] = temp;
		}
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = sc.nextInt();
        }
        long sum = 0;
        Arrays.sort(array);
		reverse(array);

        for(int i = array.length-1; i >=0; i--)
        {
          sum = sum+(long)(Math.pow(2,i))*array[i];
        }
        System.out.println(sum);
    }
}







