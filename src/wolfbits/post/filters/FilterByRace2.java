package wolfbits.post.filters;

import wolfbits.pet.Pet;

public class FilterByRace2 extends AbstractFilter {
    private String race;
    
    public FilterByRace2(String race)
    {
        this.race = race;
    }
    
    @Override
    public boolean filter(Pet pet)
    {
        return pet.getRace2().getName()==(this.race);
    }
    
}
