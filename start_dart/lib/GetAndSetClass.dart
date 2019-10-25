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