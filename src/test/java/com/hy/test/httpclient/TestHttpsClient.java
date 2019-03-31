package com.hy.test.httpclient;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

/**
 * Author wanghaiyuan
 * Date 2019/3/30 20:50.
 */
public class TestHttpsClient {
    public static void main(String args[]){

        HttpGet httpGet = new HttpGet("https://localhost:8443/user/getById?userid=1");
        HttpClient httpClient = null;
        try {
            httpClient = HttpsClient.getInstance();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        try {
            HttpResponse response = httpClient.execute(httpGet);
            if (response != null){
                if (response.getStatusLine().getStatusCode() == 200){
                    HttpEntity httpEntity = response.getEntity();
                    //EntityUtils.consume(httpEntity);
                    String entits = EntityUtils.toString(httpEntity);
                    System.out.println(entits);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
