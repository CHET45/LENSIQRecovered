package p000;

import android.net.Uri;
import android.net.http.HttpEngine;
import android.net.http.HttpException;
import android.net.http.UrlRequest;
import android.net.http.UrlRequest$Callback;
import android.net.http.UrlRequest$StatusListener;
import android.net.http.UrlResponseInfo;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p000.dn7;

/* JADX INFO: loaded from: classes3.dex */
@ovh
@e5e(extension = 31, version = 7)
public final class un7 extends wq0 implements dn7 {

    /* JADX INFO: renamed from: C */
    @ovh
    public static final int f88554C = 8000;

    /* JADX INFO: renamed from: D */
    @ovh
    public static final int f88555D = 8000;

    /* JADX INFO: renamed from: E */
    public static final int f88556E = 32768;

    /* JADX INFO: renamed from: A */
    public boolean f88557A;

    /* JADX INFO: renamed from: B */
    public volatile long f88558B;

    /* JADX INFO: renamed from: f */
    public final HttpEngine f88559f;

    /* JADX INFO: renamed from: g */
    public final Executor f88560g;

    /* JADX INFO: renamed from: h */
    public final int f88561h;

    /* JADX INFO: renamed from: i */
    public final int f88562i;

    /* JADX INFO: renamed from: j */
    public final int f88563j;

    /* JADX INFO: renamed from: k */
    public final boolean f88564k;

    /* JADX INFO: renamed from: l */
    public final boolean f88565l;

    /* JADX INFO: renamed from: m */
    @hib
    public final String f88566m;

    /* JADX INFO: renamed from: n */
    @hib
    public final dn7.C4883g f88567n;

    /* JADX INFO: renamed from: o */
    public final dn7.C4883g f88568o;

    /* JADX INFO: renamed from: p */
    public final yp2 f88569p;

    /* JADX INFO: renamed from: q */
    public final j52 f88570q;

    /* JADX INFO: renamed from: r */
    @hib
    public l8d<String> f88571r;

    /* JADX INFO: renamed from: s */
    public final boolean f88572s;

    /* JADX INFO: renamed from: t */
    public boolean f88573t;

    /* JADX INFO: renamed from: u */
    public long f88574u;

    /* JADX INFO: renamed from: v */
    @hib
    public xh3 f88575v;

    /* JADX INFO: renamed from: w */
    @hib
    public C13610d f88576w;

    /* JADX INFO: renamed from: x */
    @hib
    public ByteBuffer f88577x;

    /* JADX INFO: renamed from: y */
    @hib
    public UrlResponseInfo f88578y;

    /* JADX INFO: renamed from: z */
    @hib
    public IOException f88579z;

    /* JADX INFO: renamed from: un7$a */
    public static final class C13607a implements dn7.InterfaceC4879c {

        /* JADX INFO: renamed from: a */
        public final HttpEngine f88580a;

        /* JADX INFO: renamed from: b */
        public final Executor f88581b;

        /* JADX INFO: renamed from: d */
        @hib
        public l8d<String> f88583d;

        /* JADX INFO: renamed from: e */
        @hib
        public qdh f88584e;

        /* JADX INFO: renamed from: f */
        @hib
        public String f88585f;

        /* JADX INFO: renamed from: j */
        public boolean f88589j;

        /* JADX INFO: renamed from: k */
        public boolean f88590k;

        /* JADX INFO: renamed from: l */
        public boolean f88591l;

        /* JADX INFO: renamed from: c */
        public final dn7.C4883g f88582c = new dn7.C4883g();

        /* JADX INFO: renamed from: g */
        public int f88586g = 3;

        /* JADX INFO: renamed from: h */
        public int f88587h = 8000;

        /* JADX INFO: renamed from: i */
        public int f88588i = 8000;

        public C13607a(HttpEngine httpEngine, Executor executor) {
            this.f88580a = on7.m18784a(v80.checkNotNull(httpEngine));
            this.f88581b = executor;
        }

