package com.hedima.presentacion;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.LocalTime;

public class ProbarJavaTime {
    public static void main(String[] args) {
        //Primera forma de armar fechas
        LocalDate date = LocalDate.of(1992,8,30);
        System.out.println("fecha -> " + date);
        //Segunda forma de armar fechas
        LocalDate date2 = LocalDate.of(1992, Month.AUGUST, 30);
        System.out.println("fecha -> " + date2);
        //Tercera forma de armar fechas
        LocalDate date3 = LocalDate.parse("1992-08-30");
        System.out.println("fecha -> " + date3);

        System.out.println(date.plusDays(2));
        System.out.println(date.plusMonths(1));
        System.out.println(date.plusYears(1));

        System.out.println(date.minusDays(2));
        System.out.println(date.minusMonths(1));
        System.out.println(date.minusYears(1));

        LocalDate date4 = LocalDate.of(2007,Month.JULY,7);
        System.out.println(date2.isBefore(date4));
        System.out.println(date2.isAfter(date4));

        System.out.println(LocalDate.now());

        System.out.println(Period.between(date2, date4).getYears());
        System.out.println("años: " + Period.between(LocalDate.now(), date4).getYears());


        LocalTime horaInicio = LocalTime.of(12,0);
        System.out.println("horaInicio -> " + horaInicio);
        LocalTime horaFin =LocalTime.parse("12:00:00.0");
        System.out.println(horaFin);

        System.out.println(horaInicio.plusHours(1));
        System.out.println(horaInicio.minusMinutes(1));
        System.out.println(horaInicio.isBefore(horaFin));

        //Definir una fecha de fabricación y una fecha de expiración
        //Calcular los días, meses, años para que caduque

        LocalDate dateFb = LocalDate.of(2016, Month.JULY, 12);
        LocalDate dateEx = LocalDate.of(2025, 5, 30);
        System.out.println(Period.between(LocalDate.now(), dateEx).getYears());
        System.out.println(Period.between(LocalDate.now(), dateEx).getMonths());
        System.out.println(Period.between(LocalDate.now(), dateEx).getDays());

        LocalDate fechaFabricacion=LocalDate.of(2015,01,01);
        LocalDate fechaExpiracion=LocalDate.of(2023,1,31);
        System.out.println(Period.between(fechaFabricacion,fechaExpiracion).getDays());
        System.out.println(Period.between(fechaFabricacion,fechaExpiracion).getMonths());
        System.out.println(Period.between(fechaFabricacion,fechaExpiracion).getYears());
    }
}
