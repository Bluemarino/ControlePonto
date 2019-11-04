package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroPonto {
    private long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public RegistroPonto() {

    }

    public RegistroPonto(Funcionario func) {
        this.idRegPonto = getIdRegPonto() + 1;
        this.func = func;
        this.dataRegistro = LocalDate.now();
        this.horaEntrada = LocalDateTime.now();
        //this.horaSaida = horaSaida;
    }


    public long getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public void apresentaRegistroPonto(){
        System.out.println("=============================================");
        System.out.println("Funcionário: " + func.getClass().getSimpleName() + " - " + func.getNome());
        System.out.println("Data de Registro: " + dataRegistro);
        System.out.println("Horário Entrada: " + horaEntrada);
        System.out.println("Horário Saída: " + horaSaida);
    }
}