        @op1
        @ovh
        public C13607a setConnectionTimeoutMs(int i) {
            this.f88587h = i;
            return this;
        }

        @op1
        @ovh
        public C13607a setContentTypePredicate(@hib l8d<String> l8dVar) {
            this.f88583d = l8dVar;
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
        public C13607a setHandleSetCookieRequests(boolean z) {
            this.f88590k = z;
            return this;
        }

        @op1
        @ovh
        public C13607a setKeepPostFor302Redirects(boolean z) {
            this.f88591l = z;
            return this;
        }

        @op1
        @ovh
        public C13607a setReadTimeoutMs(int i) {
            this.f88588i = i;
            return this;
        }

        @op1
        @ovh
        public C13607a setRequestPriority(int i) {
            this.f88586g = i;
            return this;
        }

        @op1
        @ovh
        public C13607a setResetTimeoutOnRedirects(boolean z) {
            this.f88589j = z;
            return this;
        }

        @op1
        @ovh
        public C13607a setTransferListener(@hib qdh qdhVar) {
            this.f88584e = qdhVar;
            return this;
        }

        @op1
        public C13607a setUserAgent(@hib String str) {
            this.f88585f = str;
            return this;
        }

        @Override // p000.dn7.InterfaceC4879c, p000.gh3.InterfaceC6313a
        @ovh
        public dn7 createDataSource() {
            un7 un7Var = new un7(this.f88580a, this.f88581b, this.f88586g, this.f88587h, this.f88588i, this.f88589j, this.f88590k, this.f88585f, this.f88582c, this.f88583d, this.f88591l);
            qdh qdhVar = this.f88584e;
            if (qdhVar != null) {
                un7Var.addTransferListener(qdhVar);
            }
            return un7Var;
        }

        @Override // p000.dn7.InterfaceC4879c
        @op1
        @ovh
        public final C13607a setDefaultRequestProperties(Map<String, String> map) {
            this.f88582c.clearAndSet(map);
            return this;
        }
    }

    /* JADX INFO: renamed from: un7$c */
    public final class C13609c implements UrlRequest$Callback {

        /* JADX INFO: renamed from: a */
        public volatile boolean f88593a = false;

        public C13609c() {
        }

        public void close() {
            this.f88593a = true;
        }

        public synchronized void onCanceled(UrlRequest urlRequest, @hib UrlResponseInfo urlResponseInfo) {
        }

