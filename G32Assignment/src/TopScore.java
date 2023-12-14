import java.util.Arrays;

public class TopScore {
    private Score topScore[]=new Score[5];

    //Constructor
    public TopScore(){
    }

    //Score s represnt the array of score that will be read in the main program
    public TopScore(Score s[]){
        topScore=s;
    }

    //Add Score Method
    public void addScore(Score s){
        for (int i=0;i<topScore.length;i++){
            if(topScore[i]==null){
                topScore[i]=s;
                break;
            }
        }
        Arrays.sort(topScore);
    }

    //Update Score Method
    public void updateScore(){
        
    }
}
