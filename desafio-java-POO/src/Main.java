import java.time.LocalDate;

import dio.dominio.Bootcamp;
import dio.dominio.Curso;
import dio.dominio.Dev;
import dio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo(" Orange Tech+ Back End");
        curso1.setDescricao(" Curso de Back End usando a linguagem Java. ");
        curso1.setCargaHoraria(87);

        Curso curso2 = new Curso();
        curso2.setTitulo(" Orange Tech+ Front End");
        curso2.setDescricao(" Curso de Front End usando a linguagem JS. ");
        curso2.setCargaHoraria(60);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo(" Plantão de Dúvidas ");
        mentoria.setDescricao(" Continue Evoluindo na sua Jornada. ");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome(" Bootcamp Developer");
        bootcamp.setDescricao(" Descrição Bootcamp Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoao = new Dev();
        devJoao.setNome("João Pedro");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João Pedro." + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João Pedro." + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João Pedro." + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularXp());

        System.out.println("---------");

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gustavo." + devGustavo.getConteudosInscritos());
        devGustavo.progredir();
        devGustavo.progredir();
        devGustavo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Gustavo." + devGustavo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Gustavo." + devGustavo.getConteudosConcluidos());
        System.out.println("XP: " + devGustavo.calcularXp());
    }
}
