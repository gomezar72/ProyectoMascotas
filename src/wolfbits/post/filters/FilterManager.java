
package wolfbits.post.filters;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import wolfbits.post.Post;

public class FilterManager {
       private FilterByType filterByType;
       List <Post> filterByTypeResults;
       List <Post> orFilterResults ;
       List <Post> andFilterResults;
       private FilterByRace1 filterByRace1;
       private FilterByRace2 filterByRace2;
       private FilterByColour1 filterByColour1;
       private FilterByColour2 filterByColour2;
       private FilterByAge filterByAge;
       private FilterByEyeColour filterByEyeColour;
       private FilterBySize filterBySize;
       private FilterByLocalization filterByLocalization;
       private FilterByHairType filterByHairType;
       private FilterByGender filterByGender;
       private OrFilter orFilterByRace1AndRace2;
       private OrFilter orFilterByRace1Race2AndColour1;
       private OrFilter orFilterByRace1Race2Colour1AndColour2;
       private OrFilter orFilterByRace1Race2Colour1Colour2AndAge;
       private OrFilter orFilterByRace1Race2Colour1Colour2AgeAndEyeColour;
       private OrFilter orFilterByRace1Race2Colour1Colour2AgeEyeColourAndSize;
       private OrFilter orFilterByRace1Race2Colour1Colour2AgeEyeColourSizeAndLocalization;
       private OrFilter orFilterByRace1Race2Colour1Colour2AgeEyeColourSizeLocalizationAndHairType;
       private OrFilter orFilterByRace1Race2Colour1Colour2AgeEyeColourSizeLocalizationHairTypeAndGender;
       private AndFilter andFilterByRace1AndRace2;
       private AndFilter andFilterByRace1Race2AndColour1;
       private AndFilter andFilterByRace1Race2Colour1AndColour2;
       private AndFilter andFilterByRace1Race2Colour1Colour2AndAge;
       private AndFilter andFilterByRace1Race2Colour1Colour2AgeAndEyeColour;
       private AndFilter andFilterByRace1Race2Colour1Colour2AgeEyeColourAndSize;
       private AndFilter andFilterByRace1Race2Colour1Colour2AgeEyeColourSizeAndLocalization;
       private AndFilter andFilterByRace1Race2Colour1Colour2AgeEyeColourSizeLocalizationAndHairType;
       private AndFilter andFilterByRace1Race2Colour1Colour2AgeEyeColourSizeLocalizationHairTypeAndGender;
       
       
    public FilterManager (List <Post> posts)
    {
        System.out.println ("Ingrese tipo: ");
        Scanner typesc = new Scanner(System.in);
        this.filterByType = new FilterByType(typesc.nextLine());
        
        System.out.println ("Ingrese raza: ");
        Scanner race1sc = new Scanner(System.in);
        this.filterByRace1 = new FilterByRace1(race1sc.nextLine());
        
        System.out.println ("Ingrese raza: ");
        Scanner race2sc = new Scanner(System.in);
        this.filterByRace2 = new FilterByRace2(race2sc.nextLine());
        
        System.out.println ("Ingrese color: ");
        Scanner colour1sc = new Scanner(System.in);
        this.filterByColour1 = new FilterByColour1(colour1sc.nextLine());
        
        System.out.println ("Ingrese color: ");
        Scanner colour2sc = new Scanner(System.in);
        this.filterByColour2 = new FilterByColour2(colour2sc.nextLine());
        
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
        this.filterByLocalization = new FilterByLocalization(localizationsc.nextLine());
        
        System.out.println ("Ingrese tipo de pelo: ");
        Scanner hairTypesc = new Scanner(System.in);
        this.filterByHairType = new FilterByHairType(hairTypesc.nextLine());
       
        System.out.println ("Ingrese sexo: ");
        Scanner gendersc = new Scanner(System.in);
        this.filterByGender = new FilterByGender(gendersc.nextLine());
        
        this.orFilterByRace1AndRace2 = new OrFilter (filterByRace1, filterByRace2);
        this.orFilterByRace1Race2AndColour1 = new OrFilter(orFilterByRace1AndRace2, filterByColour1);
        this.orFilterByRace1Race2Colour1AndColour2 =new OrFilter (orFilterByRace1Race2AndColour1, filterByColour2);
        this.orFilterByRace1Race2Colour1Colour2AndAge = new OrFilter(orFilterByRace1Race2Colour1AndColour2, filterByAge);
        this.orFilterByRace1Race2Colour1Colour2AgeAndEyeColour = new OrFilter(orFilterByRace1Race2Colour1Colour2AndAge, filterByEyeColour);
        this.orFilterByRace1Race2Colour1Colour2AgeEyeColourAndSize = new OrFilter(orFilterByRace1Race2Colour1Colour2AgeAndEyeColour, filterBySize);
        this.orFilterByRace1Race2Colour1Colour2AgeEyeColourSizeAndLocalization = new OrFilter(orFilterByRace1Race2Colour1Colour2AgeEyeColourAndSize, filterByLocalization);
        this.orFilterByRace1Race2Colour1Colour2AgeEyeColourSizeLocalizationAndHairType = new OrFilter(orFilterByRace1Race2Colour1Colour2AgeEyeColourSizeAndLocalization, filterByHairType);
        this.orFilterByRace1Race2Colour1Colour2AgeEyeColourSizeLocalizationHairTypeAndGender = new OrFilter(orFilterByRace1Race2Colour1Colour2AgeEyeColourSizeLocalizationAndHairType, filterByGender);
    
        this.andFilterByRace1AndRace2 = new AndFilter (filterByRace1, filterByRace2);
        this.andFilterByRace1Race2AndColour1 = new AndFilter(andFilterByRace1AndRace2, filterByColour1);
        this.andFilterByRace1Race2Colour1AndColour2 =new AndFilter (andFilterByRace1Race2AndColour1, filterByColour2);
        this.andFilterByRace1Race2Colour1Colour2AndAge = new AndFilter(andFilterByRace1Race2Colour1AndColour2, filterByAge);
        this.andFilterByRace1Race2Colour1Colour2AgeAndEyeColour = new AndFilter(andFilterByRace1Race2Colour1Colour2AndAge, filterByEyeColour);
        this.andFilterByRace1Race2Colour1Colour2AgeEyeColourAndSize = new AndFilter(andFilterByRace1Race2Colour1Colour2AgeAndEyeColour, filterBySize);
        this.andFilterByRace1Race2Colour1Colour2AgeEyeColourSizeAndLocalization = new AndFilter(andFilterByRace1Race2Colour1Colour2AgeEyeColourAndSize, filterByLocalization);
        this.andFilterByRace1Race2Colour1Colour2AgeEyeColourSizeLocalizationAndHairType = new AndFilter(andFilterByRace1Race2Colour1Colour2AgeEyeColourSizeAndLocalization, filterByHairType);
        this.andFilterByRace1Race2Colour1Colour2AgeEyeColourSizeLocalizationHairTypeAndGender = new AndFilter(andFilterByRace1Race2Colour1Colour2AgeEyeColourSizeLocalizationAndHairType, filterByGender);
    
    }
    
