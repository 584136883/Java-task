/**  
 * @Title:  text.java   
 * @Package bank   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: ����   
 * @date:   2017��10��14�� ����9:27:49   
 * @version V1.8
 */  
package bank;

/**   
 * @ClassName:  text   
 * @Description:TODO(������һ�仰��������������)   
 * @author: ���� 
 * @date:   2017��10��14�� ����9:27:49   
 *     
 */
public class text {

	/**   
	 * @Title: main   
	 * @Description: TODO(������һ�仰�����������������)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {

		DepositAccount saver = new DepositAccount("1234567890","Zhang san",5000); 
		DepositAccount.setInterest(0.023); //������

		saver.CXBalance(); //��ѯ���

		saver.deposit(2000); //����2000Ԫ

		System.out.println("����Ϣ�ǣ�" + saver.calYearInterest());

		}

		}

		class DepositAccount {

		private String accountNum; //�˺�

		private String name; //����

		private double balance; //��ʵ����Ա����

		static double interest; //�����ʣ����Ա����

		public static void setInterest(double d ) { //����������

		interest = d;

		}

		public DepositAccount(String num,String na,double ba) { //���������췽��

		accountNum = num;

		name = na;

		balance = ba;

		}

		public double calYearInterest() { //��������Ϣ

		return balance * interest;

		}

		public void deposit(double cash) { //���

		System.out.println("�˻�ԭ�д�" + balance);

		System.out.println("�����" + cash);

		balance += cash;

		System.out.println("���ɹ����������Ϊ��" + balance);

		}

		public void CXBalance() { //��ѯ���

		System.out.println("����ǣ�" + balance);

		}
	}


