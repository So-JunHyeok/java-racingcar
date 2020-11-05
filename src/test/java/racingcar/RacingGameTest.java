package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("RacingGame 클래스의 테스트")
class RacingGameTest {

    @ParameterizedTest
    @DisplayName("maxRaceNum 보다 많이 race 하면 gameOver 되어야 한다.")
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9})
    void play(int loop) {
        String nameCsv = "1,2,3";
        int maxRaceNum = 5;
        RacingGame game = new RacingGame(nameCsv, maxRaceNum);

        for (int i = 0; i < loop; i++) {
            game.race();
        }

        boolean expectedGameOver = loop >= maxRaceNum;
        assertThat(game.checkGameOver())
                .isEqualTo(expectedGameOver);
    }
}