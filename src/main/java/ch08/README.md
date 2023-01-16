### 템플렛 메서드 패턴

알고리즘의 골격을 정의합니다.

템플릿 메서드를 사용하면 알고리즘의 일부 구현단계를 서브클래스에서 구현할 수 있고,

알고리즘의 구조는 그대로 유지하면서 특정단계를 서브클래스에서 재정의 할 수도 있다.


#### 예시 

```java
    /** 커피를 만드는 방법 */
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarandMilk();
    }

    /** 홍차를 만드는 방법 */
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

```

커피와 홍차를 만드는 일은 거의 유사하다. 

메서드의 이름을 동일하게 변경해서 만들어보도록 한다.

```java
    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
```

#### 템플릿 메서드 패턴으로 변경 예시

```java
/** 추상화 클래스를 만든다. */
public abstract class CaffeineBeverage {

    /** 해당 메서드는 아무나 오버라이딩 하지 못하도록 final을 붙인다. */
    /** 해당 메서드는 템플릿 역할을 한다. 특정한 음료를 만드는 알고리즘의 템플릿. */
    final void prepareRecipe() {
        /**
         * 각 단계별로 알고리즘이 표현되어 있고
         * 그 중에서 서브 클래스에서 구현된 알고리즘이 포함되어 있다.
         */
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /** 커피와 홍차가 서로 다른 구현방식을 가지고 있기 떄문에
     * 두 메서드는 다르게 설정해야 하므로 추상메서드로 선언한다.
     */
    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끓이는 중");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}
```

#### 커피 클래스
```java
package ch08;


public class Coffee extends CaffeineBeverage {
    // TO-BE
    /**  각 클래스에서 구현될 알고리즘을 정의하면 된다. */
    @Override
    void brew() {
        System.out.println("필터로 커피 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕과 우유 첨가하는 중");
    }
}
```

#### 홍차 클래스

```java

/** 홍차를 우려내는 클래스 */
public class Tea extends CaffeineBeverage {

    /** 각 구현알고리즘을 해당 클래스에서 구현한다. */
    @Override
    void brew() {
        System.out.println("찻잎을 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }
}
```