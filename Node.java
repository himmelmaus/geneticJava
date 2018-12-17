import java.uitl.ArrayList;
import java.lang.Math;

public class Node{

    public ArrayList<Double> biases;
    public ArrayList<Double> coefficients;

    public Node(int previousLayer){
        this.biases = new ArrayList<Double>();
        this.coefficients = new ArrayList<Double>();
        for (int i = 0; i < previousLayer; i++){
            this.biases.set(i, Math.random());
            this.coefficients.set(i, Math.Random());
        }
    }

    public Double get(ArrayList<Double> inputs){
        Double sum = 0;
        for (int i = 0; i < inputs.size(); i++){
            sum += coefficients.get(i)*inputs.get(i)-biases.get(i);
        }
        return sum; 
    }
}