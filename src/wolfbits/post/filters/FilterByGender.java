
package wolfbits.post.filters;

import wolfbits.pet.Pet;

public class FilterBySex extends AbstractFilter{
    private String sex;
    
    public FilterBySex(String sex)
    {
        this.sex = sex;
    }
    
    @Override
    public boolean filter(Pet pet)
    {
        return pet.getSex().equals(this.sex);
    }  
}
