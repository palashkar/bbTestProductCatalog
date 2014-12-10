cd bbTest
set GRAILS_OPTS=-server -Xmx1024M -Xms512M -XX:PermSize=256m -XX:MaxPermSize=256m -Dfile.encoding=UTF-8
set MAVEN_OPTS=-server -Xmx1024M -Xms512M -XX:PermSize=256m -XX:MaxPermSize=256m -Dfile.encoding=UTF-8

---------------------------- running using batch file ---------------------------------
1. 1st approach to run using bat file
grailsw run-app

# if you want to run a different port use below command
grailsw -Dserver.port=8090 -Denable.jndi=true -Ddisable.auto.recompile=true run-app

# access application using below url
http://localhost:8080/bbTest/data/index


----------------------------- running using maven command ----------------------------------
1. 2nd Approach to run using maven
mvn grails:run-app

if you want to run a different port
mvn -Dserver.port=8090 grails:run-app

# Please wait to download grails
if it error out then try again 
mvn grails:run-app

# access application using below url
http://localhost:8080/bbTest/data/index


 





