import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PriceCheckHackerRANK {

    private static int checkCorrectPrice(ArrayList<Float> productPrices, ArrayList<String> productList, ArrayList<String> productSold, ArrayList<Float> soldPrices) {
        Map<String,Float> map = new HashMap<>();
        //i need to do data-mapping
        for(int i=0;i<productList.size();i++){
            map.put(productList.get(i),productPrices.get(i));
        }
        //now ust verify it by checking exact data--mapping
        int totalErrors = 0;
        for(int i=0;i<productSold.size();i++){
            Float correctPrice  = map.get(productSold.get(i));
            Float enteredPrice = soldPrices.get(i);
       if(!correctPrice.equals(enteredPrice)){
                //data-mismatch
                totalErrors++;
            }
        }
    return  totalErrors;
    }
    public static void main(String[] args) {
        ArrayList<String> productList = new ArrayList<>();
        productList.add("egg");
        productList.add("Milk");
        productList.add("cheese");
        ArrayList<Float> productPrices = new ArrayList<>();
        productPrices.add(2.89f);
        productPrices.add(3.29f);
        productPrices.add(5.79f);
      ArrayList<String> productSold = new ArrayList<>();
      productSold.add("egg");
      productSold.add("egg");
      productSold.add("cheese");
      productSold.add("Milk");
      ArrayList<Float> soldPrices = new ArrayList<>();
      soldPrices.add(2.89f);
      soldPrices.add(2.99f);
      soldPrices.add(5.97f);
      soldPrices.add(3.29f);
      int errors =  checkCorrectPrice(productPrices,productList,productSold,soldPrices);
      System.out.println("Total-Mismatched data-Putting errors are -> " + errors);
    }

}
