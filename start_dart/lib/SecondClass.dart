class SecondClass{
//  无参
  void functionA(){
    print('无参函数');
  }
// 有参函数
  void functionB(String name,{int height, int weight = 5000}){
    print('姓名：${name}  身高${height}   体重${weight}');
  }
  void functionC(String name,[int height, int weight]){
    print('姓名：${name}  身高${height}   体重${weight}');
  }
}