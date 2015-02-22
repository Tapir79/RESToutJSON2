
package json;

/**
 *
 * @author saara
 */

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FlowerController {
    
    @Autowired
    private FlowerShop flowerShop;
    
//    method init is run only once 
    @PostConstruct
    private void init() {
        Flower flower = new Flower();
        List<String> colourlist = new ArrayList();
        flower.setId(1);
        flower.setName("Rose");
        colourlist.add("white");
        colourlist.add("red");
        flower.setColour(colourlist);
        flowerShop.addFlower(flower);
        
        flower = new Flower();
        colourlist = new ArrayList();
        flower.setId(2);
        flower.setName("Daffodil");
        colourlist.add("yellow");
        flower.setColour(colourlist);
        flowerShop.addFlower(flower);
     
        flower = new Flower();
        colourlist = new ArrayList();
        flower.setId(3);
        flower.setName("Orchid");
        colourlist.add("white");
        colourlist.add("purple");
        flower.setColour(colourlist);
        flowerShop.addFlower(flower);
        
    }
    
//    @RequestMapping(value="/flower", method = RequestMethod.GET, produces="application/json")
//    public @ResponseBody Flower getFlower(){
//        Flower flower = new Flower();
//        flower.setId(1);
//        flower.setName("rose");
//        return flower;
//    }
    
//    return flower by id .../rest/flower/1
    @RequestMapping(method = RequestMethod.GET, value = "flower/{flowerId}", produces="application/json")
    @ResponseBody
    public Flower read(@PathVariable int flowerId) {
        return flowerShop.getFlowerById(flowerId);
    }
    
//    return all flowers as a list
    @RequestMapping(method = RequestMethod.GET, value = "flower", produces="application/json")
    @ResponseBody
    public List<Flower> List() {
        return flowerShop.getFlowerList();
    }
    
}
