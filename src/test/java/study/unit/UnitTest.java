package study.unit;

import nextstep.subway.line.domain.Line;
import nextstep.subway.station.domain.Station;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("단위 테스트")
public class UnitTest {
    @Test
    void update() {
        // given
        String newName = "구분당선";

        Station upStation = Station.of(1L, "강남역");
        Station downStation = Station.of(2L, "광교역");
        Line line = Line.of("신분당선", "RED", upStation, downStation, 10);
        Line newLine = Line.of(newName, "GREEN");

        // when
        line.update(newLine);

        // then
        assertThat(line.getName()).isEqualTo(newName);
    }
}
