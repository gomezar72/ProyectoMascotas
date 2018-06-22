
package wolfbits.post.filters;

import wolfbits.post.Post;


public class FilterByEyeColour extends AbstractFilter{
    private String eyeColour;
    
    public FilterByEyeColour(String eyeColour)
    {
        this.eyeColour = eyeColour;
    }
    
    @Override
    public boolean filter(Post post)
    {
        return post.getPet().getEyeColour().equals(this.eyeColour);
    }  
}
