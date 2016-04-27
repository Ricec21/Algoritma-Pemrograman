package matriks;

import java.util.Scanner;

public class OperasiMatriks {
	static Scanner sc = new Scanner(System.in);
	
	static	Matrixint PenjumlahanMatrix(Matrixint M1, Matrixint M2){
		 Matrixint M3 = new Matrixint();
		 int x;
		 M3.SetNBaris(M1.getBaris());
		 M3.SetMKolom(M2.getKolom());
		 for(int i=0; i <M1.getBaris();i++){
				for(int j = 0; j <M1.getKolom();j++){
					x = M1.getElemen(i, j)+ M2.getElemen(i, j);
					M3.SetElemen(i, j, x);
					
			}
		}
		 return M3;
	 }
	
	static Matrixint Perkalianmatrix(Matrixint M1, Matrixint M2) {
		Matrixint M3 = new Matrixint();
		int x = 0;
		M3.SetNBaris(M1.getBaris());
		M3.SetMKolom(M2.getKolom());
		int w=0,y=0,z=0;
		for(int i = 0; i <M1.getBaris(); i++){
			for(int j = 0; j <M2.getKolom(); j++){
				M3.SetElemen(i, j, x);
				for(int k = 0; k < M1.getKolom(); k++){
					w= M3.getElemen(i, j);
					y= M1.getElemen(i, j);
					z= M2.getElemen(i, j);
					x = M3.getElemen(i, j) + M1.getElemen(i, j) + M2.getElemen(i, j);
					M3.SetElemen(i, j, x);
				}
				
			}
			
		}
		return M3;
	}

	public static void main(String[] args){
		Matrixint A = new Matrixint();
		Matrixint B = new Matrixint();
		Matrixint C = new Matrixint();
		
		
		System.out.println("Matriks A");
		A.InitMatrix();
		A.ReadMatrix();
		// A.SegitigaAtas();
		A.ShowMatrix();
		
		System.out.println("Matriks B");
		B.InitMatrix();
		B.ReadMatrix();
		// B.SegitigaAtas();
		B.ShowMatrix();
		
		System.out.println();
		System.out.println("Hasil Penjumlahan Matriks");
		C = PenjumlahanMatrix(A, B);
		C.ShowMatrix();
		
		System.out.println("Hasil Perkalian");
		C = Perkalianmatrix(A, B);
		C.ShowMatrix();
	
		
//		C.InitMatrix();
//		if((A.getBaris())==B.getBaris() && (A.getKolom()==B.getKolom())){
//			C= PenjumlahanMatrix(A, B);
//			System.out.println("Hasil Penjumlahan");
//			C.ShowMatrix();
//		}
	}
	
	
	
	
}
