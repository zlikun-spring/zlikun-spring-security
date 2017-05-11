# zlikun-spring-security-01-example

`spring-security`基本示例

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