/**
 * Created by Yilia on 2018/3/14.
 *
 * 我们常见的Object a=new Object();Object b;b=a;
 * 这种形式的代码复制的是引用，即对象在内存中的地址，
 * a和b对象仍然指向了同一个对象。
 * 而通过clone方法赋值的对象跟原来的对象时同时独立存在的。
 *
 */

/**
 * Java语言提供的Cloneable接口和Serializable接口的代码
 * 非常简单，它们都是空接口，这种空接口也称为标识接口，
 * 标识接口中没有任何方法的定义，
 * 其作用是告诉JRE这些接口的实现类是否具有某个功能，
 * 如是否支持克隆、是否支持序列化等。
 */

public class TestClone {
  // 在Java语言中，数据类型分为值类型（基本数据类型）和引用类型，
  // 值类型包括int、double、byte、boolean、char等简单数据类型，
  // 引用类型包括类、接口、数组等复杂类型。
  // 浅克隆和深克隆的主要区别在于是否支持引用类型的成员变量的复制
  public static void main(String[] args) {
    Address addr = new Address();
    addr.setAdd("Shanghai");
    Student stu1 = new Student();
    stu1.setNumber(123456);
    stu1.setAddr(addr);
    Student stu2 = (Student)stu1.clone();

    stu2.setNumber(654321);
    System.out.println(stu1.getNumber() + "Addr:" + stu1.getAddr().getAdd());
    System.out.println(stu2.getNumber() + "Addr:" + stu2.getAddr().getAdd());

    System.out.println(stu1==stu2);

    addr.setAdd("Suzhou");
    System.out.println(stu1.getAddr().getAdd());
    System.out.println(stu2.getAddr().getAdd());
  }


}

/** 浅克隆
 * 1. 被复制的类需要实现Clonenable接口,该接口为标记接口(不含任何方法)
 * 2. 覆盖clone()方法，访问修饰符设为public。方法中调用super.clone()方法得到需要的复制对象。
 * （native为本地方法)
 */
class Student implements Cloneable {
  private int number;

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  //深克隆举例
  private Address addr;

  public Address getAddr() {
    return addr;
  }

  public void setAddr(Address addr) {
    this.addr = addr;
  }


  @Override
  // 浅克隆方法
  // 这样克隆addr还是一起变
  // 原因是浅复制只是复制了addr变量的引用，
  // 并没有真正的开辟另一块空间，
  // 将值复制后再将引用返回给新对象。
  public Object clone() {
    Student stu = null;
    try{
      stu = (Student)super.clone(); //浅复制
    }catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    stu.addr = (Address)addr.clone(); //深复制
    return stu;
  }
}

/**
 * 深克隆
 * 我们在Student类里再加一个Address类。
 * 并且为了真正能复制对象，而不是复制了引用，
 * 我们需要将Address类可复制化，并修改clone方法
 */
class Address implements Cloneable {
  private String add;

  public String getAdd() {
    return add;
  }

  public void setAdd(String add) {
    this.add = add;
  }

  @Override
  public Object clone() {
    Address addr = null;
    try{
      addr = (Address)super.clone();
    }catch (CloneNotSupportedException e){
      e.printStackTrace();
    }
    return addr;
  }
}

/**
 * 实现深克隆，可以通过覆盖Object类的clone()方法实现，
 * 也可以通过序列化(Serialization)等方式来实现
 *
 * 如果引用类型里面还包含很多引用类型，
 * 或者内层引用类型的类里面又包含引用类型，
 * 使用clone方法就会很麻烦。
 * 这时我们可以用序列化的方式来实现对象的深克隆。
 */

