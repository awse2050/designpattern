package ch03.practice;

public class AppleIntroduce extends Introduce {

    private static final String NAME = "사과";

    public AppleIntroduce() {
        setName(NAME);
    }

    @Override
    public void sefIntroduce() {
        System.out.printf("저는 %s 입니다. \n", super.getName());
    }
}
