package Question;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count=0,count2=0,notaCount=0;
        char party1='A'; 
        char party2='B';
        char nota='N';
        char agent='Z';
        System.out.println("Please Enter total Number of Votes");
        Scanner obj=new Scanner(System.in);
        int total_votes= obj.nextInt();
        System.out.println("Please Vote Here!");
        System.out.println("________________________________________");
        System.out.println("1.Party1 Symbol is 'A'.");

        System.out.println("________________________________________");
        System.out.println("2.Party2 Symbol is 'B'.");

        System.out.println("________________________________________");
        System.out.println("3. For Nota Type 'N' Only. ");

        System.out.println("________________________________________");
        System.out.println("Please Type your Symbol.");

        System.out.println("________________________________________");
        
        
        for(int i=0;i<total_votes;i++)
        {
        char symbol=obj.next().charAt(0);
        int comp=Character.compare(party1,symbol);
     
         if(comp==0)
         {
        	count++;
         }
         
         int comp2=Character.compare(party2, symbol);
         if(comp2==0)
         {
        	count2++;
         }
         
         int comp3=Character.compare(nota, symbol);
         if(comp3==0)
         {
        	 notaCount++;
         }
     	int agent11=Character.compare(agent, symbol);
         if(agent11==0)
         {
        	 System.out.println("		>>>*_*<<<	");	
        	 System.out.println("Agent has Terminated the program.");
        	 break;
         }
           
        }  
            System.out.println("Voting has ended.");
        
        for(int i=0;i<1;i++)
        {
        	char symbol1=obj.next().charAt(0);
        	int agent1=Character.compare(agent, symbol1);
            if(agent1==0)
            {
           	         	
             System.out.println("Total Vote Gained By Party1 is "+count);
             System.out.println("		>>>*_*<<<	");	
             System.out.println("Total Vote Gained By Party2 is "+count2);
             System.out.println("		>>>*_*<<<	");	
             System.out.println("Total Nota Vote is "+notaCount);
             System.out.println("		>>>*_*<<<	");	
             if(count>count2)
             {
        	  System.out.println("Party1 has won the election!");
        	  System.out.println("		>>>*_*<<<	");	
             }
             
             if(count<count2)
             {
            	 System.out.println("Party2 has won the election!");
            	 System.out.println("		>>>*_*<<<	");	
        	
             }
             	
             if(count!=0 && count2!=0)
             {
            	 if(count==count2)
            		 System.out.println("Both party Gained the Equal VOTE.");
            	 System.out.println("		>>>*_*<<<	");	
             }
             if(notaCount>count && notaCount>count2)
             {
            	 System.out.println("		>>>*_*<<<	");	
            	 System.out.println("Organise Reelection and Choose the other Candidate for election");
             }
             
            }
            System.out.println("		>>>*_*<<<");
            System.out.println("");
            System.out.println("Polling Agent has Terminated the Program.");
            System.out.println("		>>>*_*<<<	");	
          	 break;
            
        }
        obj.close();
	}
         
}

