package pwr.git.geoguessly;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class AAAATest {
    @Test
    void test() {
        // Retrieve and print the Azure Client ID
        String azureClientId = System.getenv("AZURE_CLIENT_ID");
        System.out.println("Azure Client ID: " + azureClientId);

        // Retrieve and print the Azure Client Secret
        String azureClientSecret = System.getenv("AZURE_CLIENT_SECRET");
        System.out.println("Azure Client Secret: " + azureClientSecret);

        // Retrieve and print the Azure Tenant IDX
        String azureTenantId = System.getenv("AZURE_TENANT_ID");
        System.out.println("Azure Tenant ID: " + azureTenantId);
    }
}
