/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author asus
 */
public class UjiCobaBio {
    public static void main (String [] args){
        BioKeluarga bio = new BioKeluarga ();
        bio.setNamaAyah("Unang Harianto");
        bio.setNamaIbu("Jamik");
        bio.setNamaSaudara("Khadijah");
        bio.setNamaMu("Dewi Nurul Mahardika");
        bio.setAlamat("Kepanjen");
        bio.setTempatLahir("Malang");
        bio.setTanggalLahir(31);
        bio.setHobi("Kuliner");
        bio.setCitaCita("PNS atau Programmer");
        bio.setNoTelepon ("087859373495");
        
        System.out.println("Nama Ayah :" + bio.getNamaAyah());
        System.out.println("Nama Ibu :" + bio.getNamaIbu());
        System.out.println("Nama Saudara :" + bio.getNamaSaudara());
        System.out.println("Nama Mu :" + bio.getNamaMu());
        System.out.println("Alamat :" + bio.getAlamat());
        System.out.println("Tempat Lahir :" + bio.getTempatLahir());
        System.out.println("Tanggal Lahir :"+ bio.getTanggalLahir());
        System.out.println("Hobi :" + bio.getHobi());
        System.out.println("Cita - Cita :" + bio.getCitaCita());
        System.out.println("NoTelepon :"+ bio.getNoTelepon());
    }
}
