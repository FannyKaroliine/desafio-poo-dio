import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição de mentoria java");
        mentoria.setData(LocalDate.now());

        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devStephanie = new Dev();
        devStephanie.setNome("Stephanie");
        devStephanie.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devStephanie.getNome() + ": " + devStephanie.getConteudosInscritos());
        devStephanie.progredir();
        devStephanie.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devStephanie.getNome() + ": " + devStephanie.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devStephanie.getNome() + ": " + devStephanie.getConteudosConcluidos());
        System.out.println("XP: " + devStephanie.calcularTotalXP());

        System.out.println("--------");

        Dev devSahur = new Dev();
        devSahur.setNome("Sahur");
        devSahur.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devSahur.getNome() + ": " + devSahur.getConteudosInscritos());
        devSahur.progredir();
        devSahur.progredir();
        devSahur.progredir();
        System.out.println("Conteúdos Inscritos " + devSahur.getNome() + ": " + devSahur.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devSahur.getNome() + ": " + devSahur.getConteudosConcluidos());
        System.out.println("XP: " + devSahur.calcularTotalXP());



    }
}
