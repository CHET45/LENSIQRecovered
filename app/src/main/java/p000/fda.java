package p000;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.InterfaceC1254q;
import androidx.media3.exoplayer.InterfaceC1255s;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import p000.bh0;
import p000.dda;
import p000.nea;
import p000.ps3;
import p000.rg0;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class fda extends sda implements cda {

    /* JADX INFO: renamed from: W3 */
    public static final String f36207W3 = "MediaCodecAudioRenderer";

    /* JADX INFO: renamed from: X3 */
    public static final String f36208X3 = "v-bits-per-sample";

    /* JADX INFO: renamed from: G3 */
    public final Context f36209G3;

    /* JADX INFO: renamed from: H3 */
    public final rg0.C12068a f36210H3;

    /* JADX INFO: renamed from: I3 */
    public final bh0 f36211I3;

    /* JADX INFO: renamed from: J3 */
    @hib
    public final gp9 f36212J3;

    /* JADX INFO: renamed from: K3 */
    public int f36213K3;

    /* JADX INFO: renamed from: L3 */
    public boolean f36214L3;

    /* JADX INFO: renamed from: M3 */
    public boolean f36215M3;

    /* JADX INFO: renamed from: N3 */
    @hib
    public C1213a f36216N3;

    /* JADX INFO: renamed from: O3 */
    @hib
    public C1213a f36217O3;

    /* JADX INFO: renamed from: P3 */
    public long f36218P3;

    /* JADX INFO: renamed from: Q3 */
    public boolean f36219Q3;

    /* JADX INFO: renamed from: R3 */
    public boolean f36220R3;

    /* JADX INFO: renamed from: S3 */
    public boolean f36221S3;

    /* JADX INFO: renamed from: T3 */
    public int f36222T3;

    /* JADX INFO: renamed from: U3 */
    public boolean f36223U3;

    /* JADX INFO: renamed from: V3 */
    public long f36224V3;

    /* JADX INFO: renamed from: fda$b */
    @c5e(23)
    public static final class C5731b {
        private C5731b() {
        }

        public static void setAudioSinkPreferredDevice(bh0 bh0Var, @hib Object obj) {
            bh0Var.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    /* JADX INFO: renamed from: fda$c */
    public final class C5732c implements bh0.InterfaceC1890d {
        private C5732c() {
        }

        @Override // p000.bh0.InterfaceC1890d
        public void onAudioCapabilitiesChanged() {
            fda.this.m1765s();
        }

        @Override // p000.bh0.InterfaceC1890d
        public void onAudioSessionIdChanged(int i) {
            if (Build.VERSION.SDK_INT >= 35 && fda.this.f36212J3 != null) {
                fda.this.f36212J3.setAudioSessionId(i);
            }
            fda.this.f36210H3.audioSessionIdChanged(i);
        }

        @Override // p000.bh0.InterfaceC1890d
        public void onAudioSinkError(Exception exc) {
            xh9.m25145e("MediaCodecAudioRenderer", "Audio sink error", exc);
            fda.this.f36210H3.audioSinkError(exc);
        }

        @Override // p000.bh0.InterfaceC1890d
        public void onAudioTrackInitialized(bh0.C1887a c1887a) {
            fda.this.f36210H3.audioTrackInitialized(c1887a);
        }

        @Override // p000.bh0.InterfaceC1890d
        public void onAudioTrackReleased(bh0.C1887a c1887a) {
            fda.this.f36210H3.audioTrackReleased(c1887a);
        }

        @Override // p000.bh0.InterfaceC1890d
        public void onOffloadBufferEmptying() {
            InterfaceC1254q.c cVarM21847T = fda.this.m21847T();
            if (cVarM21847T != null) {
                cVarM21847T.onWakeup();
            }
        }

        @Override // p000.bh0.InterfaceC1890d
        public void onOffloadBufferFull() {
            InterfaceC1254q.c cVarM21847T = fda.this.m21847T();
            if (cVarM21847T != null) {
                cVarM21847T.onSleep();
            }
        }

        @Override // p000.bh0.InterfaceC1890d
        public void onPositionAdvancing(long j) {
            fda.this.f36210H3.positionAdvancing(j);
        }

        @Override // p000.bh0.InterfaceC1890d
        public void onPositionDiscontinuity() {
            fda.this.m10823I0();
        }

        @Override // p000.bh0.InterfaceC1890d
        public void onSilenceSkipped() {
            fda.this.f36221S3 = true;
        }

        @Override // p000.bh0.InterfaceC1890d
        public void onSkipSilenceEnabledChanged(boolean z) {
            fda.this.f36210H3.skipSilenceEnabledChanged(z);
        }

        @Override // p000.bh0.InterfaceC1890d
        public void onUnderrun(int i, long j, long j2) {
            fda.this.f36210H3.underrun(i, j, j2);
        }
    }

    public fda(Context context, zda zdaVar) {
        this(context, zdaVar, null, null);
    }

    private static boolean codecNeedsDiscardChannelsWorkaround(String str) {
        return false;
    }

    private static boolean codecNeedsVorbisToAndroidChannelMappingWorkaround(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    private static boolean deviceDoesntSupportOperatingRate() {
        return false;
    }

    private int getAudioOffloadSupport(C1213a c1213a) {
        oe0 formatOffloadSupport = this.f36211I3.getFormatOffloadSupport(c1213a);
        if (!formatOffloadSupport.f67373a) {
            return 0;
        }
        int i = formatOffloadSupport.f67374b ? 1536 : 512;
        return formatOffloadSupport.f67375c ? i | 2048 : i;
    }

    private int getCodecMaxInputSize(lda ldaVar, C1213a c1213a) {
        "OMX.google.raw.decoder".equals(ldaVar.f57252a);
        return c1213a.f8292p;
    }

    private static List<lda> getDecoderInfos(zda zdaVar, C1213a c1213a, boolean z, bh0 bh0Var) throws nea.C9821c {
        lda decryptOnlyDecoderInfo;
        return c1213a.f8291o == null ? kx7.m15110of() : (!bh0Var.supportsFormat(c1213a) || (decryptOnlyDecoderInfo = nea.getDecryptOnlyDecoderInfo()) == null) ? nea.getDecoderInfosSoftMatch(zdaVar, c1213a, z, false) : kx7.m15111of(decryptOnlyDecoderInfo);
    }

    private void setAudioSessionId(int i) {
        gp9 gp9Var;
        this.f36211I3.setAudioSessionId(i);
        if (Build.VERSION.SDK_INT < 35 || (gp9Var = this.f36212J3) == null) {
            return;
        }
        gp9Var.setAudioSessionId(i);
    }

    private void updateCodecImportance() {
        dda ddaVarM21838E = m21838E();
        if (ddaVarM21838E != null && Build.VERSION.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f36222T3));
            ddaVarM21838E.setParameters(bundle);
        }
    }

    private void updateCurrentPosition() {
        long currentPositionUs = this.f36211I3.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.f36219Q3) {
                currentPositionUs = Math.max(this.f36218P3, currentPositionUs);
            }
            this.f36218P3 = currentPositionUs;
            this.f36219Q3 = false;
        }
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: B */
    public vl3 mo10820B(lda ldaVar, C1213a c1213a, C1213a c1213a2) {
        vl3 vl3VarCanReuseCodec = ldaVar.canReuseCodec(c1213a, c1213a2);
        int i = vl3VarCanReuseCodec.f91581e;
        if (m21850X(c1213a2)) {
            i |= 32768;
        }
        if (getCodecMaxInputSize(ldaVar, c1213a2) > this.f36213K3) {
            i |= 64;
        }
        int i2 = i;
        return new vl3(ldaVar.f57252a, c1213a, c1213a2, i2 != 0 ? 0 : vl3VarCanReuseCodec.f91580d, i2);
    }

    /* JADX INFO: renamed from: G0 */
    public int m10821G0(lda ldaVar, C1213a c1213a, C1213a[] c1213aArr) {
        int codecMaxInputSize = getCodecMaxInputSize(ldaVar, c1213a);
        if (c1213aArr.length == 1) {
            return codecMaxInputSize;
        }
        for (C1213a c1213a2 : c1213aArr) {
            if (ldaVar.canReuseCodec(c1213a, c1213a2).f91580d != 0) {
                codecMaxInputSize = Math.max(codecMaxInputSize, getCodecMaxInputSize(ldaVar, c1213a2));
            }
        }
        return codecMaxInputSize;
    }

    @igg({"InlinedApi"})
    /* JADX INFO: renamed from: H0 */
    public MediaFormat m10822H0(C1213a c1213a, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", c1213a.f8266G);
        mediaFormat.setInteger("sample-rate", c1213a.f8267H);
        jfa.setCsdBuffers(mediaFormat, c1213a.f8294r);
        jfa.maybeSetInteger(mediaFormat, "max-input-size", i);
        int i2 = Build.VERSION.SDK_INT;
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f && !deviceDoesntSupportOperatingRate()) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if ("audio/ac4".equals(c1213a.f8291o)) {
            Pair<Integer, Integer> codecProfileAndLevel = d72.getCodecProfileAndLevel(c1213a);
            if (codecProfileAndLevel != null) {
                jfa.maybeSetInteger(mediaFormat, Scopes.PROFILE, ((Integer) codecProfileAndLevel.first).intValue());
                jfa.maybeSetInteger(mediaFormat, FirebaseAnalytics.C3552d.f23228t, ((Integer) codecProfileAndLevel.second).intValue());
            }
            if (i2 <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (this.f36211I3.getFormatSupport(t0i.getPcmFormat(4, c1213a.f8266G, c1213a.f8267H)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i2 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i2 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f36222T3));
        }
        return mediaFormat;
    }

    @un1
    /* JADX INFO: renamed from: I0 */
    public void m10823I0() {
        this.f36219Q3 = true;
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: K */
    public float mo10824K(float f, C1213a c1213a, C1213a[] c1213aArr) {
        int iMax = -1;
        for (C1213a c1213a2 : c1213aArr) {
            int i = c1213a2.f8267H;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f * iMax;
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: M */
    public List<lda> mo10825M(zda zdaVar, C1213a c1213a, boolean z) throws nea.C9821c {
        return nea.getDecoderInfosSortedByFormatSupport(getDecoderInfos(zdaVar, c1213a, z, this.f36211I3), c1213a);
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: N */
    public long mo10826N(long j, long j2, boolean z) {
        boolean z2 = this.f36224V3 != -9223372036854775807L;
        if (!this.f36223U3) {
            return (z2 || super.isEnded()) ? 1000000L : 10000L;
        }
        long audioTrackBufferSizeUs = this.f36211I3.getAudioTrackBufferSizeUs();
        if (!z2 || audioTrackBufferSizeUs == -9223372036854775807L) {
            return 10000L;
        }
        return Math.max(10000L, ((long) ((Math.min(audioTrackBufferSizeUs, this.f36224V3 - j) / (getPlaybackParameters() != null ? getPlaybackParameters().f80107a : 1.0f)) / 2.0f)) - (t0i.msToUs(m1749c().elapsedRealtime()) - j2));
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: P */
    public dda.C4751a mo10827P(lda ldaVar, C1213a c1213a, @hib MediaCrypto mediaCrypto, float f) {
        this.f36213K3 = m10821G0(ldaVar, c1213a, m1756j());
        this.f36214L3 = codecNeedsDiscardChannelsWorkaround(ldaVar.f57252a);
        this.f36215M3 = codecNeedsVorbisToAndroidChannelMappingWorkaround(ldaVar.f57252a);
        MediaFormat mediaFormatM10822H0 = m10822H0(c1213a, ldaVar.f57254c, this.f36213K3, f);
        this.f36217O3 = (!"audio/raw".equals(ldaVar.f57253b) || "audio/raw".equals(c1213a.f8291o)) ? null : c1213a;
        return dda.C4751a.createForAudioDecoding(ldaVar, mediaFormatM10822H0, c1213a, mediaCrypto, this.f36212J3);
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: U */
    public void mo10828U(rl3 rl3Var) {
        C1213a c1213a;
        if (Build.VERSION.SDK_INT < 29 || (c1213a = rl3Var.f78606b) == null || !Objects.equals(c1213a.f8291o, "audio/opus") || !m21849W()) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) v80.checkNotNull(rl3Var.f78611m);
        int i = ((C1213a) v80.checkNotNull(rl3Var.f78606b)).f8269J;
        if (byteBuffer.remaining() == 8) {
            this.f36211I3.setOffloadDelayPadding(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: a0 */
    public void mo10829a0(Exception exc) {
        xh9.m25145e("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f36210H3.audioCodecError(exc);
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: b0 */
    public void mo10830b0(String str, dda.C4751a c4751a, long j, long j2) {
        this.f36210H3.decoderInitialized(str, j, j2);
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: c0 */
    public void mo10831c0(String str) {
        this.f36210H3.decoderReleased(str);
    }

    @Override // p000.sda
    @hib
    /* JADX INFO: renamed from: d0 */
    public vl3 mo10832d0(oq6 oq6Var) throws aa5 {
        C1213a c1213a = (C1213a) v80.checkNotNull(oq6Var.f68294b);
        this.f36216N3 = c1213a;
        vl3 vl3VarMo10832d0 = super.mo10832d0(oq6Var);
        this.f36210H3.inputFormatChanged(c1213a, vl3VarMo10832d0);
        return vl3VarMo10832d0;
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: e0 */
    public void mo10833e0(C1213a c1213a, @hib MediaFormat mediaFormat) throws aa5 {
        int i;
        C1213a c1213a2 = this.f36217O3;
        int[] vorbisToAndroidChannelLayoutMapping = null;
        if (c1213a2 != null) {
            c1213a = c1213a2;
        } else if (m21838E() != null) {
            v80.checkNotNull(mediaFormat);
            C1213a c1213aBuild = new C1213a.b().setSampleMimeType("audio/raw").setPcmEncoding("audio/raw".equals(c1213a.f8291o) ? c1213a.f8268I : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? t0i.getPcmEncoding(mediaFormat.getInteger("v-bits-per-sample")) : 2).setEncoderDelay(c1213a.f8269J).setEncoderPadding(c1213a.f8270K).setMetadata(c1213a.f8288l).setCustomData(c1213a.f8289m).setId(c1213a.f8277a).setLabel(c1213a.f8278b).setLabels(c1213a.f8279c).setLanguage(c1213a.f8280d).setSelectionFlags(c1213a.f8281e).setRoleFlags(c1213a.f8282f).setChannelCount(mediaFormat.getInteger("channel-count")).setSampleRate(mediaFormat.getInteger("sample-rate")).build();
            if (this.f36214L3 && c1213aBuild.f8266G == 6 && (i = c1213a.f8266G) < 6) {
                vorbisToAndroidChannelLayoutMapping = new int[i];
                for (int i2 = 0; i2 < c1213a.f8266G; i2++) {
                    vorbisToAndroidChannelLayoutMapping[i2] = i2;
                }
            } else if (this.f36215M3) {
                vorbisToAndroidChannelLayoutMapping = ogi.getVorbisToAndroidChannelLayoutMapping(c1213aBuild.f8266G);
            }
            c1213a = c1213aBuild;
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                if (!m21849W() || m1750d().f80389a == 0) {
                    this.f36211I3.setOffloadMode(0);
                } else {
                    this.f36211I3.setOffloadMode(m1750d().f80389a);
                }
            }
            this.f36211I3.configure(c1213a, 0, vorbisToAndroidChannelLayoutMapping);
        } catch (bh0.C1888b e) {
            throw m1747a(e, e.f13722a, 5001);
        }
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: f0 */
    public void mo10834f0(long j) {
        this.f36211I3.setOutputStreamOffsetUs(j);
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: g0 */
    public void mo10835g0() {
        super.mo10835g0();
        this.f36211I3.handleDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c, androidx.media3.exoplayer.InterfaceC1254q
    @hib
    public cda getMediaClock() {
        return this;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p000.cda
    public ryc getPlaybackParameters() {
        return this.f36211I3.getPlaybackParameters();
    }

    @Override // p000.cda
    public long getPositionUs() {
        if (getState() == 2) {
            updateCurrentPosition();
        }
        return this.f36218P3;
    }

    @Override // p000.sda, androidx.media3.exoplayer.AbstractC1224c, androidx.media3.exoplayer.C1253p.b
    public void handleMessage(int i, @hib Object obj) throws aa5 {
        if (i == 2) {
            this.f36211I3.setVolume(((Float) v80.checkNotNull(obj)).floatValue());
            return;
        }
        if (i == 3) {
            this.f36211I3.setAudioAttributes((uc0) v80.checkNotNull((uc0) obj));
            return;
        }
        if (i == 6) {
            this.f36211I3.setAuxEffectInfo((pm0) v80.checkNotNull((pm0) obj));
            return;
        }
        if (i == 12) {
            C5731b.setAudioSinkPreferredDevice(this.f36211I3, obj);
            return;
        }
        if (i == 16) {
            this.f36222T3 = ((Integer) v80.checkNotNull(obj)).intValue();
            updateCodecImportance();
        } else if (i == 9) {
            this.f36211I3.setSkipSilenceEnabled(((Boolean) v80.checkNotNull(obj)).booleanValue());
        } else if (i != 10) {
            super.handleMessage(i, obj);
        } else {
            setAudioSessionId(((Integer) v80.checkNotNull(obj)).intValue());
        }
    }

    @Override // p000.cda
    public boolean hasSkippedSilenceSinceLastCall() {
        boolean z = this.f36221S3;
        this.f36221S3 = false;
        return z;
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: i0 */
    public boolean mo10836i0(long j, long j2, @hib dda ddaVar, @hib ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C1213a c1213a) throws aa5 {
        v80.checkNotNull(byteBuffer);
        this.f36224V3 = -9223372036854775807L;
        if (this.f36217O3 != null && (i2 & 2) != 0) {
            ((dda) v80.checkNotNull(ddaVar)).releaseOutputBuffer(i, false);
            return true;
        }
        if (z) {
            if (ddaVar != null) {
                ddaVar.releaseOutputBuffer(i, false);
            }
            this.f81430g3.f68021f += i3;
            this.f36211I3.handleDiscontinuity();
            return true;
        }
        try {
            if (!this.f36211I3.handleBuffer(byteBuffer, j3, i3)) {
                this.f36224V3 = j3;
                return false;
            }
            if (ddaVar != null) {
                ddaVar.releaseOutputBuffer(i, false);
            }
            this.f81430g3.f68020e += i3;
            return true;
        } catch (bh0.C1889c e) {
            throw m1748b(e, this.f36216N3, e.f13724b, (!m21849W() || m1750d().f80389a == 0) ? 5001 : kyc.f55701y2);
        } catch (bh0.C1894h e2) {
            throw m1748b(e2, c1213a, e2.f13729b, (!m21849W() || m1750d().f80389a == 0) ? 5002 : kyc.f55700x2);
        }
    }

    @Override // p000.sda, androidx.media3.exoplayer.InterfaceC1254q
    public boolean isEnded() {
        return super.isEnded() && this.f36211I3.isEnded();
    }

    @Override // p000.sda, androidx.media3.exoplayer.InterfaceC1254q
    public boolean isReady() {
        return this.f36211I3.hasPendingData() || super.isReady();
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: k0 */
    public void mo10837k0() throws aa5 {
        try {
            this.f36211I3.playToEndOfStream();
            if (m21843O() != -9223372036854775807L) {
                this.f36224V3 = m21843O();
            }
        } catch (bh0.C1894h e) {
            throw m1748b(e, e.f13730c, e.f13729b, m21849W() ? kyc.f55700x2 : 5002);
        }
    }

    @Override // p000.sda, androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: n */
    public void mo1760n() {
        this.f36220R3 = true;
        this.f36216N3 = null;
        this.f36224V3 = -9223372036854775807L;
        try {
            this.f36211I3.flush();
            try {
                super.mo1760n();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.mo1760n();
                throw th;
            } finally {
            }
        }
    }

    @Override // p000.sda, androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: o */
    public void mo1761o(boolean z, boolean z2) throws aa5 {
        super.mo1761o(z, z2);
        this.f36210H3.enabled(this.f81430g3);
        if (m1750d().f80390b) {
            this.f36211I3.enableTunnelingV21();
        } else {
            this.f36211I3.disableTunneling();
        }
        this.f36211I3.setPlayerId(m1755i());
        this.f36211I3.setClock(m1749c());
    }

    @Override // p000.sda, androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: q */
    public void mo1763q(long j, boolean z) throws aa5 {
        super.mo1763q(j, z);
        this.f36211I3.flush();
        this.f36218P3 = j;
        this.f36224V3 = -9223372036854775807L;
        this.f36221S3 = false;
        this.f36219Q3 = true;
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: r */
    public void mo1764r() {
        gp9 gp9Var;
        this.f36211I3.release();
        if (Build.VERSION.SDK_INT < 35 || (gp9Var = this.f36212J3) == null) {
            return;
        }
        gp9Var.release();
    }

    @Override // p000.cda
    public void setPlaybackParameters(ryc rycVar) {
        this.f36211I3.setPlaybackParameters(rycVar);
    }

    @Override // p000.sda, androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: t */
    public void mo1766t() {
        this.f36221S3 = false;
        this.f36224V3 = -9223372036854775807L;
        try {
            super.mo1766t();
        } finally {
            if (this.f36220R3) {
                this.f36220R3 = false;
                this.f36211I3.reset();
            }
        }
    }

    @Override // p000.sda, androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: u */
    public void mo1767u() {
        super.mo1767u();
        this.f36211I3.play();
        this.f36223U3 = true;
    }

    @Override // p000.sda, androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: v */
    public void mo1768v() {
        updateCurrentPosition();
        this.f36223U3 = false;
        this.f36211I3.pause();
        super.mo1768v();
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: v0 */
    public boolean mo10838v0(C1213a c1213a) {
        if (m1750d().f80389a != 0) {
            int audioOffloadSupport = getAudioOffloadSupport(c1213a);
            if ((audioOffloadSupport & 512) != 0) {
                if (m1750d().f80389a == 2 || (audioOffloadSupport & 1024) != 0) {
                    return true;
                }
                if (c1213a.f8269J == 0 && c1213a.f8270K == 0) {
                    return true;
                }
            }
        }
        return this.f36211I3.supportsFormat(c1213a);
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: w0 */
    public int mo10839w0(zda zdaVar, C1213a c1213a) throws nea.C9821c {
        int i;
        boolean z;
        if (!rva.isAudio(c1213a.f8291o)) {
            return InterfaceC1255s.create(0);
        }
        boolean z2 = true;
        boolean z3 = c1213a.f8275P != 0;
        boolean zM21836x0 = sda.m21836x0(c1213a);
        int i2 = 8;
        if (!zM21836x0 || (z3 && nea.getDecryptOnlyDecoderInfo() == null)) {
            i = 0;
        } else {
            int audioOffloadSupport = getAudioOffloadSupport(c1213a);
            if (this.f36211I3.supportsFormat(c1213a)) {
                return InterfaceC1255s.create(4, 8, 32, audioOffloadSupport);
            }
            i = audioOffloadSupport;
        }
        if ((!"audio/raw".equals(c1213a.f8291o) || this.f36211I3.supportsFormat(c1213a)) && this.f36211I3.supportsFormat(t0i.getPcmFormat(2, c1213a.f8266G, c1213a.f8267H))) {
            List<lda> decoderInfos = getDecoderInfos(zdaVar, c1213a, false, this.f36211I3);
            if (decoderInfos.isEmpty()) {
                return InterfaceC1255s.create(1);
            }
            if (!zM21836x0) {
                return InterfaceC1255s.create(2);
            }
            lda ldaVar = decoderInfos.get(0);
            boolean zIsFormatSupported = ldaVar.isFormatSupported(c1213a);
            if (zIsFormatSupported) {
                z = true;
                z2 = zIsFormatSupported;
            } else {
                for (int i3 = 1; i3 < decoderInfos.size(); i3++) {
                    lda ldaVar2 = decoderInfos.get(i3);
                    if (ldaVar2.isFormatSupported(c1213a)) {
                        z = false;
                        ldaVar = ldaVar2;
                        break;
                    }
                }
                z = true;
                z2 = zIsFormatSupported;
            }
            int i4 = z2 ? 4 : 3;
            if (z2 && ldaVar.isSeamlessAdaptationSupported(c1213a)) {
                i2 = 16;
            }
            return InterfaceC1255s.create(i4, i2, 32, ldaVar.f57259h ? 64 : 0, z ? 128 : 0, i);
        }
        return InterfaceC1255s.create(1);
    }

    public fda(Context context, zda zdaVar, @hib Handler handler, @hib rg0 rg0Var) {
        this(context, zdaVar, handler, rg0Var, new ps3.C11096h(context).build());
    }

    @Deprecated
    public fda(Context context, zda zdaVar, @hib Handler handler, @hib rg0 rg0Var, hd0 hd0Var, hf0... hf0VarArr) {
        this(context, zdaVar, handler, rg0Var, new ps3.C11096h().setAudioCapabilities((hd0) yya.firstNonNull(hd0Var, hd0.f43165e)).setAudioProcessors(hf0VarArr).build());
    }

    public fda(Context context, zda zdaVar, @hib Handler handler, @hib rg0 rg0Var, bh0 bh0Var) {
        this(context, dda.InterfaceC4752b.getDefault(context), zdaVar, false, handler, rg0Var, bh0Var);
    }

    public fda(Context context, zda zdaVar, boolean z, @hib Handler handler, @hib rg0 rg0Var, bh0 bh0Var) {
        this(context, dda.InterfaceC4752b.getDefault(context), zdaVar, z, handler, rg0Var, bh0Var);
    }

    public fda(Context context, dda.InterfaceC4752b interfaceC4752b, zda zdaVar, boolean z, @hib Handler handler, @hib rg0 rg0Var, bh0 bh0Var) {
        this(context, interfaceC4752b, zdaVar, z, handler, rg0Var, bh0Var, Build.VERSION.SDK_INT >= 35 ? new gp9() : null);
    }

    public fda(Context context, dda.InterfaceC4752b interfaceC4752b, zda zdaVar, boolean z, @hib Handler handler, @hib rg0 rg0Var, bh0 bh0Var, @hib gp9 gp9Var) {
        super(1, interfaceC4752b, zdaVar, z, 44100.0f);
        this.f36209G3 = context.getApplicationContext();
        this.f36211I3 = bh0Var;
        this.f36212J3 = gp9Var;
        this.f36222T3 = -1000;
        this.f36210H3 = new rg0.C12068a(handler, rg0Var);
        this.f36224V3 = -9223372036854775807L;
        bh0Var.setListener(new C5732c());
    }
}
