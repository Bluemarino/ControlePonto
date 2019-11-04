package com.company;

import java.time.LocalDateTime;

public class GerenciarControlePonto {

    public static void main(String[] args) {

        GerenciarControlePonto gerencia = new GerenciarControlePonto();
        int idRegistro = 0;

        Gerente gerente = new Gerente();
        gerente.setIdFunc(1);
        gerente.setNome("João");
        gerente.setEmail("joao@fatec.sp.gov.br");
        gerente.setDocumento("32154847-88");
        gerente.setLogin("jose.abreu");
        gerente.setSenha("123456");

        Secretaria secretaria = new Secretaria();
        secretaria.setIdFunc(2);
        secretaria.setNome("Maria");
        secretaria.setEmail("maria@fatec.sp.gov.br");
        secretaria.setDocumento("32157896-75");
        secretaria.setTelefone("35-6354-5265");
        secretaria.setRamal("15");

        Operador operador = new Operador();
        operador.setIdFunc(3);
        operador.setNome("Zé");
        operador.setEmail("ze@fatec.sp.gov.br");
        operador.setDocumento("12589676-58");
        operador.setValorHora(23.0f);

        RegistroPonto reg1 = new RegistroPonto(gerente);
        reg1.setIdRegPonto(idRegistro++);
        reg1.apresentaRegistroPonto();
        gerencia.sleeping();

        RegistroPonto reg2 = new RegistroPonto(secretaria);
        reg2.setIdRegPonto(idRegistro++);
        reg2.apresentaRegistroPonto();
        gerencia.sleeping();

        RegistroPonto reg3 = new RegistroPonto(operador);
        reg3.setIdRegPonto(idRegistro++);
        reg3.apresentaRegistroPonto();
        gerencia.sleeping();

        reg1.setHoraSaida(LocalDateTime.now());
        gerencia.sleeping();
        reg1.apresentaRegistroPonto();

        reg2.setHoraSaida(LocalDateTime.now());
        gerencia.sleeping();
        reg2.apresentaRegistroPonto();

        reg3.setHoraSaida(LocalDateTime.now());
        gerencia.sleeping();
        reg3.apresentaRegistroPonto();
    }

    public void sleeping() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }
}