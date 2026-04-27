package p000;

import android.media.AudioDeviceInfo;
import androidx.media3.common.C1213a;
import java.nio.ByteBuffer;
import p000.bh0;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class yq6 implements bh0 {

    /* JADX INFO: renamed from: h */
    public final bh0 f102649h;

    public yq6(bh0 bh0Var) {
        this.f102649h = bh0Var;
    }

    @Override // p000.bh0
    public void configure(C1213a c1213a, int i, @hib int[] iArr) throws bh0.C1888b {
        this.f102649h.configure(c1213a, i, iArr);
    }

    @Override // p000.bh0
    public void disableTunneling() {
        this.f102649h.disableTunneling();
    }

    @Override // p000.bh0
    public void enableTunnelingV21() {
        this.f102649h.enableTunnelingV21();
    }

    @Override // p000.bh0
    public void flush() {
        this.f102649h.flush();
    }

    @Override // p000.bh0
    @hib
    public uc0 getAudioAttributes() {
        return this.f102649h.getAudioAttributes();
    }

    @Override // p000.bh0
    public long getAudioTrackBufferSizeUs() {
        return this.f102649h.getAudioTrackBufferSizeUs();
    }

    @Override // p000.bh0
    public long getCurrentPositionUs(boolean z) {
        return this.f102649h.getCurrentPositionUs(z);
    }

    @Override // p000.bh0
    public oe0 getFormatOffloadSupport(C1213a c1213a) {
        return this.f102649h.getFormatOffloadSupport(c1213a);
    }

    @Override // p000.bh0
    public int getFormatSupport(C1213a c1213a) {
        return this.f102649h.getFormatSupport(c1213a);
    }

    @Override // p000.bh0
    public ryc getPlaybackParameters() {
        return this.f102649h.getPlaybackParameters();
    }

    @Override // p000.bh0
    public boolean getSkipSilenceEnabled() {
        return this.f102649h.getSkipSilenceEnabled();
    }

    @Override // p000.bh0
    public boolean handleBuffer(ByteBuffer byteBuffer, long j, int i) throws bh0.C1894h, bh0.C1889c {
        return this.f102649h.handleBuffer(byteBuffer, j, i);
    }

    @Override // p000.bh0
    public void handleDiscontinuity() {
        this.f102649h.handleDiscontinuity();
    }

    @Override // p000.bh0
    public boolean hasPendingData() {
        return this.f102649h.hasPendingData();
    }

    @Override // p000.bh0
    public boolean isEnded() {
        return this.f102649h.isEnded();
    }

    @Override // p000.bh0
    public void pause() {
        this.f102649h.pause();
    }

    @Override // p000.bh0
    public void play() {
        this.f102649h.play();
    }

    @Override // p000.bh0
    public void playToEndOfStream() throws bh0.C1894h {
        this.f102649h.playToEndOfStream();
    }

    @Override // p000.bh0
    public void release() {
        this.f102649h.release();
    }

    @Override // p000.bh0
    public void reset() {
        this.f102649h.reset();
    }

    @Override // p000.bh0
    public void setAudioAttributes(uc0 uc0Var) {
        this.f102649h.setAudioAttributes(uc0Var);
    }

    @Override // p000.bh0
    public void setAudioSessionId(int i) {
        this.f102649h.setAudioSessionId(i);
    }

    @Override // p000.bh0
    public void setAuxEffectInfo(pm0 pm0Var) {
        this.f102649h.setAuxEffectInfo(pm0Var);
    }

    @Override // p000.bh0
    public void setClock(j52 j52Var) {
        this.f102649h.setClock(j52Var);
    }

    @Override // p000.bh0
    public void setListener(bh0.InterfaceC1890d interfaceC1890d) {
        this.f102649h.setListener(interfaceC1890d);
    }

    @Override // p000.bh0
    @c5e(29)
    public void setOffloadDelayPadding(int i, int i2) {
        this.f102649h.setOffloadDelayPadding(i, i2);
    }

    @Override // p000.bh0
    @c5e(29)
    public void setOffloadMode(int i) {
        this.f102649h.setOffloadMode(i);
    }

    @Override // p000.bh0
    public void setOutputStreamOffsetUs(long j) {
        this.f102649h.setOutputStreamOffsetUs(j);
    }

    @Override // p000.bh0
    public void setPlaybackParameters(ryc rycVar) {
        this.f102649h.setPlaybackParameters(rycVar);
    }

    @Override // p000.bh0
    public void setPlayerId(@hib j0d j0dVar) {
        this.f102649h.setPlayerId(j0dVar);
    }

    @Override // p000.bh0
    @c5e(23)
    public void setPreferredDevice(@hib AudioDeviceInfo audioDeviceInfo) {
        this.f102649h.setPreferredDevice(audioDeviceInfo);
    }

    @Override // p000.bh0
    public void setSkipSilenceEnabled(boolean z) {
        this.f102649h.setSkipSilenceEnabled(z);
    }

    @Override // p000.bh0
    public void setVolume(float f) {
        this.f102649h.setVolume(f);
    }

    @Override // p000.bh0
    public boolean supportsFormat(C1213a c1213a) {
        return this.f102649h.supportsFormat(c1213a);
    }
}
