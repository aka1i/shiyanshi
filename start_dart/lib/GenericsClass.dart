class GenericsClass{
  void functionA(){
    List Tech = new List<String>();
    Tech.addAll(['Android','IOS','Flutter']);
    Tech.add(42);//运行时报错
  }
  void functionB(String temp){
    print('这是一个非泛型方法$temp');
  }
  void functionC<T>(T t){
    print('这是一个泛型方法$t');
  }
}


class GenericsClass2<T>{
  void functionC(T t){
    print('这是一个泛型方法$t');
  }
}

