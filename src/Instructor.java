public class Instructor extends User {
    private String editor;
    private String instructerLesson;
    private int password;

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getInstructerLesson() {
        return instructerLesson;
    }

    public void setInstructerLesson(String instructerLesson) {
        this.instructerLesson = instructerLesson;
    }


    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
