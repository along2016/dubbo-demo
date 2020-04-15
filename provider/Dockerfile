FROM java:8

LABEL AUTHOR=wjl
LABEL EMAIL=845506513@qq.com

# 时区
ENV TZ=Asia/Shanghai

# 启用配置文件 默认为 application.yml
ENV ACTIVE=default

# 设置镜像时区
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

CMD exec java -Dloader.path="/home/libs" -jar /home/app.jar -Dspring.profiles.active=${ACTIVE}
COPY /target/*.jar /home/app.jar
COPY /target/libs /home/libs/