package src.LLd.Easy.builder;

import java.time.LocalDateTime;

public class Animal {
    private String name;
    private String color;
    private String legsNo;
    private float weight;
    private LocalDateTime birthDate;
    private String subtype;

    public Animal(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.legsNo = builder.legsNo;
        this.weight = builder.weight;
        this.birthDate = builder.birthDate;
        this.subtype = builder.subtype;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLegsNo() {
        return legsNo;
    }

    public static class Builder {
        private String name;
        private String color;
        private String legsNo;
        private float weight;
        private LocalDateTime birthDate;
        private String subtype;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setLegsNo(String legsNo) {
            this.legsNo = legsNo;
            return this;
        }

        public Builder setWeight(float weight) {
            this.weight = weight;
            return this;
        }

        public Builder setBirthDate(LocalDateTime birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder setSubtype(String subtype) {
            this.subtype = subtype;
            return this;
        }

        public  Animal build() {
            return new Animal(this);
        }
    }
}
class NewOne{
    public static void main(String[] args) {
        Animal animal= new Animal.Builder()
                .setName("Ismail")
                .setColor("red")
                .setWeight(23.33f)
                .setLegsNo("34")
                .build();
        System.out.println(animal.getColor());
    }
}