package com.core.travelcode.entity;

import com.core.travelcode.enums.Continent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.UUID;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Destination {

    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID id;

    private String name;

    private Continent continent;
}
