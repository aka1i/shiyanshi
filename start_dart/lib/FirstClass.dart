class FirstClass{
  void functionA(){
    var name = "hi"; //String类型
    var age = 18; //int类型
    var high = 1.70; //double类型

//    name = 3; //此处编译器会报错，name被定义赋值之后已经是一个String类型，不可再赋值int类型值
  }

  void functionB(){
    String name = "bruce"; //String类型
    int age = 18; //int类型
  }


  void functionC(){
    dynamic value = 18;
    print("value = $value");
    value = "bruce";
    print("value = $value");
    value = 3.5;
    print("value = $value");

    Object val = 18;
    print("val = $val");
    val = "bruce";
    print("val = $val");
    val = 3.5;
    print("val = $val");
  }

  void functionD(){
    List<int> list = [1,2,3];
    Set<String> set = {'A', 'B', 'C','B'};
    Map<int, String> map = {
      0: 'aaa',
      1: 'bbb'
    };
    Runes input = new Runes('\u{1f600}');
    print(list);
    print(set);
    print(map);
    print(new String.fromCharCodes(input));
  }

  // 字符串拼接
  void functionE(){
    var a = 1;
    var b = "哈哈";
    var c =  {'A', 'B', 'C','B'};
    print("这$a是个字$b符${c}串");
  }

}