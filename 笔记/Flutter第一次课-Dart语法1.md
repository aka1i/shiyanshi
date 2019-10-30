### 开始你的第一个Dart程序
1. 新建一个任意dart文件
2. 复制以下代码
```
void main(){
  print('Hello Dart');
}
```

### 概念
- Dart是强类型语言，但类型标识是可选的
- Dart 里所有东西都是对象，是因为 Dart 的所有东西都继承自 Object
- Dart是静态作用域语言。基本上大括号里面定义的变量就只能在大括号里面访问，和java作用域类似。
- 所有的类都继承于object
- 每个类都隐式的定义了一个包含所有实例成员的接口
## 变量
### 定义变量的4种方法
可以使用var来定义变量，变量的类型可以通过变量值推断出来
```
var name = "hi"; //String类型
var age = 18; //int类型
var high = 1.70; //double类型
```
也可以使用特定类型来定义变量
```
String name = "bruce"; //String类型
int age = 18; //int类型
```
意思是数据类型是动态可变的，也可以定义任何变量，但是和 var 不同的是，var 一旦赋值后，就不能改变数据类型了
```
dynamic value = 18;
print("value = $value");
value = "bruce";
print("value = $value");
value = 3.5;
print("value = $value");
```
Object
```
Object val = 18;
print("val = $val");
val = "bruce";
print("val = $val");
val = 3.5;
print("val = $val");
```
### Dart 支持的数据类型


- int
- double
- num
    - num 是数字类型，既可以表示整数，也可以表示浮点数，具体看赋的值  
- String
- bool
- List
    - List<int> list = [1, 2, 3];
- Set
    - Set<String> halogens = {'fluorine', 'chlorine', 'bromine', 'iodine', 'astatine'};
- Map
    - Map<String,String> gifts = {
// Key: Value 格式
'first': 'partridge',
'second': 'turtledoves',
'fifth': 'golden rings'};
- Runes
    - 表示采用 UTF-32的字符串，用于显示Unicode因为Dart字符串是UTF-16，因此在Dart中表示32位的Unicode值需要Runes这个特殊语法。
    - Runes input = new Runes('\u{1f600}');
print(new String.fromCharCodes(input));
打印出来的是笑脸emoji：😆

#### final 和 const
如果不打算更改变量，可以使用final或者const。一个final变量只能被设置一次，而const变量是编译时常量，定义时必须赋值。
#### 字符串拼接

```
    var a = 1;
    var b = "哈哈";
    var c =  {'A', 'B', 'C','B'};
    print("这$a是个字$b符${c}串");
```
#### 判断一个变量是不是方法

```
  var a = SecondClass().functionA;
  print(a is Function);

```


## 函数
#### 函数定义的格式
```
返回类型 函数名(函数参数){
    
}
```
- 可选命名参数：使用 {} 包起来的参数是可选命名参数

```
  void functionB(String name,{int height, int weight}){
    print('姓名：${name}  身高${height}   体重${weight}');
  }
```

- 可选位置参数：使用 [] 包起来的参数是可选位置参数

```
  void functionC(String name,[int height, int weight]){
    print('姓名：${name}  身高${height}   体重${weight}');
  }
```
#### 匿名方法
可以把匿名方法赋值给一个变量，然后可以使用这个方法，比如添加集合或者从集合中删除。匿名函数和命名函数类似，在括号之间可以定义一些参数·，参数使用逗号分割，也可以是可选参数。后面大括号中的代码为函数体：

```
([[Type] param1[, …]]) { 
  codeBlock; 
}; 
```

```
var list = ['apples', 'oranges', 'grapes', 'bananas', 'plums'];
list.forEach((i) {
  print(list.indexOf(i).toString() + ': ' + i);
});
//输出：

0: apples
1: oranges
2: grapes
3: bananas
4: plums
```

##### 注意
- 调用含有可选参数的方法时,可选参数需要在必选参数后传入
- 所有的函数都返回一个值。如果没有指定返回值，则默认把语句return null;作为函数的最后一个语句执行。
```
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
```
#### 箭头语法/Lambda表达式
=> 语法是 { return expr; } 的简写，因为 => 酷似箭头，也称箭头语法,也是 Lambda 表达式。
```
void main() => runApp(MyApp());
等价于
void main(){
    return runApp(MyApp());//runApp() 返回的是 void
}
```

