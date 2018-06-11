
package wolfbits.post.filters;

import wolfbits.pet.Pet;

public class FilterByRace1 extends AbstractFilter {
    private String race;
    
    public FilterByRace1(String race)
    {
        this.race = race;
    }
    
    @Override
    public boolean filter(Pet pet)
    {
        return pet.getRace1().getName()==(this.race);
    }
    
}
