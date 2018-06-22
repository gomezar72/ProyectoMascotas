
package wolfbits.post.filters;

import wolfbits.post.Post;

public class FilterByAge extends AbstractFilter{
    private String age;
    
    public FilterByAge(String age)
    {
        this.age = age;
    }
    
    @Override
    public boolean filter(Post post)
    {
        return post.getPet().getAge().equals(this.age);
    }  

}