        public synchronized void onFailed(UrlRequest urlRequest, @hib UrlResponseInfo urlResponseInfo, HttpException httpException) {
            try {
                if (this.f88593a) {
                    return;
                }
                if (vn7.m24078a(httpException) && wn7.m24672a(httpException).getErrorCode() == 1) {
                    un7.this.f88579z = new UnknownHostException();
                } else {
                    un7.this.f88579z = httpException;
                }
                un7.this.f88569p.open();
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
            if (this.f88593a) {
                return;
            }
            un7.this.f88569p.open();
        }

        public synchronized void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            if (this.f88593a) {
                return;
            }
            xh3 xh3Var = (xh3) v80.checkNotNull(un7.this.f88575v);
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            if (xh3Var.f97802c == 2 && (httpStatusCode == 307 || httpStatusCode == 308)) {
                un7.this.f88579z = new dn7.C4882f(httpStatusCode, urlResponseInfo.getHttpStatusText(), null, urlResponseInfo.getHeaders().getAsMap(), xh3Var, t0i.f83321f);
                un7.this.f88569p.open();
                return;
            }
            if (un7.this.f88564k) {
                un7.this.resetConnectTimeout();
            }
            CookieHandler cookieManager = CookieHandler.getDefault();
            if (cookieManager == null && un7.this.f88565l) {
                cookieManager = new CookieManager();
            }
            String url = urlResponseInfo.getUrl();
            Map asMap = urlResponseInfo.getHeaders().getAsMap();
            wo7.storeCookiesFromHeaders(url, asMap, cookieManager);
            String cookieHeader = wo7.getCookieHeader(url, asMap, cookieManager);
            boolean z = un7.this.f88572s && xh3Var.f97802c == 2 && httpStatusCode == 302;
            if (!z && (!un7.this.f88565l || TextUtils.isEmpty(cookieHeader))) {
                urlRequest.followRedirect();
                return;
            }
            urlRequest.cancel();
            xh3 xh3VarWithUri = (z || xh3Var.f97802c != 2) ? xh3Var.withUri(Uri.parse(str)) : xh3Var.buildUpon().setUri(str).setHttpMethod(1).setHttpBody(null).build();
            if (!TextUtils.isEmpty(cookieHeader)) {
                HashMap map = new HashMap();
                map.putAll(xh3Var.f97804e);
                map.put(go7.f40565p, cookieHeader);
                xh3VarWithUri = xh3VarWithUri.buildUpon().setHttpRequestHeaders(map).build();
            }
            try {
                C13610d c13610dBuildRequestWrapper = un7.this.buildRequestWrapper(xh3VarWithUri);
                if (un7.this.f88576w != null) {
                    un7.this.f88576w.close();
                }
                un7.this.f88576w = c13610dBuildRequestWrapper;
                un7.this.f88576w.start();
            } catch (IOException e) {
                un7.this.f88579z = e;
            }
        }

        public synchronized void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            if (this.f88593a) {
                return;
            }
            wo7.storeCookiesFromHeaders(urlResponseInfo.getUrl(), urlResponseInfo.getHeaders().getAsMap(), CookieHandler.getDefault());
            un7.this.f88578y = urlResponseInfo;
            un7.this.f88569p.open();
        }

