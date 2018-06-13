
package wolfbits.post.filters;

import wolfbits.pet.Pet;

public class FilterByColour1  extends AbstractFilter{
    private String colour1;
    
    public FilterByColour1(String colour1)
    {
        this.colour1 = colour1;
    }
    
    @Override
    public boolean filter(Pet pet)
    {
        return pet.getColour1().getName().equals(this.colour1);
    }  
}
