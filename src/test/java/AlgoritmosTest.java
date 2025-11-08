import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class AlgoritmosTest {

    @Test
    void verificaParTest() {
        //GIVEN - DADO --> DADA A ENTRADA
        Algoritmos algoritmos = new Algoritmos();
        int x = 10;

        //WHEN - QUANDO EU EXECUTO O MÉTODO
        boolean ehPar = algoritmos.ehPar(x);

        //THEN - ENTAO VERIFICO ...
        assertTrue(ehPar);
    }

    @Test
    void verificaImparTest() {
        //GIVEN - DADO --> DADA A ENTRADA
        Algoritmos algoritmos = new Algoritmos();
        int x = 5;

        //WHEN - QUANDO EU EXECUTO O MÉTODO
        boolean ehPar = algoritmos.ehPar(x);

        //THEN - ENTAO VERIFICO ...
        assertFalse(ehPar);
    }

//    @Test
//    void verificaEhParNumeroNegativoTest() {
//        //GIVEN - DADO --> DADA A ENTRADA
//        Algoritmos algoritmos = new Algoritmos();
//        int x = -4;
//
//        //WHEN - QUANDO EU EXECUTO O MÉTODO
//        boolean ehPar = algoritmos.ehPar(x);
//
//        //THEN - ENTAO VERIFICO ...
//        ???????????????
//    }

//    @Test
//    void verificaEhParNumeroZeroTest() {
//        //GIVEN - DADO --> DADA A ENTRADA
//        Algoritmos algoritmos = new Algoritmos();
//        int x = 0;
//
//        //WHEN - QUANDO EU EXECUTO O MÉTODO
//        boolean ehPar = algoritmos.ehPar(x);
//
//        //THEN - ENTAO VERIFICO ...
//        ???????????????
//    }

    @Test
    void contarNumeroDeOcorrenciasTest() {
        //GIVEN
        Algoritmos algoritmos = new Algoritmos();
        var lista = List.of(2, 2, 3, 4, 2, 1, 5);
        var numero = 2;
        var expected = 3;

        //WHEN
        var actual = algoritmos.contarNumeroDeOcorrencias(lista, numero);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void contarNumeroDeOcorrenciasRetornaZeroTest() {
        //GIVEN
        Algoritmos algoritmos = new Algoritmos();
        var lista = List.of(2, 2, 3, 4, 2, 1, 5);
        var numero = 10;
        var expected = 0;

        //WHEN
        var actual = algoritmos.contarNumeroDeOcorrencias(lista, numero);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void contarNumeroDeOcorrenciasListaVaziaTest() {
        //GIVEN
        Algoritmos algoritmos = new Algoritmos();
        List<Integer> lista = List.of();
        var numero = 10;
        var expected = 0;

        //WHEN
        var actual = algoritmos.contarNumeroDeOcorrencias(lista, numero);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void assertSameTest() {
        //GIVEN
        Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Jose");
        Aluno aluno3 = new Aluno("Joao");

        //WHEN
        //THEN
        assertEquals(aluno1, aluno3);
        assertSame(aluno1, aluno3);
        //assertNotEquals(aluno1, aluno2);
    }



























}