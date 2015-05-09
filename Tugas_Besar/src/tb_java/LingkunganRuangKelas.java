package tb_java;

import java.util.Scanner;

public class LingkunganRuangKelas extends RuangKelas{
	Scanner in = new Scanner(System.in);
	
	@Override
	public void lingkungan(){
		System.out.println("Kondisi lantai diruangan : \n1. bersih \n2. kotor");
		super.setKondisilantai(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi dinding diruangan : \n1. bersih \n2. kotor");
		super.setKondisidinding(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi Atap diruangan : \n1. bersih \n2. kotor");
		super.setKondisiatap(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi pintu diruangan : \n1. bersih \n2. kotor");
		super.setKondisipintu(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi Jendela diruangan : \n1. bersih \n2. kotor");
		super.setKondisijendela(in.nextInt());
		System.out.println("\n");
	}
	public String AnalisisKebersihan(){
		if(super.getKondisilantai()==1&&super.getKondisidinding()==1&&super.getKondisiatap()==1&&super.getKondisipintu()==1&&super.getKondisijendela()==1){
			return("Kebersihan Ruangan = sesuai");
		}else{
			return("Kebersihan Ruangan = tidak sesuai");
		}
	}
}
