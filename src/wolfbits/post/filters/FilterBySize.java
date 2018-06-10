
package wolfbits.post.filters;

import wolfbits.pet.Pet;

public class FilterBySize extends AbstractFilter {
    private String size;
    
    public FilterBySize(String size)
    {
        this.size = size;
    }
    
    @Override
    public boolean filter(Pet pet)
    {
        return pet.getSize().equals(this.size);
    }  
}
