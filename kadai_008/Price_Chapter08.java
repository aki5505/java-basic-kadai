package kadai_008;

public class Price_Chapter08 {
	
    public static void main(String[] args) {
    	
        int userAge = 30;
        String serviceCost = "";
        
        switch (userAge) {
            case 10:
                serviceCost = "10代の料金は1000円";
                break;
            case 20:
                serviceCost = "20代の料金は2000円";
                break;
            case 30:
            case 40:
                serviceCost = "30代・40代の料金は3000円";
                break;
            default:
                serviceCost = "それ以外は500円";
                break;
        }
        System.out.println(serviceCost);
    }
}
