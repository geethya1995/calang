# calang
calang is a Simple Programming language which is compiled into Java.

## Syntax

#### calang
```
int a = 5;
int b = 10;
int total = a + b;
show(total);
```
#### java
```java
public class Main{
	public static void main(String... args){
		int a = 5;
		int b = 10;
		int total = a + b;
		System.out.println(total);
	}
}
```

### About
I have antlr4 parser generator to create the parser. 
Currently, code is get compiled into Java in parse tree tier.
I hope to develop the AST, which allows some semantic analysis as well.
Currently, there is mock model for AST, but not fully implemented yet.

Here, I have used the visitor to traverse the parse-tree.

### Project Structure

#### src
src folder contains all dev packages.
* antlr
* app
* ast
    * gen
    
##### antlr
Antlr generated parser, lexer, visitor and listener.

##### app
Entry point of the compiler

##### ast
Mock model of the AST

##### gen
<b>Antlr2Java.java</b> file contains the implementation for 
compiling calang into Java in parse tree tier.