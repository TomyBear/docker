#镜像基于jdk
FROM openjdk:8u181-jdk-alpine

#镜像制作者信息
MAINTAINER lx  17721482944@163.com

ARG workdir=/app

#创建一个可以从本地主机或其他容器挂载的挂载点，一般用来存放数据库和需要保持的数据等。
VOLUME ${workdir}

#为后续的 RUN 、 CMD 、 ENTRYPOINT 指令配置工作目录。
WORKDIR ${workdir}

#将jar包复制到指定镜像中
ADD docker-0.0.1.jar demo.jar

#暴漏容器运行时的监听端口给外部
EXPOSE 8081

#启动时的默认命令
ENTRYPOINT ["java", "-jar", "demo.jar"]