
package wolfbits.post.filters;

import wolfbits.post.Post;

public class FilterByHairType extends AbstractFilter{
    private String hairType;
    
    public FilterByHairType(String hairType)
    {
        this.hairType = hairType;
    }
    
    @Override
    public boolean filter(Post post)
    {
        return post.getPet().getHairType().equals(this.hairType);
    }  
}
