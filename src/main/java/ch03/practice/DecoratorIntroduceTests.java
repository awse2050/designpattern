package ch03.practice;

public class DecoratorIntroduceTests {

    public static void main(String[] args) {

        // AppleIntroduce객체
        Introduce introduce = new AppleIntroduce();

        /**
         *  RedDecorator 객체로 할당, selfIntroduce의 재작성으로 인해
         *  멘트가 추가된다.
         */
        introduce = new RedDecorator(introduce);

        /**
         *  CircleDecorator 객체로 할당, selfIntroduce의 재작성으로 인해
         *  멘트가 추가된다.
         */
        introduce = new CircleDecorator(introduce);

        introduce.sefIntroduce();

    }
}
