class ApartmentTester{
	
public static void main(String[] args){
	//Apartment(int area,int totalApartments,String name,double rent)

Apartment apartment=new Apartment(150,"xworks",50);
{
	apartment.rent=Rent.TwentyFive_Thousand;
	apartment.area=Area.Rajajinagar;
			System.out.println("Apartment Name "+apartment.name);
	System.out.println("Apartment area "+apartment.area);
	System.out.println("Total Apartments "+apartment.totalApartments+" Apartment");
    		System.out.println("Rent "+apartment.rent.rnt+"/-");
			System.out.println("Total Workers "+apartment.totalworkers);
}
}
}