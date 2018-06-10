
package wolfbits.post.filters;

import wolfbits.pet.Pet;

public class FilterByLocalization extends AbstractFilter{
    private String localization;
    
    public FilterByLocalization(String localization)
    {
        this.localization = localization;
    }
    
    @Override
    public boolean filter(Pet pet)
    {
        return pet.getLocalization().equals(this.localization);
    }  
}
