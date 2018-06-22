
package wolfbits.post.filters;

import wolfbits.post.Post;


public class OrFilter  extends CompoundFilter{

    public OrFilter(AbstractFilter filter1, AbstractFilter filter2) {
        super(filter1, filter2);
    }
    @Override
    public boolean filter (Post post)
    {
        return super.filter1.filter(post) || super.filter2.filter(post);
    }
    
}
