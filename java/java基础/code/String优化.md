1. split()方法优化
    
    通常情况下，split()方法带给我们很大的方便，但是其性能不是很好。建议结合使用indexOf()和subString()方法进行自定义拆分，这样性能会有显著的提高。　

2. String的累加操作优化方法

    使用+号拼接字符串，其效率明显较低，而使用StringBuffer和StringBuilder的append()方法进行拼接，效率是使用+号拼接方式的百倍甚至千倍，而StringBuffer的效率比StringBuilder低些，这是由于StringBuffer实现了线程安全，效率较低也是不可避免的。所以在字符串的累加操作中，建议结合线程问题选择，应避免使用+号拼接字符串。

2. 基本数据类型转化为String类型的优化方案

        Interger num=1000;

        String s= num +"";
        String s= String.valueOf(num);
        String s= num.toString();

    建议童鞋们避免使用+”“的方式转换，最好是使用基本数据类型自带的toString()方法转换