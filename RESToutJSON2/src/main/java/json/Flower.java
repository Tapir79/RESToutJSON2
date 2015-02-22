
package json;

import java.util.List;

/**
 *
 * @author saara
 */
public class Flower {
    
    private int id;
    private String name;
//    different colours the flower may have
    private List<String> colour;

    public Flower() {
    }
    
    public Flower(int id, String name, List<String> colour){
        this.id = id;
        this.name = name;
        this.colour = colour;    
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public List<String> getColour() {
        return colour;
    }

    public void setColour(List<String> colour) {
        this.colour = colour;
    }

    
    
}
