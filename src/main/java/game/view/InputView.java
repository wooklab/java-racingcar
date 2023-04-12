package game.view;

import java.util.List;
import java.util.Scanner;

public final class InputView {

    private static final Scanner SC = new Scanner(System.in);

    private InputView() {
        throw new IllegalCallerException("잘못된 객체생성 입니다.");
    }

    public static List<String> showAndGetCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNamesAsString = SC.nextLine();
        return List.of(carNamesAsString.split(","));
    }

    public static int showAndGetRacingRep() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return SC.nextInt();
    }
}