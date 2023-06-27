
package Domain;

public class Request {
    
    private String date;
    private String sentBy;
    private String sentTo;
    private int accepted;// 0 = waiting, -1 = denied, 1 = accepted

    public Request(String date, String sentBy, String sentTo) {
        this.date = date;
        this.sentBy = sentBy;
        this.sentTo = sentTo;
        this.accepted = 0;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSentBy() {
        return sentBy;
    }

    public void setSentBy(String sentBy) {
        this.sentBy = sentBy;
    }

    public String getSentTo() {
        return sentTo;
    }

    public void setSentTo(String sentTo) {
        this.sentTo = sentTo;
    }
    
    public void deny(){
        this.accepted = -1;
    }//deny
    
    public void accept(){
        this.accepted = 1;
    }//accept

    public int getAccepted() {
        return accepted;
    }

    public void setAccepted(int accepted) {
        this.accepted = accepted;
    }

    @Override
    public String toString() {
        return "Request{" + "date=" + date + ", sentBy=" + sentBy + ", sentTo=" + sentTo + ", accepted=" + accepted + '}';
    }
    
    

}//class
