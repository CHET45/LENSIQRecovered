package p000;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;
import p000.ca5;
import p000.l0d;
import p000.lw3;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface ca5 extends lzc {

    /* JADX INFO: renamed from: a */
    public static final long f16070a = 500;

    /* JADX INFO: renamed from: b */
    public static final long f16071b = 2000;

    /* JADX INFO: renamed from: ca5$a */
    @Deprecated
    public interface InterfaceC2247a {
        @Deprecated
        void clearAuxEffectInfo();

        @Deprecated
        yc0 getAudioAttributes();

        @Deprecated
        int getAudioSessionId();

        @Deprecated
        boolean getSkipSilenceEnabled();

        @Deprecated
        float getVolume();

        @Deprecated
        void setAudioAttributes(yc0 yc0Var, boolean z);

        @Deprecated
        void setAudioSessionId(int i);

        @Deprecated
        void setAuxEffectInfo(om0 om0Var);

        @Deprecated
        void setSkipSilenceEnabled(boolean z);

        @Deprecated
        void setVolume(float f);
    }

    /* JADX INFO: renamed from: ca5$b */
    public interface InterfaceC2248b {
        default void onExperimentalOffloadSchedulingEnabledChanged(boolean z) {
        }

        default void onExperimentalOffloadedPlayback(boolean z) {
        }

        default void onExperimentalSleepingForOffloadChanged(boolean z) {
        }
    }

    /* JADX INFO: renamed from: ca5$c */
    public static final class C2249c {

        /* JADX INFO: renamed from: A */
        public boolean f16072A;

        /* JADX INFO: renamed from: B */
        public boolean f16073B;

        /* JADX INFO: renamed from: C */
        @hib
        public Looper f16074C;

        /* JADX INFO: renamed from: D */
        public boolean f16075D;

        /* JADX INFO: renamed from: a */
        public final Context f16076a;

        /* JADX INFO: renamed from: b */
        public h52 f16077b;

        /* JADX INFO: renamed from: c */
        public long f16078c;

        /* JADX INFO: renamed from: d */
        public lfg<u1e> f16079d;

        /* JADX INFO: renamed from: e */
        public lfg<vna.InterfaceC14174a> f16080e;

        /* JADX INFO: renamed from: f */
        public lfg<p7h> f16081f;

        /* JADX INFO: renamed from: g */
        public lfg<gc9> f16082g;

        /* JADX INFO: renamed from: h */
        public lfg<vp0> f16083h;

        /* JADX INFO: renamed from: i */
        public lz6<h52, InterfaceC12162rn> f16084i;

        /* JADX INFO: renamed from: j */
        public Looper f16085j;

        /* JADX INFO: renamed from: k */
        @hib
        public jcd f16086k;

        /* JADX INFO: renamed from: l */
        public yc0 f16087l;

        /* JADX INFO: renamed from: m */
        public boolean f16088m;

        /* JADX INFO: renamed from: n */
        public int f16089n;

        /* JADX INFO: renamed from: o */
        public boolean f16090o;

        /* JADX INFO: renamed from: p */
        public boolean f16091p;

        /* JADX INFO: renamed from: q */
        public boolean f16092q;

        /* JADX INFO: renamed from: r */
        public int f16093r;

        /* JADX INFO: renamed from: s */
        public int f16094s;

        /* JADX INFO: renamed from: t */
        public boolean f16095t;

        /* JADX INFO: renamed from: u */
        public iue f16096u;

        /* JADX INFO: renamed from: v */
        public long f16097v;

        /* JADX INFO: renamed from: w */
        public long f16098w;

        /* JADX INFO: renamed from: x */
        public vb9 f16099x;

        /* JADX INFO: renamed from: y */
        public long f16100y;

        /* JADX INFO: renamed from: z */
        public long f16101z;

        public C2249c(final Context context) {
            this(context, (lfg<u1e>) new lfg() { // from class: ha5
                @Override // p000.lfg
                public final Object get() {
                    return ca5.C2249c.lambda$new$0(context);
                }
            }, (lfg<vna.InterfaceC14174a>) new lfg() { // from class: jb5
                @Override // p000.lfg
                public final Object get() {
                    return ca5.C2249c.lambda$new$1(context);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ u1e lambda$new$0(Context context) {
            return new zy3(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ vna.InterfaceC14174a lambda$new$1(Context context) {
            return new ix3(context, new dv3());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ p7h lambda$new$10(p7h p7hVar) {
            return p7hVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ gc9 lambda$new$11(gc9 gc9Var) {
            return gc9Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ vp0 lambda$new$12(vp0 vp0Var) {
            return vp0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ InterfaceC12162rn lambda$new$13(InterfaceC12162rn interfaceC12162rn, h52 h52Var) {
            return interfaceC12162rn;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ p7h lambda$new$14(Context context) {
            return new f24(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ u1e lambda$new$2(u1e u1eVar) {
            return u1eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ vna.InterfaceC14174a lambda$new$3(Context context) {
            return new ix3(context, new dv3());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ u1e lambda$new$4(Context context) {
            return new zy3(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ vna.InterfaceC14174a lambda$new$5(vna.InterfaceC14174a interfaceC14174a) {
            return interfaceC14174a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ u1e lambda$new$6(u1e u1eVar) {
            return u1eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ vna.InterfaceC14174a lambda$new$7(vna.InterfaceC14174a interfaceC14174a) {
            return interfaceC14174a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ u1e lambda$new$8(u1e u1eVar) {
            return u1eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ vna.InterfaceC14174a lambda$new$9(vna.InterfaceC14174a interfaceC14174a) {
            return interfaceC14174a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ InterfaceC12162rn lambda$setAnalyticsCollector$21(InterfaceC12162rn interfaceC12162rn, h52 h52Var) {
            return interfaceC12162rn;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ vp0 lambda$setBandwidthMeter$20(vp0 vp0Var) {
            return vp0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ gc9 lambda$setLoadControl$19(gc9 gc9Var) {
            return gc9Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ vna.InterfaceC14174a lambda$setMediaSourceFactory$17(vna.InterfaceC14174a interfaceC14174a) {
            return interfaceC14174a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ u1e lambda$setRenderersFactory$16(u1e u1eVar) {
            return u1eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ p7h lambda$setTrackSelector$18(p7h p7hVar) {
            return p7hVar;
        }

        public ca5 build() {
            u80.checkState(!this.f16075D);
            this.f16075D = true;
            return new ie5(this, null);
        }

        @op1
        public C2249c experimentalSetForegroundModeTimeoutMs(long j) {
            u80.checkState(!this.f16075D);
            this.f16078c = j;
            return this;
        }

        @op1
        public C2249c setAnalyticsCollector(final InterfaceC12162rn interfaceC12162rn) {
            u80.checkState(!this.f16075D);
            u80.checkNotNull(interfaceC12162rn);
            this.f16084i = new lz6() { // from class: db5
                @Override // p000.lz6
                public final Object apply(Object obj) {
                    return ca5.C2249c.lambda$setAnalyticsCollector$21(interfaceC12162rn, (h52) obj);
                }
            };
            return this;
        }

        @op1
        public C2249c setAudioAttributes(yc0 yc0Var, boolean z) {
            u80.checkState(!this.f16075D);
            this.f16087l = (yc0) u80.checkNotNull(yc0Var);
            this.f16088m = z;
            return this;
        }

        @op1
        public C2249c setBandwidthMeter(final vp0 vp0Var) {
            u80.checkState(!this.f16075D);
            u80.checkNotNull(vp0Var);
            this.f16083h = new lfg() { // from class: pb5
                @Override // p000.lfg
                public final Object get() {
                    return ca5.C2249c.lambda$setBandwidthMeter$20(vp0Var);
                }
            };
            return this;
        }

        @op1
        @fdi
        public C2249c setClock(h52 h52Var) {
            u80.checkState(!this.f16075D);
            this.f16077b = h52Var;
            return this;
        }

        @op1
        public C2249c setDetachSurfaceTimeoutMs(long j) {
            u80.checkState(!this.f16075D);
            this.f16101z = j;
            return this;
        }

        @op1
        public C2249c setDeviceVolumeControlEnabled(boolean z) {
            u80.checkState(!this.f16075D);
            this.f16092q = z;
            return this;
        }

        @op1
        public C2249c setHandleAudioBecomingNoisy(boolean z) {
            u80.checkState(!this.f16075D);
            this.f16090o = z;
            return this;
        }

        @op1
        public C2249c setLivePlaybackSpeedControl(vb9 vb9Var) {
            u80.checkState(!this.f16075D);
            this.f16099x = (vb9) u80.checkNotNull(vb9Var);
            return this;
        }

        @op1
        public C2249c setLoadControl(final gc9 gc9Var) {
            u80.checkState(!this.f16075D);
            u80.checkNotNull(gc9Var);
            this.f16082g = new lfg() { // from class: da5
                @Override // p000.lfg
                public final Object get() {
                    return ca5.C2249c.lambda$setLoadControl$19(gc9Var);
                }
            };
            return this;
        }

        @op1
        public C2249c setLooper(Looper looper) {
            u80.checkState(!this.f16075D);
            u80.checkNotNull(looper);
            this.f16085j = looper;
            return this;
        }

        @op1
        public C2249c setMediaSourceFactory(final vna.InterfaceC14174a interfaceC14174a) {
            u80.checkState(!this.f16075D);
            u80.checkNotNull(interfaceC14174a);
            this.f16080e = new lfg() { // from class: hb5
                @Override // p000.lfg
                public final Object get() {
                    return ca5.C2249c.lambda$setMediaSourceFactory$17(interfaceC14174a);
                }
            };
            return this;
        }

        @op1
        public C2249c setPauseAtEndOfMediaItems(boolean z) {
            u80.checkState(!this.f16075D);
            this.f16072A = z;
            return this;
        }

        @op1
        public C2249c setPlaybackLooper(Looper looper) {
            u80.checkState(!this.f16075D);
            this.f16074C = looper;
            return this;
        }

        @op1
        public C2249c setPriorityTaskManager(@hib jcd jcdVar) {
            u80.checkState(!this.f16075D);
            this.f16086k = jcdVar;
            return this;
        }

        @op1
        public C2249c setReleaseTimeoutMs(long j) {
            u80.checkState(!this.f16075D);
            this.f16100y = j;
            return this;
        }

        @op1
        public C2249c setRenderersFactory(final u1e u1eVar) {
            u80.checkState(!this.f16075D);
            u80.checkNotNull(u1eVar);
            this.f16079d = new lfg() { // from class: fb5
                @Override // p000.lfg
                public final Object get() {
                    return ca5.C2249c.lambda$setRenderersFactory$16(u1eVar);
                }
            };
            return this;
        }

        @op1
        public C2249c setSeekBackIncrementMs(@h78(from = 1) long j) {
            u80.checkArgument(j > 0);
            u80.checkState(!this.f16075D);
            this.f16097v = j;
            return this;
        }

        @op1
        public C2249c setSeekForwardIncrementMs(@h78(from = 1) long j) {
            u80.checkArgument(j > 0);
            u80.checkState(!this.f16075D);
            this.f16098w = j;
            return this;
        }

        @op1
        public C2249c setSeekParameters(iue iueVar) {
            u80.checkState(!this.f16075D);
            this.f16096u = (iue) u80.checkNotNull(iueVar);
            return this;
        }

        @op1
        public C2249c setSkipSilenceEnabled(boolean z) {
            u80.checkState(!this.f16075D);
            this.f16091p = z;
            return this;
        }

        @op1
        public C2249c setTrackSelector(final p7h p7hVar) {
            u80.checkState(!this.f16075D);
            u80.checkNotNull(p7hVar);
            this.f16081f = new lfg() { // from class: ka5
                @Override // p000.lfg
                public final Object get() {
                    return ca5.C2249c.lambda$setTrackSelector$18(p7hVar);
                }
            };
            return this;
        }

        @op1
        public C2249c setUseLazyPreparation(boolean z) {
            u80.checkState(!this.f16075D);
            this.f16095t = z;
            return this;
        }

        @op1
        public C2249c setUsePlatformDiagnostics(boolean z) {
            u80.checkState(!this.f16075D);
            this.f16073B = z;
            return this;
        }

        @op1
        public C2249c setVideoChangeFrameRateStrategy(int i) {
            u80.checkState(!this.f16075D);
            this.f16094s = i;
            return this;
        }

        @op1
        public C2249c setVideoScalingMode(int i) {
            u80.checkState(!this.f16075D);
            this.f16093r = i;
            return this;
        }

        @op1
        public C2249c setWakeMode(int i) {
            u80.checkState(!this.f16075D);
            this.f16089n = i;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public mif m3871w() {
            u80.checkState(!this.f16075D);
            this.f16075D = true;
            return new mif(this);
        }

        public C2249c(final Context context, final u1e u1eVar) {
            this(context, (lfg<u1e>) new lfg() { // from class: ma5
                @Override // p000.lfg
                public final Object get() {
                    return ca5.C2249c.lambda$new$2(u1eVar);
                }
            }, (lfg<vna.InterfaceC14174a>) new lfg() { // from class: oa5
                @Override // p000.lfg
                public final Object get() {
                    return ca5.C2249c.lambda$new$3(context);
                }
            });
            u80.checkNotNull(u1eVar);
        }

        public C2249c(final Context context, final vna.InterfaceC14174a interfaceC14174a) {
            this(context, (lfg<u1e>) new lfg() { // from class: qa5
                @Override // p000.lfg
                public final Object get() {
                    return ca5.C2249c.lambda$new$4(context);
                }
            }, (lfg<vna.InterfaceC14174a>) new lfg() { // from class: sa5
                @Override // p000.lfg
                public final Object get() {
                    return ca5.C2249c.lambda$new$5(interfaceC14174a);
                }
            });
            u80.checkNotNull(interfaceC14174a);
        }

        public C2249c(Context context, final u1e u1eVar, final vna.InterfaceC14174a interfaceC14174a) {
            this(context, (lfg<u1e>) new lfg() { // from class: lb5
                @Override // p000.lfg
                public final Object get() {
                    return ca5.C2249c.lambda$new$6(u1eVar);
                }
            }, (lfg<vna.InterfaceC14174a>) new lfg() { // from class: nb5
                @Override // p000.lfg
                public final Object get() {
                    return ca5.C2249c.lambda$new$7(interfaceC14174a);
                }
            });
            u80.checkNotNull(u1eVar);
            u80.checkNotNull(interfaceC14174a);
        }

        public C2249c(Context context, final u1e u1eVar, final vna.InterfaceC14174a interfaceC14174a, final p7h p7hVar, final gc9 gc9Var, final vp0 vp0Var, final InterfaceC12162rn interfaceC12162rn) {
            this(context, (lfg<u1e>) new lfg() { // from class: rb5
                @Override // p000.lfg
                public final Object get() {
                    return ca5.C2249c.lambda$new$8(u1eVar);
                }
            }, (lfg<vna.InterfaceC14174a>) new lfg() { // from class: tb5
                @Override // p000.lfg
                public final Object get() {
                    return ca5.C2249c.lambda$new$9(interfaceC14174a);
                }
            }, (lfg<p7h>) new lfg() { // from class: vb5
                @Override // p000.lfg
                public final Object get() {
                    return ca5.C2249c.lambda$new$10(p7hVar);
                }
            }, (lfg<gc9>) new lfg() { // from class: xb5
                @Override // p000.lfg
                public final Object get() {
                    return ca5.C2249c.lambda$new$11(gc9Var);
                }
            }, (lfg<vp0>) new lfg() { // from class: fa5
                @Override // p000.lfg
                public final Object get() {
                    return ca5.C2249c.lambda$new$12(vp0Var);
                }
            }, (lz6<h52, InterfaceC12162rn>) new lz6() { // from class: ia5
                @Override // p000.lz6
                public final Object apply(Object obj) {
                    return ca5.C2249c.lambda$new$13(interfaceC12162rn, (h52) obj);
                }
            });
            u80.checkNotNull(u1eVar);
            u80.checkNotNull(interfaceC14174a);
            u80.checkNotNull(p7hVar);
            u80.checkNotNull(vp0Var);
            u80.checkNotNull(interfaceC12162rn);
        }

        private C2249c(final Context context, lfg<u1e> lfgVar, lfg<vna.InterfaceC14174a> lfgVar2) {
            this(context, lfgVar, lfgVar2, (lfg<p7h>) new lfg() { // from class: ua5
                @Override // p000.lfg
                public final Object get() {
                    return ca5.C2249c.lambda$new$14(context);
                }
            }, (lfg<gc9>) new lfg() { // from class: wa5
                @Override // p000.lfg
                public final Object get() {
                    return new mw3();
                }
            }, (lfg<vp0>) new lfg() { // from class: ya5
                @Override // p000.lfg
                public final Object get() {
                    return dt3.getSingletonInstance(context);
                }
            }, (lz6<h52, InterfaceC12162rn>) new lz6() { // from class: bb5
                @Override // p000.lz6
                public final Object apply(Object obj) {
                    return new as3((h52) obj);
                }
            });
        }

        private C2249c(Context context, lfg<u1e> lfgVar, lfg<vna.InterfaceC14174a> lfgVar2, lfg<p7h> lfgVar3, lfg<gc9> lfgVar4, lfg<vp0> lfgVar5, lz6<h52, InterfaceC12162rn> lz6Var) {
            this.f16076a = (Context) u80.checkNotNull(context);
            this.f16079d = lfgVar;
            this.f16080e = lfgVar2;
            this.f16081f = lfgVar3;
            this.f16082g = lfgVar4;
            this.f16083h = lfgVar5;
            this.f16084i = lz6Var;
            this.f16085j = x0i.getCurrentOrMainLooper();
            this.f16087l = yc0.f101069m;
            this.f16089n = 0;
            this.f16093r = 1;
            this.f16094s = 0;
            this.f16095t = true;
            this.f16096u = iue.f48524g;
            this.f16097v = 5000L;
            this.f16098w = 15000L;
            this.f16099x = new lw3.C8995b().build();
            this.f16077b = h52.f42390a;
            this.f16100y = 500L;
            this.f16101z = 2000L;
            this.f16073B = true;
        }
    }

    /* JADX INFO: renamed from: ca5$d */
    @Deprecated
    public interface InterfaceC2250d {
        @Deprecated
        void decreaseDeviceVolume();

        @Deprecated
        p84 getDeviceInfo();

        @Deprecated
        int getDeviceVolume();

        @Deprecated
        void increaseDeviceVolume();

        @Deprecated
        boolean isDeviceMuted();

        @Deprecated
        void setDeviceMuted(boolean z);

        @Deprecated
        void setDeviceVolume(int i);
    }

    /* JADX INFO: renamed from: ca5$e */
    @Deprecated
    public interface InterfaceC2251e {
        @Deprecated
        y93 getCurrentCues();
    }

    /* JADX INFO: renamed from: ca5$f */
    @Deprecated
    public interface InterfaceC2252f {
        @Deprecated
        void clearCameraMotionListener(fp1 fp1Var);

        @Deprecated
        void clearVideoFrameMetadataListener(n6i n6iVar);

        @Deprecated
        void clearVideoSurface();

        @Deprecated
        void clearVideoSurface(@hib Surface surface);

        @Deprecated
        void clearVideoSurfaceHolder(@hib SurfaceHolder surfaceHolder);

        @Deprecated
        void clearVideoSurfaceView(@hib SurfaceView surfaceView);

        @Deprecated
        void clearVideoTextureView(@hib TextureView textureView);

        @Deprecated
        int getVideoChangeFrameRateStrategy();

        @Deprecated
        int getVideoScalingMode();

        @Deprecated
        z7i getVideoSize();

        @Deprecated
        void setCameraMotionListener(fp1 fp1Var);

        @Deprecated
        void setVideoChangeFrameRateStrategy(int i);

        @Deprecated
        void setVideoFrameMetadataListener(n6i n6iVar);

        @Deprecated
        void setVideoScalingMode(int i);

        @Deprecated
        void setVideoSurface(@hib Surface surface);

        @Deprecated
        void setVideoSurfaceHolder(@hib SurfaceHolder surfaceHolder);

        @Deprecated
        void setVideoSurfaceView(@hib SurfaceView surfaceView);

        @Deprecated
        void setVideoTextureView(@hib TextureView textureView);
    }

    void addAnalyticsListener(InterfaceC5415eo interfaceC5415eo);

    void addAudioOffloadListener(InterfaceC2248b interfaceC2248b);

    void addMediaSource(int i, vna vnaVar);

    void addMediaSource(vna vnaVar);

    void addMediaSources(int i, List<vna> list);

    void addMediaSources(List<vna> list);

    void clearAuxEffectInfo();

    void clearCameraMotionListener(fp1 fp1Var);

    void clearVideoFrameMetadataListener(n6i n6iVar);

    l0d createMessage(l0d.InterfaceC8571b interfaceC8571b);

    boolean experimentalIsSleepingForOffload();

    void experimentalSetOffloadSchedulingEnabled(boolean z);

    InterfaceC12162rn getAnalyticsCollector();

    @hib
    @Deprecated
    InterfaceC2247a getAudioComponent();

    @hib
    nl3 getAudioDecoderCounters();

    @hib
    kq6 getAudioFormat();

    int getAudioSessionId();

    h52 getClock();

    @Deprecated
    m6h getCurrentTrackGroups();

    @Deprecated
    w6h getCurrentTrackSelections();

    @hib
    @Deprecated
    InterfaceC2250d getDeviceComponent();

    boolean getPauseAtEndOfMediaItems();

    Looper getPlaybackLooper();

    @Override // p000.lzc
    @hib
    ba5 getPlayerError();

    n1e getRenderer(int i);

    int getRendererCount();

    int getRendererType(int i);

    iue getSeekParameters();

    boolean getSkipSilenceEnabled();

    @hib
    @Deprecated
    InterfaceC2251e getTextComponent();

    @hib
    p7h getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    @hib
    @Deprecated
    InterfaceC2252f getVideoComponent();

    @hib
    nl3 getVideoDecoderCounters();

    @hib
    kq6 getVideoFormat();

    int getVideoScalingMode();

    boolean isTunnelingEnabled();

    @Deprecated
    void prepare(vna vnaVar);

    @Deprecated
    void prepare(vna vnaVar, boolean z, boolean z2);

    void removeAnalyticsListener(InterfaceC5415eo interfaceC5415eo);

    void removeAudioOffloadListener(InterfaceC2248b interfaceC2248b);

    void setAudioAttributes(yc0 yc0Var, boolean z);

    void setAudioSessionId(int i);

    void setAuxEffectInfo(om0 om0Var);

    void setCameraMotionListener(fp1 fp1Var);

    void setForegroundMode(boolean z);

    void setHandleAudioBecomingNoisy(boolean z);

    void setMediaSource(vna vnaVar);

    void setMediaSource(vna vnaVar, long j);

    void setMediaSource(vna vnaVar, boolean z);

    void setMediaSources(List<vna> list);

    void setMediaSources(List<vna> list, int i, long j);

    void setMediaSources(List<vna> list, boolean z);

    void setPauseAtEndOfMediaItems(boolean z);

    @c5e(23)
    void setPreferredAudioDevice(@hib AudioDeviceInfo audioDeviceInfo);

    void setPriorityTaskManager(@hib jcd jcdVar);

    void setSeekParameters(@hib iue iueVar);

    void setShuffleOrder(sbf sbfVar);

    void setSkipSilenceEnabled(boolean z);

    void setVideoChangeFrameRateStrategy(int i);

    @c5e(18)
    void setVideoEffects(List<gx4> list);

    void setVideoFrameMetadataListener(n6i n6iVar);

    void setVideoScalingMode(int i);

    void setWakeMode(int i);
}
