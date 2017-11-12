/**  
 * @Title:  Car.java   
 * @Package work   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 黄羲   
 * @date:   2017年11月12日 下午3:38:26   
 * @version V1.8
 */  
package work;

/**   
 * @ClassName:  Car   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: 黄羲 
 * @date:   2017年11月12日 下午3:38:26   
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
	        System.out.println("所装载的货物的总重量为:"+totalweight);  
	  
	    }  
}

