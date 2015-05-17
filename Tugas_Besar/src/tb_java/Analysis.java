package tb_java;

public class Analysis extends Inventaris implements Kesesuaian{
	int sesuai=0;
	
	
	//kondisi kelas
	public double Hitungluas(){
		return super.getPanjang()*super.getLebar();
		
	}
	public String BentukRuang(){
		if(super.getPanjang()==super.getLebar()){
			return("tidak sesuai = Bentuk Ruangan Persegi");
		}
		else
			sesuai++;
			return("sesuai = Bentuk Ruangan Persegi Panjang");
		
	}
	
	public double rasio(){
		return Hitungluas()/super.getJumlahkursi();
	}
	
	public String rasiokelas(){
		if(rasio()>=0.5){
			sesuai++;
			return "rasio sesuai";
		}else{
			
			return "rasio tidak sesuai";
		}
	}
	
	public String AnalisaPintu(){
		if(super.getJumlahpintu()>=2){
			sesuai++;
			return "Jumlah Pintu = Sesuai";
		}else{
			return "Jumlah Pintu = tidak sesuai";
		}
	}
	public String AnalisaJendela(){
		if(super.getJumlahjendela()>=1){
			sesuai++;
			return "Jumlah Jendela = Sesuai";
		}else{
			return "Jumlah Jendela = Tidak Sesuai";
		}
	}

	//jumlah kondisi dan posisi sarana
	public String AnalisaKelistrikan(){
		if(super.getJumlahstopkontak()>=4 && super.getKondisistopkontak()==1||super.getKondisistopkontak()==2&&super.getPosisistopkontak()==1||super.getPosisistopkontak()==2){
			sesuai++;
			return ("Jumlah StopKontak = Sesuai");
		}else{
			return ("Jumlah StopKontak = tidak sesuai");
		}
	}
	public String AnalisisLCD(){
		if(super.getKabelLCD()>=1&&super.getKondisikabelLCD()==1||super.getKondisikabelLCD()==2&&super.getPosisikabelLCD()==1){
			sesuai++;
			return "jumlah kabel LCD = sesuai";
	}else
			return "jumlah kabel LCD = tidak sesuai";
	}
	public String AnalisisLampu(){
		if(super.getJumlahlampu()>=18&&super.getKondisilampu()==1&&super.getPosisilampu()==1){
			sesuai++;
			return ("Jumlah Lampu = Sesuai");
		}else{
			return ("Jumlah Lampu = tidak sesuai");
		}
	}
	public String AnalisisKipas(){
		if(super.getJumlahkipasangin()>=2&&super.getKondisikipasangin()==1&&super.getPosisikipasangin()==1){
			sesuai++;
			return ("Jumlah Kipas Angin = Sesuai");
		}else{
			return ("Jumlah Kipas Angin = tidak sesuai");
		}
	}
	public String AnalisisAC(){
		if(super.getJumlahAC()>=1&&super.getKondisiAC()==1&&super.getPosisiAC()==1||super.getPosisiAC()==2){
			sesuai++;
			return("Jumlah AC = Sesuai");
		}else{
			return("Jumlah AC = tidak sesuai");
		}
	}
	public String AnalisisInternet(){
		if(super.getSSID()==1&&super.getLogin()==1){
			sesuai++;
			return("SSID = Sesuai");
		}else{
			return("SSID = tidak sesuai");
		}
	}
	public String AnalisisCCTV(){
		if(super.getJumlahCCTV()==2&&super.getKondisiCCTV()==1&&super.getPosisiCCTV()==1||super.getPosisiCCTV()==3){
			sesuai++;
			return("Jumlah CCTV = Sesuai");
		}else{
			return("Jumlah CCTV = tidak sesuai");
		}
	}
	
	//lingkungan
	public String AnalisisKebersihan(){
		if(super.getKondisilantai()==1&&super.getKondisidinding()==1&&super.getKondisiatap()==1&&super.getKondisipintu()==1&&super.getKondisijendela()==1){
			sesuai++;
			return("Kebersihan Ruangan = sesuai");
		}else{
			return("Kebersihan Ruangan = tidak sesuai");
		}
	}
	
	//kebersihan

	public String AnalisisSirkulasiUdara(){
		if(super.getSirkulasiudara()==1){
			sesuai++;
			return("Sirkulasi Udara = sesuai");
		}else{
			return("Sirkulasi Udara = tidak sesuai");
		}
	}
	public String AnalisisPencahayaan(){
		if(super.getNilaipencahayaan()>=250&&super.getNilaipencahayaan()<=350){
			sesuai++;
			return("Pencahayaan = sesuai");
		}else{
			return("Pencahayaan = tidak sesuai");
		}
	}
	public String AnalisisKelembapan(){
		if(super.getKelembapan()>=70&&super.getKelembapan()<=80){
			sesuai++;
			return("Kelembapan = sesuai");
		}else{
			return("Kelembapan = tidak sesuai");
		}
	}
	public String AnalisisSuhu(){
		if(super.getSuhu()>=25&&super.getSuhu()<=35){
			sesuai++;
			return("Suhu = sesuai");
		}else{
			return("Suhu = tidak sesuai");
		}
	}
	
	//kenyamanan
	public String AnalisisKebisingan(){
		if(super.getKebisingan()==1){
			sesuai++;
			return("Tingkat Kebisingan = Sesuai");
		}else{
			return("Tingkat Kebisingan = tidak sesuai");
		}
	}
	public String AnalisisBau(){
		if(super.getBau()==1){
			sesuai++;
			return("Bau Ruangan = Sesuai");
		}else{
			return("Bau Ruangan = tidak sesuai");
		}
	}
	public String AnalisisKebocoran(){
		if(super.getKebocoran()==1){
			sesuai++;
			return("Tingkat Kebocoran = Sesuai");
		}else{
			return("Tingkat Kebocoran = tidak sesuai");
		}
	}
	public String AnalisisKerusakan(){
		if(super.getKerusakan()==1){
			sesuai++;
			return("Tingkat Kerusakan = Sesuai");
		}else{
			return("Tingkat Kerusakan = tidak sesuai");
	}
	}
	public String AnalisisKeausan(){
		if(super.getKeausan()==1){
			sesuai++;
			return("Tingkat Keausan = Sesuai");
		}else{
			return("Tingkat Keausan = tidak sesuai");
		}
	}
	
	//keamnan
	public String AnalisisKekokohan(){
		if(super.getKekokohan()==1){
			sesuai++;
			return("Tingkat Kekokohan = Sesuai");
		}else{
			return("Tingkat Kekokohan = tidak sesuai");
		}
	}
	public String AnalisisKunciPintu(){
		if(super.getKuncipintu()==1){
			sesuai++;
			return("Kunci pintu = Sesuai");
		}else{
			return("Kunci pintu = tidak sesuai");
		}
	}
	public String AnalisisKunciJendela(){
		if(super.getKuncijendela()==1){
			sesuai++;
			return("Kunci Jendela = Sesuai");
		}else{
			return("Kunci Jendela = tidak sesuai");
		}
	}
	public String AnalisisKeamananRuang(){
		if(super.getBahaya()==1){
			sesuai++;
			return("Tingkat Keamanan Ruangan = Sesuai");
		}else{
			return("Tingkat Keamanan Ruangan = tidak sesuai");
		}
	}
	
}
