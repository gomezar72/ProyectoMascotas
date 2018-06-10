
package wolfbits.post.filters;

import wolfbits.pet.Pet;

public class FilterByType extends AbstractFilter{
    private String type;
    
    public FilterByType(String type)
    {
        this.type = type;
    }
    
    @Override
    public boolean filter(Pet pet)
    {
        return pet.getType().equals(this.type);
    }  
}
