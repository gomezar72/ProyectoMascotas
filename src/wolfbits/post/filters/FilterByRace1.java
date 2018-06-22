
package wolfbits.post.filters;

import wolfbits.post.Post;

public class FilterByRace1 extends AbstractFilter {
    private String race1;
    
    public FilterByRace1(String race1)
    {
        this.race1 = race1;
    }
    
    @Override
    public boolean filter(Post post)
    {
        return post.getPet().getRace1().getName().equals(this.race1);
    }
    
}
