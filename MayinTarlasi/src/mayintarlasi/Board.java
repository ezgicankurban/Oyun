package mayintarlasi;

import java.util.Random;
import java.util.Scanner;

public class Board {
	
	public static int[][] haritadoldur(int satir,int sutun){
		
		Random rnd=new Random();
		int[][] matris=new int[satir][sutun];
		int i=0;
		while(i<satir)
		{
			int j=0;
			while(j<sutun)
			{
				matris[i][j]=rnd.nextInt(2);//random degerler üretiyorum alabilacaği üst sınır 2.
				
				j=j+1;
			}
			i=i+1;
		}
		
		for(int k=0;k<satir;k++) {
			for(int l=0;l<sutun;l++) 
					System.out.print(matris[k][l]+ " ");
				System.out.println();
			
		}
		return matris;
	}
	
	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.println("Oyunun satır boyutunu giriniz:");
		int a=klavye.nextInt();
		System.out.println("Oyunun sütun boyutunu giriniz:");
		int b=klavye.nextInt();
		int[][] oyunmatrisi=haritadoldur(a,b);
		int puan=0;
		boolean kontrol=true;
		while(kontrol)
		{
			System.out.println("Seçtiğiniz konumun satır değerini girin");
			int x=klavye.nextInt();
			System.out.println("Seçtiğiniz konumun sütun değerini giriniz");
			int y=klavye.nextInt();
			if(oyunmatrisi[x][y]==1)
			{
				kontrol=false;
			}
			else
			{
				puan=puan+10;
				System.out.println("Hala hayattasın...Devam");
			}
		}
		System.out.println("Oyun bitti!Puanınız:"+puan);
	}
	

}
