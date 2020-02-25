package org.fasttrackit.automotiverentalonline.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Booking {
    @Id
    @GeneratedValue
    private long bookingId;
    @NotNull
    private String bookingTitle;
    @NotNull
    private String bookingType;
    @NotNull
    private String bookingTicket;

    private String bookingDescription;

    private Date bookingDate;



}
