package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase 
		//Don't repeat yourself(kendini tekrar etme)
		//Deðiþkene deðer atayýp ekrana yazdýrma ve dinamik yapý kullanma
		
		String internetSubeButonu = "Ýnternet Þubeye gir";
		double dolar_Bugun=8.20;
		double dolar_Dun=8.20;
		int vade =36;
		boolean dustuMu = false;
		//KOD BLOKLARI 
		System.out.println(internetSubeButonu);
		
		if (dolar_Bugun<dolar_Dun)
		{
			System.out.println("Dolar düþtü resmi");
		}
		else if (dolar_Bugun>dolar_Dun)
		{
			System.out.println("Dolar yükseldi resmi");
		}
		else 
		{
			System.out.println("Dolar eþittir resmi");
		}
		//ARRAY (DÝZÝ) 
		String kredi1 ="Hýzlý Kredi";
		String kredi2 ="Mutlu emekli Kredi";
		String kredi3 ="Konut Kredi";
		String kredi4 ="Çiftçi Kredi";
		String kredi5 ="Msb Kredi";
		String kredi6= "Web Kredisi";
	
		System.out.println("kredi1");
		System.out.println("kredi2");
		System.out.println("kredi3");
		System.out.println("kredi4");
		System.out.println("kredi5");
		System.out.println("kredi6");
		System.out.println("kredi7");
		//LÝSTE GÖRÜNÜMÜ
		String[] krediler= {
				"Hýzlý Kredi", //0.index
				"Mutlu emekli kredisi",//1.index
				"Konut kredisi", //2.index
				"Çift kredisi", //3.index
				"Msb Kredisi",  //4.index
				"Meb Kredisi",   //5.index
				"Kültür bakanlýðý kredisi" //6.index
				};
		//Döngü belirttiðin þart kadar çalýþtýr demektir.
		//foreach
		for(String kredi : krediler)
			
		{
			System.out.println(kredi);
		}
		
		for (int i=0; i<krediler.length; i++)
		{
			System.out.println(krediler[i]);
		}
		
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);
		 
		int[] sayilar1= {1,2,3,4,5};
		int[] sayilar2= {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0] =100;
		System.out.println(sayilar1[0]);
		
		String sehir1="Ankara";
		String sehir2= "Ýstanbul";
		sehir2="Ýzmir";
		sehir1=sehir2;
		System.out.println(sehir1);
		 
		
		
		
		
		
		
	}

}
