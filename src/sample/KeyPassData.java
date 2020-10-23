package sample;

import javafx.beans.property.SimpleStringProperty;

public class KeyPassData {

     private SimpleStringProperty Title,Login,Pass,Pass2,URL,Notice;

    public static KeyPassData getLastGeneratedObject() {
        return lastGeneratedObject;
    }

    public static void setLastGeneratedObject(KeyPassData lastGeneratedObject) {
        KeyPassData.lastGeneratedObject = lastGeneratedObject;
    }

    private static KeyPassData lastGeneratedObject = null;

    public KeyPassData(String Title, String Login, String Pass, String Pass2, String URL, String Notice) {
        this.Title = new SimpleStringProperty(Title);
        this.Login = new SimpleStringProperty(Login);
        this.Pass = new SimpleStringProperty(Pass);
        this.Pass2 = new SimpleStringProperty(Pass2);
        this.URL = new SimpleStringProperty(URL);
        this.Notice = new SimpleStringProperty(Notice);
    }

    public String getPass2() {
        return Pass2.get();
    }

    public SimpleStringProperty pass2Property() {
        return Pass2;
    }

    public void setPass2(String pass2) {
        this.Pass2.set(pass2);
    }

    public String getTitle() {
        return Title.get();
    }

    public SimpleStringProperty titleProperty() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title.set(title);
    }

    public String getLogin() {
        return Login.get();
    }

    public SimpleStringProperty loginProperty() {
        return Login;
    }

    public void setLogin(String login) {
        this.Login.set(login);
    }

    public String getPass() {
        return Pass.get();
    }

    public SimpleStringProperty passProperty() {
        return Pass;
    }

    public void setPass(String pass) {
        this.Pass.set(pass);
    }

    public String getURL() {
        return URL.get();
    }

    public SimpleStringProperty URLProperty() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL.set(URL);
    }

    public String getNotice() {
        return Notice.get();
    }

    public SimpleStringProperty noticeProperty() {
        return Notice;
    }

    public void setNotice(String notice) {
        this.Notice.set(notice);
    }
}
