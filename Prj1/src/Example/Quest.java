package Example;



public class Quest {
	
	
	    static int QuestCount = 0;

	    Quest() {
	        QuestCount++;
	    }
	
	

	
	 public static void main(String[] args) {
	        Quest Quest1 = new Quest();
	        Quest Quest2 = new Quest();
	        Quest Quest3 = new Quest();
	        System.out.println(Quest.QuestCount);
	    }
}
	
	

	
	   
	


