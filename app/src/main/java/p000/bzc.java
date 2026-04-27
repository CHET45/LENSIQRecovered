package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.common.C1213a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import p000.a7i;
import p000.bzc;
import p000.p7e;
import p000.r6i;
import p000.x67;
import p000.x7i;

/* JADX INFO: loaded from: classes3.dex */
@ovh
@p7e({p7e.EnumC10826a.f69935b})
public final class bzc implements a7i.InterfaceC0087b {

    /* JADX INFO: renamed from: B */
    public static final String f15312B = "PlaybackVidGraphWrapper";

    /* JADX INFO: renamed from: C */
    public static final int f15313C = 0;

    /* JADX INFO: renamed from: D */
    public static final int f15314D = 1;

    /* JADX INFO: renamed from: E */
    public static final int f15315E = 2;

    /* JADX INFO: renamed from: F */
    public static final int f15316F = 0;

    /* JADX INFO: renamed from: G */
    public static final Executor f15317G = new Executor() { // from class: zyc
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            bzc.lambda$static$0(runnable);
        }
    };

    /* JADX INFO: renamed from: A */
    public int f15318A;

    /* JADX INFO: renamed from: a */
    public final Context f15319a;

    /* JADX INFO: renamed from: b */
    public final a7i.InterfaceC0086a f15320b;

    /* JADX INFO: renamed from: c */
    public final SparseArray<C2124d> f15321c;

    /* JADX INFO: renamed from: d */
    public final boolean f15322d;

    /* JADX INFO: renamed from: e */
    public final x7i f15323e;

    /* JADX INFO: renamed from: f */
    public final x7i.InterfaceC14975d f15324f;

    /* JADX INFO: renamed from: g */
    public final j52 f15325g;

    /* JADX INFO: renamed from: h */
    public final CopyOnWriteArraySet<InterfaceC2125e> f15326h;

    /* JADX INFO: renamed from: i */
    public m1h<C2129i> f15327i;

    /* JADX INFO: renamed from: j */
    public C1213a f15328j;

    /* JADX INFO: renamed from: k */
    public d6i f15329k;

    /* JADX INFO: renamed from: l */
    public kx7<ix4> f15330l;

    /* JADX INFO: renamed from: m */
    public oe7 f15331m;

    /* JADX INFO: renamed from: n */
    public a7i f15332n;

    /* JADX INFO: renamed from: o */
    public o6i f15333o;

    /* JADX INFO: renamed from: p */
    public boolean f15334p;

    /* JADX INFO: renamed from: q */
    public boolean f15335q;

    /* JADX INFO: renamed from: r */
    public long f15336r;

    /* JADX INFO: renamed from: s */
    public int f15337s;

    /* JADX INFO: renamed from: t */
    @hib
    public Pair<Surface, xpf> f15338t;

    /* JADX INFO: renamed from: u */
    public int f15339u;

    /* JADX INFO: renamed from: v */
    public int f15340v;

    /* JADX INFO: renamed from: w */
    public long f15341w;

    /* JADX INFO: renamed from: x */
    public long f15342x;

    /* JADX INFO: renamed from: y */
    public boolean f15343y;

    /* JADX INFO: renamed from: z */
    public int f15344z;

    /* JADX INFO: renamed from: bzc$a */
    public class C2121a implements x7i.InterfaceC14975d {
        public C2121a() {
        }

        @Override // p000.x7i.InterfaceC14975d
        public void render(long j) {
            ((a7i) v80.checkStateNotNull(bzc.this.f15332n)).renderOutputFrame(j);
        }

        @Override // p000.x7i.InterfaceC14975d
        public void skip() {
            ((a7i) v80.checkStateNotNull(bzc.this.f15332n)).renderOutputFrame(-2L);
        }
    }

    /* JADX INFO: renamed from: bzc$b */
    public static final class C2122b {

        /* JADX INFO: renamed from: a */
        public final Context f15346a;

        /* JADX INFO: renamed from: b */
        public final t6i f15347b;

        /* JADX INFO: renamed from: c */
        public a7i.InterfaceC0086a f15348c;

        /* JADX INFO: renamed from: d */
        public boolean f15349d;

        /* JADX INFO: renamed from: e */
        public j52 f15350e = j52.f49539a;

        /* JADX INFO: renamed from: f */
        public boolean f15351f;

        /* JADX INFO: renamed from: g */
        public boolean f15352g;

        public C2122b(Context context, t6i t6iVar) {
            this.f15346a = context.getApplicationContext();
            this.f15347b = t6iVar;
        }

        public bzc build() {
            v80.checkState(!this.f15351f);
            if (this.f15348c == null) {
                this.f15348c = new C2127g(this.f15352g);
            }
            bzc bzcVar = new bzc(this, null);
            this.f15351f = true;
            return bzcVar;
        }

        @op1
        public C2122b setClock(j52 j52Var) {
            this.f15350e = j52Var;
            return this;
        }

        @op1
        public C2122b setEnablePlaylistMode(boolean z) {
            this.f15349d = z;
            return this;
        }

        @op1
        public C2122b setEnableReplayableCache(boolean z) {
            this.f15352g = z;
            return this;
        }

        @op1
        public C2122b setVideoGraphFactory(a7i.InterfaceC0086a interfaceC0086a) {
            this.f15348c = interfaceC0086a;
            return this;
        }
    }

    /* JADX INFO: renamed from: bzc$c */
    public final class C2123c implements x7i.InterfaceC14974c {
        private C2123c() {
        }

        @Override // p000.x7i.InterfaceC14974c
        public void onError(x7i.C14976e c14976e) {
            Iterator it = bzc.this.f15326h.iterator();
            while (it.hasNext()) {
                ((InterfaceC2125e) it.next()).onError(q6i.from(c14976e));
            }
        }

        @Override // p000.x7i.InterfaceC14974c
        public void onFirstFrameRendered() {
            Iterator it = bzc.this.f15326h.iterator();
            while (it.hasNext()) {
                ((InterfaceC2125e) it.next()).onFirstFrameRendered();
            }
        }

        @Override // p000.x7i.InterfaceC14974c
        public void onFrameDropped() {
            Iterator it = bzc.this.f15326h.iterator();
            while (it.hasNext()) {
                ((InterfaceC2125e) it.next()).onFrameDropped();
            }
        }

        @Override // p000.x7i.InterfaceC14974c
        public void onVideoSizeChanged(a8i a8iVar) {
            Iterator it = bzc.this.f15326h.iterator();
            while (it.hasNext()) {
                ((InterfaceC2125e) it.next()).onVideoSizeChanged(a8iVar);
            }
        }

        public /* synthetic */ C2123c(bzc bzcVar, C2121a c2121a) {
            this();
        }
    }

    /* JADX INFO: renamed from: bzc$d */
    public final class C2124d implements x7i, InterfaceC2125e {

        /* JADX INFO: renamed from: f */
        public final int f15354f;

        /* JADX INFO: renamed from: g */
        public final int f15355g;

        /* JADX INFO: renamed from: i */
        @hib
        public C1213a f15357i;

        /* JADX INFO: renamed from: j */
        public int f15358j;

        /* JADX INFO: renamed from: k */
        public long f15359k;

        /* JADX INFO: renamed from: o */
        public boolean f15363o;

        /* JADX INFO: renamed from: p */
        public boolean f15364p;

        /* JADX INFO: renamed from: h */
        public kx7<ix4> f15356h = kx7.m15110of();

        /* JADX INFO: renamed from: l */
        public long f15360l = -9223372036854775807L;

        /* JADX INFO: renamed from: m */
        public x7i.InterfaceC14974c f15361m = x7i.InterfaceC14974c.f97122a;

        /* JADX INFO: renamed from: n */
        public Executor f15362n = bzc.f15317G;

        public C2124d(Context context, int i) {
            this.f15355g = i;
            this.f15354f = t0i.getMaxPendingFramesCountForMediaCodecDecoders(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onError$1(x7i.InterfaceC14974c interfaceC14974c, q6i q6iVar) {
            interfaceC14974c.onError(new x7i.C14976e(q6iVar, (C1213a) v80.checkStateNotNull(this.f15357i)));
        }

        private void registerInputStream(C1213a c1213a) {
            ((a7i) v80.checkNotNull(bzc.this.f15332n)).registerInputStream(this.f15355g, this.f15358j == 1 ? 1 : 2, c1213a.buildUpon().setColorInfo(bzc.this.getAdjustedInputColorInfo(c1213a.f8264E)).build(), this.f15356h, 0L);
        }

        @Override // p000.x7i
        public void allowReleaseFirstFrameBeforeStarted() {
            if (bzc.this.f15327i.size() == 0) {
                bzc.this.allowReleaseFirstFrameBeforeStarted();
                return;
            }
            m1h m1hVar = new m1h();
            boolean z = true;
            while (bzc.this.f15327i.size() > 0) {
                C2129i c2129i = (C2129i) v80.checkNotNull((C2129i) bzc.this.f15327i.pollFirst());
                if (z) {
                    int i = c2129i.f15372b;
                    if (i == 0 || i == 1) {
                        c2129i = new C2129i(c2129i.f15371a, 0, c2129i.f15373c);
                    } else {
                        bzc.this.allowReleaseFirstFrameBeforeStarted();
                    }
                    z = false;
                }
                m1hVar.add(c2129i.f15373c, c2129i);
            }
            bzc.this.f15327i = m1hVar;
        }

        @Override // p000.x7i
        public void clearOutputSurfaceInfo() {
            bzc.this.clearOutputSurfaceInfo();
        }

        @Override // p000.x7i
        public void flush(boolean z) {
            if (isInitialized()) {
                ((a7i) v80.checkNotNull(bzc.this.f15332n)).flush();
            }
            this.f15360l = -9223372036854775807L;
            bzc.this.flush(z);
            this.f15363o = false;
        }

        @Override // p000.x7i
        public Surface getInputSurface() {
            v80.checkState(isInitialized());
            return ((a7i) v80.checkNotNull(bzc.this.f15332n)).getInputSurface(this.f15355g);
        }

        @Override // p000.x7i
        public boolean handleInputBitmap(Bitmap bitmap, j2h j2hVar) {
            v80.checkState(isInitialized());
            if (!bzc.this.shouldRenderToInputVideoSink()) {
                return false;
            }
            C2128h c2128h = new C2128h(j2hVar, this.f15359k);
            if (!((a7i) v80.checkNotNull(bzc.this.f15332n)).queueInputBitmap(this.f15355g, bitmap, c2128h)) {
                return false;
            }
            long lastTimestampUs = c2128h.getLastTimestampUs();
            v80.checkState(lastTimestampUs != -9223372036854775807L);
            this.f15360l = lastTimestampUs;
            return true;
        }

        @Override // p000.x7i
        public boolean handleInputFrame(long j, x7i.InterfaceC14975d interfaceC14975d) {
            v80.checkState(isInitialized());
            if (!bzc.this.shouldRenderToInputVideoSink() || ((a7i) v80.checkNotNull(bzc.this.f15332n)).getPendingInputFrameCount(this.f15355g) >= this.f15354f || !((a7i) v80.checkNotNull(bzc.this.f15332n)).registerInputFrame(this.f15355g)) {
                return false;
            }
            long j2 = j + this.f15359k;
            this.f15360l = j2;
            interfaceC14975d.render(j2 * 1000);
            return true;
        }

        @Override // p000.x7i
        public boolean initialize(C1213a c1213a) throws x7i.C14976e {
            v80.checkState(!isInitialized());
            boolean zRegisterInput = bzc.this.registerInput(c1213a, this.f15355g);
            this.f15364p = zRegisterInput;
            return zRegisterInput;
        }

        @Override // p000.x7i
        public boolean isEnded() {
            return isInitialized() && bzc.this.isEnded();
        }

        @Override // p000.x7i
        public boolean isInitialized() {
            return this.f15364p;
        }

        @Override // p000.x7i
        public boolean isReady(boolean z) {
            return bzc.this.isReady(z && isInitialized());
        }

        @Override // p000.x7i
        public void join(boolean z) {
            if (bzc.this.f15322d) {
                bzc.this.joinPlayback(z);
            }
        }

        @Override // p000.bzc.InterfaceC2125e
        public void onError(final q6i q6iVar) {
            final x7i.InterfaceC14974c interfaceC14974c = this.f15361m;
            this.f15362n.execute(new Runnable() { // from class: czc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28116a.lambda$onError$1(interfaceC14974c, q6iVar);
                }
            });
        }

        @Override // p000.bzc.InterfaceC2125e
        public void onFirstFrameRendered() {
            final x7i.InterfaceC14974c interfaceC14974c = this.f15361m;
            Executor executor = this.f15362n;
            Objects.requireNonNull(interfaceC14974c);
            executor.execute(new Runnable() { // from class: ezc
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC14974c.onFirstFrameRendered();
                }
            });
        }

        @Override // p000.bzc.InterfaceC2125e
        public void onFrameAvailableForRendering() {
            final x7i.InterfaceC14974c interfaceC14974c = this.f15361m;
            Executor executor = this.f15362n;
            Objects.requireNonNull(interfaceC14974c);
            executor.execute(new Runnable() { // from class: gzc
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC14974c.onFrameAvailableForRendering();
                }
            });
        }

        @Override // p000.bzc.InterfaceC2125e
        public void onFrameDropped() {
            final x7i.InterfaceC14974c interfaceC14974c = this.f15361m;
            Executor executor = this.f15362n;
            Objects.requireNonNull(interfaceC14974c);
            executor.execute(new Runnable() { // from class: dzc
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC14974c.onFrameDropped();
                }
            });
        }

        @Override // p000.x7i
        public void onInputStreamChanged(int i, C1213a c1213a, long j, int i2, List<ix4> list) {
            v80.checkState(isInitialized());
            this.f15356h = kx7.copyOf((Collection) list);
            this.f15358j = i;
            this.f15357i = c1213a;
            bzc.this.f15342x = -9223372036854775807L;
            bzc.this.f15343y = false;
            registerInputStream(c1213a);
            boolean z = this.f15360l == -9223372036854775807L;
            if (bzc.this.f15322d || (this.f15355g == 0 && z)) {
                long j2 = z ? -4611686018427387904L : this.f15360l + 1;
                bzc.this.f15327i.add(j2, new C2129i(j + this.f15359k, i2, j2));
            }
        }

        @Override // p000.bzc.InterfaceC2125e
        public void onVideoSizeChanged(final a8i a8iVar) {
            final x7i.InterfaceC14974c interfaceC14974c = this.f15361m;
            this.f15362n.execute(new Runnable() { // from class: fzc
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC14974c.onVideoSizeChanged(a8iVar);
                }
            });
        }

        @Override // p000.x7i
        public void redraw() {
            if (isInitialized()) {
                boolean z = this.f15363o;
                long j = bzc.this.f15341w;
                bzc.this.flush(false);
                ((a7i) v80.checkNotNull(bzc.this.f15332n)).redraw();
                bzc.this.f15341w = j;
                if (z) {
                    signalEndOfCurrentInputStream();
                }
            }
        }

        @Override // p000.x7i
        public void release() {
            bzc.this.release();
        }

        @Override // p000.x7i
        public void render(long j, long j2) throws x7i.C14976e {
            bzc.this.render(j + this.f15359k, j2);
        }

        @Override // p000.x7i
        public void setBufferTimestampAdjustmentUs(long j) {
            this.f15359k = j;
        }

        @Override // p000.x7i
        public void setChangeFrameRateStrategy(int i) {
            if (this.f15355g == 0) {
                bzc.this.setChangeFrameRateStrategy(i);
            }
        }

        @Override // p000.x7i
        public void setListener(x7i.InterfaceC14974c interfaceC14974c, Executor executor) {
            this.f15361m = interfaceC14974c;
            this.f15362n = executor;
        }

        @Override // p000.x7i
        public void setOutputSurfaceInfo(Surface surface, xpf xpfVar) {
            bzc.this.setOutputSurfaceInfo(surface, xpfVar);
        }

        @Override // p000.x7i
        public void setPlaybackSpeed(@y46(from = 0.0d, fromInclusive = false) float f) {
            if (this.f15355g == 0) {
                bzc.this.setPlaybackSpeed(f);
            }
        }

        @Override // p000.x7i
        public void setVideoEffects(List<ix4> list) {
            if (this.f15356h.equals(list)) {
                return;
            }
            this.f15356h = kx7.copyOf((Collection) list);
            C1213a c1213a = this.f15357i;
            if (c1213a != null) {
                registerInputStream(c1213a);
            }
        }

        @Override // p000.x7i
        public void setVideoFrameMetadataListener(o6i o6iVar) {
            if (this.f15355g == 0) {
                bzc.this.setVideoFrameMetadataListener(o6iVar);
            }
        }

        @Override // p000.x7i
        public void signalEndOfCurrentInputStream() {
            bzc.this.f15342x = this.f15360l;
            if (bzc.this.f15341w >= bzc.this.f15342x) {
                bzc.this.signalEndOfVideoGraphOutputStream();
            }
        }

        @Override // p000.x7i
        public void signalEndOfInput() {
            if (!this.f15363o && isInitialized()) {
                ((a7i) v80.checkNotNull(bzc.this.f15332n)).signalEndOfInput(this.f15355g);
                this.f15363o = true;
            }
        }

        @Override // p000.x7i
        public void startRendering() {
            if (bzc.this.f15322d) {
                bzc.this.startRendering();
            }
        }

        @Override // p000.x7i
        public void stopRendering() {
            if (bzc.this.f15322d) {
                bzc.this.stopRendering();
            }
        }
    }

    /* JADX INFO: renamed from: bzc$e */
    public interface InterfaceC2125e {
        default void onError(q6i q6iVar) {
        }

        default void onFirstFrameRendered() {
        }

        default void onFrameAvailableForRendering() {
        }

        default void onFrameDropped() {
        }

        default void onVideoSizeChanged(a8i a8iVar) {
        }
    }

    /* JADX INFO: renamed from: bzc$f */
    public static final class C2126f implements r6i.InterfaceC11909b {

        /* JADX INFO: renamed from: b */
        public static final lfg<Class<?>> f15366b = pfg.memoize(new lfg() { // from class: hzc
            @Override // p000.lfg
            public final Object get() {
                return bzc.C2126f.lambda$static$0();
            }
        });

        /* JADX INFO: renamed from: a */
        public final boolean f15367a;

        public C2126f(boolean z) {
            this.f15367a = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Class lambda$static$0() {
            try {
                return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // p000.r6i.InterfaceC11909b
        public r6i create(Context context, sk3 sk3Var, e92 e92Var, boolean z, Executor executor, r6i.InterfaceC11911d interfaceC11911d) throws q6i {
            try {
                Class<?> cls = f15366b.get();
                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                cls.getMethod("setEnableReplayableCache", Boolean.TYPE).invoke(objNewInstance, Boolean.valueOf(this.f15367a));
                return ((r6i.InterfaceC11909b) v80.checkNotNull(cls.getMethod(ocd.f67208g, null).invoke(objNewInstance, null))).create(context, sk3Var, e92Var, z, executor, interfaceC11911d);
            } catch (Exception e) {
                throw new q6i(e);
            }
        }
    }

    /* JADX INFO: renamed from: bzc$g */
    public static final class C2127g implements a7i.InterfaceC0086a {

        /* JADX INFO: renamed from: a */
        public final r6i.InterfaceC11909b f15368a;

        public C2127g(boolean z) {
            this.f15368a = new C2126f(z);
        }

        @Override // p000.a7i.InterfaceC0086a
        public a7i create(Context context, e92 e92Var, sk3 sk3Var, a7i.InterfaceC0087b interfaceC0087b, Executor executor, long j, boolean z) {
            try {
                try {
                    return ((a7i.InterfaceC0086a) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(r6i.InterfaceC11909b.class).newInstance(this.f15368a)).create(context, e92Var, sk3Var, interfaceC0087b, executor, j, z);
                } catch (Exception e) {
                    e = e;
                    throw new IllegalStateException(e);
                }
            } catch (Exception e2) {
                e = e2;
            }
        }

        @Override // p000.a7i.InterfaceC0086a
        public boolean supportsMultipleInputs() {
            return false;
        }
    }

    /* JADX INFO: renamed from: bzc$h */
    public static final class C2128h implements j2h {

        /* JADX INFO: renamed from: a */
        public final j2h f15369a;

        /* JADX INFO: renamed from: b */
        public final long f15370b;

        public C2128h(j2h j2hVar, long j) {
            this.f15369a = j2hVar;
            this.f15370b = j;
        }

        @Override // p000.j2h
        public j2h copyOf() {
            return new C2128h(this.f15369a.copyOf(), this.f15370b);
        }

        @Override // p000.j2h
        public long getLastTimestampUs() {
            long lastTimestampUs = this.f15369a.getLastTimestampUs();
            if (lastTimestampUs == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f15370b + lastTimestampUs;
        }

        @Override // p000.j2h
        public boolean hasNext() {
            return this.f15369a.hasNext();
        }

        @Override // p000.j2h
        public long next() {
            return this.f15369a.next() + this.f15370b;
        }
    }

    /* JADX INFO: renamed from: bzc$i */
    public static final class C2129i {

        /* JADX INFO: renamed from: a */
        public final long f15371a;

        /* JADX INFO: renamed from: b */
        public final int f15372b;

        /* JADX INFO: renamed from: c */
        public final long f15373c;

        public C2129i(long j, int i, long j2) {
            this.f15371a = j;
            this.f15372b = i;
            this.f15373c = j2;
        }
    }

    public /* synthetic */ bzc(C2122b c2122b, C2121a c2121a) {
        this(c2122b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void allowReleaseFirstFrameBeforeStarted() {
        this.f15323e.allowReleaseFirstFrameBeforeStarted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flush(boolean z) {
        if (isInitialized()) {
            this.f15339u++;
            this.f15323e.flush(z);
            while (this.f15327i.size() > 1) {
                this.f15327i.pollFirst();
            }
            if (this.f15327i.size() == 1) {
                C2129i c2129i = (C2129i) v80.checkNotNull(this.f15327i.pollFirst());
                this.f15336r = c2129i.f15371a;
                this.f15337s = c2129i.f15372b;
                onOutputStreamChanged();
            }
            this.f15341w = -9223372036854775807L;
            this.f15342x = -9223372036854775807L;
            this.f15343y = false;
            ((oe7) v80.checkStateNotNull(this.f15331m)).post(new Runnable() { // from class: yyc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f103472a.lambda$flush$1();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e92 getAdjustedInputColorInfo(@hib e92 e92Var) {
        return (e92Var == null || !e92Var.isDataSpaceValid() || this.f15335q) ? e92.f32165h : e92Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEnded() {
        return this.f15339u == 0 && this.f15343y && this.f15323e.isEnded();
    }

    private boolean isInitialized() {
        return this.f15340v == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isReady(boolean z) {
        return this.f15323e.isReady(z && this.f15339u == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void joinPlayback(boolean z) {
        this.f15323e.join(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$flush$1() {
        this.f15339u--;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Runnable runnable) {
    }

    private void maybeSetOutputSurfaceInfo(@hib Surface surface, int i, int i2) {
        a7i a7iVar = this.f15332n;
        if (a7iVar == null) {
            return;
        }
        if (surface != null) {
            a7iVar.setOutputSurfaceInfo(new ngg(surface, i, i2));
            this.f15323e.setOutputSurfaceInfo(surface, new xpf(i, i2));
        } else {
            a7iVar.setOutputSurfaceInfo(null);
            this.f15323e.clearOutputSurfaceInfo();
        }
    }

    private void onOutputStreamChanged() {
        this.f15323e.onInputStreamChanged(1, this.f15328j, this.f15336r, this.f15337s, kx7.m15110of());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean registerInput(C1213a c1213a, int i) throws x7i.C14976e {
        if (i == 0) {
            v80.checkState(this.f15340v == 0);
            e92 adjustedInputColorInfo = getAdjustedInputColorInfo(c1213a.f8264E);
            try {
                if (this.f15334p) {
                    adjustedInputColorInfo = e92.f32165h;
                } else if (adjustedInputColorInfo.f32175c == 7 && Build.VERSION.SDK_INT < 34 && x67.isBt2020PqExtensionSupported()) {
                    adjustedInputColorInfo = adjustedInputColorInfo.buildUpon().setColorTransfer(6).build();
                } else if (!x67.isColorTransferSupported(adjustedInputColorInfo.f32175c) && Build.VERSION.SDK_INT >= 29) {
                    xh9.m25148w(f15312B, t0i.formatInvariant("Color transfer %d is not supported. Falling back to OpenGl tone mapping.", Integer.valueOf(adjustedInputColorInfo.f32175c)));
                    adjustedInputColorInfo = e92.f32165h;
                }
                e92 e92Var = adjustedInputColorInfo;
                C2121a c2121a = null;
                final oe7 oe7VarCreateHandler = this.f15325g.createHandler((Looper) v80.checkStateNotNull(Looper.myLooper()), null);
                this.f15331m = oe7VarCreateHandler;
                try {
                    a7i.InterfaceC0086a interfaceC0086a = this.f15320b;
                    Context context = this.f15319a;
                    sk3 sk3Var = sk3.f82099a;
                    Objects.requireNonNull(oe7VarCreateHandler);
                    a7i a7iVarCreate = interfaceC0086a.create(context, e92Var, sk3Var, this, new Executor() { // from class: azc
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            oe7VarCreateHandler.post(runnable);
                        }
                    }, 0L, false);
                    this.f15332n = a7iVarCreate;
                    a7iVarCreate.setCompositionEffects(this.f15330l);
                    this.f15332n.setCompositorSettings(this.f15329k);
                    this.f15332n.initialize();
                    Pair<Surface, xpf> pair = this.f15338t;
                    if (pair != null) {
                        Surface surface = (Surface) pair.first;
                        xpf xpfVar = (xpf) pair.second;
                        maybeSetOutputSurfaceInfo(surface, xpfVar.getWidth(), xpfVar.getHeight());
                    }
                    this.f15323e.initialize(c1213a);
                    x7i x7iVar = this.f15323e;
                    C2123c c2123c = new C2123c(this, c2121a);
                    final oe7 oe7Var = this.f15331m;
                    Objects.requireNonNull(oe7Var);
                    x7iVar.setListener(c2123c, new Executor() { // from class: azc
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            oe7Var.post(runnable);
                        }
                    });
                    this.f15340v = 1;
                } catch (q6i e) {
                    throw new x7i.C14976e(e, c1213a);
                }
            } catch (x67.C14938a e2) {
                throw new x7i.C14976e(e2, c1213a);
            }
        } else if (!isInitialized()) {
            return false;
        }
        try {
            ((a7i) v80.checkNotNull(this.f15332n)).registerInput(i);
            this.f15318A++;
            return true;
        } catch (q6i e3) {
            throw new x7i.C14976e(e3, c1213a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(long j, long j2) throws x7i.C14976e {
        this.f15323e.render(j, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeFrameRateStrategy(int i) {
        this.f15323e.setChangeFrameRateStrategy(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        this.f15323e.setPlaybackSpeed(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoFrameMetadataListener(o6i o6iVar) {
        this.f15333o = o6iVar;
        this.f15323e.setVideoFrameMetadataListener(o6iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldRenderToInputVideoSink() {
        int i = this.f15344z;
        return i != -1 && i == this.f15318A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void signalEndOfVideoGraphOutputStream() {
        this.f15323e.signalEndOfCurrentInputStream();
        this.f15343y = true;
    }

    public void addListener(InterfaceC2125e interfaceC2125e) {
        this.f15326h.add(interfaceC2125e);
    }

    public void clearOutputSurfaceInfo() {
        xpf xpfVar = xpf.f98880c;
        maybeSetOutputSurfaceInfo(null, xpfVar.getWidth(), xpfVar.getHeight());
        this.f15338t = null;
    }

    public x7i getSink(int i) {
        if (t0i.contains(this.f15321c, i)) {
            return this.f15321c.get(i);
        }
        C2124d c2124d = new C2124d(this.f15319a, i);
        if (i == 0) {
            addListener(c2124d);
        }
        this.f15321c.put(i, c2124d);
        return c2124d;
    }

    @Override // p000.a7i.InterfaceC0087b
    public void onEnded(long j) {
    }

    @Override // p000.a7i.InterfaceC0087b
    public void onError(q6i q6iVar) {
        Iterator<InterfaceC2125e> it = this.f15326h.iterator();
        while (it.hasNext()) {
            it.next().onError(q6iVar);
        }
    }

    @Override // p000.a7i.InterfaceC0087b
    public void onOutputFrameAvailableForRendering(long j, boolean z) {
        if (this.f15339u > 0) {
            return;
        }
        Iterator<InterfaceC2125e> it = this.f15326h.iterator();
        while (it.hasNext()) {
            it.next().onFrameAvailableForRendering();
        }
        if (z) {
            o6i o6iVar = this.f15333o;
            if (o6iVar != null) {
                o6iVar.onVideoFrameAboutToBeRendered(j, -9223372036854775807L, this.f15328j, null);
                return;
            }
            return;
        }
        this.f15341w = j;
        C2129i c2129iPollFloor = this.f15327i.pollFloor(j);
        if (c2129iPollFloor != null) {
            this.f15336r = c2129iPollFloor.f15371a;
            this.f15337s = c2129iPollFloor.f15372b;
            onOutputStreamChanged();
        }
        this.f15323e.handleInputFrame(j, this.f15324f);
        long j2 = this.f15342x;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        signalEndOfVideoGraphOutputStream();
    }

    @Override // p000.a7i.InterfaceC0087b
    public void onOutputFrameRateChanged(float f) {
        this.f15328j = this.f15328j.buildUpon().setFrameRate(f).build();
        onOutputStreamChanged();
    }

    @Override // p000.a7i.InterfaceC0087b
    public void onOutputSizeChanged(int i, int i2) {
        this.f15328j = this.f15328j.buildUpon().setWidth(i).setHeight(i2).build();
        onOutputStreamChanged();
    }

    public void release() {
        if (this.f15340v == 2) {
            return;
        }
        oe7 oe7Var = this.f15331m;
        if (oe7Var != null) {
            oe7Var.removeCallbacksAndMessages(null);
        }
        a7i a7iVar = this.f15332n;
        if (a7iVar != null) {
            a7iVar.release();
        }
        this.f15338t = null;
        this.f15340v = 2;
    }

    public void removeListener(InterfaceC2125e interfaceC2125e) {
        this.f15326h.remove(interfaceC2125e);
    }

    public void setCompositionEffects(List<ix4> list) {
        this.f15330l = kx7.copyOf((Collection) list);
        a7i a7iVar = this.f15332n;
        if (a7iVar != null) {
            a7iVar.setCompositionEffects(list);
        }
    }

    public void setCompositorSettings(d6i d6iVar) {
        this.f15329k = d6iVar;
        a7i a7iVar = this.f15332n;
        if (a7iVar != null) {
            a7iVar.setCompositorSettings(d6iVar);
        }
    }

    public void setIsInputSdrToneMapped(boolean z) {
        this.f15335q = z;
    }

    public void setOutputSurfaceInfo(Surface surface, xpf xpfVar) {
        Pair<Surface, xpf> pair = this.f15338t;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((xpf) this.f15338t.second).equals(xpfVar)) {
            return;
        }
        this.f15338t = Pair.create(surface, xpfVar);
        maybeSetOutputSurfaceInfo(surface, xpfVar.getWidth(), xpfVar.getHeight());
    }

    public void setRequestOpenGlToneMapping(boolean z) {
        this.f15334p = z;
    }

    public void setTotalVideoInputCount(int i) {
        this.f15344z = i;
    }

    public void startRendering() {
        this.f15323e.startRendering();
    }

    public void stopRendering() {
        this.f15323e.stopRendering();
    }

    private bzc(C2122b c2122b) {
        this.f15319a = c2122b.f15346a;
        this.f15327i = new m1h<>();
        this.f15320b = (a7i.InterfaceC0086a) v80.checkStateNotNull(c2122b.f15348c);
        this.f15321c = new SparseArray<>();
        this.f15330l = kx7.m15110of();
        this.f15329k = d6i.f28594a;
        this.f15322d = c2122b.f15349d;
        j52 j52Var = c2122b.f15350e;
        this.f15325g = j52Var;
        this.f15323e = new s24(c2122b.f15347b, j52Var);
        this.f15324f = new C2121a();
        this.f15326h = new CopyOnWriteArraySet<>();
        this.f15328j = new C1213a.b().build();
        this.f15336r = -9223372036854775807L;
        this.f15341w = -9223372036854775807L;
        this.f15342x = -9223372036854775807L;
        this.f15344z = -1;
        this.f15340v = 0;
    }
}
