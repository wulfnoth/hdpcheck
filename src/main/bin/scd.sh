#!/bin/bash

cd /home/cloud/IdeaProjects/hadoop-main/hadoop-dist/target/hadoop-2.8.2
./sbin/stop-dfs.sh
cd /home/cloud/IdeaProjects/hadoop-main
mvn clean
mvn install -Pdist,native -DskipTests=true
cd /home/cloud/IdeaProjects/hadoop-main/hadoop-dist/target/hadoop-2.8.2
cp /home/cloud/hadoop-etc/* ./etc/hadoop
./bin/hdfs namenode -format
./sbin/start-dfs.sh
