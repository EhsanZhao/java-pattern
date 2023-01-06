package com.ehsanzhao.pattern.builder;

/**
 * @author zhaoyuan
 * @date 2023/1/5
 */
public class User {

    //必要参数
    private final String name;

    //可选参数
    private final String sex;

    private final Integer age;

    private User(UserBuilder userBuilder){
        this.name = userBuilder.name;
        this.sex = userBuilder.sex;
        this.age = userBuilder.age;
    }

    public static class UserBuilder{

        private final String name;

        private String sex;

        private Integer age;

        public UserBuilder(String name) {
            this.name = name;
        }

        public UserBuilder age(int val) {
            this.age = val;
            // 建造者模式的一个标志
            return this;
        }
        public UserBuilder sex(String val) {
            this.sex = val;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        User user = new User.UserBuilder("张三").age(18).sex("男").build();
        System.out.println(user);
    }

}