## 类
##### 创建一个类
- 如果没有定义构造函数，则会有一个空参的默认构造函数
- 子类不会继承父类的构造函数
- 和java的区别
    - 命名构造函数
    - 初始化列表
    - 重定向函数
    - 工厂构造方法
```
class ThirdClass{
  num x,y;
  ThirdClass(num x, num y){
    this.x = x;
    this.y = y;
  }
}
```
##### 语法糖
```
class ThirdClass{
  num x,y;
  ThirdClass(this.x,this.y);
}
```
命名构造函数
```
class Point {
  num x;
  num y;

  Point(this.x, this.y);

  // 命名构造函数
  Point.fromJson(Map json) {
    x = json['x'];
    y = json['y'];
  }
}
```

## 抽象类与抽象方法

抽象类
```
abstract class AbstractClass{
  //非抽象方法
  void abstractMethod();

  void nonAbstractMethod(){
    print('抽象类的非抽象方法111');
  }
  void nonAbstractMethod2(){
    print('抽象类的非抽象方法222');
  }
}
```
非抽象方法

```
class NonAbstractClass extends AbstractClass{

  @override
  void abstractMethod() {
    
  }
}
```

## 接口
- 每个类都隐式的定义了一个包含所有实例成员的接口
- 使用场景：想要继承一个类但是不想继承这个类的实现的时候
- 接口的实现类需要实现接口类的属性和方法
## 操作符
- 大部分操作符和C类似不做介绍

##### 级联操作符..

```
querySelector('#confirm') // Get an object.
  ..text = 'Confirm' // Use its members.
  ..classes.add('important')
  ..onClick.listen((e) => window.alert('Confirmed!'));
```

#### 操作符：?.
想要访问表达式的某个属性时，就可以使用这个，可以有效避免 NPE。

```
var yourName = user?.name;
//等价于
var yourName;
if(user == null){
    yourName = null;
}else{
    yourName = user.name;
}
```
#### 操作符：??
在赋值时，可以使用 ??，若发现为空，可以为其赋默认值。 例如:

```
var yourName = name ?? "Bob";
//等价于
var yourName;
if(name == null){
    yourName = "Bob";
}else{
    yourName = name;
}
```

#### 操作符：??=
expr1 ??= expr2 等效于 expr1 = expr1 ?? expr2 就是判断 expr1 是否为null，如果为null的话，就使用默认值 expr2。 例如：

```
user ??= User();
//等价于
if(user == null) {
    user = User();
}
```
## 流程控制语句
和java类似
## 常用数据类型操作
### List

```
  //创建一个int类型的list 并赋值为0，1，2，3，4
    List list =  [0,1,2,3,4];

    //使用构建的方式创建list
    List list1 = new List();

    //创建一个常量的List，不可以改变的List
    List list2 = const[0,1,2,3];

    //增加泛型
    List list3 = new List<String>();

    //创建固定的长度的数组列表，不能移除或者增加
    List list4 = new List(5);

    //创建包含所有以下元素的可改变的长度列表
    List list5 = new List.from([0,1,2,3]);

    //创建在固定范围内改变长度的列表
    List list6 = new List()..length = 10;

    //创建包含所有元素的固定长度列表
    List list7 = new List.unmodifiable([0,1,2]);

    //用生成器给所有元素赋初始值
    List list8 = new List<int>.generate(5, (int i) {
      return i + i;
    });
```
常用API

```
 //在列表中存放不同类型的对象
  List list = [1,2,3,false,"Kinght"];
  print(list);          //输出：[1, 2, 3, false, Kinght]

  //在列表中添加元素
  list.add(7);
  print(list);          //输出：[1, 2, 3, false, Kinght, 7]

  //修改列表下标为1的值
  list[1] = "paul";
  print(list);          //输出：[1, paul, 3, false, Kinght, 7]

  //移除列表的指定值得的元素
  list.remove("paul");
  print(list);          //输出：[1, 3, false, Kinght, 7]

  //移除列表指定下标下的元素
  list.removeAt(0);
  print(list);          //输出：[3, false, Kinght, 7]

  //获取列表的长度
  print(list.length);   //输出：4

  //向列表中的指定位置添加元素 在第0的位置上插入Android
  list.insert(0, "Android");
  print(list);          //输出：[Android, 3, false, Kinght, 7]

  //判断数组中是否有某元素
  print(list.indexOf("Android")); //这里存在，输出对应的下标，如果没有则输出-1

  //排序
  List list1 = [3,1,2,6,7];
  // 根据语法提示： List.sort([(int, int) → int compare]) → void
  list1.sort((a,b) => a.compareTo(b));
  print(list1);           //输出：[1, 2, 3, 6, 7]
```
### Map

