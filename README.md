http://kafka.apache.org/quickstart

bin/kafka-topics.sh --create \
            --zookeeper localhost:2181 \
            --replication-factor 1 \
            --partitions 1 \
            --topic streams-file-input
            
bin/kafka-console-producer.sh --broker-list localhost:9092 --topic streams-file-input
            
            
bin/kafka-run-class.sh org.apache.kafka.streams.examples.wordcount.WordCountDemo
            
            
bin/kafka-console-consumer.sh  \
    --bootstrap-server localhost:9092  \
    --topic streams-wordcount-processor-output \
    --from-beginning \
    --property print.key=true        
        
        
＃ 删除 7 天之前的数据        
find /var/log/services -type file -atime +7 -name "*.log*" -exec rm {} \;        