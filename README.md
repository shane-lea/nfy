
目录结构
nfy 下的pom文件为 主pom文件 其他module都是此pom文件中modules的组成
nfy-starter是启动类


1、新建system模块
2、在system下新建api 和bis - bis依赖api
3、新建包 eg.com.nfy.module.system
4、bis引入web依赖；新建测试controller
5、主启动模块引入实现模块，对外提供API接口
6、接入knife4j：访问地址 [http://ip:port/doc.html]
7、测试service
8、接入单元测试和jacoco扫描插件
9、在framework中引入common模块
10、返回数据格式统一和全局以及业务异常引入


代码生成 / 多数据源







