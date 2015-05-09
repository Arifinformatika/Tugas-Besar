package tb_java;

import java.util.Scanner;

public class JmlhKondisiPosisiSarana extends RuangKelas {
	Scanner in = new Scanner(System.in);
	
	@Override
	public void JmlhkondisidanposisiSarana(){
		System.out.println("Masukkan jumlah steker diruangan : ");
		super.setJumlahstopkontak(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih kondisi steker yang ada di ruangan : \n1. baik \n 2. sebagian rusak \n 3. rusak semua \n4. tidak ada");
		super.setKondisistopkontak(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan posisi steker : \n1.dipojok ruang&dekat dosen \n2. ditengah ruang ");
		super.setPosisistopkontak(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah kabel LCD : ");
		super.setKabelLCD(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih Kondisi Kabel LCD : \n1. berfungsi \n2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		super.setKondisikabelLCD(in.nextInt());
		System.out.println("\n");
		System.out.println("Dimana letak/posisi kabel LCD : \n1. dekat dosen \n2. dekat mahasiswa");
		super.setPosisikabelLCD(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah lampu diruangan : ");
		super.setJumlahlampu(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih Kondisi lampu diruangan : \n 1. berfungsi semua \n2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		super.setKondisilampu(in.nextInt());
		System.out.println("\n");
		System.out.println("Dimana letak/posisi lampu : \n 1.atap \n 2. dinding \n3. lampu meja ");
		super.setPosisilampu(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah kipas angin yang ada diruangan : ");
		super.setJumlahkipasangin(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih kondisi kipas angin : \n.1. baik semua \n2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		super.setKondisilampu(in.nextInt());
		System.out.println("\n");
		System.out.println("Dimana letak/posisi dari kipas angin : \n1. atap \n2. dinding \n3. kipas berdiri");
		super.setPosisikipasangin(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah AC dalam ruangan : ");
		super.setJumlahAC(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih Kondisi AC dalam ruangan : \n1. baik \n2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		super.setKondisiAC(in.nextInt());
		System.out.println("\n");
		System.out.println("Dimana letak/posisi dari AC diruangan : \n1. dibelakang \n2. samping \n3. depan");
		super.setPosisiAC(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih SSID yang di gunakan : \n1. UMM Hotspot \n2. Lab informatika ");
		super.setSSID(in.nextInt());
		System.out.println("\n");
		System.out.println("Apaka anda bisa Login : \n1. Ya \n2. Tidak");
		super.setLogin(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah Bandwidth : ");
		super.setBandwidth(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah CCTV diruangan : ");
		super.setJumlahCCTV(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih kondisi CCTV diruangan : \n1. baik \n2. rusak sebagian \n3.rusak semua \n4. tidak ada");
		super.setKondisiCCTV(in.nextInt());
		System.out.println("\n");
		System.out.println("DImana letal/posisi dari CCTV diruangan : \n1. depan \n2. samping \n3. belakangan \n4. tidak ada");
		super.setPosisiCCTV(in.nextInt());
		System.out.println("\n");
	}
	public String AnalisaKelistrikan(){
		if(super.getJumlahstopkontak()>=4 && super.getKondisistopkontak()==1||super.getKondisistopkontak()==2&&super.getPosisistopkontak()==1||super.getPosisistopkontak()==2){
			return ("Jumlah StopKontak = Sesuai");
		}else{
			return ("Jumlah StopKontak = tidak sesuai");
		}
	}
	public String AnalisisLCD(){
		if(super.getKabelLCD()>=1&&super.getKondisikabelLCD()==1||super.getKondisikabelLCD()==2&&super.getPosisikabelLCD()==1)
			return "jumlah kabel LCD = sesuai";
		else
			return "jumlah kabel LCD = tidak sesuai";
	}
	public String AnalisisLampu(){
		if(super.getJumlahlampu()>=18&&super.getKondisilampu()==1&&super.getPosisilampu()==1){
			return ("Jumlah Lampu = Sesuai");
		}else{
			return ("Jumlah Lampu = tidak sesuai");
		}
	}
	public String AnalisisKipas(){
		if(super.getJumlahkipasangin()>=2&&super.getKondisikipasangin()==1&&super.getPosisikipasangin()==1){
			return ("Jumlah Kipas Angin = Sesuai");
		}else{
			return ("Jumlah Kipas Angin = tidak sesuai");
		}
	}
	public String AnalisisAC(){
		if(super.getJumlahAC()>=1&&super.getKondisiAC()==1&&super.getPosisiAC()==1||super.getPosisiAC()==2){
			return("Jumlah AC = Sesuai");
		}else{
			return("Jumlah AC = tidak sesuai");
		}
	}
	public String AnalisisInternet(){
		if(super.getSSID()==1&&super.getLogin()==1){
			return("SSID = Sesuai");
		}else{
			return("SSID = tidak sesuai");
		}
	}
	public String AnalisisCCTV(){
		if(super.getJumlahCCTV()==2&&super.getKondisiCCTV()==1&&super.getPosisiCCTV()==1||super.getPosisiCCTV()==3){
			return("Jumlah CCTV = Sesuai");
		}else{
			return("Jumlah CCTV = tidak sesuai");
		}
	}
}
