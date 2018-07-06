package wolfbits.main;

import wolfbits.post.filters.*;
import wolfbits.pet.*;
import wolfbits.user.*;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
       User pepe = new User();
       User carlos = new User();
       User ana = new User();
       User maria = new User();
       User lalo = new User();
       Post p1 = new Post(cat1,pepe,6/7/2018,);
       
       Race labrador = new Race("labrador", "raza mediana", "perro");
       Race collie = new Race("collie", "raza mediana", "perro");
       Race siames = new Race("siames", " ", "gato");
       Race borderCollie = new Race("border collie", "raza mediana", "perro");
       Race mezcla = new Race("border collie", "raza mediana", "perro");
       Race razaVacia = new Race(" ", " ", " ");
       
       ColourPet blanco = new ColourPet("blanco");
       ColourPet negro = new ColourPet("negro");
       ColourPet marron = new ColourPet("marron");
       ColourPet marronClaro = new ColourPet("marron claro");
       ColourPet gris = new ColourPet("gris");
       ColourPet amarillo = new ColourPet("amarillo");
       ColourPet naranja = new ColourPet("naranja");
       ColourPet colorVacio = new ColourPet (" ");
      
       
       Pet cat1 = new Pet ("tiene una mancha blanca en la espalda ", "amarillo", "macho", "pelo largo", gris, blanco, maria, "gato", " ", "pequeño", "viejo", mezcla, razaVacia, "centro", null); 
       Pet dog1 = new Pet("perro manso", "azul", "macho", "pelo corto", marron, colorVacio, pepe, "perro", "cacho", "grande","adulto", labrador, razaVacia, "villa laza", null);
       Pet dog3 = new Pet(" ", "marron", "hembra", "pelo corto", negro, marron, carlos, "perro", " luna", "grande","adulto", labrador, razaVacia, "villa laza", null);
       Pet dog2 = new Pet(" ", "gris", "macho", "pelo lanudo", blanco, colorVacio, ana, "perro", "sancho ", "mediano","adulto", collie, razaVacia, "centro", null);
       Pet cat2 = new Pet (" ", "gris", "hembra", "pelo largo", naranja, colorVacio, lalo, "gato", "milo ", "mediano", "cachorro", siames, razaVacia, "villa italia", null); 
       Pet dog4 = new Pet("perro manso", "azul", "macho", "pelo corto", marron, colorVacio, pepe, "perro", "lolo", "grande","adulto", labrador, razaVacia, "villa laza", null);
       Pet dog5 = new Pet(" ", "amarillo", "hembra", "pelo largo", negro, colorVacio, carlos, "perro", "osiris", "grande","viejo", mezcla, razaVacia, "villa laza", null);
       Pet dog6 = new Pet(" ", "gris", "hembra", "pelo corto", marron, colorVacio, ana, "perro", " violeta ", "grande","cachorro", collie, razaVacia, "centro", null);
       Pet cat3 = new Pet (" ", "negro", "macho", "pelo corto", negro, colorVacio, maria, "gato", " ", "grande", "viejo", mezcla, razaVacia, "villa aguirre", null); 
       Pet dog7 = new Pet("", "azul", "hembra", "pelo largo", marron, colorVacio, pepe, "perro", " ", "mediano","adulto", mezcla, razaVacia, "villa laza", null);
       Pet dog8 = new Pet(" ", "marron", "hembra", "pelo corto", blanco, negro, carlos, "perro", " ", "chico","cachorro", mezcla, razaVacia, "calvario", null);
       Pet dog9 = new Pet(" ", "gris", "macho", "pelo lanudo", marron,  colorVacio, ana, "perro", " ", "mediano","adulto", mezcla, razaVacia, "centro", null);
       Pet cat4 = new Pet (" ", "amarillo", "hembra", "pelo largo", naranja, colorVacio, lalo, "gato", " ", "mediano", "joven", mezcla, razaVacia, "villa italia", null); 
       Pet dog10 = new Pet("", "azul", "macho", "pelo largo", marronClaro, colorVacio, pepe, "perro", "", "grande","adulto", mezcla, razaVacia, "villa laza", null);
       Pet dog11= new Pet(" ", "amarillo", "hembra", "pelo largo", negro, colorVacio,carlos, "perro", "", "chico","cachorro", mezcla, razaVacia,"villa laza", null);
       Pet dog12 = new Pet(" ", "gris", "hembra", " ", negro, colorVacio, ana, "perro", "  ", "grande","joven", mezcla, razaVacia, "centro", null);
       
       
       
       List <Pet> pets = new ArrayList<>();
       pets.add(cat1);
       pets.add(dog1);
       pets.add(dog2);
       pets.add(dog3);
       pets.add(cat2);
       pets.add(dog4);
       pets.add(dog5);
       pets.add(dog6);
       pets.add(cat3);
       pets.add(dog7);
       pets.add(dog8);
       pets.add(dog9);
       pets.add(cat4);
       pets.add(dog10);
       pets.add(dog11);
       pets.add(dog12);
       
     // dog1.calculateMatches(pets);
      
      /*FilterByRace filterByRace = new FilterByRace(collie);
      
      int counter = 0;
      
      List <Pet> filterByRaceResults = new ArrayList<>();
      for (Pet pet : pets)
      {
          
          if (filterByRace.filter(pet))
          {
          filterByRaceResults.add(pet);
          counter += 1;
          }
      }
      
      System.out.println("Resultados filtro por raza: ");
      System.out.println("cantidad de resultados: " + counter);
      
      for (Pet result : filterByRaceResults)
      {
      System.out.println(result.toString());
      }
    
      FilterByColour filterByColour = new FilterByColour("marron");
      AndFilter filterByRaceAndColour = new AndFilter(filterByRace, filterByColour);
      
      int counter2 = 0;
      List <Pet> filterByRaceAndColourResults = new ArrayList<>();
      for (Pet pet : pets)
      {
          if (filterByRaceAndColour.filter(pet))
          {
          filterByRaceAndColourResults.add(pet);
          counter2 += 1;
          }
      }
      
      System.out.println("Resultados filtro por raza y color: ");
      System.out.println("cantidad de resultados: " + counter2);
      
      for (Pet result : filterByRaceAndColourResults)
      {
         System.out.println(result.toString());*/
      FilterManager filter = new FilterManager(pets);
      filter.filterByType(pets);
      filter.orFilter(pets);
      filter.andFilter(pets);
      
      dog1.calculateMatches(filter.getAndResults());
      dog1.calculateMatches(filter.getOrResults());
      }
      
 }


