package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.InterfaceC1232j;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Comparator;
import p000.dad;
import p000.dy3;
import p000.it0;
import p000.o7h;
import p000.q1e;
import p000.una;
import p000.vy3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class dy3 extends it0<Integer, C5004c> {

    /* JADX INFO: renamed from: j */
    public final q1e f31268j;

    /* JADX INFO: renamed from: k */
    public final o7h f31269k;

    /* JADX INFO: renamed from: l */
    public final oyc f31270l;

    /* JADX INFO: renamed from: m */
    public final dad.C4706b f31271m;

    /* JADX INFO: renamed from: n */
    public final Handler f31272n;

    /* JADX INFO: renamed from: o */
    public final boolean f31273o;

    /* JADX INFO: renamed from: p */
    public boolean f31274p;

    /* JADX INFO: renamed from: dy3$b */
    public static final class C5003b extends it0.AbstractC7590a<Integer, C5004c> {

        /* JADX INFO: renamed from: d */
        public final Context f31275d;

        /* JADX INFO: renamed from: e */
        public oyc f31276e;

        /* JADX INFO: renamed from: f */
        public o7h.InterfaceC10214a f31277f;

        /* JADX INFO: renamed from: g */
        public lfg<up0> f31278g;

        /* JADX INFO: renamed from: h */
        public lfg<v1e> f31279h;

        /* JADX INFO: renamed from: i */
        public lfg<InterfaceC1232j> f31280i;

        /* JADX INFO: renamed from: j */
        public boolean f31281j;

        /* JADX INFO: renamed from: k */
        public boolean f31282k;

        public C5003b(final Context context, hng<Integer, C5004c> hngVar) {
            super(new C5005d(), hngVar, pfg.memoize(new lfg() { // from class: hy3
                @Override // p000.lfg
                public final Object get() {
                    return dy3.C5003b.lambda$new$0(context);
                }
            }));
            this.f31275d = context;
            this.f31276e = new oyc();
            this.f31277f = new o7h.InterfaceC10214a() { // from class: iy3
                @Override // p000.o7h.InterfaceC10214a
                public final o7h createTrackSelector(Context context2) {
                    return new q14(context2);
                }
            };
            this.f31278g = new lfg() { // from class: jy3
                @Override // p000.lfg
                public final Object get() {
                    return ct3.getSingletonInstance(context);
                }
            };
            this.f31279h = pfg.memoize(new lfg() { // from class: ky3
                @Override // p000.lfg
                public final Object get() {
                    return dy3.C5003b.lambda$new$2(context);
                }
            });
            this.f31280i = pfg.memoize(new mb5());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ una.InterfaceC13611a lambda$new$0(Context context) {
            return new xw3(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ v1e lambda$new$2(Context context) {
            return new yy3(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ up0 lambda$setBandwidthMeter$6(up0 up0Var) {
            return up0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ InterfaceC1232j lambda$setLoadControl$5(InterfaceC1232j interfaceC1232j) {
            return interfaceC1232j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ una.InterfaceC13611a lambda$setMediaSourceFactory$3(una.InterfaceC13611a interfaceC13611a) {
            return interfaceC13611a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ v1e lambda$setRenderersFactory$4(v1e v1eVar) {
            return v1eVar;
        }

        public ExoPlayer buildExoPlayer() {
            return buildExoPlayer(new ExoPlayer.C1219b(this.f31275d));
        }

        @op1
        public C5003b setBandwidthMeter(final up0 up0Var) {
            v80.checkState((this.f31281j || this.f31282k) ? false : true);
            this.f31278g = new lfg() { // from class: gy3
                @Override // p000.lfg
                public final Object get() {
                    return dy3.C5003b.lambda$setBandwidthMeter$6(up0Var);
                }
            };
            return this;
        }

        @op1
        public C5003b setLoadControl(final InterfaceC1232j interfaceC1232j) {
            v80.checkState((this.f31281j || this.f31282k) ? false : true);
            this.f31280i = new lfg() { // from class: ey3
                @Override // p000.lfg
                public final Object get() {
                    return dy3.C5003b.lambda$setLoadControl$5(interfaceC1232j);
                }
            };
            return this;
        }

        @op1
        public C5003b setMediaSourceFactory(final una.InterfaceC13611a interfaceC13611a) {
            v80.checkState((this.f31281j || this.f31282k) ? false : true);
            this.f48177c = new lfg() { // from class: ly3
                @Override // p000.lfg
                public final Object get() {
                    return dy3.C5003b.lambda$setMediaSourceFactory$3(interfaceC13611a);
                }
            };
            return this;
        }

        @op1
        public C5003b setPreloadLooper(Looper looper) {
            v80.checkState((this.f31281j || this.f31282k || looper == Looper.getMainLooper()) ? false : true);
            this.f31276e = new oyc(looper);
            return this;
        }

        @op1
        public C5003b setRenderersFactory(final v1e v1eVar) {
            v80.checkState((this.f31281j || this.f31282k) ? false : true);
            this.f31279h = new lfg() { // from class: fy3
                @Override // p000.lfg
                public final Object get() {
                    return dy3.C5003b.lambda$setRenderersFactory$4(v1eVar);
                }
            };
            return this;
        }

        @op1
        public C5003b setTrackSelectorFactory(o7h.InterfaceC10214a interfaceC10214a) {
            v80.checkState((this.f31281j || this.f31282k) ? false : true);
            this.f31277f = interfaceC10214a;
            return this;
        }

        @Override // p000.it0.AbstractC7590a
        /* JADX INFO: renamed from: build, reason: merged with bridge method [inline-methods] */
        public it0<Integer, C5004c> build2() {
            v80.checkState(!this.f31281j);
            this.f31281j = true;
            return new dy3(this);
        }

        public ExoPlayer buildExoPlayer(ExoPlayer.C1219b c1219b) {
            this.f31282k = true;
            return c1219b.setMediaSourceFactory(this.f48177c.get()).setBandwidthMeter(this.f31278g.get()).setRenderersFactory(this.f31279h.get()).setLoadControl(this.f31280i.get()).setPlaybackLooperProvider(this.f31276e).setTrackSelector(this.f31277f.createTrackSelector(this.f31275d)).build();
        }
    }

    /* JADX INFO: renamed from: dy3$c */
    public static final class C5004c {

        /* JADX INFO: renamed from: d */
        public static final int f31283d = 0;

        /* JADX INFO: renamed from: e */
        public static final int f31284e = 1;

        /* JADX INFO: renamed from: f */
        public static final int f31285f = 2;

        /* JADX INFO: renamed from: g */
        public static final C5004c f31286g = new C5004c(0, -9223372036854775807L, 0);

        /* JADX INFO: renamed from: h */
        public static final C5004c f31287h = new C5004c(1, -9223372036854775807L, 0);

        /* JADX INFO: renamed from: a */
        public final int f31288a;

        /* JADX INFO: renamed from: b */
        public final long f31289b;

        /* JADX INFO: renamed from: c */
        public final long f31290c;

        /* JADX INFO: renamed from: dy3$c$a */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        private C5004c(int i, long j, long j2) {
            boolean z = true;
            v80.checkArgument(j == -9223372036854775807L || j >= 0);
            if (j2 != -9223372036854775807L && j2 < 0) {
                z = false;
            }
            v80.checkArgument(z);
            this.f31288a = i;
            this.f31289b = j;
            this.f31290c = j2;
        }

        public static C5004c specifiedRangeLoaded(long j) {
            return new C5004c(2, -9223372036854775807L, j);
        }

        public static C5004c specifiedRangeLoaded(long j, long j2) {
            return new C5004c(2, j, j2);
        }
    }

    /* JADX INFO: renamed from: dy3$d */
    public static final class C5005d implements Comparator<Integer> {

        /* JADX INFO: renamed from: a */
        public int f31291a = -1;

        @Override // java.util.Comparator
        public int compare(Integer num, Integer num2) {
            return Integer.compare(Math.abs(num.intValue() - this.f31291a), Math.abs(num2.intValue() - this.f31291a));
        }
    }

    /* JADX INFO: renamed from: dy3$e */
    public final class C5006e implements dad.InterfaceC4708d {
        private C5006e() {
        }

        private boolean continueOrCompletePreloading(dad dadVar, l8d<C5004c> l8dVar, boolean z) {
            C5004c c5004cM13393h = dy3.this.m13393h(dadVar);
            if (c5004cM13393h == null) {
                dy3.this.m13396k(dadVar);
                return false;
            }
            if (l8dVar.apply((C5004c) v80.checkNotNull(c5004cM13393h))) {
                return true;
            }
            if (z) {
                dy3.this.mo9551g(dadVar);
            }
            dy3.this.m13394i(dadVar);
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onContinueLoadingRequested$2(long j, C5004c c5004c) {
            if (c5004c.f31288a == 2) {
                long j2 = c5004c.f31290c;
                if (j2 != -9223372036854775807L && j2 > t0i.usToMs(j)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onSourcePrepared$0(C5004c c5004c) {
            return c5004c.f31288a > 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onTracksSelected$1(C5004c c5004c) {
            return c5004c.f31288a > 1;
        }

        @Override // p000.dad.InterfaceC4708d
        public boolean onContinueLoadingRequested(dad dadVar, final long j) {
            return continueOrCompletePreloading(dadVar, new l8d() { // from class: oy3
                @Override // p000.l8d
                public final boolean apply(Object obj) {
                    return dy3.C5006e.lambda$onContinueLoadingRequested$2(j, (dy3.C5004c) obj);
                }
            }, false);
        }

        @Override // p000.dad.InterfaceC4708d
        public void onLoadedToTheEndOfSource(dad dadVar) {
            dy3.this.m13394i(dadVar);
        }

        @Override // p000.dad.InterfaceC4708d
        public void onPreloadError(v9d v9dVar, dad dadVar) {
            dy3.this.m13395j(v9dVar, dadVar);
        }

        @Override // p000.dad.InterfaceC4708d
        public boolean onSourcePrepared(dad dadVar) {
            return continueOrCompletePreloading(dadVar, new l8d() { // from class: ny3
                @Override // p000.l8d
                public final boolean apply(Object obj) {
                    return dy3.C5006e.lambda$onSourcePrepared$0((dy3.C5004c) obj);
                }
            }, true);
        }

        @Override // p000.dad.InterfaceC4708d
        public boolean onTracksSelected(dad dadVar) {
            return continueOrCompletePreloading(dadVar, new l8d() { // from class: my3
                @Override // p000.l8d
                public final boolean apply(Object obj) {
                    return dy3.C5006e.lambda$onTracksSelected$1((dy3.C5004c) obj);
                }
            }, false);
        }

        @Override // p000.dad.InterfaceC4708d
        public void onUsedByPlayer(dad dadVar) {
            dy3.this.m13396k(dadVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseInternal$1() {
        this.f31268j.release();
        if (!this.f31273o) {
            this.f31269k.release();
        }
        this.f31270l.releaseLooper();
    }

    @Override // p000.it0
    public una createMediaSourceForPreloading(una unaVar) {
        return this.f31271m.createMediaSource(unaVar);
    }

    @Override // p000.it0
    /* JADX INFO: renamed from: g */
    public void mo9551g(una unaVar) {
        if (this.f31274p) {
            return;
        }
        v80.checkArgument(unaVar instanceof dad);
        ((dad) unaVar).clear();
    }

    @Override // p000.it0
    /* JADX INFO: renamed from: m */
    public void mo9553m() {
        this.f31274p = true;
        this.f31272n.post(new Runnable() { // from class: by3
            @Override // java.lang.Runnable
            public final void run() {
                this.f15189a.lambda$releaseInternal$1();
            }
        });
    }

    @Override // p000.it0
    /* JADX INFO: renamed from: n */
    public void mo9554n(una unaVar) {
        if (this.f31274p) {
            return;
        }
        v80.checkArgument(unaVar instanceof dad);
        ((dad) unaVar).releasePreloadMediaSource();
    }

    @Override // p000.it0
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo9552l(una unaVar, @hib C5004c c5004c) {
        if (this.f31274p) {
            return;
        }
        v80.checkArgument(unaVar instanceof dad);
        dad dadVar = (dad) unaVar;
        if (c5004c != null) {
            dadVar.preload(t0i.msToUs(c5004c.f31289b));
        } else {
            dadVar.clear();
            m13396k(dadVar);
        }
    }

    public void setCurrentPlayingIndex(int i) {
        ((C5005d) this.f48167b).f31291a = i;
    }

    private dy3(C5003b c5003b) {
        super(new C5005d(), c5003b.f48176b, c5003b.f48177c.get());
        vy3 vy3VarCreateRendererCapabilitiesList = new vy3.C14298b((v1e) c5003b.f31279h.get()).createRendererCapabilitiesList();
        this.f31268j = vy3VarCreateRendererCapabilitiesList;
        oyc oycVar = c5003b.f31276e;
        this.f31270l = oycVar;
        o7h o7hVarCreateTrackSelector = c5003b.f31277f.createTrackSelector(c5003b.f31275d);
        this.f31269k = o7hVarCreateTrackSelector;
        up0 up0Var = (up0) c5003b.f31278g.get();
        o7hVarCreateTrackSelector.init(new o7h.InterfaceC10215b() { // from class: cy3
            @Override // p000.o7h.InterfaceC10215b
            public final void onTrackSelectionsInvalidated() {
                dy3.lambda$new$0();
            }
        }, up0Var);
        Looper looperObtainLooper = oycVar.obtainLooper();
        this.f31271m = new dad.C4706b(c5003b.f48177c.get(), new C5006e(), o7hVarCreateTrackSelector, up0Var, vy3VarCreateRendererCapabilitiesList.getRendererCapabilities(), ((InterfaceC1232j) c5003b.f31280i.get()).getAllocator(), looperObtainLooper);
        this.f31272n = t0i.createHandler(looperObtainLooper, null);
        this.f31273o = false;
    }

    @Deprecated
    public dy3(hng<Integer, C5004c> hngVar, una.InterfaceC13611a interfaceC13611a, o7h o7hVar, up0 up0Var, q1e.InterfaceC11268a interfaceC11268a, InterfaceC5892fn interfaceC5892fn, Looper looper) {
        super(new C5005d(), hngVar, interfaceC13611a);
        q1e q1eVarCreateRendererCapabilitiesList = interfaceC11268a.createRendererCapabilitiesList();
        this.f31268j = q1eVarCreateRendererCapabilitiesList;
        oyc oycVar = new oyc(looper);
        this.f31270l = oycVar;
        this.f31269k = o7hVar;
        Looper looperObtainLooper = oycVar.obtainLooper();
        this.f31271m = new dad.C4706b(interfaceC13611a, new C5006e(), o7hVar, up0Var, q1eVarCreateRendererCapabilitiesList.getRendererCapabilities(), interfaceC5892fn, looperObtainLooper);
        this.f31272n = t0i.createHandler(looperObtainLooper, null);
        this.f31273o = true;
    }
}
