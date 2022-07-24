import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Course course01 = new Course();
        course01.setTitle("Básico de Java e Orientação a Objetos");
        course01.setDescription("O objetivo deste curso básico de Java e Orientação a Objetos é apresentar os conceitos básicos da linguagem de programação Java e a orientação a objetos (OO), visando ensinar usuários leigos, com pouca experiência em linguagem de programação a trabalhar com a plataforma Java. O foco do curso é apresentar conceitos, aplicando sempre que possível a problemas práticos, apresentando muitos conceitos e exemplos práticos. Ao final do curso, o usuário estará capacitado a utilizar a sintaxe da linguagem Java, desenvolver classes, aplicar os conceitos de herança, polimorfismo, classes abstratas e interfaces no desenvolvimento de projetos OO.");
        course01.setWorkload(33);

        Course course02 = new Course();
        course02.setTitle("Linguagem Java: variáveis e constantes");
        course02.setDescription("Java, assim como qualquer outra linguagem de programação, possui regras para a declaração de variáveis e constantes, as quais o programador precisa conhecer. Tratamos desse assunto em detalhes nesse curso.");
        course02.setWorkload(4);

        Course course03 = new Course();
        course03.setTitle("Linguagem Java: Controle de Fluxo");
        course03.setDescription("Nesse curso damos continuidade ao aprendizado da linguagem Java, falando das estruturas e comandos de controle de fluxo: if, switch, for, while, break, continue e return.");
        course03.setWorkload(7);

       /* course01.printCourse();
        course02.printCourse();
        course03.printCourse();
       */
        //System.out.println("-----------------------------------------------");

        Mentorship mentorship01 = new Mentorship();
        mentorship01.setTitle("Como ter boas práticas no seu código");
        mentorship01.setDescription("Como evitar a deterioração do seu sistema, aumentando sua velocidade de desenvolvimento");

        Mentorship mentorship02 = new Mentorship();
        mentorship02.setTitle("Novidades do Java: produtividade com novos recursos");
        mentorship02.setDescription("Entenda os novos métodos adicionados na API de streams e com isso tenha uma maior produtividade com as novidades do Optional");

        /*mentorship01.printMentorship();
        mentorship02.printMentorship();
         */

        //System.out.println("-----------------------------------------------");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Nesse bootcamp nós combinamos conteúdo teórico com muita prática, para que assim o aluno aprenda não apenas os conceitos da linguagem Java mas, principalmente, a sua execução. Indicado para quem quer iniciar a carreira como back-end developer, esse bootcamp conta com cursos para iniciantes como Lógica de Programação, Git e GitHub e a introdução à tecnologia com o curso Desenvolvimento Básico em Java. Após essa introdução, o aluno já começa a explorar mais sobre a linguagem aprendendo a implementar no código conceitos mais avançados como Collections e Streams e as novidades das últimas atualizações do Java. No decorrer do bootcamp, você aprenderá framewoks, testes e banco de dados - tudo voltado para Java. E ainda poderá testar os seus conhecimentos através dos nossos desafios, praticar o seu código por meio dos projetos práticos e subir o que você desenvolveu no GitHub para enriquecer ainda mais o seu portfólio!");
        bootcamp.getContents().add(course01);
        bootcamp.getContents().add(course02);
        bootcamp.getContents().add(course03);
        bootcamp.getContents().add(mentorship01);
        bootcamp.getContents().add(mentorship02);

        //System.out.println("-----------------------------------------------");

        Dev dev01 = new Dev();
        dev01.setName("Frederico");
        dev01.registerBootcamp(bootcamp);
        dev01.printDev();

        Dev dev02 = new Dev();
        dev02.setName("Silvia");
        dev02.registerBootcamp(bootcamp);
        dev02.toProgress();
        dev02.printDev();

        Dev dev03 = new Dev();
        dev03.setName("Tais");
        dev03.registerBootcamp(bootcamp);
        dev03.printDev();

        Dev dev04 = new Dev();
        dev04.setName("Yara");
        dev04.registerBootcamp(bootcamp);
        dev04.toProgress();
        dev04.toProgress();
        dev04.printDev();

        Dev dev05 = new Dev();
        dev05.setName("Camila");
        dev05.registerBootcamp(bootcamp);
        dev05.printDev();

        Dev dev06 = new Dev();
        dev06.setName("Renan");
        dev06.registerBootcamp(bootcamp);
        dev06.printDev();

        Dev dev07 = new Dev();
        dev07.setName("Joao");
        dev07.registerBootcamp(bootcamp);
        dev07.toProgress();
        dev07.toProgress();
        dev07.toProgress();
        dev07.toProgress();
        dev07.toProgress();
        dev07.toProgress();
        dev07.printDev();

        Dev dev08 = new Dev();
        dev08.setName("Franscisca");
        dev08.registerBootcamp(bootcamp);
        dev08.toProgress();
        dev08.printDev();



    }
}
