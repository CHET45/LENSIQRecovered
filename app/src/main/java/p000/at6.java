package p000;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;
import p000.izc;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class at6 implements izc {

    /* JADX INFO: renamed from: c1 */
    public final izc f11831c1;

    /* JADX INFO: renamed from: at6$a */
    public static final class C1603a implements izc.InterfaceC7680g {

        /* JADX INFO: renamed from: a */
        public final at6 f11832a;

        /* JADX INFO: renamed from: b */
        public final izc.InterfaceC7680g f11833b;

        public C1603a(at6 at6Var, izc.InterfaceC7680g interfaceC7680g) {
            this.f11832a = at6Var;
            this.f11833b = interfaceC7680g;
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1603a)) {
                return false;
            }
            C1603a c1603a = (C1603a) obj;
            if (this.f11832a.equals(c1603a.f11832a)) {
                return this.f11833b.equals(c1603a.f11833b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f11832a.hashCode() * 31) + this.f11833b.hashCode();
        }

        @Override // p000.izc.InterfaceC7680g
        public void onAudioAttributesChanged(uc0 uc0Var) {
            this.f11833b.onAudioAttributesChanged(uc0Var);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onAudioSessionIdChanged(int i) {
            this.f11833b.onAudioSessionIdChanged(i);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onAvailableCommandsChanged(izc.C7676c c7676c) {
            this.f11833b.onAvailableCommandsChanged(c7676c);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onCues(List<n93> list) {
            this.f11833b.onCues(list);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onDeviceInfoChanged(o84 o84Var) {
            this.f11833b.onDeviceInfoChanged(o84Var);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onDeviceVolumeChanged(int i, boolean z) {
            this.f11833b.onDeviceVolumeChanged(i, z);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onEvents(izc izcVar, izc.C7679f c7679f) {
            this.f11833b.onEvents(this.f11832a, c7679f);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onIsLoadingChanged(boolean z) {
            this.f11833b.onIsLoadingChanged(z);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onIsPlayingChanged(boolean z) {
            this.f11833b.onIsPlayingChanged(z);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onLoadingChanged(boolean z) {
            this.f11833b.onIsLoadingChanged(z);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onMaxSeekToPreviousPositionChanged(long j) {
            this.f11833b.onMaxSeekToPreviousPositionChanged(j);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onMediaItemTransition(@hib nfa nfaVar, int i) {
            this.f11833b.onMediaItemTransition(nfaVar, i);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onMediaMetadataChanged(hga hgaVar) {
            this.f11833b.onMediaMetadataChanged(hgaVar);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onMetadata(eta etaVar) {
            this.f11833b.onMetadata(etaVar);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onPlayWhenReadyChanged(boolean z, int i) {
            this.f11833b.onPlayWhenReadyChanged(z, i);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onPlaybackParametersChanged(ryc rycVar) {
            this.f11833b.onPlaybackParametersChanged(rycVar);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onPlaybackStateChanged(int i) {
            this.f11833b.onPlaybackStateChanged(i);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onPlaybackSuppressionReasonChanged(int i) {
            this.f11833b.onPlaybackSuppressionReasonChanged(i);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onPlayerError(kyc kycVar) {
            this.f11833b.onPlayerError(kycVar);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onPlayerErrorChanged(@hib kyc kycVar) {
            this.f11833b.onPlayerErrorChanged(kycVar);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onPlayerStateChanged(boolean z, int i) {
            this.f11833b.onPlayerStateChanged(z, i);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onPlaylistMetadataChanged(hga hgaVar) {
            this.f11833b.onPlaylistMetadataChanged(hgaVar);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onPositionDiscontinuity(int i) {
            this.f11833b.onPositionDiscontinuity(i);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onRenderedFirstFrame() {
            this.f11833b.onRenderedFirstFrame();
        }

        @Override // p000.izc.InterfaceC7680g
        public void onRepeatModeChanged(int i) {
            this.f11833b.onRepeatModeChanged(i);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onSeekBackIncrementChanged(long j) {
            this.f11833b.onSeekBackIncrementChanged(j);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onSeekForwardIncrementChanged(long j) {
            this.f11833b.onSeekForwardIncrementChanged(j);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onShuffleModeEnabledChanged(boolean z) {
            this.f11833b.onShuffleModeEnabledChanged(z);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onSkipSilenceEnabledChanged(boolean z) {
            this.f11833b.onSkipSilenceEnabledChanged(z);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onSurfaceSizeChanged(int i, int i2) {
            this.f11833b.onSurfaceSizeChanged(i, i2);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onTimelineChanged(q1h q1hVar, int i) {
            this.f11833b.onTimelineChanged(q1hVar, i);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onTrackSelectionParametersChanged(h7h h7hVar) {
            this.f11833b.onTrackSelectionParametersChanged(h7hVar);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onTracksChanged(x7h x7hVar) {
            this.f11833b.onTracksChanged(x7hVar);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onVideoSizeChanged(a8i a8iVar) {
            this.f11833b.onVideoSizeChanged(a8iVar);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onVolumeChanged(float f) {
            this.f11833b.onVolumeChanged(f);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onCues(z93 z93Var) {
            this.f11833b.onCues(z93Var);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onPositionDiscontinuity(izc.C7684k c7684k, izc.C7684k c7684k2, int i) {
            this.f11833b.onPositionDiscontinuity(c7684k, c7684k2, i);
        }
    }

    public at6(izc izcVar) {
        this.f11831c1 = izcVar;
    }

    @Override // p000.izc
    public void addListener(izc.InterfaceC7680g interfaceC7680g) {
        this.f11831c1.addListener(new C1603a(this, interfaceC7680g));
    }

    @Override // p000.izc
    public void addMediaItem(nfa nfaVar) {
        this.f11831c1.addMediaItem(nfaVar);
    }

    @Override // p000.izc
    public void addMediaItems(List<nfa> list) {
        this.f11831c1.addMediaItems(list);
    }

    @Override // p000.izc
    public boolean canAdvertiseSession() {
        return this.f11831c1.canAdvertiseSession();
    }

    @Override // p000.izc
    public void clearMediaItems() {
        this.f11831c1.clearMediaItems();
    }

    @Override // p000.izc
    public void clearVideoSurface() {
        this.f11831c1.clearVideoSurface();
    }

    @Override // p000.izc
    public void clearVideoSurfaceHolder(@hib SurfaceHolder surfaceHolder) {
        this.f11831c1.clearVideoSurfaceHolder(surfaceHolder);
    }

    @Override // p000.izc
    public void clearVideoSurfaceView(@hib SurfaceView surfaceView) {
        this.f11831c1.clearVideoSurfaceView(surfaceView);
    }

    @Override // p000.izc
    public void clearVideoTextureView(@hib TextureView textureView) {
        this.f11831c1.clearVideoTextureView(textureView);
    }

    @Override // p000.izc
    @Deprecated
    public void decreaseDeviceVolume() {
        this.f11831c1.decreaseDeviceVolume();
    }

    @Override // p000.izc
    public Looper getApplicationLooper() {
        return this.f11831c1.getApplicationLooper();
    }

    @Override // p000.izc
    public uc0 getAudioAttributes() {
        return this.f11831c1.getAudioAttributes();
    }

    @Override // p000.izc
    public izc.C7676c getAvailableCommands() {
        return this.f11831c1.getAvailableCommands();
    }

    @Override // p000.izc
    public int getBufferedPercentage() {
        return this.f11831c1.getBufferedPercentage();
    }

    @Override // p000.izc
    public long getBufferedPosition() {
        return this.f11831c1.getBufferedPosition();
    }

    @Override // p000.izc
    public long getContentBufferedPosition() {
        return this.f11831c1.getContentBufferedPosition();
    }

    @Override // p000.izc
    public long getContentDuration() {
        return this.f11831c1.getContentDuration();
    }

    @Override // p000.izc
    public long getContentPosition() {
        return this.f11831c1.getContentPosition();
    }

    @Override // p000.izc
    public int getCurrentAdGroupIndex() {
        return this.f11831c1.getCurrentAdGroupIndex();
    }

    @Override // p000.izc
    public int getCurrentAdIndexInAdGroup() {
        return this.f11831c1.getCurrentAdIndexInAdGroup();
    }

    @Override // p000.izc
    public z93 getCurrentCues() {
        return this.f11831c1.getCurrentCues();
    }

    @Override // p000.izc
    public long getCurrentLiveOffset() {
        return this.f11831c1.getCurrentLiveOffset();
    }

    @Override // p000.izc
    @hib
    public Object getCurrentManifest() {
        return this.f11831c1.getCurrentManifest();
    }

    @Override // p000.izc
    @hib
    public nfa getCurrentMediaItem() {
        return this.f11831c1.getCurrentMediaItem();
    }

    @Override // p000.izc
    public int getCurrentMediaItemIndex() {
        return this.f11831c1.getCurrentMediaItemIndex();
    }

    @Override // p000.izc
    public int getCurrentPeriodIndex() {
        return this.f11831c1.getCurrentPeriodIndex();
    }

    @Override // p000.izc
    public long getCurrentPosition() {
        return this.f11831c1.getCurrentPosition();
    }

    @Override // p000.izc
    public q1h getCurrentTimeline() {
        return this.f11831c1.getCurrentTimeline();
    }

    @Override // p000.izc
    public x7h getCurrentTracks() {
        return this.f11831c1.getCurrentTracks();
    }

    @Override // p000.izc
    @Deprecated
    public int getCurrentWindowIndex() {
        return this.f11831c1.getCurrentWindowIndex();
    }

    @Override // p000.izc
    public o84 getDeviceInfo() {
        return this.f11831c1.getDeviceInfo();
    }

    @Override // p000.izc
    public int getDeviceVolume() {
        return this.f11831c1.getDeviceVolume();
    }

    @Override // p000.izc
    public long getDuration() {
        return this.f11831c1.getDuration();
    }

    @Override // p000.izc
    public long getMaxSeekToPreviousPosition() {
        return this.f11831c1.getMaxSeekToPreviousPosition();
    }

    @Override // p000.izc
    public nfa getMediaItemAt(int i) {
        return this.f11831c1.getMediaItemAt(i);
    }

    @Override // p000.izc
    public int getMediaItemCount() {
        return this.f11831c1.getMediaItemCount();
    }

    @Override // p000.izc
    public hga getMediaMetadata() {
        return this.f11831c1.getMediaMetadata();
    }

    @Override // p000.izc
    public int getNextMediaItemIndex() {
        return this.f11831c1.getNextMediaItemIndex();
    }

    @Override // p000.izc
    @Deprecated
    public int getNextWindowIndex() {
        return this.f11831c1.getNextWindowIndex();
    }

    @Override // p000.izc
    public boolean getPlayWhenReady() {
        return this.f11831c1.getPlayWhenReady();
    }

    @Override // p000.izc
    public ryc getPlaybackParameters() {
        return this.f11831c1.getPlaybackParameters();
    }

    @Override // p000.izc
    public int getPlaybackState() {
        return this.f11831c1.getPlaybackState();
    }

    @Override // p000.izc
    public int getPlaybackSuppressionReason() {
        return this.f11831c1.getPlaybackSuppressionReason();
    }

    @Override // p000.izc
    @hib
    public kyc getPlayerError() {
        return this.f11831c1.getPlayerError();
    }

    @Override // p000.izc
    public hga getPlaylistMetadata() {
        return this.f11831c1.getPlaylistMetadata();
    }

    @Override // p000.izc
    public int getPreviousMediaItemIndex() {
        return this.f11831c1.getPreviousMediaItemIndex();
    }

    @Override // p000.izc
    @Deprecated
    public int getPreviousWindowIndex() {
        return this.f11831c1.getPreviousWindowIndex();
    }

    @Override // p000.izc
    public int getRepeatMode() {
        return this.f11831c1.getRepeatMode();
    }

    @Override // p000.izc
    public long getSeekBackIncrement() {
        return this.f11831c1.getSeekBackIncrement();
    }

    @Override // p000.izc
    public long getSeekForwardIncrement() {
        return this.f11831c1.getSeekForwardIncrement();
    }

    @Override // p000.izc
    public boolean getShuffleModeEnabled() {
        return this.f11831c1.getShuffleModeEnabled();
    }

    @Override // p000.izc
    public xpf getSurfaceSize() {
        return this.f11831c1.getSurfaceSize();
    }

    @Override // p000.izc
    public long getTotalBufferedDuration() {
        return this.f11831c1.getTotalBufferedDuration();
    }

    @Override // p000.izc
    public h7h getTrackSelectionParameters() {
        return this.f11831c1.getTrackSelectionParameters();
    }

    @Override // p000.izc
    public a8i getVideoSize() {
        return this.f11831c1.getVideoSize();
    }

    @Override // p000.izc
    public float getVolume() {
        return this.f11831c1.getVolume();
    }

    public izc getWrappedPlayer() {
        return this.f11831c1;
    }

    @Override // p000.izc
    public boolean hasNextMediaItem() {
        return this.f11831c1.hasNextMediaItem();
    }

    @Override // p000.izc
    public boolean hasPreviousMediaItem() {
        return this.f11831c1.hasPreviousMediaItem();
    }

    @Override // p000.izc
    @Deprecated
    public void increaseDeviceVolume() {
        this.f11831c1.increaseDeviceVolume();
    }

    @Override // p000.izc
    public boolean isCommandAvailable(int i) {
        return this.f11831c1.isCommandAvailable(i);
    }

    @Override // p000.izc
    public boolean isCurrentMediaItemDynamic() {
        return this.f11831c1.isCurrentMediaItemDynamic();
    }

    @Override // p000.izc
    public boolean isCurrentMediaItemLive() {
        return this.f11831c1.isCurrentMediaItemLive();
    }

    @Override // p000.izc
    public boolean isCurrentMediaItemSeekable() {
        return this.f11831c1.isCurrentMediaItemSeekable();
    }

    @Override // p000.izc
    @Deprecated
    public boolean isCurrentWindowDynamic() {
        return this.f11831c1.isCurrentWindowDynamic();
    }

    @Override // p000.izc
    @Deprecated
    public boolean isCurrentWindowLive() {
        return this.f11831c1.isCurrentWindowLive();
    }

    @Override // p000.izc
    @Deprecated
    public boolean isCurrentWindowSeekable() {
        return this.f11831c1.isCurrentWindowSeekable();
    }

    @Override // p000.izc
    public boolean isDeviceMuted() {
        return this.f11831c1.isDeviceMuted();
    }

    @Override // p000.izc
    public boolean isLoading() {
        return this.f11831c1.isLoading();
    }

    @Override // p000.izc
    public boolean isPlaying() {
        return this.f11831c1.isPlaying();
    }

    @Override // p000.izc
    public boolean isPlayingAd() {
        return this.f11831c1.isPlayingAd();
    }

    @Override // p000.izc
    public void moveMediaItem(int i, int i2) {
        this.f11831c1.moveMediaItem(i, i2);
    }

    @Override // p000.izc
    public void moveMediaItems(int i, int i2, int i3) {
        this.f11831c1.moveMediaItems(i, i2, i3);
    }

    @Override // p000.izc
    public void pause() {
        this.f11831c1.pause();
    }

    @Override // p000.izc
    public void play() {
        this.f11831c1.play();
    }

    @Override // p000.izc
    public void prepare() {
        this.f11831c1.prepare();
    }

    @Override // p000.izc
    public void release() {
        this.f11831c1.release();
    }

    @Override // p000.izc
    public void removeListener(izc.InterfaceC7680g interfaceC7680g) {
        this.f11831c1.removeListener(new C1603a(this, interfaceC7680g));
    }

    @Override // p000.izc
    public void removeMediaItem(int i) {
        this.f11831c1.removeMediaItem(i);
    }

    @Override // p000.izc
    public void removeMediaItems(int i, int i2) {
        this.f11831c1.removeMediaItems(i, i2);
    }

    @Override // p000.izc
    public void replaceMediaItem(int i, nfa nfaVar) {
        this.f11831c1.replaceMediaItem(i, nfaVar);
    }

    @Override // p000.izc
    public void replaceMediaItems(int i, int i2, List<nfa> list) {
        this.f11831c1.replaceMediaItems(i, i2, list);
    }

    @Override // p000.izc
    public void seekBack() {
        this.f11831c1.seekBack();
    }

    @Override // p000.izc
    public void seekForward() {
        this.f11831c1.seekForward();
    }

    @Override // p000.izc
    public void seekTo(long j) {
        this.f11831c1.seekTo(j);
    }

    @Override // p000.izc
    public void seekToDefaultPosition() {
        this.f11831c1.seekToDefaultPosition();
    }

    @Override // p000.izc
    public void seekToNext() {
        this.f11831c1.seekToNext();
    }

    @Override // p000.izc
    public void seekToNextMediaItem() {
        this.f11831c1.seekToNextMediaItem();
    }

    @Override // p000.izc
    public void seekToPrevious() {
        this.f11831c1.seekToPrevious();
    }

    @Override // p000.izc
    public void seekToPreviousMediaItem() {
        this.f11831c1.seekToPreviousMediaItem();
    }

    @Override // p000.izc
    public void setAudioAttributes(uc0 uc0Var, boolean z) {
        this.f11831c1.setAudioAttributes(uc0Var, z);
    }

    @Override // p000.izc
    @Deprecated
    public void setDeviceMuted(boolean z) {
        this.f11831c1.setDeviceMuted(z);
    }

    @Override // p000.izc
    @Deprecated
    public void setDeviceVolume(int i) {
        this.f11831c1.setDeviceVolume(i);
    }

    @Override // p000.izc
    public void setMediaItem(nfa nfaVar) {
        this.f11831c1.setMediaItem(nfaVar);
    }

    @Override // p000.izc
    public void setMediaItems(List<nfa> list) {
        this.f11831c1.setMediaItems(list);
    }

    @Override // p000.izc
    public void setPlayWhenReady(boolean z) {
        this.f11831c1.setPlayWhenReady(z);
    }

    @Override // p000.izc
    public void setPlaybackParameters(ryc rycVar) {
        this.f11831c1.setPlaybackParameters(rycVar);
    }

    @Override // p000.izc
    public void setPlaybackSpeed(float f) {
        this.f11831c1.setPlaybackSpeed(f);
    }

    @Override // p000.izc
    public void setPlaylistMetadata(hga hgaVar) {
        this.f11831c1.setPlaylistMetadata(hgaVar);
    }

    @Override // p000.izc
    public void setRepeatMode(int i) {
        this.f11831c1.setRepeatMode(i);
    }

    @Override // p000.izc
    public void setShuffleModeEnabled(boolean z) {
        this.f11831c1.setShuffleModeEnabled(z);
    }

    @Override // p000.izc
    public void setTrackSelectionParameters(h7h h7hVar) {
        this.f11831c1.setTrackSelectionParameters(h7hVar);
    }

    @Override // p000.izc
    public void setVideoSurface(@hib Surface surface) {
        this.f11831c1.setVideoSurface(surface);
    }

    @Override // p000.izc
    public void setVideoSurfaceHolder(@hib SurfaceHolder surfaceHolder) {
        this.f11831c1.setVideoSurfaceHolder(surfaceHolder);
    }

    @Override // p000.izc
    public void setVideoSurfaceView(@hib SurfaceView surfaceView) {
        this.f11831c1.setVideoSurfaceView(surfaceView);
    }

    @Override // p000.izc
    public void setVideoTextureView(@hib TextureView textureView) {
        this.f11831c1.setVideoTextureView(textureView);
    }

    @Override // p000.izc
    public void setVolume(float f) {
        this.f11831c1.setVolume(f);
    }

    @Override // p000.izc
    public void stop() {
        this.f11831c1.stop();
    }

    @Override // p000.izc
    public void addMediaItem(int i, nfa nfaVar) {
        this.f11831c1.addMediaItem(i, nfaVar);
    }

    @Override // p000.izc
    public void addMediaItems(int i, List<nfa> list) {
        this.f11831c1.addMediaItems(i, list);
    }

    @Override // p000.izc
    public void clearVideoSurface(@hib Surface surface) {
        this.f11831c1.clearVideoSurface(surface);
    }

    @Override // p000.izc
    public void decreaseDeviceVolume(int i) {
        this.f11831c1.decreaseDeviceVolume(i);
    }

    @Override // p000.izc
    public void increaseDeviceVolume(int i) {
        this.f11831c1.increaseDeviceVolume(i);
    }

    @Override // p000.izc
    public void seekTo(int i, long j) {
        this.f11831c1.seekTo(i, j);
    }

    @Override // p000.izc
    public void seekToDefaultPosition(int i) {
        this.f11831c1.seekToDefaultPosition(i);
    }

    @Override // p000.izc
    public void setDeviceMuted(boolean z, int i) {
        this.f11831c1.setDeviceMuted(z, i);
    }

    @Override // p000.izc
    public void setDeviceVolume(int i, int i2) {
        this.f11831c1.setDeviceVolume(i, i2);
    }

    @Override // p000.izc
    public void setMediaItem(nfa nfaVar, long j) {
        this.f11831c1.setMediaItem(nfaVar, j);
    }

    @Override // p000.izc
    public void setMediaItems(List<nfa> list, boolean z) {
        this.f11831c1.setMediaItems(list, z);
    }

    @Override // p000.izc
    public void setMediaItem(nfa nfaVar, boolean z) {
        this.f11831c1.setMediaItem(nfaVar, z);
    }

    @Override // p000.izc
    public void setMediaItems(List<nfa> list, int i, long j) {
        this.f11831c1.setMediaItems(list, i, j);
    }
}
