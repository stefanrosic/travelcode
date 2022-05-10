package com.core.travelcode.entity;

import com.core.travelcode.enums.TransportationType;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;
import java.util.UUID;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Trip {

    @NotNull
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID id;

    @NotNull
    private Destination destination;

    private TransportationType transportationType;

    @NotNull
    private Instant start;

    @NotNull
    private Instant end;

    private String notes;
}
