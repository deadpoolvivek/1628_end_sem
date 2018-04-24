
public class EventManagement {
	public static void main(String[] args) {
		Person cl1 = new Person("vivek");
		
		Option op1 = new Option("Air Hall",2000);
		
		
		Adon a1 = new Adon("Sound",1000);
		Adon a2 = new Adon("light",1000);
		Adon a3 = new Adon("Large Hall",10000);
		
		Option opl1[] = new Option[2];
		opl1[0] = op1;
		
		
		Adon adl1[] = new Adon[3];
		adl1[0] = a1;
		adl1[1] = a2;
		adl1[2] = a3;
		
		Service s1 = new Service("Hall Booking",1000,10,opl1,adl1);
		
		s1.bookService(op1, adl1);
		s1.printBill();
	}
}
