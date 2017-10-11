/**
 * Created by duanyixiao on 2017/10/3.
 */
public class InnerClass {
    private String name;
    private int age;
    private int sex;

    public static class InnerHolder{
        private String name;
        private int age;
        private int sex;

        public InnerHolder name(String name){
            this.name = name;
            return this;
        }

        public InnerHolder age(int age){
            this.age = age;
            return this;
        }

        public InnerHolder sex(int sex){
            this.sex = sex;
            return this;
        }

        public InnerClass build(){
            return new InnerClass(this);
        }
    }

    private InnerClass(InnerHolder holder){
        this.name = holder.name;
        this.age = holder.age;
        this.sex = holder.sex;
    }

    @Override
    public String toString() {
        return "InnerClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerHolder().age(1).name("duanyixiao").build();
        System.out.println(innerClass);
    }

}
