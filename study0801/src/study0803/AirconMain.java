package study0803;

public class AirconMain {

	public static void main(String[] args) {
		
		Aircon air= new Aircon();
		Aircon air2= new Aircon();
		Aircon air3= new Aircon();
		

		air.brand="»ï¼º";
		air.price=1230000;
		air2.brand="LG";
		air2.price=1100000;
		air3.brand="»þ¿À¹Ì";
		air3.price=100000;
		
		
		if((air.price>air2.price)&&(air.price>air3.price)) {
			System.out.println(air.brand+","+air.price+"¿ø");
		}else if((air2.price>air.price)&&(air2.price>air3.price)) {
						System.out.println(air2.brand+","+air2.price+"¿ø");
		}else if((air3.price>air.price)&&(air3.price>air2.price)){
			System.out.println(air3.brand+","+air3.price+"¿ø");
		}
		
	}

}
