
package wolfbits.post.filters;

import wolfbits.post.Post;

public class FilterByColour1  extends AbstractFilter{
    private String colour1;
    
    public FilterByColour1(String colour1)
    {
        this.colour1 = colour1;
    }
    
    @Override
    public boolean filter(Post post)
    {
        return post.getPet().getColour1().getName().equals(this.colour1);
    }  
}
