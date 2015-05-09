package tb_java;

import java.util.Scanner;

public class KebersihanRuangKelas extends RuangKelas{
	Scanner in = new Scanner(System.in);
	
	@Override
	public void Kebersihan(){
		System.out.println("Konisi sirkulasi udara : \n1. lancar \n2. tidak lancar");
		super.setSirkulasiudara(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan nilai pencahayaan : ");
		super.setNilaipencahayaan(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan berapa kelembapan diruangan : ");
		super.setKelembapan(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan berapa suhu dalam ruangan : ");
		super.setSuhu(in.nextInt());
		System.out.println("\n");
	}
	public String AnalisisSirkulasiUdara(){
		if(super.getSirkulasiudara()==1)
			return("Sirkulasi Udara = sesuai");
		else
			return("Sirkulasi Udara = tidak sesuai");
		
	}
	public String AnalisisPencahayaan(){
		if(super.getNilaipencahayaan()>=250&&super.getNilaipencahayaan()<=350)
			return("Pencahayaan = sesuai");
		else
			return("Pencahayaan = tidak sesuai");
	}
	public String AnalisisKelembapan(){
		if(super.getKelembapan()>=70&&super.getKelembapan()<=80)
			return("Kelembapan = sesuai");
		else
			return("Kelembapan = tidak sesuai");
	}
	public String AnalisisSuhu(){
		if(super.getSuhu()>=25&&super.getSuhu()<=35)
			return("Suhu = sesuai");
		else
			return("Suhu = tidak sesuai");
	}
}
