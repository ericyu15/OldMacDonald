class Farm 
{     
   //your code here
   private Animal[] aBunchOfAnimals = new Animal[4];    
   public Farm()     {       
      aBunchOfAnimals[0] = new NamedCow("cow","Jngai","moo");           
      aBunchOfAnimals[1] = new Chick("chick","cheep","cluck");       
      aBunchOfAnimals[2] = new Pig("pig","oink");
      aBunchOfAnimals[3] = new Cow("cow","moo");    
  }         
   public void animalSounds()    {       
     for (int nI=0; nI < aBunchOfAnimals.length; nI++)       {          
       System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());       
      }    
      System.out.println("The cow is known as " + ((NamedCow)aBunchOfAnimals[0]).getName());
    } 
} 

