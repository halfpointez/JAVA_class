# CSSE-2130 Java 学习计划

最后更新：2026-11-11  
状态：21 份幻灯片都已放在 `slides/`。U1-01 已出题，等用户作答。下一动作见文末「进度」。

新对话先读本文件，从「下一动作」接着做。不要重讲「已完成」的考点，不要改写本文件里已经确认的学法，除非用户明确要求改。

## 目标

按本文件夹的课件学完 CSSE-2130（Fall 2026，University of Detroit Mercy），并补上大纲有、课件没有的三块：抽象类与接口、文件输入输出、JavaFX。

期中已经考完。不再做期中冲刺。后面的课程目标是把资料里的单元全部弄完，服务期末（大纲：理论 + 编程，占 30%）以及尚未完成的作业与项目。

成绩里和练习相关的部分：Assignments 15%，Mini-Projects 15%，Quizzes 10%，Midterm 25%（已考），Final 30%。出勤另有 5%。

## 已确认的学法

1. 讲解用中文。只有考点写出中英双语，例如「整数除法 integer division」。其余不逐句双语。
2. 顺序是 U1 → U6，全部做完。已经会的单元用题加快，不整份重讲 PPT，也不默默跳过。
3. 用户靠自己写代码记住内容。出题形式不僵化，按该考点最好的方式来：
   - 能写成小程序的：给需求、样例输入输出、类名和方法名。方法体不先给。
   - 考点是语义或易错点：可以先预测输出或改一段有 bug 的代码，再写一个小例子。
   - 几个考点必须连在一起才有意义：合成一道稍大的题，仍然由用户写。
4. 用户把代码放在 `practice/` 下对应该单元的目录，自己用 `javac` / `java` 编译运行，然后给出文件路径。本机 JDK 为 26。题目只用课件里的语法，不用记录类、模式匹配等新特性。
5. 讲评先指出错处和考点（中英），再给最小对照修改。不在用户动笔前给完整实现。
6. 课件之外只补这门课考试和作业会踩的易错点，不扩到资料用不到的框架。
7. 练习题是新题，不把成绩作业的原文当作练习。作业和项目由用户自己写。用户写完后可以拿来审查，只指出问题，不改成可提交版本。
8. 每完成一个考点，更新本文件的进度和下一动作，避免上下文丢失。
9. 讲解做成 WPS 能打开的幻灯片，放在 `slides/`。一页一个要点，提问页放在后面，答案不写进学生作答前的那一份。对话里只提问和讲评，不在终端里重贴整节课。

## 资料地图

| 路径 | 用途 |
| --- | --- |
| `Syllabus Java - Fall 2026.pdf` | 周次、成绩、诚信要求 |
| `PPT/U1_01` … `U1_04` | 环境、简单程序、分支、循环 |
| `PPT/U2_01` … `U2_03` | 类与对象、equals/compareTo、字符串与字符 |
| `PPT/U3_01` | 数组、ArrayList、异常 |
| `PPT/U4` | 组合、内部类 |
| `PPT/U5` | 继承 |
| `PPT/U6_01` | 多态 |
| `homework/` | 成绩作业，只审查，不代写 |
| `code_inclass/` | 课堂代码压缩包，讲到对应单元时对照 |
| `Lab/`、`in_class_activity/` | 目前没有题目文件 |

`U2_03 Strings and Characters.pdf` 与带 `(1)` 的那份内容相同，只学一份。

## 幻灯片

全部在 `slides/`。讲解页在前，最后一页是题，答案不在文件里。页脚写了对应的原课件。

