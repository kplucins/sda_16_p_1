package pl.old;

public class Pies implements Zwierze {

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String getType() {
        return "pl.old.Pies";
    }

    public String kolorSiersci() {

        return "";
    }
}
