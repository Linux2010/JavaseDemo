package cn.com.yusys.work;

/**
 * @author tianfusheng
 * @e-mail linuxmorebetter@gmail.com
 * @date 2019/12/17
 */
public class Student {

    private String id;
    private String name;
    private String sex;
    private String age;

    public void study(){
        System.out.println("学生可以学习");
    }



    Student(String _id,String _name,String _sex,String _age){
        id =_id;
        name=_name;
        sex=_sex;
        age=_age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
