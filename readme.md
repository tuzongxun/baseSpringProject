# 一个最基础的spring-mvc项目
## 创建原因
本项目很简单，是一个最基础的spring mvc项目，创建原因如下：
1. 近期有同事欲学习spring-mvc，希望找一个只包含spring-mvc的基础项目做参考
1. spring-mvc使用频率很高，为了方便自己以后搭建项目不再那么麻烦，正好创建一个这样的基础项目存档
1. 自己对spring-mvc很多细节实际上也不是很熟，正好借此机会温故知新

## 项目目标
基于上边的创建原因，本项目的目标如下：
1. 只包含spring-mvc最基础的必须配置的web.xml文件
1. 只包含spring-mvc最基础的必须配置的spring.xml文件，由于配置少就不拆分
1. 只包含一个controller类
1. 只包含一个service接口和一个个实现类，实现类使用xml文件方式装配
1. 只包含一个dao接口和一个dao实现类，dao使用注解方式装配
1. 只包含一个model实体类
1. 不涉及日志管理、数据库操作等任何拓展

## 项目环境
1. eclipse4.6.3
1. java8
1. spring-mvc4.3.9
1. maven3.2.5
1. tomcat7