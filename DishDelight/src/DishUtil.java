import java.util.List;
import java.util.stream.Stream;

public class DishUtil {

    public List<Dish> getDishesByCuisine(Stream<Dish> dishStream, String cuisine) {
        
        //Fill the code here
//        return dishStream.Stream().filter(n->n.getCusine().equals(cuisine.toList()));
        return dishStream.filter(n->n.getCuisine().equals(cuisine)).toList();
    }
}
