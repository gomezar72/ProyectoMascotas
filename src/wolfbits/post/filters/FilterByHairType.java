
package wolfbits.post.filters;

import wolfbits.pet.Pet;

public class FilterByHairType extends AbstractFilter{
    private String hairType;
    
    public FilterByHairType(String hairType)
    {
        this.hairType = hairType;
    }
    
    @Override
    public boolean filter(Pet pet)
    {
        return pet.getHairType().equals(this.hairType);
    }  
}
