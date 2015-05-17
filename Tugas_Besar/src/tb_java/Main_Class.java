package tb_java;

public class Main_Class {

	public static void main(String[] args) {
		Inventaris[] a = new Inventaris[1];
		Tampil b = new Tampil();
		
		for (int i = 0; i < a.length; i++) {
			a[i] = new Inventaris();
			a[i].Insertdata();
			a[1].KondisiKelas();
			a[1].JmlhKondisiPosisiSarana();
			a[1].LingkunganRuangKelas();
			a[1].KebersihanRuangKelas();
			a[1].KenyamananRuangKelas();
			a[1].KeamananRuangKelas();
		}
		b.ListInputan();
		
		}
	}
