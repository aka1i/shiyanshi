import 'package:start_dart/AbstractClass.dart';

class NonAbstractClass extends AbstractClass{

  @override
  void abstractMethod() {
    print('非抽象类重写了抽象类的抽象方法');
  }

  @override
  void nonAbstractMethod() {
    print('非抽象类重写了抽象类的非抽象方法');
  }


}