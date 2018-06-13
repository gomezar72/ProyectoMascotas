package wolfbits.post.filters;

import wolfbits.pet.Pet;

public class FilterByRace2 extends AbstractFilter {
    private String race2;
    
    public FilterByRace2(String race2)
    {
        this.race2= race2;
    }
    
    @Override
    public boolean filter(Pet pet)
    {
        return pet.getRace2().getName().equals(this.race2);
    }
    
}
