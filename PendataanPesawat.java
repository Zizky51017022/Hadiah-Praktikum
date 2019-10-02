/**
 * @(#)Pendataan Pesawat.java
 *
 *
 * @author 
 * @version 1.00 2019/9/27
 */

import java.util.Scanner;
public class PendataanPesawat{

		public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		String NM,ALM;
		char Tipe;
		int Biaya;
		int Harga;
		int Kembalian;
		
			System.out.println("------|-------------------|----------------------|");
			System.out.println(" Kode |     Tipe Pesawat  |  Harga Tiket Pesawat |");
			System.out.println("------|-------------------|----------------------|");
			System.out.println("  1   |         A         |    Rp. 5.000.0000    |");
			System.out.println("  2	  |         B         |    Rp. 2.000.0000    |");
			System.out.println("  3   |         C         |    Rp. 1.000.0000    |");
			System.out.println("------|-------------------|----------------------|");
			
		
		System.out.print("Nama Pemesan: ");
		NM=in.nextLine();
		System.out.print("Alamat Pemesan: ");
		ALM=in.nextLine(); 
		System.out.print("Pilih Tipe Pesawat(A-C): ");
		Tipe=in.next().charAt(0);
		System.out.println();
		switch(Tipe)
		{
			case'A':
			{
				System.out.println("Anda Memilih Kode Pesawat: A ");
				System.out.println("Dengan Harga:Rp.5.000.000 ");
				Harga=5000000;
				System.out.print("Masukkan Pembayaran: Rp ");
		Biaya=in.nextInt();
		Kembalian=Biaya-Harga;
		System.out.println();
		System.out.println("Nama Penumpang: "+NM);
		System.out.println("Alamat   : "+ALM);
		System.out.println("Kembalian: Rp "+Kembalian);
				break;
			}
			case'B':
			{
				System.out.println("Anda Memilih Kode Pesawat: B");
				System.out.println("Dengan Harga:Rp.2.000.000 ");
				Harga=2000000;
				System.out.print("Masukkan Pembayaran: Rp ");
		Biaya=in.nextInt();
		Kembalian=Biaya-Harga;
		System.out.println();
		System.out.println("Nama Penumpang :"+NM);
		System.out.println("Alamat   : "+ALM);
		System.out.println("Kembalian: Rp "+Kembalian);
				break;
			}
			case 'C': 
			{
				System.out.println("Anda Memilih Pesawat: C");
				System.out.println("Dengan Harga:Rp.1.000.000 ");
				Harga=1000000;
				System.out.print("Masukkan Pembayaran: Rp ");
		Biaya=in.nextInt();
		Kembalian=Biaya-Harga;
		System.out.println();
		System.out.println("Nama Penumpang     : "+NM);
		System.out.println("Alamat   : "+ALM);
		System.out.println("Kembalian: Rp "+Kembalian);
				break;
			}
			
		}
	}	
}		