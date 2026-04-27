package p000;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Priority;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p000.bg3;

/* JADX INFO: loaded from: classes3.dex */
public class to7 implements bg3<InputStream> {

    /* JADX INFO: renamed from: C */
    public static final int f85458C = 5;

    /* JADX INFO: renamed from: F */
    @fdi
    public static final String f85459F = "Location";

    /* JADX INFO: renamed from: H */
    @fdi
    public static final InterfaceC13126b f85460H = new C13125a();

    /* JADX INFO: renamed from: L */
    @fdi
    public static final int f85461L = -1;

    /* JADX INFO: renamed from: m */
    public static final String f85462m = "HttpUrlFetcher";

    /* JADX INFO: renamed from: a */
    public final k77 f85463a;

    /* JADX INFO: renamed from: b */
    public final int f85464b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13126b f85465c;

    /* JADX INFO: renamed from: d */
    public HttpURLConnection f85466d;

    /* JADX INFO: renamed from: e */
    public InputStream f85467e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f85468f;

    /* JADX INFO: renamed from: to7$a */
    public static class C13125a implements InterfaceC13126b {
        @Override // p000.to7.InterfaceC13126b
        public HttpURLConnection build(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* JADX INFO: renamed from: to7$b */
    public interface InterfaceC13126b {
        HttpURLConnection build(URL url) throws IOException;
    }

    public to7(k77 k77Var, int i) {
        this(k77Var, i, f85460H);
    }

    private HttpURLConnection buildAndConfigureConnection(URL url, Map<String, String> map) throws do7 {
        try {
            HttpURLConnection httpURLConnectionBuild = this.f85465c.build(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionBuild.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnectionBuild.setConnectTimeout(this.f85464b);
            httpURLConnectionBuild.setReadTimeout(this.f85464b);
            httpURLConnectionBuild.setUseCaches(false);
            httpURLConnectionBuild.setDoInput(true);
            httpURLConnectionBuild.setInstanceFollowRedirects(false);
            return httpURLConnectionBuild;
        } catch (IOException e) {
            throw new do7("URL.openConnection threw", 0, e);
        }
    }

    private static int getHttpStatusCodeOrInvalid(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            Log.isLoggable(f85462m, 3);
            return -1;
        }
    }

    private InputStream getStreamForSuccessfulRequest(HttpURLConnection httpURLConnection) throws do7 {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f85467e = jw2.obtain(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable(f85462m, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Got non empty content encoding: ");
                    sb.append(httpURLConnection.getContentEncoding());
                }
                this.f85467e = httpURLConnection.getInputStream();
            }
            return this.f85467e;
        } catch (IOException e) {
            throw new do7("Failed to obtain InputStream", getHttpStatusCodeOrInvalid(httpURLConnection), e);
        }
    }

    private static boolean isHttpOk(int i) {
        return i / 100 == 2;
    }

    private static boolean isHttpRedirect(int i) {
        return i / 100 == 3;
    }

    private InputStream loadDataWithRedirects(URL url, int i, URL url2, Map<String, String> map) throws do7 {
        if (i >= 5) {
            throw new do7("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new do7("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionBuildAndConfigureConnection = buildAndConfigureConnection(url, map);
        this.f85466d = httpURLConnectionBuildAndConfigureConnection;
        try {
            httpURLConnectionBuildAndConfigureConnection.connect();
            this.f85467e = this.f85466d.getInputStream();
            if (this.f85468f) {
                return null;
            }
            int httpStatusCodeOrInvalid = getHttpStatusCodeOrInvalid(this.f85466d);
            if (isHttpOk(httpStatusCodeOrInvalid)) {
                return getStreamForSuccessfulRequest(this.f85466d);
            }
            if (!isHttpRedirect(httpStatusCodeOrInvalid)) {
                if (httpStatusCodeOrInvalid == -1) {
                    throw new do7(httpStatusCodeOrInvalid);
                }
                try {
                    throw new do7(this.f85466d.getResponseMessage(), httpStatusCodeOrInvalid);
                } catch (IOException e) {
                    throw new do7("Failed to get a response message", httpStatusCodeOrInvalid, e);
                }
            }
            String headerField = this.f85466d.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new do7("Received empty or null redirect url", httpStatusCodeOrInvalid);
            }
            try {
                URL url3 = new URL(url, headerField);
                cleanup();
                return loadDataWithRedirects(url3, i + 1, url, map);
            } catch (MalformedURLException e2) {
                throw new do7("Bad redirect url: " + headerField, httpStatusCodeOrInvalid, e2);
            }
        } catch (IOException e3) {
            throw new do7("Failed to connect or obtain data", getHttpStatusCodeOrInvalid(this.f85466d), e3);
        }
    }

    @Override // p000.bg3
    public void cancel() {
        this.f85468f = true;
    }

    @Override // p000.bg3
    public void cleanup() {
        InputStream inputStream = this.f85467e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f85466d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f85466d = null;
    }

    @Override // p000.bg3
    @efb
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // p000.bg3
    @efb
    public hh3 getDataSource() {
        return hh3.REMOTE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.bg3
    public void loadData(@efb Priority priority, @efb bg3.InterfaceC1883a<? super InputStream> interfaceC1883a) {
        StringBuilder sb;
        String str = f85462m;
        long logTime = si9.getLogTime();
        try {
            try {
                interfaceC1883a.onDataReady(loadDataWithRedirects(this.f85463a.toURL(), 0, null, this.f85463a.getHeaders()));
                str = str;
            } catch (IOException e) {
                Log.isLoggable(f85462m, 3);
                interfaceC1883a.onLoadFailed(e);
                str = str;
                if (Log.isLoggable(f85462m, 2)) {
                    sb = new StringBuilder();
                }
            }
            if (Log.isLoggable(f85462m, 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                double elapsedMillis = si9.getElapsedMillis(logTime);
                sb.append(elapsedMillis);
                str = elapsedMillis;
            }
        } catch (Throwable th) {
            if (Log.isLoggable(str, 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(si9.getElapsedMillis(logTime));
            }
            throw th;
        }
    }

    @fdi
    public to7(k77 k77Var, int i, InterfaceC13126b interfaceC13126b) {
        this.f85463a = k77Var;
        this.f85464b = i;
        this.f85465c = interfaceC13126b;
    }
}
