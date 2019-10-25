import 'dart:io';

class AsynClass{
  void functionA(){
    print('你好');
    functionC();
    print('Hello');
  }
  void functionB()async{
    await sleep(Duration(seconds: 2));
    print('good moring');
  }
  void functionC(){
    sleep(Duration(seconds: 5));
    print('good evening');
  }

  call(String a)=>print('这是一个call函数$a');
}