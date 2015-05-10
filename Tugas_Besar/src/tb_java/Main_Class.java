package tb_java;

public class Main_Class {

	public static void main(String[] args) {
		Inventaris[] a = new Inventaris[1];
		JmlhKondisiPosisiSarana [] b = new JmlhKondisiPosisiSarana[1];
		KeamanaRuangKelas [] c = new KeamanaRuangKelas[1];
		KebersihanRuangKelas[] d = new KebersihanRuangKelas[1];
		KenyamananRuangKelas [] e = new KenyamananRuangKelas[1];
		KondisiRKelas [] f = new KondisiRKelas[1];
		LingkunganRuangKelas [] g = new LingkunganRuangKelas[1];
		Tampil apa = new Tampil();
		
		for (int i = 0; i < a.length; i++) {
			a[i] = new Inventaris();
			a[i].Insertdata();
		}
		/*for (int i = 0; i < f.length; i++){
			f[i] = new KondisiRKelas();
			f[i].kondisi();
			f[i].Hitungluas();
			f[i].BentukRuang();
			f[i].rasio();
			f[i].AnalisaJendela();
			f[i].AnalisaPintu();
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = new JmlhKondisiPosisiSarana();
			b[i].JmlhkondisidanposisiSarana();
			b[i].AnalisaKelistrikan();
			b[i].AnalisisLCD();
			b[i].AnalisisLampu();
			b[i].AnalisisKipas();
			b[i].AnalisisAC();
			b[i].AnalisisInternet();
			b[i].AnalisisCCTV();
		}
		for (int i = 0; i < g.length; i++){
			g[i] = new LingkunganRuangKelas();
			g[i].lingkungan();
			g[i].AnalisisKebersihan();
		}
		for (int i = 0; i < d.length; i++){
			d[i] = new KebersihanRuangKelas();
			d[i]. Kebersihan();
			d[i]. AnalisisSirkulasiUdara();
			d[i]. AnalisisKelembapan();
			d[i]. AnalisisPencahayaan();
			d[i].AnalisisSirkulasiUdara();
			d[i].AnalisisSuhu();
		}
		for (int i = 0; i < e.length; i++){
			e[i] = new KenyamananRuangKelas();
			e[i].Kenyamanan();
			e[i].AnalisisKebisingan();
			e[i].AnalisisBau();
			e[i].AnalisisKebocoran();
			e[i].AnalisisKerusakan();
			e[i].AnalisisKeausan();
		}
		for (int i = 0; i < c.length; i++) {
			c[i] = new KeamanaRuangKelas();
			c[i].Keamanan();
			c[i].AnalisisKekokohan();
			c[i].AnalisisKunciJendela();
			c[i].AnalisisKunciPintu();
			c[i].AnalisisKeamananRuang();
		}*/
		apa.ListInputan();
		}
	}
