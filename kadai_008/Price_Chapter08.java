package kadai_008;

public class Price_Chapter08 {
	
    public static void main(String[] args) {
    	
        int userAge = 30;
        int serviceCost;
        
        switch (userAge) {
            case 10:
                serviceCost = 1000;
                System.out.println("10代の料金は" + serviceCost + "円");
                break;
            case 20:
            	serviceCost = 2000;
                System.out.println("20代の料金は" + serviceCost + "円");
                break;
            case 30:
            	serviceCost = 3000;
                System.out.println("30代の料金は" + serviceCost + "円");
                break;
            case 40:
            	serviceCost = 3000;
                System.out.println("40代の料金は" + serviceCost + "円");
                break;
            case 50:
            	serviceCost = 4000;
                System.out.println("50代の料金は" + serviceCost + "円");
                break;
            case 60:
            	serviceCost = 4000;
            	System.out.println("60代の料金は" + serviceCost + "円");
            	break;
            case 70:
            	serviceCost = 4000;
                System.out.println("70代の料金は" + serviceCost + "円");
                break;
            case 80:
            	serviceCost = 5000;
            	System.out.println("80代の料金は" + serviceCost + "円");
                break;
            default:
            	serviceCost = 500;
                System.out.println("それ以外は" + serviceCost + "円");
                break;
        }
    }
}
