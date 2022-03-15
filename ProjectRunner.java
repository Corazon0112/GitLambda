import java.text.DecimalFormat;
public class ProjectRunner {
    public static void main(String args[]) {
        quotient(220f, 19f);
    }
    public static void quotient(float x, float y ){
        float answer = x/y;
        DecimalFormat df = new DecimalFormat("###.###");
        System.out.printf(""+df.format(answer));
    }
}