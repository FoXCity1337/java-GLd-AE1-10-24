package lessons.october3;

public class WebForm implements Filling,Clickable{
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void click() {
        System.out.println("Вход начат");
        if (getName().equalsIgnoreCase("Admin")) {
            System.out.println("Добро пожаловать, админ");
        }else {
            System.out.println("Добро пожаловать, пользователь");
        }
    }

    @Override
    public void fill(String string) {
        String [] array = string.split("&");
        setName(array[0]);
        setPassword(array[1]);
    }

    @Override
    public String toString() {
        return "WebForm{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
