package wolfbits;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private Pet pet;
    private User user;
    private Date startDate;//automomatico de la publicacion 
    private Date endDate;// fecha de vencimiento - reloj 
    private String status; //activo, inactivo, denunciado
    private String type;// buscado, en adopcion, encontrado
    private List<User> accusers;//Denunciantes - en el metodo agregar contador de denuncias
    private List<Comment> comments;//comentarios

    public Post(Pet pet, User user, Date startDate, String type, String status, Date endDate) {
        this.status = "active";
        this.accusers = new ArrayList<User>();
        this.comments = new ArrayList<Comment>();
        this.pet = pet;
        this.startDate = startDate; //actual date
        this.endDate = endDate;//en 15 dias
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<User> getAccusers() {
        return accusers;
    }

    public void setAccusers(List<User> accusers) {
        this.accusers = accusers;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Pet getPet() {
        return this.pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void createPost(Post post) {

    }

    public void editPost(Post post) {

    }

    public void updatePost(Post post) {

    }

    public void previewPost(Post post) {

    }

}
//constructor: Mandatorios: mascota;user;startDate , type, accuser,comments
//constructor: todos

// agregar vista previa 
