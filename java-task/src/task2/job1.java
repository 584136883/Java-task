/**  
 * @Title:  job1.java   
 * @Package task2   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: ����   
 * @date:   2017��9��23�� ����6:12:46   
 * @version V1.8
 */  
package task2;
import java.util.*;
/**   
 * @ClassName:  job1   
 * @Description:TODO(������һ�仰��������������)   
 * @author: ���� 
 * @date:   2017��9��23�� ����6:12:46   
 *     
 */
public class job1 {

	/**   
	 * @Title: main   
	 * @Description: TODO(������һ�仰�����������������)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {

				int n;
				Scanner s=new Scanner(System.in);
				System.out.println("������һ��������");
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


