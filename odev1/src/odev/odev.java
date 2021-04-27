package odev;


public class odev {

	public static void main(String[] args) {
	   System.out.println("Kodlama.io");
	   
	   Kurs kurs1=new Kurs(1,"Yazilim  Geliþtirici C# Kampi","Engin Demirog");
	   Kurs kurs2=new Kurs(2,"Yazilim  Geliþtirici JAVA Kampi", "Engin Demirog");
	   Kurs kurs3=new Kurs(3,"Programlamaya Giriþ Temel Kurs","Engin Demirog");
	   
	   Kurs[] kurslar= {kurs1,kurs2,kurs3};
	   
	   System.out.println("**KURSLAR**");
	   for(Kurs kurs : kurslar)
	   {
		  System.out.println("Kurs Adi:"+kurs.KursAdi+"Kurs Eðitmeni:"+kurs.KursOgreten);
		  
	   }
	   
	   System.out.println("**KATEGORÝ**");
	   Kategori kategori1=new Kategori(1,"Tüm ",3);
	   Kategori kategori2=new Kategori(2,"Programlama ",3);
			   
	   Kategori[] kategoriler= {kategori1,kategori2};
	   
	   for(Kategori kategori : kategoriler)
	   {
		   System.out.println("Kategori Adi:"+kategori.KategoriAdi+"Kurs Sayýsý:"+kategori.Kurssayisi);
		   
	   }
	   Kurslar kurss =new Kurslar();
	   
		kurss.Add(kurs3);
	    kurss.Add(kurs2);
	    kurss.Add(kurs1);
	    kurss.Add(kurs3);
	    

	}

}
