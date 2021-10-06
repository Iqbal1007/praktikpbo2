package SoalNo1;

import java.util.ArrayList;

class Buku {
    String isbn;
    String judul;
    String pengarang;
    String tahunTerbit;
    String harga;
    float rating;

    Buku(String isbn,
         String judul,
         String pengarang,
         String tahunTerbit,
         String harga,
         float rating)  //konstruktor
    {
        this.isbn = isbn;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.rating = rating;
    }
    //setter
    void setJudul(){
        this.judul = "api";
    }
    void setPengarang(){
        this.pengarang = "Otwell";
    }
    void setTahunTerbit(){
        this.tahunTerbit = "2010";
    }
    void setHarga(){
        this.harga = "90000";
    }
    void setRating(){
        this.rating = (float) 10.0;
    }

    //getter
    String getIsbn(){
        return this.isbn;
    }
    String getJudul(){
        return this.judul;
    }
    String getPengarang(){
        return this.pengarang;
    }
    String getTahunTerbit(){
        return this.tahunTerbit;
    }
    String getHarga(){
        return this.harga;
    }
    float getRating(){
        return this.rating;
    }

    //method search ISBN
    void searchIsbn(String isbn){
        if(this.isbn.equalsIgnoreCase(isbn)){
            System.out.println(isbn + " " + judul + " " + pengarang + " " + tahunTerbit + " " + harga + " " + rating);
        }
    }

    //convert ti string
    @Override
    public String toString() {
        return getIsbn()+" "+getJudul()+" "+ getPengarang()+" "+getTahunTerbit()+" "+getHarga()+" "+getRating() ;
    }

}
public class Main {
    public static void main(String[] args) {

        ArrayList<Buku> list = new ArrayList<>();

        list.add(new Buku("01", "langit", "iqbal", "2002", "8000", 4.5F));
        list.add(new Buku("02", "awan", "oji", "2003", "9000", 5F));
        list.add(new Buku("03", "tanah", "fany", "2004", "10000", 6F));

        for (Buku buku:list){
            System.out.println(buku);
        }

        for (Buku buku:list){
            buku.searchIsbn("001");
        }
        System.out.println();

        list.get(0).setJudul();
        list.get(0).setPengarang();
        list.get(0).setTahunTerbit();
        list.get(0).setHarga();
        list.get(0).setRating();

        list.remove(1);

        for (Buku buku:list){
            System.out.println(buku);
        }

    }
}
