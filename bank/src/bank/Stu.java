/**  
 * @Title:  Stu.java   
 * @Package bank   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 黄羲   
 * @date:   2017年10月15日 下午7:39:46   
 * @version V1.8
 */  
package bank;

/**   
 * @ClassName:  Stu   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: 黄羲 
 * @date:   2017年10月15日 下午7:39:46   
 *     
 */
class Student{
    private String name;
    private int age;
    private String degree;
    public Student(String name, int age, String degree) {
        super();
        this.name = name;
        this.age = age;
        this.degree = degree;
    }
    public Student() {
        super();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }
    public void show(){
        System.out.println("姓名：" + this.getName() + ". 年龄：" + this.getAge() + ". 学位：" + this.getDegree() );
    }
}
 
class Undergraduate extends Student{
    private String specialty;
 
    public String getSpecialty() {
        return specialty;
    }
 
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
 
    public Undergraduate(String name, int age, String degree, String specialty) {
        super(name, age, degree);
        this.specialty = specialty;
    }
 
    public Undergraduate(String name, int age, String degree) {
        super(name, age, degree);
    }
     
    public void show(){
        System.out.println("姓名：" + this.getName() + ". 年龄：" + this.getAge() + ". 学位：" + this.getDegree() + ". 专业：" + this.getSpecialty());
    }
}
 
class Graduate extends Student{
    private String direction;
 
    public String getDirection() {
        return direction;
    }
 
    public void setDirection(String direction) {
        this.direction = direction;
    }
 
    public Graduate(String name, int age, String degree, String direction) {
        super(name, age, degree);
        this.direction = direction;
    }
 
    public Graduate(String name, int age, String degree) {
        super(name, age, degree);
    }
    public void show(){
        System.out.println("姓名：" + this.getName() + ". 年龄：" + this.getAge() + ". 学位：" + this.getDegree() + ". 研究方向：" + this.getDirection());
    }
}
public class Stu {

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Undergraduate stu1=new Undergraduate("张二",23,"本科","机械自动化");
        Graduate stu2=new Graduate("王五",27,"硕士","网络工程");
        stu1.show();
        stu2.show();
	}

}
