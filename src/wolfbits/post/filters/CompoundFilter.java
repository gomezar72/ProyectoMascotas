
package wolfbits.post.filters;

import wolfbits.post.Post;

public abstract class CompoundFilter extends AbstractFilter{
    protected AbstractFilter filter1;
    protected AbstractFilter filter2;
    
    public CompoundFilter (AbstractFilter f1, AbstractFilter f2)
    {
        this.filter1 = f1;
        this.filter2 = f2;
    }
    
    /**
     *
     * @param pet
     * @return
     */
    @Override
    public abstract boolean filter (Post post);
    
}
