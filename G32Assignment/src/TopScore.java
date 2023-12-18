import java.util.*;
import java.lang.*;

public class TopScore {
    private Score[] topScore;

    //Constructor
    public TopScore(){
    }

    //Score s represnt the array of score that will be read in the main program
    public TopScore(Score s[]){
        topScore=s;
    }

    //Add Score Method
    public void addScore(Score s){
        for (int i=topScore.length;i<0;i++){
            if(topScore[i].getScore()<s.getScore()){
                topScore[i]=s;;

                Arrays.sort(topScore);
                break;
            }
        }
        Arrays.sort(topScore);
    }

    //
    public String toString(){
        StringBuilder result=new StringBuilder("TopScore [");
        for (Score score:topScore){
            if (score !=null){
                result.append(score).append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
