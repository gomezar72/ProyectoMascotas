
package wolfbits.post.filters;

import wolfbits.pet.Pet;

public class FilterByColour1  extends AbstractFilter{
    private String colour;
    
    public FilterByColour1(String colour)
    {
        this.colour = colour;
    }
    
    @Override
    public boolean filter(Pet pet)
    {
        return pet.getColour1().getName()== this.colour;
    }  
}
