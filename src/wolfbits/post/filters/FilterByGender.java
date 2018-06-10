
package wolfbits.post.filters;

import wolfbits.pet.Pet;

public class FilterByGender extends AbstractFilter{
    private String sex;
    
    public FilterByGender(String sex)
    {
        this.sex = sex;
    }
    
    @Override
    public boolean filter(Pet pet)
    {
        return pet.getSex().equals(this.sex);
    }  
}
