
package wolfbits.post.filters;

import wolfbits.post.Post;

public class FilterByType extends AbstractFilter{
    private String type;
    
    public FilterByType(String type)
    {
        this.type = type;
    }
    
    @Override
    public boolean filter(Post post)
    {
        return post.getPet().getType().equals(this.type);
    }  
}
