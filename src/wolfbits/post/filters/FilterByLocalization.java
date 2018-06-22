
package wolfbits.post.filters;

import wolfbits.post.Post;

public class FilterByLocalization extends AbstractFilter{
    private String localization;
    
    public FilterByLocalization(String localization)
    {
        this.localization = localization;
    }
    
    @Override
    public boolean filter(Post post)
    {
        return post.getPet().getLocalization().equals(this.localization);
    }  
}
