package matriks;

import java.util.Scanner;

public class Matrixint {
	static Scanner sc = new Scanner(System.in);
	int N =10;   // N = Baris
	int M = 10;  // M = Kolom
	int NBaris=10, MKolom = 10;
	int [][] a = new int[N][M];

	
	void InitMatrix(){
		for (int i = 0; i < N; i++){
			for(int j=0; j <M; j++){
				a[i][j] = 0;
			}
		}
	}
	
	
	
	void ReadMatrix(){
		System.out.print("Jumlah Baris : ");
		NBaris = sc.nextInt();
		System.out.print("Jumlah Kolom : ");
		MKolom = sc.nextInt();
		for(int i = 0; i < NBaris;i++){
			for(int j = 0; j< MKolom; j++){
				System.out.print("input element Matrix ["+i+"]"+"["+j+"] : ");
				a[i][j] = sc.nextInt();
				
			}
		}
	}
	
//	void ReadMatrix2(){
//		Scanner sc = new Scanner(System.in);
//		for(int i = 0; i < NBaris;i++){
//			for(int j = 0; j< MKolom; j++){
//				System.out.print("input element Matrix B ["+i+"]"+"["+j+"] : ");
//				a[i][j] = sc.nextInt();
//				
//			}
//		}
//	}
//	
	void ShowMatrix(){
		for (int i = 0; i < NBaris; i++){
			for (int j = 0; j < MKolom; j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}
	}
	
	
	void SegitigaAtas(){
		for (int i = 0; i < NBaris; i++){
			for (int j = 0; j < MKolom; j++){
				if(i > j){
					a[i][j] = 0;
				}
			}
			System.out.println("");
		}
	}
	
  
 
 int getElemen(int i, int j){
	 return a[i][j];
 }
 
 void SetElemen(int i, int j, int x){
	 a[i][j] =x;
 }
 
 int getBaris(){  // yang terisi
	 return NBaris;
 }
 
 int getKolom(){ // yang terisi
	 return MKolom;
 }
 
 void SetNBaris(int x){
	 NBaris = x;
 }
 
 void SetMKolom(int x){
	 MKolom = x;
 }
	

	
}
