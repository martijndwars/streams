Streams on JVM:

```
java -jar build/libs/streams.jar 1_000_000 200
1127 ms
```

Build a NI:

```
native-image -jar build/libs/streams.jar streams
```

Streams on SVM:

```
./streams 1000000 200
2344 ms
```

Build a NI-prof:

```
native-image -jar build/libs/streams.jar --pgo-instrument streams-prof
```

Run NI-prof:

```
./streams-prof 1000 200
```

Build a NI-opt:

```
native-image -jar build/libs/streams.jar --pgo streams-opt
```

Run NI-opt:

```
./streams-opt 1000000 200
289 ms
```
