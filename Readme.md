javac -d out addit/*.java
jar cf addit.jar -C out addit
javac -cp "addit.jar" -d out HelloWorld.java
jar cvfe HelloWorld.jar HelloWorld -C out .
java -jar HelloWorld.jar