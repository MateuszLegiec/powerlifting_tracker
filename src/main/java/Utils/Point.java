package Utils;

import lombok.Getter;

import java.time.LocalDate;


@Getter
class Point {

    private String x;
    private Double y;

    Point(LocalDate x, String y) {
        this.x = x.toString();
        this.y = Double.parseDouble(y);
    }

    Point(LocalDate x, Double y){
        this.x = x.toString();
        this.y = y;
    }
}
