# Demo for CPSC 304 Project

## 如何使用这个Project
- 用你们自己的Github账号(不是学校的)
- `git clone https://github.com/JohnLi1999/cpsc304_demo.git`

## 配置数据库
- 在MySQL WorkBench里手动创建一个`cpsc304_demo`数据库
- 或者复制然后运行下面这个SQL
    - `CREATE DATABASE cpsc304_demo`

## 如何运行这个Project
- 用intellij IDEA打开项目，点击运行键(下面图上的绿色按钮)
    ![Run](img/run.png)
- 或者用command line
-   ```
    cd cpsc304_demo
    ./gradlew bootRun
    ```
      
## 运行成功会显示
1. IDEA里面显示这些信息
    ![Idea](img/idea.png)
2. 然后打开browser，输入这个url `http://localhost:8080`，按下回车之后能自动跳转到这样的login界面就是运行成功了
    ![Browser](img/browser.png)