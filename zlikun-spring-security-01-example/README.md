# zlikun-spring-security-01-example

`spring-security`基本示例

#### 参考资料
- <http://wiki.jikexueyuan.com/project/spring-security/>
- <http://www.yiibai.com/spring-security/>
- <http://www.iteye.com/blogs/subjects/spring_security>
- <https://github.com/liangzai-cool/springsecuritystudy>

#### Gretty配置参考
- <http://akhikhl.github.io/gretty-doc/Getting-started.html>
- <http://akhikhl.github.io/gretty-doc/Gretty-configuration.html>
- <http://akhikhl.github.io/gretty-doc/Gretty-tasks>

#### 生成证书(密钥库)
```
# 密钥库密码：123456
$ keytool -genkey -alias saml.zlikun.com -keyalg RSA -keysize 2048 -keystore saml.zlikun.com.keystore -validity 3650 -v -dname "C=CN,ST=SH,L=SH,O=zlikun.com,OU=zlikun.com,CN=saml.zlikun.com"
```

#### Gretty配置
```
gretty {
    host = "saml.zlikun.com"
    httpPort = 80
    httpEnabled = true
    httpsPort = 443
    httpsEnabled = true
    sslKeyStorePath = "${project.projectDir}/etc/saml.zlikun.com.keystore"
    sslKeyStorePassword = "123456"
    contextPath = ""
    servletContainer = "jetty9"
    loggingLevel = "INFO"
    logDir = "${project.buildDir}/logs"
    logFileName = "server.log"
    onStart {
        println("Server启动中 ...")
    }
    onStop {
        println("Server停止中 ...")
    }
}
```

#### 关于登录
- username-parameter：表示登录时用户名使用的是哪个参数，默认是："j_username"
- password-parameter：表示登录时密码使用的是哪个参数，默认是："j_password"
- login-processing-url：表示登录时提交的地址，默认是："/j-spring-security-check"。这个只是 Spring Security 用来标记登录页面使用的提交地址，真正关于登录这个请求是不需要用户自己处理的