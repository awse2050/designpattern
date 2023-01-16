package ch03.practice;

public class CircleDecorator extends  IntroduceDecorator{

    public static final String CIRCLE = "저는 동그랗습니다.";

    public CircleDecorator(Introduce introduce) {
        super(introduce);
    }

    @Override
    public void sefIntroduce() {
        super.sefIntroduce();
        System.out.println(CIRCLE);
    }
}
