
package json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

/**
 *
 * @author saara
 */
@Component
public class FlowerShop {
    
    private Map<String,Flower> flowerStock;
    private List<Flower> flowerList;

    public FlowerShop() {
        this.flowerStock = new HashMap<>();
        this.flowerList = new ArrayList<>();
    }

    public Flower getFlowerById(int id){ 
//        one way to convert an int to String 
        String sId = Integer.toString(id);       
        Flower f = new Flower();     
//        check if flower id is found
        if(this.flowerStock.get(sId) != null){
             f = this.flowerStock.get(sId);
        }
        return f;   
    }
    
    public void addFlower(Flower flower){
        String sId = Integer.toString(flower.getId());
        this.flowerStock.put(sId, flower);
    }

    public List<Flower> getFlowerList() {
        createList();
        return flowerList;
    }
    
    private void createList(){
       Flower dummyFlower = new Flower();
       
        for (String key : flowerStock.keySet()) {
        dummyFlower = flowerStock.get(key);
        this.flowerList.add(dummyFlower);
                }
    }
    
}
