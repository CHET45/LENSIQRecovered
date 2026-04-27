package p000;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.exoplayer.C1233k;
import androidx.media3.exoplayer.InterfaceC1255s;
import java.io.IOException;
import java.util.Arrays;
import p000.h62;
import p000.mja;
import p000.q1h;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class dad extends rri {

    /* JADX INFO: renamed from: h2 */
    public static final String f29081h2 = "PreloadMediaSource";

    /* JADX INFO: renamed from: i2 */
    public static final long f29082i2 = 100;

    /* JADX INFO: renamed from: M1 */
    public final Handler f29083M1;

    /* JADX INFO: renamed from: N */
    public final InterfaceC4708d f29084N;

    /* JADX INFO: renamed from: Q */
    public final o7h f29085Q;

    /* JADX INFO: renamed from: V1 */
    public final Handler f29086V1;

    /* JADX INFO: renamed from: X */
    public final up0 f29087X;

    /* JADX INFO: renamed from: Y */
    public final InterfaceC1255s[] f29088Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC5892fn f29089Z;

    /* JADX INFO: renamed from: Z1 */
    public boolean f29090Z1;

    /* JADX INFO: renamed from: a2 */
    public boolean f29091a2;

    /* JADX INFO: renamed from: b2 */
    public long f29092b2;

    /* JADX INFO: renamed from: c2 */
    @hib
    public q1h f29093c2;

    /* JADX INFO: renamed from: d2 */
    @hib
    public Pair<x9d, C4707c> f29094d2;

    /* JADX INFO: renamed from: e2 */
    @hib
    public Pair<x9d, una.C13612b> f29095e2;

    /* JADX INFO: renamed from: f2 */
    public boolean f29096f2;

    /* JADX INFO: renamed from: g2 */
    public boolean f29097g2;

    /* JADX INFO: renamed from: dad$b */
    public static final class C4706b implements una.InterfaceC13611a {

        /* JADX INFO: renamed from: c */
        public final una.InterfaceC13611a f29098c;

        /* JADX INFO: renamed from: d */
        public final Looper f29099d;

        /* JADX INFO: renamed from: e */
        public final InterfaceC5892fn f29100e;

        /* JADX INFO: renamed from: f */
        public final o7h f29101f;

        /* JADX INFO: renamed from: g */
        public final up0 f29102g;

        /* JADX INFO: renamed from: h */
        public final InterfaceC1255s[] f29103h;

        /* JADX INFO: renamed from: i */
        public final InterfaceC4708d f29104i;

        public C4706b(una.InterfaceC13611a interfaceC13611a, InterfaceC4708d interfaceC4708d, o7h o7hVar, up0 up0Var, InterfaceC1255s[] interfaceC1255sArr, InterfaceC5892fn interfaceC5892fn, Looper looper) {
            this.f29098c = interfaceC13611a;
            this.f29104i = interfaceC4708d;
            this.f29101f = o7hVar;
            this.f29102g = up0Var;
            this.f29103h = (InterfaceC1255s[]) Arrays.copyOf(interfaceC1255sArr, interfaceC1255sArr.length);
            this.f29100e = interfaceC5892fn;
            this.f29099d = looper;
        }

        @Override // p000.una.InterfaceC13611a
        public int[] getSupportedTypes() {
            return this.f29098c.getSupportedTypes();
        }

        @Override // p000.una.InterfaceC13611a
        public dad createMediaSource(nfa nfaVar) {
            return new dad(this.f29098c.createMediaSource(nfaVar), this.f29104i, this.f29101f, this.f29102g, this.f29103h, this.f29100e, this.f29099d);
        }

        @Override // p000.una.InterfaceC13611a
        public C4706b setCmcdConfigurationFactory(h62.InterfaceC6721c interfaceC6721c) {
            this.f29098c.setCmcdConfigurationFactory(interfaceC6721c);
            return this;
        }

        @Override // p000.una.InterfaceC13611a
        public C4706b setDrmSessionManagerProvider(sr4 sr4Var) {
            this.f29098c.setDrmSessionManagerProvider(sr4Var);
            return this;
        }

        @Override // p000.una.InterfaceC13611a
        public C4706b setLoadErrorHandlingPolicy(hc9 hc9Var) {
            this.f29098c.setLoadErrorHandlingPolicy(hc9Var);
            return this;
        }

        public dad createMediaSource(una unaVar) {
            return new dad(unaVar, this.f29104i, this.f29101f, this.f29102g, this.f29103h, this.f29100e, this.f29099d);
        }
    }

    /* JADX INFO: renamed from: dad$c */
    public static class C4707c {

        /* JADX INFO: renamed from: a */
        public final una.C13612b f29105a;

        /* JADX INFO: renamed from: b */
        public final Long f29106b;

        public C4707c(una.C13612b c13612b, long j) {
            this.f29105a = c13612b;
            this.f29106b = Long.valueOf(j);
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4707c)) {
                return false;
            }
            C4707c c4707c = (C4707c) obj;
            return dad.mediaPeriodIdEqualsWithoutWindowSequenceNumber(this.f29105a, c4707c.f29105a) && this.f29106b.equals(c4707c.f29106b);
        }

        public int hashCode() {
            int iHashCode = (527 + this.f29105a.f88603a.hashCode()) * 31;
            una.C13612b c13612b = this.f29105a;
            return ((((((iHashCode + c13612b.f88604b) * 31) + c13612b.f88605c) * 31) + c13612b.f88607e) * 31) + this.f29106b.intValue();
        }
    }

    /* JADX INFO: renamed from: dad$d */
    public interface InterfaceC4708d {
        boolean onContinueLoadingRequested(dad dadVar, long j);

        default void onLoadedToTheEndOfSource(dad dadVar) {
        }

        void onPreloadError(v9d v9dVar, dad dadVar);

        boolean onSourcePrepared(dad dadVar);

        boolean onTracksSelected(dad dadVar);

        void onUsedByPlayer(dad dadVar);
    }

    /* JADX INFO: renamed from: dad$e */
    public class C4709e implements mja.InterfaceC9368a {

        /* JADX INFO: renamed from: a */
        public final long f29107a;

        /* JADX INFO: renamed from: b */
        public boolean f29108b;

        public C4709e(long j) {
            this.f29107a = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onContinueLoadingRequested$1(mja mjaVar) {
            if (dad.this.isUsedByPlayer()) {
                return;
            }
            x9d x9dVar = (x9d) mjaVar;
            if (this.f29108b) {
                long bufferedPositionUs = mjaVar.getBufferedPositionUs();
                if (bufferedPositionUs == Long.MIN_VALUE) {
                    dad.this.f29084N.onLoadedToTheEndOfSource(dad.this);
                    dad.this.stopPreloading();
                    return;
                } else if (!dad.this.f29084N.onContinueLoadingRequested(dad.this, bufferedPositionUs - this.f29107a)) {
                    dad.this.stopPreloading();
                    return;
                }
            }
            x9dVar.continueLoading(new C1233k.b().setPlaybackPositionUs(this.f29107a).build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPrepared$0(mja mjaVar) {
            r7h r7hVarSelectTracks;
            if (dad.this.isUsedByPlayer()) {
                return;
            }
            x9d x9dVar = (x9d) mjaVar;
            try {
                r7hVarSelectTracks = dad.this.f29085Q.selectTracks(dad.this.f29088Y, x9dVar.getTrackGroups(), ((C4707c) ((Pair) v80.checkNotNull(dad.this.f29094d2)).second).f29105a, (q1h) v80.checkNotNull(dad.this.f29093c2));
            } catch (aa5 e) {
                xh9.m25145e(dad.f29081h2, "Failed to select tracks", e);
                r7hVarSelectTracks = null;
            }
            if (r7hVarSelectTracks == null) {
                dad.this.stopPreloading();
                return;
            }
            x9dVar.selectTracksForPreloading(r7hVarSelectTracks.f77358c, this.f29107a);
            if (dad.this.f29084N.onTracksSelected(dad.this)) {
                x9dVar.continueLoading(new C1233k.b().setPlaybackPositionUs(this.f29107a).build());
            } else {
                dad.this.stopPreloading();
            }
        }

        @Override // p000.mja.InterfaceC9368a
        public void onPrepared(final mja mjaVar) {
            this.f29108b = true;
            dad.this.f29083M1.post(new Runnable() { // from class: ead
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32357a.lambda$onPrepared$0(mjaVar);
                }
            });
        }

        @Override // p000.yye.InterfaceC15893a
        public void onContinueLoadingRequested(final mja mjaVar) {
            dad.this.f29083M1.post(new Runnable() { // from class: fad
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35939a.lambda$onContinueLoadingRequested$1(mjaVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkForPreloadError() {
        try {
            maybeThrowSourceInfoRefreshError();
            Pair<x9d, C4707c> pair = this.f29094d2;
            if (pair != null) {
                x9d x9dVar = (x9d) pair.first;
                if (x9dVar.f97301b) {
                    x9dVar.maybeThrowStreamError();
                } else {
                    x9dVar.maybeThrowPrepareError();
                }
            }
            this.f29083M1.postDelayed(new Runnable() { // from class: aad
                @Override // java.lang.Runnable
                public final void run() {
                    this.f838a.checkForPreloadError();
                }
            }, 100L);
        } catch (IOException e) {
            this.f29084N.onPreloadError(new v9d(getMediaItem(), null, e), this);
            stopPreloading();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isUsedByPlayer() {
        return m11122k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clear$1() {
        Pair<x9d, C4707c> pair = this.f29094d2;
        if (pair != null) {
            this.f79175L.releasePeriod(((x9d) pair.first).f97300a);
            this.f29094d2 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onChildSourceInfoRefreshed$2(q1h q1hVar) {
        if (isUsedByPlayer() || this.f29096f2) {
            return;
        }
        this.f29096f2 = true;
        if (!this.f29084N.onSourcePrepared(this)) {
            stopPreloading();
        } else {
            Pair<Object, Long> periodPositionUs = q1hVar.getPeriodPositionUs(new q1h.C11272d(), new q1h.C11270b(), 0, this.f29092b2);
            createPeriod(new una.C13612b(periodPositionUs.first), this.f29089Z, ((Long) periodPositionUs.second).longValue()).preload(new C4709e(((Long) periodPositionUs.second).longValue()), ((Long) periodPositionUs.second).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$preload$0(long j) {
        this.f29090Z1 = true;
        this.f29092b2 = j;
        this.f29096f2 = false;
        if (isUsedByPlayer()) {
            onUsedByPlayer();
            return;
        }
        m11124n(j0d.f49299d);
        mo2508l(this.f29087X.getTransferListener());
        checkForPreloadError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releasePreloadMediaSource$3() {
        this.f29090Z1 = false;
        this.f29092b2 = -9223372036854775807L;
        this.f29096f2 = false;
        Pair<x9d, C4707c> pair = this.f29094d2;
        if (pair != null) {
            this.f79175L.releasePeriod(((x9d) pair.first).f97300a);
            this.f29094d2 = null;
        }
        releaseSourceInternal();
        this.f29083M1.removeCallbacksAndMessages(null);
        this.f29086V1.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean mediaPeriodIdEqualsWithoutWindowSequenceNumber(una.C13612b c13612b, una.C13612b c13612b2) {
        return c13612b.f88603a.equals(c13612b2.f88603a) && c13612b.f88604b == c13612b2.f88604b && c13612b.f88605c == c13612b2.f88605c && c13612b.f88607e == c13612b2.f88607e;
    }

    private void onUsedByPlayer() {
        this.f29084N.onUsedByPlayer(this);
        stopPreloading();
        this.f29097g2 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopPreloading() {
        this.f29083M1.removeCallbacksAndMessages(null);
    }

    @Override // p000.rri
    /* JADX INFO: renamed from: F */
    public void mo9030F(final q1h q1hVar) {
        this.f29093c2 = q1hVar;
        m11123m(q1hVar);
        this.f29083M1.post(new Runnable() { // from class: cad
            @Override // java.lang.Runnable
            public final void run() {
                this.f16114a.lambda$onChildSourceInfoRefreshed$2(q1hVar);
            }
        });
    }

    public void clear() {
        t0i.postOrRun(this.f29083M1, new Runnable() { // from class: z9d
            @Override // java.lang.Runnable
            public final void run() {
                this.f104501a.lambda$clear$1();
            }
        });
    }

    public void preload(final long j) {
        this.f29083M1.post(new Runnable() { // from class: bad
            @Override // java.lang.Runnable
            public final void run() {
                this.f13184a.lambda$preload$0(j);
            }
        });
    }

    @Override // p000.rri
    public void prepareSourceInternal() {
        v80.checkState(Looper.myLooper() == this.f29083M1.getLooper());
        if (isUsedByPlayer() && !this.f29097g2) {
            onUsedByPlayer();
        }
        q1h q1hVar = this.f29093c2;
        if (q1hVar != null) {
            mo9030F(q1hVar);
        } else {
            if (this.f29091a2) {
                return;
            }
            this.f29091a2 = true;
            m21501H();
        }
    }

    @Override // p000.rri, p000.una
    public void releasePeriod(mja mjaVar) {
        x9d x9dVar = (x9d) mjaVar;
        Pair<x9d, C4707c> pair = this.f29094d2;
        if (pair == null || x9dVar != ((Pair) v80.checkNotNull(pair)).first) {
            Pair<x9d, una.C13612b> pair2 = this.f29095e2;
            if (pair2 != null && x9dVar == ((Pair) v80.checkNotNull(pair2)).first) {
                this.f29095e2 = null;
            }
        } else {
            this.f29094d2 = null;
        }
        this.f79175L.releasePeriod(x9dVar.f97300a);
    }

    public void releasePreloadMediaSource() {
        this.f29086V1.post(new Runnable() { // from class: y9d
            @Override // java.lang.Runnable
            public final void run() {
                this.f100879a.lambda$releasePreloadMediaSource$3();
            }
        });
    }

    @Override // p000.um2, p000.fs0
    public void releaseSourceInternal() {
        if (isUsedByPlayer()) {
            return;
        }
        this.f29097g2 = false;
        if (this.f29090Z1) {
            return;
        }
        this.f29093c2 = null;
        this.f29091a2 = false;
        super.releaseSourceInternal();
    }

    @Override // p000.rri
    /* JADX INFO: renamed from: z */
    public una.C13612b mo9031z(una.C13612b c13612b) {
        Pair<x9d, una.C13612b> pair = this.f29095e2;
        return (pair == null || !mediaPeriodIdEqualsWithoutWindowSequenceNumber(c13612b, (una.C13612b) ((Pair) v80.checkNotNull(pair)).second)) ? c13612b : (una.C13612b) ((Pair) v80.checkNotNull(this.f29095e2)).second;
    }

    private dad(una unaVar, InterfaceC4708d interfaceC4708d, o7h o7hVar, up0 up0Var, InterfaceC1255s[] interfaceC1255sArr, InterfaceC5892fn interfaceC5892fn, Looper looper) {
        super(unaVar);
        this.f29084N = interfaceC4708d;
        this.f29085Q = o7hVar;
        this.f29087X = up0Var;
        this.f29088Y = interfaceC1255sArr;
        this.f29089Z = interfaceC5892fn;
        this.f29083M1 = t0i.createHandler(looper, null);
        this.f29086V1 = t0i.createHandler(looper, null);
        this.f29092b2 = -9223372036854775807L;
    }

    @Override // p000.rri, p000.una
    public x9d createPeriod(una.C13612b c13612b, InterfaceC5892fn interfaceC5892fn, long j) {
        C4707c c4707c = new C4707c(c13612b, j);
        Pair<x9d, C4707c> pair = this.f29094d2;
        if (pair != null && c4707c.equals(pair.second)) {
            x9d x9dVar = (x9d) ((Pair) v80.checkNotNull(this.f29094d2)).first;
            if (isUsedByPlayer()) {
                this.f29094d2 = null;
                this.f29095e2 = new Pair<>(x9dVar, c13612b);
            }
            return x9dVar;
        }
        Pair<x9d, C4707c> pair2 = this.f29094d2;
        if (pair2 != null) {
            this.f79175L.releasePeriod(((x9d) ((Pair) v80.checkNotNull(pair2)).first).f97300a);
            this.f29094d2 = null;
        }
        x9d x9dVar2 = new x9d(this.f79175L.createPeriod(c13612b, interfaceC5892fn, j));
        if (!isUsedByPlayer()) {
            this.f29094d2 = new Pair<>(x9dVar2, c4707c);
        }
        return x9dVar2;
    }
}
