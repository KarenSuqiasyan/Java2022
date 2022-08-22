package Lesson3BankApplication;

import Lesson4Builder.Car;

import java.util.Objects;

public class Passport {

    private Passport() {

    }

    private String id;
    private String name;
    private String surName;
    private String middleName;

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    private int birthDate;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getBirthDate() {
        return birthDate;
    }


    public static class Builder {
        private Passport passport;

        public Builder() {
            passport = new Passport();
        }

        public Builder setId(String id) {
            passport.id = id;
            return this;
        }

        public Builder setName(String name) {
            passport.name = name;
            return this;

        }

        public Builder setSurName(String surName) {
            passport.surName = surName;
            return this;

        }

        public Builder setMiddleName(String middleName) {
            passport.middleName = middleName;
            return this;

        }

        public Builder setBirthDate(int birthDate) {
            passport.birthDate = birthDate;
            return this;

        }

        public Passport build() {
            return passport;
        }
    }
}

