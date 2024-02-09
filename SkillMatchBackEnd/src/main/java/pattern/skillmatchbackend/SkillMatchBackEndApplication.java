package pattern.skillmatchbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import pattern.skillmatchbackend.data.service.ImageServiceImpl;
import pattern.skillmatchbackend.model.*;
import pattern.skillmatchbackend.model.email.EmailSender;
import pattern.skillmatchbackend.persistenza.DBManager;

import java.util.List;


@SpringBootApplication
@ServletComponentScan
public class SkillMatchBackEndApplication {

	public GestoreNotifiche gestoreNotifiche = new GestoreNotifiche();

	public static void main(String[] args) {

		SpringApplication.run(SkillMatchBackEndApplication.class, args);

	}
}
