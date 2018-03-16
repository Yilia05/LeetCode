//import java.util.List;
//
///**
// * Created by Yilia on 2018/3/13.
// * 泛型
// */
//public class TestGenerics<T> {
//  private T t;
//  public void setT(T t){
//    this.t = t;
//  }
//  public T getT(){
//    return t;
//  }
//
//  //边界符
//  public static <T extends Comparable<T>> int countGreaterThan(T[] array, T elem) {
//    int
//  }
//
//  class Fruit {}
//  class Apple extends Fruit {}
//  class Orange extends Fruit {}
//
//  static class CovariantReader<T> {
//    //通配符
//    T readCovariant(List<? extends T> list) {
//      return list.get(0);
//    }
//  }
//
//  static void f2() {
//    CovariantReader<Fruit> fruitReader = new CovariantReader<Fruit>();
//    Fruit f = fruitReader.readCovariant(fruit);
//    Fruit a = fruitReader.readCovariant(apples);
//  }
//
//  public static void main(String[] args) {
//    TestGenerics<Integer> integerTestGenerics = new TestGenerics<>();
//    TestGenerics<String> stringTestGenerics = new TestGenerics<>();
//  }
//}