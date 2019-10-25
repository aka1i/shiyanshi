import 'MyInterface.dart';

class MyImpl implements MyInterface{
  String name = '实现类';
  void interfaceMethod(){
    print('$name中的一个方法');
  }
}