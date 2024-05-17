import java.util.ArrayList;
import java.util.Arrays;

public class DataBase{
     final ArrayList<Product> arrayListOfProducts;

    public DataBase() {
        this.arrayListOfProducts = new ArrayList<>();
    }
    public void addProduct(Product product){
        arrayListOfProducts.add(product);
    }

    public void deleteProduct(Product product) {
        if (arrayListOfProducts.contains(product)){
            arrayListOfProducts.remove(product);
        }else{
            System.out.println("No such product in database!");
        }
    }
    public void searchForProduct(Product product){
        if(arrayListOfProducts.contains(product)){
           int index = arrayListOfProducts.indexOf(product);
            System.out.println(arrayListOfProducts.get(index));
        }else {
            System.out.println("No such product in database!");
        }
    }

    @Override
    public String toString() {
       return Arrays.deepToString(arrayListOfProducts.toArray());
    }
}
