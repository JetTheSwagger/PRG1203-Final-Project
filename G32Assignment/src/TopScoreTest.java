import java.util.ArrayList;

public class TopScoreTest {
    public static void main(String[] args){
        Score score1=new Score("S",213);
        Score score2=new Score("adasda",132213);
        Score score3=new Score("third one",456465);
        Score score4=new Score("four",3213);
        Score score5=new Score("fifa",321331);

        ArrayList<Score> temp=new ArrayList<>();
        temp.add(score1);
        temp.add(score2);
     
        TopScore topScoreList=new TopScore(score1,score2,score4,score5);

        topScoreList.addScore(score3);

        System.out.println(topScoreList);
    }
}
