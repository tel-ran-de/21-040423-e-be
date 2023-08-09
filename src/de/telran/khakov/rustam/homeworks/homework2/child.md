```java
class Mother {

}

class Father {

}

class Child extends Mother, Father {

}

```

1) 
```java
interface Mother {

}

interface Father {

}

class Child implements Mother, Father {

}

```

2)
```java
class Mother {

}

interface Father {

}

class Child extends Mother implements Father {

}

```
3) 
```java
class Mother {

}

class Father {

}

class Child extends Mother {
    Father father;
}

```
4) 