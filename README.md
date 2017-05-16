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


## 关于pwoerMock
powerMock 功能很强大，可以模拟静态方法，final 方法，私有方法。
但是，使用powerMock 的时候，其实是在掩盖设计问题，一个合格的设计需要考虑可测试性，当使用powerMock 模拟static ，final，private 的时候，可以通过修改设计来解决。
powerMock 在模拟static 等的时候，是pwoermock自己的classloader来实现 ，所以，与多个第三方包集成测试时，会出现很多classCaseException。
有一种解决办法是，通过使用@PowerMockIgnore注解来去掉classloader 的冲突。

[参考]（http://stackoverflow.com/questions/38268929/runwithpowermockrunner-class-vs-runwithmockitojunitrunner-class）
