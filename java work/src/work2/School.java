/**  
 * @Title:  School.java   
 * @Package work2   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 黄羲   
 * @date:   2017年11月12日 下午5:02:02   
 * @version V1.8
 */
package work2;

/**
 * @ClassName: School
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 黄羲
 * @date: 2017年11月12日 下午5:02:02
 * 
 */
public class School implements StudentManageInterface, TeacherManageInterface {
	String name;
	String sex;
	int age;
	double fee;

	public void getFee() {
		// TODO Auto-generated method stub

	}

	public void setFee() {
		// TODO Auto-generated method stub

	}

	void biaojiao(int pay1, int pay) {
		if (pay1 - pay < 2000) {
			System.out.println("provide a loan!");
		}
	}

	public void getPay(double pay1) {

		System.out.println("获取学费:" + pay1);
	}

	public void setPay(double pay) {

		System.out.println("学校所需学费:" + pay);
	}

	public static void main(String[] args) {
		School zhangsan = new School();
		zhangsan.getPay(3500);
		zhangsan.setPay(2000);

		zhangsan.biaojiao(3500, 2000);
	}

}
