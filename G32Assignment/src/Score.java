public class Score {
    private String name;
    private int score;

    //Constructor
    public Score(){
    }

    public Score(String n, int s){
        name=n;
        score=s;
    }

    //Setter
    public void setName(String n){
        name=n;
    }

    public void setScore(int s){
        score=s;
    }

    //Getter
    public String getName(){
        return name;
    }
    
    public int getScore(){
        return score;
    }
}
