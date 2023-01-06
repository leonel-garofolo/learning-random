## Important Features
These project use the new features that Java introduce in the outstanding versions.

#### Simple java project
'''
mvn archetype:generate -DgroupId=com.java8.app -DartifactId=java8 -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
''' 

### Java 8
Java 8 introduce the class Optional, Streams, CompletableFuture and Lambda.

### Java 9 
#### [CompletableFuture API](https://www.baeldung.com/java-completablefuture)
Java 9 enhances the CompletableFuture API with the following changes:
- New factory methods added
- Support for delays and timeouts
- Improved support for subclassing

and new instance APIs:
- Executor defaultExecutor()
- CompletableFuture<U> newIncompleteFuture()
- CompletableFuture<T> copy()
- CompletionStage<T> minimalCompletionStage()
- CompletableFuture<T> completeAsync(Supplier<? extends T> supplier, Executor executor)
- CompletableFuture<T> completeAsync(Supplier<? extends T> supplier)
- CompletableFuture<T> orTimeout(long timeout, TimeUnit unit)
- CompletableFuture<T> completeOnTimeout(T value, long timeout, TimeUnit unit)

We also now have a few static utility methods:
- Executor delayedExecutor(long delay, TimeUnit unit, Executor executor)
- Executor delayedExecutor(long delay, TimeUnit unit)
- <U> CompletionStage</U> completedStage(U value)
- <U> CompletionStage</U> failedStage(Throwable ex)
- <U> CompletableFuture</U> failedFuture(Throwable ex)

Finally, to address timeout, Java 9 has introduced two more new functions:
- orTimeout()
- completeOnTimeout()




