
package wolfbits.post.filters;

import wolfbits.pet.Pet;

public class AndFilter extends CompoundFilter{

    public AndFilter(AbstractFilter filter1, AbstractFilter filter2) {
        super(filter1, filter2);
    }
    @Override
    public boolean filter (Pet pet)
    {
        return super.filter1.filter(pet) && super.filter2.filter(pet);
    }
}
