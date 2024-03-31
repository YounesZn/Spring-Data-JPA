package ma.enset.hospital;

import ma.enset.hospital.entities.*;
import ma.enset.hospital.repository.MedecinRepository;
import ma.enset.hospital.repository.PatientRepository;
import ma.enset.hospital.repository.RendezVousRepository;
import ma.enset.hospital.service.IHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class HospitalApplication  {
    @Autowired
    PatientRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }
   @Bean
    CommandLineRunner start(IHospitalService iHospitalService){
        return args ->{
        };

   }
}
