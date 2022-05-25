# SpringMVC tutorial by Qin jiang

## 1.1、什么是MVC
MVC是模型(Model)、视图(View)、控制器(Controller)的简写，是一种软件设计规范.是将业务逻辑、数据、显示分离的方法来组织代码。

MVC主要作用是降低了视图与业务逻辑间的双向耦合，MVC不是一种设计模式，MVC是一种架构模式。当然不同的MVC存在差异。

Model（模型）：数据模型，提供要展示的数据，因此包含数据和行为，可以认为是领域模型或JavaBean组件（包含数据和行为），不过现在一般都分离开来：Value Object（数据Dao） 和 服务层（行为Service）。也就是模型提供了模型数据查询和模型数据的状态更新等功能，包括数据和业务。

View（视图）：负责进行模型的展示，一般就是我们见到的用户界面，客户想看到的东西。

Controller（控制器）：接收用户请求，委托给模型进行处理（状态改变），处理完毕后把返回的模型数据返回给视图，由视图负责展示。也就是说控制器做了个调度员的工作。

最典型的MVC就是JSP + servlet + javabean的模式。

**职责分析：**

Controller： 1.取得表单数据 2.调用业务逻辑 3.转向指定的页面

Model：1.业务逻辑 2.保存数据的状态

View：显示页面

**MVC框架要做哪些事情**

1.将url映射到java类或java类的方法 2.封装用户提交的数据 处理请求--调用相关的业务处理--封装响应数据

3.将响应的数据进行渲染 (jsp / html 等表示层数据)

说明：常见的服务器端MVC框架有：Struts、Spring MVC、ASP.NET MVC、Zend Framework、JSF；常见前端MVC框架：vue、angularjs、react、backbone；由MVC演化出了另外一些模式如：MVP、MVVM 等等....



# 1.2 什么是SpringMVC

Spring MVC的特点：

1.轻量级，简单易学

2.高效 , 基于请求响应的MVC框架

3.与Spring兼容性好，无缝结合

4.约定优于配置

5.功能强大：RESTful、数据验证、格式化、本地化、主题等

6.简洁灵活

