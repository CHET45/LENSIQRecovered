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
import p000.dl1;
import p000.fh3;
import p000.ih3;
import p000.kl1;
import p000.os5;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ml1 implements ih3 {

    /* JADX INFO: renamed from: A */
    public static final int f61294A = 0;

    /* JADX INFO: renamed from: B */
    public static final int f61295B = 1;

    /* JADX INFO: renamed from: C */
    public static final long f61296C = 102400;

    /* JADX INFO: renamed from: w */
    public static final int f61297w = 1;

    /* JADX INFO: renamed from: x */
    public static final int f61298x = 2;

    /* JADX INFO: renamed from: y */
    public static final int f61299y = 4;

    /* JADX INFO: renamed from: z */
    public static final int f61300z = -1;

    /* JADX INFO: renamed from: b */
    public final dl1 f61301b;

    /* JADX INFO: renamed from: c */
    public final ih3 f61302c;

    /* JADX INFO: renamed from: d */
    @hib
    public final ih3 f61303d;

    /* JADX INFO: renamed from: e */
    public final ih3 f61304e;

    /* JADX INFO: renamed from: f */
    public final gm1 f61305f;

    /* JADX INFO: renamed from: g */
    @hib
    public final InterfaceC9394c f61306g;

    /* JADX INFO: renamed from: h */
    public final boolean f61307h;

    /* JADX INFO: renamed from: i */
    public final boolean f61308i;

    /* JADX INFO: renamed from: j */
    public final boolean f61309j;

    /* JADX INFO: renamed from: k */
    @hib
    public Uri f61310k;

    /* JADX INFO: renamed from: l */
    @hib
    public yh3 f61311l;

    /* JADX INFO: renamed from: m */
    @hib
    public yh3 f61312m;

    /* JADX INFO: renamed from: n */
    @hib
    public ih3 f61313n;

    /* JADX INFO: renamed from: o */
    public long f61314o;

    /* JADX INFO: renamed from: p */
    public long f61315p;

    /* JADX INFO: renamed from: q */
    public long f61316q;

    /* JADX INFO: renamed from: r */
    @hib
    public mm1 f61317r;

    /* JADX INFO: renamed from: s */
    public boolean f61318s;

    /* JADX INFO: renamed from: t */
    public boolean f61319t;

    /* JADX INFO: renamed from: u */
    public long f61320u;

    /* JADX INFO: renamed from: v */
    public long f61321v;

    /* JADX INFO: renamed from: ml1$b */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9393b {
    }

    /* JADX INFO: renamed from: ml1$c */
    public interface InterfaceC9394c {
        void onCacheIgnored(int i);

        void onCachedBytesRead(long j, long j2);
    }

    /* JADX INFO: renamed from: ml1$d */
    public static final class C9395d implements ih3.InterfaceC7283a {

        /* JADX INFO: renamed from: a */
        public dl1 f61322a;

        /* JADX INFO: renamed from: c */
        @hib
        public fh3.InterfaceC5803a f61324c;

        /* JADX INFO: renamed from: e */
        public boolean f61326e;

        /* JADX INFO: renamed from: f */
        @hib
        public ih3.InterfaceC7283a f61327f;

        /* JADX INFO: renamed from: g */
        @hib
        public jcd f61328g;

        /* JADX INFO: renamed from: h */
        public int f61329h;

        /* JADX INFO: renamed from: i */
        public int f61330i;

        /* JADX INFO: renamed from: j */
        @hib
        public InterfaceC9394c f61331j;

        /* JADX INFO: renamed from: b */
        public ih3.InterfaceC7283a f61323b = new os5.C10629b();

        /* JADX INFO: renamed from: d */
        public gm1 f61325d = gm1.f40163a;

        private ml1 createDataSourceInternal(@hib ih3 ih3Var, int i, int i2) {
            fh3 fh3VarCreateDataSink;
            dl1 dl1Var = (dl1) u80.checkNotNull(this.f61322a);
            if (this.f61326e || ih3Var == null) {
                fh3VarCreateDataSink = null;
            } else {
                fh3.InterfaceC5803a interfaceC5803a = this.f61324c;
                fh3VarCreateDataSink = interfaceC5803a != null ? interfaceC5803a.createDataSink() : new kl1.C8442b().setCache(dl1Var).createDataSink();
            }
            return new ml1(dl1Var, ih3Var, this.f61323b.createDataSource(), fh3VarCreateDataSink, this.f61325d, i, this.f61328g, i2, this.f61331j);
        }

        public ml1 createDataSourceForDownloading() {
            ih3.InterfaceC7283a interfaceC7283a = this.f61327f;
            return createDataSourceInternal(interfaceC7283a != null ? interfaceC7283a.createDataSource() : null, this.f61330i | 1, -1000);
        }

        public ml1 createDataSourceForRemovingDownload() {
            return createDataSourceInternal(null, this.f61330i | 1, -1000);
        }

        @hib
        public dl1 getCache() {
            return this.f61322a;
        }

        public gm1 getCacheKeyFactory() {
            return this.f61325d;
        }

        @hib
        public jcd getUpstreamPriorityTaskManager() {
            return this.f61328g;
        }

        @op1
        public C9395d setCache(dl1 dl1Var) {
            this.f61322a = dl1Var;
            return this;
        }

        @op1
        public C9395d setCacheKeyFactory(gm1 gm1Var) {
            this.f61325d = gm1Var;
            return this;
        }

        @op1
        public C9395d setCacheReadDataSourceFactory(ih3.InterfaceC7283a interfaceC7283a) {
            this.f61323b = interfaceC7283a;
            return this;
        }

        @op1
        public C9395d setCacheWriteDataSinkFactory(@hib fh3.InterfaceC5803a interfaceC5803a) {
            this.f61324c = interfaceC5803a;
            this.f61326e = interfaceC5803a == null;
            return this;
        }

        @op1
        public C9395d setEventListener(@hib InterfaceC9394c interfaceC9394c) {
            this.f61331j = interfaceC9394c;
            return this;
        }

        @op1
        public C9395d setFlags(int i) {
            this.f61330i = i;
            return this;
        }

        @op1
        public C9395d setUpstreamDataSourceFactory(@hib ih3.InterfaceC7283a interfaceC7283a) {
            this.f61327f = interfaceC7283a;
            return this;
        }

        @op1
        public C9395d setUpstreamPriority(int i) {
            this.f61329h = i;
            return this;
        }

        @op1
        public C9395d setUpstreamPriorityTaskManager(@hib jcd jcdVar) {
            this.f61328g = jcdVar;
            return this;
        }

        @Override // p000.ih3.InterfaceC7283a
        public ml1 createDataSource() {
            ih3.InterfaceC7283a interfaceC7283a = this.f61327f;
            return createDataSourceInternal(interfaceC7283a != null ? interfaceC7283a.createDataSource() : null, this.f61330i, this.f61329h);
        }
    }

    /* JADX INFO: renamed from: ml1$e */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9396e {
    }

    private void closeCurrentSource() throws IOException {
        ih3 ih3Var = this.f61313n;
        if (ih3Var == null) {
            return;
        }
        try {
            ih3Var.close();
        } finally {
            this.f61312m = null;
            this.f61313n = null;
            mm1 mm1Var = this.f61317r;
            if (mm1Var != null) {
                this.f61301b.releaseHoleSpan(mm1Var);
                this.f61317r = null;
            }
        }
    }

    private static Uri getRedirectedUriOrDefault(dl1 dl1Var, String str, Uri uri) {
        Uri redirectedUri = ow2.getRedirectedUri(dl1Var.getContentMetadata(str));
        return redirectedUri != null ? redirectedUri : uri;
    }

    private void handleBeforeThrow(Throwable th) {
        if (isReadingFromCache() || (th instanceof dl1.C4842a)) {
            this.f61318s = true;
        }
    }

    private boolean isBypassingCache() {
        return this.f61313n == this.f61304e;
    }

    private boolean isReadingFromCache() {
        return this.f61313n == this.f61302c;
    }

    private boolean isReadingFromUpstream() {
        return !isReadingFromCache();
    }

    private boolean isWritingToCache() {
        return this.f61313n == this.f61303d;
    }

    private void notifyBytesRead() {
        InterfaceC9394c interfaceC9394c = this.f61306g;
        if (interfaceC9394c == null || this.f61320u <= 0) {
            return;
        }
        interfaceC9394c.onCachedBytesRead(this.f61301b.getCacheSpace(), this.f61320u);
        this.f61320u = 0L;
    }

    private void notifyCacheIgnored(int i) {
        InterfaceC9394c interfaceC9394c = this.f61306g;
        if (interfaceC9394c != null) {
            interfaceC9394c.onCacheIgnored(i);
        }
    }

    private void openNextSource(yh3 yh3Var, boolean z) throws IOException {
        mm1 mm1VarStartReadWrite;
        long jMin;
        yh3 yh3VarBuild;
        ih3 ih3Var;
        String str = (String) x0i.castNonNull(yh3Var.f101493i);
        if (this.f61319t) {
            mm1VarStartReadWrite = null;
        } else if (this.f61307h) {
            try {
                mm1VarStartReadWrite = this.f61301b.startReadWrite(str, this.f61315p, this.f61316q);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            mm1VarStartReadWrite = this.f61301b.startReadWriteNonBlocking(str, this.f61315p, this.f61316q);
        }
        if (mm1VarStartReadWrite == null) {
            ih3Var = this.f61304e;
            yh3VarBuild = yh3Var.buildUpon().setPosition(this.f61315p).setLength(this.f61316q).build();
        } else if (mm1VarStartReadWrite.f61459d) {
            Uri uriFromFile = Uri.fromFile((File) x0i.castNonNull(mm1VarStartReadWrite.f61460e));
            long j = mm1VarStartReadWrite.f61457b;
            long j2 = this.f61315p - j;
            long jMin2 = mm1VarStartReadWrite.f61458c - j2;
            long j3 = this.f61316q;
            if (j3 != -1) {
                jMin2 = Math.min(jMin2, j3);
            }
            yh3VarBuild = yh3Var.buildUpon().setUri(uriFromFile).setUriPositionOffset(j).setPosition(j2).setLength(jMin2).build();
            ih3Var = this.f61302c;
        } else {
            if (mm1VarStartReadWrite.isOpenEnded()) {
                jMin = this.f61316q;
            } else {
                jMin = mm1VarStartReadWrite.f61458c;
                long j4 = this.f61316q;
                if (j4 != -1) {
                    jMin = Math.min(jMin, j4);
                }
            }
            yh3VarBuild = yh3Var.buildUpon().setPosition(this.f61315p).setLength(jMin).build();
            ih3Var = this.f61303d;
            if (ih3Var == null) {
                ih3Var = this.f61304e;
                this.f61301b.releaseHoleSpan(mm1VarStartReadWrite);
                mm1VarStartReadWrite = null;
            }
        }
        this.f61321v = (this.f61319t || ih3Var != this.f61304e) ? Long.MAX_VALUE : this.f61315p + 102400;
        if (z) {
            u80.checkState(isBypassingCache());
            if (ih3Var == this.f61304e) {
                return;
            }
            try {
                closeCurrentSource();
            } finally {
            }
        }
        if (mm1VarStartReadWrite != null && mm1VarStartReadWrite.isHoleSpan()) {
            this.f61317r = mm1VarStartReadWrite;
        }
        this.f61313n = ih3Var;
        this.f61312m = yh3VarBuild;
        this.f61314o = 0L;
        long jOpen = ih3Var.open(yh3VarBuild);
        qw2 qw2Var = new qw2();
        if (yh3VarBuild.f101492h == -1 && jOpen != -1) {
            this.f61316q = jOpen;
            qw2.setContentLength(qw2Var, this.f61315p + jOpen);
        }
        if (isReadingFromUpstream()) {
            Uri uri = ih3Var.getUri();
            this.f61310k = uri;
            qw2.setRedirectedUri(qw2Var, yh3Var.f101485a.equals(uri) ? null : this.f61310k);
        }
        if (isWritingToCache()) {
            this.f61301b.applyContentMetadataMutations(str, qw2Var);
        }
    }

    private void setNoBytesRemainingAndMaybeStoreLength(String str) throws IOException {
        this.f61316q = 0L;
        if (isWritingToCache()) {
            qw2 qw2Var = new qw2();
            qw2.setContentLength(qw2Var, this.f61315p);
            this.f61301b.applyContentMetadataMutations(str, qw2Var);
        }
    }

    private int shouldIgnoreCacheForRequest(yh3 yh3Var) {
        if (this.f61308i && this.f61318s) {
            return 0;
        }
        return (this.f61309j && yh3Var.f101492h == -1) ? 1 : -1;
    }

    @Override // p000.ih3
    public void addTransferListener(pdh pdhVar) {
        u80.checkNotNull(pdhVar);
        this.f61302c.addTransferListener(pdhVar);
        this.f61304e.addTransferListener(pdhVar);
    }

    @Override // p000.ih3, p000.en7
    public void close() throws IOException {
        this.f61311l = null;
        this.f61310k = null;
        this.f61315p = 0L;
        notifyBytesRead();
        try {
            closeCurrentSource();
        } catch (Throwable th) {
            handleBeforeThrow(th);
            throw th;
        }
    }

    public dl1 getCache() {
        return this.f61301b;
    }

    public gm1 getCacheKeyFactory() {
        return this.f61305f;
    }

    @Override // p000.ih3, p000.en7
    public Map<String, List<String>> getResponseHeaders() {
        return isReadingFromUpstream() ? this.f61304e.getResponseHeaders() : Collections.emptyMap();
    }

    @Override // p000.ih3
    @hib
    public Uri getUri() {
        return this.f61310k;
    }

    @Override // p000.ih3, p000.en7
    public long open(yh3 yh3Var) throws IOException {
        try {
            String strBuildCacheKey = this.f61305f.buildCacheKey(yh3Var);
            yh3 yh3VarBuild = yh3Var.buildUpon().setKey(strBuildCacheKey).build();
            this.f61311l = yh3VarBuild;
            this.f61310k = getRedirectedUriOrDefault(this.f61301b, strBuildCacheKey, yh3VarBuild.f101485a);
            this.f61315p = yh3Var.f101491g;
            int iShouldIgnoreCacheForRequest = shouldIgnoreCacheForRequest(yh3Var);
            boolean z = iShouldIgnoreCacheForRequest != -1;
            this.f61319t = z;
            if (z) {
                notifyCacheIgnored(iShouldIgnoreCacheForRequest);
            }
            if (this.f61319t) {
                this.f61316q = -1L;
            } else {
                long contentLength = ow2.getContentLength(this.f61301b.getContentMetadata(strBuildCacheKey));
                this.f61316q = contentLength;
                if (contentLength != -1) {
                    long j = contentLength - yh3Var.f101491g;
                    this.f61316q = j;
                    if (j < 0) {
                        throw new rh3(2008);
                    }
                }
            }
            long jMin = yh3Var.f101492h;
            if (jMin != -1) {
                long j2 = this.f61316q;
                if (j2 != -1) {
                    jMin = Math.min(j2, jMin);
                }
                this.f61316q = jMin;
            }
            long j3 = this.f61316q;
            if (j3 > 0 || j3 == -1) {
                openNextSource(yh3VarBuild, false);
            }
            long j4 = yh3Var.f101492h;
            return j4 != -1 ? j4 : this.f61316q;
        } catch (Throwable th) {
            handleBeforeThrow(th);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:9:0x0021, B:11:0x0029, B:14:0x0030, B:16:0x0044, B:18:0x004a, B:19:0x0050, B:21:0x0061, B:22:0x0065, B:24:0x006b, B:26:0x0071, B:28:0x0077, B:29:0x0083, B:35:0x0091), top: B:39:0x0021 }] */
    @Override // p000.ah3, p000.en7
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
            long r3 = r1.f61316q
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = -1
            if (r3 != 0) goto L11
            return r4
        L11:
            yh3 r3 = r1.f61311l
            java.lang.Object r3 = p000.u80.checkNotNull(r3)
            yh3 r3 = (p000.yh3) r3
            yh3 r7 = r1.f61312m
            java.lang.Object r7 = p000.u80.checkNotNull(r7)
            yh3 r7 = (p000.yh3) r7
            long r8 = r1.f61315p     // Catch: java.lang.Throwable -> L2e
            long r10 = r1.f61321v     // Catch: java.lang.Throwable -> L2e
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L30
            r8 = 1
            r15.openNextSource(r3, r8)     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r0 = move-exception
            goto L9c
        L30:
            ih3 r8 = r1.f61313n     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r8 = p000.u80.checkNotNull(r8)     // Catch: java.lang.Throwable -> L2e
            ih3 r8 = (p000.ih3) r8     // Catch: java.lang.Throwable -> L2e
            r9 = r16
            r10 = r17
            int r8 = r8.read(r9, r10, r0)     // Catch: java.lang.Throwable -> L2e
            r11 = -1
            if (r8 == r4) goto L65
            boolean r0 = r15.isReadingFromCache()     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L50
            long r2 = r1.f61320u     // Catch: java.lang.Throwable -> L2e
            long r4 = (long) r8     // Catch: java.lang.Throwable -> L2e
            long r2 = r2 + r4
            r1.f61320u = r2     // Catch: java.lang.Throwable -> L2e
        L50:
            long r2 = r1.f61315p     // Catch: java.lang.Throwable -> L2e
            long r4 = (long) r8     // Catch: java.lang.Throwable -> L2e
            long r2 = r2 + r4
            r1.f61315p = r2     // Catch: java.lang.Throwable -> L2e
            long r2 = r1.f61314o     // Catch: java.lang.Throwable -> L2e
            long r2 = r2 + r4
            r1.f61314o = r2     // Catch: java.lang.Throwable -> L2e
            long r2 = r1.f61316q     // Catch: java.lang.Throwable -> L2e
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 == 0) goto L90
            long r2 = r2 - r4
            r1.f61316q = r2     // Catch: java.lang.Throwable -> L2e
            goto L90
        L65:
            boolean r4 = r15.isReadingFromUpstream()     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L83
            long r13 = r7.f101492h     // Catch: java.lang.Throwable -> L2e
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L77
            long r11 = r1.f61314o     // Catch: java.lang.Throwable -> L2e
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 >= 0) goto L83
        L77:
            java.lang.String r0 = r3.f101493i     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = p000.x0i.castNonNull(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2e
            r15.setNoBytesRemainingAndMaybeStoreLength(r0)     // Catch: java.lang.Throwable -> L2e
            goto L90
        L83:
            long r11 = r1.f61316q     // Catch: java.lang.Throwable -> L2e
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
        throw new UnsupportedOperationException("Method not decompiled: p000.ml1.read(byte[], int, int):int");
    }

    public ml1(dl1 dl1Var, @hib ih3 ih3Var) {
        this(dl1Var, ih3Var, 0);
    }

    public ml1(dl1 dl1Var, @hib ih3 ih3Var, int i) {
        this(dl1Var, ih3Var, new os5(), new kl1(dl1Var, 5242880L), i, null);
    }

    public ml1(dl1 dl1Var, @hib ih3 ih3Var, ih3 ih3Var2, @hib fh3 fh3Var, int i, @hib InterfaceC9394c interfaceC9394c) {
        this(dl1Var, ih3Var, ih3Var2, fh3Var, i, interfaceC9394c, null);
    }

    public ml1(dl1 dl1Var, @hib ih3 ih3Var, ih3 ih3Var2, @hib fh3 fh3Var, int i, @hib InterfaceC9394c interfaceC9394c, @hib gm1 gm1Var) {
        this(dl1Var, ih3Var, ih3Var2, fh3Var, gm1Var, i, null, 0, interfaceC9394c);
    }

    private ml1(dl1 dl1Var, @hib ih3 ih3Var, ih3 ih3Var2, @hib fh3 fh3Var, @hib gm1 gm1Var, int i, @hib jcd jcdVar, int i2, @hib InterfaceC9394c interfaceC9394c) {
        this.f61301b = dl1Var;
        this.f61302c = ih3Var2;
        this.f61305f = gm1Var == null ? gm1.f40163a : gm1Var;
        this.f61307h = (i & 1) != 0;
        this.f61308i = (i & 2) != 0;
        this.f61309j = (i & 4) != 0;
        if (ih3Var != null) {
            ih3Var = jcdVar != null ? new ccd(ih3Var, jcdVar, i2) : ih3Var;
            this.f61304e = ih3Var;
            this.f61303d = fh3Var != null ? new yng(ih3Var, fh3Var) : null;
        } else {
            this.f61304e = hwc.f45165b;
            this.f61303d = null;
        }
        this.f61306g = interfaceC9394c;
    }
}
