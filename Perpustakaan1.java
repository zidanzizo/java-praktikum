import java.util.Scanner;
public class Perpustakaan1 {

	public static void main(String[] args) {
		String[] judulbuku = new String[3];
		Scanner input = new Scanner (System.in);
		try{
			for(int i=0; i>=0; i++){
				System.out.println("Masukkan Judul Buku");
				judulbuku[i]=input.next();
				System.out.println(judulbuku[i]+" Tersimpan");
			}
		}
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println(a);
		}
		
		System.out.println("Judul Buku yang tersimpan :");
		for(int i=0; i<judulbuku.length; i++){
			System.out.println(judulbuku[i]);
		}

	}

}
