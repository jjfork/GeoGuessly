package pwr.git.geoguessly;

import com.azure.security.keyvault.secrets.SecretClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeoguesslyApplication implements CommandLineRunner {

	private final SecretClient secretClient;

    public GeoguesslyApplication(SecretClient secretClient) {
        this.secretClient = secretClient;
    }

    public static void main(String[] args) {
		SpringApplication.run(GeoguesslyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
