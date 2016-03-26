package gaji;

import java.util.Scanner;

public class Gaji_Mingguan {
	
		Scanner sc = new Scanner(System.in);
		int nip, upj, jjk, gmk, lmb;
		int jkn = 40;
		int ujl = 3000;
		char gol;
		String nmk;
		
		void BACA(){
		
			System.out.print("NIP : ");
			nip = sc.nextInt();
			System.out.print("Nama Karyawan : ");
			nmk = sc.next();
			System.out.print("Golongan : ");
			gol = sc.next().charAt(0);
			System.out.print("Jumlah Jam Kerja : ");
			jjk = sc.nextInt();
		}
		
		void CEKGOL(){
			switch (gol) {
			case 'A' :
				upj = 4000;
				break;
			case 'B' :
				upj = 5000;
				break;
			case 'C' :
				upj = 6000;
				break;
			case 'D' :
				upj = 7500;
				break;
				
				default :
					System.out.println("Hanya Tersedia Golongan A-D");
				break;
			
			}	
		}
		
		
		int LEMBUR(){
			if(jjk <jkn) {
				gmk = jjk*upj;		
			} else {
				lmb  = jjk-40;
				gmk = (jkn*upj) + (lmb*ujl);
				
			}
			return gmk;
			
		}
		
		void GAJI(){
			System.out.println("Gaji Mingguan = "+LEMBUR());
		}
		
		void TAMPIL(){
			System.out.println("NIP = "+nip);
			System.out.println(("Nama = "+nmk));
			System.out.println("Gaji Mingguan = "+gmk);
			
		}
		
		public static void main(String[] args){
			Gaji_Mingguan GM = new Gaji_Mingguan();
			GM.BACA();
			GM.CEKGOL();
			GM.LEMBUR();
			GM.GAJI();
			System.out.println("DATA KESELURUHAN :");
			GM.TAMPIL();
			
		}
		
		
		
	}
	
	
	
	
	

