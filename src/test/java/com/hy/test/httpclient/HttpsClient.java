package com.hy.test.httpclient;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * Author wanghaiyuan
 * Date 2019/3/31 16:40.
 */
public class HttpsClient {

    private static X509TrustManager tm = new X509TrustManager() {
        public void checkClientTrusted(X509Certificate[] xcs, String string)throws CertificateException {
        }
        public void checkServerTrusted(X509Certificate[] xcs, String string)throws CertificateException {
        }
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    };
    @SuppressWarnings("deprecation")
    public static HttpClient getInstance() throws KeyManagementException, NoSuchAlgorithmException {
        HttpClient client = new DefaultHttpClient();
        SSLContext ctx = SSLContext.getInstance("TLS");
        ctx.init(null, new TrustManager[] { tm }, null);
        SSLSocketFactory ssf = new SSLSocketFactory(ctx);
        ssf.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
        ClientConnectionManager ccm = client.getConnectionManager();
        SchemeRegistry sr = ccm.getSchemeRegistry();
        sr.register(new Scheme("https", ssf, 8443));
        client = new DefaultHttpClient(ccm, client.getParams());
        return client;
    }

}