import java.util.Scanner;

public class Perpustakaan2 {
	public static void main(String[] args) {
		int[] jml_hal = new int[3];
		String[] judulskripsi = new String[3];
		Scanner input = new Scanner(System.in);
		try{
			judulskripsi[0]="Skripsi 1";
			jml_hal[0]=30;
			judulskripsi[1]="Skripsi 2";
			jml_hal[1]=40;
			judulskripsi[2]="Skripsi 3";
			jml_hal[2]=input.nextInt();
			//judulskripsi[3]="Skripsi 4";
		}
		catch(java.util.InputMismatchException a){
			System.out.println(a);
		}
		catch (ArrayIndexOutOfBoundsException b){
			System.out.println(b);
		}
		for(int i=0; i<3; i++){
			System.out.println(judulskripsi[i]+" "+jml_hal[i]);
		}
	}
}
