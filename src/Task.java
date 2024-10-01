public class Task {
    String title;
    String opis;
    int ID;
    String progress
            ;

    public Task(String title, String opis, int ID, String progress) {
        this.title = title;
        this.opis = opis;
        this.ID = ID;
        this.progress = progress;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProgress() {
        return progress
                ;
    }

    public void setProgress(String progress) {
        this.progress
                = progress;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", opis='" + opis + '\'' +
                ", ID=" + ID +
                ", progress='" + progress
                + '\'' +
                '}';
    }
}
