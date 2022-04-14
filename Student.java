/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package human;

/**
 *
 * @author sunzi
 */
public class Student 
{
   private double homeworkLoad;
   private int age;
   private double experienceYear;
   private double money;
   private double hairLength;
   private double sleepHour;
   private String name;
   
   public Student (String name, int age, double homeworkLoad, double money, double hairLength, double sleepHour, double experienceYear)
   {
      this.name = name;
      this.age = age;
      this.homeworkLoad = homeworkLoad;
      this.experienceYear = experienceYear;
      this.hairLength = hairLength;
      this.sleepHour = sleepHour;
      this.money = money;
   }  
   
   //accesor 
   public String getName()
   {
      return this.name;
   }
   
   public int getAge()
   {
      return this.age;
   }
   
   public double getHomeworkLoad()
   {
      return this.homeworkLoad;
   }
   
   public double getHairLength()
   {
      return this.hairLength;
   }
   
   public double getSleepHour()
   {
      return this.sleepHour;
   }
   
   public double getMoney()
   {
      return this.money;
   }
   

   //mutator
   public void setAge (int newAge)
    {
      this.age = newAge;
    }
    
    public void setHomeworkLoad (double newHomeworkLoad)
    {
      this.homeworkLoad = newHomeworkLoad;
    }
    
    public void setMoney (double newMoney)
    {
      this.money = newMoney;
    }
    
    public void setHairLength (double newHairLength)
    {
      this.hairLength = newHairLength;
    }
    
    public void setSleepHour (double newSleepHour)
    {
      this.sleepHour = newSleepHour;
    }
    
    public void setName (String newName)
    {
      this.name = newName;
    }
    
    public void doHomework (double hour)
    {
      this.sleepHour = sleepHour-hour;
      this.hairLength = hairLength-hour*0.1;
      this.homeworkLoad = homeworkLoad - hour*0.001;
    }
    
    public void sleep (int hour)
    {
      this.sleepHour = sleepHour+hour;
    }
    
    public void paidTuition (double moneyPaid)
    {
      this.money= money + moneyPaid;
    }
    
    public void hairCut (double hairLengthCut)
    {
      this.hairLength = hairLength - hairLengthCut;
    }
    
    public void run (double km)
    {
      this.sleepHour = sleepHour-1;
    }
}