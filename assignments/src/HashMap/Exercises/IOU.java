package HashMap.Exercises;

import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> IOU;
    public IOU() {
        //creates new iou
        IOU = new HashMap<>();
    }
    public void setSum(String toWhom, double amount) {
        //saves amt owed and the person owed to
        IOU.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom) {
        //returns amt owed to person in param
        return IOU.getOrDefault(toWhom, 0.0);
    }
    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));

        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Arthur", 10.5);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
    }
}
