package p000;

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
import java.util.Objects;
import p000.C9343mf;
import p000.InterfaceC13540uh;
import p000.nfa;
import p000.ov9;
import p000.q1h;
import p000.una;

/* JADX INFO: renamed from: ci */
/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class C2317ci extends um2<una.C13612b> {

    /* JADX INFO: renamed from: f2 */
    public static final una.C13612b f16571f2 = new una.C13612b(new Object());

    /* JADX INFO: renamed from: L */
    public final qv9 f16572L;

    /* JADX INFO: renamed from: M */
    @hib
    public final nfa.C9854f f16573M;

    /* JADX INFO: renamed from: M1 */
    public final Handler f16574M1;

    /* JADX INFO: renamed from: N */
    public final una.InterfaceC13611a f16575N;

    /* JADX INFO: renamed from: Q */
    public final InterfaceC13540uh f16576Q;

    /* JADX INFO: renamed from: V1 */
    public final q1h.C11270b f16577V1;

    /* JADX INFO: renamed from: X */
    public final InterfaceC6849hh f16578X;

    /* JADX INFO: renamed from: Y */
    public final xh3 f16579Y;

    /* JADX INFO: renamed from: Z */
    public final Object f16580Z;

    /* JADX INFO: renamed from: Z1 */
    public final boolean f16581Z1;

    /* JADX INFO: renamed from: a2 */
    @hib
    public d f16582a2;

    /* JADX INFO: renamed from: b2 */
    @hib
    public q1h f16583b2;

    /* JADX INFO: renamed from: c2 */
    @hib
    public C9343mf f16584c2;

    /* JADX INFO: renamed from: d2 */
    public b[][] f16585d2;

    /* JADX INFO: renamed from: e2 */
    @hib
    public Handler f16586e2;

    /* JADX INFO: renamed from: ci$a */
    public static final class a extends IOException {

        /* JADX INFO: renamed from: b */
        public static final int f16587b = 0;

        /* JADX INFO: renamed from: c */
        public static final int f16588c = 1;

        /* JADX INFO: renamed from: d */
        public static final int f16589d = 2;

        /* JADX INFO: renamed from: e */
        public static final int f16590e = 3;

        /* JADX INFO: renamed from: a */
        public final int f16591a;

        /* JADX INFO: renamed from: ci$a$a, reason: collision with other inner class name */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC16415a {
        }

        private a(int i, Exception exc) {
            super(exc);
            this.f16591a = i;
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
            v80.checkState(this.f16591a == 3);
            return (RuntimeException) v80.checkNotNull(getCause());
        }
    }

    /* JADX INFO: renamed from: ci$b */
    public final class b {

        /* JADX INFO: renamed from: a */
        public final una.C13612b f16592a;

        /* JADX INFO: renamed from: b */
        public final List<ov9> f16593b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public nfa f16594c;

        /* JADX INFO: renamed from: d */
        public una f16595d;

        /* JADX INFO: renamed from: e */
        public q1h f16596e;

        public b(una.C13612b c13612b) {
            this.f16592a = c13612b;
        }

        public mja createMediaPeriod(una.C13612b c13612b, InterfaceC5892fn interfaceC5892fn, long j) {
            ov9 ov9Var = new ov9(c13612b, interfaceC5892fn, j);
            this.f16593b.add(ov9Var);
            una unaVar = this.f16595d;
            if (unaVar != null) {
                ov9Var.setMediaSource(unaVar);
                ov9Var.setPrepareListener(C2317ci.this.new c((nfa) v80.checkNotNull(this.f16594c)));
            }
            q1h q1hVar = this.f16596e;
            if (q1hVar != null) {
                ov9Var.createPeriod(new una.C13612b(q1hVar.getUidOfPeriod(0), c13612b.f88606d));
            }
            return ov9Var;
        }

        public long getDurationUs() {
            q1h q1hVar = this.f16596e;
            if (q1hVar == null) {
                return -9223372036854775807L;
            }
            return q1hVar.getPeriod(0, C2317ci.this.f16577V1).getDurationUs();
        }

        public void handleSourceInfoRefresh(q1h q1hVar) {
            v80.checkArgument(q1hVar.getPeriodCount() == 1);
            if (this.f16596e == null) {
                Object uidOfPeriod = q1hVar.getUidOfPeriod(0);
                for (int i = 0; i < this.f16593b.size(); i++) {
                    ov9 ov9Var = this.f16593b.get(i);
                    ov9Var.createPeriod(new una.C13612b(uidOfPeriod, ov9Var.f68941a.f88606d));
                }
            }
            this.f16596e = q1hVar;
        }

        public boolean hasMediaSource() {
            return this.f16595d != null;
        }

        public void initializeWithMediaSource(una unaVar, nfa nfaVar) {
            this.f16595d = unaVar;
            this.f16594c = nfaVar;
            for (int i = 0; i < this.f16593b.size(); i++) {
                ov9 ov9Var = this.f16593b.get(i);
                ov9Var.setMediaSource(unaVar);
                ov9Var.setPrepareListener(C2317ci.this.new c(nfaVar));
            }
            C2317ci.this.m23429v(this.f16592a, unaVar);
        }

        public boolean isInactive() {
            return this.f16593b.isEmpty();
        }

        public void release() {
            if (hasMediaSource()) {
                C2317ci.this.m23430w(this.f16592a);
            }
        }

        public void releaseMediaPeriod(ov9 ov9Var) {
            this.f16593b.remove(ov9Var);
            ov9Var.releasePeriod();
        }
    }

    /* JADX INFO: renamed from: ci$c */
    public final class c implements ov9.InterfaceC10666a {

        /* JADX INFO: renamed from: a */
        public final nfa f16598a;

        public c(nfa nfaVar) {
            this.f16598a = nfaVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPrepareComplete$0(una.C13612b c13612b) {
            C2317ci.this.f16576Q.handlePrepareComplete(C2317ci.this, c13612b.f88604b, c13612b.f88605c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPrepareError$1(una.C13612b c13612b, IOException iOException) {
            C2317ci.this.f16576Q.handlePrepareError(C2317ci.this, c13612b.f88604b, c13612b.f88605c, iOException);
        }

        @Override // p000.ov9.InterfaceC10666a
        public void onPrepareComplete(final una.C13612b c13612b) {
            C2317ci.this.f16574M1.post(new Runnable() { // from class: gi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39848a.lambda$onPrepareComplete$0(c13612b);
                }
            });
        }

        @Override // p000.ov9.InterfaceC10666a
        public void onPrepareError(final una.C13612b c13612b, final IOException iOException) {
            C2317ci.this.m11118e(c13612b).loadError(new kc9(kc9.getNewId(), new xh3(((nfa.C9856h) v80.checkNotNull(this.f16598a.f64305b)).f64406a), SystemClock.elapsedRealtime()), 6, (IOException) a.createForAd(iOException), true);
            C2317ci.this.f16574M1.post(new Runnable() { // from class: ei
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33059a.lambda$onPrepareError$1(c13612b, iOException);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ci$d */
    public final class d implements InterfaceC13540uh.a {

        /* JADX INFO: renamed from: a */
        public final Handler f16600a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f16601b;

        public d(Handler handler) {
            this.f16600a = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdPlaybackState$0(C9343mf c9343mf) {
            if (this.f16601b) {
                return;
            }
            C2317ci.this.onAdPlaybackState(c9343mf);
        }

        @Override // p000.InterfaceC13540uh.a
        public void onAdLoadError(a aVar, xh3 xh3Var) {
            if (this.f16601b) {
                return;
            }
            C2317ci.this.m11118e(null).loadError(new kc9(kc9.getNewId(), xh3Var, SystemClock.elapsedRealtime()), 6, (IOException) aVar, true);
        }

        @Override // p000.InterfaceC13540uh.a
        public void onAdPlaybackState(final C9343mf c9343mf) {
            if (this.f16601b) {
                return;
            }
            this.f16600a.post(new Runnable() { // from class: ii
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47054a.lambda$onAdPlaybackState$0(c9343mf);
                }
            });
        }

        public void stop() {
            this.f16601b = true;
            this.f16600a.removeCallbacksAndMessages(null);
        }
    }

    public C2317ci(una unaVar, xh3 xh3Var, Object obj, una.InterfaceC13611a interfaceC13611a, InterfaceC13540uh interfaceC13540uh, InterfaceC6849hh interfaceC6849hh) {
        this(unaVar, xh3Var, obj, interfaceC13611a, interfaceC13540uh, interfaceC6849hh, true);
    }

    private static int checkValidAdPlaybackStateUpdate(C9343mf c9343mf, C9343mf c9343mf2) {
        v80.checkState(c9343mf.endsWithLivePostrollPlaceHolder() == c9343mf2.endsWithLivePostrollPlaceHolder());
        int i = c9343mf2.f60843b - c9343mf.f60843b;
        v80.checkState(i >= 0);
        int i2 = c9343mf2.f60846e;
        while (true) {
            if (i2 >= c9343mf.f60843b) {
                break;
            }
            C9343mf.b adGroup = c9343mf.getAdGroup(i2);
            if (adGroup.isLivePostrollPlaceholder()) {
                v80.checkState(i2 == c9343mf.f60843b - 1);
            } else {
                C9343mf.b adGroup2 = c9343mf2.getAdGroup(i2);
                v80.checkState(adGroup.f60860b <= adGroup2.f60860b);
                v80.checkState(adGroup.f60859a == adGroup2.f60859a);
                for (int i3 = 0; i3 < adGroup.f60860b; i3++) {
                    nfa nfaVar = adGroup.f60863e[i3];
                    if (nfaVar != null) {
                        v80.checkState(nfaVar.equals(adGroup2.f60863e[i3]));
                    }
                }
                i2++;
            }
        }
        return i;
    }

    @g5e({"adPlaybackState"})
    private long[][] getAdDurationsUs() {
        boolean zEndsWithLivePostrollPlaceHolder = ((C9343mf) v80.checkNotNull(this.f16584c2)).endsWithLivePostrollPlaceHolder();
        int length = this.f16585d2.length + (zEndsWithLivePostrollPlaceHolder ? 1 : 0);
        long[][] jArr = new long[length][];
        int i = 0;
        while (true) {
            b[][] bVarArr = this.f16585d2;
            if (i >= bVarArr.length) {
                break;
            }
            jArr[i] = new long[bVarArr[i].length];
            int i2 = 0;
            while (true) {
                b[] bVarArr2 = this.f16585d2[i];
                if (i2 < bVarArr2.length) {
                    b bVar = bVarArr2[i2];
                    jArr[i][i2] = bVar == null ? -9223372036854775807L : bVar.getDurationUs();
                    i2++;
                }
            }
            i++;
        }
        if (zEndsWithLivePostrollPlaceHolder) {
            jArr[length - 1] = new long[0];
        }
        return jArr;
    }

    @hib
    private static nfa.C9850b getAdsConfiguration(nfa nfaVar) {
        nfa.C9856h c9856h = nfaVar.f64305b;
        if (c9856h == null) {
            return null;
        }
        return c9856h.f64409d;
    }

    private static b[][] growAdMediaSourceHolderGrid(b[][] bVarArr, int i) {
        int length = bVarArr.length + i;
        b[][] bVarArr2 = new b[length][];
        System.arraycopy(bVarArr, 0, bVarArr2, 0, bVarArr.length);
        for (int length2 = bVarArr.length; length2 < length; length2++) {
            bVarArr2[length2] = new b[0];
        }
        return bVarArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onChildSourceInfoRefreshed$2(q1h q1hVar) {
        boolean zHandleContentTimelineChanged = this.f16576Q.handleContentTimelineChanged(this, q1hVar);
        v80.checkState((zHandleContentTimelineChanged && this.f16581Z1) ? false : true);
        if (zHandleContentTimelineChanged || this.f16581Z1) {
            return;
        }
        ((Handler) v80.checkNotNull(this.f16586e2)).post(new Runnable() { // from class: zh
            @Override // java.lang.Runnable
            public final void run() {
                this.f105069a.maybeUpdateSourceInfo();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareSourceInternal$0(d dVar) {
        this.f16576Q.start(this, this.f16579Y, this.f16580Z, this.f16578X, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseSourceInternal$1(d dVar) {
        this.f16576Q.stop(this, dVar);
    }

    private void maybeUpdateAdMediaSources() {
        nfa nfaVarBuild;
        C9343mf c9343mf = this.f16584c2;
        if (c9343mf == null) {
            return;
        }
        for (int i = 0; i < this.f16585d2.length; i++) {
            int i2 = 0;
            while (true) {
                b[] bVarArr = this.f16585d2[i];
                if (i2 < bVarArr.length) {
                    b bVar = bVarArr[i2];
                    C9343mf.b adGroup = c9343mf.getAdGroup(i);
                    if (bVar != null && !bVar.hasMediaSource()) {
                        nfa[] nfaVarArr = adGroup.f60863e;
                        if (i2 < nfaVarArr.length && (nfaVarBuild = nfaVarArr[i2]) != null) {
                            if (this.f16573M != null) {
                                nfaVarBuild = nfaVarBuild.buildUpon().setDrmConfiguration(this.f16573M).build();
                            }
                            bVar.initializeWithMediaSource(this.f16575N.createMediaSource(nfaVarBuild), nfaVarBuild);
                        }
                    }
                    i2++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeUpdateSourceInfo() {
        q1h q1hVar = this.f16583b2;
        C9343mf c9343mf = this.f16584c2;
        if (c9343mf == null || q1hVar == null) {
            return;
        }
        if (c9343mf.f60843b == 0) {
            m11123m(q1hVar);
        } else {
            this.f16584c2 = c9343mf.withAdDurationsUs(getAdDurationsUs());
            m11123m(new rnf(q1hVar, this.f16584c2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdPlaybackState(C9343mf c9343mf) {
        C9343mf c9343mf2 = this.f16584c2;
        if (c9343mf2 == null) {
            b[][] bVarArr = new b[c9343mf.f60843b - (c9343mf.endsWithLivePostrollPlaceHolder() ? 1 : 0)][];
            this.f16585d2 = bVarArr;
            Arrays.fill(bVarArr, new b[0]);
        } else {
            int iCheckValidAdPlaybackStateUpdate = checkValidAdPlaybackStateUpdate(c9343mf2, c9343mf);
            if (iCheckValidAdPlaybackStateUpdate > 0) {
                this.f16585d2 = growAdMediaSourceHolderGrid(this.f16585d2, iCheckValidAdPlaybackStateUpdate);
            }
        }
        this.f16584c2 = c9343mf;
        maybeUpdateAdMediaSources();
        maybeUpdateSourceInfo();
    }

    @Override // p000.um2
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public una.C13612b mo2509r(una.C13612b c13612b, una.C13612b c13612b2) {
        return c13612b.isAd() ? c13612b : c13612b2;
    }

    @Override // p000.um2
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(una.C13612b c13612b, una unaVar, final q1h q1hVar) {
        if (c13612b.isAd()) {
            ((b) v80.checkNotNull(this.f16585d2[c13612b.f88604b][c13612b.f88605c])).handleSourceInfoRefresh(q1hVar);
            maybeUpdateSourceInfo();
        } else {
            v80.checkArgument(q1hVar.getPeriodCount() == 1);
            this.f16583b2 = q1hVar;
            this.f16574M1.post(new Runnable() { // from class: ai
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1626a.lambda$onChildSourceInfoRefreshed$2(q1hVar);
                }
            });
            if (this.f16581Z1) {
                maybeUpdateSourceInfo();
            }
        }
    }

    @Override // p000.una
    public boolean canUpdateMediaItem(nfa nfaVar) {
        return Objects.equals(getAdsConfiguration(getMediaItem()), getAdsConfiguration(nfaVar)) && this.f16572L.canUpdateMediaItem(nfaVar);
    }

    @Override // p000.una
    public mja createPeriod(una.C13612b c13612b, InterfaceC5892fn interfaceC5892fn, long j) {
        if (((C9343mf) v80.checkNotNull(this.f16584c2)).f60843b <= 0 || !c13612b.isAd()) {
            ov9 ov9Var = new ov9(c13612b, interfaceC5892fn, j);
            ov9Var.setMediaSource(this.f16572L);
            ov9Var.createPeriod(c13612b);
            return ov9Var;
        }
        int i = c13612b.f88604b;
        int i2 = c13612b.f88605c;
        b[][] bVarArr = this.f16585d2;
        b[] bVarArr2 = bVarArr[i];
        if (bVarArr2.length <= i2) {
            bVarArr[i] = (b[]) Arrays.copyOf(bVarArr2, i2 + 1);
        }
        b bVar = this.f16585d2[i][i2];
        if (bVar == null) {
            bVar = new b(c13612b);
            this.f16585d2[i][i2] = bVar;
            maybeUpdateAdMediaSources();
        }
        return bVar.createMediaPeriod(c13612b, interfaceC5892fn, j);
    }

    public Object getAdsId() {
        return this.f16580Z;
    }

    @Override // p000.una
    public nfa getMediaItem() {
        return this.f16572L.getMediaItem();
    }

    @Override // p000.um2, p000.fs0
    /* JADX INFO: renamed from: l */
    public void mo2508l(@hib qdh qdhVar) {
        super.mo2508l(qdhVar);
        Handler handlerCreateHandlerForCurrentLooper = t0i.createHandlerForCurrentLooper();
        this.f16586e2 = handlerCreateHandlerForCurrentLooper;
        final d dVar = new d(handlerCreateHandlerForCurrentLooper);
        this.f16582a2 = dVar;
        this.f16583b2 = this.f16572L.getTimeline();
        m23429v(f16571f2, this.f16572L);
        this.f16574M1.post(new Runnable() { // from class: xh
            @Override // java.lang.Runnable
            public final void run() {
                this.f97776a.lambda$prepareSourceInternal$0(dVar);
            }
        });
    }

    @Override // p000.una
    public void releasePeriod(mja mjaVar) {
        ov9 ov9Var = (ov9) mjaVar;
        una.C13612b c13612b = ov9Var.f68941a;
        if (!c13612b.isAd()) {
            ov9Var.releasePeriod();
            return;
        }
        b bVar = (b) v80.checkNotNull(this.f16585d2[c13612b.f88604b][c13612b.f88605c]);
        bVar.releaseMediaPeriod(ov9Var);
        if (bVar.isInactive()) {
            bVar.release();
            this.f16585d2[c13612b.f88604b][c13612b.f88605c] = null;
        }
    }

    @Override // p000.um2, p000.fs0
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        final d dVar = (d) v80.checkNotNull(this.f16582a2);
        this.f16582a2 = null;
        this.f16586e2 = null;
        dVar.stop();
        this.f16583b2 = null;
        this.f16584c2 = null;
        this.f16585d2 = new b[0][];
        this.f16574M1.post(new Runnable() { // from class: bi
            @Override // java.lang.Runnable
            public final void run() {
                this.f13768a.lambda$releaseSourceInternal$1(dVar);
            }
        });
    }

    @Override // p000.una
    public void updateMediaItem(nfa nfaVar) {
        this.f16572L.updateMediaItem(nfaVar);
    }

    public C2317ci(una unaVar, xh3 xh3Var, Object obj, una.InterfaceC13611a interfaceC13611a, InterfaceC13540uh interfaceC13540uh, InterfaceC6849hh interfaceC6849hh, boolean z) {
        this.f16581Z1 = z;
        this.f16572L = new qv9(unaVar, z);
        this.f16573M = ((nfa.C9856h) v80.checkNotNull(unaVar.getMediaItem().f64305b)).f64408c;
        this.f16575N = interfaceC13611a;
        this.f16576Q = interfaceC13540uh;
        this.f16578X = interfaceC6849hh;
        this.f16579Y = xh3Var;
        this.f16580Z = obj;
        this.f16574M1 = new Handler(Looper.getMainLooper());
        this.f16577V1 = new q1h.C11270b();
        this.f16585d2 = new b[0][];
        interfaceC13540uh.setSupportedContentTypes(interfaceC13611a.getSupportedTypes());
    }
}
