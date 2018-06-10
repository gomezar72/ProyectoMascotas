
package wolfbits.post.filters;

import wolfbits.pet.Pet;

public class FilterByColour  extends AbstractFilter{
    private String colour;
    
    public FilterByColour(String colour)
    {
        this.colour = colour;
    }
    
    @Override
    public boolean filter(Pet pet)
    {
        return pet.getColour().equals(this.colour);
    }  
}
