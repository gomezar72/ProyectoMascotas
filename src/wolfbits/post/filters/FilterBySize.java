
package wolfbits.post.filters;

import wolfbits.post.Post;

public class FilterBySize extends AbstractFilter {
    private String size;
    
    public FilterBySize(String size)
    {
        this.size = size;
    }
    
    @Override
    public boolean filter(Post post)
    {
        return post.getPet().getSize().equals(this.size);
    }  
}
