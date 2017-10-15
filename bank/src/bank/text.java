/**  
 * @Title:  text.java   
 * @Package bank   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 黄羲   
 * @date:   2017年10月14日 下午9:27:49   
 * @version V1.8
 */  
package bank;

/**   
 * @ClassName:  text   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: 黄羲 
 * @date:   2017年10月14日 下午9:27:49   
 *     
 */
public class text {

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {

		DepositAccount saver = new DepositAccount("1234567890","Zhang san",5000); 
		DepositAccount.setInterest(0.023); //年利率

		saver.CXBalance(); //查询余额

		saver.deposit(2000); //存入2000元

		System.out.println("年利息是：" + saver.calYearInterest());

		}

		}

		class DepositAccount {

		private String accountNum; //账号

		private String name; //姓名

		private double balance; //余额，实例成员变量

		static double interest; //年利率，类成员变量

		public static void setInterest(double d ) { //设置年利率

		interest = d;

		}

		public DepositAccount(String num,String na,double ba) { //开户，构造方法

		accountNum = num;

		name = na;

		balance = ba;

		}

		public double calYearInterest() { //计算年利息

		return balance * interest;

		}

		public void deposit(double cash) { //存款

		System.out.println("账户原有存款：" + balance);

		System.out.println("存入金额：" + cash);

		balance += cash;

		System.out.println("存款成功，现在余额为：" + balance);

		}

		public void CXBalance() { //查询余额

		System.out.println("余额是：" + balance);

		}
	}


