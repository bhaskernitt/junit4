package junit.apiFramework.client.http;

import com.squareup.okhttp.*;

import java.io.IOException;

public class HttpClient {
    private Response response;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    private HttpClient(HttpClientBuilder httpClientBuilder) {
        response=httpClientBuilder.response;
    }

    public static final class HttpClientBuilder {

        private Headers.Builder httpHeaderBuilder = new Headers.Builder();
        private String url;
        private String payload;
        private Response response;
        private String method;


        public HttpClientBuilder setHeader(String key, String value) {
            httpHeaderBuilder.set(key, value);
            return this;
        }

        public HttpClientBuilder setUrl(String url) {
            this.url = url;
            return this;
        }

        public HttpClientBuilder setPayload(String payload) {
            this.payload = payload;
            return this;
        }

        public HttpClientBuilder setMethod(String method){
            this.method=method;
            return this;
        }


        public HttpClient send() throws IOException {
            RequestBody requestBody;
            if(!"GET".equalsIgnoreCase(this.method)){
                 requestBody = RequestBody
                        .create(MediaType.parse("application/json"), this.payload);
            }
            else {
                requestBody=null;
            }





            Request request = new Request.Builder()
                    .url(url)
                    .headers(httpHeaderBuilder.build())
                    .method(this.method, requestBody)
                    .build();


             this.response = new OkHttpClient().newCall(request).execute();


            return new HttpClient(this);
        }

    }

}
