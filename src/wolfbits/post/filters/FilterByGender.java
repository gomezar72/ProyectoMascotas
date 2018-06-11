
package wolfbits.post.filters;

import wolfbits.pet.Pet;

public class FilterByGender extends AbstractFilter{
    private String gender;
    
    public FilterByGender(String sex)
    {
        this.gender = gender;
    }
    
    @Override
    public boolean filter(Pet pet)
    {
        return pet.getGender().equals(this.gender);
    }  
}
