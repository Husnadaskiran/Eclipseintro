package oopintro;

public class Product {
	// id=nesne hareketi , nesne ay�rtedici, �r;T.C kimlik numaras� 
	
		//Constructor=Yap�c�, class olu�tururken istedi�in kodu yazabilirisin.
		
		public Product()
		{
			System.out.println("Ben �al��t�m..");
			
		}
		public Product(int id,String name, double unitPrice, String detail)
		{
			// this=bu class taki id,unitprice,detail,name g�sterir.
			
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
