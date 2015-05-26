package tb_java;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Inventaris extends RuangKelas {
	Scanner in = new Scanner(System.in);
	Analysis a = new Analysis();

	public void Insertdata() {
		System.out.println("Masukkan Identitas : (nama ruangan, lokasi ruangan, fakultas, Prodi)");
		setIdentitas(in.next(), in.next(), in.next(), in.next());

	}

	@Override
	public void KondisiKelas() {
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

	@Override
	public void JmlhKondisiPosisiSarana() {
		System.out.println("Masukkan jumlah steker diruangan : ");
		super.setJumlahstopkontak(in.nextInt());
		System.out.println("\n");
		System.out
				.println("Pilih kondisi steker yang ada di ruangan : \n1. baik \n 2. sebagian rusak \n 3. rusak semua \n4. tidak ada");
		super.setKondisistopkontak(in.nextInt());
		System.out.println("\n");
		System.out
				.println("Masukkan posisi steker : \n1.dipojok ruang&dekat dosen \n2. ditengah ruang ");
		super.setPosisistopkontak(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah kabel LCD : ");
		super.setKabelLCD(in.nextInt());
		System.out.println("\n");
		System.out
				.println("Pilih Kondisi Kabel LCD : \n1. berfungsi \n2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		super.setKondisikabelLCD(in.nextInt());
		System.out.println("\n");
		System.out
				.println("Dimana letak/posisi kabel LCD : \n1. dekat dosen \n2. dekat mahasiswa");
		super.setPosisikabelLCD(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah lampu diruangan : ");
		super.setJumlahlampu(in.nextInt());
		System.out.println("\n");
		System.out
				.println("Pilih Kondisi lampu diruangan : \n 1. berfungsi semua \n2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		super.setKondisilampu(in.nextInt());
		System.out.println("\n");
		System.out
				.println("Dimana letak/posisi lampu : \n 1.atap \n 2. dinding \n3. lampu meja ");
		super.setPosisilampu(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah kipas angin yang ada diruangan : ");
		super.setJumlahkipasangin(in.nextInt());
		System.out.println("\n");
		System.out
				.println("Pilih kondisi kipas angin : \n.1. baik semua \n2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		super.setKondisilampu(in.nextInt());
		System.out.println("\n");
		System.out
				.println("Dimana letak/posisi dari kipas angin : \n1. atap \n2. dinding \n3. kipas berdiri");
		super.setPosisikipasangin(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah AC dalam ruangan : ");
		super.setJumlahAC(in.nextInt());
		System.out.println("\n");
		System.out
				.println("Pilih Kondisi AC dalam ruangan : \n1. baik \n2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		super.setKondisiAC(in.nextInt());
		System.out.println("\n");
		System.out
				.println("Dimana letak/posisi dari AC diruangan : \n1. dibelakang \n2. samping \n3. depan");
		super.setPosisiAC(in.nextInt());
		System.out.println("\n");
		System.out
				.println("Pilih SSID yang di gunakan : \n1. UMM Hotspot \n2. Lab informatika ");
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
		System.out
				.println("Pilih kondisi CCTV diruangan : \n1. baik \n2. rusak sebagian \n3.rusak semua \n4. tidak ada");
		super.setKondisiCCTV(in.nextInt());
		System.out.println("\n");
		System.out
				.println("DImana letal/posisi dari CCTV diruangan : \n1. depan \n2. samping \n3. belakangan \n4. tidak ada");
		super.setPosisiCCTV(in.nextInt());
		System.out.println("\n");
	}

	@Override
	public void LingkunganRuangKelas() {
		System.out.println("Kondisi lantai diruangan : \n1. bersih \n2. kotor");
		super.setKondisilantai(in.nextInt());
		System.out.println("\n");
		System.out
				.println("Kondisi dinding diruangan : \n1. bersih \n2. kotor");
		super.setKondisidinding(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi Atap diruangan : \n1. bersih \n2. kotor");
		super.setKondisiatap(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi pintu diruangan : \n1. bersih \n2. kotor");
		super.setKondisipintu(in.nextInt());
		System.out.println("\n");
		System.out
				.println("Kondisi Jendela diruangan : \n1. bersih \n2. kotor");
		super.setKondisijendela(in.nextInt());
		System.out.println("\n");
	}

	@Override
	public void KebersihanRuangKelas() {
		System.out
				.println("Konisi sirkulasi udara : \n1. lancar \n2. tidak lancar");
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

	@Override
	public void KenyamananRuangKelas() {
		System.out.println("Kondisi Kebisingan : \n1. tidak bising \n2. bising");
		super.setKebisingan(in.nextInt());
		System.out.println("\n");
		System.out.println("kondisi bau ruangan : \n1. tidak bau \n2. bauk");
		super.setBau(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi Kebocoran ruangan : \n1. tidak bocor \n2. bocor");
		super.setKebocoran(in.nextInt());
		System.out.println("\n");
		System.out.println("Konsisi kerusakan ruangan : \n1. tidak rusak \n2. rusak");
		super.setKerusakan(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi Keausan Ruangan : \n1.tidak aus \n2. sudah aus");
		super.setKeausan(in.nextInt());
		System.out.println("\n");
	}

	@Override
	public void KeamananRuangKelas() {
		System.out.println("Kekokohan ruangan : \n1. kokoh \n2. tidak kokoh");
		super.setKekokohan(in.nextInt());
		System.out.println("\n");
		System.out.println("Kunci pintu ruangan : \n1. ada \n2. rusak \n3. tidak ada");
		super.setKuncipintu(in.nextInt());
		System.out.println("\n");
		System.out.println("Kunci jendela ruangan : \n1. ada \n2. rusak \n3. tidak ada");
		super.setKuncijendela(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi bahaya ruangan : \n1.aman \n2. tidak aman");
		super.setBahaya(in.nextInt());
		System.out.println("\n");
	}
	public void simpan(){
		
		try{
			FileOutputStream kls = new FileOutputStream("UjiCobaTB.txt");
			ObjectOutputStream os = new ObjectOutputStream(kls);
			//os.writeObject(ruang.getNamaruang());
			os.writeObject(getNamaruang());
			os.writeObject(getLokasiruang());
			os.writeObject(getFakultas());
			os.writeObject(getStudi());
			os.writeObject(getPanjang());
			os.writeObject(getLebar());
			os.writeObject(getJumlahkursi());
			os.writeObject(getJumlahpintu());
			os.writeObject(getJumlahjendela());
			os.writeObject(getJumlahstopkontak());
			os.writeObject(getKondisistopkontak());
			os.writeObject(getPosisistopkontak());
			os.writeObject(getKabelLCD());
			os.writeObject(getKondisikabelLCD());
			os.writeObject(getPosisikabelLCD());
			os.writeObject(getJumlahlampu());
			os.writeObject(getKondisilampu());
			os.writeObject(getPosisilampu());
			os.writeObject(getJumlahkipasangin());
			os.writeObject(getKondisikipasangin());
			os.writeObject(getPosisikipasangin());
			os.writeObject(getJumlahAC());
			os.writeObject(getKondisiAC());
			os.writeObject(getPosisiAC());
			os.writeObject(getSSID());
			os.writeObject(getBandwidth());
			os.writeObject(getJumlahCCTV());
			os.writeObject(getKondisiCCTV());
			os.writeObject(getPosisiCCTV());
			os.writeObject(getKondisilantai());
			os.writeObject(getKondisidinding());
			os.writeObject(getKondisiatap());
			os.writeObject(getKondisipintu());
			os.writeObject(getKondisijendela());
			os.writeObject(getSirkulasiudara());
			os.writeObject(getNilaipencahayaan());
			os.writeObject(getKelembapan());
			os.writeObject(getSuhu());
			os.writeObject(getKebisingan());
			os.writeObject(getBau());
			os.writeObject(getKebocoran());
			os.writeObject(getKerusakan());
			os.writeObject(getKeausan());
			os.writeObject(getKekokohan());
			os.writeObject(getKuncipintu());
			os.writeObject(getKuncijendela());
			os.writeObject(getBahaya());
			os.close();
			System.out.println("Sukses Menyimpan");
		}catch(Exception ex){
			
			ex.printStackTrace();
		}
	}
	
	public void tampil(){
	System.out.println("" + getNamaruang());
	System.out.println("" + getLokasiruang());
	System.out.println("" + getStudi());
	System.out.println("" + getPanjang());
	System.out.println("" + getLebar());
	// KondisiRKelas a = new KondisiRKelas();
	System.out.println(" Hasil = " + a.Hitungluas());
	System.out.println("" + a.BentukRuang());
	System.out.println("" + super.getJumlahkursi());
	System.out.println("luas rasio = " + a.rasio());
	System.out.println("" + super.getJumlahpintu());
	System.out.println("" + super.getJumlahjendela());
	System.out.println("" + a.AnalisaPintu());
	System.out.println("" + a.AnalisaJendela());
	System.out.println("" + super.getJumlahstopkontak());
	System.out.println("" + super.getKondisistopkontak());
	System.out.println("" + super.getPosisistopkontak());
	// JmlhKondisiPosisiSarana b = new JmlhKondisiPosisiSarana();
	System.out.println("" + a.AnalisaKelistrikan());
	System.out.println("" + super.getKabelLCD());
	System.out.println("" + super.getKondisikabelLCD());
	System.out.println("" + super.getPosisikabelLCD());
	System.out.println("" + a.AnalisisLCD());
	System.out.println("" + super.getJumlahlampu());
	System.out.println("" + super.getKondisilampu());
	System.out.println("" + super.getPosisilampu());
	System.out.println("" + a.AnalisisLampu());
	System.out.println("" + super.getJumlahkipasangin());
	System.out.println("" + super.getKondisikipasangin());
	System.out.println("" + super.getPosisikipasangin());
	System.out.println("" + a.AnalisisKipas());
	System.out.println("" + super.getJumlahAC());
	System.out.println("" + super.getKondisiAC());
	System.out.println("" + super.getPosisiAC());
	System.out.println("" + a.AnalisisAC());
	System.out.println("" + super.getSSID());
	System.out.println("" + super.getBandwidth());
	System.out.println("" + a.AnalisisInternet());
	System.out.println("" + super.getJumlahCCTV());
	System.out.println("" + super.getKondisiCCTV());
	System.out.println("" + super.getPosisiCCTV());
	System.out.println("" + a.AnalisisCCTV());
	System.out.println("" + super.getKondisilantai());
	System.out.println("" + super.getKondisidinding());
	System.out.println("" + super.getKondisiatap());
	System.out.println("" + super.getKondisipintu());
	System.out.println("" + super.getKondisijendela());
	// LingkunganRuangKelas c = new LingkunganRuangKelas();
	System.out.println("" + a.AnalisisKebersihan());
	System.out.println("" + super.getSirkulasiudara());
	// KebersihanRuangKelas d = new KebersihanRuangKelas();
	System.out.println("" + a.AnalisisPencahayaan());
	System.out.println("" + a.AnalisisKelembapan());
	System.out.println("" + a.AnalisisSuhu());
	// KenyamananRuangKelas e = new KenyamananRuangKelas();
	System.out.println("" + a.AnalisisKebisingan());
	System.out.println("" + super.getBau());
	System.out.println("" + a.AnalisisBau());
	System.out.println("" + super.getKebocoran());
	System.out.println("" + a.AnalisisKebocoran());
	System.out.println("" + super.getKerusakan());
	System.out.println("" + a.AnalisisKerusakan());
	System.out.println("" + super.getKeausan());
	System.out.println("" + a.AnalisisKeausan());
	System.out.println("" + super.getKekokohan());
	// KeamanaRuangKelas f = new KeamanaRuangKelas();
	System.out.println("" + a.AnalisisKekokohan());
	System.out.println("" + super.getKuncipintu());
	System.out.println("" + a.AnalisisKunciPintu());
	System.out.println("" + super.getKuncijendela());
	System.out.println("" + a.AnalisisKunciJendela());
	System.out.println("" + super.getBahaya());
	System.out.println("" + a.AnalisisKeamananRuang());
	a.KelayakanRuang();
	System.out.println("" + a.persentaseKesesuaian());
	}
}