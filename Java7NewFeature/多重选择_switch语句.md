在处理多个选项时，使用if/else结构显得有些笨拙。Java有一个与C/C++完全一样的switch语句。
例如，如果建立一个包含4个选项的菜单系统，可以使用下列代码:
```java
Scanner in = new Scanner(System.in);
System.out.print("Select an option (1, 2, 3, 4)");
int choice = in.nextlnt();
switch (choice){
	case 1:break;
	case 2:break;
	case 3:break;
	case 4:break;
	default:
	// bad input break;
}
```
switch 语句将从与选项值相匹配的case标签处开始执行直到遇到break语句，或者执行到switch语句的结束处为止。如果没有相匹配的case标签，而有default子句，就执行这个子句。

case 标签可以是:
- 类型为 char、byte、short或int的常量表达式。
- 枚举常量。
- 从 Java SE 7开始,case标签还可以是字符串字面量。
例如:
```java
switch (input.toLowerCase()){
	case "yes": // OK since Java SE 7
	...
	break;
	...
}
```
当在switch语句中使用枚举常量时，不必在每个标签中指明枚举名，可以由switch的表达式值确定。例如:
```java
Size sz = . . .; 
switch (sz){
	case SMALL: // no need to use Size.SMALL
	...
	break;
	...
}
```
