package tb_java;


public class Main_Class {

	public static void main(String[] args) {
		Inventaris[] Main;
		Main = new Inventaris[1];
		for (int i = 0; i < Main.length; i++) {
			Main[i] = new Inventaris();
			Main[i].Insertdata();
			Main[i].kondisi();
			Main[i].Hitungluas();
			Main[i].BentukRuang();
			Main[i].rasio();
			Main[i].AnalisaPintu();
			Main[i].AnalisaJendela();
			Main[i].JmlhkondisidanposisiSarana();
			Main[i].AnalisaKelistrikan();
			Main[i].AnalisisLCD();
			Main[i].AnalisisLampu();
			Main[i].AnalisisKipas();
			Main[i].AnalisisAC();
			Main[i].AnalisisInternet();
			Main[i].AnalisisCCTV();
			Main[i].lingkungan();
			Main[i].AnalisisKebersihan();
			Main[i].Kebersihan();
			Main[i].AnalisisSirkulasiUdara();
			Main[i].AnalisisPencahayaan();
			Main[i].AnalisisKelembapan();
			Main[i].AnalisisSuhu();
			Main[i].Kenyamanan();
			Main[i].AnalisisKebisingan();
			Main[i].AnalisisBau();
			Main[i].AnalisisKebocoran();
			Main[i].AnalisisKerusakan();
			Main[i].AnalisisKeausan();
			Main[i].Keamanan();
			Main[i].AnalisisKekokohan();
			Main[i].AnalisisKunciPintu();
			Main[i].AnalisisKunciJendela();
			Main[i].AnalisisKeamananRuang();
			Main[i].ListInputan();
		}
	}
}