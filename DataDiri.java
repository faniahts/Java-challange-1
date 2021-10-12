public class DataDiri{
    public static void main(String[] args){
        //first name, last name, age, addres, hobi, phone number, makanan kesukaan, tinggi
        String firstName, lastName, alamat, hobi, makananKesukaan, phoneNumber;
        int usia;
        double tinggi, beratBadan;

        firstName = "Fania Putri ";
        lastName = "Hutasoit";
        alamat = "Bordeaux, Paris";
        hobi = "masak air";
        phoneNumber = "081234561234";
        usia = 19;
        tinggi = 150.5;
        beratBadan = 49;
        makananKesukaan = "segala jenis makanan";


        System.out.println("Nama : " + firstName + lastName);
        System.out.println("Alamat : " + alamat);
        System.out.println("Usia : " + usia + " tahun");
        System.out.println("Tinggi Badan : " + tinggi + " cm");
        System.out.println("Berat Badan : " + beratBadan + " kg");
        System.out.println("Hobi : " + hobi);
        System.out.println("Nomor Telepon : " + phoneNumber);
        System.out.println("Makanan Kesukaan : " + makananKesukaan);

    }
}
