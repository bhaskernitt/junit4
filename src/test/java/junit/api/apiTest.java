package junit.api;


import junit.apiFramework.Header;
import junit.apiFramework.Headers;
import junit.apiFramework.TestApi;
import junit.apiFramework.entity.HttpMethod;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ApiClassRunner;

@RunWith(value = BlockJUnit4ApiClassRunner.class)
public class apiTest {

    @Test
    @TestApi(url = "", httpMethod = HttpMethod.GET, payload = "",
            headers = @Headers({
                    @Header(hValue = "", hKey = ""),
                    @Header(hKey = "", hValue = "")
            })
    )
    @TestApi(url = "", httpMethod = HttpMethod.GET, payload = "",
            headers = @Headers({
                    @Header(hValue = "", hKey = ""),
                    @Header(hKey = "", hValue = "")
            })
    )
    public void testIndividualApi() {

    }
}
