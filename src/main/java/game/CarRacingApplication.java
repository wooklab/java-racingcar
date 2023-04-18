package game;

import game.domain.CarNames;
import game.domain.Cars;
import game.domain.GameRound;
import game.view.InputView;
import game.view.ResultView;

/**
 * 기능 요구사항
 * <pre>
 *     초간단 자동차 경주 게임을 구현한다.
 *     주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
 *     사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
 *     전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
 *     자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.
 * </pre>
 */
public class CarRacingApplication {

    public static void main(String[] args) {
        CarNames carNames = CarNames.of(InputView.showCarNamesConsole());
        GameRound gameRound = new GameRound(InputView.showGameCountConsole());

        Cars cars = Cars.of(carNames.getNames());

        ResultView.displayExecuteResultMessage();
        while (!gameRound.isDone()) {
            cars.drive();
            ResultView.displayCarPositions(cars);
            gameRound.nextRound();
        }
        ResultView.displayCarWinners(cars.findWinners());
    }
}