/**  
 * @Title:  job2.java   
 * @Package task2   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 黄羲   
 * @date:   2017年9月23日 下午6:12:00   
 * @version V1.8
 */  
package task2;
import java.util.*;
/**   
 * @ClassName:  job2   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: 黄羲 
 * @date:   2017年9月23日 下午6:12:00   
 *     
 */
public class job2 {

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获取传入的值
		System.out.print("请输入方阵阶数：（整数）");
		Scanner sc=new Scanner(System.in);
		int nextInt = sc.nextInt();
		int[][] arr = gettx(nextInt, nextInt);
		//逆时针循环输出值
		for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
		//如果小于10就在前面加0
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
		* 换行  获取值jInt   jyInt
		*@author Sun
		* @retuen 无返回
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


