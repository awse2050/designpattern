package ch03.practice;

public abstract class IntroduceDecorator extends Introduce {

    private Introduce introduce;

    public IntroduceDecorator(Introduce introduce) {
        this.introduce = introduce;
    }

    @Override
    public void sefIntroduce() {
        this.introduce.sefIntroduce();
    }
}
