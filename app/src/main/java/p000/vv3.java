package p000;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import p000.dn7;
import p000.vv3;

/* JADX INFO: loaded from: classes3.dex */
public class vv3 extends wq0 implements dn7 {

    /* JADX INFO: renamed from: A */
    public static final int f92335A = 308;

    /* JADX INFO: renamed from: v */
    @ovh
    public static final int f92336v = 8000;

    /* JADX INFO: renamed from: w */
    @ovh
    public static final int f92337w = 8000;

    /* JADX INFO: renamed from: x */
    public static final String f92338x = "DefaultHttpDataSource";

    /* JADX INFO: renamed from: y */
    public static final int f92339y = 20;

    /* JADX INFO: renamed from: z */
    public static final int f92340z = 307;

    /* JADX INFO: renamed from: f */
    public final boolean f92341f;

    /* JADX INFO: renamed from: g */
    public final boolean f92342g;

    /* JADX INFO: renamed from: h */
    public final int f92343h;

    /* JADX INFO: renamed from: i */
    public final int f92344i;

    /* JADX INFO: renamed from: j */
    @hib
    public final String f92345j;

    /* JADX INFO: renamed from: k */
    @hib
    public final dn7.C4883g f92346k;

    /* JADX INFO: renamed from: l */
    public final dn7.C4883g f92347l;

    /* JADX INFO: renamed from: m */
    @hib
    public final l8d<String> f92348m;

    /* JADX INFO: renamed from: n */
    public final boolean f92349n;

    /* JADX INFO: renamed from: o */
    @hib
    public xh3 f92350o;

    /* JADX INFO: renamed from: p */
    @hib
    public HttpURLConnection f92351p;

    /* JADX INFO: renamed from: q */
    @hib
    public InputStream f92352q;

    /* JADX INFO: renamed from: r */
    public boolean f92353r;

    /* JADX INFO: renamed from: s */
    public int f92354s;

    /* JADX INFO: renamed from: t */
    public long f92355t;

    /* JADX INFO: renamed from: u */
    public long f92356u;

    /* JADX INFO: renamed from: vv3$b */
    public static final class C14271b implements dn7.InterfaceC4879c {

        /* JADX INFO: renamed from: b */
        @hib
        public qdh f92358b;

        /* JADX INFO: renamed from: c */
        @hib
        public l8d<String> f92359c;

        /* JADX INFO: renamed from: d */
        @hib
        public String f92360d;

        /* JADX INFO: renamed from: g */
        public boolean f92363g;

        /* JADX INFO: renamed from: h */
        public boolean f92364h;

        /* JADX INFO: renamed from: i */
        public boolean f92365i;

        /* JADX INFO: renamed from: a */
        public final dn7.C4883g f92357a = new dn7.C4883g();

        /* JADX INFO: renamed from: e */
        public int f92361e = 8000;

        /* JADX INFO: renamed from: f */
        public int f92362f = 8000;

        @op1
        @ovh
        public C14271b setAllowCrossProtocolRedirects(boolean z) {
            this.f92363g = z;
            return this;
        }

        @op1
        @ovh
        public C14271b setConnectTimeoutMs(int i) {
            this.f92361e = i;
            return this;
        }

        @op1
        @ovh
        public C14271b setContentTypePredicate(@hib l8d<String> l8dVar) {
            this.f92359c = l8dVar;
            return this;
        }

        @op1
        @ovh
        public C14271b setCrossProtocolRedirectsForceOriginal(boolean z) {
            this.f92364h = z;
            return this;
        }

        @Override // p000.dn7.InterfaceC4879c
        @op1
        @ovh
        public /* bridge */ /* synthetic */ dn7.InterfaceC4879c setDefaultRequestProperties(Map map) {
            return setDefaultRequestProperties((Map<String, String>) map);
        }

        @op1
        @ovh
        public C14271b setKeepPostFor302Redirects(boolean z) {
            this.f92365i = z;
            return this;
        }

        @op1
        @ovh
        public C14271b setReadTimeoutMs(int i) {
            this.f92362f = i;
            return this;
        }

        @op1
        @ovh
        public C14271b setTransferListener(@hib qdh qdhVar) {
            this.f92358b = qdhVar;
            return this;
        }

