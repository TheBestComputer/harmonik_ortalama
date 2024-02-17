
public class Main {
    public static void main(String[] args) {
        double[] list = {1,2,3};
        
        double sum = 0.0;
        
        for(int i = 0; i < list.length; i++){
            sum += (1 / list[i]);
        }
        double avarange = list.length / sum;
        System.out.println(avarange);
    }
}
