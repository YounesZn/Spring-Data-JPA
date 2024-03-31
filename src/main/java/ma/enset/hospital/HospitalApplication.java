package ma.enset.hospital;

import ma.enset.hospital.entities.Patient;
import ma.enset.hospital.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner  {
    @Autowired
    ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat parser=new SimpleDateFormat("dd/MM/yyyy");
        productRepository.save(new Patient(null,"Younes Zendour",parser.parse("25/12/2010"),false,10));
        productRepository.save(new Patient(null,"Yassir elm", parser.parse("02/01/2011"),false,40));
        List<Patient> all = productRepository.findAll();
        all.forEach(patient -> {
            patient.toString();
        });
    }
}