        public synchronized void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            if (this.f88593a) {
                return;
            }
            un7.this.f88557A = true;
            un7.this.f88569p.open();
        }
    }

    /* JADX INFO: renamed from: un7$d */
    public static final class C13610d {

        /* JADX INFO: renamed from: a */
        public final UrlRequest f88595a;

        /* JADX INFO: renamed from: b */
        public final C13609c f88596b;

        /* JADX INFO: renamed from: un7$d$a */
        public class a implements UrlRequest$StatusListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int[] f88597a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ yp2 f88598b;

            public a(int[] iArr, yp2 yp2Var) {
                this.f88597a = iArr;
                this.f88598b = yp2Var;
            }

            public void onStatus(int i) {
                this.f88597a[0] = i;
                this.f88598b.open();
            }
        }

        public C13610d(UrlRequest urlRequest, C13609c c13609c) {
            this.f88595a = urlRequest;
            this.f88596b = c13609c;
        }

        public void close() {
            this.f88596b.close();
            this.f88595a.cancel();
        }

        public int getStatus() throws InterruptedException {
            yp2 yp2Var = new yp2();
            int[] iArr = new int[1];
            this.f88595a.getStatus(new a(iArr, yp2Var));
            yp2Var.block();
            return iArr[0];
        }

        public C13609c getUrlRequestCallback() {
            return this.f88596b;
        }

        public void read(ByteBuffer byteBuffer) {
            this.f88595a.read(byteBuffer);
        }

        public void start() {
            this.f88595a.start();
        }
    }

    @ovh
    public un7(HttpEngine httpEngine, Executor executor, int i, int i2, int i3, boolean z, boolean z2, @hib String str, @hib dn7.C4883g c4883g, @hib l8d<String> l8dVar, boolean z3) {
        super(true);
        this.f88559f = on7.m18784a(v80.checkNotNull(httpEngine));
        this.f88560g = (Executor) v80.checkNotNull(executor);
        this.f88561h = i;
        this.f88562i = i2;
        this.f88563j = i3;
        this.f88564k = z;
        this.f88565l = z2;
        this.f88566m = str;
        this.f88567n = c4883g;
        this.f88571r = l8dVar;
        this.f88572s = z3;
        this.f88570q = j52.f49539a;
        this.f88568o = new dn7.C4883g();
        this.f88569p = new yp2();
    }

    private boolean blockUntilConnectTimeout() throws InterruptedException {
        long jElapsedRealtime = this.f88570q.elapsedRealtime();
        boolean zBlock = false;
        while (!zBlock && jElapsedRealtime < this.f88558B) {
            zBlock = this.f88569p.block((this.f88558B - jElapsedRealtime) + 5);
            jElapsedRealtime = this.f88570q.elapsedRealtime();
        }
        return zBlock;
    }

    private UrlRequest.Builder buildRequestBuilder(xh3 xh3Var, UrlRequest$Callback urlRequest$Callback) throws IOException {
        UrlRequest.Builder directExecutorAllowed = this.f88559f.newUrlRequestBuilder(xh3Var.f97800a.toString(), this.f88560g, urlRequest$Callback).setPriority(this.f88561h).setDirectExecutorAllowed(true);
        HashMap map = new HashMap();
        dn7.C4883g c4883g = this.f88567n;
        if (c4883g != null) {
            map.putAll(c4883g.getSnapshot());
        }
        map.putAll(this.f88568o.getSnapshot());
        map.putAll(xh3Var.f97804e);
        for (Map.Entry entry : map.entrySet()) {
            directExecutorAllowed.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (xh3Var.f97803d != null && !map.containsKey("Content-Type")) {
            throw new C13608b("HTTP request with non-empty body must set Content-Type", xh3Var, 1004, 0);
        }
        String strBuildRangeRequestHeader = wo7.buildRangeRequestHeader(xh3Var.f97806g, xh3Var.f97807h);
        if (strBuildRangeRequestHeader != null) {
            directExecutorAllowed.addHeader("Range", strBuildRangeRequestHeader);
        }
        String str = this.f88566m;
        if (str != null) {
            directExecutorAllowed.addHeader("User-Agent", str);
        }
        directExecutorAllowed.setHttpMethod(xh3Var.getHttpMethodString());
        if (xh3Var.f97803d != null) {
            directExecutorAllowed.setUploadDataProvider(new pi1(xh3Var.f97803d), this.f88560g);
        }
        return directExecutorAllowed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C13610d buildRequestWrapper(xh3 xh3Var) throws IOException {
        C13609c c13609c = new C13609c();
        return new C13610d(buildRequestBuilder(xh3Var, c13609c).build(), c13609c);
    }

    private static int copyByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer2.put(byteBuffer);
        byteBuffer.limit(iLimit);
        return iMin;
    }

    @hib
    private static String getFirstHeader(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private ByteBuffer getOrCreateReadBuffer() {
        if (this.f88577x == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32768);
            this.f88577x = byteBufferAllocateDirect;
            byteBufferAllocateDirect.limit(0);
        }
        return this.f88577x;
    }

    private static boolean isCompressed(UrlResponseInfo urlResponseInfo) {
        Iterator it = urlResponseInfo.getHeaders().getAsList().iterator();
        while (it.hasNext()) {
            if (((String) ((Map.Entry) it.next()).getKey()).equalsIgnoreCase("Content-Encoding")) {
                return !((String) r0.getValue()).equalsIgnoreCase("identity");
            }
        }
        return false;
    }

    private void readInternal(ByteBuffer byteBuffer, xh3 xh3Var) throws dn7.C4880d {
        ((C13610d) t0i.castNonNull(this.f88576w)).read(byteBuffer);
        try {
            if (!this.f88569p.block(this.f88563j)) {
                throw new SocketTimeoutException();
            }
        } catch (InterruptedException unused) {
            if (byteBuffer == this.f88577x) {
                this.f88577x = null;
            }
            Thread.currentThread().interrupt();
            this.f88579z = new InterruptedIOException();
        } catch (SocketTimeoutException e) {
            if (byteBuffer == this.f88577x) {
                this.f88577x = null;
            }
            this.f88579z = new dn7.C4880d(e, xh3Var, 2002, 2);
        }
        IOException iOException = this.f88579z;
        if (iOException != null) {
            if (!(iOException instanceof dn7.C4880d)) {
                throw dn7.C4880d.createForIOException(iOException, xh3Var, 2);
            }
            throw ((dn7.C4880d) iOException);
        }
    }

    private byte[] readResponseBody() throws IOException {
        byte[] bArrCopyOf = t0i.f83321f;
        ByteBuffer orCreateReadBuffer = getOrCreateReadBuffer();
        while (!this.f88557A) {
            this.f88569p.close();
            orCreateReadBuffer.clear();
            readInternal(orCreateReadBuffer, (xh3) t0i.castNonNull(this.f88575v));
            orCreateReadBuffer.flip();
            if (orCreateReadBuffer.remaining() > 0) {
                int length = bArrCopyOf.length;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + orCreateReadBuffer.remaining());
                orCreateReadBuffer.get(bArrCopyOf, length, orCreateReadBuffer.remaining());
            }
        }
        return bArrCopyOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetConnectTimeout() {
        this.f88558B = this.f88570q.elapsedRealtime() + ((long) this.f88562i);
    }

    private void skipFully(long j, xh3 xh3Var) throws dn7.C4880d {
        if (j == 0) {
            return;
        }
        ByteBuffer orCreateReadBuffer = getOrCreateReadBuffer();
        while (j > 0) {
            try {
                this.f88569p.close();
                orCreateReadBuffer.clear();
                readInternal(orCreateReadBuffer, xh3Var);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (this.f88557A) {
                    throw new C13608b(xh3Var, 2008, 14);
                }
                orCreateReadBuffer.flip();
                v80.checkState(orCreateReadBuffer.hasRemaining());
                int iMin = (int) Math.min(orCreateReadBuffer.remaining(), j);
                orCreateReadBuffer.position(orCreateReadBuffer.position() + iMin);
                j -= (long) iMin;
            } catch (IOException e) {
                if (e instanceof dn7.C4880d) {
                    throw ((dn7.C4880d) e);
                }
                throw new C13608b(e, xh3Var, e instanceof SocketTimeoutException ? 2002 : 2001, 14);
            }
        }
    }

    @Override // p000.dn7
    @ovh
    public void clearAllRequestProperties() {
        this.f88568o.clear();
    }

    @Override // p000.dn7
    @ovh
    public void clearRequestProperty(String str) {
        this.f88568o.remove(str);
    }

    @Override // p000.gh3
    @ovh
    public synchronized void close() {
        try {
            C13610d c13610d = this.f88576w;
            if (c13610d != null) {
                c13610d.close();
                this.f88576w = null;
            }
            ByteBuffer byteBuffer = this.f88577x;
            if (byteBuffer != null) {
                byteBuffer.limit(0);
            }
            this.f88575v = null;
            this.f88578y = null;
            this.f88579z = null;
            this.f88557A = false;
            if (this.f88573t) {
                this.f88573t = false;
                m24715c();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.dn7
    @ovh
    public int getResponseCode() {
        UrlResponseInfo urlResponseInfo = this.f88578y;
        if (urlResponseInfo == null || urlResponseInfo.getHttpStatusCode() <= 0) {
            return -1;
        }
        return this.f88578y.getHttpStatusCode();
    }

    @Override // p000.gh3
    @ovh
    public Map<String, List<String>> getResponseHeaders() {
        UrlResponseInfo urlResponseInfo = this.f88578y;
        return urlResponseInfo == null ? Collections.emptyMap() : urlResponseInfo.getHeaders().getAsMap();
    }

    @Override // p000.gh3
    @hib
    @ovh
    public Uri getUri() {
        UrlResponseInfo urlResponseInfo = this.f88578y;
        if (urlResponseInfo != null) {
            return Uri.parse(urlResponseInfo.getUrl());
        }
        xh3 xh3Var = this.f88575v;
        if (xh3Var != null) {
            return xh3Var.f97800a;
        }
        return null;
    }

    @Override // p000.gh3
    @ovh
    public long open(xh3 xh3Var) throws dn7.C4880d {
        byte[] responseBody;
        String firstHeader;
        v80.checkNotNull(xh3Var);
        v80.checkState(!this.f88573t);
        this.f88569p.close();
        resetConnectTimeout();
        this.f88575v = xh3Var;
        try {
            C13610d c13610dBuildRequestWrapper = buildRequestWrapper(xh3Var);
            this.f88576w = c13610dBuildRequestWrapper;
            c13610dBuildRequestWrapper.start();
            m24716d(xh3Var);
            try {
                boolean zBlockUntilConnectTimeout = blockUntilConnectTimeout();
                IOException iOException = this.f88579z;
                if (iOException != null) {
                    String message = iOException.getMessage();
                    if (message == null || !i80.toLowerCase(message).contains("err_cleartext_not_permitted")) {
                        throw new C13608b(iOException, xh3Var, 2001, c13610dBuildRequestWrapper.getStatus());
                    }
                    throw new dn7.C4878b(iOException, xh3Var);
                }
                if (!zBlockUntilConnectTimeout) {
                    throw new C13608b(new SocketTimeoutException(), xh3Var, 2002, c13610dBuildRequestWrapper.getStatus());
                }
                UrlResponseInfo urlResponseInfoM14186a = jn7.m14186a(v80.checkNotNull(this.f88578y));
                int httpStatusCode = urlResponseInfoM14186a.getHttpStatusCode();
                Map asMap = urlResponseInfoM14186a.getHeaders().getAsMap();
                long j = 0;
                if (httpStatusCode < 200 || httpStatusCode > 299) {
                    if (httpStatusCode == 416) {
                        if (xh3Var.f97806g == wo7.getDocumentSize(getFirstHeader(asMap, "Content-Range"))) {
                            this.f88573t = true;
                            m24717e(xh3Var);
                            long j2 = xh3Var.f97807h;
                            if (j2 != -1) {
                                return j2;
                            }
                            return 0L;
                        }
                    }
                    try {
                        responseBody = readResponseBody();
                    } catch (IOException unused) {
                        responseBody = t0i.f83321f;
                    }
                    throw new dn7.C4882f(httpStatusCode, urlResponseInfoM14186a.getHttpStatusText(), httpStatusCode == 416 ? new sh3(2008) : null, asMap, xh3Var, responseBody);
                }
                l8d<String> l8dVar = this.f88571r;
                if (l8dVar != null && (firstHeader = getFirstHeader(asMap, "Content-Type")) != null && !l8dVar.apply(firstHeader)) {
                    throw new dn7.C4881e(firstHeader, xh3Var);
                }
                if (httpStatusCode == 200) {
                    long j3 = xh3Var.f97806g;
                    if (j3 != 0) {
                        j = j3;
                    }
                }
                if (isCompressed(urlResponseInfoM14186a)) {
                    this.f88574u = xh3Var.f97807h;
                } else {
                    long j4 = xh3Var.f97807h;
                    if (j4 != -1) {
                        this.f88574u = j4;
                    } else {
                        long contentLength = wo7.getContentLength(getFirstHeader(asMap, "Content-Length"), getFirstHeader(asMap, "Content-Range"));
                        this.f88574u = contentLength != -1 ? contentLength - j : -1L;
                    }
                }
                this.f88573t = true;
                m24717e(xh3Var);
                skipFully(j, xh3Var);
                return this.f88574u;
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                throw new C13608b(new InterruptedIOException(), xh3Var, 1004, -1);
            }
        } catch (IOException e) {
            if (e instanceof dn7.C4880d) {
                throw ((dn7.C4880d) e);
            }
            throw new C13608b(e, xh3Var, 2000, 0);
        }
    }

    @hib
    @ovh
    @fdi
    /* JADX INFO: renamed from: r */
    public C13609c m23461r() {
        C13610d c13610d = this.f88576w;
        if (c13610d == null) {
            return null;
        }
        return c13610d.getUrlRequestCallback();
    }

    @Override // p000.bh3
    @ovh
    public int read(byte[] bArr, int i, int i2) throws dn7.C4880d {
        v80.checkState(this.f88573t);
        if (i2 == 0) {
            return 0;
        }
        if (this.f88574u == 0) {
            return -1;
        }
        ByteBuffer orCreateReadBuffer = getOrCreateReadBuffer();
        if (!orCreateReadBuffer.hasRemaining()) {
            this.f88569p.close();
            orCreateReadBuffer.clear();
            readInternal(orCreateReadBuffer, (xh3) t0i.castNonNull(this.f88575v));
            if (this.f88557A) {
                this.f88574u = 0L;
                return -1;
            }
            orCreateReadBuffer.flip();
            v80.checkState(orCreateReadBuffer.hasRemaining());
        }
        long j = this.f88574u;
        if (j == -1) {
            j = Long.MAX_VALUE;
        }
        int iMin = (int) im9.min(j, orCreateReadBuffer.remaining(), i2);
        orCreateReadBuffer.get(bArr, i, iMin);
        long j2 = this.f88574u;
        if (j2 != -1) {
            this.f88574u = j2 - ((long) iMin);
        }
        m24714b(iMin);
        return iMin;
    }

    @Override // p000.dn7
    @ovh
    public void setRequestProperty(String str, String str2) {
        this.f88568o.set(str, str2);
    }

    /* JADX INFO: renamed from: un7$b */
    @ovh
    public static final class C13608b extends dn7.C4880d {

        /* JADX INFO: renamed from: C */
        public final int f88592C;

        public C13608b(IOException iOException, xh3 xh3Var, int i, int i2) {
            super(iOException, xh3Var, i, 1);
            this.f88592C = i2;
        }

        public C13608b(String str, xh3 xh3Var, int i, int i2) {
            super(str, xh3Var, i, 1);
            this.f88592C = i2;
        }

        public C13608b(xh3 xh3Var, int i, int i2) {
            super(xh3Var, i, 1);
            this.f88592C = i2;
        }
    }

    @ovh
    public int read(ByteBuffer byteBuffer) throws dn7.C4880d {
        int iCopyByteBuffer;
        v80.checkState(this.f88573t);
        if (byteBuffer.isDirect()) {
            if (!byteBuffer.hasRemaining()) {
                return 0;
            }
            if (this.f88574u == 0) {
                return -1;
            }
            int iRemaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = this.f88577x;
            if (byteBuffer2 != null && (iCopyByteBuffer = copyByteBuffer(byteBuffer2, byteBuffer)) != 0) {
                long j = this.f88574u;
                if (j != -1) {
                    this.f88574u = j - ((long) iCopyByteBuffer);
                }
                m24714b(iCopyByteBuffer);
                return iCopyByteBuffer;
            }
            this.f88569p.close();
            readInternal(byteBuffer, (xh3) t0i.castNonNull(this.f88575v));
            if (this.f88557A) {
                this.f88574u = 0L;
                return -1;
            }
            v80.checkState(iRemaining > byteBuffer.remaining());
            int iRemaining2 = iRemaining - byteBuffer.remaining();
            long j2 = this.f88574u;
            if (j2 != -1) {
                this.f88574u = j2 - ((long) iRemaining2);
            }
            m24714b(iRemaining2);
            return iRemaining2;
        }
        throw new IllegalArgumentException("Passed buffer is not a direct ByteBuffer");
    }
}