    public void filterByType(List <Post> posts)
    {
       this.filterByTypeResults = new ArrayList<>();
      int counter = 0;
       
       for (Post post : posts)
      {
          if (this.filterByType.filter(post))
          {
          this.filterByTypeResults.add(post);
            counter += 1;
          }
      }
       System.out.println("Resultados filtro por tipo " + "(" + counter + ")" );
           
      for (Post result : this.filterByTypeResults )
      {
         System.out.println(result.getPet().toString());
    }
      
    }
    
    public void orFilter (List <Post> posts)
    {
         int counter = 0;
      
      this.orFilterResults = new ArrayList<>();
      for (Post post: this.filterByTypeResults)
      {
          if (this.orFilterByRace1Race2Colour1Colour2AgeEyeColourSizeLocalizationHairTypeAndGender.filter(post))
          {
          this.orFilterResults.add(post);
          counter += 1;
          }
      }
      
      System.out.println("Resultados filtro OR: " + "( " +  counter + ")");
           
      for (Post result : orFilterResults)
      {
         System.out.println(result.getPet().toString());
      }
  }
    
    public void andFilter (List <Post> posts)
    {
       int counter = 0;
       this.andFilterResults = new ArrayList<>();
      
       for (Post post : this.filterByTypeResults)
      {
          if (this.andFilterByRace1Race2Colour1Colour2AgeEyeColourSizeLocalizationHairTypeAndGender.filter(post))
          {
          this.andFilterResults.add(post);
          counter += 1;
          }
      }
           
      System.out.println("Resultados filtro AND: " + "( " + counter + ")");
           
      for (Post result : this.andFilterResults)
      {
         System.out.println(result.getPet().toString());
      }
  }
    
    public List<Post> getOrResults()
    {
        return this.orFilterResults;
    }
    
    public List<Post> getAndResults()
    {
        return this.andFilterResults;
    }
}
