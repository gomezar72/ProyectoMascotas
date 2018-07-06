package wolfbits.pet;

import java.util.List;
import wolfbits.user.User;

public class Pet {

    //los atributos  los inicializé vacios por si faltan datos
    private List<Race> races;
    private Race race1 = null;
    private Race race2 = null;
    private List<ColourPet> Colour;
    private String type = " "; //tipo, si es perro o gato
    private String name = " "; // nombre
    private ColourPet colour1 = null;
    private ColourPet colour2 = null;
    private String size = " "; // tamaño (grande, mediano, chico)
    private String age = " "; //edad
    private String description = " ";
    private String eyeColour = " ";
    private String gender = " ";
    private String hairType = " ";
    private String localization = " "; //localización, barrio o calles por el que fue visto en el caso en que sea perdido, o en el caso de encontrado barrio o calles en que vive
    private User keeper = null; // cuidador cuando es encontrado
    private User owner = null; // el dueño real cuando es perdido
    //private float percentageOfMatching = 0;

    public Pet() {

    }

    public Pet(String description, String eyeColour, String gender, String hairType, ColourPet colour1, ColourPet colour2, User keeper, String type, String name, String size, String age, Race race1, Race race2, String localization, User owner) {
        this.description = description;
        this.eyeColour = eyeColour;
        this.gender = gender;
        this.hairType = hairType;
        this.type = type;
        this.colour1 = colour1;
        this.colour2 = colour2;
        this.name = name;
        this.size = size;
        this.age = age;
        this.race1 = race1;
        this.race2 = race2;
        this.localization = localization;
        this.owner = owner;
        this.keeper = keeper;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setHairType(String hairType) {
        this.hairType = hairType;
    }

    public String getHairType() {
        return hairType;
    }

    public void setColour1(ColourPet colour1) {
        this.colour1 = colour1;
    }

    public ColourPet getColour1() {
        return colour1;
    }
    
    public void setColour2(ColourPet colour2) {
        this.colour2 = colour2;
    }

    public ColourPet getColour2() {
        return colour2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTYpe(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setRace1(Race race1) {
        this.race1 = race1;
    }

    public Race getRace1() {
        return race1;
    }
    
    public void setRace2(Race race2) {
        this.race2 = race2;
    }

    public Race getRace2() {
        return race2;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public User getOwner() {
        return owner;
    }

    public void setKeeper(User keeper) {
        this.keeper = keeper;
    }

    public User getKeeper() {
        return keeper;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public String getLocalization() {
        return localization;
    }
    
    /*public void setPercentageOfMatching(float percentageOfMatching) {
        this.percentageOfMatching = percentageOfMatching;
    }

    public float getPercentageOfMatching() {
        return percentageOfMatching ;
    }*/
    
     @Override
    public String toString() {
        return "Nombre: " + this.name + " Tipo: " + this.type + " Colores: " + this.colour1.getName() + " , " + this.colour2.getName() + " Edad: " + this.age + " Tamaño: " + this.size + " Color de ojos: " + this.eyeColour + " Sexo: " + this.gender + " Localización: " + this.localization + "Raza: " + this.race1.getName() + this.race2.getName();
    }

   /* public void calculatePercentageOfMatching(Post post) {
        int counterOfMatching = 0;
        int counterOfAttributes = 0;
       
        if (this.type.equals(post.getPet().getType())) {
            if (this.race1 != null)
            {
                if (this.race1.equals(post.getPet().getRace1()))
                {
                    counterOfMatching += 1;
                }
                counterOfAttributes += 1;
            }
            if (this.colour1 != null)
            {
                if (this.colour1.equals(post.getPet().getColour1())) 
                {
                    counterOfMatching += 1;
                }
                counterOfAttributes += 1;
            }
            if (this.race2 != null)
            {
                if (this.race2.equals(post.getPet().getRace2()))
                {
                    counterOfMatching += 1;
                }
                counterOfAttributes += 1;
            }
            if (this.colour2 != null)
            {
                if (this.colour2.equals(post.getPet().getColour2())) 
                {
                    counterOfMatching += 1;
                }
                counterOfAttributes += 1;
            }
            if (!this.size.equals(" "))
            {
                if (this.size.equals(post.getPet().getSize()))
                {
                    counterOfMatching += 1;
                }
                counterOfAttributes += 1;
            }
            if (!this.age.equals(" "))
            {
                if (this.age.equals(post.getPet().getAge())) 
                {
                    counterOfMatching += 1;
                }
                counterOfAttributes += 1;
            }
            if (!this.eyeColour.equals(" "))
            {
                if (this.eyeColour.equals(post.getPet().getEyeColour())) 
                {
                    counterOfMatching += 1;
                }
                counterOfAttributes += 1;
            }
            if (!this.gender.equals(" "))
            {
                if (this.gender.equals(post.getPet().getGender())) 
                {
                    counterOfMatching += 1;
                }
                counterOfAttributes += 1;
            }
            if (!this.hairType.equals(" "))
            {
                if (this.hairType.equals(post.getPet().getHairType())) 
                {
                    counterOfMatching += 1;
                }
                counterOfAttributes += 1;
            }
            if (!this.localization.equals(" "))
            {
                if (this.localization.equals(post.getPet().getLocalization())) 
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
        Pet aux;
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
    }*/
}

//contructores:mandatorios: razas, tipoAnimal,colores,sexo, tamaño,
//constructor con todo los atributos
