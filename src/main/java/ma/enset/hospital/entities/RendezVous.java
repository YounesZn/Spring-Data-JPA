package ma.enset.hospital.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data @NoArgsConstructor  @AllArgsConstructor

public class RendezVous  {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;

    private StatusRDV status;
    @ManyToOne @JoinColumn(name="patient_id", referencedColumnName="id")
    private Patient patient;
    @ManyToOne  @JoinColumn(name="medecin_id", referencedColumnName="id")
    private Medecin medecin;
    @OneToOne
    private Consultation consultation;

}
