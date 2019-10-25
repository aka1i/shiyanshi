class FourthClass{
  void functionA(){
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
  }
  void functionB(){
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
  }
  void functionC(){
    //1.通过构建器来创建Map
    Map map1 = new Map();
    //添加值 赋值
    map1["one"] = 'Android';
    map1["two"] = 'IOS';
    map1["three"] = 'Flutter';
    print(map1);              //输出：{one: Android, two: IOS, three: Flutter}

    //2.通过复制的形式(深拷贝)
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
  }
  void functionD(){
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
  }
}