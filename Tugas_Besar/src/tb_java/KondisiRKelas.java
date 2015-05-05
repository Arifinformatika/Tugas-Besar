package tb_java;

import java.util.Scanner;

public class KondisiRKelas extends RuangKelas{
	Scanner in = new Scanner(System.in);
	
	public void kondisi(){
		System.out.println("Kondisi Ruang Kelas\n");
		System.out.println("Masukkan panjang ruangan : ");
		super.setPanjang(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan lebar ruangan : ");
		super.setLebar(in.nextInt());
		System.out.println("\n");
		System.out.println("masukan jumlah kursi : ");
		super.setJumlahkursi(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah pintu : ");
		super.setJumlahpintu(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah jendela : ");
		super.setJumlahjendela(in.nextInt());
		System.out.println("\n");
	}
	public double Hitungluas(){
		return super.getPanjang()*super.getLebar();
		
	}
	public String BentukRuang(){
		if(super.getPanjang()==super.getLebar())
			return("Bentuk Ruangan Persegi");
		else
			return("Bentuk Ruangan Persegi Panjang");
		
	}
	
	public double rasio(){
		return Hitungluas()/super.getJumlahkursi();
	}
	
	public String AnalisaPintu(){
		if(super.getJumlahpintu()>=2){
			return "Jumlah Pintu = Sesuai";
		}else{
			return "Jumlah Pintu = tidak sesuai";
		}
	}
	public String AnalisaJendela(){
		if(super.getJumlahjendela()>=1){
			return "Jumlah Jendela = Sesuai";
		}else{
			return "Jumlah Jendela = Tidak Sesuai";
		}
	}

}
