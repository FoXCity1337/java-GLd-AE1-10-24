package lessons.october3;

public class MainD {
    public static void main(String[] args) {
        WebForm webForm = new WebForm();
        webForm.fill("adminN&12345qwerty");
        System.out.println(webForm);
        webForm.click();
    }
}
