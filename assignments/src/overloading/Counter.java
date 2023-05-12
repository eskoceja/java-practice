package overloading;

public class Counter {
    private int count;

    //constructor that sets value to StartValue
    public Counter(int startValue) {
        count = startValue;
    }
    //constructor that sets value to 0
    public Counter() {
        count = 0;
    }
    //value method that returns int
    public int value() {
        return count;
    }

    //increase method that increases value by 1 - no return
    public void increase() {
        count++;
    }

    //decrease method that decreases value by 1 - no return
    public void decrease() {
        count--;
    }

    //overloading methods - give parameter to increase and decrease method
    public void increase(int increaseBy) {
        if(increaseBy >= 0) {
            count+= increaseBy;
        }
    }
    public void decrease(int decreaseBy) {
        if(decreaseBy >= 0) {
            count-=decreaseBy;
        }
    }

}
