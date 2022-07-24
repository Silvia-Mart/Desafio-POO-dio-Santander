import java.util.*;

public class Dev {

    private String name;
    private Set<Content> enrolledContents = new LinkedHashSet();
    private Set<Content> completedContents = new LinkedHashSet();


    public void registerBootcamp(Bootcamp bootcamp){
        this.enrolledContents.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevs().add(this);
    }

    public void printDev(){
        System.out.println();
        System.out.println("Dev..................: " + getName());
        System.out.println("Conteúdos inscritos..: " + getEnrolledContents());
        toProgress();
        System.out.println("Conteúdos concluidos.: " + getCompletedContents());
        System.out.println("XP Total.............: " + calculateTotalXP());

    }

    public void toProgress(){
        Optional<Content> content = this.enrolledContents.stream().findFirst();
        if (content.isPresent()){
            this.completedContents.add(content.get());
            this.enrolledContents.remove(content.get());
        }else {
            System.out.println("Você não está inscrito em nenhum conteúdo!");
        }
    }

    public double calculateTotalXP(){
        Iterator<Content> iterator = this.completedContents.iterator();
        double sum = 0;
        while(iterator.hasNext()){
            double next = iterator.next().calculateXP();
            sum += next;
        }
        return sum;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getEnrolledContents() {
        return enrolledContents;
    }

    public void setEnrolledContents(Set<Content> enrolledContents) {
        this.enrolledContents = enrolledContents;
    }

    public Set<Content> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Content> completedContents) {
        this.completedContents = completedContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(enrolledContents, dev.enrolledContents) && Objects.equals(completedContents, dev.completedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, enrolledContents, completedContents);
    }
}
