/**
 * @(#)PenerbanganBuffer.java
 *
 *
 * @author 
 * @version 1.00 2019/10/2
 */

import java.io.*;
public class PenerbanganBuffer {
   	public static void main (String[] args) throws IOException{
	
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(Input);
		
		String Nama,Alamat;
		int Kode,Bayar,Harga;
		double Kembalian;
		
		System.out.println("|----|----------------|--------------------|");
		System.out.println("|Kode|  Tipe Pesawat  | Harga Tipe Pesawat |");
		System.out.println("|----|----------------|--------------------|");
		System.out.println("| 1  | 	      A	      |	   Rp. 5.000.000   |");
		System.out.println("| 2  | 	      B	      |	   Rp. 2.000.000   |");
		System.out.println("| 3  | 	      C	      |	   Rp. 1.000.000   |");
		System.out.println("|----|----------------|--------------------|");
	
		System.out.println();
		System.out.println("Inputan Buffered Reader");
		System.out.print("Nama          : ");
		Nama=br.readLine();
		System.out.print("Alamat        : ");
		Alamat=br.readLine();
		System.out.println();
		
	
		System.out.print("Kode : ");
		Kode=Integer.parseInt(br.readLine());
		System.out.println();
		

			if(Kode==1)
			{
				System.out.println("A");
				System.out.println();
				System.out.println("Harga : 5000000");
				Kode=5000000;
	
			
			}	
			else if(Kode==2){
				System.out.println("B");
				System.out.println();
				System.out.println("Harga : 2000000");
				Kode=2000000;
	
			}
			else if (Kode==3){
				System.out.println("C");
				System.out.println();
				System.out.println("Harga : 1000000");
				Kode=1000000;
			}
			else{
			System.out.println("Maaf Anda Salah Memasukkan Tipe Pesawat");
			}
			
			System.out.print("Bayar: ");
			bayar=Integer.parseInt(br.readLine());
			Kembalian=Bayar-Kode;
			System.out.println("Kembalian: "+Kembalian);
				
		}	
	}