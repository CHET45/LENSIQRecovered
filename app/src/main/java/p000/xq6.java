package p000;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;
import p000.ch0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class xq6 implements ch0 {

    /* JADX INFO: renamed from: e */
    public final ch0 f98971e;

    public xq6(ch0 ch0Var) {
        this.f98971e = ch0Var;
    }

    @Override // p000.ch0
    public void configure(kq6 kq6Var, int i, @hib int[] iArr) throws ch0.C2308a {
        this.f98971e.configure(kq6Var, i, iArr);
    }

    @Override // p000.ch0
    public void disableTunneling() {
        this.f98971e.disableTunneling();
    }

    @Override // p000.ch0
    public void enableTunnelingV21() {
        this.f98971e.enableTunnelingV21();
    }

    @Override // p000.ch0
    public void experimentalFlushWithoutAudioTrackRelease() {
        this.f98971e.experimentalFlushWithoutAudioTrackRelease();
    }

    @Override // p000.ch0
    public void flush() {
        this.f98971e.flush();
    }

    @Override // p000.ch0
    @hib
    public yc0 getAudioAttributes() {
        return this.f98971e.getAudioAttributes();
    }

    @Override // p000.ch0
    public long getCurrentPositionUs(boolean z) {
        return this.f98971e.getCurrentPositionUs(z);
    }

    @Override // p000.ch0
    public int getFormatSupport(kq6 kq6Var) {
        return this.f98971e.getFormatSupport(kq6Var);
    }

    @Override // p000.ch0
    public qyc getPlaybackParameters() {
        return this.f98971e.getPlaybackParameters();
    }

    @Override // p000.ch0
    public boolean getSkipSilenceEnabled() {
        return this.f98971e.getSkipSilenceEnabled();
    }

    @Override // p000.ch0
    public boolean handleBuffer(ByteBuffer byteBuffer, long j, int i) throws ch0.C2309b, ch0.C2313f {
        return this.f98971e.handleBuffer(byteBuffer, j, i);
    }

    @Override // p000.ch0
    public void handleDiscontinuity() {
        this.f98971e.handleDiscontinuity();
    }

    @Override // p000.ch0
    public boolean hasPendingData() {
        return this.f98971e.hasPendingData();
    }

    @Override // p000.ch0
    public boolean isEnded() {
        return this.f98971e.isEnded();
    }

    @Override // p000.ch0
    public void pause() {
        this.f98971e.pause();
    }

    @Override // p000.ch0
    public void play() {
        this.f98971e.play();
    }

    @Override // p000.ch0
    public void playToEndOfStream() throws ch0.C2313f {
        this.f98971e.playToEndOfStream();
    }

    @Override // p000.ch0
    public void reset() {
        this.f98971e.reset();
    }

    @Override // p000.ch0
    public void setAudioAttributes(yc0 yc0Var) {
        this.f98971e.setAudioAttributes(yc0Var);
    }

    @Override // p000.ch0
    public void setAudioSessionId(int i) {
        this.f98971e.setAudioSessionId(i);
    }

    @Override // p000.ch0
    public void setAuxEffectInfo(om0 om0Var) {
        this.f98971e.setAuxEffectInfo(om0Var);
    }

    @Override // p000.ch0
    public void setListener(ch0.InterfaceC2310c interfaceC2310c) {
        this.f98971e.setListener(interfaceC2310c);
    }

    @Override // p000.ch0
    public void setOutputStreamOffsetUs(long j) {
        this.f98971e.setOutputStreamOffsetUs(j);
    }

    @Override // p000.ch0
    public void setPlaybackParameters(qyc qycVar) {
        this.f98971e.setPlaybackParameters(qycVar);
    }

    @Override // p000.ch0
    public void setPlayerId(@hib k0d k0dVar) {
        this.f98971e.setPlayerId(k0dVar);
    }

    @Override // p000.ch0
    @c5e(23)
    public void setPreferredDevice(@hib AudioDeviceInfo audioDeviceInfo) {
        this.f98971e.setPreferredDevice(audioDeviceInfo);
    }

    @Override // p000.ch0
    public void setSkipSilenceEnabled(boolean z) {
        this.f98971e.setSkipSilenceEnabled(z);
    }

    @Override // p000.ch0
    public void setVolume(float f) {
        this.f98971e.setVolume(f);
    }

    @Override // p000.ch0
    public boolean supportsFormat(kq6 kq6Var) {
        return this.f98971e.supportsFormat(kq6Var);
    }
}