```
 //1.通过构建器来创建Map
  Map map1 = new Map();
  //添加值 赋值
  map1["one"] = 'Android';
  map1["two"] = 'IOS';
  map1["three"] = 'Flutter';
  print(map1);              //输出：{one: Android, two: IOS, three: Flutter}

  //2.通过复制的形式
  Map map2 = Map.of(map1);
  print(map2);              //输出：{one: Android, two: IOS, three: Flutter}

  //3.跟上面形式一样  Object.fromEntries() 函数传入一个键值对的列表，并返回一个带有这些键值对的新对象。
  // 这个迭代参数应该是一个能够实现@iterator方法的的对象，返回一个迭代器对象。它
  // 生成一个具有两个元素的类似数组的对象，第一个元素是将用作属性键的值，第二个元素是与该属性键关联的值。
  Map map3 = Map.fromEntries(map1.entries);
  print(map3);

  //4.直接声明，直接赋值key为String类型的map
  Map map4 = {'one':'Android',
    'two':'IOS',
    'three':'Flutter'};
  print(map4);              //输出：{one: Android, two: IOS, three: Flutter}

  //5.创建一个空的Map
  Map map5 = Map.identity();
  print(map5);              //输出：{}


  //6.创建不可变的Map
  Map map6 = const {'one':'Android','two':'IOS','three':'flutter'};
  print(map6);              //输出：{one: Android, two: IOS, three: flutter}

  //7.在目标的map6创建(复制)新的不可修改map7
  Map map7 = Map.unmodifiable(map6);
  print(map7);              //输出：{one: Android, two: IOS, three: flutter}

  //8.创建key为int值得map
  Map map8 = {1:'Android',
    2:'IOS',
    3:'Flutter'};
  print(map8);              //输出：{1: Android, 2: IOS, 3: Flutter}

  //9.根据list所提供的key value来创建map
  List<String> keys = ['one','two'];
  List<String> values = ['Android','IOS'];
  Map map9 = Map.fromIterables(keys, values);
  print(map9);               //输出：{one: Android, two: IOS}
  
   //通过构建器来创建Map
   Map map10 = new Map();
   //添加值 赋值 赋值不同类型的Map
   map10["one"] = 'Android';
   map10["two"] = 'IOS';
   map10["three"] = 'Flutter';
   map10[4] = 'RN';
   print(map10);              //输出：{one: Android, two: IOS, three: Flutter, 4: RN}

```
常用API

```
 //创建Map key是int类型，value是String类型
   var  map1 = new Map<int,String>();

   //对Map第一个位置赋值，中括号是key
   map1[0] = 'Android';
   //对Map第二个位置赋值
   map1[1] = 'IOS';
   //对Map第三个值赋值
   map1[2] = 'flutter';
   //对Map赋空值
   map1[3] = null;
   //因为Map中的键值是唯一的，当第二次输入的key如果存在，Value会覆盖之前
   map1[2] = 'RN';
   print(map1);                //{0: Android, 1: IOS, 2: RN, 3: null}

   //获取Map的长度
   print(map1.length);         //输出：4

   //判断Map是否为空
   print(map1.isNotEmpty);     //输出结果：true

   //判断Map是否不为空
   print(map1.isEmpty);        //输出结果：false

   //检索Map是否含有某个Key
   print(map1.containsKey(1)); //输出：true

   //检索Map是否包含某个Value
   print(map1.containsValue('Android'));  //输出：true

   //删除某个键值对
   map1.remove(0);
   print(map1);                //输出：{1: IOS, 2: RN, 3: null}

   //获取所有的key
   print(map1.keys);           //输出：(1, 2, 3)

   //获取所有的values
   print(map1.values);         //输出：(IOS, RN, null)

   //循环打印
   /*
     key:1, value:IOS
     key:2, value:RN
     key:3, value:null

    */
     map1.forEach((key,value) {
     print("key:${key}, value:${value}");
   });
```