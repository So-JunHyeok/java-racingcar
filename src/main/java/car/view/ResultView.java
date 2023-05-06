package car.view;
import java.util.List;


public class ResultView {

    public void resultView(String name, int count){
        System.out.print(name+" : ");
        outputLine(count);
    }

    private void outputLine(int size){
        for (int i = 0; i < size; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public void winnerView(List<String> strings){
        System.out.println(winnerPrint(strings)+"가 우승하였습니다.");
    }

    private String winnerPrint(List<String> strings){
        String winnerName = "";
        for(String name : strings){
            winnerName += addComma(winnerName)+name;
        }
        return winnerName;
    }

    public String addComma(String winnerName){
        if(!winnerName.equals("")){
            return ",";
        }
        return winnerName;
    }
}
