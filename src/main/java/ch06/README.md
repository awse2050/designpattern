### 커맨드 패턴

#### 정의

요청 내역을 객체로 캡슐화해서 객체를 서로 다른 요청 내역에 따라 매개변수화 시킬 수 있다.

이러면 요청을 `Queue` 에 저장하거나 `Log` 로 기록하거나 작업 취소 기능을 사용할 수 있다.

---


1. 클라이언트가 `커맨드 객체`를 생성한다
    - `커맨드 객체` 에는 행동과 `리시버`의 정보가 들어있다.
2. `커맨드 객체`에서 제공하는 메서드는 `execute()` 하나 뿐이다. 이 메서드를 행동을 캡슐화하고
리시버에 있는 특정 행동을 처리한다.
3. 클라이언트는 `인보커 객체`의 `setCommand()`를 호출하는데, 이때 `커맨드 객체`를 넘겨준다. 
이 객체는 쓰이기 전까지 `인보커 객체`에 보관된다.
4. `인보커`에서 `커맨드 객체`의 `execute()`를 호출하면 리시버에 있는 행동 메서드가 호출된다.


#### 1. 커맨드 인터페이스 구현

`커맨드 객체`는 모두 같은 인터페이스를 구현해야 한다.

그 인터페이스에는 하나의 메서드밖에 없고 대체로 `execute()` 라는 이름을 더 많이 쓴다.

```java
interface Command {
    void execute();
}
```

#### 2. 조명을 켤 떄 필요한 커맨드 클래스 구현

```java
public class LightOnCommand implements Command {
    Light light;
    
    public LightOnCommand(Light light) {
        this.light = light;
    }
    
    // 해당 메서드가 호출되면 light 객체가 리시버가 된다.
    public void execute() {
        light.on();
    }
} 
```

#### 3. 사용예시

```java
public class SimpleRemoteControl {
    // 커맨드를 저장할 슬롯이 1개이다.
    // 이 슬롯으로 1개의 기기를 제어한다.
    Command slot;
    public SimpleRemoteControl() {
        
    }
    // 해당 메서드로 슬롯의 커맨드를 아무거나 바꿔넣을 수 있다.
    public void setCommand(Command command) {
        slot = command;
    }
    
    public void buttonWasPressed() {
        slot.execute();
    } 
}
```

#### 4. Test

```java
public class RemoteTest {
    SimpleRemoteControl remote = new SimpleRemoteControl();
    
    Light light = new Light();
    LightOnCommand lightOn = new LightOnCommand(light);
    
    remote.setCommand(lightOn);
    remote.buttonWasPressed();
}

```


#### 5. 활용예시

`커맨드`로 일급 객체 형태로 전달할 수 있고 다른 스레드에서 호출할 수도 있다.

이 점을 활용해서 `커맨더 패턴`을 스케줄러나 스레드 풀, 작업 큐와 같은 다양한 작업에 적용할 수 있다.

