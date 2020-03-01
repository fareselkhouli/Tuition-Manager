/**
 * This class implements the out of state student case and it extends Student
 * @FaresElkhouli
 * @ZhiyuFeng
 */
public class Outstate extends Student {
    private boolean tristate;

    public Outstate(String fname, String lname,int credit, boolean tristate){
        super(fname,lname,credit);
        this.tristate = tristate;
    }

    /**
     * Tuition calculator for outstate student
     * @return tuition due
     */
    public int tuitionDue(){
        int perCreditPrice = 756;
        int partTimeCredits = 12;
        int partTimeFee = 846;
        int fullTimeFee = 1441;
        int triStateDiscount = 200;
        int maxCredits = 15;
        int tuition = 0;
        int ccredit = 0;

        if(credit > maxCredits){
            ccredit = maxCredits;
        }
        else{
            ccredit = credit;
        }

        if(tristate){
            tuition = perCreditPrice*ccredit - triStateDiscount*ccredit;
        }
        else{
            tuition = perCreditPrice*ccredit;
        }

        if(ccredit<partTimeCredits){
            tuition += partTimeFee;
        }
        else{
            tuition += fullTimeFee;
        }

        return tuition;
    }

    public String toString(){
        return super.toString() + " tuition due: $" + tuitionDue();
    }

    public static void main(String[] args){

    }
}
