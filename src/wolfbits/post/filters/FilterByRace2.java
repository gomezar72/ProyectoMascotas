package wolfbits.post.filters;

import wolfbits.post.Post;

public class FilterByRace2 extends AbstractFilter {
    private String race2;
    
    public FilterByRace2(String race2)
    {
        this.race2= race2;
    }
    
    @Override
    public boolean filter(Post post)
    {
        return post.getPet().getRace2().getName().equals(this.race2);
    }
    
}
