package wolfbits;

import java.util.Date;
import java.util.List;

public class PostManager {

    public List findPet(Pet m) {//filtrar  y macheo 
        
    }

    public void post(Post p, Pet pt, Type t) {

    }

    public void reportPost(Post p) { //denuncias 

    }

    public void deletePost(Post p) { //borrar post

    }

    public void changeOwner(Post p, User u) {//cambio de tenendor 
        
    }

    public void commentPost(Post p, User u, Comment c) {//comentar post

    }
    
     public void editPost(Post post) {//editar port

    }

    public void updatePost(Post post) {//actualizar post

    }

    public void previewPost(Post post) {// vista previa post
        
    }

    public void createPost(Pet pet, User user, Date startDate, Date endDate, String status, String type) {

        Post p = new Post(pet, user, startDate, endDate, status, type);
    }
    //ordenar, filtrar, 

}
