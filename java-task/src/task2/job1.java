/**  
 * @Title:  job1.java   
 * @Package task2   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 黄羲   
 * @date:   2017年9月23日 下午6:12:46   
 * @version V1.8
 */  
package task2;
import java.util.*;
/**   
 * @ClassName:  job1   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: 黄羲 
 * @date:   2017年9月23日 下午6:12:46   
 *     
 */
public class job1 {

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {

				int n;
				Scanner s=new Scanner(System.in);
				System.out.println("请输入一个整数：");
				n=s.nextInt();
				dizeng(n);
			}
			public static void dizeng(int n) {
				
			System.out.println(n);
			if (n < 5000)
			dizeng(2 * n);
			System.out.println(n);
			}
}


