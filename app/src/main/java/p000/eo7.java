package p000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes5.dex */
public class eo7 {

    /* JADX INFO: renamed from: d */
    public static final String f33715d = "GET";

    /* JADX INFO: renamed from: e */
    public static final int f33716e = 10000;

    /* JADX INFO: renamed from: f */
    public static final int f33717f = 8192;

    /* JADX INFO: renamed from: a */
    public final String f33718a;

    /* JADX INFO: renamed from: b */
    public final Map<String, String> f33719b;

    /* JADX INFO: renamed from: c */
    public final Map<String, String> f33720c = new HashMap();

    public eo7(String str, Map<String, String> map) {
        this.f33718a = str;
        this.f33719b = map;
    }

    private String createParamsString(Map<String, String> map) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        sb.append(next.getKey());
        sb.append("=");
        sb.append(next.getValue() != null ? URLEncoder.encode(next.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            sb.append("&");
            sb.append(next2.getKey());
            sb.append("=");
            sb.append(next2.getValue() != null ? URLEncoder.encode(next2.getValue(), "UTF-8") : "");
        }
        return sb.toString();
    }

    private String createUrlWithParams(String str, Map<String, String> map) throws UnsupportedEncodingException {
        String strCreateParamsString = createParamsString(map);
        if (strCreateParamsString.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return str + "?" + strCreateParamsString;
        }
        if (!str.endsWith("&")) {
            strCreateParamsString = "&" + strCreateParamsString;
        }
        return str + strCreateParamsString;
    }

    private String readStream(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = bufferedReader.read(cArr);
            if (i == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, i);
        }
    }

    public oo7 execute() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        g53.checkBlockingThread();
        InputStream inputStream = null;
        String stream = null;
        inputStream = null;
        try {
            String strCreateUrlWithParams = createUrlWithParams(this.f33718a, this.f33719b);
            ej9.getLogger().m10067v("GET Request URL: " + strCreateUrlWithParams);
            httpsURLConnection = (HttpsURLConnection) new URL(strCreateUrlWithParams).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.f33720c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        stream = readStream(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new oo7(responseCode, stream);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public eo7 header(String str, String str2) {
        this.f33720c.put(str, str2);
        return this;
    }

    public eo7 header(Map.Entry<String, String> entry) {
        return header(entry.getKey(), entry.getValue());
    }
}
