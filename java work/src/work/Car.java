/**  
 * @Title:  Car.java   
 * @Package work   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: ����   
 * @date:   2017��11��12�� ����3:38:26   
 * @version V1.8
 */  
package work;

/**   
 * @ClassName:  Car   
 * @Description:TODO(������һ�仰��������������)   
 * @author: ���� 
 * @date:   2017��11��12�� ����3:38:26   
 *     
 */
public class Car {
	 ComputerWeight[] goods;  
	    double totalWeight=0;  
	    Car (ComputerWeight[] goods)  
	    {  
	    this.goods=goods;  
	    }  
	    public static void main(String[] args) {  
	        // TODO Auto-generated method stub  
	        ComputerWeight[] goods=new ComputerWeight[3];  
	        goods[0]=new Television(500); 
	        goods[1]=new Computer(300);  
	        goods[2]=new WashMachine(1000);  
	        Car car=new Car(goods);  
	        double totalweight;  
	        totalweight=goods[0].computeWeight()+goods[1].computeWeight()+goods[2].computeWeight();  
	        System.out.println("��װ�صĻ����������Ϊ:"+totalweight);  
	  
	    }  
}

