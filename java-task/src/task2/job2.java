/**  
 * @Title:  job2.java   
 * @Package task2   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: ����   
 * @date:   2017��9��23�� ����6:12:00   
 * @version V1.8
 */  
package task2;
import java.util.*;
/**   
 * @ClassName:  job2   
 * @Description:TODO(������һ�仰��������������)   
 * @author: ���� 
 * @date:   2017��9��23�� ����6:12:00   
 *     
 */
public class job2 {

	/**   
	 * @Title: main   
	 * @Description: TODO(������һ�仰�����������������)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ȡ�����ֵ
		System.out.print("�����뷽���������������");
		Scanner sc=new Scanner(System.in);
		int nextInt = sc.nextInt();
		int[][] arr = gettx(nextInt, nextInt);
		//��ʱ��ѭ�����ֵ
		for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
		//���С��10����ǰ���0
		if (arr[i][j] < 10) {
		System.out.print("0"+arr[i][j] +" "   );
		} else {
		System.out.print(arr[i][j] +" "    );
		}
		}
		System.out.println();
		}
		}


		/** 
		* ����  ��ȡֵjInt   jyInt
		*@author Sun
		* @retuen �޷���
		*/
		public static int[][] gettx(int jInt, int jyInt) {

		int jMax = jInt; 
		int yyMax = jyInt;
		int arr[][] = new int[yyMax][jMax];
		int x = 0, y = 0;
		int xMin = 0, yMin = 0;
		int size = jMax * yyMax;
		boolean flag = true;
		for (int i = 0; i < size; i++) {
		arr[y][x] = i + 1;
		if ((y + 1) < yyMax && flag) {
		y++;
		} else if ((x + 1) < jMax && flag) {
		x++;
		} else {
		if (y > yMin) {
		y--;
		} else if (x > (xMin + 1)) {
		x--;
		} else {
		jMax--;
		yyMax--;
		xMin++;
		yMin++;
		y++;
		flag = true;
		}
		}
		if ((y + 1) == yyMax && (x + 1) == jMax) {
		flag = false;
		}
		}
		return arr;
		}
		}


