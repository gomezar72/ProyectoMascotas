
package wolfbits.post.filters;

import wolfbits.post.Post;

public class FilterByGender extends AbstractFilter{
    private String gender;
    
    public FilterByGender(String sex)
    {
        this.gender = gender;
    }
    
    @Override
    public boolean filter(Post post)
    {
        return post.getPet().getGender().equals(this.gender);
    }  
}
