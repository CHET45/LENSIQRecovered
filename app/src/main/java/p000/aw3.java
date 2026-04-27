package p000;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import p000.aw3;
import p000.en7;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class aw3 extends vq0 implements en7 {

    /* JADX INFO: renamed from: A */
    public static final long f11960A = 2048;

    /* JADX INFO: renamed from: u */
    public static final int f11961u = 8000;

    /* JADX INFO: renamed from: v */
    public static final int f11962v = 8000;

    /* JADX INFO: renamed from: w */
    public static final String f11963w = "DefaultHttpDataSource";

    /* JADX INFO: renamed from: x */
    public static final int f11964x = 20;

    /* JADX INFO: renamed from: y */
    public static final int f11965y = 307;

    /* JADX INFO: renamed from: z */
    public static final int f11966z = 308;

    /* JADX INFO: renamed from: f */
    public final boolean f11967f;

    /* JADX INFO: renamed from: g */
    public final int f11968g;

    /* JADX INFO: renamed from: h */
    public final int f11969h;

    /* JADX INFO: renamed from: i */
    @hib
    public final String f11970i;

    /* JADX INFO: renamed from: j */
    @hib
    public final en7.C5411g f11971j;

    /* JADX INFO: renamed from: k */
    public final en7.C5411g f11972k;

    /* JADX INFO: renamed from: l */
    public final boolean f11973l;

    /* JADX INFO: renamed from: m */
    @hib
    public l8d<String> f11974m;

    /* JADX INFO: renamed from: n */
    @hib
    public yh3 f11975n;

    /* JADX INFO: renamed from: o */
    @hib
    public HttpURLConnection f11976o;

    /* JADX INFO: renamed from: p */
    @hib
    public InputStream f11977p;

    /* JADX INFO: renamed from: q */
    public boolean f11978q;

    /* JADX INFO: renamed from: r */
    public int f11979r;

    /* JADX INFO: renamed from: s */
    public long f11980s;

    /* JADX INFO: renamed from: t */
    public long f11981t;

    /* JADX INFO: renamed from: aw3$b */
    public static final class C1623b implements en7.InterfaceC5407c {

        /* JADX INFO: renamed from: b */
        @hib
        public pdh f11983b;

        /* JADX INFO: renamed from: c */
        @hib
        public l8d<String> f11984c;

        /* JADX INFO: renamed from: d */
        @hib
        public String f11985d;

        /* JADX INFO: renamed from: g */
        public boolean f11988g;

        /* JADX INFO: renamed from: h */
        public boolean f11989h;

        /* JADX INFO: renamed from: a */
        public final en7.C5411g f11982a = new en7.C5411g();

        /* JADX INFO: renamed from: e */
        public int f11986e = 8000;

        /* JADX INFO: renamed from: f */
        public int f11987f = 8000;

        @op1
        public C1623b setAllowCrossProtocolRedirects(boolean z) {
            this.f11988g = z;
            return this;
        }

        @op1
        public C1623b setConnectTimeoutMs(int i) {
            this.f11986e = i;
            return this;
        }

        @op1
        public C1623b setContentTypePredicate(@hib l8d<String> l8dVar) {
            this.f11984c = l8dVar;
            return this;
        }

        @Override // p000.en7.InterfaceC5407c
        @op1
        public /* bridge */ /* synthetic */ en7.InterfaceC5407c setDefaultRequestProperties(Map map) {
            return setDefaultRequestProperties((Map<String, String>) map);
        }

        @op1
        public C1623b setKeepPostFor302Redirects(boolean z) {
            this.f11989h = z;
            return this;
        }

        @op1
        public C1623b setReadTimeoutMs(int i) {
            this.f11987f = i;
            return this;
        }

        @op1
        public C1623b setTransferListener(@hib pdh pdhVar) {
            this.f11983b = pdhVar;
            return this;
        }

        @op1
        public C1623b setUserAgent(@hib String str) {
            this.f11985d = str;
            return this;
        }

        @Override // p000.en7.InterfaceC5407c
        @op1
        public final C1623b setDefaultRequestProperties(Map<String, String> map) {
            this.f11982a.clearAndSet(map);
            return this;
        }

        @Override // p000.en7.InterfaceC5407c, p000.ih3.InterfaceC7283a
        public aw3 createDataSource() {
            aw3 aw3Var = new aw3(this.f11985d, this.f11986e, this.f11987f, this.f11988g, this.f11982a, this.f11984c, this.f11989h);
            pdh pdhVar = this.f11983b;
            if (pdhVar != null) {
                aw3Var.addTransferListener(pdhVar);
            }
            return aw3Var;
        }
    }

    /* JADX INFO: renamed from: aw3$c */
    public static class C1624c extends qs6<String, List<String>> {

        /* JADX INFO: renamed from: a */
        public final Map<String, List<String>> f11990a;

        public C1624c(Map<String, List<String>> map) {
            this.f11990a = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$entrySet$1(Map.Entry entry) {
            return entry.getKey() != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$keySet$0(String str) {
            return str != null;
        }

        @Override // p000.qs6, p000.zs6
        /* JADX INFO: renamed from: a */
        public Map<String, List<String>> mo8967m() {
            return this.f11990a;
        }

        @Override // p000.qs6, java.util.Map
        public boolean containsKey(@hib Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // p000.qs6, java.util.Map
        public boolean containsValue(@hib Object obj) {
            return super.m20638d(obj);
        }

        @Override // p000.qs6, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return t6f.filter(super.entrySet(), new l8d() { // from class: yv3
                @Override // p000.l8d
                public final boolean apply(Object obj) {
                    return aw3.C1624c.lambda$entrySet$1((Map.Entry) obj);
                }
            });
        }

        @Override // p000.qs6, java.util.Map
        public boolean equals(@hib Object obj) {
            return obj != null && super.m20639e(obj);
        }

        @Override // p000.qs6, java.util.Map
        public int hashCode() {
            return super.m20640f();
        }

        @Override // p000.qs6, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // p000.qs6, java.util.Map
        public Set<String> keySet() {
            return t6f.filter(super.keySet(), new l8d() { // from class: wv3
                @Override // p000.l8d
                public final boolean apply(Object obj) {
                    return aw3.C1624c.lambda$keySet$0((String) obj);
                }
            });
        }

        @Override // p000.qs6, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // p000.qs6, java.util.Map
        @hib
        public List<String> get(@hib Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }
    }

    private void closeConnectionQuietly() {
        HttpURLConnection httpURLConnection = this.f11976o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                yh9.m25916e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f11976o = null;
        }
    }

    private URL handleRedirect(URL url, @hib String str, yh3 yh3Var) throws en7.C5408d {
        if (str == null) {
            throw new en7.C5408d("Null location redirect", yh3Var, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new en7.C5408d("Unsupported protocol redirect: " + protocol, yh3Var, 2001, 1);
            }
            if (this.f11967f || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new en7.C5408d("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + c0b.f15434d, yh3Var, 2001, 1);
        } catch (MalformedURLException e) {
            throw new en7.C5408d(e, yh3Var, 2001, 1);
        }
    }

    private static boolean isCompressed(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection makeConnection(yh3 yh3Var) throws IOException {
        HttpURLConnection httpURLConnectionMakeConnection;
        URL url = new URL(yh3Var.f101485a.toString());
        int i = yh3Var.f101487c;
        byte[] bArr = yh3Var.f101488d;
        long j = yh3Var.f101491g;
        long j2 = yh3Var.f101492h;
        boolean zIsFlagSet = yh3Var.isFlagSet(1);
        if (!this.f11967f && !this.f11973l) {
            return makeConnection(url, i, bArr, j, j2, zIsFlagSet, true, yh3Var.f101489e);
        }
        int i2 = 0;
        URL urlHandleRedirect = url;
        int i3 = i;
        byte[] bArr2 = bArr;
        while (true) {
            int i4 = i2 + 1;
            if (i2 > 20) {
                throw new en7.C5408d(new NoRouteToHostException("Too many redirects: " + i4), yh3Var, 2001, 1);
            }
            long j3 = j;
            long j4 = j;
            int i5 = i3;
            URL url2 = urlHandleRedirect;
            long j5 = j2;
            httpURLConnectionMakeConnection = makeConnection(urlHandleRedirect, i3, bArr2, j3, j2, zIsFlagSet, false, yh3Var.f101489e);
            int responseCode = httpURLConnectionMakeConnection.getResponseCode();
            String headerField = httpURLConnectionMakeConnection.getHeaderField("Location");
            if ((i5 == 1 || i5 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionMakeConnection.disconnect();
                urlHandleRedirect = handleRedirect(url2, headerField, yh3Var);
                i3 = i5;
            } else {
                if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionMakeConnection.disconnect();
                if (this.f11973l && responseCode == 302) {
                    i3 = i5;
                } else {
                    bArr2 = null;
                    i3 = 1;
                }
                urlHandleRedirect = handleRedirect(url2, headerField, yh3Var);
            }
            i2 = i4;
            j = j4;
            j2 = j5;
        }
        return httpURLConnectionMakeConnection;
    }

    private static void maybeTerminateInputStream(@hib HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection == null || (i = x0i.f95978a) < 19 || i > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) u80.checkNotNull(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    private int readInternal(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f11980s;
        if (j != -1) {
            long j2 = j - this.f11981t;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int i3 = ((InputStream) x0i.castNonNull(this.f11977p)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.f11981t += (long) i3;
        m24112b(i3);
        return i3;
    }

    private void skipFully(long j, yh3 yh3Var) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int i = ((InputStream) x0i.castNonNull(this.f11977p)).read(bArr, 0, (int) Math.min(j, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new en7.C5408d(new InterruptedIOException(), yh3Var, 2000, 1);
            }
            if (i == -1) {
                throw new en7.C5408d(yh3Var, 2008, 1);
            }
            j -= (long) i;
            m24112b(i);
        }
    }

    @Override // p000.en7
    public void clearAllRequestProperties() {
        this.f11972k.clear();
    }

    @Override // p000.en7
    public void clearRequestProperty(String str) {
        u80.checkNotNull(str);
        this.f11972k.remove(str);
    }

    @Override // p000.ih3, p000.en7
    public void close() throws en7.C5408d {
        try {
            InputStream inputStream = this.f11977p;
            if (inputStream != null) {
                long j = this.f11980s;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.f11981t;
                }
                maybeTerminateInputStream(this.f11976o, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new en7.C5408d(e, (yh3) x0i.castNonNull(this.f11975n), 2000, 3);
                }
            }
        } finally {
            this.f11977p = null;
            closeConnectionQuietly();
            if (this.f11978q) {
                this.f11978q = false;
                m24113c();
            }
        }
    }

    @fdi
    /* JADX INFO: renamed from: f */
    public HttpURLConnection m2703f(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // p000.en7
    public int getResponseCode() {
        int i;
        if (this.f11976o == null || (i = this.f11979r) <= 0) {
            return -1;
        }
        return i;
    }

    @Override // p000.ih3, p000.en7
    public Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f11976o;
        return httpURLConnection == null ? ox7.m19076of() : new C1624c(httpURLConnection.getHeaderFields());
    }

    @Override // p000.ih3
    @hib
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f11976o;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // p000.ih3, p000.en7
    public long open(yh3 yh3Var) throws en7.C5408d {
        byte[] byteArray;
        this.f11975n = yh3Var;
        long j = 0;
        this.f11981t = 0L;
        this.f11980s = 0L;
        m24114d(yh3Var);
        try {
            HttpURLConnection httpURLConnectionMakeConnection = makeConnection(yh3Var);
            this.f11976o = httpURLConnectionMakeConnection;
            this.f11979r = httpURLConnectionMakeConnection.getResponseCode();
            String responseMessage = httpURLConnectionMakeConnection.getResponseMessage();
            int i = this.f11979r;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionMakeConnection.getHeaderFields();
                if (this.f11979r == 416) {
                    if (yh3Var.f101491g == vo7.getDocumentSize(httpURLConnectionMakeConnection.getHeaderField("Content-Range"))) {
                        this.f11978q = true;
                        m24115e(yh3Var);
                        long j2 = yh3Var.f101492h;
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionMakeConnection.getErrorStream();
                try {
                    byteArray = errorStream != null ? x0i.toByteArray(errorStream) : x0i.f95983f;
                } catch (IOException unused) {
                    byteArray = x0i.f95983f;
                }
                byte[] bArr = byteArray;
                closeConnectionQuietly();
                throw new en7.C5410f(this.f11979r, responseMessage, this.f11979r == 416 ? new rh3(2008) : null, headerFields, yh3Var, bArr);
            }
            String contentType = httpURLConnectionMakeConnection.getContentType();
            l8d<String> l8dVar = this.f11974m;
            if (l8dVar != null && !l8dVar.apply(contentType)) {
                closeConnectionQuietly();
                throw new en7.C5409e(contentType, yh3Var);
            }
            if (this.f11979r == 200) {
                long j3 = yh3Var.f101491g;
                if (j3 != 0) {
                    j = j3;
                }
            }
            boolean zIsCompressed = isCompressed(httpURLConnectionMakeConnection);
            if (zIsCompressed) {
                this.f11980s = yh3Var.f101492h;
            } else {
                long j4 = yh3Var.f101492h;
                if (j4 != -1) {
                    this.f11980s = j4;
                } else {
                    long contentLength = vo7.getContentLength(httpURLConnectionMakeConnection.getHeaderField("Content-Length"), httpURLConnectionMakeConnection.getHeaderField("Content-Range"));
                    this.f11980s = contentLength != -1 ? contentLength - j : -1L;
                }
            }
            try {
                this.f11977p = httpURLConnectionMakeConnection.getInputStream();
                if (zIsCompressed) {
                    this.f11977p = new GZIPInputStream(this.f11977p);
                }
                this.f11978q = true;
                m24115e(yh3Var);
                try {
                    skipFully(j, yh3Var);
                    return this.f11980s;
                } catch (IOException e) {
                    closeConnectionQuietly();
                    if (e instanceof en7.C5408d) {
                        throw ((en7.C5408d) e);
                    }
                    throw new en7.C5408d(e, yh3Var, 2000, 1);
                }
            } catch (IOException e2) {
                closeConnectionQuietly();
                throw new en7.C5408d(e2, yh3Var, 2000, 1);
            }
        } catch (IOException e3) {
            closeConnectionQuietly();
            throw en7.C5408d.createForIOException(e3, yh3Var, 1);
        }
    }

    @Override // p000.ah3, p000.en7
    public int read(byte[] bArr, int i, int i2) throws en7.C5408d {
        try {
            return readInternal(bArr, i, i2);
        } catch (IOException e) {
            throw en7.C5408d.createForIOException(e, (yh3) x0i.castNonNull(this.f11975n), 2);
        }
    }

    @Deprecated
    public void setContentTypePredicate(@hib l8d<String> l8dVar) {
        this.f11974m = l8dVar;
    }

    @Override // p000.en7
    public void setRequestProperty(String str, String str2) {
        u80.checkNotNull(str);
        u80.checkNotNull(str2);
        this.f11972k.set(str, str2);
    }

    @Deprecated
    public aw3() {
        this(null, 8000, 8000);
    }

    @Deprecated
    public aw3(@hib String str) {
        this(str, 8000, 8000);
    }

    @Deprecated
    public aw3(@hib String str, int i, int i2) {
        this(str, i, i2, false, null);
    }

    @Deprecated
    public aw3(@hib String str, int i, int i2, boolean z, @hib en7.C5411g c5411g) {
        this(str, i, i2, z, c5411g, null, false);
    }

    private aw3(@hib String str, int i, int i2, boolean z, @hib en7.C5411g c5411g, @hib l8d<String> l8dVar, boolean z2) {
        super(true);
        this.f11970i = str;
        this.f11968g = i;
        this.f11969h = i2;
        this.f11967f = z;
        this.f11971j = c5411g;
        this.f11974m = l8dVar;
        this.f11972k = new en7.C5411g();
        this.f11973l = z2;
    }

    private HttpURLConnection makeConnection(URL url, int i, @hib byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionM2703f = m2703f(url);
        httpURLConnectionM2703f.setConnectTimeout(this.f11968g);
        httpURLConnectionM2703f.setReadTimeout(this.f11969h);
        HashMap map2 = new HashMap();
        en7.C5411g c5411g = this.f11971j;
        if (c5411g != null) {
            map2.putAll(c5411g.getSnapshot());
        }
        map2.putAll(this.f11972k.getSnapshot());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionM2703f.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strBuildRangeRequestHeader = vo7.buildRangeRequestHeader(j, j2);
        if (strBuildRangeRequestHeader != null) {
            httpURLConnectionM2703f.setRequestProperty("Range", strBuildRangeRequestHeader);
        }
        String str = this.f11970i;
        if (str != null) {
            httpURLConnectionM2703f.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionM2703f.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnectionM2703f.setInstanceFollowRedirects(z2);
        httpURLConnectionM2703f.setDoOutput(bArr != null);
        httpURLConnectionM2703f.setRequestMethod(yh3.getStringForHttpMethod(i));
        if (bArr != null) {
            httpURLConnectionM2703f.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionM2703f.connect();
            OutputStream outputStream = httpURLConnectionM2703f.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionM2703f.connect();
        }
        return httpURLConnectionM2703f;
    }
}
