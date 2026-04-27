package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p000.be0;
import p000.ca5;
import p000.cd0;
import p000.kf5;
import p000.l0d;
import p000.lzc;
import p000.p84;
import p000.ppa;
import p000.sbf;
import p000.t1h;
import p000.v6g;
import p000.vna;
import p000.za9;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ie5 extends at0 implements ca5, ca5.InterfaceC2247a, ca5.InterfaceC2252f, ca5.InterfaceC2251e, ca5.InterfaceC2250d {

    /* JADX INFO: renamed from: x2 */
    public static final String f46602x2 = "ExoPlayerImpl";

    /* JADX INFO: renamed from: A1 */
    public final chi f46603A1;

    /* JADX INFO: renamed from: B1 */
    public final gli f46604B1;

    /* JADX INFO: renamed from: C1 */
    public final long f46605C1;

    /* JADX INFO: renamed from: D1 */
    public int f46606D1;

    /* JADX INFO: renamed from: E1 */
    public boolean f46607E1;

    /* JADX INFO: renamed from: F1 */
    public int f46608F1;

    /* JADX INFO: renamed from: G1 */
    public int f46609G1;

    /* JADX INFO: renamed from: H1 */
    public boolean f46610H1;

    /* JADX INFO: renamed from: I1 */
    public int f46611I1;

    /* JADX INFO: renamed from: J1 */
    public boolean f46612J1;

    /* JADX INFO: renamed from: K1 */
    public iue f46613K1;

    /* JADX INFO: renamed from: L1 */
    public sbf f46614L1;

    /* JADX INFO: renamed from: M1 */
    public boolean f46615M1;

    /* JADX INFO: renamed from: N1 */
    public lzc.C9045c f46616N1;

    /* JADX INFO: renamed from: O1 */
    public iga f46617O1;

    /* JADX INFO: renamed from: P1 */
    public iga f46618P1;

    /* JADX INFO: renamed from: Q1 */
    @hib
    public kq6 f46619Q1;

    /* JADX INFO: renamed from: R1 */
    @hib
    public kq6 f46620R1;

    /* JADX INFO: renamed from: S1 */
    @hib
    public AudioTrack f46621S1;

    /* JADX INFO: renamed from: T1 */
    @hib
    public Object f46622T1;

    /* JADX INFO: renamed from: U1 */
    @hib
    public Surface f46623U1;

    /* JADX INFO: renamed from: V1 */
    @hib
    public SurfaceHolder f46624V1;

    /* JADX INFO: renamed from: W1 */
    @hib
    public SphericalGLSurfaceView f46625W1;

    /* JADX INFO: renamed from: X1 */
    public boolean f46626X1;

    /* JADX INFO: renamed from: Y1 */
    @hib
    public TextureView f46627Y1;

    /* JADX INFO: renamed from: Z0 */
    public final q7h f46628Z0;

    /* JADX INFO: renamed from: Z1 */
    public int f46629Z1;

    /* JADX INFO: renamed from: a1 */
    public final lzc.C9045c f46630a1;

    /* JADX INFO: renamed from: a2 */
    public int f46631a2;

    /* JADX INFO: renamed from: b1 */
    public final wp2 f46632b1;

    /* JADX INFO: renamed from: b2 */
    public ypf f46633b2;

    /* JADX INFO: renamed from: c1 */
    public final Context f46634c1;

    /* JADX INFO: renamed from: c2 */
    @hib
    public nl3 f46635c2;

    /* JADX INFO: renamed from: d1 */
    public final lzc f46636d1;

    /* JADX INFO: renamed from: d2 */
    @hib
    public nl3 f46637d2;

    /* JADX INFO: renamed from: e1 */
    public final n1e[] f46638e1;

    /* JADX INFO: renamed from: e2 */
    public int f46639e2;

    /* JADX INFO: renamed from: f1 */
    public final p7h f46640f1;

    /* JADX INFO: renamed from: f2 */
    public yc0 f46641f2;

    /* JADX INFO: renamed from: g1 */
    public final pe7 f46642g1;

    /* JADX INFO: renamed from: g2 */
    public float f46643g2;

    /* JADX INFO: renamed from: h1 */
    public final kf5.InterfaceC8345f f46644h1;

    /* JADX INFO: renamed from: h2 */
    public boolean f46645h2;

    /* JADX INFO: renamed from: i1 */
    public final kf5 f46646i1;

    /* JADX INFO: renamed from: i2 */
    public y93 f46647i2;

    /* JADX INFO: renamed from: j1 */
    public final za9<lzc.InterfaceC9049g> f46648j1;

    /* JADX INFO: renamed from: j2 */
    @hib
    public n6i f46649j2;

    /* JADX INFO: renamed from: k1 */
    public final CopyOnWriteArraySet<ca5.InterfaceC2248b> f46650k1;

    /* JADX INFO: renamed from: k2 */
    @hib
    public fp1 f46651k2;

    /* JADX INFO: renamed from: l1 */
    public final t1h.C12849b f46652l1;

    /* JADX INFO: renamed from: l2 */
    public boolean f46653l2;

    /* JADX INFO: renamed from: m1 */
    public final List<C7259e> f46654m1;

    /* JADX INFO: renamed from: m2 */
    public boolean f46655m2;

    /* JADX INFO: renamed from: n1 */
    public final boolean f46656n1;

    /* JADX INFO: renamed from: n2 */
    @hib
    public jcd f46657n2;

    /* JADX INFO: renamed from: o1 */
    public final vna.InterfaceC14174a f46658o1;

    /* JADX INFO: renamed from: o2 */
    public boolean f46659o2;

    /* JADX INFO: renamed from: p1 */
    public final InterfaceC12162rn f46660p1;

    /* JADX INFO: renamed from: p2 */
    public boolean f46661p2;

    /* JADX INFO: renamed from: q1 */
    public final Looper f46662q1;

    /* JADX INFO: renamed from: q2 */
    public p84 f46663q2;

    /* JADX INFO: renamed from: r1 */
    public final vp0 f46664r1;

    /* JADX INFO: renamed from: r2 */
    public z7i f46665r2;

    /* JADX INFO: renamed from: s1 */
    public final long f46666s1;

    /* JADX INFO: renamed from: s2 */
    public iga f46667s2;

    /* JADX INFO: renamed from: t1 */
    public final long f46668t1;

    /* JADX INFO: renamed from: t2 */
    public myc f46669t2;

    /* JADX INFO: renamed from: u1 */
    public final h52 f46670u1;

    /* JADX INFO: renamed from: u2 */
    public int f46671u2;

    /* JADX INFO: renamed from: v1 */
    public final SurfaceHolderCallbackC7257c f46672v1;

    /* JADX INFO: renamed from: v2 */
    public int f46673v2;

    /* JADX INFO: renamed from: w1 */
    public final C7258d f46674w1;

    /* JADX INFO: renamed from: w2 */
    public long f46675w2;

    /* JADX INFO: renamed from: x1 */
    public final cd0 f46676x1;

    /* JADX INFO: renamed from: y1 */
    public final be0 f46677y1;

    /* JADX INFO: renamed from: z1 */
    @hib
    public final v6g f46678z1;

    /* JADX INFO: renamed from: ie5$b */
    @c5e(31)
    public static final class C7256b {
        private C7256b() {
        }

        @ih4
        public static k0d registerMediaMetricsListener(Context context, ie5 ie5Var, boolean z) {
            qia qiaVarCreate = qia.create(context);
            if (qiaVarCreate == null) {
                yh9.m25919w("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new k0d(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z) {
                ie5Var.addAnalyticsListener(qiaVarCreate);
            }
            return new k0d(qiaVarCreate.getLogSessionId());
        }
    }

    /* JADX INFO: renamed from: ie5$c */
    public final class SurfaceHolderCallbackC7257c implements w7i, sg0, zug, eua, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.InterfaceC3128b, be0.InterfaceC1854c, cd0.InterfaceC2276b, v6g.InterfaceC13892b, ca5.InterfaceC2248b {
        private SurfaceHolderCallbackC7257c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onMetadata$4(lzc.InterfaceC9049g interfaceC9049g) {
            interfaceC9049g.onMediaMetadataChanged(ie5.this.f46617O1);
        }

        @Override // p000.be0.InterfaceC1854c
        public void executePlayerCommand(int i) {
            boolean playWhenReady = ie5.this.getPlayWhenReady();
            ie5.this.updatePlayWhenReady(playWhenReady, i, ie5.getPlayWhenReadyChangeReason(playWhenReady, i));
        }

        @Override // p000.cd0.InterfaceC2276b
        public void onAudioBecomingNoisy() {
            ie5.this.updatePlayWhenReady(false, -1, 3);
        }

        @Override // p000.sg0
        public void onAudioCodecError(Exception exc) {
            ie5.this.f46660p1.onAudioCodecError(exc);
        }

        @Override // p000.sg0
        public void onAudioDecoderInitialized(String str, long j, long j2) {
            ie5.this.f46660p1.onAudioDecoderInitialized(str, j, j2);
        }

        @Override // p000.sg0
        public void onAudioDecoderReleased(String str) {
            ie5.this.f46660p1.onAudioDecoderReleased(str);
        }

        @Override // p000.sg0
        public void onAudioDisabled(nl3 nl3Var) {
            ie5.this.f46660p1.onAudioDisabled(nl3Var);
            ie5.this.f46620R1 = null;
            ie5.this.f46637d2 = null;
        }

        @Override // p000.sg0
        public void onAudioEnabled(nl3 nl3Var) {
            ie5.this.f46637d2 = nl3Var;
            ie5.this.f46660p1.onAudioEnabled(nl3Var);
        }

        @Override // p000.sg0
        public void onAudioInputFormatChanged(kq6 kq6Var, @hib wl3 wl3Var) {
            ie5.this.f46620R1 = kq6Var;
            ie5.this.f46660p1.onAudioInputFormatChanged(kq6Var, wl3Var);
        }

        @Override // p000.sg0
        public void onAudioPositionAdvancing(long j) {
            ie5.this.f46660p1.onAudioPositionAdvancing(j);
        }

        @Override // p000.sg0
        public void onAudioSinkError(Exception exc) {
            ie5.this.f46660p1.onAudioSinkError(exc);
        }

        @Override // p000.sg0
        public void onAudioUnderrun(int i, long j, long j2) {
            ie5.this.f46660p1.onAudioUnderrun(i, j, j2);
        }

        @Override // p000.zug
        public void onCues(final List<o93> list) {
            ie5.this.f46648j1.sendEvent(27, new za9.InterfaceC16057a() { // from class: ke5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ((lzc.InterfaceC9049g) obj).onCues((List<o93>) list);
                }
            });
        }

        @Override // p000.w7i
        public void onDroppedFrames(int i, long j) {
            ie5.this.f46660p1.onDroppedFrames(i, j);
        }

        @Override // p000.ca5.InterfaceC2248b
        public void onExperimentalSleepingForOffloadChanged(boolean z) {
            ie5.this.updateWakeAndWifiLock();
        }

        @Override // p000.eua
        public void onMetadata(final Metadata metadata) {
            ie5 ie5Var = ie5.this;
            ie5Var.f46667s2 = ie5Var.f46667s2.buildUpon().populateFromMetadata(metadata).build();
            iga igaVarBuildUpdatedMediaMetadata = ie5.this.buildUpdatedMediaMetadata();
            if (!igaVarBuildUpdatedMediaMetadata.equals(ie5.this.f46617O1)) {
                ie5.this.f46617O1 = igaVarBuildUpdatedMediaMetadata;
                ie5.this.f46648j1.queueEvent(14, new za9.InterfaceC16057a() { // from class: oe5
                    @Override // p000.za9.InterfaceC16057a
                    public final void invoke(Object obj) {
                        this.f67394a.lambda$onMetadata$4((lzc.InterfaceC9049g) obj);
                    }
                });
            }
            ie5.this.f46648j1.queueEvent(28, new za9.InterfaceC16057a() { // from class: qe5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ((lzc.InterfaceC9049g) obj).onMetadata(metadata);
                }
            });
            ie5.this.f46648j1.flushEvents();
        }

        @Override // p000.w7i
        public void onRenderedFirstFrame(Object obj, long j) {
            ie5.this.f46660p1.onRenderedFirstFrame(obj, j);
            if (ie5.this.f46622T1 == obj) {
                ie5.this.f46648j1.sendEvent(26, new se5());
            }
        }

        @Override // p000.sg0
        public void onSkipSilenceEnabledChanged(final boolean z) {
            if (ie5.this.f46645h2 == z) {
                return;
            }
            ie5.this.f46645h2 = z;
            ie5.this.f46648j1.sendEvent(23, new za9.InterfaceC16057a() { // from class: we5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ((lzc.InterfaceC9049g) obj).onSkipSilenceEnabledChanged(z);
                }
            });
        }

        @Override // p000.v6g.InterfaceC13892b
        public void onStreamTypeChanged(int i) {
            final p84 p84VarCreateDeviceInfo = ie5.createDeviceInfo(ie5.this.f46678z1);
            if (p84VarCreateDeviceInfo.equals(ie5.this.f46663q2)) {
                return;
            }
            ie5.this.f46663q2 = p84VarCreateDeviceInfo;
            ie5.this.f46648j1.sendEvent(29, new za9.InterfaceC16057a() { // from class: ye5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ((lzc.InterfaceC9049g) obj).onDeviceInfoChanged(p84VarCreateDeviceInfo);
                }
            });
        }

        @Override // p000.v6g.InterfaceC13892b
        public void onStreamVolumeChanged(final int i, final boolean z) {
            ie5.this.f46648j1.sendEvent(30, new za9.InterfaceC16057a() { // from class: ue5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ((lzc.InterfaceC9049g) obj).onDeviceVolumeChanged(i, z);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            ie5.this.setSurfaceTextureInternal(surfaceTexture);
            ie5.this.maybeNotifySurfaceSizeChanged(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            ie5.this.setVideoOutputInternal(null);
            ie5.this.maybeNotifySurfaceSizeChanged(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            ie5.this.maybeNotifySurfaceSizeChanged(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // p000.w7i
        public void onVideoCodecError(Exception exc) {
            ie5.this.f46660p1.onVideoCodecError(exc);
        }

        @Override // p000.w7i
        public void onVideoDecoderInitialized(String str, long j, long j2) {
            ie5.this.f46660p1.onVideoDecoderInitialized(str, j, j2);
        }

        @Override // p000.w7i
        public void onVideoDecoderReleased(String str) {
            ie5.this.f46660p1.onVideoDecoderReleased(str);
        }

        @Override // p000.w7i
        public void onVideoDisabled(nl3 nl3Var) {
            ie5.this.f46660p1.onVideoDisabled(nl3Var);
            ie5.this.f46619Q1 = null;
            ie5.this.f46635c2 = null;
        }

        @Override // p000.w7i
        public void onVideoEnabled(nl3 nl3Var) {
            ie5.this.f46635c2 = nl3Var;
            ie5.this.f46660p1.onVideoEnabled(nl3Var);
        }

        @Override // p000.w7i
        public void onVideoFrameProcessingOffset(long j, int i) {
            ie5.this.f46660p1.onVideoFrameProcessingOffset(j, i);
        }

        @Override // p000.w7i
        public void onVideoInputFormatChanged(kq6 kq6Var, @hib wl3 wl3Var) {
            ie5.this.f46619Q1 = kq6Var;
            ie5.this.f46660p1.onVideoInputFormatChanged(kq6Var, wl3Var);
        }

        @Override // p000.w7i
        public void onVideoSizeChanged(final z7i z7iVar) {
            ie5.this.f46665r2 = z7iVar;
            ie5.this.f46648j1.sendEvent(25, new za9.InterfaceC16057a() { // from class: af5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ((lzc.InterfaceC9049g) obj).onVideoSizeChanged(z7iVar);
                }
            });
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.InterfaceC3128b
        public void onVideoSurfaceCreated(Surface surface) {
            ie5.this.setVideoOutputInternal(surface);
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.InterfaceC3128b
        public void onVideoSurfaceDestroyed(Surface surface) {
            ie5.this.setVideoOutputInternal(null);
        }

        @Override // p000.be0.InterfaceC1854c
        public void setVolumeMultiplier(float f) {
            ie5.this.sendVolumeToRenderers();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            ie5.this.maybeNotifySurfaceSizeChanged(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (ie5.this.f46626X1) {
                ie5.this.setVideoOutputInternal(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (ie5.this.f46626X1) {
                ie5.this.setVideoOutputInternal(null);
            }
            ie5.this.maybeNotifySurfaceSizeChanged(0, 0);
        }

        @Override // p000.zug
        public void onCues(final y93 y93Var) {
            ie5.this.f46647i2 = y93Var;
            ie5.this.f46648j1.sendEvent(27, new za9.InterfaceC16057a() { // from class: me5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ((lzc.InterfaceC9049g) obj).onCues(y93Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ie5$d */
    public static final class C7258d implements n6i, fp1, l0d.InterfaceC8571b {

        /* JADX INFO: renamed from: e */
        public static final int f46680e = 7;

        /* JADX INFO: renamed from: f */
        public static final int f46681f = 8;

        /* JADX INFO: renamed from: m */
        public static final int f46682m = 10000;

        /* JADX INFO: renamed from: a */
        @hib
        public n6i f46683a;

        /* JADX INFO: renamed from: b */
        @hib
        public fp1 f46684b;

        /* JADX INFO: renamed from: c */
        @hib
        public n6i f46685c;

        /* JADX INFO: renamed from: d */
        @hib
        public fp1 f46686d;

        private C7258d() {
        }

        @Override // p000.l0d.InterfaceC8571b
        public void handleMessage(int i, @hib Object obj) {
            if (i == 7) {
                this.f46683a = (n6i) obj;
                return;
            }
            if (i == 8) {
                this.f46684b = (fp1) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.f46685c = null;
                this.f46686d = null;
            } else {
                this.f46685c = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.f46686d = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }

        @Override // p000.fp1
        public void onCameraMotion(long j, float[] fArr) {
            fp1 fp1Var = this.f46686d;
            if (fp1Var != null) {
                fp1Var.onCameraMotion(j, fArr);
            }
            fp1 fp1Var2 = this.f46684b;
            if (fp1Var2 != null) {
                fp1Var2.onCameraMotion(j, fArr);
            }
        }

        @Override // p000.fp1
        public void onCameraMotionReset() {
            fp1 fp1Var = this.f46686d;
            if (fp1Var != null) {
                fp1Var.onCameraMotionReset();
            }
            fp1 fp1Var2 = this.f46684b;
            if (fp1Var2 != null) {
                fp1Var2.onCameraMotionReset();
            }
        }

        @Override // p000.n6i
        public void onVideoFrameAboutToBeRendered(long j, long j2, kq6 kq6Var, @hib MediaFormat mediaFormat) {
            n6i n6iVar = this.f46685c;
            if (n6iVar != null) {
                n6iVar.onVideoFrameAboutToBeRendered(j, j2, kq6Var, mediaFormat);
            }
            n6i n6iVar2 = this.f46683a;
            if (n6iVar2 != null) {
                n6iVar2.onVideoFrameAboutToBeRendered(j, j2, kq6Var, mediaFormat);
            }
        }
    }

    /* JADX INFO: renamed from: ie5$e */
    public static final class C7259e implements noa {

        /* JADX INFO: renamed from: a */
        public final Object f46687a;

        /* JADX INFO: renamed from: b */
        public t1h f46688b;

        public C7259e(Object obj, t1h t1hVar) {
            this.f46687a = obj;
            this.f46688b = t1hVar;
        }

        @Override // p000.noa
        public t1h getTimeline() {
            return this.f46688b;
        }

        @Override // p000.noa
        public Object getUid() {
            return this.f46687a;
        }
    }

    static {
        lf5.registerModule("goog.exo.exoplayer");
    }

    @igg({"HandlerLeak"})
    public ie5(ca5.C2249c c2249c, @hib lzc lzcVar) {
        wp2 wp2Var = new wp2();
        this.f46632b1 = wp2Var;
        try {
            yh9.m25917i("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [" + lf5.f57469c + "] [" + x0i.f95982e + "]");
            Context applicationContext = c2249c.f16076a.getApplicationContext();
            this.f46634c1 = applicationContext;
            InterfaceC12162rn interfaceC12162rnApply = c2249c.f16084i.apply(c2249c.f16077b);
            this.f46660p1 = interfaceC12162rnApply;
            this.f46657n2 = c2249c.f16086k;
            this.f46641f2 = c2249c.f16087l;
            this.f46629Z1 = c2249c.f16093r;
            this.f46631a2 = c2249c.f16094s;
            this.f46645h2 = c2249c.f16091p;
            this.f46605C1 = c2249c.f16101z;
            SurfaceHolderCallbackC7257c surfaceHolderCallbackC7257c = new SurfaceHolderCallbackC7257c();
            this.f46672v1 = surfaceHolderCallbackC7257c;
            C7258d c7258d = new C7258d();
            this.f46674w1 = c7258d;
            Handler handler = new Handler(c2249c.f16085j);
            n1e[] n1eVarArrCreateRenderers = c2249c.f16079d.get().createRenderers(handler, surfaceHolderCallbackC7257c, surfaceHolderCallbackC7257c, surfaceHolderCallbackC7257c, surfaceHolderCallbackC7257c);
            this.f46638e1 = n1eVarArrCreateRenderers;
            u80.checkState(n1eVarArrCreateRenderers.length > 0);
            p7h p7hVar = c2249c.f16081f.get();
            this.f46640f1 = p7hVar;
            this.f46658o1 = c2249c.f16080e.get();
            vp0 vp0Var = c2249c.f16083h.get();
            this.f46664r1 = vp0Var;
            this.f46656n1 = c2249c.f16095t;
            this.f46613K1 = c2249c.f16096u;
            this.f46666s1 = c2249c.f16097v;
            this.f46668t1 = c2249c.f16098w;
            this.f46615M1 = c2249c.f16072A;
            Looper looper = c2249c.f16085j;
            this.f46662q1 = looper;
            h52 h52Var = c2249c.f16077b;
            this.f46670u1 = h52Var;
            lzc lzcVar2 = lzcVar == null ? this : lzcVar;
            this.f46636d1 = lzcVar2;
            this.f46648j1 = new za9<>(looper, h52Var, new za9.InterfaceC16058b() { // from class: cd5
                @Override // p000.za9.InterfaceC16058b
                public final void invoke(Object obj, i36 i36Var) {
                    this.f16284a.lambda$new$0((lzc.InterfaceC9049g) obj, i36Var);
                }
            });
            this.f46650k1 = new CopyOnWriteArraySet<>();
            this.f46654m1 = new ArrayList();
            this.f46614L1 = new sbf.C12510a(0);
            q7h q7hVar = new q7h(new r1e[n1eVarArrCreateRenderers.length], new pf5[n1eVarArrCreateRenderers.length], y7h.f100701b, null);
            this.f46628Z0 = q7hVar;
            this.f46652l1 = new t1h.C12849b();
            lzc.C9045c c9045cBuild = new lzc.C9045c.a().addAll(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32).addIf(29, p7hVar.isSetParametersSupported()).addIf(23, c2249c.f16092q).addIf(25, c2249c.f16092q).addIf(33, c2249c.f16092q).addIf(26, c2249c.f16092q).addIf(34, c2249c.f16092q).build();
            this.f46630a1 = c9045cBuild;
            this.f46616N1 = new lzc.C9045c.a().addAll(c9045cBuild).add(4).add(10).build();
            this.f46642g1 = h52Var.createHandler(looper, null);
            kf5.InterfaceC8345f interfaceC8345f = new kf5.InterfaceC8345f() { // from class: ed5
                @Override // p000.kf5.InterfaceC8345f
                public final void onPlaybackInfoUpdate(kf5.C8344e c8344e) {
                    this.f32684a.lambda$new$2(c8344e);
                }
            };
            this.f46644h1 = interfaceC8345f;
            this.f46669t2 = myc.createDummy(q7hVar);
            interfaceC12162rnApply.setPlayer(lzcVar2, looper);
            int i = x0i.f95978a;
            kf5 kf5Var = new kf5(n1eVarArrCreateRenderers, p7hVar, q7hVar, c2249c.f16082g.get(), vp0Var, this.f46606D1, this.f46607E1, interfaceC12162rnApply, this.f46613K1, c2249c.f16099x, c2249c.f16100y, this.f46615M1, looper, h52Var, interfaceC8345f, i < 31 ? new k0d() : C7256b.registerMediaMetricsListener(applicationContext, this, c2249c.f16073B), c2249c.f16074C);
            this.f46646i1 = kf5Var;
            this.f46643g2 = 1.0f;
            this.f46606D1 = 0;
            iga igaVar = iga.f46799B3;
            this.f46617O1 = igaVar;
            this.f46618P1 = igaVar;
            this.f46667s2 = igaVar;
            this.f46671u2 = -1;
            if (i < 21) {
                this.f46639e2 = initializeKeepSessionIdAudioTrack(0);
            } else {
                this.f46639e2 = x0i.generateAudioSessionIdV21(applicationContext);
            }
            this.f46647i2 = y93.f100822c;
            this.f46653l2 = true;
            addListener(interfaceC12162rnApply);
            vp0Var.addEventListener(new Handler(looper), interfaceC12162rnApply);
            addAudioOffloadListener(surfaceHolderCallbackC7257c);
            long j = c2249c.f16078c;
            if (j > 0) {
                kf5Var.experimentalSetForegroundModeTimeoutMs(j);
            }
            cd0 cd0Var = new cd0(c2249c.f16076a, handler, surfaceHolderCallbackC7257c);
            this.f46676x1 = cd0Var;
            cd0Var.setEnabled(c2249c.f16090o);
            be0 be0Var = new be0(c2249c.f16076a, handler, surfaceHolderCallbackC7257c);
            this.f46677y1 = be0Var;
            be0Var.setAudioAttributes(c2249c.f16088m ? this.f46641f2 : null);
            if (c2249c.f16092q) {
                v6g v6gVar = new v6g(c2249c.f16076a, handler, surfaceHolderCallbackC7257c);
                this.f46678z1 = v6gVar;
                v6gVar.setStreamType(x0i.getStreamTypeForAudioUsage(this.f46641f2.f101072c));
            } else {
                this.f46678z1 = null;
            }
            chi chiVar = new chi(c2249c.f16076a);
            this.f46603A1 = chiVar;
            chiVar.setEnabled(c2249c.f16089n != 0);
            gli gliVar = new gli(c2249c.f16076a);
            this.f46604B1 = gliVar;
            gliVar.setEnabled(c2249c.f16089n == 2);
            this.f46663q2 = createDeviceInfo(this.f46678z1);
            this.f46665r2 = z7i.f104340F;
            this.f46633b2 = ypf.f102624c;
            p7hVar.setAudioAttributes(this.f46641f2);
            sendRendererMessage(1, 10, Integer.valueOf(this.f46639e2));
            sendRendererMessage(2, 10, Integer.valueOf(this.f46639e2));
            sendRendererMessage(1, 3, this.f46641f2);
            sendRendererMessage(2, 4, Integer.valueOf(this.f46629Z1));
            sendRendererMessage(2, 5, Integer.valueOf(this.f46631a2));
            sendRendererMessage(1, 9, Boolean.valueOf(this.f46645h2));
            sendRendererMessage(2, 7, c7258d);
            sendRendererMessage(6, 8, c7258d);
            wp2Var.open();
        } catch (Throwable th) {
            this.f46632b1.open();
            throw th;
        }
    }

    private List<ppa.C11065c> addMediaSourceHolders(int i, List<vna> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ppa.C11065c c11065c = new ppa.C11065c(list.get(i2), this.f46656n1);
            arrayList.add(c11065c);
            this.f46654m1.add(i2 + i, new C7259e(c11065c.f71605b, c11065c.f71604a.getTimeline()));
        }
        this.f46614L1 = this.f46614L1.cloneAndInsert(i, arrayList.size());
        return arrayList;
    }

    private myc addMediaSourcesInternal(myc mycVar, int i, List<vna> list) {
        t1h t1hVar = mycVar.f62798a;
        this.f46608F1++;
        List<ppa.C11065c> listAddMediaSourceHolders = addMediaSourceHolders(i, list);
        t1h t1hVarCreateMaskingTimeline = createMaskingTimeline();
        myc mycVarMaskTimelineAndPosition = maskTimelineAndPosition(mycVar, t1hVarCreateMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(t1hVar, t1hVarCreateMaskingTimeline, getCurrentWindowIndexInternal(mycVar), getContentPositionInternal(mycVar)));
        this.f46646i1.addMediaSources(i, listAddMediaSourceHolders, this.f46614L1);
        return mycVarMaskTimelineAndPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public iga buildUpdatedMediaMetadata() {
        t1h currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return this.f46667s2;
        }
        return this.f46667s2.buildUpon().populate(currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f11826Y0).f83436c.f1449e).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p84 createDeviceInfo(@hib v6g v6gVar) {
        return new p84.C10834b(0).setMinVolume(v6gVar != null ? v6gVar.getMinVolume() : 0).setMaxVolume(v6gVar != null ? v6gVar.getMaxVolume() : 0).build();
    }

    private t1h createMaskingTimeline() {
        return new a1d(this.f46654m1, this.f46614L1);
    }

    private List<vna> createMediaSources(List<aga> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.f46658o1.createMediaSource(list.get(i)));
        }
        return arrayList;
    }

    private l0d createMessageInternal(l0d.InterfaceC8571b interfaceC8571b) {
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.f46669t2);
        kf5 kf5Var = this.f46646i1;
        t1h t1hVar = this.f46669t2.f62798a;
        if (currentWindowIndexInternal == -1) {
            currentWindowIndexInternal = 0;
        }
        return new l0d(kf5Var, interfaceC8571b, t1hVar, currentWindowIndexInternal, this.f46670u1, kf5Var.getPlaybackLooper());
    }

    private Pair<Boolean, Integer> evaluateMediaItemTransitionReason(myc mycVar, myc mycVar2, boolean z, int i, boolean z2, boolean z3) {
        t1h t1hVar = mycVar2.f62798a;
        t1h t1hVar2 = mycVar.f62798a;
        if (t1hVar2.isEmpty() && t1hVar.isEmpty()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i2 = 3;
        if (t1hVar2.isEmpty() != t1hVar.isEmpty()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (t1hVar.getWindow(t1hVar.getPeriodByUid(mycVar2.f62799b.f71106a, this.f46652l1).f83398c, this.f11826Y0).f83434a.equals(t1hVar2.getWindow(t1hVar2.getPeriodByUid(mycVar.f62799b.f71106a, this.f46652l1).f83398c, this.f11826Y0).f83434a)) {
            return (z && i == 0 && mycVar2.f62799b.f71109d < mycVar.f62799b.f71109d) ? new Pair<>(Boolean.TRUE, 0) : (z && i == 1 && z3) ? new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z && i == 0) {
            i2 = 1;
        } else if (z && i == 1) {
            i2 = 2;
        } else if (!z2) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i2));
    }

    private long getContentPositionInternal(myc mycVar) {
        if (!mycVar.f62799b.isAd()) {
            return x0i.usToMs(getCurrentPositionUsInternal(mycVar));
        }
        mycVar.f62798a.getPeriodByUid(mycVar.f62799b.f71106a, this.f46652l1);
        return mycVar.f62800c == -9223372036854775807L ? mycVar.f62798a.getWindow(getCurrentWindowIndexInternal(mycVar), this.f11826Y0).getDefaultPositionMs() : this.f46652l1.getPositionInWindowMs() + x0i.usToMs(mycVar.f62800c);
    }

    private long getCurrentPositionUsInternal(myc mycVar) {
        if (mycVar.f62798a.isEmpty()) {
            return x0i.msToUs(this.f46675w2);
        }
        long estimatedPositionUs = mycVar.f62812o ? mycVar.getEstimatedPositionUs() : mycVar.f62815r;
        return mycVar.f62799b.isAd() ? estimatedPositionUs : periodPositionUsToWindowPositionUs(mycVar.f62798a, mycVar.f62799b, estimatedPositionUs);
    }

    private int getCurrentWindowIndexInternal(myc mycVar) {
        return mycVar.f62798a.isEmpty() ? this.f46671u2 : mycVar.f62798a.getPeriodByUid(mycVar.f62799b.f71106a, this.f46652l1).f83398c;
    }

    @hib
    private Pair<Object, Long> getPeriodPositionUsAfterTimelineChanged(t1h t1hVar, t1h t1hVar2, int i, long j) {
        if (t1hVar.isEmpty() || t1hVar2.isEmpty()) {
            boolean z = !t1hVar.isEmpty() && t1hVar2.isEmpty();
            return maskWindowPositionMsOrGetPeriodPositionUs(t1hVar2, z ? -1 : i, z ? -9223372036854775807L : j);
        }
        Pair<Object, Long> periodPositionUs = t1hVar.getPeriodPositionUs(this.f11826Y0, this.f46652l1, i, x0i.msToUs(j));
        Object obj = ((Pair) x0i.castNonNull(periodPositionUs)).first;
        if (t1hVar2.getIndexOfPeriod(obj) != -1) {
            return periodPositionUs;
        }
        Object objM14712e = kf5.m14712e(this.f11826Y0, this.f46652l1, this.f46606D1, this.f46607E1, obj, t1hVar, t1hVar2);
        if (objM14712e == null) {
            return maskWindowPositionMsOrGetPeriodPositionUs(t1hVar2, -1, -9223372036854775807L);
        }
        t1hVar2.getPeriodByUid(objM14712e, this.f46652l1);
        int i2 = this.f46652l1.f83398c;
        return maskWindowPositionMsOrGetPeriodPositionUs(t1hVar2, i2, t1hVar2.getWindow(i2, this.f11826Y0).getDefaultPositionMs());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getPlayWhenReadyChangeReason(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    private lzc.C9053k getPositionInfo(long j) {
        aga agaVar;
        Object obj;
        int indexOfPeriod;
        Object obj2;
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        if (this.f46669t2.f62798a.isEmpty()) {
            agaVar = null;
            obj = null;
            indexOfPeriod = -1;
            obj2 = null;
        } else {
            myc mycVar = this.f46669t2;
            Object obj3 = mycVar.f62799b.f71106a;
            mycVar.f62798a.getPeriodByUid(obj3, this.f46652l1);
            indexOfPeriod = this.f46669t2.f62798a.getIndexOfPeriod(obj3);
            obj = obj3;
            obj2 = this.f46669t2.f62798a.getWindow(currentMediaItemIndex, this.f11826Y0).f83434a;
            agaVar = this.f11826Y0.f83436c;
        }
        long jUsToMs = x0i.usToMs(j);
        long jUsToMs2 = this.f46669t2.f62799b.isAd() ? x0i.usToMs(getRequestedContentPositionUs(this.f46669t2)) : jUsToMs;
        vna.C14175b c14175b = this.f46669t2.f62799b;
        return new lzc.C9053k(obj2, currentMediaItemIndex, agaVar, obj, indexOfPeriod, jUsToMs, jUsToMs2, c14175b.f71107b, c14175b.f71108c);
    }

    private lzc.C9053k getPreviousPositionInfo(int i, myc mycVar, int i2) {
        int i3;
        Object obj;
        aga agaVar;
        Object obj2;
        int i4;
        long requestedContentPositionUs;
        long requestedContentPositionUs2;
        t1h.C12849b c12849b = new t1h.C12849b();
        if (mycVar.f62798a.isEmpty()) {
            i3 = i2;
            obj = null;
            agaVar = null;
            obj2 = null;
            i4 = -1;
        } else {
            Object obj3 = mycVar.f62799b.f71106a;
            mycVar.f62798a.getPeriodByUid(obj3, c12849b);
            int i5 = c12849b.f83398c;
            int indexOfPeriod = mycVar.f62798a.getIndexOfPeriod(obj3);
            Object obj4 = mycVar.f62798a.getWindow(i5, this.f11826Y0).f83434a;
            agaVar = this.f11826Y0.f83436c;
            obj2 = obj3;
            i4 = indexOfPeriod;
            obj = obj4;
            i3 = i5;
        }
        if (i == 0) {
            if (mycVar.f62799b.isAd()) {
                vna.C14175b c14175b = mycVar.f62799b;
                requestedContentPositionUs = c12849b.getAdDurationUs(c14175b.f71107b, c14175b.f71108c);
                requestedContentPositionUs2 = getRequestedContentPositionUs(mycVar);
            } else {
                requestedContentPositionUs = mycVar.f62799b.f71110e != -1 ? getRequestedContentPositionUs(this.f46669t2) : c12849b.f83400e + c12849b.f83399d;
                requestedContentPositionUs2 = requestedContentPositionUs;
            }
        } else if (mycVar.f62799b.isAd()) {
            requestedContentPositionUs = mycVar.f62815r;
            requestedContentPositionUs2 = getRequestedContentPositionUs(mycVar);
        } else {
            requestedContentPositionUs = c12849b.f83400e + mycVar.f62815r;
            requestedContentPositionUs2 = requestedContentPositionUs;
        }
        long jUsToMs = x0i.usToMs(requestedContentPositionUs);
        long jUsToMs2 = x0i.usToMs(requestedContentPositionUs2);
        vna.C14175b c14175b2 = mycVar.f62799b;
        return new lzc.C9053k(obj, i3, agaVar, obj2, i4, jUsToMs, jUsToMs2, c14175b2.f71107b, c14175b2.f71108c);
    }

    private static long getRequestedContentPositionUs(myc mycVar) {
        t1h.C12851d c12851d = new t1h.C12851d();
        t1h.C12849b c12849b = new t1h.C12849b();
        mycVar.f62798a.getPeriodByUid(mycVar.f62799b.f71106a, c12849b);
        return mycVar.f62800c == -9223372036854775807L ? mycVar.f62798a.getWindow(c12849b.f83398c, c12851d).getDefaultPositionUs() : c12849b.getPositionInWindowUs() + mycVar.f62800c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handlePlaybackInfo, reason: merged with bridge method [inline-methods] */
    public void lambda$new$1(kf5.C8344e c8344e) {
        long j;
        boolean z;
        long jPeriodPositionUsToWindowPositionUs;
        int i = this.f46608F1 - c8344e.f53955c;
        this.f46608F1 = i;
        boolean z2 = true;
        if (c8344e.f53956d) {
            this.f46609G1 = c8344e.f53957e;
            this.f46610H1 = true;
        }
        if (c8344e.f53958f) {
            this.f46611I1 = c8344e.f53959g;
        }
        if (i == 0) {
            t1h t1hVar = c8344e.f53954b.f62798a;
            if (!this.f46669t2.f62798a.isEmpty() && t1hVar.isEmpty()) {
                this.f46671u2 = -1;
                this.f46675w2 = 0L;
                this.f46673v2 = 0;
            }
            if (!t1hVar.isEmpty()) {
                List<t1h> listM24h = ((a1d) t1hVar).m24h();
                u80.checkState(listM24h.size() == this.f46654m1.size());
                for (int i2 = 0; i2 < listM24h.size(); i2++) {
                    this.f46654m1.get(i2).f46688b = listM24h.get(i2);
                }
            }
            if (this.f46610H1) {
                if (c8344e.f53954b.f62799b.equals(this.f46669t2.f62799b) && c8344e.f53954b.f62801d == this.f46669t2.f62815r) {
                    z2 = false;
                }
                if (z2) {
                    if (t1hVar.isEmpty() || c8344e.f53954b.f62799b.isAd()) {
                        jPeriodPositionUsToWindowPositionUs = c8344e.f53954b.f62801d;
                    } else {
                        myc mycVar = c8344e.f53954b;
                        jPeriodPositionUsToWindowPositionUs = periodPositionUsToWindowPositionUs(t1hVar, mycVar.f62799b, mycVar.f62801d);
                    }
                    j = jPeriodPositionUsToWindowPositionUs;
                } else {
                    j = -9223372036854775807L;
                }
                z = z2;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.f46610H1 = false;
            updatePlaybackInfo(c8344e.f53954b, 1, this.f46611I1, z, this.f46609G1, j, -1, false);
        }
    }

    private int initializeKeepSessionIdAudioTrack(int i) {
        AudioTrack audioTrack = this.f46621S1;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i) {
            this.f46621S1.release();
            this.f46621S1 = null;
        }
        if (this.f46621S1 == null) {
            this.f46621S1 = new AudioTrack(3, 4000, 4, 2, 2, 0, i);
        }
        return this.f46621S1.getAudioSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(lzc.InterfaceC9049g interfaceC9049g, i36 i36Var) {
        interfaceC9049g.onEvents(this.f46636d1, new lzc.C9048f(i36Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(final kf5.C8344e c8344e) {
        this.f46642g1.post(new Runnable() { // from class: uc5
            @Override // java.lang.Runnable
            public final void run() {
                this.f87526a.lambda$new$1(c8344e);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$release$5(lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onPlayerError(ba5.createForUnexpected(new nf5(1), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPlaylistMetadata$7(lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onPlaylistMetadataChanged(this.f46618P1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateAvailableCommands$26(lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onAvailableCommandsChanged(this.f46616N1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$12(myc mycVar, int i, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onTimelineChanged(mycVar.f62798a, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$13(int i, lzc.C9053k c9053k, lzc.C9053k c9053k2, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onPositionDiscontinuity(i);
        interfaceC9049g.onPositionDiscontinuity(c9053k, c9053k2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$15(myc mycVar, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onPlayerErrorChanged(mycVar.f62803f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$16(myc mycVar, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onPlayerError(mycVar.f62803f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$17(myc mycVar, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onTracksChanged(mycVar.f62806i.f73449d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$19(myc mycVar, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onLoadingChanged(mycVar.f62804g);
        interfaceC9049g.onIsLoadingChanged(mycVar.f62804g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$20(myc mycVar, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onPlayerStateChanged(mycVar.f62809l, mycVar.f62802e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$21(myc mycVar, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onPlaybackStateChanged(mycVar.f62802e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$22(myc mycVar, int i, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onPlayWhenReadyChanged(mycVar.f62809l, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$23(myc mycVar, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onPlaybackSuppressionReasonChanged(mycVar.f62810m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$24(myc mycVar, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onIsPlayingChanged(mycVar.isPlaying());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$25(myc mycVar, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onPlaybackParametersChanged(mycVar.f62811n);
    }

    private myc maskTimelineAndPosition(myc mycVar, t1h t1hVar, @hib Pair<Object, Long> pair) {
        u80.checkArgument(t1hVar.isEmpty() || pair != null);
        t1h t1hVar2 = mycVar.f62798a;
        long contentPositionInternal = getContentPositionInternal(mycVar);
        myc mycVarCopyWithTimeline = mycVar.copyWithTimeline(t1hVar);
        if (t1hVar.isEmpty()) {
            vna.C14175b dummyPeriodForEmptyTimeline = myc.getDummyPeriodForEmptyTimeline();
            long jMsToUs = x0i.msToUs(this.f46675w2);
            myc mycVarCopyWithLoadingMediaPeriodId = mycVarCopyWithTimeline.copyWithNewPosition(dummyPeriodForEmptyTimeline, jMsToUs, jMsToUs, jMsToUs, 0L, m6h.f60031e, this.f46628Z0, kx7.m15110of()).copyWithLoadingMediaPeriodId(dummyPeriodForEmptyTimeline);
            mycVarCopyWithLoadingMediaPeriodId.f62813p = mycVarCopyWithLoadingMediaPeriodId.f62815r;
            return mycVarCopyWithLoadingMediaPeriodId;
        }
        Object obj = mycVarCopyWithTimeline.f62799b.f71106a;
        boolean zEquals = obj.equals(((Pair) x0i.castNonNull(pair)).first);
        vna.C14175b c14175b = !zEquals ? new vna.C14175b(pair.first) : mycVarCopyWithTimeline.f62799b;
        long jLongValue = ((Long) pair.second).longValue();
        long jMsToUs2 = x0i.msToUs(contentPositionInternal);
        if (!t1hVar2.isEmpty()) {
            jMsToUs2 -= t1hVar2.getPeriodByUid(obj, this.f46652l1).getPositionInWindowUs();
        }
        if (!zEquals || jLongValue < jMsToUs2) {
            u80.checkState(!c14175b.isAd());
            myc mycVarCopyWithLoadingMediaPeriodId2 = mycVarCopyWithTimeline.copyWithNewPosition(c14175b, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? m6h.f60031e : mycVarCopyWithTimeline.f62805h, !zEquals ? this.f46628Z0 : mycVarCopyWithTimeline.f62806i, !zEquals ? kx7.m15110of() : mycVarCopyWithTimeline.f62807j).copyWithLoadingMediaPeriodId(c14175b);
            mycVarCopyWithLoadingMediaPeriodId2.f62813p = jLongValue;
            return mycVarCopyWithLoadingMediaPeriodId2;
        }
        if (jLongValue == jMsToUs2) {
            int indexOfPeriod = t1hVar.getIndexOfPeriod(mycVarCopyWithTimeline.f62808k.f71106a);
            if (indexOfPeriod == -1 || t1hVar.getPeriod(indexOfPeriod, this.f46652l1).f83398c != t1hVar.getPeriodByUid(c14175b.f71106a, this.f46652l1).f83398c) {
                t1hVar.getPeriodByUid(c14175b.f71106a, this.f46652l1);
                long adDurationUs = c14175b.isAd() ? this.f46652l1.getAdDurationUs(c14175b.f71107b, c14175b.f71108c) : this.f46652l1.f83399d;
                mycVarCopyWithTimeline = mycVarCopyWithTimeline.copyWithNewPosition(c14175b, mycVarCopyWithTimeline.f62815r, mycVarCopyWithTimeline.f62815r, mycVarCopyWithTimeline.f62801d, adDurationUs - mycVarCopyWithTimeline.f62815r, mycVarCopyWithTimeline.f62805h, mycVarCopyWithTimeline.f62806i, mycVarCopyWithTimeline.f62807j).copyWithLoadingMediaPeriodId(c14175b);
                mycVarCopyWithTimeline.f62813p = adDurationUs;
            }
        } else {
            u80.checkState(!c14175b.isAd());
            long jMax = Math.max(0L, mycVarCopyWithTimeline.f62814q - (jLongValue - jMsToUs2));
            long j = mycVarCopyWithTimeline.f62813p;
            if (mycVarCopyWithTimeline.f62808k.equals(mycVarCopyWithTimeline.f62799b)) {
                j = jLongValue + jMax;
            }
            mycVarCopyWithTimeline = mycVarCopyWithTimeline.copyWithNewPosition(c14175b, jLongValue, jLongValue, jLongValue, jMax, mycVarCopyWithTimeline.f62805h, mycVarCopyWithTimeline.f62806i, mycVarCopyWithTimeline.f62807j);
            mycVarCopyWithTimeline.f62813p = j;
        }
        return mycVarCopyWithTimeline;
    }

    @hib
    private Pair<Object, Long> maskWindowPositionMsOrGetPeriodPositionUs(t1h t1hVar, int i, long j) {
        if (t1hVar.isEmpty()) {
            this.f46671u2 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f46675w2 = j;
            this.f46673v2 = 0;
            return null;
        }
        if (i == -1 || i >= t1hVar.getWindowCount()) {
            i = t1hVar.getFirstWindowIndex(this.f46607E1);
            j = t1hVar.getWindow(i, this.f11826Y0).getDefaultPositionMs();
        }
        return t1hVar.getPeriodPositionUs(this.f11826Y0, this.f46652l1, i, x0i.msToUs(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeNotifySurfaceSizeChanged(final int i, final int i2) {
        if (i == this.f46633b2.getWidth() && i2 == this.f46633b2.getHeight()) {
            return;
        }
        this.f46633b2 = new ypf(i, i2);
        this.f46648j1.sendEvent(24, new za9.InterfaceC16057a() { // from class: kd5
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((lzc.InterfaceC9049g) obj).onSurfaceSizeChanged(i, i2);
            }
        });
        sendRendererMessage(2, 14, new ypf(i, i2));
    }

    private long periodPositionUsToWindowPositionUs(t1h t1hVar, vna.C14175b c14175b, long j) {
        t1hVar.getPeriodByUid(c14175b.f71106a, this.f46652l1);
        return j + this.f46652l1.getPositionInWindowUs();
    }

    private myc removeMediaItemsInternal(myc mycVar, int i, int i2) {
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(mycVar);
        long contentPositionInternal = getContentPositionInternal(mycVar);
        t1h t1hVar = mycVar.f62798a;
        int size = this.f46654m1.size();
        this.f46608F1++;
        removeMediaSourceHolders(i, i2);
        t1h t1hVarCreateMaskingTimeline = createMaskingTimeline();
        myc mycVarMaskTimelineAndPosition = maskTimelineAndPosition(mycVar, t1hVarCreateMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(t1hVar, t1hVarCreateMaskingTimeline, currentWindowIndexInternal, contentPositionInternal));
        int i3 = mycVarMaskTimelineAndPosition.f62802e;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && currentWindowIndexInternal >= mycVarMaskTimelineAndPosition.f62798a.getWindowCount()) {
            mycVarMaskTimelineAndPosition = mycVarMaskTimelineAndPosition.copyWithPlaybackState(4);
        }
        this.f46646i1.removeMediaSources(i, i2, this.f46614L1);
        return mycVarMaskTimelineAndPosition;
    }

    private void removeMediaSourceHolders(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.f46654m1.remove(i3);
        }
        this.f46614L1 = this.f46614L1.cloneAndRemove(i, i2);
    }

    private void removeSurfaceCallbacks() {
        if (this.f46625W1 != null) {
            createMessageInternal(this.f46674w1).setType(10000).setPayload(null).send();
            this.f46625W1.removeVideoSurfaceListener(this.f46672v1);
            this.f46625W1 = null;
        }
        TextureView textureView = this.f46627Y1;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f46672v1) {
                yh9.m25919w("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f46627Y1.setSurfaceTextureListener(null);
            }
            this.f46627Y1 = null;
        }
        SurfaceHolder surfaceHolder = this.f46624V1;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f46672v1);
            this.f46624V1 = null;
        }
    }

    private void sendRendererMessage(int i, int i2, @hib Object obj) {
        for (n1e n1eVar : this.f46638e1) {
            if (n1eVar.getTrackType() == i) {
                createMessageInternal(n1eVar).setType(i2).setPayload(obj).send();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendVolumeToRenderers() {
        sendRendererMessage(1, 2, Float.valueOf(this.f46643g2 * this.f46677y1.getVolumeMultiplier()));
    }

    private void setMediaSourcesInternal(List<vna> list, int i, long j, boolean z) {
        int firstWindowIndex;
        long j2;
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.f46669t2);
        long currentPosition = getCurrentPosition();
        this.f46608F1++;
        if (!this.f46654m1.isEmpty()) {
            removeMediaSourceHolders(0, this.f46654m1.size());
        }
        List<ppa.C11065c> listAddMediaSourceHolders = addMediaSourceHolders(0, list);
        t1h t1hVarCreateMaskingTimeline = createMaskingTimeline();
        if (!t1hVarCreateMaskingTimeline.isEmpty() && i >= t1hVarCreateMaskingTimeline.getWindowCount()) {
            throw new ls7(t1hVarCreateMaskingTimeline, i, j);
        }
        if (z) {
            j2 = -9223372036854775807L;
            firstWindowIndex = t1hVarCreateMaskingTimeline.getFirstWindowIndex(this.f46607E1);
        } else if (i == -1) {
            firstWindowIndex = currentWindowIndexInternal;
            j2 = currentPosition;
        } else {
            firstWindowIndex = i;
            j2 = j;
        }
        myc mycVarMaskTimelineAndPosition = maskTimelineAndPosition(this.f46669t2, t1hVarCreateMaskingTimeline, maskWindowPositionMsOrGetPeriodPositionUs(t1hVarCreateMaskingTimeline, firstWindowIndex, j2));
        int i2 = mycVarMaskTimelineAndPosition.f62802e;
        if (firstWindowIndex != -1 && i2 != 1) {
            i2 = (t1hVarCreateMaskingTimeline.isEmpty() || firstWindowIndex >= t1hVarCreateMaskingTimeline.getWindowCount()) ? 4 : 2;
        }
        myc mycVarCopyWithPlaybackState = mycVarMaskTimelineAndPosition.copyWithPlaybackState(i2);
        this.f46646i1.setMediaSources(listAddMediaSourceHolders, firstWindowIndex, x0i.msToUs(j2), this.f46614L1);
        updatePlaybackInfo(mycVarCopyWithPlaybackState, 0, 1, (this.f46669t2.f62799b.f71106a.equals(mycVarCopyWithPlaybackState.f62799b.f71106a) || this.f46669t2.f62798a.isEmpty()) ? false : true, 4, getCurrentPositionUsInternal(mycVarCopyWithPlaybackState), -1, false);
    }

    private void setNonVideoOutputSurfaceHolderInternal(SurfaceHolder surfaceHolder) {
        this.f46626X1 = false;
        this.f46624V1 = surfaceHolder;
        surfaceHolder.addCallback(this.f46672v1);
        Surface surface = this.f46624V1.getSurface();
        if (surface == null || !surface.isValid()) {
            maybeNotifySurfaceSizeChanged(0, 0);
        } else {
            Rect surfaceFrame = this.f46624V1.getSurfaceFrame();
            maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSurfaceTextureInternal(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        setVideoOutputInternal(surface);
        this.f46623U1 = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoOutputInternal(@hib Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (n1e n1eVar : this.f46638e1) {
            if (n1eVar.getTrackType() == 2) {
                arrayList.add(createMessageInternal(n1eVar).setType(1).setPayload(obj).send());
            }
        }
        Object obj2 = this.f46622T1;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((l0d) it.next()).blockUntilDelivered(this.f46605C1);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.f46622T1;
            Surface surface = this.f46623U1;
            if (obj3 == surface) {
                surface.release();
                this.f46623U1 = null;
            }
        }
        this.f46622T1 = obj;
        if (z) {
            stopInternal(ba5.createForUnexpected(new nf5(3), 1003));
        }
    }

    private void stopInternal(@hib ba5 ba5Var) {
        myc mycVar = this.f46669t2;
        myc mycVarCopyWithLoadingMediaPeriodId = mycVar.copyWithLoadingMediaPeriodId(mycVar.f62799b);
        mycVarCopyWithLoadingMediaPeriodId.f62813p = mycVarCopyWithLoadingMediaPeriodId.f62815r;
        mycVarCopyWithLoadingMediaPeriodId.f62814q = 0L;
        myc mycVarCopyWithPlaybackState = mycVarCopyWithLoadingMediaPeriodId.copyWithPlaybackState(1);
        if (ba5Var != null) {
            mycVarCopyWithPlaybackState = mycVarCopyWithPlaybackState.copyWithPlaybackError(ba5Var);
        }
        this.f46608F1++;
        this.f46646i1.stop();
        updatePlaybackInfo(mycVarCopyWithPlaybackState, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    private void updateAvailableCommands() {
        lzc.C9045c c9045c = this.f46616N1;
        lzc.C9045c availableCommands = x0i.getAvailableCommands(this.f46636d1, this.f46630a1);
        this.f46616N1 = availableCommands;
        if (availableCommands.equals(c9045c)) {
            return;
        }
        this.f46648j1.queueEvent(13, new za9.InterfaceC16057a() { // from class: md5
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                this.f60664a.lambda$updateAvailableCommands$26((lzc.InterfaceC9049g) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayWhenReady(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        myc mycVarCopyWithEstimatedPosition = this.f46669t2;
        if (mycVarCopyWithEstimatedPosition.f62809l == z2 && mycVarCopyWithEstimatedPosition.f62810m == i3) {
            return;
        }
        this.f46608F1++;
        if (mycVarCopyWithEstimatedPosition.f62812o) {
            mycVarCopyWithEstimatedPosition = mycVarCopyWithEstimatedPosition.copyWithEstimatedPosition();
        }
        myc mycVarCopyWithPlayWhenReady = mycVarCopyWithEstimatedPosition.copyWithPlayWhenReady(z2, i3);
        this.f46646i1.setPlayWhenReady(z2, i3);
        updatePlaybackInfo(mycVarCopyWithPlayWhenReady, 0, i2, false, 5, -9223372036854775807L, -1, false);
    }

    private void updatePlaybackInfo(final myc mycVar, final int i, final int i2, boolean z, final int i3, long j, int i4, boolean z2) {
        myc mycVar2 = this.f46669t2;
        this.f46669t2 = mycVar;
        boolean zEquals = mycVar2.f62798a.equals(mycVar.f62798a);
        Pair<Boolean, Integer> pairEvaluateMediaItemTransitionReason = evaluateMediaItemTransitionReason(mycVar, mycVar2, z, i3, !zEquals, z2);
        boolean zBooleanValue = ((Boolean) pairEvaluateMediaItemTransitionReason.first).booleanValue();
        final int iIntValue = ((Integer) pairEvaluateMediaItemTransitionReason.second).intValue();
        iga igaVarBuildUpdatedMediaMetadata = this.f46617O1;
        if (zBooleanValue) {
            agaVar = mycVar.f62798a.isEmpty() ? null : mycVar.f62798a.getWindow(mycVar.f62798a.getPeriodByUid(mycVar.f62799b.f71106a, this.f46652l1).f83398c, this.f11826Y0).f83436c;
            this.f46667s2 = iga.f46799B3;
        }
        if (zBooleanValue || !mycVar2.f62807j.equals(mycVar.f62807j)) {
            this.f46667s2 = this.f46667s2.buildUpon().populateFromMetadata(mycVar.f62807j).build();
            igaVarBuildUpdatedMediaMetadata = buildUpdatedMediaMetadata();
        }
        boolean zEquals2 = igaVarBuildUpdatedMediaMetadata.equals(this.f46617O1);
        this.f46617O1 = igaVarBuildUpdatedMediaMetadata;
        boolean z3 = mycVar2.f62809l != mycVar.f62809l;
        boolean z4 = mycVar2.f62802e != mycVar.f62802e;
        if (z4 || z3) {
            updateWakeAndWifiLock();
        }
        boolean z5 = mycVar2.f62804g;
        boolean z6 = mycVar.f62804g;
        boolean z7 = z5 != z6;
        if (z7) {
            updatePriorityTaskManagerForIsLoadingChange(z6);
        }
        if (!zEquals) {
            this.f46648j1.queueEvent(0, new za9.InterfaceC16057a() { // from class: zb5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ie5.lambda$updatePlaybackInfo$12(mycVar, i, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (z) {
            final lzc.C9053k previousPositionInfo = getPreviousPositionInfo(i3, mycVar2, i4);
            final lzc.C9053k positionInfo = getPositionInfo(j);
            this.f46648j1.queueEvent(11, new za9.InterfaceC16057a() { // from class: yd5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ie5.lambda$updatePlaybackInfo$13(i3, previousPositionInfo, positionInfo, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f46648j1.queueEvent(1, new za9.InterfaceC16057a() { // from class: ae5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ((lzc.InterfaceC9049g) obj).onMediaItemTransition(agaVar, iIntValue);
                }
            });
        }
        if (mycVar2.f62803f != mycVar.f62803f) {
            this.f46648j1.queueEvent(10, new za9.InterfaceC16057a() { // from class: ce5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ie5.lambda$updatePlaybackInfo$15(mycVar, (lzc.InterfaceC9049g) obj);
                }
            });
            if (mycVar.f62803f != null) {
                this.f46648j1.queueEvent(10, new za9.InterfaceC16057a() { // from class: ee5
                    @Override // p000.za9.InterfaceC16057a
                    public final void invoke(Object obj) {
                        ie5.lambda$updatePlaybackInfo$16(mycVar, (lzc.InterfaceC9049g) obj);
                    }
                });
            }
        }
        q7h q7hVar = mycVar2.f62806i;
        q7h q7hVar2 = mycVar.f62806i;
        if (q7hVar != q7hVar2) {
            this.f46640f1.onSelectionActivated(q7hVar2.f73450e);
            this.f46648j1.queueEvent(2, new za9.InterfaceC16057a() { // from class: ge5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ie5.lambda$updatePlaybackInfo$17(mycVar, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (!zEquals2) {
            final iga igaVar = this.f46617O1;
            this.f46648j1.queueEvent(14, new za9.InterfaceC16057a() { // from class: bc5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ((lzc.InterfaceC9049g) obj).onMediaMetadataChanged(igaVar);
                }
            });
        }
        if (z7) {
            this.f46648j1.queueEvent(3, new za9.InterfaceC16057a() { // from class: ec5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ie5.lambda$updatePlaybackInfo$19(mycVar, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (z4 || z3) {
            this.f46648j1.queueEvent(-1, new za9.InterfaceC16057a() { // from class: gc5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ie5.lambda$updatePlaybackInfo$20(mycVar, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (z4) {
            this.f46648j1.queueEvent(4, new za9.InterfaceC16057a() { // from class: ic5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ie5.lambda$updatePlaybackInfo$21(mycVar, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (z3) {
            this.f46648j1.queueEvent(5, new za9.InterfaceC16057a() { // from class: dc5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ie5.lambda$updatePlaybackInfo$22(mycVar, i2, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (mycVar2.f62810m != mycVar.f62810m) {
            this.f46648j1.queueEvent(6, new za9.InterfaceC16057a() { // from class: zc5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ie5.lambda$updatePlaybackInfo$23(mycVar, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (mycVar2.isPlaying() != mycVar.isPlaying()) {
            this.f46648j1.queueEvent(7, new za9.InterfaceC16057a() { // from class: ud5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ie5.lambda$updatePlaybackInfo$24(mycVar, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (!mycVar2.f62811n.equals(mycVar.f62811n)) {
            this.f46648j1.queueEvent(12, new za9.InterfaceC16057a() { // from class: wd5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ie5.lambda$updatePlaybackInfo$25(mycVar, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        updateAvailableCommands();
        this.f46648j1.flushEvents();
        if (mycVar2.f62812o != mycVar.f62812o) {
            Iterator<ca5.InterfaceC2248b> it = this.f46650k1.iterator();
            while (it.hasNext()) {
                it.next().onExperimentalSleepingForOffloadChanged(mycVar.f62812o);
            }
        }
    }

    private void updatePriorityTaskManagerForIsLoadingChange(boolean z) {
        jcd jcdVar = this.f46657n2;
        if (jcdVar != null) {
            if (z && !this.f46659o2) {
                jcdVar.add(0);
                this.f46659o2 = true;
            } else {
                if (z || !this.f46659o2) {
                    return;
                }
                jcdVar.remove(0);
                this.f46659o2 = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateWakeAndWifiLock() {
        int playbackState = getPlaybackState();
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                this.f46603A1.setStayAwake(getPlayWhenReady() && !experimentalIsSleepingForOffload());
                this.f46604B1.setStayAwake(getPlayWhenReady());
                return;
            } else if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        this.f46603A1.setStayAwake(false);
        this.f46604B1.setStayAwake(false);
    }

    private void verifyApplicationThread() {
        this.f46632b1.blockUninterruptible();
        if (Thread.currentThread() != getApplicationLooper().getThread()) {
            String invariant = x0i.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), getApplicationLooper().getThread().getName());
            if (this.f46653l2) {
                throw new IllegalStateException(invariant);
            }
            yh9.m25920w("ExoPlayerImpl", invariant, this.f46655m2 ? null : new IllegalStateException());
            this.f46655m2 = true;
        }
    }

    @Override // p000.ca5
    public void addAnalyticsListener(InterfaceC5415eo interfaceC5415eo) {
        this.f46660p1.addListener((InterfaceC5415eo) u80.checkNotNull(interfaceC5415eo));
    }

    @Override // p000.ca5
    public void addAudioOffloadListener(ca5.InterfaceC2248b interfaceC2248b) {
        this.f46650k1.add(interfaceC2248b);
    }

    @Override // p000.lzc
    public void addListener(lzc.InterfaceC9049g interfaceC9049g) {
        this.f46648j1.add((lzc.InterfaceC9049g) u80.checkNotNull(interfaceC9049g));
    }

    @Override // p000.lzc
    public void addMediaItems(int i, List<aga> list) {
        verifyApplicationThread();
        addMediaSources(i, createMediaSources(list));
    }

    @Override // p000.ca5
    public void addMediaSource(vna vnaVar) {
        verifyApplicationThread();
        addMediaSources(Collections.singletonList(vnaVar));
    }

    @Override // p000.ca5
    public void addMediaSources(List<vna> list) {
        verifyApplicationThread();
        addMediaSources(this.f46654m1.size(), list);
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2247a
    public void clearAuxEffectInfo() {
        verifyApplicationThread();
        setAuxEffectInfo(new om0(0, 0.0f));
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2252f
    public void clearCameraMotionListener(fp1 fp1Var) {
        verifyApplicationThread();
        if (this.f46651k2 != fp1Var) {
            return;
        }
        createMessageInternal(this.f46674w1).setType(8).setPayload(null).send();
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2252f
    public void clearVideoFrameMetadataListener(n6i n6iVar) {
        verifyApplicationThread();
        if (this.f46649j2 != n6iVar) {
            return;
        }
        createMessageInternal(this.f46674w1).setType(7).setPayload(null).send();
    }

    @Override // p000.lzc
    public void clearVideoSurface() {
        verifyApplicationThread();
        removeSurfaceCallbacks();
        setVideoOutputInternal(null);
        maybeNotifySurfaceSizeChanged(0, 0);
    }

    @Override // p000.lzc
    public void clearVideoSurfaceHolder(@hib SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (surfaceHolder == null || surfaceHolder != this.f46624V1) {
            return;
        }
        clearVideoSurface();
    }

    @Override // p000.lzc
    public void clearVideoSurfaceView(@hib SurfaceView surfaceView) {
        verifyApplicationThread();
        clearVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // p000.lzc
    public void clearVideoTextureView(@hib TextureView textureView) {
        verifyApplicationThread();
        if (textureView == null || textureView != this.f46627Y1) {
            return;
        }
        clearVideoSurface();
    }

    @Override // p000.ca5
    public l0d createMessage(l0d.InterfaceC8571b interfaceC8571b) {
        verifyApplicationThread();
        return createMessageInternal(interfaceC8571b);
    }

    @Override // p000.lzc
    @Deprecated
    public void decreaseDeviceVolume() {
        verifyApplicationThread();
        v6g v6gVar = this.f46678z1;
        if (v6gVar != null) {
            v6gVar.decreaseVolume(1);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m12987e0(boolean z) {
        this.f46653l2 = z;
        this.f46648j1.setThrowsWhenUsingWrongThread(z);
        InterfaceC12162rn interfaceC12162rn = this.f46660p1;
        if (interfaceC12162rn instanceof as3) {
            ((as3) interfaceC12162rn).setThrowsWhenUsingWrongThread(z);
        }
    }

    @Override // p000.ca5
    public boolean experimentalIsSleepingForOffload() {
        verifyApplicationThread();
        return this.f46669t2.f62812o;
    }

    @Override // p000.ca5
    public void experimentalSetOffloadSchedulingEnabled(boolean z) {
        verifyApplicationThread();
        this.f46646i1.experimentalSetOffloadSchedulingEnabled(z);
        Iterator<ca5.InterfaceC2248b> it = this.f46650k1.iterator();
        while (it.hasNext()) {
            it.next().onExperimentalOffloadSchedulingEnabledChanged(z);
        }
    }

    @Override // p000.ca5
    public InterfaceC12162rn getAnalyticsCollector() {
        verifyApplicationThread();
        return this.f46660p1;
    }

    @Override // p000.lzc
    public Looper getApplicationLooper() {
        return this.f46662q1;
    }

    @Override // p000.lzc
    public yc0 getAudioAttributes() {
        verifyApplicationThread();
        return this.f46641f2;
    }

    @Override // p000.ca5
    @op1
    @Deprecated
    public ca5.InterfaceC2247a getAudioComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // p000.ca5
    @hib
    public nl3 getAudioDecoderCounters() {
        verifyApplicationThread();
        return this.f46637d2;
    }

    @Override // p000.ca5
    @hib
    public kq6 getAudioFormat() {
        verifyApplicationThread();
        return this.f46620R1;
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2247a
    public int getAudioSessionId() {
        verifyApplicationThread();
        return this.f46639e2;
    }

    @Override // p000.lzc
    public lzc.C9045c getAvailableCommands() {
        verifyApplicationThread();
        return this.f46616N1;
    }

    @Override // p000.lzc
    public long getBufferedPosition() {
        verifyApplicationThread();
        if (!isPlayingAd()) {
            return getContentBufferedPosition();
        }
        myc mycVar = this.f46669t2;
        return mycVar.f62808k.equals(mycVar.f62799b) ? x0i.usToMs(this.f46669t2.f62813p) : getDuration();
    }

    @Override // p000.ca5
    public h52 getClock() {
        return this.f46670u1;
    }

    @Override // p000.lzc
    public long getContentBufferedPosition() {
        verifyApplicationThread();
        if (this.f46669t2.f62798a.isEmpty()) {
            return this.f46675w2;
        }
        myc mycVar = this.f46669t2;
        if (mycVar.f62808k.f71109d != mycVar.f62799b.f71109d) {
            return mycVar.f62798a.getWindow(getCurrentMediaItemIndex(), this.f11826Y0).getDurationMs();
        }
        long j = mycVar.f62813p;
        if (this.f46669t2.f62808k.isAd()) {
            myc mycVar2 = this.f46669t2;
            t1h.C12849b periodByUid = mycVar2.f62798a.getPeriodByUid(mycVar2.f62808k.f71106a, this.f46652l1);
            long adGroupTimeUs = periodByUid.getAdGroupTimeUs(this.f46669t2.f62808k.f71107b);
            j = adGroupTimeUs == Long.MIN_VALUE ? periodByUid.f83399d : adGroupTimeUs;
        }
        myc mycVar3 = this.f46669t2;
        return x0i.usToMs(periodPositionUsToWindowPositionUs(mycVar3.f62798a, mycVar3.f62808k, j));
    }

    @Override // p000.lzc
    public long getContentPosition() {
        verifyApplicationThread();
        return getContentPositionInternal(this.f46669t2);
    }

    @Override // p000.lzc
    public int getCurrentAdGroupIndex() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            return this.f46669t2.f62799b.f71107b;
        }
        return -1;
    }

    @Override // p000.lzc
    public int getCurrentAdIndexInAdGroup() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            return this.f46669t2.f62799b.f71108c;
        }
        return -1;
    }

    @Override // p000.lzc
    public y93 getCurrentCues() {
        verifyApplicationThread();
        return this.f46647i2;
    }

    @Override // p000.lzc
    public int getCurrentMediaItemIndex() {
        verifyApplicationThread();
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.f46669t2);
        if (currentWindowIndexInternal == -1) {
            return 0;
        }
        return currentWindowIndexInternal;
    }

    @Override // p000.lzc
    public int getCurrentPeriodIndex() {
        verifyApplicationThread();
        if (this.f46669t2.f62798a.isEmpty()) {
            return this.f46673v2;
        }
        myc mycVar = this.f46669t2;
        return mycVar.f62798a.getIndexOfPeriod(mycVar.f62799b.f71106a);
    }

    @Override // p000.lzc
    public long getCurrentPosition() {
        verifyApplicationThread();
        return x0i.usToMs(getCurrentPositionUsInternal(this.f46669t2));
    }

    @Override // p000.lzc
    public t1h getCurrentTimeline() {
        verifyApplicationThread();
        return this.f46669t2.f62798a;
    }

    @Override // p000.ca5
    public m6h getCurrentTrackGroups() {
        verifyApplicationThread();
        return this.f46669t2.f62805h;
    }

    @Override // p000.ca5
    public w6h getCurrentTrackSelections() {
        verifyApplicationThread();
        return new w6h(this.f46669t2.f62806i.f73448c);
    }

    @Override // p000.lzc
    public y7h getCurrentTracks() {
        verifyApplicationThread();
        return this.f46669t2.f62806i.f73449d;
    }

    @Override // p000.ca5
    @op1
    @Deprecated
    public ca5.InterfaceC2250d getDeviceComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // p000.lzc
    public p84 getDeviceInfo() {
        verifyApplicationThread();
        return this.f46663q2;
    }

    @Override // p000.lzc
    public int getDeviceVolume() {
        verifyApplicationThread();
        v6g v6gVar = this.f46678z1;
        if (v6gVar != null) {
            return v6gVar.getVolume();
        }
        return 0;
    }

    @Override // p000.lzc
    public long getDuration() {
        verifyApplicationThread();
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        myc mycVar = this.f46669t2;
        vna.C14175b c14175b = mycVar.f62799b;
        mycVar.f62798a.getPeriodByUid(c14175b.f71106a, this.f46652l1);
        return x0i.usToMs(this.f46652l1.getAdDurationUs(c14175b.f71107b, c14175b.f71108c));
    }

    @Override // p000.lzc
    public long getMaxSeekToPreviousPosition() {
        verifyApplicationThread();
        return 3000L;
    }

    @Override // p000.lzc
    public iga getMediaMetadata() {
        verifyApplicationThread();
        return this.f46617O1;
    }

    @Override // p000.ca5
    public boolean getPauseAtEndOfMediaItems() {
        verifyApplicationThread();
        return this.f46615M1;
    }

    @Override // p000.lzc
    public boolean getPlayWhenReady() {
        verifyApplicationThread();
        return this.f46669t2.f62809l;
    }

    @Override // p000.ca5
    public Looper getPlaybackLooper() {
        return this.f46646i1.getPlaybackLooper();
    }

    @Override // p000.lzc
    public qyc getPlaybackParameters() {
        verifyApplicationThread();
        return this.f46669t2.f62811n;
    }

    @Override // p000.lzc
    public int getPlaybackState() {
        verifyApplicationThread();
        return this.f46669t2.f62802e;
    }

    @Override // p000.lzc
    public int getPlaybackSuppressionReason() {
        verifyApplicationThread();
        return this.f46669t2.f62810m;
    }

    @Override // p000.lzc
    public iga getPlaylistMetadata() {
        verifyApplicationThread();
        return this.f46618P1;
    }

    @Override // p000.ca5
    public n1e getRenderer(int i) {
        verifyApplicationThread();
        return this.f46638e1[i];
    }

    @Override // p000.ca5
    public int getRendererCount() {
        verifyApplicationThread();
        return this.f46638e1.length;
    }

    @Override // p000.ca5
    public int getRendererType(int i) {
        verifyApplicationThread();
        return this.f46638e1[i].getTrackType();
    }

    @Override // p000.lzc
    public int getRepeatMode() {
        verifyApplicationThread();
        return this.f46606D1;
    }

    @Override // p000.lzc
    public long getSeekBackIncrement() {
        verifyApplicationThread();
        return this.f46666s1;
    }

    @Override // p000.lzc
    public long getSeekForwardIncrement() {
        verifyApplicationThread();
        return this.f46668t1;
    }

    @Override // p000.ca5
    public iue getSeekParameters() {
        verifyApplicationThread();
        return this.f46613K1;
    }

    @Override // p000.lzc
    public boolean getShuffleModeEnabled() {
        verifyApplicationThread();
        return this.f46607E1;
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2247a
    public boolean getSkipSilenceEnabled() {
        verifyApplicationThread();
        return this.f46645h2;
    }

    @Override // p000.lzc
    public ypf getSurfaceSize() {
        verifyApplicationThread();
        return this.f46633b2;
    }

    @Override // p000.ca5
    @op1
    @Deprecated
    public ca5.InterfaceC2251e getTextComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // p000.lzc
    public long getTotalBufferedDuration() {
        verifyApplicationThread();
        return x0i.usToMs(this.f46669t2.f62814q);
    }

    @Override // p000.lzc
    public j7h getTrackSelectionParameters() {
        verifyApplicationThread();
        return this.f46640f1.getParameters();
    }

    @Override // p000.ca5
    public p7h getTrackSelector() {
        verifyApplicationThread();
        return this.f46640f1;
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2252f
    public int getVideoChangeFrameRateStrategy() {
        verifyApplicationThread();
        return this.f46631a2;
    }

    @Override // p000.ca5
    @op1
    @Deprecated
    public ca5.InterfaceC2252f getVideoComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // p000.ca5
    @hib
    public nl3 getVideoDecoderCounters() {
        verifyApplicationThread();
        return this.f46635c2;
    }

    @Override // p000.ca5
    @hib
    public kq6 getVideoFormat() {
        verifyApplicationThread();
        return this.f46619Q1;
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2252f
    public int getVideoScalingMode() {
        verifyApplicationThread();
        return this.f46629Z1;
    }

    @Override // p000.lzc
    public z7i getVideoSize() {
        verifyApplicationThread();
        return this.f46665r2;
    }

    @Override // p000.lzc
    public float getVolume() {
        verifyApplicationThread();
        return this.f46643g2;
    }

    @Override // p000.lzc
    @Deprecated
    public void increaseDeviceVolume() {
        verifyApplicationThread();
        v6g v6gVar = this.f46678z1;
        if (v6gVar != null) {
            v6gVar.increaseVolume(1);
        }
    }

    @Override // p000.lzc
    public boolean isDeviceMuted() {
        verifyApplicationThread();
        v6g v6gVar = this.f46678z1;
        if (v6gVar != null) {
            return v6gVar.isMuted();
        }
        return false;
    }

    @Override // p000.lzc
    public boolean isLoading() {
        verifyApplicationThread();
        return this.f46669t2.f62804g;
    }

    @Override // p000.lzc
    public boolean isPlayingAd() {
        verifyApplicationThread();
        return this.f46669t2.f62799b.isAd();
    }

    @Override // p000.ca5
    public boolean isTunnelingEnabled() {
        verifyApplicationThread();
        for (r1e r1eVar : this.f46669t2.f62806i.f73447b) {
            if (r1eVar != null && r1eVar.f76783a) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.lzc
    public void moveMediaItems(int i, int i2, int i3) {
        verifyApplicationThread();
        u80.checkArgument(i >= 0 && i <= i2 && i3 >= 0);
        int size = this.f46654m1.size();
        int iMin = Math.min(i2, size);
        int iMin2 = Math.min(i3, size - (iMin - i));
        if (i >= size || i == iMin || i == iMin2) {
            return;
        }
        t1h currentTimeline = getCurrentTimeline();
        this.f46608F1++;
        x0i.moveItems(this.f46654m1, i, iMin, iMin2);
        t1h t1hVarCreateMaskingTimeline = createMaskingTimeline();
        myc mycVar = this.f46669t2;
        myc mycVarMaskTimelineAndPosition = maskTimelineAndPosition(mycVar, t1hVarCreateMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(currentTimeline, t1hVarCreateMaskingTimeline, getCurrentWindowIndexInternal(mycVar), getContentPositionInternal(this.f46669t2)));
        this.f46646i1.moveMediaSources(i, iMin, iMin2, this.f46614L1);
        updatePlaybackInfo(mycVarMaskTimelineAndPosition, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p000.lzc
    public void prepare() {
        verifyApplicationThread();
        boolean playWhenReady = getPlayWhenReady();
        int iUpdateAudioFocus = this.f46677y1.updateAudioFocus(playWhenReady, 2);
        updatePlayWhenReady(playWhenReady, iUpdateAudioFocus, getPlayWhenReadyChangeReason(playWhenReady, iUpdateAudioFocus));
        myc mycVar = this.f46669t2;
        if (mycVar.f62802e != 1) {
            return;
        }
        myc mycVarCopyWithPlaybackError = mycVar.copyWithPlaybackError(null);
        myc mycVarCopyWithPlaybackState = mycVarCopyWithPlaybackError.copyWithPlaybackState(mycVarCopyWithPlaybackError.f62798a.isEmpty() ? 4 : 2);
        this.f46608F1++;
        this.f46646i1.prepare();
        updatePlaybackInfo(mycVarCopyWithPlaybackState, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p000.lzc
    public void release() {
        AudioTrack audioTrack;
        yh9.m25917i("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + lf5.f57469c + "] [" + x0i.f95982e + "] [" + lf5.registeredModules() + "]");
        verifyApplicationThread();
        if (x0i.f95978a < 21 && (audioTrack = this.f46621S1) != null) {
            audioTrack.release();
            this.f46621S1 = null;
        }
        this.f46676x1.setEnabled(false);
        v6g v6gVar = this.f46678z1;
        if (v6gVar != null) {
            v6gVar.release();
        }
        this.f46603A1.setStayAwake(false);
        this.f46604B1.setStayAwake(false);
        this.f46677y1.release();
        if (!this.f46646i1.release()) {
            this.f46648j1.sendEvent(10, new za9.InterfaceC16057a() { // from class: oc5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ie5.lambda$release$5((lzc.InterfaceC9049g) obj);
                }
            });
        }
        this.f46648j1.release();
        this.f46642g1.removeCallbacksAndMessages(null);
        this.f46664r1.removeEventListener(this.f46660p1);
        myc mycVar = this.f46669t2;
        if (mycVar.f62812o) {
            this.f46669t2 = mycVar.copyWithEstimatedPosition();
        }
        myc mycVarCopyWithPlaybackState = this.f46669t2.copyWithPlaybackState(1);
        this.f46669t2 = mycVarCopyWithPlaybackState;
        myc mycVarCopyWithLoadingMediaPeriodId = mycVarCopyWithPlaybackState.copyWithLoadingMediaPeriodId(mycVarCopyWithPlaybackState.f62799b);
        this.f46669t2 = mycVarCopyWithLoadingMediaPeriodId;
        mycVarCopyWithLoadingMediaPeriodId.f62813p = mycVarCopyWithLoadingMediaPeriodId.f62815r;
        this.f46669t2.f62814q = 0L;
        this.f46660p1.release();
        this.f46640f1.release();
        removeSurfaceCallbacks();
        Surface surface = this.f46623U1;
        if (surface != null) {
            surface.release();
            this.f46623U1 = null;
        }
        if (this.f46659o2) {
            ((jcd) u80.checkNotNull(this.f46657n2)).remove(0);
            this.f46659o2 = false;
        }
        this.f46647i2 = y93.f100822c;
        this.f46661p2 = true;
    }

    @Override // p000.ca5
    public void removeAnalyticsListener(InterfaceC5415eo interfaceC5415eo) {
        verifyApplicationThread();
        this.f46660p1.removeListener((InterfaceC5415eo) u80.checkNotNull(interfaceC5415eo));
    }

    @Override // p000.ca5
    public void removeAudioOffloadListener(ca5.InterfaceC2248b interfaceC2248b) {
        verifyApplicationThread();
        this.f46650k1.remove(interfaceC2248b);
    }

    @Override // p000.lzc
    public void removeListener(lzc.InterfaceC9049g interfaceC9049g) {
        verifyApplicationThread();
        this.f46648j1.remove((lzc.InterfaceC9049g) u80.checkNotNull(interfaceC9049g));
    }

    @Override // p000.lzc
    public void removeMediaItems(int i, int i2) {
        verifyApplicationThread();
        u80.checkArgument(i >= 0 && i2 >= i);
        int size = this.f46654m1.size();
        int iMin = Math.min(i2, size);
        if (i >= size || i == iMin) {
            return;
        }
        myc mycVarRemoveMediaItemsInternal = removeMediaItemsInternal(this.f46669t2, i, iMin);
        updatePlaybackInfo(mycVarRemoveMediaItemsInternal, 0, 1, !mycVarRemoveMediaItemsInternal.f62799b.f71106a.equals(this.f46669t2.f62799b.f71106a), 4, getCurrentPositionUsInternal(mycVarRemoveMediaItemsInternal), -1, false);
    }

    @Override // p000.lzc
    public void replaceMediaItems(int i, int i2, List<aga> list) {
        verifyApplicationThread();
        u80.checkArgument(i >= 0 && i2 >= i);
        int size = this.f46654m1.size();
        if (i > size) {
            return;
        }
        int iMin = Math.min(i2, size);
        List<vna> listCreateMediaSources = createMediaSources(list);
        if (this.f46654m1.isEmpty()) {
            setMediaSources(listCreateMediaSources, this.f46671u2 == -1);
        } else {
            myc mycVarRemoveMediaItemsInternal = removeMediaItemsInternal(addMediaSourcesInternal(this.f46669t2, iMin, listCreateMediaSources), i, iMin);
            updatePlaybackInfo(mycVarRemoveMediaItemsInternal, 0, 1, !mycVarRemoveMediaItemsInternal.f62799b.f71106a.equals(this.f46669t2.f62799b.f71106a), 4, getCurrentPositionUsInternal(mycVarRemoveMediaItemsInternal), -1, false);
        }
    }

    @Override // p000.at0
    public void seekTo(int i, long j, int i2, boolean z) {
        verifyApplicationThread();
        u80.checkArgument(i >= 0);
        this.f46660p1.notifySeekStarted();
        t1h t1hVar = this.f46669t2.f62798a;
        if (t1hVar.isEmpty() || i < t1hVar.getWindowCount()) {
            this.f46608F1++;
            if (isPlayingAd()) {
                yh9.m25919w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                kf5.C8344e c8344e = new kf5.C8344e(this.f46669t2);
                c8344e.incrementPendingOperationAcks(1);
                this.f46644h1.onPlaybackInfoUpdate(c8344e);
                return;
            }
            myc mycVarCopyWithPlaybackState = this.f46669t2;
            int i3 = mycVarCopyWithPlaybackState.f62802e;
            if (i3 == 3 || (i3 == 4 && !t1hVar.isEmpty())) {
                mycVarCopyWithPlaybackState = this.f46669t2.copyWithPlaybackState(2);
            }
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            myc mycVarMaskTimelineAndPosition = maskTimelineAndPosition(mycVarCopyWithPlaybackState, t1hVar, maskWindowPositionMsOrGetPeriodPositionUs(t1hVar, i, j));
            this.f46646i1.seekTo(t1hVar, i, x0i.msToUs(j));
            updatePlaybackInfo(mycVarMaskTimelineAndPosition, 0, 1, true, 1, getCurrentPositionUsInternal(mycVarMaskTimelineAndPosition), currentMediaItemIndex, z);
        }
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2247a
    public void setAudioAttributes(final yc0 yc0Var, boolean z) {
        verifyApplicationThread();
        if (this.f46661p2) {
            return;
        }
        if (!x0i.areEqual(this.f46641f2, yc0Var)) {
            this.f46641f2 = yc0Var;
            sendRendererMessage(1, 3, yc0Var);
            v6g v6gVar = this.f46678z1;
            if (v6gVar != null) {
                v6gVar.setStreamType(x0i.getStreamTypeForAudioUsage(yc0Var.f101072c));
            }
            this.f46648j1.queueEvent(20, new za9.InterfaceC16057a() { // from class: mc5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ((lzc.InterfaceC9049g) obj).onAudioAttributesChanged(yc0Var);
                }
            });
        }
        this.f46677y1.setAudioAttributes(z ? yc0Var : null);
        this.f46640f1.setAudioAttributes(yc0Var);
        boolean playWhenReady = getPlayWhenReady();
        int iUpdateAudioFocus = this.f46677y1.updateAudioFocus(playWhenReady, getPlaybackState());
        updatePlayWhenReady(playWhenReady, iUpdateAudioFocus, getPlayWhenReadyChangeReason(playWhenReady, iUpdateAudioFocus));
        this.f46648j1.flushEvents();
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2247a
    public void setAudioSessionId(final int i) {
        verifyApplicationThread();
        if (this.f46639e2 == i) {
            return;
        }
        if (i == 0) {
            i = x0i.f95978a < 21 ? initializeKeepSessionIdAudioTrack(0) : x0i.generateAudioSessionIdV21(this.f46634c1);
        } else if (x0i.f95978a < 21) {
            initializeKeepSessionIdAudioTrack(i);
        }
        this.f46639e2 = i;
        sendRendererMessage(1, 10, Integer.valueOf(i));
        sendRendererMessage(2, 10, Integer.valueOf(i));
        this.f46648j1.sendEvent(21, new za9.InterfaceC16057a() { // from class: id5
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((lzc.InterfaceC9049g) obj).onAudioSessionIdChanged(i);
            }
        });
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2247a
    public void setAuxEffectInfo(om0 om0Var) {
        verifyApplicationThread();
        sendRendererMessage(1, 6, om0Var);
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2252f
    public void setCameraMotionListener(fp1 fp1Var) {
        verifyApplicationThread();
        this.f46651k2 = fp1Var;
        createMessageInternal(this.f46674w1).setType(8).setPayload(fp1Var).send();
    }

    @Override // p000.lzc
    @Deprecated
    public void setDeviceMuted(boolean z) {
        verifyApplicationThread();
        v6g v6gVar = this.f46678z1;
        if (v6gVar != null) {
            v6gVar.setMuted(z, 1);
        }
    }

    @Override // p000.lzc
    @Deprecated
    public void setDeviceVolume(int i) {
        verifyApplicationThread();
        v6g v6gVar = this.f46678z1;
        if (v6gVar != null) {
            v6gVar.setVolume(i, 1);
        }
    }

    @Override // p000.ca5
    public void setForegroundMode(boolean z) {
        verifyApplicationThread();
        if (this.f46612J1 != z) {
            this.f46612J1 = z;
            if (this.f46646i1.setForegroundMode(z)) {
                return;
            }
            stopInternal(ba5.createForUnexpected(new nf5(2), 1003));
        }
    }

    @Override // p000.ca5
    public void setHandleAudioBecomingNoisy(boolean z) {
        verifyApplicationThread();
        if (this.f46661p2) {
            return;
        }
        this.f46676x1.setEnabled(z);
    }

    @Override // p000.lzc
    public void setMediaItems(List<aga> list, boolean z) {
        verifyApplicationThread();
        setMediaSources(createMediaSources(list), z);
    }

    @Override // p000.ca5
    public void setMediaSource(vna vnaVar) {
        verifyApplicationThread();
        setMediaSources(Collections.singletonList(vnaVar));
    }

    @Override // p000.ca5
    public void setMediaSources(List<vna> list) {
        verifyApplicationThread();
        setMediaSources(list, true);
    }

    @Override // p000.ca5
    public void setPauseAtEndOfMediaItems(boolean z) {
        verifyApplicationThread();
        if (this.f46615M1 == z) {
            return;
        }
        this.f46615M1 = z;
        this.f46646i1.setPauseAtEndOfWindow(z);
    }

    @Override // p000.lzc
    public void setPlayWhenReady(boolean z) {
        verifyApplicationThread();
        int iUpdateAudioFocus = this.f46677y1.updateAudioFocus(z, getPlaybackState());
        updatePlayWhenReady(z, iUpdateAudioFocus, getPlayWhenReadyChangeReason(z, iUpdateAudioFocus));
    }

    @Override // p000.lzc
    public void setPlaybackParameters(qyc qycVar) {
        verifyApplicationThread();
        if (qycVar == null) {
            qycVar = qyc.f76311d;
        }
        if (this.f46669t2.f62811n.equals(qycVar)) {
            return;
        }
        myc mycVarCopyWithPlaybackParameters = this.f46669t2.copyWithPlaybackParameters(qycVar);
        this.f46608F1++;
        this.f46646i1.setPlaybackParameters(qycVar);
        updatePlaybackInfo(mycVarCopyWithPlaybackParameters, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p000.lzc
    public void setPlaylistMetadata(iga igaVar) {
        verifyApplicationThread();
        u80.checkNotNull(igaVar);
        if (igaVar.equals(this.f46618P1)) {
            return;
        }
        this.f46618P1 = igaVar;
        this.f46648j1.sendEvent(15, new za9.InterfaceC16057a() { // from class: ad5
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                this.f1117a.lambda$setPlaylistMetadata$7((lzc.InterfaceC9049g) obj);
            }
        });
    }

    @Override // p000.ca5
    @c5e(23)
    public void setPreferredAudioDevice(@hib AudioDeviceInfo audioDeviceInfo) {
        verifyApplicationThread();
        sendRendererMessage(1, 12, audioDeviceInfo);
    }

    @Override // p000.ca5
    public void setPriorityTaskManager(@hib jcd jcdVar) {
        verifyApplicationThread();
        if (x0i.areEqual(this.f46657n2, jcdVar)) {
            return;
        }
        if (this.f46659o2) {
            ((jcd) u80.checkNotNull(this.f46657n2)).remove(0);
        }
        if (jcdVar == null || !isLoading()) {
            this.f46659o2 = false;
        } else {
            jcdVar.add(0);
            this.f46659o2 = true;
        }
        this.f46657n2 = jcdVar;
    }

    @Override // p000.lzc
    public void setRepeatMode(final int i) {
        verifyApplicationThread();
        if (this.f46606D1 != i) {
            this.f46606D1 = i;
            this.f46646i1.setRepeatMode(i);
            this.f46648j1.queueEvent(8, new za9.InterfaceC16057a() { // from class: gd5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ((lzc.InterfaceC9049g) obj).onRepeatModeChanged(i);
                }
            });
            updateAvailableCommands();
            this.f46648j1.flushEvents();
        }
    }

    @Override // p000.ca5
    public void setSeekParameters(@hib iue iueVar) {
        verifyApplicationThread();
        if (iueVar == null) {
            iueVar = iue.f48524g;
        }
        if (this.f46613K1.equals(iueVar)) {
            return;
        }
        this.f46613K1 = iueVar;
        this.f46646i1.setSeekParameters(iueVar);
    }

    @Override // p000.lzc
    public void setShuffleModeEnabled(final boolean z) {
        verifyApplicationThread();
        if (this.f46607E1 != z) {
            this.f46607E1 = z;
            this.f46646i1.setShuffleModeEnabled(z);
            this.f46648j1.queueEvent(9, new za9.InterfaceC16057a() { // from class: kc5
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ((lzc.InterfaceC9049g) obj).onShuffleModeEnabledChanged(z);
                }
            });
            updateAvailableCommands();
            this.f46648j1.flushEvents();
        }
    }

    @Override // p000.ca5
    public void setShuffleOrder(sbf sbfVar) {
        verifyApplicationThread();
        u80.checkArgument(sbfVar.getLength() == this.f46654m1.size());
        this.f46614L1 = sbfVar;
        t1h t1hVarCreateMaskingTimeline = createMaskingTimeline();
        myc mycVarMaskTimelineAndPosition = maskTimelineAndPosition(this.f46669t2, t1hVarCreateMaskingTimeline, maskWindowPositionMsOrGetPeriodPositionUs(t1hVarCreateMaskingTimeline, getCurrentMediaItemIndex(), getCurrentPosition()));
        this.f46608F1++;
        this.f46646i1.setShuffleOrder(sbfVar);
        updatePlaybackInfo(mycVarMaskTimelineAndPosition, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2247a
    public void setSkipSilenceEnabled(final boolean z) {
        verifyApplicationThread();
        if (this.f46645h2 == z) {
            return;
        }
        this.f46645h2 = z;
        sendRendererMessage(1, 9, Boolean.valueOf(z));
        this.f46648j1.sendEvent(23, new za9.InterfaceC16057a() { // from class: qc5
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((lzc.InterfaceC9049g) obj).onSkipSilenceEnabledChanged(z);
            }
        });
    }

    @Override // p000.lzc
    public void setTrackSelectionParameters(final j7h j7hVar) {
        verifyApplicationThread();
        if (!this.f46640f1.isSetParametersSupported() || j7hVar.equals(this.f46640f1.getParameters())) {
            return;
        }
        this.f46640f1.setParameters(j7hVar);
        this.f46648j1.sendEvent(19, new za9.InterfaceC16057a() { // from class: sc5
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((lzc.InterfaceC9049g) obj).onTrackSelectionParametersChanged(j7hVar);
            }
        });
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2252f
    public void setVideoChangeFrameRateStrategy(int i) {
        verifyApplicationThread();
        if (this.f46631a2 == i) {
            return;
        }
        this.f46631a2 = i;
        sendRendererMessage(2, 5, Integer.valueOf(i));
    }

    @Override // p000.ca5
    public void setVideoEffects(List<gx4> list) {
        verifyApplicationThread();
        sendRendererMessage(2, 13, list);
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2252f
    public void setVideoFrameMetadataListener(n6i n6iVar) {
        verifyApplicationThread();
        this.f46649j2 = n6iVar;
        createMessageInternal(this.f46674w1).setType(7).setPayload(n6iVar).send();
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2252f
    public void setVideoScalingMode(int i) {
        verifyApplicationThread();
        this.f46629Z1 = i;
        sendRendererMessage(2, 4, Integer.valueOf(i));
    }

    @Override // p000.lzc
    public void setVideoSurface(@hib Surface surface) {
        verifyApplicationThread();
        removeSurfaceCallbacks();
        setVideoOutputInternal(surface);
        int i = surface == null ? 0 : -1;
        maybeNotifySurfaceSizeChanged(i, i);
    }

    @Override // p000.lzc
    public void setVideoSurfaceHolder(@hib SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (surfaceHolder == null) {
            clearVideoSurface();
            return;
        }
        removeSurfaceCallbacks();
        this.f46626X1 = true;
        this.f46624V1 = surfaceHolder;
        surfaceHolder.addCallback(this.f46672v1);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            setVideoOutputInternal(null);
            maybeNotifySurfaceSizeChanged(0, 0);
        } else {
            setVideoOutputInternal(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // p000.lzc
    public void setVideoSurfaceView(@hib SurfaceView surfaceView) {
        verifyApplicationThread();
        if (surfaceView instanceof i6i) {
            removeSurfaceCallbacks();
            setVideoOutputInternal(surfaceView);
            setNonVideoOutputSurfaceHolderInternal(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof SphericalGLSurfaceView)) {
                setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            removeSurfaceCallbacks();
            this.f46625W1 = (SphericalGLSurfaceView) surfaceView;
            createMessageInternal(this.f46674w1).setType(10000).setPayload(this.f46625W1).send();
            this.f46625W1.addVideoSurfaceListener(this.f46672v1);
            setVideoOutputInternal(this.f46625W1.getVideoSurface());
            setNonVideoOutputSurfaceHolderInternal(surfaceView.getHolder());
        }
    }

    @Override // p000.lzc
    public void setVideoTextureView(@hib TextureView textureView) {
        verifyApplicationThread();
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        removeSurfaceCallbacks();
        this.f46627Y1 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            yh9.m25919w("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f46672v1);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            setVideoOutputInternal(null);
            maybeNotifySurfaceSizeChanged(0, 0);
        } else {
            setSurfaceTextureInternal(surfaceTexture);
            maybeNotifySurfaceSizeChanged(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // p000.lzc
    public void setVolume(float f) {
        verifyApplicationThread();
        final float fConstrainValue = x0i.constrainValue(f, 0.0f, 1.0f);
        if (this.f46643g2 == fConstrainValue) {
            return;
        }
        this.f46643g2 = fConstrainValue;
        sendVolumeToRenderers();
        this.f46648j1.sendEvent(22, new za9.InterfaceC16057a() { // from class: xc5
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((lzc.InterfaceC9049g) obj).onVolumeChanged(fConstrainValue);
            }
        });
    }

    @Override // p000.ca5
    public void setWakeMode(int i) {
        verifyApplicationThread();
        if (i == 0) {
            this.f46603A1.setEnabled(false);
            this.f46604B1.setEnabled(false);
        } else if (i == 1) {
            this.f46603A1.setEnabled(true);
            this.f46604B1.setEnabled(false);
        } else {
            if (i != 2) {
                return;
            }
            this.f46603A1.setEnabled(true);
            this.f46604B1.setEnabled(true);
        }
    }

    @Override // p000.lzc
    public void stop() {
        verifyApplicationThread();
        this.f46677y1.updateAudioFocus(getPlayWhenReady(), 1);
        stopInternal(null);
        this.f46647i2 = new y93(kx7.m15110of(), this.f46669t2.f62815r);
    }

    @Override // p000.lzc
    @hib
    public ba5 getPlayerError() {
        verifyApplicationThread();
        return this.f46669t2.f62803f;
    }

    @Override // p000.ca5
    public void addMediaSource(int i, vna vnaVar) {
        verifyApplicationThread();
        addMediaSources(i, Collections.singletonList(vnaVar));
    }

    @Override // p000.ca5
    public void addMediaSources(int i, List<vna> list) {
        verifyApplicationThread();
        u80.checkArgument(i >= 0);
        int iMin = Math.min(i, this.f46654m1.size());
        if (this.f46654m1.isEmpty()) {
            setMediaSources(list, this.f46671u2 == -1);
        } else {
            updatePlaybackInfo(addMediaSourcesInternal(this.f46669t2, iMin, list), 0, 1, false, 5, -9223372036854775807L, -1, false);
        }
    }

    @Override // p000.lzc
    public void setMediaItems(List<aga> list, int i, long j) {
        verifyApplicationThread();
        setMediaSources(createMediaSources(list), i, j);
    }

    @Override // p000.ca5
    public void setMediaSource(vna vnaVar, long j) {
        verifyApplicationThread();
        setMediaSources(Collections.singletonList(vnaVar), 0, j);
    }

    @Override // p000.ca5
    public void setMediaSources(List<vna> list, boolean z) {
        verifyApplicationThread();
        setMediaSourcesInternal(list, -1, -9223372036854775807L, z);
    }

    @Override // p000.lzc
    public void decreaseDeviceVolume(int i) {
        verifyApplicationThread();
        v6g v6gVar = this.f46678z1;
        if (v6gVar != null) {
            v6gVar.decreaseVolume(i);
        }
    }

    @Override // p000.lzc
    public void increaseDeviceVolume(int i) {
        verifyApplicationThread();
        v6g v6gVar = this.f46678z1;
        if (v6gVar != null) {
            v6gVar.increaseVolume(i);
        }
    }

    @Override // p000.lzc
    public void setDeviceMuted(boolean z, int i) {
        verifyApplicationThread();
        v6g v6gVar = this.f46678z1;
        if (v6gVar != null) {
            v6gVar.setMuted(z, i);
        }
    }

    @Override // p000.lzc
    public void setDeviceVolume(int i, int i2) {
        verifyApplicationThread();
        v6g v6gVar = this.f46678z1;
        if (v6gVar != null) {
            v6gVar.setVolume(i, i2);
        }
    }

    @Override // p000.lzc
    public void clearVideoSurface(@hib Surface surface) {
        verifyApplicationThread();
        if (surface == null || surface != this.f46622T1) {
            return;
        }
        clearVideoSurface();
    }

    @Override // p000.ca5
    public void setMediaSources(List<vna> list, int i, long j) {
        verifyApplicationThread();
        setMediaSourcesInternal(list, i, j, false);
    }

    @Override // p000.ca5
    public void setMediaSource(vna vnaVar, boolean z) {
        verifyApplicationThread();
        setMediaSources(Collections.singletonList(vnaVar), z);
    }

    @Override // p000.ca5
    @Deprecated
    public void prepare(vna vnaVar) {
        verifyApplicationThread();
        setMediaSource(vnaVar);
        prepare();
    }

    @Override // p000.ca5
    @Deprecated
    public void prepare(vna vnaVar, boolean z, boolean z2) {
        verifyApplicationThread();
        setMediaSource(vnaVar, z);
        prepare();
    }
}
