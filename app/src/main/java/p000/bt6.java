package p000;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.List;
import p000.lzc;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class bt6 implements lzc {

    /* JADX INFO: renamed from: Y0 */
    public final lzc f14718Y0;

    /* JADX INFO: renamed from: bt6$a */
    public static final class C2045a implements lzc.InterfaceC9049g {

        /* JADX INFO: renamed from: a */
        public final bt6 f14719a;

        /* JADX INFO: renamed from: b */
        public final lzc.InterfaceC9049g f14720b;

        public C2045a(bt6 bt6Var, lzc.InterfaceC9049g interfaceC9049g) {
            this.f14719a = bt6Var;
            this.f14720b = interfaceC9049g;
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2045a)) {
                return false;
            }
            C2045a c2045a = (C2045a) obj;
            if (this.f14719a.equals(c2045a.f14719a)) {
                return this.f14720b.equals(c2045a.f14720b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f14719a.hashCode() * 31) + this.f14720b.hashCode();
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onAudioAttributesChanged(yc0 yc0Var) {
            this.f14720b.onAudioAttributesChanged(yc0Var);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onAudioSessionIdChanged(int i) {
            this.f14720b.onAudioSessionIdChanged(i);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onAvailableCommandsChanged(lzc.C9045c c9045c) {
            this.f14720b.onAvailableCommandsChanged(c9045c);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onCues(List<o93> list) {
            this.f14720b.onCues(list);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onDeviceInfoChanged(p84 p84Var) {
            this.f14720b.onDeviceInfoChanged(p84Var);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onDeviceVolumeChanged(int i, boolean z) {
            this.f14720b.onDeviceVolumeChanged(i, z);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onEvents(lzc lzcVar, lzc.C9048f c9048f) {
            this.f14720b.onEvents(this.f14719a, c9048f);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onIsLoadingChanged(boolean z) {
            this.f14720b.onIsLoadingChanged(z);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onIsPlayingChanged(boolean z) {
            this.f14720b.onIsPlayingChanged(z);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onLoadingChanged(boolean z) {
            this.f14720b.onIsLoadingChanged(z);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onMaxSeekToPreviousPositionChanged(long j) {
            this.f14720b.onMaxSeekToPreviousPositionChanged(j);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onMediaItemTransition(@hib aga agaVar, int i) {
            this.f14720b.onMediaItemTransition(agaVar, i);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onMediaMetadataChanged(iga igaVar) {
            this.f14720b.onMediaMetadataChanged(igaVar);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onMetadata(Metadata metadata) {
            this.f14720b.onMetadata(metadata);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onPlayWhenReadyChanged(boolean z, int i) {
            this.f14720b.onPlayWhenReadyChanged(z, i);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onPlaybackParametersChanged(qyc qycVar) {
            this.f14720b.onPlaybackParametersChanged(qycVar);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onPlaybackStateChanged(int i) {
            this.f14720b.onPlaybackStateChanged(i);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onPlaybackSuppressionReasonChanged(int i) {
            this.f14720b.onPlaybackSuppressionReasonChanged(i);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onPlayerError(lyc lycVar) {
            this.f14720b.onPlayerError(lycVar);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onPlayerErrorChanged(@hib lyc lycVar) {
            this.f14720b.onPlayerErrorChanged(lycVar);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onPlayerStateChanged(boolean z, int i) {
            this.f14720b.onPlayerStateChanged(z, i);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onPlaylistMetadataChanged(iga igaVar) {
            this.f14720b.onPlaylistMetadataChanged(igaVar);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onPositionDiscontinuity(int i) {
            this.f14720b.onPositionDiscontinuity(i);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onRenderedFirstFrame() {
            this.f14720b.onRenderedFirstFrame();
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onRepeatModeChanged(int i) {
            this.f14720b.onRepeatModeChanged(i);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onSeekBackIncrementChanged(long j) {
            this.f14720b.onSeekBackIncrementChanged(j);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onSeekForwardIncrementChanged(long j) {
            this.f14720b.onSeekForwardIncrementChanged(j);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onShuffleModeEnabledChanged(boolean z) {
            this.f14720b.onShuffleModeEnabledChanged(z);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onSkipSilenceEnabledChanged(boolean z) {
            this.f14720b.onSkipSilenceEnabledChanged(z);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onSurfaceSizeChanged(int i, int i2) {
            this.f14720b.onSurfaceSizeChanged(i, i2);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onTimelineChanged(t1h t1hVar, int i) {
            this.f14720b.onTimelineChanged(t1hVar, i);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onTrackSelectionParametersChanged(j7h j7hVar) {
            this.f14720b.onTrackSelectionParametersChanged(j7hVar);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onTracksChanged(y7h y7hVar) {
            this.f14720b.onTracksChanged(y7hVar);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onVideoSizeChanged(z7i z7iVar) {
            this.f14720b.onVideoSizeChanged(z7iVar);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onVolumeChanged(float f) {
            this.f14720b.onVolumeChanged(f);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onCues(y93 y93Var) {
            this.f14720b.onCues(y93Var);
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onPositionDiscontinuity(lzc.C9053k c9053k, lzc.C9053k c9053k2, int i) {
            this.f14720b.onPositionDiscontinuity(c9053k, c9053k2, i);
        }
    }

    public bt6(lzc lzcVar) {
        this.f14718Y0 = lzcVar;
    }

    @Override // p000.lzc
    public void addListener(lzc.InterfaceC9049g interfaceC9049g) {
        this.f14718Y0.addListener(new C2045a(this, interfaceC9049g));
    }

    @Override // p000.lzc
    public void addMediaItem(aga agaVar) {
        this.f14718Y0.addMediaItem(agaVar);
    }

    @Override // p000.lzc
    public void addMediaItems(List<aga> list) {
        this.f14718Y0.addMediaItems(list);
    }

    @Override // p000.lzc
    public boolean canAdvertiseSession() {
        return this.f14718Y0.canAdvertiseSession();
    }

    @Override // p000.lzc
    public void clearMediaItems() {
        this.f14718Y0.clearMediaItems();
    }

    @Override // p000.lzc
    public void clearVideoSurface() {
        this.f14718Y0.clearVideoSurface();
    }

    @Override // p000.lzc
    public void clearVideoSurfaceHolder(@hib SurfaceHolder surfaceHolder) {
        this.f14718Y0.clearVideoSurfaceHolder(surfaceHolder);
    }

    @Override // p000.lzc
    public void clearVideoSurfaceView(@hib SurfaceView surfaceView) {
        this.f14718Y0.clearVideoSurfaceView(surfaceView);
    }

    @Override // p000.lzc
    public void clearVideoTextureView(@hib TextureView textureView) {
        this.f14718Y0.clearVideoTextureView(textureView);
    }

    @Override // p000.lzc
    @Deprecated
    public void decreaseDeviceVolume() {
        this.f14718Y0.decreaseDeviceVolume();
    }

    @Override // p000.lzc
    public Looper getApplicationLooper() {
        return this.f14718Y0.getApplicationLooper();
    }

    @Override // p000.lzc
    public yc0 getAudioAttributes() {
        return this.f14718Y0.getAudioAttributes();
    }

    @Override // p000.lzc
    public lzc.C9045c getAvailableCommands() {
        return this.f14718Y0.getAvailableCommands();
    }

    @Override // p000.lzc
    public int getBufferedPercentage() {
        return this.f14718Y0.getBufferedPercentage();
    }

    @Override // p000.lzc
    public long getBufferedPosition() {
        return this.f14718Y0.getBufferedPosition();
    }

    @Override // p000.lzc
    public long getContentBufferedPosition() {
        return this.f14718Y0.getContentBufferedPosition();
    }

    @Override // p000.lzc
    public long getContentDuration() {
        return this.f14718Y0.getContentDuration();
    }

    @Override // p000.lzc
    public long getContentPosition() {
        return this.f14718Y0.getContentPosition();
    }

    @Override // p000.lzc
    public int getCurrentAdGroupIndex() {
        return this.f14718Y0.getCurrentAdGroupIndex();
    }

    @Override // p000.lzc
    public int getCurrentAdIndexInAdGroup() {
        return this.f14718Y0.getCurrentAdIndexInAdGroup();
    }

    @Override // p000.lzc
    public y93 getCurrentCues() {
        return this.f14718Y0.getCurrentCues();
    }

    @Override // p000.lzc
    public long getCurrentLiveOffset() {
        return this.f14718Y0.getCurrentLiveOffset();
    }

    @Override // p000.lzc
    @hib
    public Object getCurrentManifest() {
        return this.f14718Y0.getCurrentManifest();
    }

    @Override // p000.lzc
    @hib
    public aga getCurrentMediaItem() {
        return this.f14718Y0.getCurrentMediaItem();
    }

    @Override // p000.lzc
    public int getCurrentMediaItemIndex() {
        return this.f14718Y0.getCurrentMediaItemIndex();
    }

    @Override // p000.lzc
    public int getCurrentPeriodIndex() {
        return this.f14718Y0.getCurrentPeriodIndex();
    }

    @Override // p000.lzc
    public long getCurrentPosition() {
        return this.f14718Y0.getCurrentPosition();
    }

    @Override // p000.lzc
    public t1h getCurrentTimeline() {
        return this.f14718Y0.getCurrentTimeline();
    }

    @Override // p000.lzc
    public y7h getCurrentTracks() {
        return this.f14718Y0.getCurrentTracks();
    }

    @Override // p000.lzc
    @Deprecated
    public int getCurrentWindowIndex() {
        return this.f14718Y0.getCurrentWindowIndex();
    }

    @Override // p000.lzc
    public p84 getDeviceInfo() {
        return this.f14718Y0.getDeviceInfo();
    }

    @Override // p000.lzc
    public int getDeviceVolume() {
        return this.f14718Y0.getDeviceVolume();
    }

    @Override // p000.lzc
    public long getDuration() {
        return this.f14718Y0.getDuration();
    }

    @Override // p000.lzc
    public long getMaxSeekToPreviousPosition() {
        return this.f14718Y0.getMaxSeekToPreviousPosition();
    }

    @Override // p000.lzc
    public aga getMediaItemAt(int i) {
        return this.f14718Y0.getMediaItemAt(i);
    }

    @Override // p000.lzc
    public int getMediaItemCount() {
        return this.f14718Y0.getMediaItemCount();
    }

    @Override // p000.lzc
    public iga getMediaMetadata() {
        return this.f14718Y0.getMediaMetadata();
    }

    @Override // p000.lzc
    public int getNextMediaItemIndex() {
        return this.f14718Y0.getNextMediaItemIndex();
    }

    @Override // p000.lzc
    @Deprecated
    public int getNextWindowIndex() {
        return this.f14718Y0.getNextWindowIndex();
    }

    @Override // p000.lzc
    public boolean getPlayWhenReady() {
        return this.f14718Y0.getPlayWhenReady();
    }

    @Override // p000.lzc
    public qyc getPlaybackParameters() {
        return this.f14718Y0.getPlaybackParameters();
    }

    @Override // p000.lzc
    public int getPlaybackState() {
        return this.f14718Y0.getPlaybackState();
    }

    @Override // p000.lzc
    public int getPlaybackSuppressionReason() {
        return this.f14718Y0.getPlaybackSuppressionReason();
    }

    @Override // p000.lzc
    @hib
    public lyc getPlayerError() {
        return this.f14718Y0.getPlayerError();
    }

    @Override // p000.lzc
    public iga getPlaylistMetadata() {
        return this.f14718Y0.getPlaylistMetadata();
    }

    @Override // p000.lzc
    public int getPreviousMediaItemIndex() {
        return this.f14718Y0.getPreviousMediaItemIndex();
    }

    @Override // p000.lzc
    @Deprecated
    public int getPreviousWindowIndex() {
        return this.f14718Y0.getPreviousWindowIndex();
    }

    @Override // p000.lzc
    public int getRepeatMode() {
        return this.f14718Y0.getRepeatMode();
    }

    @Override // p000.lzc
    public long getSeekBackIncrement() {
        return this.f14718Y0.getSeekBackIncrement();
    }

    @Override // p000.lzc
    public long getSeekForwardIncrement() {
        return this.f14718Y0.getSeekForwardIncrement();
    }

    @Override // p000.lzc
    public boolean getShuffleModeEnabled() {
        return this.f14718Y0.getShuffleModeEnabled();
    }

    @Override // p000.lzc
    public ypf getSurfaceSize() {
        return this.f14718Y0.getSurfaceSize();
    }

    @Override // p000.lzc
    public long getTotalBufferedDuration() {
        return this.f14718Y0.getTotalBufferedDuration();
    }

    @Override // p000.lzc
    public j7h getTrackSelectionParameters() {
        return this.f14718Y0.getTrackSelectionParameters();
    }

    @Override // p000.lzc
    public z7i getVideoSize() {
        return this.f14718Y0.getVideoSize();
    }

    @Override // p000.lzc
    public float getVolume() {
        return this.f14718Y0.getVolume();
    }

    public lzc getWrappedPlayer() {
        return this.f14718Y0;
    }

    @Override // p000.lzc
    @Deprecated
    public boolean hasNext() {
        return this.f14718Y0.hasNext();
    }

    @Override // p000.lzc
    public boolean hasNextMediaItem() {
        return this.f14718Y0.hasNextMediaItem();
    }

    @Override // p000.lzc
    @Deprecated
    public boolean hasNextWindow() {
        return this.f14718Y0.hasNextWindow();
    }

    @Override // p000.lzc
    @Deprecated
    public boolean hasPrevious() {
        return this.f14718Y0.hasPrevious();
    }

    @Override // p000.lzc
    public boolean hasPreviousMediaItem() {
        return this.f14718Y0.hasPreviousMediaItem();
    }

    @Override // p000.lzc
    @Deprecated
    public boolean hasPreviousWindow() {
        return this.f14718Y0.hasPreviousWindow();
    }

    @Override // p000.lzc
    @Deprecated
    public void increaseDeviceVolume() {
        this.f14718Y0.increaseDeviceVolume();
    }

    @Override // p000.lzc
    public boolean isCommandAvailable(int i) {
        return this.f14718Y0.isCommandAvailable(i);
    }

    @Override // p000.lzc
    public boolean isCurrentMediaItemDynamic() {
        return this.f14718Y0.isCurrentMediaItemDynamic();
    }

    @Override // p000.lzc
    public boolean isCurrentMediaItemLive() {
        return this.f14718Y0.isCurrentMediaItemLive();
    }

    @Override // p000.lzc
    public boolean isCurrentMediaItemSeekable() {
        return this.f14718Y0.isCurrentMediaItemSeekable();
    }

    @Override // p000.lzc
    @Deprecated
    public boolean isCurrentWindowDynamic() {
        return this.f14718Y0.isCurrentWindowDynamic();
    }

    @Override // p000.lzc
    @Deprecated
    public boolean isCurrentWindowLive() {
        return this.f14718Y0.isCurrentWindowLive();
    }

    @Override // p000.lzc
    @Deprecated
    public boolean isCurrentWindowSeekable() {
        return this.f14718Y0.isCurrentWindowSeekable();
    }

    @Override // p000.lzc
    public boolean isDeviceMuted() {
        return this.f14718Y0.isDeviceMuted();
    }

    @Override // p000.lzc
    public boolean isLoading() {
        return this.f14718Y0.isLoading();
    }

    @Override // p000.lzc
    public boolean isPlaying() {
        return this.f14718Y0.isPlaying();
    }

    @Override // p000.lzc
    public boolean isPlayingAd() {
        return this.f14718Y0.isPlayingAd();
    }

    @Override // p000.lzc
    public void moveMediaItem(int i, int i2) {
        this.f14718Y0.moveMediaItem(i, i2);
    }

    @Override // p000.lzc
    public void moveMediaItems(int i, int i2, int i3) {
        this.f14718Y0.moveMediaItems(i, i2, i3);
    }

    @Override // p000.lzc
    @Deprecated
    public void next() {
        this.f14718Y0.next();
    }

    @Override // p000.lzc
    public void pause() {
        this.f14718Y0.pause();
    }

    @Override // p000.lzc
    public void play() {
        this.f14718Y0.play();
    }

    @Override // p000.lzc
    public void prepare() {
        this.f14718Y0.prepare();
    }

    @Override // p000.lzc
    @Deprecated
    public void previous() {
        this.f14718Y0.previous();
    }

    @Override // p000.lzc
    public void release() {
        this.f14718Y0.release();
    }

    @Override // p000.lzc
    public void removeListener(lzc.InterfaceC9049g interfaceC9049g) {
        this.f14718Y0.removeListener(new C2045a(this, interfaceC9049g));
    }

    @Override // p000.lzc
    public void removeMediaItem(int i) {
        this.f14718Y0.removeMediaItem(i);
    }

    @Override // p000.lzc
    public void removeMediaItems(int i, int i2) {
        this.f14718Y0.removeMediaItems(i, i2);
    }

    @Override // p000.lzc
    public void replaceMediaItem(int i, aga agaVar) {
        this.f14718Y0.replaceMediaItem(i, agaVar);
    }

    @Override // p000.lzc
    public void replaceMediaItems(int i, int i2, List<aga> list) {
        this.f14718Y0.replaceMediaItems(i, i2, list);
    }

    @Override // p000.lzc
    public void seekBack() {
        this.f14718Y0.seekBack();
    }

    @Override // p000.lzc
    public void seekForward() {
        this.f14718Y0.seekForward();
    }

    @Override // p000.lzc
    public void seekTo(long j) {
        this.f14718Y0.seekTo(j);
    }

    @Override // p000.lzc
    public void seekToDefaultPosition() {
        this.f14718Y0.seekToDefaultPosition();
    }

    @Override // p000.lzc
    public void seekToNext() {
        this.f14718Y0.seekToNext();
    }

    @Override // p000.lzc
    public void seekToNextMediaItem() {
        this.f14718Y0.seekToNextMediaItem();
    }

    @Override // p000.lzc
    @Deprecated
    public void seekToNextWindow() {
        this.f14718Y0.seekToNextWindow();
    }

    @Override // p000.lzc
    public void seekToPrevious() {
        this.f14718Y0.seekToPrevious();
    }

    @Override // p000.lzc
    public void seekToPreviousMediaItem() {
        this.f14718Y0.seekToPreviousMediaItem();
    }

    @Override // p000.lzc
    @Deprecated
    public void seekToPreviousWindow() {
        this.f14718Y0.seekToPreviousWindow();
    }

    @Override // p000.lzc
    @Deprecated
    public void setDeviceMuted(boolean z) {
        this.f14718Y0.setDeviceMuted(z);
    }

    @Override // p000.lzc
    @Deprecated
    public void setDeviceVolume(int i) {
        this.f14718Y0.setDeviceVolume(i);
    }

    @Override // p000.lzc
    public void setMediaItem(aga agaVar) {
        this.f14718Y0.setMediaItem(agaVar);
    }

    @Override // p000.lzc
    public void setMediaItems(List<aga> list) {
        this.f14718Y0.setMediaItems(list);
    }

    @Override // p000.lzc
    public void setPlayWhenReady(boolean z) {
        this.f14718Y0.setPlayWhenReady(z);
    }

    @Override // p000.lzc
    public void setPlaybackParameters(qyc qycVar) {
        this.f14718Y0.setPlaybackParameters(qycVar);
    }

    @Override // p000.lzc
    public void setPlaybackSpeed(float f) {
        this.f14718Y0.setPlaybackSpeed(f);
    }

    @Override // p000.lzc
    public void setPlaylistMetadata(iga igaVar) {
        this.f14718Y0.setPlaylistMetadata(igaVar);
    }

    @Override // p000.lzc
    public void setRepeatMode(int i) {
        this.f14718Y0.setRepeatMode(i);
    }

    @Override // p000.lzc
    public void setShuffleModeEnabled(boolean z) {
        this.f14718Y0.setShuffleModeEnabled(z);
    }

    @Override // p000.lzc
    public void setTrackSelectionParameters(j7h j7hVar) {
        this.f14718Y0.setTrackSelectionParameters(j7hVar);
    }

    @Override // p000.lzc
    public void setVideoSurface(@hib Surface surface) {
        this.f14718Y0.setVideoSurface(surface);
    }

    @Override // p000.lzc
    public void setVideoSurfaceHolder(@hib SurfaceHolder surfaceHolder) {
        this.f14718Y0.setVideoSurfaceHolder(surfaceHolder);
    }

    @Override // p000.lzc
    public void setVideoSurfaceView(@hib SurfaceView surfaceView) {
        this.f14718Y0.setVideoSurfaceView(surfaceView);
    }

    @Override // p000.lzc
    public void setVideoTextureView(@hib TextureView textureView) {
        this.f14718Y0.setVideoTextureView(textureView);
    }

    @Override // p000.lzc
    public void setVolume(float f) {
        this.f14718Y0.setVolume(f);
    }

    @Override // p000.lzc
    public void stop() {
        this.f14718Y0.stop();
    }

    @Override // p000.lzc
    public void addMediaItem(int i, aga agaVar) {
        this.f14718Y0.addMediaItem(i, agaVar);
    }

    @Override // p000.lzc
    public void addMediaItems(int i, List<aga> list) {
        this.f14718Y0.addMediaItems(i, list);
    }

    @Override // p000.lzc
    public void clearVideoSurface(@hib Surface surface) {
        this.f14718Y0.clearVideoSurface(surface);
    }

    @Override // p000.lzc
    public void decreaseDeviceVolume(int i) {
        this.f14718Y0.decreaseDeviceVolume(i);
    }

    @Override // p000.lzc
    public void increaseDeviceVolume(int i) {
        this.f14718Y0.increaseDeviceVolume(i);
    }

    @Override // p000.lzc
    public void seekTo(int i, long j) {
        this.f14718Y0.seekTo(i, j);
    }

    @Override // p000.lzc
    public void seekToDefaultPosition(int i) {
        this.f14718Y0.seekToDefaultPosition(i);
    }

    @Override // p000.lzc
    public void setDeviceMuted(boolean z, int i) {
        this.f14718Y0.setDeviceMuted(z, i);
    }

    @Override // p000.lzc
    public void setDeviceVolume(int i, int i2) {
        this.f14718Y0.setDeviceVolume(i, i2);
    }

    @Override // p000.lzc
    public void setMediaItem(aga agaVar, long j) {
        this.f14718Y0.setMediaItem(agaVar, j);
    }

    @Override // p000.lzc
    public void setMediaItems(List<aga> list, boolean z) {
        this.f14718Y0.setMediaItems(list, z);
    }

    @Override // p000.lzc
    public void setMediaItem(aga agaVar, boolean z) {
        this.f14718Y0.setMediaItem(agaVar, z);
    }

    @Override // p000.lzc
    public void setMediaItems(List<aga> list, int i, long j) {
        this.f14718Y0.setMediaItems(list, i, j);
    }
}
