package tb_java;

import java.util.Scanner;

public class Inventaris extends RuangKelas{
	Scanner in = new Scanner(System.in);
	//RuangKelas ruang = new RuangKelas();
	
	public void Insertdata(){
		System.out.println("Masukkan Identitas : (nama ruangan, lokasi ruangan, fakultas, Prodi)");
		super.setInventaris(in.next(), in.next(), in.next(), in.next());
		
	}

}
		
	
