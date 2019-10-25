import 'MyMixinClass1.dart';
import 'MyMixinClass2.dart';
class MyMixinedClass with MyMixinClass1,MyMixinClass2{
  static String a = '这是一个静态变量';
  static void staticFunction() {
    print('这是一个静态方法');
  }
}