        @op1
        public C14271b setUserAgent(@hib String str) {
            this.f92360d = str;
            return this;
        }

        @Override // p000.dn7.InterfaceC4879c
        @op1
        @ovh
        public C14271b setDefaultRequestProperties(Map<String, String> map) {
            this.f92357a.clearAndSet(map);
            return this;
        }

        @Override // p000.dn7.InterfaceC4879c, p000.gh3.InterfaceC6313a
        @ovh
        public vv3 createDataSource() {
            vv3 vv3Var = new vv3(this.f92360d, this.f92361e, this.f92362f, this.f92363g, this.f92364h, this.f92357a, this.f92359c, this.f92365i);
            qdh qdhVar = this.f92358b;
            if (qdhVar != null) {
                vv3Var.addTransferListener(qdhVar);
            }
            return vv3Var;
        }
    }

    /* JADX INFO: renamed from: vv3$c */
    public static class C14272c extends qs6<String, List<String>> {

        /* JADX INFO: renamed from: a */
        public final Map<String, List<String>> f92366a;

        public C14272c(Map<String, List<String>> map) {
            this.f92366a = map;
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
            return this.f92366a;
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
            return t6f.filter(super.entrySet(), new l8d() { // from class: xv3
                @Override // p000.l8d
                public final boolean apply(Object obj) {
                    return vv3.C14272c.lambda$entrySet$1((Map.Entry) obj);
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
            return t6f.filter(super.keySet(), new l8d() { // from class: zv3
                @Override // p000.l8d
                public final boolean apply(Object obj) {
                    return vv3.C14272c.lambda$keySet$0((String) obj);
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
        HttpURLConnection httpURLConnection = this.f92351p;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                xh9.m25145e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    private URL handleRedirect(URL url, @hib String str, xh3 xh3Var) throws dn7.C4880d {
        if (str == null) {
            throw new dn7.C4880d("Null location redirect", xh3Var, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new dn7.C4880d("Unsupported protocol redirect: " + protocol, xh3Var, 2001, 1);
            }
            if (this.f92341f || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f92342g) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e) {
                    throw new dn7.C4880d(e, xh3Var, 2001, 1);
                }
            }
            throw new dn7.C4880d("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + c0b.f15434d, xh3Var, 2001, 1);
        } catch (MalformedURLException e2) {
            throw new dn7.C4880d(e2, xh3Var, 2001, 1);
        }
    }

    private static boolean isCompressed(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection makeConnection(xh3 xh3Var) throws IOException {
        HttpURLConnection httpURLConnectionMakeConnection;
        URL url = new URL(xh3Var.f97800a.toString());
        int i = xh3Var.f97802c;
        byte[] bArr = xh3Var.f97803d;
        long j = xh3Var.f97806g;
        long j2 = xh3Var.f97807h;
        boolean zIsFlagSet = xh3Var.isFlagSet(1);
        if (!this.f92341f && !this.f92342g && !this.f92349n) {
            return makeConnection(url, i, bArr, j, j2, zIsFlagSet, true, xh3Var.f97804e);
        }
        int i2 = 0;
        URL urlHandleRedirect = url;
        int i3 = i;
        byte[] bArr2 = bArr;
        while (true) {
            int i4 = i2 + 1;
            if (i2 > 20) {
                throw new dn7.C4880d(new NoRouteToHostException("Too many redirects: " + i4), xh3Var, 2001, 1);
            }
            long j3 = j;
            long j4 = j;
            int i5 = i3;
            URL url2 = urlHandleRedirect;
            long j5 = j2;
            httpURLConnectionMakeConnection = makeConnection(urlHandleRedirect, i3, bArr2, j3, j2, zIsFlagSet, false, xh3Var.f97804e);
            int responseCode = httpURLConnectionMakeConnection.getResponseCode();
            String headerField = httpURLConnectionMakeConnection.getHeaderField("Location");
            if ((i5 == 1 || i5 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionMakeConnection.disconnect();
                urlHandleRedirect = handleRedirect(url2, headerField, xh3Var);
                i3 = i5;
            } else {
                if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionMakeConnection.disconnect();
                if (this.f92349n && responseCode == 302) {
                    i3 = i5;
                } else {
                    bArr2 = null;
                    i3 = 1;
                }
                urlHandleRedirect = handleRedirect(url2, headerField, xh3Var);
            }
            i2 = i4;
            j = j4;
            j2 = j5;
        }
        return httpURLConnectionMakeConnection;
    }

    private int readInternal(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f92355t;
        if (j != -1) {
            long j2 = j - this.f92356u;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int i3 = ((InputStream) t0i.castNonNull(this.f92352q)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.f92356u += (long) i3;
        m24714b(i3);
        return i3;
    }

    private void skipFully(long j, xh3 xh3Var) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int i = ((InputStream) t0i.castNonNull(this.f92352q)).read(bArr, 0, (int) Math.min(j, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new dn7.C4880d(new InterruptedIOException(), xh3Var, 2000, 1);
            }
            if (i == -1) {
                throw new dn7.C4880d(xh3Var, 2008, 1);
            }
            j -= (long) i;
            m24714b(i);
        }
    }

    @Override // p000.dn7
    @ovh
    public void clearAllRequestProperties() {
        this.f92347l.clear();
    }

    @Override // p000.dn7
    @ovh
    public void clearRequestProperty(String str) {
        v80.checkNotNull(str);
        this.f92347l.remove(str);
    }

    @Override // p000.gh3
    @ovh
    public void close() throws dn7.C4880d {
        try {
            InputStream inputStream = this.f92352q;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new dn7.C4880d(e, (xh3) t0i.castNonNull(this.f92350o), 2000, 3);
                }
            }
        } finally {
            this.f92352q = null;
            closeConnectionQuietly();
            if (this.f92353r) {
                this.f92353r = false;
                m24715c();
            }
            this.f92351p = null;
            this.f92350o = null;
        }
    }

    @fdi
    /* JADX INFO: renamed from: f */
    public HttpURLConnection m24206f(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // p000.dn7
    @ovh
    public int getResponseCode() {
        int i;
        if (this.f92351p == null || (i = this.f92354s) <= 0) {
            return -1;
        }
        return i;
    }

    @Override // p000.gh3
    @ovh
    public Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f92351p;
        return httpURLConnection == null ? ox7.m19076of() : new C14272c(httpURLConnection.getHeaderFields());
    }

    @Override // p000.gh3
    @hib
    @ovh
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f92351p;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        xh3 xh3Var = this.f92350o;
        if (xh3Var != null) {
            return xh3Var.f97800a;
        }
        return null;
    }

    @Override // p000.gh3
    @ovh
    public long open(xh3 xh3Var) throws dn7.C4880d {
        byte[] byteArray;
        this.f92350o = xh3Var;
        long j = 0;
        this.f92356u = 0L;
        this.f92355t = 0L;
        m24716d(xh3Var);
        try {
            HttpURLConnection httpURLConnectionMakeConnection = makeConnection(xh3Var);
            this.f92351p = httpURLConnectionMakeConnection;
            this.f92354s = httpURLConnectionMakeConnection.getResponseCode();
            String responseMessage = httpURLConnectionMakeConnection.getResponseMessage();
            int i = this.f92354s;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionMakeConnection.getHeaderFields();
                if (this.f92354s == 416) {
                    if (xh3Var.f97806g == wo7.getDocumentSize(httpURLConnectionMakeConnection.getHeaderField("Content-Range"))) {
                        this.f92353r = true;
                        m24717e(xh3Var);
                        long j2 = xh3Var.f97807h;
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionMakeConnection.getErrorStream();
                try {
                    byteArray = errorStream != null ? tj1.toByteArray(errorStream) : t0i.f83321f;
                } catch (IOException unused) {
                    byteArray = t0i.f83321f;
                }
                byte[] bArr = byteArray;
                closeConnectionQuietly();
                throw new dn7.C4882f(this.f92354s, responseMessage, this.f92354s == 416 ? new sh3(2008) : null, headerFields, xh3Var, bArr);
            }
            String contentType = httpURLConnectionMakeConnection.getContentType();
            l8d<String> l8dVar = this.f92348m;
            if (l8dVar != null && !l8dVar.apply(contentType)) {
                closeConnectionQuietly();
                throw new dn7.C4881e(contentType, xh3Var);
            }
            if (this.f92354s == 200) {
                long j3 = xh3Var.f97806g;
                if (j3 != 0) {
                    j = j3;
                }
            }
            boolean zIsCompressed = isCompressed(httpURLConnectionMakeConnection);
            if (zIsCompressed) {
                this.f92355t = xh3Var.f97807h;
            } else {
                long j4 = xh3Var.f97807h;
                if (j4 != -1) {
                    this.f92355t = j4;
                } else {
                    long contentLength = wo7.getContentLength(httpURLConnectionMakeConnection.getHeaderField("Content-Length"), httpURLConnectionMakeConnection.getHeaderField("Content-Range"));
                    this.f92355t = contentLength != -1 ? contentLength - j : -1L;
                }
            }
            try {
                this.f92352q = httpURLConnectionMakeConnection.getInputStream();
                if (zIsCompressed) {
                    this.f92352q = new GZIPInputStream(this.f92352q);
                }
                this.f92353r = true;
                m24717e(xh3Var);
                try {
                    skipFully(j, xh3Var);
                    return this.f92355t;
                } catch (IOException e) {
                    closeConnectionQuietly();
                    if (e instanceof dn7.C4880d) {
                        throw ((dn7.C4880d) e);
                    }
                    throw new dn7.C4880d(e, xh3Var, 2000, 1);
                }
            } catch (IOException e2) {
                closeConnectionQuietly();
                throw new dn7.C4880d(e2, xh3Var, 2000, 1);
            }
        } catch (IOException e3) {
            closeConnectionQuietly();
            throw dn7.C4880d.createForIOException(e3, xh3Var, 1);
        }
    }

    @Override // p000.bh3
    @ovh
    public int read(byte[] bArr, int i, int i2) throws dn7.C4880d {
        try {
            return readInternal(bArr, i, i2);
        } catch (IOException e) {
            throw dn7.C4880d.createForIOException(e, (xh3) t0i.castNonNull(this.f92350o), 2);
        }
    }

    @Override // p000.dn7
    @ovh
    public void setRequestProperty(String str, String str2) {
        v80.checkNotNull(str);
        v80.checkNotNull(str2);
        this.f92347l.set(str, str2);
    }

    private vv3(@hib String str, int i, int i2, boolean z, boolean z2, @hib dn7.C4883g c4883g, @hib l8d<String> l8dVar, boolean z3) {
        super(true);
        this.f92345j = str;
        this.f92343h = i;
        this.f92344i = i2;
        this.f92341f = z;
        this.f92342g = z2;
        if (z && z2) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.f92346k = c4883g;
        this.f92348m = l8dVar;
        this.f92347l = new dn7.C4883g();
        this.f92349n = z3;
    }

    private HttpURLConnection makeConnection(URL url, int i, @hib byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionM24206f = m24206f(url);
        httpURLConnectionM24206f.setConnectTimeout(this.f92343h);
        httpURLConnectionM24206f.setReadTimeout(this.f92344i);
        HashMap map2 = new HashMap();
        dn7.C4883g c4883g = this.f92346k;
        if (c4883g != null) {
            map2.putAll(c4883g.getSnapshot());
        }
        map2.putAll(this.f92347l.getSnapshot());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionM24206f.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strBuildRangeRequestHeader = wo7.buildRangeRequestHeader(j, j2);
        if (strBuildRangeRequestHeader != null) {
            httpURLConnectionM24206f.setRequestProperty("Range", strBuildRangeRequestHeader);
        }
        String str = this.f92345j;
        if (str != null) {
            httpURLConnectionM24206f.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionM24206f.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnectionM24206f.setInstanceFollowRedirects(z2);
        httpURLConnectionM24206f.setDoOutput(bArr != null);
        httpURLConnectionM24206f.setRequestMethod(xh3.getStringForHttpMethod(i));
        if (bArr != null) {
            httpURLConnectionM24206f.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionM24206f.connect();
            OutputStream outputStream = httpURLConnectionM24206f.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionM24206f.connect();
        }
        return httpURLConnectionM24206f;
    }
}
