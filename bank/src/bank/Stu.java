/**  
 * @Title:  Stu.java   
 * @Package bank   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: ����   
 * @date:   2017��10��15�� ����7:39:46   
 * @version V1.8
 */  
package bank;

/**   
 * @ClassName:  Stu   
 * @Description:TODO(������һ�仰��������������)   
 * @author: ���� 
 * @date:   2017��10��15�� ����7:39:46   
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
        System.out.println("������" + this.getName() + ". ���䣺" + this.getAge() + ". ѧλ��" + this.getDegree() );
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
        System.out.println("������" + this.getName() + ". ���䣺" + this.getAge() + ". ѧλ��" + this.getDegree() + ". רҵ��" + this.getSpecialty());
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
        System.out.println("������" + this.getName() + ". ���䣺" + this.getAge() + ". ѧλ��" + this.getDegree() + ". �о�����" + this.getDirection());
    }
}
public class Stu {

	/**   
	 * @Title: main   
	 * @Description: TODO(������һ�仰�����������������)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Undergraduate stu1=new Undergraduate("�Ŷ�",23,"����","��е�Զ���");
        Graduate stu2=new Graduate("����",27,"˶ʿ","���繤��");
        stu1.show();
        stu2.show();
	}

}
