echo "Please: Ctrl+c for many times and wait for seconds, to terminate tomcat."
echo "Otherwise, you have to run taskmgr (ctrl+alt+del) to kill 'java' process, in order to terminate tomcat."
mvn spring-boot:run | findstr -V "[main] DEBUG"