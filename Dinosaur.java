package Dinosaur1;
/**
 * Write a description of class Dinosaur here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dinosaur
{
    // instance variables - replace the example below with your own
    private String type;
    private int age;
    private String gender;
    private int health;// a range between 0 - 100

    /**
     * Default constructor for objects of class Dinosaur
     */
    public Dinosaur()
    {
        this.type = "Dino";
        this.age = 0;
        // write code that will assign a gender to this dino. 
        // 50% should be male and 50% should be female. 
        if(Math.random() < 0.5)
            this.gender = "M";
        else
            this.gender = "F";

        this.health = 10;
    }

    /**
     * Explicit constructor for the Dino class.
     */
    public Dinosaur(String t)
    {
        this.type = t;
        this.age = 0;
        this.health = 10;
        // write code to set gender to m/f 50%.
        if(Math.random() < 0.5)
            this.gender = "M";
        else
            this.gender = "F";
    }

    /*********    Getters  *****************/
    // Getters return the private instance data.
    public String getType()
    {
        return this.type;
    }

    public String getGender()
    {
        return this.gender;
    }

    public int getHealth()
    {
        return this.health;
    }
    //public int getHealth()
    /*********    Setters  *****************/

    public void setType(String t)
    {
        this.type = t;
    }

    
    
    public boolean equals(Dinosaur d)
    {
        // write code that will return true if two dinos are "equal"
        // return true if they're equal, false otherwise.
        boolean same = false;
        if( this.type.equals(d.type))
        {
            if( this.gender.equals(d.getGender()))
            {
                int healthDiff = this.health - d.getHealth();
                if( Math.abs(healthDiff) < 10)
                    same = true;
            }
        }
        return same;
    }

    public void ageUp()
    {
        if(this.health > 0) // the dino is alive
        {
            this.age++;

            // if age is less than 10, health increases by 10
            if( this.age < 10 )
                this.health = this.health + 10;
            // No change to health if age is 10 and 24

            // Health decrease by 5 if age is between 25 and 30
            else if ( this.age >=25 && this.age <=30)
                this.health-=5;
            // Health decreases by 10 if age is greater than 30
            else if ( this.age >30)
                this.health-=10;
        }

    }    

    /**
     * Return this Dino as a string
     */
    public String toString()
    {
        String answer = this.type + " " + this.age + " " + this.health+ " "+this.gender;
        return answer;
    }
}