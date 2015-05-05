package tb_java;

import java.util.Scanner;

public class Inventaris extends RuangKelas{
	Scanner in = new Scanner(System.in);
	//RuangKelas ruang = new RuangKelas();
	
	public void Insertdata(){
		System.out.println("Masukkan nama ruangan : ");
		super.setNamaruang(in.next());
		System.out.println("\n");
		System.out.println("Masukkan Lokasi Ruangan : ");
		super.setLokasiruang(in.next());
		System.out.println("\n");
		System.out.println("Masukkan nama Fakultas anda : ");
		super.setFakultas(in.next());
		System.out.println("\n");
		System.out.println("Masukkan Program Studi anda : ");
		super.setStudi(in.next());
		System.out.println("\n");	
	}
}
		
	