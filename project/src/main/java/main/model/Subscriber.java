package main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "subscription")
@Log4j2
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subscriber
{
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "msisdn", nullable = false, columnDefinition = "LONG")
    private long msisdn;

    @Enumerated(EnumType.STRING)
    @Column(name = "action", nullable = false, columnDefinition = "ENUM")
    private Action action;

    @Column(name = "timestamp", nullable = false, columnDefinition = "TIMESTAMP")
    private Timestamp timestamp;
}