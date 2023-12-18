import java.util.*;

public class TopScoreTest {
    public static void main(String[] args){
        Score scoreTest=new Score("S",213);
        Score scoreTest2=new Score("adasda",132213);

        Score[] temp={scoreTest,scoreTest2};

        TopScore topScoreList=new TopScore(temp);
        
        System.out.println(topScoreList);

    }
}
