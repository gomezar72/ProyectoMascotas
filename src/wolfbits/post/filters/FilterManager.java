
package wolfbits.post.filters;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import wolfbits.pet.Pet;

public class FilterManager {
       private FilterByType filterByType;
       List <Pet> filterByTypeResults;
       List <Pet> orFilterResults;
       List <Pet> andFilterResults;
       private FilterByRace filterByRace;
       private FilterByColour filterByColour;
       private FilterByAge filterByAge;
       private FilterByEyeColour filterByEyeColour;
       private FilterBySize filterBySize;
       private FilterByLocalization filterByLocalization;
       private FilterByHairType filterByHairType;
       private FilterByGender filterByGender;
       private OrFilter orFilterByRaceAndColour;
       private OrFilter orFilterByRaceColourAndAge;
       private OrFilter orFilterByRaceColourAgeAndEyeColour;
       private OrFilter orFilterByRaceColourAgeEyeColourAndSize;
       private OrFilter orFilterByRaceColourAgeEyeColourSizeAndLocalization;
       private OrFilter orFilterByRaceColourAgeEyeColourSizeLocalizationAndHairType;
       private OrFilter orFilterByRaceColourAgeEyeColourSizeLocalizationHairTypeAndSex;
       private AndFilter andFilterByRaceAndColour;
       private AndFilter andFilterByRaceColourAndAge;
       private AndFilter andFilterByRaceColourAgeAndEyeColour;
       private AndFilter andFilterByRaceColourAgeEyeColourAndSize;
       private AndFilter andFilterByRaceColourAgeEyeColourSizeAndLocalization;
       private AndFilter andFilterByRaceColourAgeEyeColourSizeLocalizationAndHairType;
       private AndFilter andFilterByRaceColourAgeEyeColourSizeLocalizationHairTypeAndSex;
       
    public FilterManager ()
  {
      
  }
    
    public FilterManager (List <Pet> pets)
    {
        System.out.println ("Ingrese tipo: ");
        Scanner typesc = new Scanner(System.in);
        
        this.filterByType = new FilterByType(typesc.nextLine());
        
        System.out.println ("Ingrese raza: ");
        Scanner racesc = new Scanner(System.in);
        this.filterByRace = new FilterByRace(racesc.nextLine());
        
        System.out.println ("Ingrese color: ");
        Scanner coloursc = new Scanner(System.in);
        this.filterByColour = new FilterByColour(coloursc.nextLine());
        
        System.out.println ("Ingrese edad: ");
        Scanner agesc = new Scanner(System.in);
        this.filterByAge = new FilterByAge(agesc.nextLine());
        
        System.out.println ("Ingrese color de ojos: ");
        Scanner eyeColoursc = new Scanner(System.in);
        this.filterByEyeColour = new FilterByEyeColour(eyeColoursc.nextLine());
        
        System.out.println ("Ingrese tamaño: ");
        Scanner sizesc = new Scanner(System.in);
        this.filterBySize = new FilterBySize(sizesc.nextLine());
        
        System.out.println ("Ingrese localización: ");
        Scanner localizationsc = new Scanner(System.in);
        FilterByLocalization filterByLocalization = new FilterByLocalization(localizationsc.nextLine());
        
        System.out.println ("Ingrese tipo de pelo: ");
        Scanner hairTypesc = new Scanner(System.in);
        this.filterByHairType = new FilterByHairType(hairTypesc.nextLine());
       
        System.out.println ("Ingrese sexo: ");
        Scanner sexsc = new Scanner(System.in);
        this.filterByGender = new FilterByGender(sexsc.nextLine());
        
        this.orFilterByRaceAndColour = new OrFilter(filterByRace, filterByColour);
        this.orFilterByRaceColourAndAge = new OrFilter(orFilterByRaceAndColour, filterByAge);
        this.orFilterByRaceColourAgeAndEyeColour = new OrFilter(orFilterByRaceColourAndAge, filterByEyeColour);
        this.orFilterByRaceColourAgeEyeColourAndSize = new OrFilter(orFilterByRaceColourAgeAndEyeColour, filterBySize);
        this.orFilterByRaceColourAgeEyeColourSizeAndLocalization = new OrFilter(orFilterByRaceColourAgeEyeColourAndSize, filterByLocalization);
        this.orFilterByRaceColourAgeEyeColourSizeLocalizationAndHairType = new OrFilter(orFilterByRaceColourAgeEyeColourSizeAndLocalization, filterByHairType);
        this.orFilterByRaceColourAgeEyeColourSizeLocalizationHairTypeAndSex = new OrFilter(orFilterByRaceColourAgeEyeColourSizeLocalizationAndHairType, filterByGender);
    
        this.andFilterByRaceAndColour = new AndFilter(filterByRace, filterByColour);
        this.andFilterByRaceColourAndAge = new AndFilter(andFilterByRaceAndColour, filterByAge);
        this.andFilterByRaceColourAgeAndEyeColour = new AndFilter(andFilterByRaceColourAndAge, filterByEyeColour);
        this.andFilterByRaceColourAgeEyeColourAndSize = new AndFilter(andFilterByRaceColourAgeAndEyeColour, filterBySize);
        this.andFilterByRaceColourAgeEyeColourSizeAndLocalization = new AndFilter(andFilterByRaceColourAgeEyeColourAndSize, filterByLocalization);
        this.andFilterByRaceColourAgeEyeColourSizeLocalizationAndHairType = new AndFilter(andFilterByRaceColourAgeEyeColourSizeAndLocalization, filterByHairType);
        this.andFilterByRaceColourAgeEyeColourSizeLocalizationHairTypeAndSex = new AndFilter(andFilterByRaceColourAgeEyeColourSizeLocalizationAndHairType, filterByGender);
        
         this.filterByTypeResults = new ArrayList<>();
      
       for (Pet pet : pets)
      {
          if (this.filterByType.filter(pet))
          {
          this.filterByTypeResults.add(pet);
          }
      }
      
    }
    
    public void orFilter (List <Pet> pets)
    {
         int counter = 0;
      
      this.orFilterResults = new ArrayList<>();
      for (Pet pet : this.filterByTypeResults)
      {
          if (this.orFilterByRaceColourAgeEyeColourSizeLocalizationHairTypeAndSex.filter(pet))
          {
          this.orFilterResults.add(pet);
          counter += 1;
          }
      }
      
      System.out.println("Resultados filtro OR: " + "( " +  counter + ")");
           
      for (Pet result : orFilterResults)
      {
         System.out.println(result.toString());
    }
  }
    
    public void andFilter (List <Pet> pets)
    {
       int counter = 0;
       this.andFilterResults = new ArrayList<>();
      
       for (Pet pet : this.filterByTypeResults)
      {
          if (this.andFilterByRaceColourAgeEyeColourSizeLocalizationHairTypeAndSex.filter(pet))
          {
          this.andFilterResults.add(pet);
          counter += 1;
          }
      }
           
      System.out.println("Resultados filtro AND: " + "( " + counter + ")");
           
      for (Pet result : this.andFilterResults)
      {
         System.out.println(result.toString());
    }
  }
}
