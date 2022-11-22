package pegawaii;
public class MainClass {
	public static void main(String[] args) {
		Manager bambang = new Manager("Bambang",5000000,9000000);
		Programmer agung = new Programmer("Agung",7000000,3000000);

		// Set Pegawai
		bambang.cetakInfo();
		agung.cetakInfo();


	}
}