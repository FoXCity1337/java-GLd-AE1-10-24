package lessons.september19.user;

public class SuperUser {
    private String name;

    public String getName() {
        return name;
    }                                               //API данного класса все публичные методы класса

    public void setName(String name) {
        if(name==null){
            this.name = "default";
        }
        this.name = name;
    }
}
