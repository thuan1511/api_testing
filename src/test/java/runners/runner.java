package runners;

import org.junit.runner.RunWith;

import TestDifinication.BasicApiTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
@Narrative(text={"Api is important."})
public class runner {
	@Steps
	BasicApiTest test;
	
	@org.junit.Test
    public void ApiTesting() {
        // Given
		test.T01_StatusCodeTest();

        // When
		test.T02_GetClients();

        // Then
		test.T03_GetAndroidModelPackageOptions();
	}

}
