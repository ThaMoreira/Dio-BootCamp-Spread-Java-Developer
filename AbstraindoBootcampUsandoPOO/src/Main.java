import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScrypt");
        curso2.setDescricao("Descrição curso JavaScrypt");
        curso2.setCargaHoraria(4);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria 1");
        mentoria1.setDescricao("Aprendendo o básico");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp= new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devThais = new Dev();
        devThais.setNome("Thais");
        devThais.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Thais " + devThais.getConteudosInscritos());
        devThais.progredir();
        devThais.progredir();
        System.out.println("-");
        System.out.println("Conteudos concluidos Thais: " + devThais.getConteudosConcluidos());
        System.out.println("Conteudos inscritos Thais " + devThais.getConteudosInscritos());
        System.out.println("Xp:"+ devThais.calcularTotalXP());

        System.out.println("------------");
        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Gabriel" + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("-");
        System.out.println("Conteudos concluidos Gabriel: " + devGabriel.getConteudosConcluidos());
        System.out.println("Conteudos inscritos Gabriel" + devGabriel.getConteudosInscritos());
        System.out.println("Xp:"+ devGabriel.calcularTotalXP());

    }
}
