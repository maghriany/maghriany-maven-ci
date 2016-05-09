/**
 * Created by mi.maghriani on 5/9/2016.
 */
public class Compare {
    private int first;
    private int second;

    public Compare(int a, int b){
        this.first = a;
        this.second = b;
    }

    public  int compare(){
        if (first > second ){
            return 1;
        }
        if (first < second ){
            return -1;
        }
        return 0;
    }
}
