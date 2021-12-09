package reto2_webciclo4.reto2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import reto2_webciclo4.reto2.interfaz.InterfaceFootwears;
import reto2_webciclo4.reto2.interfaz.InterfaceUser;



@Component
@SpringBootApplication
@EnableConfigurationProperties
public class Reto2Application implements CommandLineRunner{

    @Autowired
    private InterfaceFootwears interfaceFootwears;
    @Autowired
    private InterfaceUser interfaceUser;

    public static void main(String[] args) {
        SpringApplication.run(Reto2Application.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        interfaceFootwears.deleteAll();
        interfaceUser.deleteAll();
    }
}
