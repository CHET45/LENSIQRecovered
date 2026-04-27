package p000;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import p000.zk4;

/* JADX INFO: loaded from: classes6.dex */
public class en4 implements zk4, zk4.InterfaceC16164a {

    /* JADX INFO: renamed from: f */
    public static final String f33574f = "DownloadUrlConnection";

    /* JADX INFO: renamed from: b */
    public URLConnection f33575b;

    /* JADX INFO: renamed from: c */
    public C5402a f33576c;

    /* JADX INFO: renamed from: d */
    public URL f33577d;

    /* JADX INFO: renamed from: e */
    public hq7 f33578e;

    /* JADX INFO: renamed from: en4$a */
    public static class C5402a {

        /* JADX INFO: renamed from: a */
        public Proxy f33579a;

        /* JADX INFO: renamed from: b */
        public Integer f33580b;

        /* JADX INFO: renamed from: c */
        public Integer f33581c;

        public C5402a connectTimeout(int i) {
            this.f33581c = Integer.valueOf(i);
            return this;
        }

        public C5402a proxy(Proxy proxy) {
            this.f33579a = proxy;
            return this;
        }

        public C5402a readTimeout(int i) {
            this.f33580b = Integer.valueOf(i);
            return this;
        }
    }

    /* JADX INFO: renamed from: en4$b */
    public static class C5403b implements zk4.InterfaceC16165b {

        /* JADX INFO: renamed from: a */
        public final C5402a f33582a;

        public C5403b() {
            this(null);
        }

        /* JADX INFO: renamed from: a */
        public zk4 m10156a(URL url) throws IOException {
            return new en4(url, this.f33582a);
        }

        @Override // p000.zk4.InterfaceC16165b
        public zk4 create(String str) throws IOException {
            return new en4(str, this.f33582a);
        }

        public C5403b(C5402a c5402a) {
            this.f33582a = c5402a;
        }
    }

    /* JADX INFO: renamed from: en4$c */
    public static final class C5404c implements hq7 {

        /* JADX INFO: renamed from: a */
        public String f33583a;

        @Override // p000.hq7
        @hib
        public String getRedirectLocation() {
            return this.f33583a;
        }

        @Override // p000.hq7
        public void handleRedirect(zk4 zk4Var, zk4.InterfaceC16164a interfaceC16164a, Map<String, List<String>> map) throws IOException {
            en4 en4Var = (en4) zk4Var;
            int i = 0;
            for (int responseCode = interfaceC16164a.getResponseCode(); ivd.isRedirect(responseCode); responseCode = en4Var.getResponseCode()) {
                en4Var.release();
                i++;
                if (i > 10) {
                    throw new ProtocolException("Too many redirect requests: " + i);
                }
                this.f33583a = ivd.getRedirectedUrl(interfaceC16164a, responseCode);
                en4Var.f33577d = new URL(this.f33583a);
                en4Var.m10152b();
                q0i.addRequestHeaderFields(map, en4Var);
                en4Var.f33575b.connect();
            }
        }
    }

    public en4(URLConnection uRLConnection) {
        this(uRLConnection, new C5404c());
    }

    @Override // p000.zk4
    public void addHeader(String str, String str2) {
        this.f33575b.addRequestProperty(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public void m10152b() throws IOException {
        q0i.m19913d(f33574f, "config connection for " + this.f33577d);
        C5402a c5402a = this.f33576c;
        if (c5402a == null || c5402a.f33579a == null) {
            this.f33575b = this.f33577d.openConnection();
        } else {
            this.f33575b = this.f33577d.openConnection(this.f33576c.f33579a);
        }
        URLConnection uRLConnection = this.f33575b;
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).setInstanceFollowRedirects(false);
        }
        C5402a c5402a2 = this.f33576c;
        if (c5402a2 != null) {
            if (c5402a2.f33580b != null) {
                this.f33575b.setReadTimeout(this.f33576c.f33580b.intValue());
            }
            if (this.f33576c.f33581c != null) {
                this.f33575b.setConnectTimeout(this.f33576c.f33581c.intValue());
            }
        }
    }

    @Override // p000.zk4
    public zk4.InterfaceC16164a execute() throws IOException {
        Map<String, List<String>> requestProperties = getRequestProperties();
        this.f33575b.connect();
        this.f33578e.handleRedirect(this, this, requestProperties);
        return this;
    }

    @Override // p000.zk4.InterfaceC16164a
    public InputStream getInputStream() throws IOException {
        return this.f33575b.getInputStream();
    }

    @Override // p000.zk4.InterfaceC16164a
    public String getRedirectLocation() {
        return this.f33578e.getRedirectLocation();
    }

    @Override // p000.zk4
    public Map<String, List<String>> getRequestProperties() {
        return this.f33575b.getRequestProperties();
    }

    @Override // p000.zk4
    public String getRequestProperty(String str) {
        return this.f33575b.getRequestProperty(str);
    }

    @Override // p000.zk4.InterfaceC16164a
    public int getResponseCode() throws IOException {
        URLConnection uRLConnection = this.f33575b;
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return 0;
    }

    @Override // p000.zk4.InterfaceC16164a
    public String getResponseHeaderField(String str) {
        return this.f33575b.getHeaderField(str);
    }

    @Override // p000.zk4.InterfaceC16164a
    public Map<String, List<String>> getResponseHeaderFields() {
        return this.f33575b.getHeaderFields();
    }

    @Override // p000.zk4
    public void release() {
        try {
            InputStream inputStream = this.f33575b.getInputStream();
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
    }

    @Override // p000.zk4
    public boolean setRequestMethod(@efb String str) throws ProtocolException {
        URLConnection uRLConnection = this.f33575b;
        if (!(uRLConnection instanceof HttpURLConnection)) {
            return false;
        }
        ((HttpURLConnection) uRLConnection).setRequestMethod(str);
        return true;
    }

    public en4(URLConnection uRLConnection, hq7 hq7Var) {
        this.f33575b = uRLConnection;
        this.f33577d = uRLConnection.getURL();
        this.f33578e = hq7Var;
    }

    public en4(String str, C5402a c5402a) throws IOException {
        this(new URL(str), c5402a);
    }

    public en4(URL url, C5402a c5402a) throws IOException {
        this(url, c5402a, new C5404c());
    }

    public en4(URL url, C5402a c5402a, hq7 hq7Var) throws IOException {
        this.f33576c = c5402a;
        this.f33577d = url;
        this.f33578e = hq7Var;
        m10152b();
    }

    public en4(String str) throws IOException {
        this(str, (C5402a) null);
    }
}
