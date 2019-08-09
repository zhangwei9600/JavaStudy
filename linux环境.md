linux  root 密码123456

jps -l 查看java进程

mysql root 密码123456
启动： service mysql start
关闭： service mysql stop
重启： service mysql restart
登录： msyql –u root -p
访问地址192.168.43.10:2181:3306

redis单机
目录/usr/local/redis
前端启动redis: ./redis-server
后端启动redis: ./redis-server redis.conf
关闭redis: ./redis-cli shutdown
本机连接redis: ./redis-cli
远程连接redis: ./redis-cli -h 192.168.43.10 -p 6379

redis伪分布式集群
目录 /usr/local/redis-cluster
创建集群脚本: ./redis-trib.rb create --replicas 1 192.168.43.10:7001 192.168.43.10:7002 192.168.43.10:7003 192.168.43.10:7004 192.168.43.10:7005  192.168.43.10:7006
启动集群脚本: start-all.sh
关闭集群脚本: shutdown-all.sh
连接redis集群: redis01/redis-cli -p 7001 -c ./

elasticsearch
目录/home/es/elasticsearch-2.4.0
启动es: bin/elasticsearch
访问地址http://192.168.43.10:2181:9200/?pretty,http://192.168.43.32:2181:9200/?pretty,http://192.168.43.203:2181:9200/?pretty

zookeeper
目录/root
启动zookeeper：bin/zkServer.sh start
关闭zookeeper：bin/zkServer.sh stop
查看zookeeper状态：bin/zkServer.sh status
访问地址192.168.43.10:2181,192.168.43.32:2181,192.168.43.203:2181

kafka
目录/root
启动kafka:bin/kafka-server-start.sh config/server.properties
关闭Kafka:bin/kafka-server-stop.sh
创建topics:bin/kafka-topics.sh --create --zookeeper 192.168.43.10:2181 --partitions 2 --replication-factor 2 --topic test
查看topics:bin/kafka-topics.sh --list --zookeeper 192.168.43.10:2181
发送消息:bin/kafka-console-producer.sh --broker-list 192.168.43.10:9092 --topic test
消费消息:bin/kafka-console-consumer.sh --zookeeper 192.168.43.10:2181 --from-beginning --topic test
创建的/logs目录存储日志及实际的数据
访问地址192.168.43.10:9092,192.168.43.32:9092,192.168.43.203:9092
