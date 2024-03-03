package org.theatremanagement.show.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="SHOWS")
public class Show {

    @Id
    @GeneratedValue
    private long id;
    private Date startTime;
    private Date endTime;
    private long Duration;
    private long movie;
    private int totalSeats;
    private int bookedSeats;
}
