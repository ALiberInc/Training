带资源的try语句(try-with-resources) 的最简形式为:
try (Resource res = . . .) {
	work with res 
}
try块退出时，会自动调用res.close()。下面给出一个典型的例子，这里要读取一个文件中的所有单词:
try (Scanner in = new Scanner(new FileInputStream(/usr/share/dict/words")), "UTF-8"){
	while (in.hasNextO) {
		System.out.println(in.next());
	}
}
这个块正常退出时，或者存在一个异常时，都会调用in.close()方法，就好像使用了finally块一样。
还可以指定多个资源。例如:
try (Scanner in = new Scanner(new FileInputStream(“/usr/share/dict/words")，"UTF-8")；PrintWriter out = new PrintWriter("out.txt")){
	while (in.hasNext(){
		out.println(in.next().toUpperCase());
	}
}
不论这个块如何退出，in和out都会关闭。