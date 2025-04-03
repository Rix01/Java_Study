package work.com.workshop02_1;

public class TvTest {

	public static void main(String[] args) {
		Tv[] tvArray = new Tv[3];
		tvArray[0] = new Tv("INFINIA", 1500000, "LED TV");
		tvArray[1] = new Tv("XCANVAS", 1000000, "LCD TV");
		tvArray[2] = new Tv("CINEMA", 2000000, "3D TV");
//		int highPrice = tvArray[0].getPrice();
//		int lowPrice = tvArray[0].getPrice();
		int highPriceIdx = 0;
		int lowPriceIdx = 0;
		
		for (int i =0; i<3; i++) {
//			if(tvArray[i].getPrice()>=highPrice) {
//				highPrice = tvArray[i].getPrice();
//				highPriceIdx = i;
//			}
//			
//			if(tvArray[i].getPrice()<=lowPrice) {
//				lowPrice = tvArray[i].getPrice();
//				lowPriceIdx = i;
//			}
			System.out.print(tvArray[i].toString());
		}
//		System.out.println("가격이 가장 비싼 제품: "+tvArray[highPriceIdx].getName());
//		System.out.println("가격이 가장 저렴한 제품: "+tvArray[lowPriceIdx].getName());
	}

}
