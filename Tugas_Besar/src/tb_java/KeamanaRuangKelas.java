
import java.util.Scanner;

public class KeamanaRuangKelas extends RuangKelas {
	Scanner in = new Scanner(System.in);
	
	@Override
    public void KeamananRuangKelas(){
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

	public String AnalisisKekokohan(){
		if(super.getKekokohan()==1)
			return("Tingkat Kekokohan = Sesuai");
		else
			return("Tingkat Kekokohan = tidak sesuai");
	}
	public String AnalisisKunciPintu(){
		if(super.getKuncipintu()==1)
			return("Kunci pintu = Sesuai");
		else
			return("Kunci pintu = tidak sesuai");
	}
	public String AnalisisKunciJendela(){
		if(super.getKuncijendela()==1)
			return("Kunci Jendela = Sesuai");
		else
			return("Kunci Jendela = tidak sesuai");
	}
	public String AnalisisKeamananRuang(){
		if(super.getBahaya()==1)
			return("Tingkat Keamanan Ruangan = Sesuai");
		else
			return("Tingkat Keamanan Ruangan = tidak sesuai");
	}
}
