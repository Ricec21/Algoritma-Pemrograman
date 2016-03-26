package gaji;

import java.util.Scanner;

public class Array_GajiMingguan {
	static Scanner sc = new Scanner(System.in);
	static int N = 3;
	static Gaji_Mingguan[] g = new Gaji_Mingguan[N];

	
	void BACAARR(){
		
		for(int i = 0; i< g.length; i++){
			Gaji_Mingguan gm = new Gaji_Mingguan();
			System.out.println("Input Data Pegawai");
			gm.BACA();
			g[i] = gm; 
			
		}
		
	}
	
	
	void TAMPILARR(){
		System.out.println("Data Karyawan berjumlah : "+ N);
		for ( int i = 0; i < N; i++){
			System.out.println("Karyawan ["+i+"] : ");
			g[i].CEKGOL();
			g[i].LEMBUR();
			g[i].TAMPIL();
		}
	}
	//SequenSearch
	void CARI(){
		int i, x;
		boolean cek = false;
		i = 0;
		System.out.print("Input NIP : ");
		x = sc.nextInt();
		while((i <g.length) && (!cek)) {
			if(g[i].nip==x){
				cek = true;
		}else{
			i = i+1;
		}
			
		}
		
	
	if (cek == true){
		System.out.println("Pegawai ada di index-"+i);
		g[i].CEKGOL();
		g[i].LEMBUR();
		g[i].TAMPIL();
		
	}else {
		System.out.println("Tidak Ketemu");
	}
	}
	
	public static void main(String[] args){
		Array_GajiMingguan ag = new Array_GajiMingguan();
		String ulang;
		boolean loop = true;
		ag.BACAARR();
		
		while(loop){
			ag.TAMPILARR();
			ag.CARI();
			
			System.out.println("Apakah ingin diulang?(Y/N)");
			ulang = sc.next();
			
			if(ulang.equalsIgnoreCase("Y")){
				loop = true;
			}else{
				loop = false;
				System.out.println("Terima Kasih");
			}
		}
		
		
	}
	

}
