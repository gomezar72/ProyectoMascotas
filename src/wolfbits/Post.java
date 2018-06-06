
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
    

public Post(Pet pet, User user, Date startDate, String type,String status, Date endDate){
    this.status="active";
    ArrayList<User> accusers=new ArrayList<User>();
    ArrayList<Comment> comments=new ArrayList<Comment>();
    this.pet=pet;
    this.startDate=startDate; //actual date
    this.endDate=endDate;//en 15 dias
}


public Pet getPet(){
    return this.pet;
}
public void setPet(Pet pet){
    this.pet=pet;
}
public User 
public  void editPost(){
    
}

public void updateEndDate(){
    
}
public void reviewPost(){
    
}        
}
//constructor: Mandatorios: mascota;user;startDate , type, accuser,comments
//constructor: todos

// agregar vista previa 