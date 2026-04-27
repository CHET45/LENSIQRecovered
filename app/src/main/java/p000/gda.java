package p000;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.List;
import p000.ch0;
import p000.eda;
import p000.kq6;
import p000.n1e;
import p000.oea;
import p000.sg0;
import p000.us3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class gda extends uda implements bda {

    /* JADX INFO: renamed from: Q3 */
    public static final String f39529Q3 = "MediaCodecAudioRenderer";

    /* JADX INFO: renamed from: R3 */
    public static final String f39530R3 = "v-bits-per-sample";

    /* JADX INFO: renamed from: D3 */
    public final Context f39531D3;

    /* JADX INFO: renamed from: E3 */
    public final sg0.C12563a f39532E3;

    /* JADX INFO: renamed from: F3 */
    public final ch0 f39533F3;

    /* JADX INFO: renamed from: G3 */
    public int f39534G3;

    /* JADX INFO: renamed from: H3 */
    public boolean f39535H3;

    /* JADX INFO: renamed from: I3 */
    @hib
    public kq6 f39536I3;

    /* JADX INFO: renamed from: J3 */
    @hib
    public kq6 f39537J3;

    /* JADX INFO: renamed from: K3 */
    public long f39538K3;

    /* JADX INFO: renamed from: L3 */
    public boolean f39539L3;

    /* JADX INFO: renamed from: M3 */
    public boolean f39540M3;

    /* JADX INFO: renamed from: N3 */
    public boolean f39541N3;

    /* JADX INFO: renamed from: O3 */
    public boolean f39542O3;

    /* JADX INFO: renamed from: P3 */
    @hib
    public n1e.InterfaceC9653c f39543P3;

    /* JADX INFO: renamed from: gda$b */
    @c5e(23)
    public static final class C6258b {
        private C6258b() {
        }

        @ih4
        public static void setAudioSinkPreferredDevice(ch0 ch0Var, @hib Object obj) {
            ch0Var.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    /* JADX INFO: renamed from: gda$c */
    public final class C6259c implements ch0.InterfaceC2310c {
        private C6259c() {
        }

        @Override // p000.ch0.InterfaceC2310c
        public void onAudioCapabilitiesChanged() {
            gda.this.m3416n();
        }

        @Override // p000.ch0.InterfaceC2310c
        public void onAudioSinkError(Exception exc) {
            yh9.m25916e("MediaCodecAudioRenderer", "Audio sink error", exc);
            gda.this.f39532E3.audioSinkError(exc);
        }

        @Override // p000.ch0.InterfaceC2310c
        public void onOffloadBufferEmptying() {
            if (gda.this.f39543P3 != null) {
                gda.this.f39543P3.onWakeup();
            }
        }

        @Override // p000.ch0.InterfaceC2310c
        public void onOffloadBufferFull() {
            if (gda.this.f39543P3 != null) {
                gda.this.f39543P3.onSleep();
            }
        }

        @Override // p000.ch0.InterfaceC2310c
        public void onPositionAdvancing(long j) {
            gda.this.f39532E3.positionAdvancing(j);
        }

        @Override // p000.ch0.InterfaceC2310c
        public void onPositionDiscontinuity() {
            gda.this.m11644o0();
        }

        @Override // p000.ch0.InterfaceC2310c
        public void onSkipSilenceEnabledChanged(boolean z) {
            gda.this.f39532E3.skipSilenceEnabledChanged(z);
        }

        @Override // p000.ch0.InterfaceC2310c
        public void onUnderrun(int i, long j, long j2) {
            gda.this.f39532E3.underrun(i, j, j2);
        }
    }

    public gda(Context context, yda ydaVar) {
        this(context, ydaVar, null, null);
    }

    private static boolean codecNeedsDiscardChannelsWorkaround(String str) {
        if (x0i.f95978a < 24 && "OMX.SEC.aac.dec".equals(str) && as9.f11748b.equals(x0i.f95980c)) {
            String str2 = x0i.f95979b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean deviceDoesntSupportOperatingRate() {
        if (x0i.f95978a == 23) {
            String str = x0i.f95981d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int getCodecMaxInputSize(kda kdaVar, kq6 kq6Var) {
        int i;
        if (!"OMX.google.raw.decoder".equals(kdaVar.f53649a) || (i = x0i.f95978a) >= 24 || (i == 23 && x0i.isTv(this.f39531D3))) {
            return kq6Var.f54991N;
        }
        return -1;
    }

    private static List<kda> getDecoderInfos(yda ydaVar, kq6 kq6Var, boolean z, ch0 ch0Var) throws oea.C10346c {
        kda decryptOnlyDecoderInfo;
        return kq6Var.f54989M == null ? kx7.m15110of() : (!ch0Var.supportsFormat(kq6Var) || (decryptOnlyDecoderInfo = oea.getDecryptOnlyDecoderInfo()) == null) ? oea.getDecoderInfosSoftMatch(ydaVar, kq6Var, z, false) : kx7.m15111of(decryptOnlyDecoderInfo);
    }

    private void updateCurrentPosition() {
        long currentPositionUs = this.f39533F3.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.f39540M3) {
                currentPositionUs = Math.max(this.f39538K3, currentPositionUs);
            }
            this.f39538K3 = currentPositionUs;
            this.f39540M3 = false;
        }
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: C */
    public float mo11627C(float f, kq6 kq6Var, kq6[] kq6VarArr) {
        int iMax = -1;
        for (kq6 kq6Var2 : kq6VarArr) {
            int i = kq6Var2.f55009f2;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f * iMax;
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: E */
    public List<kda> mo11628E(yda ydaVar, kq6 kq6Var, boolean z) throws oea.C10346c {
        return oea.getDecoderInfosSortedByFormatSupport(getDecoderInfos(ydaVar, kq6Var, z, this.f39533F3), kq6Var);
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: F */
    public eda.C5265a mo11629F(kda kdaVar, kq6 kq6Var, @hib MediaCrypto mediaCrypto, float f) {
        this.f39534G3 = m11642m0(kdaVar, kq6Var, m3410h());
        this.f39535H3 = codecNeedsDiscardChannelsWorkaround(kdaVar.f53649a);
        MediaFormat mediaFormatM11643n0 = m11643n0(kq6Var, kdaVar.f53651c, this.f39534G3, f);
        this.f39537J3 = (!"audio/raw".equals(kdaVar.f53650b) || "audio/raw".equals(kq6Var.f54989M)) ? null : kq6Var;
        return eda.C5265a.createForAudioDecoding(kdaVar, mediaFormatM11643n0, kq6Var, mediaCrypto);
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: L */
    public void mo11630L(Exception exc) {
        yh9.m25916e("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f39532E3.audioCodecError(exc);
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: M */
    public void mo11631M(String str, eda.C5265a c5265a, long j, long j2) {
        this.f39532E3.decoderInitialized(str, j, j2);
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: N */
    public void mo11632N(String str) {
        this.f39532E3.decoderReleased(str);
    }

    @Override // p000.uda
    @hib
    /* JADX INFO: renamed from: O */
    public wl3 mo11633O(nq6 nq6Var) throws ba5 {
        this.f39536I3 = (kq6) u80.checkNotNull(nq6Var.f65258b);
        wl3 wl3VarMo11633O = super.mo11633O(nq6Var);
        this.f39532E3.inputFormatChanged(this.f39536I3, wl3VarMo11633O);
        return wl3VarMo11633O;
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: P */
    public void mo11634P(kq6 kq6Var, @hib MediaFormat mediaFormat) throws ba5 {
        int i;
        kq6 kq6Var2 = this.f39537J3;
        int[] iArr = null;
        if (kq6Var2 != null) {
            kq6Var = kq6Var2;
        } else if (m23272y() != null) {
            kq6 kq6VarBuild = new kq6.C8497b().setSampleMimeType("audio/raw").setPcmEncoding("audio/raw".equals(kq6Var.f54989M) ? kq6Var.f55010g2 : (x0i.f95978a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? x0i.getPcmEncoding(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding")).setEncoderDelay(kq6Var.f55011h2).setEncoderPadding(kq6Var.f55012i2).setChannelCount(mediaFormat.getInteger("channel-count")).setSampleRate(mediaFormat.getInteger("sample-rate")).build();
            if (this.f39535H3 && kq6VarBuild.f55007e2 == 6 && (i = kq6Var.f55007e2) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < kq6Var.f55007e2; i2++) {
                    iArr[i2] = i2;
                }
            }
            kq6Var = kq6VarBuild;
        }
        try {
            this.f39533F3.configure(kq6Var, 0, iArr);
        } catch (ch0.C2308a e) {
            throw m3403a(e, e.f16511a, 5001);
        }
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: Q */
    public void mo11635Q(long j) {
        this.f39533F3.setOutputStreamOffsetUs(j);
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: S */
    public void mo11636S() {
        super.mo11636S();
        this.f39533F3.handleDiscontinuity();
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: T */
    public void mo11637T(sl3 sl3Var) {
        if (!this.f39539L3 || sl3Var.isDecodeOnly()) {
            return;
        }
        if (Math.abs(sl3Var.f82164f - this.f39538K3) > 500000) {
            this.f39538K3 = sl3Var.f82164f;
        }
        this.f39539L3 = false;
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: V */
    public boolean mo11638V(long j, long j2, @hib eda edaVar, @hib ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, kq6 kq6Var) throws ba5 {
        u80.checkNotNull(byteBuffer);
        if (this.f39537J3 != null && (i2 & 2) != 0) {
            ((eda) u80.checkNotNull(edaVar)).releaseOutputBuffer(i, false);
            return true;
        }
        if (z) {
            if (edaVar != null) {
                edaVar.releaseOutputBuffer(i, false);
            }
            this.f87719h3.f64833f += i3;
            this.f39533F3.handleDiscontinuity();
            return true;
        }
        try {
            if (!this.f39533F3.handleBuffer(byteBuffer, j3, i3)) {
                return false;
            }
            if (edaVar != null) {
                edaVar.releaseOutputBuffer(i, false);
            }
            this.f87719h3.f64832e += i3;
            return true;
        } catch (ch0.C2309b e) {
            throw m3404b(e, this.f39536I3, e.f16513b, 5001);
        } catch (ch0.C2313f e2) {
            throw m3404b(e2, kq6Var, e2.f16518b, 5002);
        }
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: X */
    public void mo11639X() throws ba5 {
        try {
            this.f39533F3.playToEndOfStream();
        } catch (ch0.C2313f e) {
            throw m3404b(e, e.f16519c, e.f16518b, 5002);
        }
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: e0 */
    public boolean mo11640e0(kq6 kq6Var) {
        return this.f39533F3.supportsFormat(kq6Var);
    }

    public void experimentalSetEnableKeepAudioTrackOnSeek(boolean z) {
        this.f39542O3 = z;
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: f0 */
    public int mo11641f0(yda ydaVar, kq6 kq6Var) throws oea.C10346c {
        boolean z;
        if (!sva.isAudio(kq6Var.f54989M)) {
            return p1e.create(0);
        }
        int i = x0i.f95978a >= 21 ? 32 : 0;
        boolean z2 = true;
        boolean z3 = kq6Var.f55017m2 != 0;
        boolean zM23256g0 = uda.m23256g0(kq6Var);
        int i2 = 8;
        if (zM23256g0 && this.f39533F3.supportsFormat(kq6Var) && (!z3 || oea.getDecryptOnlyDecoderInfo() != null)) {
            return p1e.create(4, 8, i);
        }
        if ((!"audio/raw".equals(kq6Var.f54989M) || this.f39533F3.supportsFormat(kq6Var)) && this.f39533F3.supportsFormat(x0i.getPcmFormat(2, kq6Var.f55007e2, kq6Var.f55009f2))) {
            List<kda> decoderInfos = getDecoderInfos(ydaVar, kq6Var, false, this.f39533F3);
            if (decoderInfos.isEmpty()) {
                return p1e.create(1);
            }
            if (!zM23256g0) {
                return p1e.create(2);
            }
            kda kdaVar = decoderInfos.get(0);
            boolean zIsFormatSupported = kdaVar.isFormatSupported(kq6Var);
            if (zIsFormatSupported) {
                z = true;
                z2 = zIsFormatSupported;
            } else {
                for (int i3 = 1; i3 < decoderInfos.size(); i3++) {
                    kda kdaVar2 = decoderInfos.get(i3);
                    if (kdaVar2.isFormatSupported(kq6Var)) {
                        z = false;
                        kdaVar = kdaVar2;
                        break;
                    }
                }
                z = true;
                z2 = zIsFormatSupported;
            }
            int i4 = z2 ? 4 : 3;
            if (z2 && kdaVar.isSeamlessAdaptationSupported(kq6Var)) {
                i2 = 16;
            }
            return p1e.create(i4, i2, i, kdaVar.f53656h ? 64 : 0, z ? 128 : 0);
        }
        return p1e.create(1);
    }

    @Override // p000.bu0, p000.n1e
    @hib
    public bda getMediaClock() {
        return this;
    }

    @Override // p000.n1e, p000.p1e
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p000.bda
    public qyc getPlaybackParameters() {
        return this.f39533F3.getPlaybackParameters();
    }

    @Override // p000.bda
    public long getPositionUs() {
        if (getState() == 2) {
            updateCurrentPosition();
        }
        return this.f39538K3;
    }

    @Override // p000.bu0, p000.l0d.InterfaceC8571b
    public void handleMessage(int i, @hib Object obj) throws ba5 {
        if (i == 2) {
            this.f39533F3.setVolume(((Float) obj).floatValue());
        }
        if (i == 3) {
            this.f39533F3.setAudioAttributes((yc0) obj);
            return;
        }
        if (i == 6) {
            this.f39533F3.setAuxEffectInfo((om0) obj);
            return;
        }
        switch (i) {
            case 9:
                this.f39533F3.setSkipSilenceEnabled(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.f39533F3.setAudioSessionId(((Integer) obj).intValue());
                break;
            case 11:
                this.f39543P3 = (n1e.InterfaceC9653c) obj;
                break;
            case 12:
                if (x0i.f95978a >= 23) {
                    C6258b.setAudioSinkPreferredDevice(this.f39533F3, obj);
                }
                break;
            default:
                super.handleMessage(i, obj);
                break;
        }
    }

    @Override // p000.uda, p000.n1e
    public boolean isEnded() {
        return super.isEnded() && this.f39533F3.isEnded();
    }

    @Override // p000.uda, p000.n1e
    public boolean isReady() {
        return this.f39533F3.hasPendingData() || super.isReady();
    }

    @Override // p000.uda, p000.bu0
    /* JADX INFO: renamed from: j */
    public void mo3412j() {
        this.f39541N3 = true;
        this.f39536I3 = null;
        try {
            this.f39533F3.flush();
            try {
                super.mo3412j();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.mo3412j();
                throw th;
            } finally {
            }
        }
    }

    @Override // p000.uda, p000.bu0
    /* JADX INFO: renamed from: k */
    public void mo3413k(boolean z, boolean z2) throws ba5 {
        super.mo3413k(z, z2);
        this.f39532E3.enabled(this.f87719h3);
        if (m3405c().f76783a) {
            this.f39533F3.enableTunnelingV21();
        } else {
            this.f39533F3.disableTunneling();
        }
        this.f39533F3.setPlayerId(m3409g());
    }

    @Override // p000.uda, p000.bu0
    /* JADX INFO: renamed from: l */
    public void mo3414l(long j, boolean z) throws ba5 {
        super.mo3414l(j, z);
        if (this.f39542O3) {
            this.f39533F3.experimentalFlushWithoutAudioTrackRelease();
        } else {
            this.f39533F3.flush();
        }
        this.f39538K3 = j;
        this.f39539L3 = true;
        this.f39540M3 = true;
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: m */
    public void mo3415m() {
        this.f39533F3.release();
    }

    /* JADX INFO: renamed from: m0 */
    public int m11642m0(kda kdaVar, kq6 kq6Var, kq6[] kq6VarArr) {
        int codecMaxInputSize = getCodecMaxInputSize(kdaVar, kq6Var);
        if (kq6VarArr.length == 1) {
            return codecMaxInputSize;
        }
        for (kq6 kq6Var2 : kq6VarArr) {
            if (kdaVar.canReuseCodec(kq6Var, kq6Var2).f94612d != 0) {
                codecMaxInputSize = Math.max(codecMaxInputSize, getCodecMaxInputSize(kdaVar, kq6Var2));
            }
        }
        return codecMaxInputSize;
    }

    @igg({"InlinedApi"})
    /* JADX INFO: renamed from: n0 */
    public MediaFormat m11643n0(kq6 kq6Var, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", kq6Var.f55007e2);
        mediaFormat.setInteger("sample-rate", kq6Var.f55009f2);
        ifa.setCsdBuffers(mediaFormat, kq6Var.f54992Q);
        ifa.maybeSetInteger(mediaFormat, "max-input-size", i);
        int i2 = x0i.f95978a;
        if (i2 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && !deviceDoesntSupportOperatingRate()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (i2 <= 28 && "audio/ac4".equals(kq6Var.f54989M)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i2 >= 24 && this.f39533F3.getFormatSupport(x0i.getPcmFormat(4, kq6Var.f55007e2, kq6Var.f55009f2)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i2 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }

    @Override // p000.uda, p000.bu0
    /* JADX INFO: renamed from: o */
    public void mo3417o() {
        try {
            super.mo3417o();
        } finally {
            if (this.f39541N3) {
                this.f39541N3 = false;
                this.f39533F3.reset();
            }
        }
    }

    @un1
    /* JADX INFO: renamed from: o0 */
    public void m11644o0() {
        this.f39540M3 = true;
    }

    @Override // p000.uda, p000.bu0
    /* JADX INFO: renamed from: p */
    public void mo3418p() {
        super.mo3418p();
        this.f39533F3.play();
    }

    @Override // p000.uda, p000.bu0
    /* JADX INFO: renamed from: q */
    public void mo3419q() {
        updateCurrentPosition();
        this.f39533F3.pause();
        super.mo3419q();
    }

    @Override // p000.bda
    public void setPlaybackParameters(qyc qycVar) {
        this.f39533F3.setPlaybackParameters(qycVar);
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: u */
    public wl3 mo11645u(kda kdaVar, kq6 kq6Var, kq6 kq6Var2) {
        wl3 wl3VarCanReuseCodec = kdaVar.canReuseCodec(kq6Var, kq6Var2);
        int i = wl3VarCanReuseCodec.f94613e;
        if (m23261J(kq6Var2)) {
            i |= 32768;
        }
        if (getCodecMaxInputSize(kdaVar, kq6Var2) > this.f39534G3) {
            i |= 64;
        }
        int i2 = i;
        return new wl3(kdaVar.f53649a, kq6Var, kq6Var2, i2 != 0 ? 0 : wl3VarCanReuseCodec.f94612d, i2);
    }

    public gda(Context context, yda ydaVar, @hib Handler handler, @hib sg0 sg0Var) {
        this(context, ydaVar, handler, sg0Var, ld0.f57217e, new if0[0]);
    }

    public gda(Context context, yda ydaVar, @hib Handler handler, @hib sg0 sg0Var, ld0 ld0Var, if0... if0VarArr) {
        this(context, ydaVar, handler, sg0Var, new us3.C13682h().setAudioCapabilities((ld0) yya.firstNonNull(ld0Var, ld0.f57217e)).setAudioProcessors(if0VarArr).build());
    }

    public gda(Context context, yda ydaVar, @hib Handler handler, @hib sg0 sg0Var, ch0 ch0Var) {
        this(context, eda.InterfaceC5266b.f32706a, ydaVar, false, handler, sg0Var, ch0Var);
    }

    public gda(Context context, yda ydaVar, boolean z, @hib Handler handler, @hib sg0 sg0Var, ch0 ch0Var) {
        this(context, eda.InterfaceC5266b.f32706a, ydaVar, z, handler, sg0Var, ch0Var);
    }

    public gda(Context context, eda.InterfaceC5266b interfaceC5266b, yda ydaVar, boolean z, @hib Handler handler, @hib sg0 sg0Var, ch0 ch0Var) {
        super(1, interfaceC5266b, ydaVar, z, 44100.0f);
        this.f39531D3 = context.getApplicationContext();
        this.f39533F3 = ch0Var;
        this.f39532E3 = new sg0.C12563a(handler, sg0Var);
        ch0Var.setListener(new C6259c());
    }
}
