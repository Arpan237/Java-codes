class Computer{
String brand;
double price;
String processor;
int ram=8;
int rom=1000;
int battery=5;

Computer(String brand,double price,String processor)
{
this.brand=brand;
this.price=price;
this.processor=processor;
}


Computer(String brand,double price,String processor,int ram,int rom,int battery)
{
	this(brand,price,processor);
	this.ram=ram;
	this.rom=rom;
	this.battery=battery;

}
Computer(String processor,String brand,int rom)
{
	this.processor=processor;
	this.brand=brand;
	this.rom=rom;
	
}         
Computer(int ram,int battery,double price)
{
	this.ram=ram;
	this.battery=battery;
	this.price=price;
}
}