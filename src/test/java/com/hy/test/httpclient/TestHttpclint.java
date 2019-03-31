package com.hy.test.httpclient;


import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Author wanghaiyuan
 * Date 2019/3/30 20:50.
 */
public class TestHttpclint {
    public static void main(String args[]){

        HttpGet httpGet = new HttpGet("https://localhost:8443/user/getById?userid=1");
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            CloseableHttpResponse response = httpClient.execute(httpGet);
            if (response != null){
                if (response.getStatusLine().getStatusCode() == 200){
                    HttpEntity httpEntity = response.getEntity();
                    //EntityUtils.consume(httpEntity);
                    String entits = EntityUtils.toString(httpEntity);
                    System.out.println(entits);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
