### 어댑터 패턴

- 특정 클래스 인터페이스를 클라이언트에서 요구하는 다른 인터페이스로 변환한다.
- 인터페이스가 호환되지 않아 같이 쓸수 없었던 클래스를 사용할 수 있게 도와준다.
- 클라이언트와 구현된 인터페이스를 분리할 수 있고, 변경 내역이 `어댑터` 에 캡슐화되기 때문에
나중에 인터페이스가 바뀌더라도 클라이언트를 바꿀 필요가 없다.
- 




#### 예시

```java
public interface Duck {
    public void quack();
    public void fly();
}

public class MallardDuck implements Duck {
    public void quack() {
        ....
    }
    
    public void fly() {
        ....
    }
}

// 새로 등장한 가금류
public interface Turkey {
    public void gobble();
    public void fly();
}

public class WildTukey implements Turkey {
    public void gobble() {
        ...
    }
    
    public void fly() {
        ...
    }
}
```

`Duck` 객체가 모자라서 `Turkey` 객체를 대신 사용해야하는 상황이라면

`어댑터` 를 만들어서 사용한다.

```java
/**
 * 적응시킬 형식의 인터페이스를 구현한다.
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    /**
     * 기존 형식의 객체의 참조가 필요하다.
     * @param turkey
     */
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    /**
     * 인터페이스의 메서드를 모두 구현해야하며
     * Turkey의 메서드를 가져다 쓰게한다.
     */
    public void quack() {
        turkey.gobble();
    }
    
    public void fly() {
        for(int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
```

#### 클라이언트에서 어댑터를 사용하는 방법

1. 클라이언트에서 타깃 인터페이스로 메서드를 호출해서 `어댑터`에 요청을 보낸다.
2. `어댑터`는 `어댑터 인터페이스` 로 그 요청을 `어댑터`에 관한 메서드 호출로 변환한다.
3. 클라이언트는 호출 결과를 받긴하지만 중간에 `어댑터`가 있다는 사실을 모른다.

---

#### 반대로 Turkey 객체를 쓰기 위해서 Duck을 변환해서 사용해야 하는 상황이다.
```java
public class DuckAdapter implements Turkey {
    Duck duck;
    
    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }
    
    public void gobble() {
        duck.quack();
    }
    
    public void fly() {
        for (int i =0; i < 50; i++){
            duck.fly();
        }
    }
    
    
}

```