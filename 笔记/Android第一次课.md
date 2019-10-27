## 四大组件
- Activity
	- 一个Activity通常就是一个单独的屏幕.
- Service
	- Service用于在后台完成用户指定的操作
- Broadcast Receiver
	- 你的应用可以使用它对外部事件进行过滤，只对感兴趣的外部事件(如当电话呼入时，或者数据网络可用时)进行接收并做出响应
- Content Provider
	- Android平台提供了Content Provider使一个应用程序的指定数据集提供给其他应用程序


![](https://raw.githubusercontent.com/aka1i/shiyanshi/master/%E5%9B%BE%E7%89%87%E8%B5%84%E6%BA%90/Android/Activity%E7%94%9F%E5%91%BD%E5%91%A8%E6%9C%9F.webp)
- onCreate(): 加载布局文件，绑定数据，初始化控件。
- onStart(): 在Activity变为可视的时候，调用onStart()。
- onResume(): 当Activity处于栈顶，并处于正在运行的状态，可以与用户进行交互的时候，调用onResume()。
- onPause(): 当Activity已经失去焦点，且依旧是可视状态调用onPause(),此时Activity无法与用户进行交互。
- onStop(): 当Activity从可视变为不可视的时候，调用onStop()。
- onDestory(): 在Activity被销毁前调用。

## Context
Context的中文翻译为：语境; 上下文; 背景; 环境。在开发中我们经常说称之为“上下文”，那么这个“上下文”到底是指什么意思呢？在语中，我们可以理解为语境，在程序中，我们可以理解为当前对象在程序中所处的一个环境，一个与系统交互的过程。比如微信聊天，此时的“环境”指聊天的界面以及相关的数据请求与传输，Context在加载资源、启动Activity、获取系统服务、创建View等操作都要参与。

#### 获取context
- Activity.this ,返回当前的Activity实例，如果是UI控件需要使用Activity作为Context对象，但是默认的Toast实际上使用ApplicationContext()也可以。
- View.getContext() ,返回当前View对象的Context对象，通常是当前正在展示的Activity对象。
-  Activity.getApplicationContext() ,获取当前Activity所在的(应用)进程的Context对象，通常我们使用Context对象时，要优先考虑这个全局的进程Context。
- ContextWrapper.getBaseContext() ,用来获取一个ContextWrapper进行装饰之前的Context，
可以使用这个方法，这个方法在实际开发中使用并不多，也不建议使用。

![](https://raw.githubusercontent.com/aka1i/shiyanshi/master/%E5%9B%BE%E7%89%87%E8%B5%84%E6%BA%90/Android/context.png)


#### 正确使用Context
###### 一般Context造成的内存泄漏，几乎都是当Context销毁的时候，却因为被引用导致销毁失败，而Application的Context对象可以理解为随着进程存在的，所以我们总结出使用Context的正确姿势：
1. .当Application的Context能搞定的情况下，并且生命周期长的对象，优先使用Application的Context。
1. 不要让生命周期长于Activity的对象持有到Activity的引用。
1. 尽量不要在Activity中使用非静态内部类，因为非静态内部类会隐式持有外部类实例的引用，如果使用静态内部类，将外部实例引用作为弱引用持有。