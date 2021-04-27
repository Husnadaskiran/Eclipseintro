package oopintro;

public class Product {
	// id=nesne hareketi , nesne ayýrtedici, ör;T.C kimlik numarasý 
	
		//Constructor=Yapýcý, class oluþtururken istediðin kodu yazabilirisin.
		
		public Product()
		{
			System.out.println("Ben çalýþtým..");
			
		}
		public Product(int id,String name, double unitPrice, String detail)
		{
			// this=bu class taki id,unitprice,detail,name gösterir.
			
			this.id=id;
			this.name=name;
			this.unitPrice=unitPrice;
			this.detail=detail;
			
			
		}
		int id;
		String name;
		double unitPrice;
		String detail;
	

}
