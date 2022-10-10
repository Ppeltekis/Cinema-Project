import java.util.Scanner;
public class Cinema
{
   	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		String[] Cities = new String[15];
		float sum;
		for (int i=0; i<15; i++){
			System.out.println("Give city name "+i);
			Cities[i] = console.nextLine();
		}
		float[][] Receipts = new float[15][48];
		for (int i=0; i<15; i++){
			for (int j=0; j<48; j++){
				System.out.println("Give receipts for city "+i+" and week "+j);
				Receipts[i][j] = console.nextFloat();
			}
		}
		float max=0;
		int max_i=0;
		for (int i=0; i<15; i++){
			sum=0;
			for (int j=0; j<48; j++){
				sum+=Receipts[i][j];
			}
			if (sum>max) {
				max = sum;
				max_i = i;
			}
			System.out.println(Cities[i]+": "+sum);
		}			
		System.out.println(Cities[max_i]+": "+max);
		
		sum=0;
		for (int i=0; i<15; i++){
			for (int j=12; j<16; j++){
				sum+=Receipts[i][j];
			}
		}
		System.out.println("April receipts: "+sum);
	}
}