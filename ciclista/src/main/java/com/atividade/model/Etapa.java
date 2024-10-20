package com.atividade.model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Etapa {
    private int numero;
    private LocalDate data;
    private Duration duracao;
    private LocalTime horaInicio;

    public Etapa(int numero, LocalDate data, Duration duracao, LocalTime horaInicio) {
        this.numero = numero;
        this.data = data;
        this.duracao = duracao;
        this.horaInicio = horaInicio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public void setDuracao(Duration duracao) {
        this.duracao = duracao;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }
}

