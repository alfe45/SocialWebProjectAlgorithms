
package Domain;

public class Request {
    
    private String date;
    private String sentBy;
    private String sentTo;
    private int state;// 0 = waiting, -1 = denied, 1 = accepted

    public Request(String date, String sentBy, String sentTo) {
        this.date = date;
        this.sentBy = sentBy;
        this.sentTo = sentTo;
        this.state = 0;
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
        this.state = -1;
    }//deny
    
    public void accept(){
        this.state = 1;
    }//accept

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Request{" + "date=" + date + ", sentBy=" + sentBy + ", sentTo=" + sentTo + ", state=" + state + '}';
    }

}//class
