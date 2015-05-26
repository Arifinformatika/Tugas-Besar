package tb_java;

public class Main_Class {

	public static void main(String[] args) {
		Inventaris[] a = new Inventaris[1];
		

		for (int i = 0; i < a.length; i++) {
			a[i] = new Inventaris();
			a[i].Insertdata();
			a[i].KondisiKelas();
			a[i].JmlhKondisiPosisiSarana();
			a[i].LingkunganRuangKelas();
			a[i].KebersihanRuangKelas();
			a[i].KenyamananRuangKelas();
			a[i].KeamananRuangKelas();
			a[i].tampil();
		}
		

	}
}
