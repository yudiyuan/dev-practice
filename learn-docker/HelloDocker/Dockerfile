FROM node:14-alpine
# 指定基础镜像 作为镜像的起点
# alpine是一个超轻量级的Linux发行版 转为容器设计的
# RedHat CentOS也是常见的Linux发行版
COPY index.js /index.js
# 把本地的index.js文件复制到镜像中的/根目录下
# Docker镜像中的/根目录 指的是容器内部的起点目录
# 第一个参数表示源路径 第二个参数表示目标路径
CMD node /index.js
# 指定当容器启动时 要运行的命令
# 第一个参数表示可执行程序的名字 第二个参数表示可执行程序接收到的参数
# 也就是 当用户运行这个镜像时 用Node.Js执行/index.js
# 这个CMD不是我常用的那个命令行界面的简称 而是command
# 它在Docker 语境下 是一条专有指令 是写在镜像里的默认启动命令


#这个Dockerfile创建了一个可以自动运行JS程序的Node.Js容器环境
#把基础系统（Alpine+Node.Js) 需要运行的代码（index.js) 启动方式（用Node运行）都打包成了一个镜像
#我用docker build一次打包好 别人只需要使用docker run就可以运行了 什么都不用装


# 到这里 Dockerfile就编写完成了
# 然后接下来的命令就需要在终端里实现了
# 先进入HelloDocker文件夹（在vscode里直接就在了）
# 输入 docker build -t hello-docker .
# 每一部分的解释如下：
# docker: 调用Docker命令行工具 跟git是一样的
# build: 表示执行“构建”镜像的操作
# -t: --tag 的缩写 用来给镜像命名 
# 最后面的点 表示当前路径 
# 连起来就是 使用当前文件夹下的Dockerfile 创建一个名为hello-docker的新镜像

# 镜像文件在哪里

# 在一些回显之后 镜像构建完成 可以使用
# docker image ls
# 来查看所有的镜像
# 如果成功 就说明镜像构建成功了

# 接下来就进入运行阶段
# 使用命令
# docker run hello-docker
# 回车后就会看见控制台中输出了