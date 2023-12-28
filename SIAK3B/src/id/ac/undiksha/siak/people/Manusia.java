package id.ac.undiksha.siak.people;

public class Manusia {

	public Manusia(String nama, String alamat, String tanggalLahir, boolean jenisKelamin) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.tanggalLahir = tanggalLahir;
		this.jenisKelamin = jenisKelamin;
	}

	private String nama;
	private String alamat;
	private String tanggalLahir;
	private boolean jenisKelamin;
	
	public Manusia() {
		this.nama		="<masukan nama>";
		this.alamat		="<masukan alamt>";
		this.tanggalLahir ="<masukan tanggal lahir>";
		
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(String tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public boolean isJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(boolean jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
}	
