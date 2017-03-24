# practice

这只是我的一些测试 。

## NOTE
spring3.2 的程序只支持jdk 1.7
spring4 的程序只支持jdk1.8
如果项目使用1.8 那么需要升级到spring4 否则会出现
```
ASM ClassReader failed to parse class file -
probably due to a new Java class file version that isn't supported yet:
file [D:\workspace\back\idea\practice\target\test-classes\asia\zrc\springDemo\common\service\BaseServiceTest.class];
nested exception is java.lang.IllegalArgumentException
```
[参考](http://stackoverflow.com/questions/22526695/java-1-8-asm-classreader-failed-to-parse-class-file-probably-due-to-a-new-java)

spring4 是支持jdk7和6的，但是项目如果是jdk8，那么spring必须使用4以上的版本
