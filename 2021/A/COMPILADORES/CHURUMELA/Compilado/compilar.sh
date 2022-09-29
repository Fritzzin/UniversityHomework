#!/bin/dash

java -jar antlr-4.5.3.jar Churumela.g
javac -cp antlr-4.5.3.jar Churumela*.java
java -cp antlr-4.5.3.jar:. ChurumelaParser < Exercicio.churumela > Exercicio.j
java -jar jasmin-2.4.jar Exercicio.j
java Churumela