| 文件 | 依据 |
| --- | --- |
| `U1-01-java-environment.pptx` | `PPT/U1_01`。6 页。三类错误、五步、字节码 |
| `U1-02-writing-programs.pptx` | `PPT/U1_02`。7 页。Welcome1、整数除法、printf、Scanner、CircleArea 的 PI |
| `U1-03-decisions.pptx` | `PPT/U1_03`。6 页。OddEven、No output? Why?、switch 漏 break |
| `U1-04-loops.pptx` | `PPT/U1_04`。6 页。第 5 页的 `++` 连写、GPA、哨兵 -1 |
| `U2-01-classes.pptx` | `PPT/U2_01`。7 页。Rectangle 从 public/height 改到 private/length，Account，TrafficLight |
| `U2-02-copy-equals.pptx` | `PPT/U2_02`，只有 6 页。copy、clone、equals 里的 `and` 要改成 `&&`。`toString` 是第 4 周大纲有、这 6 页没有 |
| `U2-03-strings.pptx` | `PPT/U2_03`。6 页。不可变、StringBuilder、Character |
| `U3-01-arrays.pptx` | `PPT/U3_01` 前半。5 页。`int a[], b, c = 3` 只有 a 是数组 |
| `U3-02-arraylist.pptx` | `PPT/U3_01` 第 25、32 页。4 页。书名用课件原文 The Man and the Sea |
| `U3-03-exceptions.pptx` | `PPT/U3_01` 第 33–40 页。4 页。二维数组、`average(4, 6, 2)`、第 40 页 finally 原文 |
| `U4-01-composition.pptx` | `PPT/U4` 前半。5 页。Jarir、Hunger Games、equalsTo |
| `U4-02-inner-classes.pptx` | `PPT/U4` 第 13–17 页。4 页 |
| `U5-01-inheritance.pptx` | `PPT/U5`。5 页。Person、Employee、CommissionEmployee、getPayAmount |
| `U5-02-isa-object.pptx` | `PPT/U5` 第 14–16、20 页。4 页 |
| `U6-01-polymorphism.pptx` | `PPT/U6_01`。5 页。Shape、Splendor、Honda 的 speedlimit、第 14 页 BabyDog |
| `U6-02-casting.pptx` | `PPT/U6_01` 第 15–20 页。4 页 |
| `U6-03-abstract-interface.pptx` | 大纲第 7 周。课件没有。标题上写了这一点 |
| `U7-01-files.pptx` | 课程目标第 2 条。课件没有。只到文本文件 |
| `U8-01-javafx-stage.pptx` | 大纲第 8 周。课件没有 |
| `U8-02-scene-builder.pptx` | 大纲第 8 周。课件没有 |
| `U8-03-javafx-poly.pptx` | 大纲第 8 周后半：多态和接口放进界面。课件没有 |

课堂压缩包在 `code_inclass/`，讲到对应单元、需要对照实现时再打开。练习题不使用 `homework/` 里的题目原文。

资料夹里没有 JavaFX 和文件输入输出的课件。二者按大纲处理，不按资料夹有没有 PDF 来跳过：

- 文件输入输出要学，但是短单元。课程目标第 2 条要求控制台和文件的输入输出。八周课表没有单独的文件周，作业 PDF 里也没有。范围停在文本文件的读和写，以及必须处理的受检异常。不讲 NIO、对象序列化，也不把 `java.util.stream` 流式 API 算进这个单元。
- JavaFX 要完整学。它是主题第 8 项，第 8 周（11 月 23 日–29 日）的内容，课程目标第 4 条是做出图形界面。范围按该周条目：Stage、Scene、布局，用 Scene Builder 做界面，再把控件接到 Java 代码。同一周还要求把多态和接口用进更大的程序。
- 抽象类和接口要学。主题第 6、7 项和第 7 周都有，并且有 Polymorphism/Interfaces 迷你项目。`PPT/U6_01` 只写到多态和转型，所以这一节不以课件为限。
- applet 只出现在课程简介，课表和主题列表都没有，不讲。迷你项目评分说明里提到 multithreading，主题列表和八周课表都没有，不单开单元。

## 单元与考点

状态用：未开始 / 进行中 / 已完成。

### U1 基础

- [ ] U1-01 Java 环境与三类错误（compile-time / runtime / logic）。进行中。概念为主，用判断和改错，不硬凑空程序。
- [ ] U1-02 变量、基本类型、算术、常量、`String`、输入输出。易错：integer division、`=` 与 `==`、类型转换。
- [ ] U1-03 关系运算、`if`、条件运算符、`switch`。易错：`else` 悬挂、`switch` 缺少 `break`、用 `==` 比较字符串。
- [ ] U1-04 `while`、`do-while`、`for`、`break`、`continue`。易错：边界少一次或多一次、循环变量改错。

### U2 类与字符串

- [ ] U2-01 类与对象、封装、构造方法、访问修饰符、实例变量与局部变量、枚举。
- [ ] U2-02 拷贝、`clone`、`equals`、`compareTo`、`toString`。易错：`==` 比较的是引用。第 4 周明确列出 `toString`、`equals`、`compareTo`。
- [ ] U2-03 `String`、`StringBuilder`、`Character`。易错：`String` 不可变，改完必须接住返回值。

