package p000;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.C10354of;
import p000.InterfaceC14066vh;
import p000.aga;
import p000.pv9;
import p000.t1h;
import p000.vna;

/* JADX INFO: renamed from: ji */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class C7909ji extends vm2<vna.C14175b> {

    /* JADX INFO: renamed from: d2 */
    public static final vna.C14175b f50599d2 = new vna.C14175b(new Object());

    /* JADX INFO: renamed from: L */
    public final vna f50600L;

    /* JADX INFO: renamed from: M */
    @hib
    public final aga.C0238f f50601M;

    /* JADX INFO: renamed from: N */
    public final vna.InterfaceC14174a f50603N;

    /* JADX INFO: renamed from: Q */
    public final InterfaceC14066vh f50604Q;

    /* JADX INFO: renamed from: X */
    public final InterfaceC6309gh f50606X;

    /* JADX INFO: renamed from: Y */
    public final yh3 f50607Y;

    /* JADX INFO: renamed from: Z */
    public final Object f50608Z;

    /* JADX INFO: renamed from: Z1 */
    @hib
    public d f50609Z1;

    /* JADX INFO: renamed from: a2 */
    @hib
    public t1h f50610a2;

    /* JADX INFO: renamed from: b2 */
    @hib
    public C10354of f50611b2;

    /* JADX INFO: renamed from: M1 */
    public final Handler f50602M1 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: V1 */
    public final t1h.C12849b f50605V1 = new t1h.C12849b();

    /* JADX INFO: renamed from: c2 */
    public b[][] f50612c2 = new b[0][];

    /* JADX INFO: renamed from: ji$a */
    public static final class a extends IOException {

        /* JADX INFO: renamed from: b */
        public static final int f50613b = 0;

        /* JADX INFO: renamed from: c */
        public static final int f50614c = 1;

        /* JADX INFO: renamed from: d */
        public static final int f50615d = 2;

        /* JADX INFO: renamed from: e */
        public static final int f50616e = 3;

        /* JADX INFO: renamed from: a */
        public final int f50617a;

        /* JADX INFO: renamed from: ji$a$a, reason: collision with other inner class name */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC16456a {
        }

        private a(int i, Exception exc) {
            super(exc);
            this.f50617a = i;
        }

        public static a createForAd(Exception exc) {
            return new a(0, exc);
        }

        public static a createForAdGroup(Exception exc, int i) {
            return new a(1, new IOException("Failed to load ad group " + i, exc));
        }

        public static a createForAllAds(Exception exc) {
            return new a(2, exc);
        }

        public static a createForUnexpected(RuntimeException runtimeException) {
            return new a(3, runtimeException);
        }

        public RuntimeException getRuntimeExceptionForUnexpected() {
            u80.checkState(this.f50617a == 3);
            return (RuntimeException) u80.checkNotNull(getCause());
        }
    }

    /* JADX INFO: renamed from: ji$b */
    public final class b {

        /* JADX INFO: renamed from: a */
        public final vna.C14175b f50618a;

        /* JADX INFO: renamed from: b */
        public final List<pv9> f50619b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public Uri f50620c;

        /* JADX INFO: renamed from: d */
        public vna f50621d;

        /* JADX INFO: renamed from: e */
        public t1h f50622e;

        public b(vna.C14175b c14175b) {
            this.f50618a = c14175b;
        }

        public nja createMediaPeriod(vna.C14175b c14175b, InterfaceC6430gn interfaceC6430gn, long j) {
            pv9 pv9Var = new pv9(c14175b, interfaceC6430gn, j);
            this.f50619b.add(pv9Var);
            vna vnaVar = this.f50621d;
            if (vnaVar != null) {
                pv9Var.setMediaSource(vnaVar);
                pv9Var.setPrepareListener(C7909ji.this.new c((Uri) u80.checkNotNull(this.f50620c)));
            }
            t1h t1hVar = this.f50622e;
            if (t1hVar != null) {
                pv9Var.createPeriod(new vna.C14175b(t1hVar.getUidOfPeriod(0), c14175b.f71109d));
            }
            return pv9Var;
        }

        public long getDurationUs() {
            t1h t1hVar = this.f50622e;
            if (t1hVar == null) {
                return -9223372036854775807L;
            }
            return t1hVar.getPeriod(0, C7909ji.this.f50605V1).getDurationUs();
        }

        public void handleSourceInfoRefresh(t1h t1hVar) {
            u80.checkArgument(t1hVar.getPeriodCount() == 1);
            if (this.f50622e == null) {
                Object uidOfPeriod = t1hVar.getUidOfPeriod(0);
                for (int i = 0; i < this.f50619b.size(); i++) {
                    pv9 pv9Var = this.f50619b.get(i);
                    pv9Var.createPeriod(new vna.C14175b(uidOfPeriod, pv9Var.f72216a.f71109d));
                }
            }
            this.f50622e = t1hVar;
        }

        public boolean hasMediaSource() {
            return this.f50621d != null;
        }

        public void initializeWithMediaSource(vna vnaVar, Uri uri) {
            this.f50621d = vnaVar;
            this.f50620c = uri;
            for (int i = 0; i < this.f50619b.size(); i++) {
                pv9 pv9Var = this.f50619b.get(i);
                pv9Var.setMediaSource(vnaVar);
                pv9Var.setPrepareListener(C7909ji.this.new c(uri));
            }
            C7909ji.this.m24067t(this.f50618a, vnaVar);
        }

        public boolean isInactive() {
            return this.f50619b.isEmpty();
        }

        public void release() {
            if (hasMediaSource()) {
                C7909ji.this.m24068u(this.f50618a);
            }
        }

        public void releaseMediaPeriod(pv9 pv9Var) {
            this.f50619b.remove(pv9Var);
            pv9Var.releasePeriod();
        }
    }

    /* JADX INFO: renamed from: ji$c */
    public final class c implements pv9.InterfaceC11144a {

        /* JADX INFO: renamed from: a */
        public final Uri f50624a;

        public c(Uri uri) {
            this.f50624a = uri;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPrepareComplete$0(vna.C14175b c14175b) {
            C7909ji.this.f50604Q.handlePrepareComplete(C7909ji.this, c14175b.f71107b, c14175b.f71108c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPrepareError$1(vna.C14175b c14175b, IOException iOException) {
            C7909ji.this.f50604Q.handlePrepareError(C7909ji.this, c14175b.f71107b, c14175b.f71108c, iOException);
        }

        @Override // p000.pv9.InterfaceC11144a
        public void onPrepareComplete(final vna.C14175b c14175b) {
            C7909ji.this.f50602M1.post(new Runnable() { // from class: fi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36613a.lambda$onPrepareComplete$0(c14175b);
                }
            });
        }

        @Override // p000.pv9.InterfaceC11144a
        public void onPrepareError(final vna.C14175b c14175b, final IOException iOException) {
            C7909ji.this.m10216e(c14175b).loadError(new jc9(jc9.getNewId(), new yh3(this.f50624a), SystemClock.elapsedRealtime()), 6, (IOException) a.createForAd(iOException), true);
            C7909ji.this.f50602M1.post(new Runnable() { // from class: di
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29684a.lambda$onPrepareError$1(c14175b, iOException);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ji$d */
    public final class d implements InterfaceC14066vh.a {

        /* JADX INFO: renamed from: a */
        public final Handler f50626a = x0i.createHandlerForCurrentLooper();

        /* JADX INFO: renamed from: b */
        public volatile boolean f50627b;

        public d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdPlaybackState$0(C10354of c10354of) {
            if (this.f50627b) {
                return;
            }
            C7909ji.this.onAdPlaybackState(c10354of);
        }

        @Override // p000.InterfaceC14066vh.a
        public void onAdLoadError(a aVar, yh3 yh3Var) {
            if (this.f50627b) {
                return;
            }
            C7909ji.this.m10216e(null).loadError(new jc9(jc9.getNewId(), yh3Var, SystemClock.elapsedRealtime()), 6, (IOException) aVar, true);
        }

        @Override // p000.InterfaceC14066vh.a
        public void onAdPlaybackState(final C10354of c10354of) {
            if (this.f50627b) {
                return;
            }
            this.f50626a.post(new Runnable() { // from class: hi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f43667a.lambda$onAdPlaybackState$0(c10354of);
                }
            });
        }

        public void stop() {
            this.f50627b = true;
            this.f50626a.removeCallbacksAndMessages(null);
        }
    }

    public C7909ji(vna vnaVar, yh3 yh3Var, Object obj, vna.InterfaceC14174a interfaceC14174a, InterfaceC14066vh interfaceC14066vh, InterfaceC6309gh interfaceC6309gh) {
        this.f50600L = vnaVar;
        this.f50601M = ((aga.C0240h) u80.checkNotNull(vnaVar.getMediaItem().f1446b)).f1546c;
        this.f50603N = interfaceC14174a;
        this.f50604Q = interfaceC14066vh;
        this.f50606X = interfaceC6309gh;
        this.f50607Y = yh3Var;
        this.f50608Z = obj;
        interfaceC14066vh.setSupportedContentTypes(interfaceC14174a.getSupportedTypes());
    }

    private long[][] getAdDurationsUs() {
        long[][] jArr = new long[this.f50612c2.length][];
        int i = 0;
        while (true) {
            b[][] bVarArr = this.f50612c2;
            if (i >= bVarArr.length) {
                return jArr;
            }
            jArr[i] = new long[bVarArr[i].length];
            int i2 = 0;
            while (true) {
                b[] bVarArr2 = this.f50612c2[i];
                if (i2 < bVarArr2.length) {
                    b bVar = bVarArr2[i2];
                    jArr[i][i2] = bVar == null ? -9223372036854775807L : bVar.getDurationUs();
                    i2++;
                }
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareSourceInternal$0(d dVar) {
        this.f50604Q.start(this, this.f50607Y, this.f50608Z, this.f50606X, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseSourceInternal$1(d dVar) {
        this.f50604Q.stop(this, dVar);
    }

    private void maybeUpdateAdMediaSources() {
        Uri uri;
        C10354of c10354of = this.f50611b2;
        if (c10354of == null) {
            return;
        }
        for (int i = 0; i < this.f50612c2.length; i++) {
            int i2 = 0;
            while (true) {
                b[] bVarArr = this.f50612c2[i];
                if (i2 < bVarArr.length) {
                    b bVar = bVarArr[i2];
                    C10354of.b adGroup = c10354of.getAdGroup(i);
                    if (bVar != null && !bVar.hasMediaSource()) {
                        Uri[] uriArr = adGroup.f67477d;
                        if (i2 < uriArr.length && (uri = uriArr[i2]) != null) {
                            aga.C0235c uri2 = new aga.C0235c().setUri(uri);
                            aga.C0238f c0238f = this.f50601M;
                            if (c0238f != null) {
                                uri2.setDrmConfiguration(c0238f);
                            }
                            bVar.initializeWithMediaSource(this.f50603N.createMediaSource(uri2.build()), uri);
                        }
                    }
                    i2++;
                }
            }
        }
    }

    private void maybeUpdateSourceInfo() {
        t1h t1hVar = this.f50610a2;
        C10354of c10354of = this.f50611b2;
        if (c10354of == null || t1hVar == null) {
            return;
        }
        if (c10354of.f67459b == 0) {
            m10220l(t1hVar);
        } else {
            this.f50611b2 = c10354of.withAdDurationsUs(getAdDurationsUs());
            m10220l(new qnf(t1hVar, this.f50611b2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdPlaybackState(C10354of c10354of) {
        C10354of c10354of2 = this.f50611b2;
        if (c10354of2 == null) {
            b[][] bVarArr = new b[c10354of.f67459b][];
            this.f50612c2 = bVarArr;
            Arrays.fill(bVarArr, new b[0]);
        } else {
            u80.checkState(c10354of.f67459b == c10354of2.f67459b);
        }
        this.f50611b2 = c10354of;
        maybeUpdateAdMediaSources();
        maybeUpdateSourceInfo();
    }

    @Override // p000.vm2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public vna.C14175b mo2649p(vna.C14175b c14175b, vna.C14175b c14175b2) {
        return c14175b.isAd() ? c14175b : c14175b2;
    }

    @Override // p000.vm2
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(vna.C14175b c14175b, vna vnaVar, t1h t1hVar) {
        if (c14175b.isAd()) {
            ((b) u80.checkNotNull(this.f50612c2[c14175b.f71107b][c14175b.f71108c])).handleSourceInfoRefresh(t1hVar);
        } else {
            u80.checkArgument(t1hVar.getPeriodCount() == 1);
            this.f50610a2 = t1hVar;
        }
        maybeUpdateSourceInfo();
    }

    @Override // p000.vna
    public nja createPeriod(vna.C14175b c14175b, InterfaceC6430gn interfaceC6430gn, long j) {
        if (((C10354of) u80.checkNotNull(this.f50611b2)).f67459b <= 0 || !c14175b.isAd()) {
            pv9 pv9Var = new pv9(c14175b, interfaceC6430gn, j);
            pv9Var.setMediaSource(this.f50600L);
            pv9Var.createPeriod(c14175b);
            return pv9Var;
        }
        int i = c14175b.f71107b;
        int i2 = c14175b.f71108c;
        b[][] bVarArr = this.f50612c2;
        b[] bVarArr2 = bVarArr[i];
        if (bVarArr2.length <= i2) {
            bVarArr[i] = (b[]) Arrays.copyOf(bVarArr2, i2 + 1);
        }
        b bVar = this.f50612c2[i][i2];
        if (bVar == null) {
            bVar = new b(c14175b);
            this.f50612c2[i][i2] = bVar;
            maybeUpdateAdMediaSources();
        }
        return bVar.createMediaPeriod(c14175b, interfaceC6430gn, j);
    }

    @Override // p000.vna
    public aga getMediaItem() {
        return this.f50600L.getMediaItem();
    }

    @Override // p000.vm2, p000.es0
    /* JADX INFO: renamed from: k */
    public void mo2648k(@hib pdh pdhVar) {
        super.mo2648k(pdhVar);
        final d dVar = new d();
        this.f50609Z1 = dVar;
        m24067t(f50599d2, this.f50600L);
        this.f50602M1.post(new Runnable() { // from class: wh
            @Override // java.lang.Runnable
            public final void run() {
                this.f94242a.lambda$prepareSourceInternal$0(dVar);
            }
        });
    }

    @Override // p000.vna
    public void releasePeriod(nja njaVar) {
        pv9 pv9Var = (pv9) njaVar;
        vna.C14175b c14175b = pv9Var.f72216a;
        if (!c14175b.isAd()) {
            pv9Var.releasePeriod();
            return;
        }
        b bVar = (b) u80.checkNotNull(this.f50612c2[c14175b.f71107b][c14175b.f71108c]);
        bVar.releaseMediaPeriod(pv9Var);
        if (bVar.isInactive()) {
            bVar.release();
            this.f50612c2[c14175b.f71107b][c14175b.f71108c] = null;
        }
    }

    @Override // p000.vm2, p000.es0
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        final d dVar = (d) u80.checkNotNull(this.f50609Z1);
        this.f50609Z1 = null;
        dVar.stop();
        this.f50610a2 = null;
        this.f50611b2 = null;
        this.f50612c2 = new b[0][];
        this.f50602M1.post(new Runnable() { // from class: yh
            @Override // java.lang.Runnable
            public final void run() {
                this.f101461a.lambda$releaseSourceInternal$1(dVar);
            }
        });
    }
}
