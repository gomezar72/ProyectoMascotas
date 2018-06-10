
package wolfbits.post.filters;

import wolfbits.pet.Pet;

public class FilterByRace extends AbstractFilter {
    private String race;
    
    public FilterByRace(String race)
    {
        this.race = race;
    }
    
    @Override
    public boolean filter(Pet pet)
    {
        return pet.getRace().getName()==(this.race);
    }
    
}
