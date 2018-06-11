package wolfbits.pet;

import java.util.ArrayList;
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

    public float getPercentageOfMatching(Pet pet) {
        int counter = 0;
        float percentageOfMatching = 0;
        if (this.type.equals(pet.getType())) {
            if (this.race1.equals(pet.getRace1())) {
                counter += 1;
            }
            if (this.colour1.equals(pet.getColour1())) {
                counter += 1;
            }
            if (this.race2.equals(pet.getRace2())) {
                counter += 1;
            }
            if (this.colour2.equals(pet.getColour2())) {
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
            if (this.gender.equals(pet.getGender())) {
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

        percentageOfMatching = (counter * 100) / 10;

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
        return "Nombre: " + this.name + " Tipo: " + this.type + " Colores: " + this.colour1 + " , " + this.colour2 + " Edad: " + this.age + " Tamaño: " + this.size + " Color de ojos: " + this.eyeColour + " Sexo: " + this.gender + " Localización: " + this.localization + "Raza: " + this.race1 + this.race2;
    }

}

//contructores:mandatorios: razas, tipoAnimal,colores,sexo, tamaño,
//constructor con todo los atributos
