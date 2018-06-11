package wolfbits.post.filters;

import wolfbits.pet.Pet;

public class FilterByColour2  extends AbstractFilter{
    private String colour;
    
    public FilterByColour2(String colour)
    {
        this.colour = colour;
    }
    
    @Override
    public boolean filter(Pet pet)
    {
        return pet.getColour2().getName()== this.colour;
    }  
}