package web.models;

public class Car {
    private int id;
    private String model;
    private String nickname;

    public Car(int id, String model, String nickname) {
        this.id = id;
        this.model = model;
        this.nickname = nickname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
