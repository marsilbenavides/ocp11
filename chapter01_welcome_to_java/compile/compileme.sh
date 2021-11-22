echo "Compiling with command,"
echo "    > javac -d target/classes -cp src/main/java/. src/main/java/HelloWorld.java"
echo "    >     -d  -> Output directory"
echo "    >     -cp -> Classpath [--class-path <path>, -classpath <path>, -cp <path>]"
javac -d target/classes -cp src/main/java/. src/main/java/HelloWorld.java
