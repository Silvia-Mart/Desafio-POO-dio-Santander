public class Course extends Content {
    private int workload;

    public Course() {
    }

    public void printCourse(){

        System.out.println("Curso..............: " + getTitle());
        System.out.println("Descrição do curso.: " + getDescription());
        System.out.println("Carga horária......: " + getWorkload());
        System.out.println();
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", Description='" + getDescription() + '\'' +
                ", workload=" + workload +
                '}';
    }
}
