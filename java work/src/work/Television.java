package work;

public class Television implements ComputerWeight { //ͨ��ʵ�ֽӿ�ComputerWeight��������  
    double tweight;  
    Television(double t){  
        this.tweight=t;  
    }  
    public double computeWeight(){  
        return tweight;  
  
}  
}  
