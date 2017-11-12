package work;

public class Television implements ComputerWeight { //通过实现接口ComputerWeight给出自重  
    double tweight;  
    Television(double t){  
        this.tweight=t;  
    }  
    public double computeWeight(){  
        return tweight;  
  
}  
}  
