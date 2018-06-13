package wolfbits.post.filters;

import wolfbits.pet.Pet;

public class FilterByColour2  extends AbstractFilter{
    private String colour2;
    
    public FilterByColour2(String colour2)
    {
        this.colour2 = colour2;
    }
    
    @Override
    public boolean filter(Pet pet)
    {
        return pet.getColour2().getName().equals(this.colour2);
    }  
}