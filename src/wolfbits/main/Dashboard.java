package wolfbits.main;

import wolfbits.pet.Pet;
import wolfbits.pet.PetManager;
import java.util.ArrayList;
import java.util.List;
import wolfbits.post.Post;
import wolfbits.post.PostManager;
import wolfbits.user.User;
import wolfbits.user.UserManager;

public class Dashboard {

    private List<Pet> puppet;
    private List<Post> post;
    private List<User> users;

    private UserManager userManager;
    private PostManager postManager;
    private PetManager puppetManager;

    //login 
    public Dashboard(UserManager userManager, PostManager postManager, PetManager puppetManager) {
        this.puppet = new ArrayList();
        this.post = new ArrayList();
        this.users = new ArrayList();
        this.userManager = userManager;
        this.postManager = postManager;
        this.puppetManager = puppetManager;
    }

    public List<Pet> getMascotas() {
        return puppet;
    }

    public void setMascotas(List<Pet> mascotas) {
        this.puppet = mascotas;
    }

    public List<Post> getPublicacion() {
        return post;
    }

    public void setPublicacion(List<Post> publicacion) {
        this.post = publicacion;
    }

    public List<User> getUsuarios() {
        return users;
    }

    public void setUsuarios(List<User> usuarios) {
        this.users = usuarios;
    }

    public UserManager getUserManager() {
        return userManager;
    }

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    public PostManager getPostManager() {
        return postManager;
    }

    public void setPostManager(PostManager postManager) {
        this.postManager = postManager;
    }

    public PetManager getPuppetManager() {
        return puppetManager;
    }

    public void setPuppetManager(PetManager puppetManager) {
        this.puppetManager = puppetManager;
    }

}
