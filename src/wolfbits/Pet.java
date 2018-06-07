
import java.util.ArrayList;
import java.util.List;

public class Pet {

    //los atributos  los inicializé vacios por si faltan datos
    private List<Race> races;
    private Race race = “ “;
    private List<String> Colour;
    private String type = " "; //tipo, si es perro o gato
    private String name = " "; // nombre
    private String colour = " ";
    private String size = " "; // tamaño (grande, mediano, chico)
    private String age = " "; //edad
    private String description = " ";
    private String eyeColour = " ";
    private String sex = " ";
    private String hairType = " ";
    private String localization = " "; //localización, barrio o calles por el que fue visto en el caso en que sea perdido, o en el caso de encontrado barrio o calles en que vive
    private User keeper = null; // cuidador cuando es encontrado
    private User owner = null; // el dueño real cuando es perdido

    public Pet() {

    }

    public Pet(String description, String eyeColour, String sex, String hairType, String colour, User keeper, String type, String name, String size, String age, String race, String localization, User owner) {
        this.description = description;
        this.eyeColour = eyeColour;
        this.sex = sex;
        this.hairType = hairType;
        this.type = type;
        this.colour = colour;
        this.name = name;
        this.size = size;
        this.age = age;
        this.race = race;
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

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setHairType(String hairType) {
        this.hairType = hairType;
    }

    public String getHairType() {
        return hairType;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTipe(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Race getRace() {
        return race;
    }

    public void setSize(String Size) {
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

    public float getPercentageOfMatching(Pet pet) {
        int counter = 0;
        float percentageOfMatching = 0;
        if (this.type.equals(pet.getType())) {
            if (this.race.equals(pet.getRace())) {
                counter += 1;
            }
            if (this.colour.equals(pet.getColour())) {
                counter += 1;
            }
            if (this.size.equals(pet.getSize())) {
                counter += 1;
            }
            if (this.age.equals(pet.getAge())) {
                counter += 1;
            }
            if (this.eyeColour.equals(pet.getEyeColour())) {
                counter += 1;
            }
            if (this.sex.equals(pet.getSex())) {
                counter += 1;
            }
            if (this.hairType.equals(pet.getHairType())) {
                counter += 1;
            }
            if (this.localization.equals(pet.getLocalization())) {
                counter += 1;
            }
        } else {
            counter = 0;
        }

        percentageOfMatching = (counter * 100) / 8;

        return percentageOfMatching;
    }

    public void calculateMatches(List<Pet> pets) {
        List<Float> results = new ArrayList<>();

        for (Pet pet : pets) {
            if (pet != this) {
                results.add(this.getPercentageOfMatching(pet));
            }
        }

        System.out.println("MATCHES: ");
        boolean swapped = true;
        float aux;
        int j = 0;

        while (swapped) {
            swapped = false;
            j++;

            for (int i = 0; i < results.size() - j; i++) {
                if (results.get(i) < results.get((i + 1))) {
                    aux = results.get(i);
                    results.set(i, results.get(i + 1));
                    results.set((i + 1), aux);
                    swapped = true;
                }

            }
        }

        for (Float result : results) {
            if (result != 0) {
                System.out.println(result + " % de coincidencia");
            }
        }
    }

    public String toString() {
        return "Nombre: " + this.name + " Tipo: " + this.type + " Color: " + this.colour + " Edad: " + this.age + " Tamaño: " + this.size + " Color de ojos: " + this.eyeColour + " Sexo: " + this.sex + " Localización: " + this.localization;
    }

}

//contructores:mandatorios: razas, tipoAnimal,colores,sexo, tamaño,
//constructor con todo los atributos
