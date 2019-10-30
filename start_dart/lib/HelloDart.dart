import 'package:start_dart/AsynClass.dart';
import 'package:start_dart/Child.dart';
import 'package:start_dart/Color.dart';
import 'package:start_dart/FirstClass.dart';
import 'package:start_dart/FourthClass.dart';
import 'package:start_dart/GenericsClass.dart';
import 'package:start_dart/GetAndSetClass.dart';
import 'package:start_dart/MyImpl.dart';
import 'package:start_dart/MyInterface.dart';
import 'package:start_dart/MyMixinedClass.dart';
import 'package:start_dart/NonAbstractClass.dart';
import 'package:start_dart/SecondClass.dart';
import 'package:start_dart/ThirdClass.dart';

void main(){
  print('-------------第一个程序-------------');
  print('Hello Dart');

  print('-------------Dart的变量类型-------------');
  FirstClass().functionD();
  print('-------------字符串拼接-------------');
  FirstClass()..functionE();
  print('-------------判断一个变量是不是方法-------------');
  var a = SecondClass().functionA;
  print(a is Object);

//
  print('-------------可选命名参数-------------');
  SecondClass()..functionB("SY");
  SecondClass()..functionB("SY",height: 150,weight: 200);
  SecondClass()..functionB("SY",weight: 200,height: 150);
  SecondClass()..functionB("SY",weight: 200);
  //报错
//  SecondClass()..functionB(weight: 200,"SY");

  print('-------------可选位置参数-------------');
  SecondClass()..functionC("SY");
  SecondClass()..functionC("SY",150,200);
  SecondClass()..functionC("SY",150);
  //报错
  //SecondClass()..functionC(200,"SY");
  print('-------------创建一个类实例-------------');
  var thirdClass = ThirdClass(1.0,2);
  print('${thirdClass.x}    ${thirdClass.y}');
  print('-------------常用List操作-------------');
  FourthClass().functionA();
  print('-------------常用List API-------------');
  FourthClass().functionB();
  print('-------------常用Map操作-------------');
  FourthClass().functionC();
  print('-------------常用Map API-------------');
  FourthClass().functionD();
  print('-------------类的继承-------------');
  Child();
  print('-------------命名构造函数和初始化列表-------------');
  Child.mingminggouzaohanshu2('哈哈哈哈', '啊啊啊啊');
//  print('-------------类的工厂构造函数-------------');
//  Child.factory('小明');
//  Child.factory('小明');
//  Child.factory('小王');
  print('-------------抽象类与抽象方法-------------');
//  无法new一个抽象类
//  AbstractClass();
  NonAbstractClass()
    ..abstractMethod()
    ..nonAbstractMethod()
    ..nonAbstractMethod2();

  print('-------------接口-------------');
  MyInterface().interfaceMethod();
  MyImpl().interfaceMethod();
//  print('-------------枚举类-------------');
//  print(Color.blue);
//  print(Color.blue.index);
//  print('-------------Mixin-------------');
//  MyMixinedClass()
//    ..functionA()
//    ..functionB();
//  print('-------------static-------------');
//  print(MyMixinedClass.a);
//  MyMixinedClass.staticFunction();
//  print('-------------泛型-------------');
//  GenericsClass()
//      ..functionB('啊啊啊啊')
//      ..functionC(100)
//      ..functionC('哈哈哈哈')
//      ..functionC(FirstClass());
//  GenericsClass2<String>()
//    ..functionC('hhhhhh');
//  print('-------------实现call函数-------------');
//  var temp = AsynClass();
//  temp('hhhhh');
//  print('-------------get()set()-------------');
//  var g = GetAndSetClass();
//  print(g.a);
//  g.a = 50;
//  print(g.a);
//  print('-------------异步-------------');
//  AsynClass().functionA();
//  //  Parent parent = Child();
////  parent.justPrint();

}