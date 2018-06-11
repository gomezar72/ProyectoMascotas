
package wolfbits.pet;

import java.io.File;


public class ColourPet {
   
    private String name;
    private File photo;

    public ColourPet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

   
    
    
}
