## 枚举类
创建一个枚举类
```
enum Color {
  red,
  green,
  blue
}
```
使用
```
print(Color.blue);
print(Color.blue.index);
```

## mixins
- 定义一个类继承Object，该类没有构造函数，不能调用super，则该类就是一个mixin
- 有相同方法名的mixin会调用后一个
- mixins 绝不是继承，也不是接口，而是一种全新的特性
- 一个类可以 mixins 多个 mixins 类
## static关键字
用static修饰的方法和变量是类的一部分，不用创建对象就能够使用
## 泛型
#### 泛型类

```

class GenericsClass2<T>{
  void functionC(T t){
    print('这是一个泛型方法$t');
  }
}
```

#### 泛型方法
```
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
```
#### 集合字面量
```
var names = <String>['Seth', 'Kathy', 'Lars'];
var pages = <String, String>{
  'index.html': 'Homepage',
  'robots.txt': 'Hints for web robots',
  'humans.txt': 'We are people, not machines'
};
```
## call函数
定义call函数
```
call(String a)=>print('这是一个call函数$a');

```

call函数的调用
```
var temp = AsynClass();
temp('hhhhh');
```
## get和set关键字

```
class GetAndSetClass{
  int _a;
  void setA(int value){
    this.a = value;
  }
  int getA(){
    return a ??= 10000000000000000;
  }
  set a(int value) => _a = value;
  get a => _a ??= 10000000000000000;
}
```

## 异步
声明异步方法
```
checkVersion() async {
  // ...
}

lookUpVersion() async => /* ... */;
```
await表达式

```
var entrypoint = await findEntrypoint();
var exitCode = await runExecutable(entrypoint, args);
await flushThenExit(exitCode);
```
- 在await expression中，expression的返回值通常是一个Future；如果返回的值不是Future，则Dart会自动把该值放到Future中返回。
- await expression会阻塞主，直到需要的对象返回为止。
- 如果await无法正常使用，请确保是在一个async方法中。