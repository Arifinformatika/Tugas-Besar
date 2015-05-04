package tb_java;

import java.util.Scanner;

public class Inventaris {
	Scanner in = new Scanner(System.in);
	RuangKelas ruang = new RuangKelas();
	
	public void Insertdata(){
		System.out.println("Masukkan nama ruangan : ");
		ruang.setNamaruang(in.next());
		System.out.println("\n");
		System.out.println("Masukkan Lokasi Ruangan : ");
		ruang.setLokasiruang(in.next());
		System.out.println("\n");
		System.out.println("Masukka Program Studi anda : ");
		ruang.setStudi(in.next());
		System.out.println("\n");
		System.out.println("Masukkan nama Fakultas anda : ");
		ruang.setFakultas(in.next());
		System.out.println("\n");
		
	}
	public void kondisi(){
		System.out.println("Kondisi Ruang Kelas\n");
		System.out.println("Masukkan panjang ruangan : ");
		ruang.setPanjang(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan lebar ruangan : ");
		ruang.setLebar(in.nextInt());
		System.out.println("\n");
		System.out.println("masukan jumlah kursi : ");
		ruang.setJumlahkursi(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah pintu : ");
		ruang.setJumlahpintu(in.nextInt());
		System.out.println("\n");
		
	
	}
	public double Hitungluas(){
		return ruang.getPanjang()*ruang.getLebar();
	}
	public void BentukRuang(){
		if(ruang.getPanjang()==ruang.getLebar()){
			System.out.println("Bentuk Ruangan Persegi");
		}else{
			System.out.println("Bentuk Ruangan Persegi Panjang");
		}
	}
	
	public double rasio(){
		return Hitungluas()/ruang.getJumlahkursi();
	}
	
	public String AnalisaPintu(){
		if(ruang.getJumlahpintu()>=2){
			return "Jumlah Pintu = Sesuai";
		}else{
			return "Jumlah Pintu = tidak sesuai";
		}
	}
	public String AnalisaJendela(){
		if(ruang.getJumlahjendela()>=1){
			return "Jumlah Jendela = Sesuai";
		}else{
			return "Jumlah Jendela = Tidak Sesuai";
		}
	}
	
	public void JmlhkondisidanposisiSarana(){
		System.out.println("Masukkan jumlah steker diruangan : ");
		ruang.setJumlahstopkontak(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih kondisi steker yang ada di ruangan : \n1. baik \n 2. sebagian rusak \n 3. rusak semua \n4. tidak ada");
		ruang.setKondisistopkontak(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan posisi steker : \n1.dipojok ruang&dekat dosen \n2. ditengah ruang ");
		ruang.setPosisistopkontak(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah kabel LCD : ");
		ruang.setKabelLCD(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih Kondisi Kabel LCD : \n1. berfungsi \n2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		ruang.setKondisikabelLCD(in.nextInt());
		System.out.println("\n");
		System.out.println("Dimana letak/posisi kabel LCD : \n1. dekat dosen \n2. dekat mahasiswa");
		ruang.setPosisikabelLCD(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah lampu diruangan : ");
		ruang.setJumlahlampu(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih Kondisi lampu diruangan : \n 1. berfungsi semua \n2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		ruang.setKondisilampu(in.nextInt());
		System.out.println("\n");
		System.out.println("Dimana letak/posisi lampu : \n 1.atap \n 2. dinding \n3. lampu meja ");
		ruang.setPosisilampu(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah kipas angin yang ada diruangan : ");
		ruang.setJumlahkipasangin(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih kondisi kipas angin : \n.1. baik semua \n2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		ruang.setKondisilampu(in.nextInt());
		System.out.println("\n");
		System.out.println("Dimana letak/posisi dari kipas angin : \n1. atap \n2. dinding \n3. kipas berdiri");
		ruang.setPosisikipasangin(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah AC dalam ruangan : ");
		ruang.setJumlahAC(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih Kondisi AC dalam ruangan : \n1. baik \n2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		ruang.setKondisiAC(in.nextInt());
		System.out.println("\n");
		System.out.println("Dimana letak/posisi dari AC diruangan : \n1. dibelakang \n2. samping \n3. depan");
		ruang.setPosisiAC(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih SSID yang di gunakan : \n1. UMM Hotspot \n2. Lab informatika ");
		ruang.setSSID(in.nextInt());
		System.out.println("\n");
		System.out.println("Apaka anda bisa Login : \n1. Ya \n2. Tidak");
		ruang.setLogin(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah Bandwidth : ");
		ruang.setBandwidth(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah CCTV diruangan : ");
		ruang.setJumlahCCTV(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih kondisi CCTV diruangan : \n1. baik \n2. rusak sebagian \n3.rusak semua \n4. tidak ada");
		ruang.setKondisiCCTV(in.nextInt());
		System.out.println("\n");
		System.out.println("DImana letal/posisi dari CCTV diruangan : \n1. depan \n2. samping \n3. belakangan \n4. tidak ada");
		ruang.setPosisiCCTV(in.nextInt());
		System.out.println("\n");
	}
	public String AnalisaKelistrikan(){
		if(ruang.getJumlahstopkontak()>=4 && ruang.getKondisistopkontak()==1||ruang.getKondisistopkontak()==2&&ruang.getPosisistopkontak()==1||ruang.getPosisistopkontak()==2){
			return ("Jumlah StopKontak = Sesuai");
		}else{
			return ("Jumlah StopKontak = tidak sesuai");
		}
	}
	public String AnalisisLCD(){
		if(ruang.getKabelLCD()>=1&&ruang.getKondisikabelLCD()==1||ruang.getKondisikabelLCD()==2&&ruang.getPosisikabelLCD()==1)
			return "jumlah kabel LCD = sesuai";
		else
			return "jumlah kabel LCD = tidak sesuai";
	}
	public String AnalisisLampu(){
		if(ruang.getJumlahlampu()>=18&&ruang.getKondisilampu()==1&&ruang.getPosisilampu()==1){
			return ("Jumlah Lampu = Sesuai");
		}else{
			return ("Jumlah Lampu = tidak sesuai");
		}
	}
	public String AnalisisKipas(){
		if(ruang.getJumlahkipasangin()>=2&&ruang.getKondisikipasangin()==1&&ruang.getPosisikipasangin()==1){
			return ("Jumlah Kipas Angin = Sesuai");
		}else{
			return ("Jumlah Kipas Angin = tidak sesuai");
		}
	}
	public String AnalisisAC(){
		if(ruang.getJumlahAC()>=1&&ruang.getKondisiAC()==1&&ruang.getPosisiAC()==1||ruang.getPosisiAC()==2){
			return("Jumlah AC = Sesuai");
		}else{
			return("Jumlah AC = tidak sesuai");
		}
	}
	public String AnalisisInternet(){
		if(ruang.getSSID()==1&&ruang.getLogin()==1){
			return("SSID = Sesuai");
		}else{
			return("SSID = tidak sesuai");
		}
	}
	public String AnalisisCCTV(){
		if(ruang.getJumlahCCTV()==2&&ruang.getKondisiCCTV()==1&&ruang.getPosisiCCTV()==1||ruang.getPosisiCCTV()==3){
			return("Jumlah CCTV = Sesuai");
		}else{
			return("Jumlah CCTV = tidak sesuai");
		}
	}
	public void lingkungan(){
		System.out.println("Kondisi lantai diruangan : \n1. bersih \n2. kotor");
		ruang.setKondisilantai(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi dinding diruangan : \n1. bersih \n2. kotor");
		ruang.setKondisidinding(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi Atap diruangan : \n1. bersih \n2. kotor");
		ruang.setKondisiatap(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi pintu diruangan : \n1. bersih \n2. kotor");
		ruang.setKondisipintu(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi Jendela diruangan : \n1. bersih \n2. kotor");
		ruang.setKondisijendela(in.nextInt());
		System.out.println("\n");
	}
	public String AnalisisKebersihan(){
		if(ruang.getKondisilantai()==1&&ruang.getKondisidinding()==1&&ruang.getKondisiatap()==1&&ruang.getKondisipintu()==1&&ruang.getKondisijendela()==1){
			return("Kebersihan Ruangan = sesuai");
		}else{
			return("Kebersihan Ruangan = tidak sesuai");
		}
	}
	public void Kebersihan(){
		System.out.println("Konisi sirkulasi udara : \n1. lancar \n2. tidak lancar");
		ruang.setSirkulasiudara(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan nilai pencahayaan : ");
		ruang.setNilaipencahayaan(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan berapa kelembapan diruangan : ");
		ruang.setKelembapan(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan berapa suhu dalam ruangan : ");
		ruang.setSuhu(in.nextInt());
		System.out.println("\n");
	}
	public String AnalisisSirkulasiUdara(){
		if(ruang.getSirkulasiudara()==1)
			return("Sirkulasi Udara = sesuai");
		else
			return("Sirkulasi Udara = tidak sesuai");
		
	}
	public String AnalisisPencahayaan(){
		if(ruang.getNilaipencahayaan()>=250&&ruang.getNilaipencahayaan()<=350)
			return("Pencahayaan = sesuai");
		else
			return("Pencahayaan = tidak sesuai");
	}
	public String AnalisisKelembapan(){
		if(ruang.getKelembapan()>=70&&ruang.getKelembapan()<=80)
			return("Kelembapan = sesuai");
		else
			return("Kelembapan = tidak sesuai");
	}
	public String AnalisisSuhu(){
		if(ruang.getSuhu()>=25&&ruang.getSuhu()<=35)
			return("Suhu = sesuai");
		else
			return("Suhu = tidak sesuai");
	}
	public void Kenyamanan(){

		System.out.println("Kondisi Kebisingan : \n1. tidak bising \n2. bising");
		ruang.setKebisingan(in.nextInt());
		System.out.println("\n");
		System.out.println("kondisi bau ruangan : \n1. tidak bau \n2. bauk");
		ruang.setBau(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi Kebocoran ruangan : \n1. tidak bocor \n2. bocor");
		ruang.setKebocoran(in.nextInt());
		System.out.println("\n");
		System.out.println("Konsisi kerusakan ruangan : \n1. tidak rusak \n2. rusak");
		ruang.setKerusakan(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi Keausan Ruangan : \n1.tidak aus \n2. sudah aus");
		ruang.setKeausan(in.nextInt());
		System.out.println("\n");
	}
	public String AnalisisKebisingan(){
		if(ruang.getKebisingan()==1)
			return("Tingkat Kebisingan = Sesuai");
		else
			return("Tingkat Kebisingan = tidak sesuai");
	}
	public String AnalisisBau(){
		if(ruang.getBau()==1)
			return("Bau Ruangan = Sesuai");
		else
			return("Bau Ruangan = tidak sesuai");
	}
	public String AnalisisKebocoran(){
		if(ruang.getKebocoran()==1)
			return("Tingkat Kebocoran = Sesuai");
		else
			return("Tingkat Kebocoran = tidak sesuai");
	}
	public String AnalisisKerusakan(){
		if(ruang.getKerusakan()==1)
			return("Tingkat Kerusakan = Sesuai");
		else
			return("Tingkat Kerusakan = tidak sesuai");
	}
	public String AnalisisKeausan(){
		if(ruang.getKeausan()==1)
			return("Tingkat Keausan = Sesuai");
		else
			return("Tingkat Keausan = tidak sesuai");
	}
	public void Keamanan(){
		System.out.println("Kekokohan ruangan : \n1. kokoh \n2. tidak kokoh");
		ruang.setKekokohan(in.nextInt());
		System.out.println("\n");
		System.out.println("Kunci pintu ruangan : \n1. ada \n2. rusak \n3. tidak ada");
		ruang.setKuncipintu(in.nextInt());
		System.out.println("\n");
		System.out.println("Kunci jendela ruangan : \n1. ada \n2. rusak \n3. tidak ada");
		ruang.setKuncijendela(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi bahaya ruangan : \n1.aman \n2. tidak aman");
		ruang.setBahaya(in.nextInt());
		System.out.println("\n");
	}
	public String AnalisisKekokohan(){
		if(ruang.getKekokohan()==1)
			return("Tingkat Kekokohan = Sesuai");
		else
			return("Tingkat Kekokohan = tidak sesuai");
	}
	public String AnalisisKunciPintu(){
		if(ruang.getKuncipintu()==1)
			return("Kunci pintu = Sesuai");
		else
			return("Kunci pintu = tidak sesuai");
	}
	public String AnalisisKunciJendela(){
		if(ruang.getKuncijendela()==1)
			return("Kunci Jendela = Sesuai");
		else
			return("Kunci Jendela = tidak sesuai");
	}
	public String AnalisisKeamananRuang(){
		if(ruang.getBahaya()==1)
			return("Tingkat Keamanan Ruangan = Sesuai");
		else
			return("Tingkat Keamanan Ruangan = tidak sesuai");
	}
	public void ListInputan(){
		Inventaris baru = new Inventaris();
		System.out.println(""+ruang.getNamaruang());
		System.out.println(""+ruang.getLokasiruang());
		System.out.println(""+ruang.getStudi());
		System.out.println(""+ruang.getPanjang());
		System.out.println(""+ruang.getLebar());
		System.out.println(" Hasil = "+Hitungluas());
		baru.BentukRuang();
		System.out.println(""+ruang.getJumlahkursi());
		System.out.println("luas rasio = "+rasio());
		System.out.println(""+ruang.getJumlahpintu());
		System.out.println(""+ruang.getJumlahjendela());
		baru.AnalisaPintu();
		baru.AnalisaJendela();
		System.out.println(""+ruang.getJumlahstopkontak());
		System.out.println(""+ruang.getKondisistopkontak());
		System.out.println(""+ruang.getPosisistopkontak());
		baru.AnalisaKelistrikan();
		System.out.println(""+ruang.getKabelLCD());
		System.out.println(""+ruang.getKondisikabelLCD());
		System.out.println(""+ruang.getPosisikabelLCD());
		baru.AnalisisLCD();
		System.out.println(""+ruang.getJumlahlampu());
		System.out.println(""+ruang.getKondisilampu());
		System.out.println(""+ruang.getPosisilampu());
		baru.AnalisisLampu();
		System.out.println(""+ruang.getJumlahkipasangin());
		System.out.println(""+ruang.getKondisikipasangin());
		System.out.println(""+ruang.getPosisikipasangin());
		baru.AnalisisKipas();
		System.out.println(""+ruang.getJumlahAC());
		System.out.println(""+ruang.getKondisiAC());
		System.out.println(""+ruang.getPosisiAC());
		baru.AnalisisAC();
		System.out.println(""+ruang.getSSID());
		System.out.println(""+ruang.getBandwidth());
		baru.AnalisisInternet();
		System.out.println(""+ruang.getJumlahCCTV());
		System.out.println(""+ruang.getKondisiCCTV());
		System.out.println(""+ruang.getPosisiCCTV());
		baru.AnalisisCCTV();
		System.out.println(""+ruang.getKondisilantai());
		System.out.println(""+ruang.getKondisidinding());
		System.out.println(""+ruang.getKondisiatap());
		System.out.println(""+ruang.getKondisipintu());
		System.out.println(""+ruang.getKondisijendela());
		baru.AnalisisKebersihan();
		System.out.println(""+ruang.getSirkulasiudara());
		baru.AnalisisKebisingan();
		System.out.println(""+ruang.getBau());
		baru.AnalisisBau();
		System.out.println(""+ruang.getKebocoran());
		baru.AnalisisKebocoran();
		System.out.println(""+ruang.getKerusakan());
		baru.AnalisisKerusakan();
		System.out.println(""+ruang.getKeausan());
		baru.AnalisisKeausan();
		System.out.println(""+ruang.getKekokohan());
		baru.AnalisisKekokohan();
		System.out.println(""+ruang.getKuncipintu());
		baru.AnalisisKunciPintu();
		System.out.println(""+ruang.getKuncijendela());
		baru.AnalisisKunciJendela();
		System.out.println(""+ruang.getBahaya());
		AnalisisKeamananRuang();
	}
}
