package id.ac.undiksha.siak;

import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Dosen;


public class Main {
	
	public static void main(String[] args) { //TODO
		
		Mahasiswa ani = new Mahasiswa();
		
		ani.setNim("101075");
		ani.setNama("Kevin");
		ani.setAlamat("Singaraja");
		ani.setTanggalLahir("30 Januari 2004");
		ani.setJenisKelamin(true);
		ani.setProdi("Ilmu Komputer");
		
		
		Dosen sansan = new Dosen();
		
		sansan.setNidn("12345");
		sansan.setNama("Sansan");
		sansan.setAlamat("Klungkung");
		sansan.setTanggalLahir("30 November 1985");
		sansan.setJenisKelamin(false);
		sansan.setMatakuliah("Mata Kuliah: Pemrograman Berorientasi Objek");
		
		
		
		System.out.println (ani.getNim());
		System.out.println (ani.getNama());
		System.out.println (ani.getAlamat());
		System.out.println (ani.getTanggalLahir());
		System.out.println (ani.getJenisKelamin());
		System.out.println (ani.getProdi());
		
		
		System.out.println (sansan.getNidn());
		System.out.println (sansan.getNama());
		System.out.println (sansan.getAlamat());
		System.out.println (sansan.getTanggalLahir());
		System.out.println (sansan.getJenisKelamin());
		System.out.println (sansan.getMatakuliah());
		
		
		/*ani.nim 	="12345";
		ani.nama	= "Ani";
		ani.alamat	="Singaraja";
		ani.tanggalLahir	="1 januari 2000";
		ani.jenisKelamin	= true;
		ani.prodi			="Ilmu Komputer";
		
		System.out.println(ani.nim);
		System.out.println(ani.nama);
		System.out.println(ani.alamat);
		System.out.println(ani.tanggalLahir);
		System.out.println(ani.jenisKelamin);
		System.out.println(ani.prodi);*/
		
		System.out.println("--------------");
		
		Mahasiswa caca = new Mahasiswa(
				"1075",
				"caca",
				"denpasar",
				"geografi",
				"1 Feb 2000",
				true
				
				);
				
		caca.printAll();
	
		
	}
}