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
import p000.lzc;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class mif extends at0 implements ca5, ca5.InterfaceC2247a, ca5.InterfaceC2252f, ca5.InterfaceC2251e, ca5.InterfaceC2250d {

    /* JADX INFO: renamed from: Z0 */
    public final ie5 f61081Z0;

    /* JADX INFO: renamed from: a1 */
    public final wp2 f61082a1;

    @Deprecated
    public mif(Context context, u1e u1eVar, p7h p7hVar, vna.InterfaceC14174a interfaceC14174a, gc9 gc9Var, vp0 vp0Var, InterfaceC12162rn interfaceC12162rn, boolean z, h52 h52Var, Looper looper) {
        this(new ca5.C2249c(context, u1eVar, interfaceC14174a, p7hVar, gc9Var, vp0Var, interfaceC12162rn).setUseLazyPreparation(z).setClock(h52Var).setLooper(looper));
    }

    private void blockUntilConstructorFinished() {
        this.f61082a1.blockUninterruptible();
    }

    /* JADX INFO: renamed from: a */
    public void m17330a(boolean z) {
        blockUntilConstructorFinished();
        this.f61081Z0.m12987e0(z);
    }

    @Override // p000.ca5
    public void addAnalyticsListener(InterfaceC5415eo interfaceC5415eo) {
        blockUntilConstructorFinished();
        this.f61081Z0.addAnalyticsListener(interfaceC5415eo);
    }

    @Override // p000.ca5
    public void addAudioOffloadListener(ca5.InterfaceC2248b interfaceC2248b) {
        blockUntilConstructorFinished();
        this.f61081Z0.addAudioOffloadListener(interfaceC2248b);
    }

    @Override // p000.lzc
    public void addListener(lzc.InterfaceC9049g interfaceC9049g) {
        blockUntilConstructorFinished();
        this.f61081Z0.addListener(interfaceC9049g);
    }

    @Override // p000.lzc
    public void addMediaItems(int i, List<aga> list) {
        blockUntilConstructorFinished();
        this.f61081Z0.addMediaItems(i, list);
    }

    @Override // p000.ca5
    public void addMediaSource(vna vnaVar) {
        blockUntilConstructorFinished();
        this.f61081Z0.addMediaSource(vnaVar);
    }

    @Override // p000.ca5
    public void addMediaSources(List<vna> list) {
        blockUntilConstructorFinished();
        this.f61081Z0.addMediaSources(list);
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2247a
    public void clearAuxEffectInfo() {
        blockUntilConstructorFinished();
        this.f61081Z0.clearAuxEffectInfo();
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2252f
    public void clearCameraMotionListener(fp1 fp1Var) {
        blockUntilConstructorFinished();
        this.f61081Z0.clearCameraMotionListener(fp1Var);
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2252f
    public void clearVideoFrameMetadataListener(n6i n6iVar) {
        blockUntilConstructorFinished();
        this.f61081Z0.clearVideoFrameMetadataListener(n6iVar);
    }

    @Override // p000.lzc
    public void clearVideoSurface() {
        blockUntilConstructorFinished();
        this.f61081Z0.clearVideoSurface();
    }

    @Override // p000.lzc
    public void clearVideoSurfaceHolder(@hib SurfaceHolder surfaceHolder) {
        blockUntilConstructorFinished();
        this.f61081Z0.clearVideoSurfaceHolder(surfaceHolder);
    }

    @Override // p000.lzc
    public void clearVideoSurfaceView(@hib SurfaceView surfaceView) {
        blockUntilConstructorFinished();
        this.f61081Z0.clearVideoSurfaceView(surfaceView);
    }

    @Override // p000.lzc
    public void clearVideoTextureView(@hib TextureView textureView) {
        blockUntilConstructorFinished();
        this.f61081Z0.clearVideoTextureView(textureView);
    }

    @Override // p000.ca5
    public l0d createMessage(l0d.InterfaceC8571b interfaceC8571b) {
        blockUntilConstructorFinished();
        return this.f61081Z0.createMessage(interfaceC8571b);
    }

    @Override // p000.lzc
    @Deprecated
    public void decreaseDeviceVolume() {
        blockUntilConstructorFinished();
        this.f61081Z0.decreaseDeviceVolume();
    }

    @Override // p000.ca5
    public boolean experimentalIsSleepingForOffload() {
        blockUntilConstructorFinished();
        return this.f61081Z0.experimentalIsSleepingForOffload();
    }

    @Override // p000.ca5
    public void experimentalSetOffloadSchedulingEnabled(boolean z) {
        blockUntilConstructorFinished();
        this.f61081Z0.experimentalSetOffloadSchedulingEnabled(z);
    }

    @Override // p000.ca5
    public InterfaceC12162rn getAnalyticsCollector() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getAnalyticsCollector();
    }

    @Override // p000.lzc
    public Looper getApplicationLooper() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getApplicationLooper();
    }

    @Override // p000.lzc
    public yc0 getAudioAttributes() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getAudioAttributes();
    }

    @Override // p000.ca5
    @hib
    @Deprecated
    public ca5.InterfaceC2247a getAudioComponent() {
        return this;
    }

    @Override // p000.ca5
    @hib
    public nl3 getAudioDecoderCounters() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getAudioDecoderCounters();
    }

    @Override // p000.ca5
    @hib
    public kq6 getAudioFormat() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getAudioFormat();
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2247a
    public int getAudioSessionId() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getAudioSessionId();
    }

    @Override // p000.lzc
    public lzc.C9045c getAvailableCommands() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getAvailableCommands();
    }

    @Override // p000.lzc
    public long getBufferedPosition() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getBufferedPosition();
    }

    @Override // p000.ca5
    public h52 getClock() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getClock();
    }

    @Override // p000.lzc
    public long getContentBufferedPosition() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getContentBufferedPosition();
    }

    @Override // p000.lzc
    public long getContentPosition() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getContentPosition();
    }

    @Override // p000.lzc
    public int getCurrentAdGroupIndex() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getCurrentAdGroupIndex();
    }

    @Override // p000.lzc
    public int getCurrentAdIndexInAdGroup() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getCurrentAdIndexInAdGroup();
    }

    @Override // p000.lzc
    public y93 getCurrentCues() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getCurrentCues();
    }

    @Override // p000.lzc
    public int getCurrentMediaItemIndex() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getCurrentMediaItemIndex();
    }

    @Override // p000.lzc
    public int getCurrentPeriodIndex() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getCurrentPeriodIndex();
    }

    @Override // p000.lzc
    public long getCurrentPosition() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getCurrentPosition();
    }

    @Override // p000.lzc
    public t1h getCurrentTimeline() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getCurrentTimeline();
    }

    @Override // p000.ca5
    @Deprecated
    public m6h getCurrentTrackGroups() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getCurrentTrackGroups();
    }

    @Override // p000.ca5
    @Deprecated
    public w6h getCurrentTrackSelections() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getCurrentTrackSelections();
    }

    @Override // p000.lzc
    public y7h getCurrentTracks() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getCurrentTracks();
    }

    @Override // p000.ca5
    @hib
    @Deprecated
    public ca5.InterfaceC2250d getDeviceComponent() {
        return this;
    }

    @Override // p000.lzc
    public p84 getDeviceInfo() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getDeviceInfo();
    }

    @Override // p000.lzc
    public int getDeviceVolume() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getDeviceVolume();
    }

    @Override // p000.lzc
    public long getDuration() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getDuration();
    }

    @Override // p000.lzc
    public long getMaxSeekToPreviousPosition() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getMaxSeekToPreviousPosition();
    }

    @Override // p000.lzc
    public iga getMediaMetadata() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getMediaMetadata();
    }

    @Override // p000.ca5
    public boolean getPauseAtEndOfMediaItems() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getPauseAtEndOfMediaItems();
    }

    @Override // p000.lzc
    public boolean getPlayWhenReady() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getPlayWhenReady();
    }

    @Override // p000.ca5
    public Looper getPlaybackLooper() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getPlaybackLooper();
    }

    @Override // p000.lzc
    public qyc getPlaybackParameters() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getPlaybackParameters();
    }

    @Override // p000.lzc
    public int getPlaybackState() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getPlaybackState();
    }

    @Override // p000.lzc
    public int getPlaybackSuppressionReason() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getPlaybackSuppressionReason();
    }

    @Override // p000.lzc
    public iga getPlaylistMetadata() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getPlaylistMetadata();
    }

    @Override // p000.ca5
    public n1e getRenderer(int i) {
        blockUntilConstructorFinished();
        return this.f61081Z0.getRenderer(i);
    }

    @Override // p000.ca5
    public int getRendererCount() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getRendererCount();
    }

    @Override // p000.ca5
    public int getRendererType(int i) {
        blockUntilConstructorFinished();
        return this.f61081Z0.getRendererType(i);
    }

    @Override // p000.lzc
    public int getRepeatMode() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getRepeatMode();
    }

    @Override // p000.lzc
    public long getSeekBackIncrement() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getSeekBackIncrement();
    }

    @Override // p000.lzc
    public long getSeekForwardIncrement() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getSeekForwardIncrement();
    }

    @Override // p000.ca5
    public iue getSeekParameters() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getSeekParameters();
    }

    @Override // p000.lzc
    public boolean getShuffleModeEnabled() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getShuffleModeEnabled();
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2247a
    public boolean getSkipSilenceEnabled() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getSkipSilenceEnabled();
    }

    @Override // p000.lzc
    public ypf getSurfaceSize() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getSurfaceSize();
    }

    @Override // p000.ca5
    @hib
    @Deprecated
    public ca5.InterfaceC2251e getTextComponent() {
        return this;
    }

    @Override // p000.lzc
    public long getTotalBufferedDuration() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getTotalBufferedDuration();
    }

    @Override // p000.lzc
    public j7h getTrackSelectionParameters() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getTrackSelectionParameters();
    }

    @Override // p000.ca5
    public p7h getTrackSelector() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getTrackSelector();
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2252f
    public int getVideoChangeFrameRateStrategy() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getVideoChangeFrameRateStrategy();
    }

    @Override // p000.ca5
    @hib
    @Deprecated
    public ca5.InterfaceC2252f getVideoComponent() {
        return this;
    }

    @Override // p000.ca5
    @hib
    public nl3 getVideoDecoderCounters() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getVideoDecoderCounters();
    }

    @Override // p000.ca5
    @hib
    public kq6 getVideoFormat() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getVideoFormat();
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2252f
    public int getVideoScalingMode() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getVideoScalingMode();
    }

    @Override // p000.lzc
    public z7i getVideoSize() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getVideoSize();
    }

    @Override // p000.lzc
    public float getVolume() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getVolume();
    }

    @Override // p000.lzc
    @Deprecated
    public void increaseDeviceVolume() {
        blockUntilConstructorFinished();
        this.f61081Z0.increaseDeviceVolume();
    }

    @Override // p000.lzc
    public boolean isDeviceMuted() {
        blockUntilConstructorFinished();
        return this.f61081Z0.isDeviceMuted();
    }

    @Override // p000.lzc
    public boolean isLoading() {
        blockUntilConstructorFinished();
        return this.f61081Z0.isLoading();
    }

    @Override // p000.lzc
    public boolean isPlayingAd() {
        blockUntilConstructorFinished();
        return this.f61081Z0.isPlayingAd();
    }

    @Override // p000.ca5
    public boolean isTunnelingEnabled() {
        blockUntilConstructorFinished();
        return this.f61081Z0.isTunnelingEnabled();
    }

    @Override // p000.lzc
    public void moveMediaItems(int i, int i2, int i3) {
        blockUntilConstructorFinished();
        this.f61081Z0.moveMediaItems(i, i2, i3);
    }

    @Override // p000.lzc
    public void prepare() {
        blockUntilConstructorFinished();
        this.f61081Z0.prepare();
    }

    @Override // p000.lzc
    public void release() {
        blockUntilConstructorFinished();
        this.f61081Z0.release();
    }

    @Override // p000.ca5
    public void removeAnalyticsListener(InterfaceC5415eo interfaceC5415eo) {
        blockUntilConstructorFinished();
        this.f61081Z0.removeAnalyticsListener(interfaceC5415eo);
    }

    @Override // p000.ca5
    public void removeAudioOffloadListener(ca5.InterfaceC2248b interfaceC2248b) {
        blockUntilConstructorFinished();
        this.f61081Z0.removeAudioOffloadListener(interfaceC2248b);
    }

    @Override // p000.lzc
    public void removeListener(lzc.InterfaceC9049g interfaceC9049g) {
        blockUntilConstructorFinished();
        this.f61081Z0.removeListener(interfaceC9049g);
    }

    @Override // p000.lzc
    public void removeMediaItems(int i, int i2) {
        blockUntilConstructorFinished();
        this.f61081Z0.removeMediaItems(i, i2);
    }

    @Override // p000.lzc
    public void replaceMediaItems(int i, int i2, List<aga> list) {
        blockUntilConstructorFinished();
        this.f61081Z0.replaceMediaItems(i, i2, list);
    }

    @Override // p000.at0
    @fdi(otherwise = 4)
    public void seekTo(int i, long j, int i2, boolean z) {
        blockUntilConstructorFinished();
        this.f61081Z0.seekTo(i, j, i2, z);
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2247a
    public void setAudioAttributes(yc0 yc0Var, boolean z) {
        blockUntilConstructorFinished();
        this.f61081Z0.setAudioAttributes(yc0Var, z);
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2247a
    public void setAudioSessionId(int i) {
        blockUntilConstructorFinished();
        this.f61081Z0.setAudioSessionId(i);
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2247a
    public void setAuxEffectInfo(om0 om0Var) {
        blockUntilConstructorFinished();
        this.f61081Z0.setAuxEffectInfo(om0Var);
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2252f
    public void setCameraMotionListener(fp1 fp1Var) {
        blockUntilConstructorFinished();
        this.f61081Z0.setCameraMotionListener(fp1Var);
    }

    @Override // p000.lzc
    @Deprecated
    public void setDeviceMuted(boolean z) {
        blockUntilConstructorFinished();
        this.f61081Z0.setDeviceMuted(z);
    }

    @Override // p000.lzc
    @Deprecated
    public void setDeviceVolume(int i) {
        blockUntilConstructorFinished();
        this.f61081Z0.setDeviceVolume(i);
    }

    @Override // p000.ca5
    public void setForegroundMode(boolean z) {
        blockUntilConstructorFinished();
        this.f61081Z0.setForegroundMode(z);
    }

    @Override // p000.ca5
    public void setHandleAudioBecomingNoisy(boolean z) {
        blockUntilConstructorFinished();
        this.f61081Z0.setHandleAudioBecomingNoisy(z);
    }

    @Override // p000.lzc
    public void setMediaItems(List<aga> list, boolean z) {
        blockUntilConstructorFinished();
        this.f61081Z0.setMediaItems(list, z);
    }

    @Override // p000.ca5
    public void setMediaSource(vna vnaVar) {
        blockUntilConstructorFinished();
        this.f61081Z0.setMediaSource(vnaVar);
    }

    @Override // p000.ca5
    public void setMediaSources(List<vna> list) {
        blockUntilConstructorFinished();
        this.f61081Z0.setMediaSources(list);
    }

    @Override // p000.ca5
    public void setPauseAtEndOfMediaItems(boolean z) {
        blockUntilConstructorFinished();
        this.f61081Z0.setPauseAtEndOfMediaItems(z);
    }

    @Override // p000.lzc
    public void setPlayWhenReady(boolean z) {
        blockUntilConstructorFinished();
        this.f61081Z0.setPlayWhenReady(z);
    }

    @Override // p000.lzc
    public void setPlaybackParameters(qyc qycVar) {
        blockUntilConstructorFinished();
        this.f61081Z0.setPlaybackParameters(qycVar);
    }

    @Override // p000.lzc
    public void setPlaylistMetadata(iga igaVar) {
        blockUntilConstructorFinished();
        this.f61081Z0.setPlaylistMetadata(igaVar);
    }

    @Override // p000.ca5
    @c5e(23)
    public void setPreferredAudioDevice(@hib AudioDeviceInfo audioDeviceInfo) {
        blockUntilConstructorFinished();
        this.f61081Z0.setPreferredAudioDevice(audioDeviceInfo);
    }

    @Override // p000.ca5
    public void setPriorityTaskManager(@hib jcd jcdVar) {
        blockUntilConstructorFinished();
        this.f61081Z0.setPriorityTaskManager(jcdVar);
    }

    @Override // p000.lzc
    public void setRepeatMode(int i) {
        blockUntilConstructorFinished();
        this.f61081Z0.setRepeatMode(i);
    }

    @Override // p000.ca5
    public void setSeekParameters(@hib iue iueVar) {
        blockUntilConstructorFinished();
        this.f61081Z0.setSeekParameters(iueVar);
    }

    @Override // p000.lzc
    public void setShuffleModeEnabled(boolean z) {
        blockUntilConstructorFinished();
        this.f61081Z0.setShuffleModeEnabled(z);
    }

    @Override // p000.ca5
    public void setShuffleOrder(sbf sbfVar) {
        blockUntilConstructorFinished();
        this.f61081Z0.setShuffleOrder(sbfVar);
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2247a
    public void setSkipSilenceEnabled(boolean z) {
        blockUntilConstructorFinished();
        this.f61081Z0.setSkipSilenceEnabled(z);
    }

    @Override // p000.lzc
    public void setTrackSelectionParameters(j7h j7hVar) {
        blockUntilConstructorFinished();
        this.f61081Z0.setTrackSelectionParameters(j7hVar);
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2252f
    public void setVideoChangeFrameRateStrategy(int i) {
        blockUntilConstructorFinished();
        this.f61081Z0.setVideoChangeFrameRateStrategy(i);
    }

    @Override // p000.ca5
    public void setVideoEffects(List<gx4> list) {
        blockUntilConstructorFinished();
        this.f61081Z0.setVideoEffects(list);
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2252f
    public void setVideoFrameMetadataListener(n6i n6iVar) {
        blockUntilConstructorFinished();
        this.f61081Z0.setVideoFrameMetadataListener(n6iVar);
    }

    @Override // p000.ca5, p000.ca5.InterfaceC2252f
    public void setVideoScalingMode(int i) {
        blockUntilConstructorFinished();
        this.f61081Z0.setVideoScalingMode(i);
    }

    @Override // p000.lzc
    public void setVideoSurface(@hib Surface surface) {
        blockUntilConstructorFinished();
        this.f61081Z0.setVideoSurface(surface);
    }

    @Override // p000.lzc
    public void setVideoSurfaceHolder(@hib SurfaceHolder surfaceHolder) {
        blockUntilConstructorFinished();
        this.f61081Z0.setVideoSurfaceHolder(surfaceHolder);
    }

    @Override // p000.lzc
    public void setVideoSurfaceView(@hib SurfaceView surfaceView) {
        blockUntilConstructorFinished();
        this.f61081Z0.setVideoSurfaceView(surfaceView);
    }

    @Override // p000.lzc
    public void setVideoTextureView(@hib TextureView textureView) {
        blockUntilConstructorFinished();
        this.f61081Z0.setVideoTextureView(textureView);
    }

    @Override // p000.lzc
    public void setVolume(float f) {
        blockUntilConstructorFinished();
        this.f61081Z0.setVolume(f);
    }

    @Override // p000.ca5
    public void setWakeMode(int i) {
        blockUntilConstructorFinished();
        this.f61081Z0.setWakeMode(i);
    }

    @Override // p000.lzc
    public void stop() {
        blockUntilConstructorFinished();
        this.f61081Z0.stop();
    }

    /* JADX INFO: renamed from: mif$a */
    @Deprecated
    public static final class C9360a {

        /* JADX INFO: renamed from: a */
        public final ca5.C2249c f61083a;

        @Deprecated
        public C9360a(Context context) {
            this.f61083a = new ca5.C2249c(context);
        }

        @Deprecated
        public mif build() {
            return this.f61083a.m3871w();
        }

        @op1
        @Deprecated
        public C9360a experimentalSetForegroundModeTimeoutMs(long j) {
            this.f61083a.experimentalSetForegroundModeTimeoutMs(j);
            return this;
        }

        @op1
        @Deprecated
        public C9360a setAnalyticsCollector(InterfaceC12162rn interfaceC12162rn) {
            this.f61083a.setAnalyticsCollector(interfaceC12162rn);
            return this;
        }

        @op1
        @Deprecated
        public C9360a setAudioAttributes(yc0 yc0Var, boolean z) {
            this.f61083a.setAudioAttributes(yc0Var, z);
            return this;
        }

        @op1
        @Deprecated
        public C9360a setBandwidthMeter(vp0 vp0Var) {
            this.f61083a.setBandwidthMeter(vp0Var);
            return this;
        }

        @op1
        @fdi
        @Deprecated
        public C9360a setClock(h52 h52Var) {
            this.f61083a.setClock(h52Var);
            return this;
        }

        @op1
        @Deprecated
        public C9360a setDetachSurfaceTimeoutMs(long j) {
            this.f61083a.setDetachSurfaceTimeoutMs(j);
            return this;
        }

        @op1
        @Deprecated
        public C9360a setHandleAudioBecomingNoisy(boolean z) {
            this.f61083a.setHandleAudioBecomingNoisy(z);
            return this;
        }

        @op1
        @Deprecated
        public C9360a setLivePlaybackSpeedControl(vb9 vb9Var) {
            this.f61083a.setLivePlaybackSpeedControl(vb9Var);
            return this;
        }

        @op1
        @Deprecated
        public C9360a setLoadControl(gc9 gc9Var) {
            this.f61083a.setLoadControl(gc9Var);
            return this;
        }

        @op1
        @Deprecated
        public C9360a setLooper(Looper looper) {
            this.f61083a.setLooper(looper);
            return this;
        }

        @op1
        @Deprecated
        public C9360a setMediaSourceFactory(vna.InterfaceC14174a interfaceC14174a) {
            this.f61083a.setMediaSourceFactory(interfaceC14174a);
            return this;
        }

        @op1
        @Deprecated
        public C9360a setPauseAtEndOfMediaItems(boolean z) {
            this.f61083a.setPauseAtEndOfMediaItems(z);
            return this;
        }

        @op1
        @Deprecated
        public C9360a setPriorityTaskManager(@hib jcd jcdVar) {
            this.f61083a.setPriorityTaskManager(jcdVar);
            return this;
        }

        @op1
        @Deprecated
        public C9360a setReleaseTimeoutMs(long j) {
            this.f61083a.setReleaseTimeoutMs(j);
            return this;
        }

        @op1
        @Deprecated
        public C9360a setSeekBackIncrementMs(@h78(from = 1) long j) {
            this.f61083a.setSeekBackIncrementMs(j);
            return this;
        }

        @op1
        @Deprecated
        public C9360a setSeekForwardIncrementMs(@h78(from = 1) long j) {
            this.f61083a.setSeekForwardIncrementMs(j);
            return this;
        }

        @op1
        @Deprecated
        public C9360a setSeekParameters(iue iueVar) {
            this.f61083a.setSeekParameters(iueVar);
            return this;
        }

        @op1
        @Deprecated
        public C9360a setSkipSilenceEnabled(boolean z) {
            this.f61083a.setSkipSilenceEnabled(z);
            return this;
        }

        @op1
        @Deprecated
        public C9360a setTrackSelector(p7h p7hVar) {
            this.f61083a.setTrackSelector(p7hVar);
            return this;
        }

        @op1
        @Deprecated
        public C9360a setUseLazyPreparation(boolean z) {
            this.f61083a.setUseLazyPreparation(z);
            return this;
        }

        @op1
        @Deprecated
        public C9360a setVideoChangeFrameRateStrategy(int i) {
            this.f61083a.setVideoChangeFrameRateStrategy(i);
            return this;
        }

        @op1
        @Deprecated
        public C9360a setVideoScalingMode(int i) {
            this.f61083a.setVideoScalingMode(i);
            return this;
        }

        @op1
        @Deprecated
        public C9360a setWakeMode(int i) {
            this.f61083a.setWakeMode(i);
            return this;
        }

        @Deprecated
        public C9360a(Context context, u1e u1eVar) {
            this.f61083a = new ca5.C2249c(context, u1eVar);
        }

        @Deprecated
        public C9360a(Context context, hk5 hk5Var) {
            this.f61083a = new ca5.C2249c(context, new ix3(context, hk5Var));
        }

        @Deprecated
        public C9360a(Context context, u1e u1eVar, hk5 hk5Var) {
            this.f61083a = new ca5.C2249c(context, u1eVar, new ix3(context, hk5Var));
        }

        @Deprecated
        public C9360a(Context context, u1e u1eVar, p7h p7hVar, vna.InterfaceC14174a interfaceC14174a, gc9 gc9Var, vp0 vp0Var, InterfaceC12162rn interfaceC12162rn) {
            this.f61083a = new ca5.C2249c(context, u1eVar, interfaceC14174a, p7hVar, gc9Var, vp0Var, interfaceC12162rn);
        }
    }

    @Override // p000.lzc
    @hib
    public ba5 getPlayerError() {
        blockUntilConstructorFinished();
        return this.f61081Z0.getPlayerError();
    }

    @Override // p000.ca5
    public void addMediaSource(int i, vna vnaVar) {
        blockUntilConstructorFinished();
        this.f61081Z0.addMediaSource(i, vnaVar);
    }

    @Override // p000.ca5
    public void addMediaSources(int i, List<vna> list) {
        blockUntilConstructorFinished();
        this.f61081Z0.addMediaSources(i, list);
    }

    @Override // p000.lzc
    public void clearVideoSurface(@hib Surface surface) {
        blockUntilConstructorFinished();
        this.f61081Z0.clearVideoSurface(surface);
    }

    @Override // p000.lzc
    public void decreaseDeviceVolume(int i) {
        blockUntilConstructorFinished();
        this.f61081Z0.decreaseDeviceVolume(i);
    }

    @Override // p000.lzc
    public void increaseDeviceVolume(int i) {
        blockUntilConstructorFinished();
        this.f61081Z0.increaseDeviceVolume(i);
    }

    @Override // p000.ca5
    @Deprecated
    public void prepare(vna vnaVar) {
        blockUntilConstructorFinished();
        this.f61081Z0.prepare(vnaVar);
    }

    @Override // p000.lzc
    public void setDeviceMuted(boolean z, int i) {
        blockUntilConstructorFinished();
        this.f61081Z0.setDeviceMuted(z, i);
    }

    @Override // p000.lzc
    public void setDeviceVolume(int i, int i2) {
        blockUntilConstructorFinished();
        this.f61081Z0.setDeviceVolume(i, i2);
    }

    @Override // p000.lzc
    public void setMediaItems(List<aga> list, int i, long j) {
        blockUntilConstructorFinished();
        this.f61081Z0.setMediaItems(list, i, j);
    }

    @Override // p000.ca5
    public void setMediaSource(vna vnaVar, boolean z) {
        blockUntilConstructorFinished();
        this.f61081Z0.setMediaSource(vnaVar, z);
    }

    @Override // p000.ca5
    public void setMediaSources(List<vna> list, boolean z) {
        blockUntilConstructorFinished();
        this.f61081Z0.setMediaSources(list, z);
    }

    @Override // p000.ca5
    @Deprecated
    public void prepare(vna vnaVar, boolean z, boolean z2) {
        blockUntilConstructorFinished();
        this.f61081Z0.prepare(vnaVar, z, z2);
    }

    @Override // p000.ca5
    public void setMediaSource(vna vnaVar, long j) {
        blockUntilConstructorFinished();
        this.f61081Z0.setMediaSource(vnaVar, j);
    }

    @Override // p000.ca5
    public void setMediaSources(List<vna> list, int i, long j) {
        blockUntilConstructorFinished();
        this.f61081Z0.setMediaSources(list, i, j);
    }

    public mif(C9360a c9360a) {
        this(c9360a.f61083a);
    }

    public mif(ca5.C2249c c2249c) {
        wp2 wp2Var = new wp2();
        this.f61082a1 = wp2Var;
        try {
            this.f61081Z0 = new ie5(c2249c, this);
            wp2Var.open();
        } catch (Throwable th) {
            this.f61082a1.open();
            throw th;
        }
    }
}
