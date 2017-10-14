# Activity的启动模式


---

**什么是启动模式**
Activity启动的策略
AndroidManifest.xml中的标签的android:launchMode属性设置


----------


**启动模式有什么作用**
可以更好的根据用户需求在Back Stack中管理Activity提高用户体验


----------
##ACtivity的启动模式##

 1. Standard 默认启动模式
 2. Singletop 
 3. SingleTask
 4. Singlelnstance

----------
 Standard 默认启动模式
 ACtivity会根据启动顺序压入Back Stack
 
Singletop 避免多次开启；例如：浏览器书签
栈顶唯一

SingleTask 栈内唯一 为一般界面的主界面，耗费资源
栈内唯一

Singlelnstance 只存在一个实例的时候，来电的页面
单独启动Back Stack

----------


