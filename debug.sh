#!/bin/sh -x
dir=$(cd `dirname $0`;pwd)
echo $dir
java -agentlib:jdwp=transport=dt_socket,address=31111,server=y,suspend=n \
-javaagent:$dir/jvm-eye-agent/target/jvm-eye-agent-shade.jar=DemoApplication,127.0.0.1,5555 \
-jar $dir/jvm-eye-demo/jvm-eye-demo-spring-boot/target/jvm-eye-demo-spring-boot-1.0-SNAPSHOT.jar
