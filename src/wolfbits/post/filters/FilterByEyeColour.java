
package wolfbits.post.filters;

import wolfbits.pet.Pet;

public class FilterByEyeColour extends AbstractFilter{
    private String eyeColour;
    
    public FilterByEyeColour(String eyeColour)
    {
        this.eyeColour = eyeColour;
    }
    
    @Override
    public boolean filter(Pet pet)
    {
        return pet.getEyeColour().equals(this.eyeColour);
    }  
}
