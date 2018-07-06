package wolfbits.post;

import wolfbits.pet.Pet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import wolfbits.user.User;

public class Post {

    private Pet pet;
    private User user;
    private Date startDate;//automomatico de la publicacion 
    private Date endDate;// fecha de vencimiento - reloj 
    private String status; //activo, inactivo, denunciado
    private String type;// buscado, en adopcion, encontrado
    private List<User> accusers;//Denunciantes - en el metodo agregar contador de denuncias
    private List<Comment> comments;//comentarios
    private float percentageOfMatching = 0;

    public Post(Pet pet, User user, Date startDate, String type, String status, Date endDate) {
        this.status = "active";
        this.accusers = new ArrayList<User>();
        this.comments = new ArrayList<Comment>();
        this.pet = pet;
        this.startDate = startDate; //actual date
        this.endDate = endDate;//en 15 dias
        this.type = type;
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
    
        public void setPercentageOfMatching(float percentageOfMatching) {
        this.percentageOfMatching = percentageOfMatching;
    }

    public float getPercentageOfMatching() {
        return percentageOfMatching ;
    }
    
    public void calculatePercentageOfMatching(Post post) {
        int counterOfMatching = 0;
        int counterOfAttributes = 0;
       
        if (this.type.equals(post.getPet().getType())) {
            if (this.getPet().getRace1() != null)
            {
                if (this.getPet().getRace1().equals(post.getPet().getRace1()))
                {
                    counterOfMatching += 1;
                }
                counterOfAttributes += 1;
            }
            if (this.getPet().getColour1() != null)
            {
                if (this.getPet().getColour1().equals(post.getPet().getColour1())) 
                {
                    counterOfMatching += 1;
                }
                counterOfAttributes += 1;
            }
            if (this.getPet().getRace2() != null)
            {
                if (this.getPet().getRace2().equals(post.getPet().getRace2()))
                {
                    counterOfMatching += 1;
                }
                counterOfAttributes += 1;
            }
            if (this.getPet().getColour2() != null)
            {
                if (this.getPet().getColour2().equals(post.getPet().getColour2())) 
                {
                    counterOfMatching += 1;
                }
                counterOfAttributes += 1;
            }
            if (!this.getPet().getSize().equals(" "))
            {
                if (this.getPet().getSize().equals(post.getPet().getSize()))
                {
                    counterOfMatching += 1;
                }
                counterOfAttributes += 1;
            }
            if (!this.getPet().getAge().equals(" "))
            {
                if (this.getPet().getAge().equals(post.getPet().getAge())) 
                {
                    counterOfMatching += 1;
                }
                counterOfAttributes += 1;
            }
            if (!this.getPet().getEyeColour().equals(" "))
            {
                if (this.getPet().getEyeColour().equals(post.getPet().getEyeColour())) 
                {
                    counterOfMatching += 1;
                }
                counterOfAttributes += 1;
            }
            if (!this.getPet().getGender().equals(" "))
            {
                if (this.getPet().getGender().equals(post.getPet().getGender())) 
                {
                    counterOfMatching += 1;
                }
                counterOfAttributes += 1;
            }
            if (!this.getPet().getHairType().equals(" "))
            {
                if (this.getPet().getHairType().equals(post.getPet().getHairType())) 
                {
                    counterOfMatching += 1;
                }
                counterOfAttributes += 1;
            }
            if (!this.getPet().getLocalization().equals(" "))
            {
                if (this.getPet().getLocalization().equals(post.getPet().getLocalization())) 
                {
                    counterOfMatching += 1;
                }
                counterOfAttributes += 1;
            }
        } else {
            counterOfMatching = 0;
        }
        if (counterOfMatching != 0 || counterOfAttributes != 0)
        {
        this.percentageOfMatching = (counterOfMatching * 100) / counterOfAttributes;
        }
        else
        {
            this.percentageOfMatching = 0;
        }
        post.setPercentageOfMatching(percentageOfMatching);
    }

    public void calculateMatches(List<Post> posts) {
        List<Post> results = new ArrayList<>();

        for (Post post : posts) {
            if (post != this) 
            {
              this.calculatePercentageOfMatching(post);
                results.add(post);
            }
        }

        System.out.println("MATCHES: ");
        boolean swapped = true;
        Post aux;
        int j = 0;

        while (swapped) {
            swapped = false;
            j++;

            for (int i = 0; i < results.size() - j; i++) {
                if (results.get(i).getPercentageOfMatching() < results.get((i + 1)).getPercentageOfMatching()) {
                    aux = results.get(i);
                    results.set(i, results.get(i + 1));
                    results.set((i + 1), aux);
                    swapped = true;
                }

            }
        }

        for (Post result : results) {
            if (result.getPercentageOfMatching() != 0) 
            {
                System.out.println(result.getPet().toString() + result.getPercentageOfMatching() + " % de coincidencia");
            }
        }
    }

}
//constructor: Mandatorios: mascota;user;startDate , type, accuser,comments
//constructor: todos

// agregar vista previa 
