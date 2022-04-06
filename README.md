# SpringAOP_BeforeAdvice

Aspect Oriented Programming (AOP) compliments OOPs in the sense that it also provides modularity. But the key unit of modularity is aspect than class.

AOP breaks the program logic into distinct parts (called concerns). It is used to increase modularity by cross-cutting concerns.

Before Advice: it executes before a join point.
 We use Interface In Spring for Before Advice
 ### MethodBeforeAdvice  interface extends the BeforeAdvice interface.
 ```
 public class RunBeforeExcution  implements MethodBeforeAdvice {
    @Override
    public void before(Method methodOrg, Object[] args, Object target) throws Throwable {
        System.out.println("Inside RunBeforeExecution.before() method...");
        System.out.println("Running before advice...");
    }
 ```
 
 ### OUTPUT:
 ```
 Inside RunBeforeExecution.before() method...
Running before advice...
Running business logic...

Process finished with exit code 0
```
 
