package p000;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p000.cl1;
import p000.eh3;
import p000.gh3;
import p000.jl1;
import p000.ns5;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ll1 implements gh3 {

    /* JADX INFO: renamed from: A */
    public static final int f58034A = 0;

    /* JADX INFO: renamed from: B */
    public static final int f58035B = 1;

    /* JADX INFO: renamed from: C */
    public static final long f58036C = 102400;

    /* JADX INFO: renamed from: w */
    public static final int f58037w = 1;

    /* JADX INFO: renamed from: x */
    public static final int f58038x = 2;

    /* JADX INFO: renamed from: y */
    public static final int f58039y = 4;

    /* JADX INFO: renamed from: z */
    public static final int f58040z = -1;

    /* JADX INFO: renamed from: b */
    public final cl1 f58041b;

    /* JADX INFO: renamed from: c */
    public final gh3 f58042c;

    /* JADX INFO: renamed from: d */
    @hib
    public final gh3 f58043d;

    /* JADX INFO: renamed from: e */
    public final gh3 f58044e;

    /* JADX INFO: renamed from: f */
    public final hm1 f58045f;

    /* JADX INFO: renamed from: g */
    @hib
    public final InterfaceC8877c f58046g;

    /* JADX INFO: renamed from: h */
    public final boolean f58047h;

    /* JADX INFO: renamed from: i */
    public final boolean f58048i;

    /* JADX INFO: renamed from: j */
    public final boolean f58049j;

    /* JADX INFO: renamed from: k */
    @hib
    public Uri f58050k;

    /* JADX INFO: renamed from: l */
    @hib
    public xh3 f58051l;

    /* JADX INFO: renamed from: m */
    @hib
    public xh3 f58052m;

    /* JADX INFO: renamed from: n */
    @hib
    public gh3 f58053n;

    /* JADX INFO: renamed from: o */
    public long f58054o;

    /* JADX INFO: renamed from: p */
    public long f58055p;

    /* JADX INFO: renamed from: q */
    public long f58056q;

    /* JADX INFO: renamed from: r */
    @hib
    public nm1 f58057r;

    /* JADX INFO: renamed from: s */
    public boolean f58058s;

    /* JADX INFO: renamed from: t */
    public boolean f58059t;

    /* JADX INFO: renamed from: u */
    public long f58060u;

    /* JADX INFO: renamed from: v */
    public long f58061v;

    /* JADX INFO: renamed from: ll1$b */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8876b {
    }

    /* JADX INFO: renamed from: ll1$c */
    public interface InterfaceC8877c {
        void onCacheIgnored(int i);

        void onCachedBytesRead(long j, long j2);
    }

    /* JADX INFO: renamed from: ll1$d */
    public static final class C8878d implements gh3.InterfaceC6313a {

        /* JADX INFO: renamed from: a */
        public cl1 f58062a;

        /* JADX INFO: renamed from: c */
        @hib
        public eh3.InterfaceC5299a f58064c;

        /* JADX INFO: renamed from: e */
        public boolean f58066e;

        /* JADX INFO: renamed from: f */
        @hib
        public gh3.InterfaceC6313a f58067f;

        /* JADX INFO: renamed from: g */
        @hib
        public icd f58068g;

        /* JADX INFO: renamed from: h */
        public int f58069h;

        /* JADX INFO: renamed from: i */
        public int f58070i;

        /* JADX INFO: renamed from: j */
        @hib
        public InterfaceC8877c f58071j;

        /* JADX INFO: renamed from: b */
        public gh3.InterfaceC6313a f58063b = new ns5.C10038a();

        /* JADX INFO: renamed from: d */
        public hm1 f58065d = hm1.f44102a;

        private ll1 createDataSourceInternal(@hib gh3 gh3Var, int i, int i2) {
            eh3 eh3VarCreateDataSink;
            cl1 cl1Var = (cl1) v80.checkNotNull(this.f58062a);
            if (this.f58066e || gh3Var == null) {
                eh3VarCreateDataSink = null;
            } else {
                eh3.InterfaceC5299a interfaceC5299a = this.f58064c;
                eh3VarCreateDataSink = interfaceC5299a != null ? interfaceC5299a.createDataSink() : new jl1.C7969b().setCache(cl1Var).createDataSink();
            }
            return new ll1(cl1Var, gh3Var, this.f58063b.createDataSource(), eh3VarCreateDataSink, this.f58065d, i, this.f58068g, i2, this.f58071j);
        }

        public ll1 createDataSourceForDownloading() {
            gh3.InterfaceC6313a interfaceC6313a = this.f58067f;
            return createDataSourceInternal(interfaceC6313a != null ? interfaceC6313a.createDataSource() : null, this.f58070i | 1, -4000);
        }

        public ll1 createDataSourceForRemovingDownload() {
            return createDataSourceInternal(null, this.f58070i | 1, -4000);
        }

        @hib
        public cl1 getCache() {
            return this.f58062a;
        }

        public hm1 getCacheKeyFactory() {
            return this.f58065d;
        }

        @hib
        public icd getUpstreamPriorityTaskManager() {
            return this.f58068g;
        }

        @op1
        public C8878d setCache(cl1 cl1Var) {
            this.f58062a = cl1Var;
            return this;
        }

        @op1
        public C8878d setCacheKeyFactory(hm1 hm1Var) {
            this.f58065d = hm1Var;
            return this;
        }

        @op1
        public C8878d setCacheReadDataSourceFactory(gh3.InterfaceC6313a interfaceC6313a) {
            this.f58063b = interfaceC6313a;
            return this;
        }

        @op1
        public C8878d setCacheWriteDataSinkFactory(@hib eh3.InterfaceC5299a interfaceC5299a) {
            this.f58064c = interfaceC5299a;
            this.f58066e = interfaceC5299a == null;
            return this;
        }

        @op1
        public C8878d setEventListener(@hib InterfaceC8877c interfaceC8877c) {
            this.f58071j = interfaceC8877c;
            return this;
        }

        @op1
        public C8878d setFlags(int i) {
            this.f58070i = i;
            return this;
        }

        @op1
        public C8878d setUpstreamDataSourceFactory(@hib gh3.InterfaceC6313a interfaceC6313a) {
            this.f58067f = interfaceC6313a;
            return this;
        }

        @op1
        public C8878d setUpstreamPriority(int i) {
            this.f58069h = i;
            return this;
        }

        @op1
        public C8878d setUpstreamPriorityTaskManager(@hib icd icdVar) {
            this.f58068g = icdVar;
            return this;
        }

        @Override // p000.gh3.InterfaceC6313a
        public ll1 createDataSource() {
            gh3.InterfaceC6313a interfaceC6313a = this.f58067f;
            return createDataSourceInternal(interfaceC6313a != null ? interfaceC6313a.createDataSource() : null, this.f58070i, this.f58069h);
        }
    }

    /* JADX INFO: renamed from: ll1$e */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8879e {
    }

    private void closeCurrentSource() throws IOException {
        gh3 gh3Var = this.f58053n;
        if (gh3Var == null) {
            return;
        }
        try {
            gh3Var.close();
        } finally {
            this.f58052m = null;
            this.f58053n = null;
            nm1 nm1Var = this.f58057r;
            if (nm1Var != null) {
                this.f58041b.releaseHoleSpan(nm1Var);
                this.f58057r = null;
            }
        }
    }

    private static Uri getRedirectedUriOrDefault(cl1 cl1Var, String str, Uri uri) {
        Uri redirectedUri = pw2.getRedirectedUri(cl1Var.getContentMetadata(str));
        return redirectedUri != null ? redirectedUri : uri;
    }

    private void handleBeforeThrow(Throwable th) {
        if (isReadingFromCache() || (th instanceof cl1.C2374a)) {
            this.f58058s = true;
        }
    }

    private boolean isBypassingCache() {
        return this.f58053n == this.f58044e;
    }

    private boolean isReadingFromCache() {
        return this.f58053n == this.f58042c;
    }

    private boolean isReadingFromUpstream() {
        return !isReadingFromCache();
    }

    private boolean isWritingToCache() {
        return this.f58053n == this.f58043d;
    }

    private void notifyBytesRead() {
        InterfaceC8877c interfaceC8877c = this.f58046g;
        if (interfaceC8877c == null || this.f58060u <= 0) {
            return;
        }
        interfaceC8877c.onCachedBytesRead(this.f58041b.getCacheSpace(), this.f58060u);
        this.f58060u = 0L;
    }

    private void notifyCacheIgnored(int i) {
        InterfaceC8877c interfaceC8877c = this.f58046g;
        if (interfaceC8877c != null) {
            interfaceC8877c.onCacheIgnored(i);
        }
    }

    private void openNextSource(xh3 xh3Var, boolean z) throws IOException {
        nm1 nm1VarStartReadWrite;
        long jMin;
        xh3 xh3VarBuild;
        gh3 gh3Var;
        String str = (String) t0i.castNonNull(xh3Var.f97808i);
        if (this.f58059t) {
            nm1VarStartReadWrite = null;
        } else if (this.f58047h) {
            try {
                nm1VarStartReadWrite = this.f58041b.startReadWrite(str, this.f58055p, this.f58056q);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            nm1VarStartReadWrite = this.f58041b.startReadWriteNonBlocking(str, this.f58055p, this.f58056q);
        }
        if (nm1VarStartReadWrite == null) {
            gh3Var = this.f58044e;
            xh3VarBuild = xh3Var.buildUpon().setPosition(this.f58055p).setLength(this.f58056q).build();
        } else if (nm1VarStartReadWrite.f64972d) {
            Uri uriFromFile = Uri.fromFile((File) t0i.castNonNull(nm1VarStartReadWrite.f64973e));
            long j = nm1VarStartReadWrite.f64970b;
            long j2 = this.f58055p - j;
            long jMin2 = nm1VarStartReadWrite.f64971c - j2;
            long j3 = this.f58056q;
            if (j3 != -1) {
                jMin2 = Math.min(jMin2, j3);
            }
            xh3VarBuild = xh3Var.buildUpon().setUri(uriFromFile).setUriPositionOffset(j).setPosition(j2).setLength(jMin2).build();
            gh3Var = this.f58042c;
        } else {
            if (nm1VarStartReadWrite.isOpenEnded()) {
                jMin = this.f58056q;
            } else {
                jMin = nm1VarStartReadWrite.f64971c;
                long j4 = this.f58056q;
                if (j4 != -1) {
                    jMin = Math.min(jMin, j4);
                }
            }
            xh3VarBuild = xh3Var.buildUpon().setPosition(this.f58055p).setLength(jMin).build();
            gh3Var = this.f58043d;
            if (gh3Var == null) {
                gh3Var = this.f58044e;
                this.f58041b.releaseHoleSpan(nm1VarStartReadWrite);
                nm1VarStartReadWrite = null;
            }
        }
        this.f58061v = (this.f58059t || gh3Var != this.f58044e) ? Long.MAX_VALUE : this.f58055p + 102400;
        if (z) {
            v80.checkState(isBypassingCache());
            if (gh3Var == this.f58044e) {
                return;
            }
            try {
                closeCurrentSource();
            } finally {
            }
        }
        if (nm1VarStartReadWrite != null && nm1VarStartReadWrite.isHoleSpan()) {
            this.f58057r = nm1VarStartReadWrite;
        }
        this.f58053n = gh3Var;
        this.f58052m = xh3VarBuild;
        this.f58054o = 0L;
        long jOpen = gh3Var.open(xh3VarBuild);
        rw2 rw2Var = new rw2();
        if (xh3VarBuild.f97807h == -1 && jOpen != -1) {
            this.f58056q = jOpen;
            rw2.setContentLength(rw2Var, this.f58055p + jOpen);
        }
        if (isReadingFromUpstream()) {
            Uri uri = gh3Var.getUri();
            this.f58050k = uri;
            rw2.setRedirectedUri(rw2Var, xh3Var.f97800a.equals(uri) ? null : this.f58050k);
        }
        if (isWritingToCache()) {
            this.f58041b.applyContentMetadataMutations(str, rw2Var);
        }
    }

    private void setNoBytesRemainingAndMaybeStoreLength(String str) throws IOException {
        this.f58056q = 0L;
        if (isWritingToCache()) {
            rw2 rw2Var = new rw2();
            rw2.setContentLength(rw2Var, this.f58055p);
            this.f58041b.applyContentMetadataMutations(str, rw2Var);
        }
    }

    private int shouldIgnoreCacheForRequest(xh3 xh3Var) {
        if (this.f58048i && this.f58058s) {
            return 0;
        }
        return (this.f58049j && xh3Var.f97807h == -1) ? 1 : -1;
    }

    @Override // p000.gh3
    public void addTransferListener(qdh qdhVar) {
        v80.checkNotNull(qdhVar);
        this.f58042c.addTransferListener(qdhVar);
        this.f58044e.addTransferListener(qdhVar);
    }

    @Override // p000.gh3
    public void close() throws IOException {
        this.f58051l = null;
        this.f58050k = null;
        this.f58055p = 0L;
        notifyBytesRead();
        try {
            closeCurrentSource();
        } catch (Throwable th) {
            handleBeforeThrow(th);
            throw th;
        }
    }

    public cl1 getCache() {
        return this.f58041b;
    }

    public hm1 getCacheKeyFactory() {
        return this.f58045f;
    }

    @Override // p000.gh3
    public Map<String, List<String>> getResponseHeaders() {
        return isReadingFromUpstream() ? this.f58044e.getResponseHeaders() : Collections.emptyMap();
    }

    @Override // p000.gh3
    @hib
    public Uri getUri() {
        return this.f58050k;
    }

    @Override // p000.gh3
    public long open(xh3 xh3Var) throws IOException {
        try {
            String strBuildCacheKey = this.f58045f.buildCacheKey(xh3Var);
            xh3 xh3VarBuild = xh3Var.buildUpon().setKey(strBuildCacheKey).build();
            this.f58051l = xh3VarBuild;
            this.f58050k = getRedirectedUriOrDefault(this.f58041b, strBuildCacheKey, xh3VarBuild.f97800a);
            this.f58055p = xh3Var.f97806g;
            int iShouldIgnoreCacheForRequest = shouldIgnoreCacheForRequest(xh3Var);
            boolean z = iShouldIgnoreCacheForRequest != -1;
            this.f58059t = z;
            if (z) {
                notifyCacheIgnored(iShouldIgnoreCacheForRequest);
            }
            if (this.f58059t) {
                this.f58056q = -1L;
            } else {
                long contentLength = pw2.getContentLength(this.f58041b.getContentMetadata(strBuildCacheKey));
                this.f58056q = contentLength;
                if (contentLength != -1) {
                    long j = contentLength - xh3Var.f97806g;
                    this.f58056q = j;
                    if (j < 0) {
                        throw new sh3(2008);
                    }
                }
            }
            long jMin = xh3Var.f97807h;
            if (jMin != -1) {
                long j2 = this.f58056q;
                if (j2 != -1) {
                    jMin = Math.min(j2, jMin);
                }
                this.f58056q = jMin;
            }
            long j3 = this.f58056q;
            if (j3 > 0 || j3 == -1) {
                openNextSource(xh3VarBuild, false);
            }
            long j4 = xh3Var.f97807h;
            return j4 != -1 ? j4 : this.f58056q;
        } catch (Throwable th) {
            handleBeforeThrow(th);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:9:0x0021, B:11:0x0029, B:14:0x0030, B:16:0x0044, B:18:0x004a, B:19:0x0050, B:21:0x0061, B:22:0x0065, B:24:0x006b, B:26:0x0071, B:28:0x0077, B:29:0x0083, B:35:0x0091), top: B:39:0x0021 }] */
    @Override // p000.bh3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read(byte[] r16, int r17, int r18) throws java.io.IOException {
        /*
            r15 = this;
            r1 = r15
            r0 = r18
            r2 = 0
            if (r0 != 0) goto L7
            return r2
        L7:
            long r3 = r1.f58056q
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = -1
            if (r3 != 0) goto L11
            return r4
        L11:
            xh3 r3 = r1.f58051l
            java.lang.Object r3 = p000.v80.checkNotNull(r3)
            xh3 r3 = (p000.xh3) r3
            xh3 r7 = r1.f58052m
            java.lang.Object r7 = p000.v80.checkNotNull(r7)
            xh3 r7 = (p000.xh3) r7
            long r8 = r1.f58055p     // Catch: java.lang.Throwable -> L2e
            long r10 = r1.f58061v     // Catch: java.lang.Throwable -> L2e
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L30
            r8 = 1
            r15.openNextSource(r3, r8)     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r0 = move-exception
            goto L9c
        L30:
            gh3 r8 = r1.f58053n     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r8 = p000.v80.checkNotNull(r8)     // Catch: java.lang.Throwable -> L2e
            gh3 r8 = (p000.gh3) r8     // Catch: java.lang.Throwable -> L2e
            r9 = r16
            r10 = r17
            int r8 = r8.read(r9, r10, r0)     // Catch: java.lang.Throwable -> L2e
            r11 = -1
            if (r8 == r4) goto L65
            boolean r0 = r15.isReadingFromCache()     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L50
            long r2 = r1.f58060u     // Catch: java.lang.Throwable -> L2e
            long r4 = (long) r8     // Catch: java.lang.Throwable -> L2e
            long r2 = r2 + r4
            r1.f58060u = r2     // Catch: java.lang.Throwable -> L2e
        L50:
            long r2 = r1.f58055p     // Catch: java.lang.Throwable -> L2e
            long r4 = (long) r8     // Catch: java.lang.Throwable -> L2e
            long r2 = r2 + r4
            r1.f58055p = r2     // Catch: java.lang.Throwable -> L2e
            long r2 = r1.f58054o     // Catch: java.lang.Throwable -> L2e
            long r2 = r2 + r4
            r1.f58054o = r2     // Catch: java.lang.Throwable -> L2e
            long r2 = r1.f58056q     // Catch: java.lang.Throwable -> L2e
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 == 0) goto L90
            long r2 = r2 - r4
            r1.f58056q = r2     // Catch: java.lang.Throwable -> L2e
            goto L90
        L65:
            boolean r4 = r15.isReadingFromUpstream()     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L83
            long r13 = r7.f97807h     // Catch: java.lang.Throwable -> L2e
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L77
            long r11 = r1.f58054o     // Catch: java.lang.Throwable -> L2e
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 >= 0) goto L83
        L77:
            java.lang.String r0 = r3.f97808i     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = p000.t0i.castNonNull(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2e
            r15.setNoBytesRemainingAndMaybeStoreLength(r0)     // Catch: java.lang.Throwable -> L2e
            goto L90
        L83:
            long r11 = r1.f58056q     // Catch: java.lang.Throwable -> L2e
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 > 0) goto L91
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 != 0) goto L90
            goto L91
        L90:
            return r8
        L91:
            r15.closeCurrentSource()     // Catch: java.lang.Throwable -> L2e
            r15.openNextSource(r3, r2)     // Catch: java.lang.Throwable -> L2e
            int r0 = r15.read(r16, r17, r18)     // Catch: java.lang.Throwable -> L2e
            return r0
        L9c:
            r15.handleBeforeThrow(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ll1.read(byte[], int, int):int");
    }

    public ll1(cl1 cl1Var, @hib gh3 gh3Var) {
        this(cl1Var, gh3Var, 0);
    }

    public ll1(cl1 cl1Var, @hib gh3 gh3Var, int i) {
        this(cl1Var, gh3Var, new ns5(), new jl1(cl1Var, 5242880L), i, null);
    }

    public ll1(cl1 cl1Var, @hib gh3 gh3Var, gh3 gh3Var2, @hib eh3 eh3Var, int i, @hib InterfaceC8877c interfaceC8877c) {
        this(cl1Var, gh3Var, gh3Var2, eh3Var, i, interfaceC8877c, null);
    }

    public ll1(cl1 cl1Var, @hib gh3 gh3Var, gh3 gh3Var2, @hib eh3 eh3Var, int i, @hib InterfaceC8877c interfaceC8877c, @hib hm1 hm1Var) {
        this(cl1Var, gh3Var, gh3Var2, eh3Var, hm1Var, i, null, -1000, interfaceC8877c);
    }

    private ll1(cl1 cl1Var, @hib gh3 gh3Var, gh3 gh3Var2, @hib eh3 eh3Var, @hib hm1 hm1Var, int i, @hib icd icdVar, int i2, @hib InterfaceC8877c interfaceC8877c) {
        this.f58041b = cl1Var;
        this.f58042c = gh3Var2;
        this.f58045f = hm1Var == null ? hm1.f44102a : hm1Var;
        this.f58047h = (i & 1) != 0;
        this.f58048i = (i & 2) != 0;
        this.f58049j = (i & 4) != 0;
        if (gh3Var != null) {
            gh3Var = icdVar != null ? new bcd(gh3Var, icdVar, i2) : gh3Var;
            this.f58044e = gh3Var;
            this.f58043d = eh3Var != null ? new zng(gh3Var, eh3Var) : null;
        } else {
            this.f58044e = iwc.f48697b;
            this.f58043d = null;
        }
        this.f58046g = interfaceC8877c;
    }
}
