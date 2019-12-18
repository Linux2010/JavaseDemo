package cn.com.yusys.work;

/**
 * @author tianfusheng
 * @e-mail linuxmorebetter@gmail.com
 * @date 2019/12/17
 */
public class undergad extends Student {


    undergad(String _id, String _name, String _sex, String _age) {
        super(_id, _name, _sex, _age);
    }

    public void HavaMajor(){
        System.out.println("大学生具备专业知识");
    }


}
