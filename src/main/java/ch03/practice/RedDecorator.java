package ch03.practice;

public class RedDecorator extends IntroduceDecorator {

    private static final String INTRODUCE = "저는 빨갛습니다.";

    public RedDecorator(Introduce introduce) {
        super(introduce);
    }

    @Override
    public void sefIntroduce() {
        super.sefIntroduce();
        System.out.println(INTRODUCE);
    }
}
