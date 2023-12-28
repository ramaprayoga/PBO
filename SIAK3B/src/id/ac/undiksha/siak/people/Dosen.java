package id.ac.undiksha.siak.people;

public class Dosen {
	
	private String nidn;
	private String nama;
	private String alamat;
	private String matakuliah;
	private String tanggalLahir;
	private boolean jenisKelamin;
	
	public void setNidn(String nidn) {
		this.nidn = nidn;
	}
	
	public String getNidn() {
		return this.nidn;
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

	public String getMatakuliah() {
		return matakuliah;
	}

	public void setMatakuliah(String matakuliah) {
		this.matakuliah = matakuliah;
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
	
}