
package wolfbits.post.filters;

import wolfbits.pet.Pet;

public class FilterByAge extends AbstractFilter{
    private String age;
    
    public FilterByAge(String age)
    {
        this.age = age;
    }
    
    @Override
    public boolean filter(Pet pet)
    {
        return pet.getAge().equals(this.age);
    }  

}
