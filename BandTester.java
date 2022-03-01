class BandTester{
public static void main(String[] args){
BroadBand broadband=new BroadBand("Airtel",150);
broadband.band=Band.TWO_HERTZ;
broadband.plan=Plan.Monthly;
broadband.connectionType=BandType.PREPAID;
System.out.println(broadband.band.value+" Heartz");
System.out.println(broadband.plan);
System.out.println(broadband.operatorName);
System.out.println(broadband.speed+"MB");
System.out.println(broadband.connectionType.type);
}
}
