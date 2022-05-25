# SpringMVC tutorial by Qin jiang

## 1.1��ʲô��MVC
MVC��ģ��(Model)����ͼ(View)��������(Controller)�ļ�д����һ�������ƹ淶.�ǽ�ҵ���߼������ݡ���ʾ����ķ�������֯���롣

MVC��Ҫ�����ǽ�������ͼ��ҵ���߼����˫����ϣ�MVC����һ�����ģʽ��MVC��һ�ּܹ�ģʽ����Ȼ��ͬ��MVC���ڲ��졣

Model��ģ�ͣ�������ģ�ͣ��ṩҪչʾ�����ݣ���˰������ݺ���Ϊ��������Ϊ������ģ�ͻ�JavaBean������������ݺ���Ϊ������������һ�㶼���뿪����Value Object������Dao�� �� ����㣨��ΪService����Ҳ����ģ���ṩ��ģ�����ݲ�ѯ��ģ�����ݵ�״̬���µȹ��ܣ��������ݺ�ҵ��

View����ͼ�����������ģ�͵�չʾ��һ��������Ǽ������û����棬�ͻ��뿴���Ķ�����

Controller�����������������û�����ί�и�ģ�ͽ��д���״̬�ı䣩��������Ϻ�ѷ��ص�ģ�����ݷ��ظ���ͼ������ͼ����չʾ��Ҳ����˵���������˸�����Ա�Ĺ�����

����͵�MVC����JSP + servlet + javabean��ģʽ��

**ְ�������**

Controller�� 1.ȡ�ñ����� 2.����ҵ���߼� 3.ת��ָ����ҳ��

Model��1.ҵ���߼� 2.�������ݵ�״̬

View����ʾҳ��

**MVC���Ҫ����Щ����**

1.��urlӳ�䵽java���java��ķ��� 2.��װ�û��ύ������ ��������--������ص�ҵ����--��װ��Ӧ����

3.����Ӧ�����ݽ�����Ⱦ (jsp / html �ȱ�ʾ������)

˵���������ķ�������MVC����У�Struts��Spring MVC��ASP.NET MVC��Zend Framework��JSF������ǰ��MVC��ܣ�vue��angularjs��react��backbone����MVC�ݻ���������һЩģʽ�磺MVP��MVVM �ȵ�....



## 1.2 ʲô��SpringMVC

Spring MVC���ص㣺

1.������������ѧ

2.��Ч , ����������Ӧ��MVC���

3.��Spring�����Ժã��޷���

4.Լ����������

5.����ǿ��RESTful��������֤����ʽ�������ػ��������

6.������

## 1.3 ʹ��ע�⿪��SpringMVC

![avatar](https://mmbiz.qpic.cn/mmbiz_png/uJDAUKrGC7IicxBZbkh0D4dJJiaXSzGEXyzsXDPy7oAJFsBvvBibiaFWpSp75vFIEOCBm7wnt4JKXJCHB9MflUycKw/640?wx_fmt=png&wxfrom=5&wx_lazy=1&wx_co=1)


ʵ�ֲ�����ʵ�ǳ��ļ򵥣�

1.�½�һ��web��Ŀ

2.�������jar��

3.��дweb.xml , ע��DispatcherServlet

4.��дspringmvc�����ļ�

5.����������ȥ������Ӧ�Ŀ����� , controller

6.�������ǰ����ͼ��controller֮��Ķ�Ӧ

ʹ��springMVC�������õ��������

������ӳ����������������������ͼ������

ͨ��������ֻ��Ҫ�ֶ�������ͼ����������������ӳ�����ʹ�����������ֻ��Ҫ����ע���������ɣ���ʡȥ�˴�ε�xml����

Spring-servlet���õĳ�����������
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:mvc="http://www.springframework.org/schema/mvc"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context
       https://www.springframework.org/schema/context/spring-context.xsd
       http://www.springframework.org/schema/mvc
       https://www.springframework.org/schema/mvc/spring-mvc.xsd">
```

## 1.4 Controller���

������Controller

1.�����������ṩ����Ӧ�ó������Ϊ��ͨ��ͨ���ӿڶ����ע�ⶨ�����ַ���ʵ�֡�

2.��������������û������󲢽���ת��Ϊһ��ģ�͡�

3.��Spring MVC��һ������������԰����������

4.��Spring MVC�У�����Controller�����÷�ʽ�кܶ���

ʵ��Controller�ӿ�
Controller��һ���ӿڣ���org.springframework.web.servlet.mvc���£��ӿ���ֻ��һ��������

```java
//ʵ�ָýӿڵ����ÿ���������
public interface Controller {
    //���������ҷ���һ��ģ������ͼ����
    ModelAndView handleRequest(HttpServletRequest var1, HttpServletResponse var2) throws Exception;
}
```
