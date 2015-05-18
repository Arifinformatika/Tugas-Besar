package tb_java;

public class Tampil extends Analysis {

	public void ListInputan() {
		Analysis r = new Analysis();

		System.out.println("" + getNamaruang());
		System.out.println("" + getLokasiruang());
		System.out.println("" + getStudi());
		System.out.println("" + super.getPanjang());
		System.out.println("" + super.getLebar());
		// KondisiRKelas a = new KondisiRKelas();
		System.out.println(" Hasil = " + r.Hitungluas());
		System.out.println("" + r.BentukRuang());
		System.out.println("" + super.getJumlahkursi());
		System.out.println("luas rasio = " + r.rasio());
		System.out.println("" + super.getJumlahpintu());
		System.out.println("" + super.getJumlahjendela());
		System.out.println("" + r.AnalisaPintu());
		System.out.println("" + r.AnalisaJendela());
		System.out.println("" + super.getJumlahstopkontak());
		System.out.println("" + super.getKondisistopkontak());
		System.out.println("" + super.getPosisistopkontak());
		// JmlhKondisiPosisiSarana b = new JmlhKondisiPosisiSarana();
		System.out.println("" + r.AnalisaKelistrikan());
		System.out.println("" + super.getKabelLCD());
		System.out.println("" + super.getKondisikabelLCD());
		System.out.println("" + super.getPosisikabelLCD());
		System.out.println("" + r.AnalisisLCD());
		System.out.println("" + super.getJumlahlampu());
		System.out.println("" + super.getKondisilampu());
		System.out.println("" + super.getPosisilampu());
		System.out.println("" + r.AnalisisLampu());
		System.out.println("" + super.getJumlahkipasangin());
		System.out.println("" + super.getKondisikipasangin());
		System.out.println("" + super.getPosisikipasangin());
		System.out.println("" + r.AnalisisKipas());
		System.out.println("" + super.getJumlahAC());
		System.out.println("" + super.getKondisiAC());
		System.out.println("" + super.getPosisiAC());
		System.out.println("" + r.AnalisisAC());
		System.out.println("" + super.getSSID());
		System.out.println("" + super.getBandwidth());
		System.out.println("" + r.AnalisisInternet());
		System.out.println("" + super.getJumlahCCTV());
		System.out.println("" + super.getKondisiCCTV());
		System.out.println("" + super.getPosisiCCTV());
		System.out.println("" + r.AnalisisCCTV());
		System.out.println("" + super.getKondisilantai());
		System.out.println("" + super.getKondisidinding());
		System.out.println("" + super.getKondisiatap());
		System.out.println("" + super.getKondisipintu());
		System.out.println("" + super.getKondisijendela());
		// LingkunganRuangKelas c = new LingkunganRuangKelas();
		System.out.println("" + r.AnalisisKebersihan());
		System.out.println("" + super.getSirkulasiudara());
		// KebersihanRuangKelas d = new KebersihanRuangKelas();
		System.out.println("" + r.AnalisisPencahayaan());
		System.out.println("" + r.AnalisisKelembapan());
		System.out.println("" + r.AnalisisSuhu());
		// KenyamananRuangKelas e = new KenyamananRuangKelas();
		System.out.println("" + r.AnalisisKebisingan());
		System.out.println("" + super.getBau());
		System.out.println("" + r.AnalisisBau());
		System.out.println("" + super.getKebocoran());
		System.out.println("" + r.AnalisisKebocoran());
		System.out.println("" + super.getKerusakan());
		System.out.println("" + r.AnalisisKerusakan());
		System.out.println("" + super.getKeausan());
		System.out.println("" + r.AnalisisKeausan());
		System.out.println("" + super.getKekokohan());
		// KeamanaRuangKelas f = new KeamanaRuangKelas();
		System.out.println("" + r.AnalisisKekokohan());
		System.out.println("" + super.getKuncipintu());
		System.out.println("" + r.AnalisisKunciPintu());
		System.out.println("" + super.getKuncijendela());
		System.out.println("" + r.AnalisisKunciJendela());
		System.out.println("" + super.getBahaya());
		System.out.println("" + r.AnalisisKeamananRuang());
		r.KelayakanRuang();
		System.out.println("" + r.persentaseKesesuaian());

	}
}
