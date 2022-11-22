package pegawaii;

public class Manager extends Pegawaii {
	double tunjangan;

	// Setter
	public Manager(String nama, double gajiPokok, double tunjangan) {
		super(nama, gajiPokok);
		this.tunjangan = tunjangan;
	}

	// Getter
	public double getTunjangan() {
		return this.tunjangan;
	}

	// Cetak
        @Override
	public void cetakInfo() {
		System.out.println("Manager");
		super.cetakInfo();
		System.out.println("Tunjangan 	: " + getTunjangan() + "\n");
	}
}