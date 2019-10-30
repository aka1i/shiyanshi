import 'package:start_dart/Parent.dart';

class Child extends Parent{
  String aaa;
  String bbb;

  static final Map<String, Child> _cache = <String, Child>{};
  Child():super(1){
    print('子类构造函数');
  }
  //命名构造函数
  Child.mingminggouzaohanshu(int a):super(1){
    print('子类的命名构造函数');
  }
  //命名构造函数+初始化列表 c
  Child.mingminggouzaohanshu2(String aaa,String bbb)
      : aaa = aaa + 'aaaa',
        bbb = bbb + 'bbbb',
        super(1){
    print('子类命名构造函数+初始化列表');
    print(this.aaa + '     ' + this.bbb);
  }
  //重定向函数
  Child.chongdingxiang():this();


  factory Child.factory(String name){
    print('调用了工厂方法');
//    return Child();
    if (_cache.containsKey(name)) {
      return _cache[name];
    } else {
      final logger = new Child();
      _cache[name] = logger;
      return logger;
    }
  }

  void justPrint(){
    print('我是子类');
  }
}