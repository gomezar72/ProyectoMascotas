package wolfbits;

import java.util.Date;
import java.util.List;

public class PostManager {

    public List findPet(Pet m) {
        //filtrar  y macheo 
    }

    public void post(Post p, Pet pt, Type t) {

    }

    public void reportPost(Post p) { //denuncias 

    }

    public void deletePost(Post p) {

    }

    public void changeOwner(Post p, User u) {
        //cambio de tenendosr 
    }

    public void commentPost(Post p, User u, Comment c) {//comentar

    }
    
     public void editPost(Post post) {

    }

    public void updatePost(Post post) {

    }

    public void previewPost(Post post) {

    }

    public void createPost(Pet pet, User user, Date startDate, Date endDate, String status, String type) {

        Post p = new Post(pet, user, startDate, endDate, status, type);
    }
    //ordenar, filtrar, 

}
