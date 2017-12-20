package exercises;

/*
 * File: Donor.java
 *
 * Description: This class represents a donor to an
 *              organization. It stores the donor's name and rating.
 *              The main() method tests the class's methods.
 *
 * Assignment:
 *            1) Add a new level "low" to this class (in addition to 
 *                "high", "medium", "none")
 *             2) Add a new method:
 *                public void updateRating(double amt){ } which 
 *                recalculates a donor's rating according to the following 
 *                schedule:
 *                a) amt = 0 - none
 *                b) amt < $100 - low level
 *                c) amt >= $100 and amt < $1000 - medium level
 *                d) amt >= $1000 - high level
 *                updateRating() should change the instance variable: 
 *                rating to the new value
 *             3) Modify this template to include an address variable and 
 *                change the constructor to accept this new variable 
 *                (along with the parameters). Basically, the object
 *                stores the donor's name, address and rating
 *             4) Create a new donor (donor4) with an initial "low" rating,
 *                a) then let donor4 contribute $150,
 *                b) print this donor's new rating to the CRT
 *             5) Modify the rest of the program (as needed) so that it compiles and runs correctly
 *
 */

public class DonorBryan
{
    private String name = "no name";
    private String rating = "none";
    private String address = "no address";

    /**
     * DonorBryan() constructor sets the object's name and rating
     * @param str -- a String giving the donor's name
     * @param str2 -- a String giving the donor's rating
     */
    public DonorBryan(String str, String str2, String str3)
    {
        name = str;
        rating = str2;
        address = str3;
    }

    /**
     * getName() returns the donor's name
     * @return a String giving the person's name
     */
    public String getName()
    {
        return name;
    }

    /**
     * getRating() returns the donor's rating
     * @return a String giving the person's rating
     */
    public String getRating()
    {
        if (rating.equals ("high")){
            return "high";
        }else if (rating.equals ("medium")){
            return "medium";
        }else if (rating.equals("low")){
        	return "low";
        }else{
        	return "none";
        }
    }
    
    public String getAddress(){
    	return address;
    }

    public void updateRating(double amt){ 
    	if (amt == 0){
    		this.rating = "none";
    	}else if (amt < 100){
    		this.rating = "low";
    	}else if (amt >= 100 && amt < 1000){
    		this.rating = "medium";
    	}else if (amt > 1000){
    		this.rating = "high";
    	}
    }
    /**
     * main() creates three DonorBryan instances and tests this
     *  classes methods.
     */
    public static void main (String argv[])
    {
        DonorBryan donor1 = new DonorBryan("NewDonor", "high", "NY");
        System.out.println("Donor's name is " + donor1.getName());
        System.out.println(donor1.getName() +"'s address is " + donor1.getAddress());
        System.out.println(donor1.getName() + "'s rating is " + donor1.getRating() +"\n");

        DonorBryan donor2 = new DonorBryan("NewDonor2", "medium", "SC");
        System.out.println("Donor's name is " + donor2.getName());
        System.out.println(donor2.getName() + "'s address is " + donor2.getAddress());
        System.out.println(donor2.getName() + "'s rating is " + donor2.getRating()+"\n");

        DonorBryan donor3 = new DonorBryan("NewDonor3", "none", "GA");
        System.out.println("Donor's name is " + donor3.getName());
        System.out.println(donor3.getName() +"'s address is " + donor3.getAddress());
        System.out.println(donor3.getName() + "'s rating is " + donor3.getRating()+"\n");
        
        DonorBryan donor4 = new DonorBryan("NewDonor4", "low", "CA");
        System.out.println("Donor's name is " + donor4.getName());
        System.out.println(donor4.getName() +"s address is " + donor4.getAddress());
        System.out.println(donor4.getName() + "'s rating is " + donor4.getRating()+"\n");
        donor4.updateRating(150);
        System.out.println(donor4.getName() + " just donated $150.");
        System.out.println(donor4.getName() + "'s new rating is " + donor4.getRating()+"\n");
        
    } // main()
} // DonorBryan