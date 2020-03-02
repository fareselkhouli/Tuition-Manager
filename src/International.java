/**
 * This class implements the international student case and it extends Student
 * @FaresElkhouli
 * @ZhiyuFeng
 */
public class International extends Student {
    private boolean exchange;
    
    public International(String fname, String lname, int credit, boolean exchange) {
    	super(fname,lname,credit);
    	this.exchange=exchange;
    }
    
    /**
     * Tuition calculator for International student
     * @return tuition due
     */
    
    public int tuitionDue() {
    	int perCreditPrice = 945;
    	int partTimeCredits = 12;
    	int partTimeFee = 846;
    	int fullTimeFee = 1441;
    	int maxCredits = 15;
    	int tuition = 0;
    	int ccredit = 0;
    	int intFee = 350; 
    	if (credit > maxCredits) {
    		ccredit = maxCredits;
    	}
    	else {
    		ccredit = credit;
    	}
    	if (exchange) {
    		tuition = fullTimeFee + intFee;
    	}
    	else {
    		tuition = perCreditPrice*ccredit+intFee;
    	}
    	
    	if(ccredit<partTimeCredits) {
    		tuition += partTimeFee;
    	}
    	else {
    		tuition += fullTimeFee;
    	}
    	return tuition;
    }
    public String toString() {
    	if (exchange) {
    		return super.toString()+" is an exchange student.";
    	}
    	else{
    		return super.toString()+" is not an exchange student.";
    	}
    }
    
    public static void main(String[] args) {
    	
    }
}
