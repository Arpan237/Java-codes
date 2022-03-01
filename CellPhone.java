class CellPhone{
String company;
String os;
int ram;
int rom;
int screenSize;
static String processor="Snapdragon";
static int camera=16;
double price;
String voiceAssistance;
int battery;
static String networkType;
CellPhone(String cmpny, String operating,int rm,int space,int Size,double prc,String assistance,int btry){
company=cmpny;
os=operating;
ram=rm;
rom=space;
screenSize=Size;
price=prc;
voiceAssistance=assistance;
battery=btry;
}
}