### U3 数组与异常

- [ ] U3-01 数组、对象数组、`Arrays` 工具类。易错：下标、长度与有效元素个数。
- [ ] U3-02 `ArrayList`。易错：删除元素时下标前移。
- [ ] U3-03 异常：`try` / `catch` / `finally`，以及课件里的多维数组、可变参数。

### U4 组合

- [ ] U4-01 has-a、对象引用、组合里的 `ArrayList`。
- [ ] U4-02 内部类（private、static、访问外部类）。

### U5 继承

- [ ] U5-01 继承、方法重写、子类构造与 `super`。易错：构造顺序、重写与重载。
- [ ] U5-02 is-a 与 has-a、`Object`、`instanceof`。

### U6 多态

- [ ] U6-01 父类类型引用、动态绑定、向上转型。
- [ ] U6-02 向下转型、`instanceof`、静态绑定与动态绑定的差别。
- [ ] U6-03 抽象类、接口、一个类实现多个接口。课件没有这一节，按第 7 周和迷你项目 3 来。易错：抽象类不能 `new`，接口方法的实现责任，接口类型的引用。

### U7 文件输入输出（短单元）

- [ ] U7-01 用 `Scanner` 读文本文件，用 `PrintWriter` 写文本文件，用 `try` / `catch` 处理受检异常。易错：文件路径、忘记 `close` 或不用 try-with-resources、把编译期异常当成普通运行错误。

### U8 JavaFX（第 8 周）

- [ ] U8-01 一个 JavaFX 程序的 Stage、Scene、布局。
- [ ] U8-02 Scene Builder 做出界面，控件事件接到 Java 代码。
- [ ] U8-03 把多态或接口用进这个界面程序。这一节合成一道稍大的题。

## 作业对照（只审查）

| 文件 | 对应单元 | 用户要交的东西 |
| --- | --- | --- |
| `Assignement 2.pdf` | U1 方法与分支 | `Triangle.java`，海伦公式，负边长提示 |
| `Classes Assignment.pdf` | U2 | `Employee` 与 `EmployeeTest`，静态调薪 |
| `Project1.pdf` | U2 | 工程 bank：`Account` 存款取款，对话框交互 |
| `MiniProject2.pdf` | U3 | `Book` 数组 + `Library` 菜单 |
| `Inheritance_Project.pdf` | U5 | `Account` → `SavingsAccount` → `CheckingAccount` |

练习题不使用上表的题目原文。

## 每次会话怎么做

1. 读本文件的「进度」。
2. 幻灯片已经按上表做完。对话里指出看哪一份、从第几页开始回答，不把幻灯片正文再贴一遍。用户写，助手不先给实现。
3. 用户给出 `practice/` 里的路径后，助手编译或阅读代码，先讲错处和考点，再给最小对照。
4. 把该考点改成已完成或记下卡在哪里，更新「下一动作」和日期。

## 进度

- 当前单元：U1-01 进行中。后面的幻灯片都已生成，还没开始做题。
- 讲解文件：`slides/` 下 21 份。先打开 `U1-01-java-environment.pptx`。
- 下一动作：看完 U1-01 第 1–4 页后，按第 5–6 页在对话里回答。第 6 页的代码改好后，把 `practice/u1/Temperature.java` 的路径发来。正确结果是 25 摄氏度打印 `77.0`。
- 已完成考点：无
- 卡住的点：无

### 日志

- 2026-11-11：写好计划。期中已考完。学法按上文「已确认的学法」。尚未出题。
- 2026-11-11：按大纲补范围。文件输入输出为短单元。JavaFX 为完整单元。抽象类和接口并入 U6。applet 与 multithreading 不单开。
- 2026-11-11：用户确认计划。已出 U1-01，等用户作答。
- 2026-11-11：讲解改为幻灯片。文件 `slides/U1-01-java-environment.pptx`。对话只负责提问和讲评。
- 2026-11-11：对照 `PPT/` 里 12 份课件（U2_03 的重复文件只算一份）和大纲，写完 U1-02 到 U8-03。课件没有的三份在标题上标明。U1-01 仍等用户作答。
