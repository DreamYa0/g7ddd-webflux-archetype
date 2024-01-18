# 脚手架分层设计

## G7领域驱动架构设计

![G7领域驱动设计架构](http://dreamyao.oss-cn-chengdu.aliyuncs.com/2022-06-08-144947.png)

## 脚手架模块依赖关系

![image.png](http://dreamyao.oss-cn-chengdu.aliyuncs.com/2022-06-08-082629.png)

- 适配层（Adapter Layer）或表示层（Express Layer）：负责对前端展示（web，wireless，wap）的路由和适配，对于传统B/S系统而言，adapter就相当于MVC中的controller；
- 应用层（Application Layer）：主要负责获取输入，组装上下文，参数校验，调用领域层做业务处理，如果需要的话，发送消息通知等。层次是开放的，应用层也可以绕过领域层，直接访问基础实施层；
- 领域层（Domain Layer）：主要是封装了核心业务逻辑，并通过领域服务（Domain Service）和领域对象（Domain Entity）的方法对App层提供业务实体和业务逻辑计算。领域是应用的核心，不依赖任何其他层次；
- 基础实施层（Infrastructure Layer）：主要负责技术细节问题的处理，比如数据库的CRUD、搜索引擎、文件系统、分布式服务的RPC等。此外，领域防腐的重任也落在这里，外部依赖需要通过gateway的转义处理，才能被上面的App层和Domain层使用。

## 分包策略

我们要综合考虑功能和领域两个维度包结构定义。按照领域和功能两个维度分包策略，最后呈现出来的，是如下图所示的顶层包节点是领域名称，领域之下，再按功能划分包结构。

![image.png](http://dreamyao.oss-cn-chengdu.aliyuncs.com/2022-06-08-083317.png)

| **层次**      | **包名**        | **功能**                    |
| ------------- |---------------|---------------------------|
| express层     | web           | 处理页面请求的Controller         |
| express层     | wireless      | 处理无线端的适配                  |
| application层 | event         | 发布与消费事件                   |
| application层 | converter     | 模型转换器                     |
| application层 | executor      | 处理request，包括command和query |
| application层 | scheduler     | 处理定时任务                    |
| domain层      | ability       | 领域能力，包括DomainService      |
| domain层      | gateway       | 领域网关，解耦利器                 |
| domain层      | model         | 领域模型                      |
| infra层       | gateway   | domain层网关实现               |
| infra层       | integrate     | 外部系统接口调用处理                |
| infra层       | dao           | mysql数据库操作                |
| infra层       | mongo         | mongo数据库操作                |
| infra层       | elasticsearch | elasticsearch操作           |

## 项目示例

我们在每一个module下面首先按照领域做一个顶层划分，然后在领域内，再按照功能进行分包。

![image.png](http://dreamyao.oss-cn-chengdu.aliyuncs.com/2022-06-08-083840.png)

