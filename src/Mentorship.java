import java.time.LocalDate;

public class Mentorship extends Content {
    private final LocalDate date = LocalDate.now();

    public Mentorship() {
    }

    public void printMentorship(){

        System.out.println("Mentoria..............: " + getTitle());
        System.out.println("Descrição da Mentoria.: " + getDescription());
        System.out.println("Data da mentoria......: " + getDate());
        System.out.println();

    }

    public LocalDate getDate() {
        return date;
    }


    @Override
    public String toString() {
        return "Mentorship{" +
                "title='" + getTitle() + '\'' +
                ", Description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}
