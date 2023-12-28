package id.ac.undiksha.siak.people;

public class Mahasiswa {
	
	private String nim;
	private String nama;
	private String alamat;
	private String prodi;
	private String tanggalLahir;
	private boolean jenisKelamin;
	
	public Mahasiswa () {
		this.nim			= "<masukan nim>";
		this.nama			= "<masukan nama>";
		this.alamat			= "<masukan allamat>";
		this.prodi			= "<masukan prodi>";
		this.tanggalLahir	= "<masukan tanggallahir>";
	}
	
	public Mahasiswa(String nim, String nama, String alamat, String prodi, String tanggalLahir, boolean jenisKelamin) {
		super();
		this.nim = nim;
		this.nama = nama;
		this.alamat = alamat;
		this.prodi = prodi;
		this.tanggalLahir = tanggalLahir;
		this.jenisKelamin = jenisKelamin;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}
	
	public String getNim() {
		return this.nim;
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

	public String getProdi() {
		return prodi;
	}

	public void setProdi(String prodi) {
		this.prodi = prodi;
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
	
	public String getJenisKelamin() {
		if (this.isJenisKelamin()) {
			return "Perempuan";
		}else {
			return "Laki-laki";
		}
	}

	public void setJenisKelamin(boolean jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	

	public void printAll() {
		System.out.println (this.getNim());
		System.out.println (this.getNama());
		System.out.println (this.getAlamat());
		System.out.println (this.getTanggalLahir());
		System.out.println (this.getJenisKelamin());
		System.out.println (this.getProdi());
		
	}
}