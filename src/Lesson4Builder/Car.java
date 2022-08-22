package Lesson4Builder;

public class Car {
    private String mark;
    private int year;

    public String getMark() {
        return mark;
    }

    public int getYear() {
        return year;
    }

    private Car(Builder builder) {
        this.mark = builder.mark;
        this.year = builder.year;
    }

    public static class Builder {
        private String mark;
        private int year;

        public Builder() {
        }

        public Builder setMark(String mark) {
            this.mark = mark;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }
        public Car build() {
            return new Car(this);
        }
    }
}
