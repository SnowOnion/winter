echo "Please: Ctrl+c and wait for seconds, to terminate tomcat."
echo "Otherwise, you have to run taskmgr (ctrl+alt+del) to kill 'java' process, in order to terminate tomcat."
mvn spring-boot:run | findstr -V "[main] DEBUG"