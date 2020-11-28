﻿  ## im(仿QQ聊天室服务端)

  ### 主要使用的第三方技术  
  *  Netty，通信网关  
  *  spring，作为IOC容器  
  *  MyBatics，作为持久化方案  

  ### 功能列表  
  *  用户注册/登录/好友列表/私聊界面(包括用户界面)  
  *  通过http后台请求管理服务进程  
  *  用户数据的持久化  
  *  使用独立线程池处理用户消息 　

  ### ToDoList  
  *  使用SpringCloud打造为分布式系统   
  *  在线/离线文件传输   
  *  异步处理用户数据的持久化  
  *  开发更多的交互功能        

  ### QuickStart  
  1. 安装git后，使用命令 git clone https://github.com/kingston-csj/chat_server  
  2. 新建数据库chat_room，导入im-chat/src/test/resources目录下的chat_room.sql   
  3. 在applicationContext.xml文件配置本地数据库连接属性，启动ServerStartup
  4. 另起新目录，下载客户端代码 git clone https://github.com/kingston-csj/chat_client  
  5. 启动ClientStartup类, 即可看到登录界面（临时密码为000）


  ### 部分客户端运行效果
  登录界面  
  ![](/screenshots/login.png "登录界面")  

  主界面  
  ![](/screenshots/main.png "主界面")  
  　　

  ###  案例教程 
  栏目教程 --> [csdn专栏博客](https://blog.csdn.net/littleschemer/article/category/9269527)  
  wiki说明 --> [wiki](https://github.com/kingston-csj/im/wiki)
   

  ### 客户端源代码  
  --> [客户端wechat](https://github.com/kingston-csj/wechat)
  
  ## 请作者喝杯咖啡
  如果您觉得有所收获，可以请作者喝杯咖啡。大家的支持，促使我不断改进优化，谢谢！  
  ![](/screenshots/wx.png "微信收款码")
  ![](/screenshots/zfb.jpg "支付宝收款码")

  ## 欢迎交流讨论
  欢迎star/fork，欢迎学习/使用，期待一起贡献代码 !!  
  如果您发现bug，或者有任何疑问，请提交issue !!   
  

