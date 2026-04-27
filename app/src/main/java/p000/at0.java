package p000;

import java.util.List;
import p000.t1h;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class at0 implements lzc {

    /* JADX INFO: renamed from: Y0 */
    public final t1h.C12851d f11826Y0 = new t1h.C12851d();

    private int getRepeatModeForNavigation() {
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            return 0;
        }
        return repeatMode;
    }

    private void repeatCurrentMediaItem(int i) {
        seekTo(getCurrentMediaItemIndex(), -9223372036854775807L, i, true);
    }

    private void seekToCurrentItem(long j, int i) {
        seekTo(getCurrentMediaItemIndex(), j, i, false);
    }

    private void seekToDefaultPositionInternal(int i, int i2) {
        seekTo(i, -9223372036854775807L, i2, false);
    }

    private void seekToNextMediaItemInternal(int i) {
        int nextMediaItemIndex = getNextMediaItemIndex();
        if (nextMediaItemIndex == -1) {
            return;
        }
        if (nextMediaItemIndex == getCurrentMediaItemIndex()) {
            repeatCurrentMediaItem(i);
        } else {
            seekToDefaultPositionInternal(nextMediaItemIndex, i);
        }
    }

    private void seekToOffset(long j, int i) {
        long currentPosition = getCurrentPosition() + j;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        seekToCurrentItem(Math.max(currentPosition, 0L), i);
    }

    private void seekToPreviousMediaItemInternal(int i) {
        int previousMediaItemIndex = getPreviousMediaItemIndex();
        if (previousMediaItemIndex == -1) {
            return;
        }
        if (previousMediaItemIndex == getCurrentMediaItemIndex()) {
            repeatCurrentMediaItem(i);
        } else {
            seekToDefaultPositionInternal(previousMediaItemIndex, i);
        }
    }

    @Override // p000.lzc
    public final void addMediaItem(int i, aga agaVar) {
        addMediaItems(i, kx7.m15111of(agaVar));
    }

    @Override // p000.lzc
    public final void addMediaItems(List<aga> list) {
        addMediaItems(Integer.MAX_VALUE, list);
    }

    @Override // p000.lzc
    public final boolean canAdvertiseSession() {
        return true;
    }

    @Override // p000.lzc
    public final void clearMediaItems() {
        removeMediaItems(0, Integer.MAX_VALUE);
    }

    @Override // p000.lzc
    public final int getBufferedPercentage() {
        long bufferedPosition = getBufferedPosition();
        long duration = getDuration();
        if (bufferedPosition == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return x0i.constrainValue((int) ((bufferedPosition * 100) / duration), 0, 100);
    }

    @Override // p000.lzc
    public final long getContentDuration() {
        t1h currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -9223372036854775807L;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f11826Y0).getDurationMs();
    }

    @Override // p000.lzc
    public final long getCurrentLiveOffset() {
        t1h currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty() || currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f11826Y0).f83439f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (this.f11826Y0.getCurrentUnixTimeMs() - this.f11826Y0.f83439f) - getContentPosition();
    }

    @Override // p000.lzc
    @hib
    public final Object getCurrentManifest() {
        t1h currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f11826Y0).f83437d;
    }

    @Override // p000.lzc
    @hib
    public final aga getCurrentMediaItem() {
        t1h currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f11826Y0).f83436c;
    }

    @Override // p000.lzc
    @Deprecated
    public final int getCurrentWindowIndex() {
        return getCurrentMediaItemIndex();
    }

    @Override // p000.lzc
    public final aga getMediaItemAt(int i) {
        return getCurrentTimeline().getWindow(i, this.f11826Y0).f83436c;
    }

    @Override // p000.lzc
    public final int getMediaItemCount() {
        return getCurrentTimeline().getWindowCount();
    }

    @Override // p000.lzc
    public final int getNextMediaItemIndex() {
        t1h currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -1;
        }
        return currentTimeline.getNextWindowIndex(getCurrentMediaItemIndex(), getRepeatModeForNavigation(), getShuffleModeEnabled());
    }

    @Override // p000.lzc
    @Deprecated
    public final int getNextWindowIndex() {
        return getNextMediaItemIndex();
    }

    @Override // p000.lzc
    public final int getPreviousMediaItemIndex() {
        t1h currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -1;
        }
        return currentTimeline.getPreviousWindowIndex(getCurrentMediaItemIndex(), getRepeatModeForNavigation(), getShuffleModeEnabled());
    }

    @Override // p000.lzc
    @Deprecated
    public final int getPreviousWindowIndex() {
        return getPreviousMediaItemIndex();
    }

    @Override // p000.lzc
    @Deprecated
    public final boolean hasNext() {
        return hasNextMediaItem();
    }

    @Override // p000.lzc
    public final boolean hasNextMediaItem() {
        return getNextMediaItemIndex() != -1;
    }

    @Override // p000.lzc
    @Deprecated
    public final boolean hasNextWindow() {
        return hasNextMediaItem();
    }

    @Override // p000.lzc
    @Deprecated
    public final boolean hasPrevious() {
        return hasPreviousMediaItem();
    }

    @Override // p000.lzc
    public final boolean hasPreviousMediaItem() {
        return getPreviousMediaItemIndex() != -1;
    }

    @Override // p000.lzc
    @Deprecated
    public final boolean hasPreviousWindow() {
        return hasPreviousMediaItem();
    }

    @Override // p000.lzc
    public final boolean isCommandAvailable(int i) {
        return getAvailableCommands().contains(i);
    }

    @Override // p000.lzc
    public final boolean isCurrentMediaItemDynamic() {
        t1h currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f11826Y0).f83425F;
    }

    @Override // p000.lzc
    public final boolean isCurrentMediaItemLive() {
        t1h currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f11826Y0).isLive();
    }

    @Override // p000.lzc
    public final boolean isCurrentMediaItemSeekable() {
        t1h currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f11826Y0).f83424C;
    }

    @Override // p000.lzc
    @Deprecated
    public final boolean isCurrentWindowDynamic() {
        return isCurrentMediaItemDynamic();
    }

    @Override // p000.lzc
    @Deprecated
    public final boolean isCurrentWindowLive() {
        return isCurrentMediaItemLive();
    }

    @Override // p000.lzc
    @Deprecated
    public final boolean isCurrentWindowSeekable() {
        return isCurrentMediaItemSeekable();
    }

    @Override // p000.lzc
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && getPlayWhenReady() && getPlaybackSuppressionReason() == 0;
    }

    @Override // p000.lzc
    public final void moveMediaItem(int i, int i2) {
        if (i != i2) {
            moveMediaItems(i, i + 1, i2);
        }
    }

    @Override // p000.lzc
    @Deprecated
    public final void next() {
        seekToNextMediaItem();
    }

    @Override // p000.lzc
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // p000.lzc
    public final void play() {
        setPlayWhenReady(true);
    }

    @Override // p000.lzc
    @Deprecated
    public final void previous() {
        seekToPreviousMediaItem();
    }

    @Override // p000.lzc
    public final void removeMediaItem(int i) {
        removeMediaItems(i, i + 1);
    }

    @Override // p000.lzc
    public final void replaceMediaItem(int i, aga agaVar) {
        replaceMediaItems(i, i + 1, kx7.m15111of(agaVar));
    }

    @Override // p000.lzc
    public final void seekBack() {
        seekToOffset(-getSeekBackIncrement(), 11);
    }

    @Override // p000.lzc
    public final void seekForward() {
        seekToOffset(getSeekForwardIncrement(), 12);
    }

    @fdi(otherwise = 4)
    public abstract void seekTo(int i, long j, int i2, boolean z);

    @Override // p000.lzc
    public final void seekTo(long j) {
        seekToCurrentItem(j, 5);
    }

    @Override // p000.lzc
    public final void seekToDefaultPosition() {
        seekToDefaultPositionInternal(getCurrentMediaItemIndex(), 4);
    }

    @Override // p000.lzc
    public final void seekToNext() {
        if (getCurrentTimeline().isEmpty() || isPlayingAd()) {
            return;
        }
        if (hasNextMediaItem()) {
            seekToNextMediaItemInternal(9);
        } else if (isCurrentMediaItemLive() && isCurrentMediaItemDynamic()) {
            seekToDefaultPositionInternal(getCurrentMediaItemIndex(), 9);
        }
    }

    @Override // p000.lzc
    public final void seekToNextMediaItem() {
        seekToNextMediaItemInternal(8);
    }

    @Override // p000.lzc
    @Deprecated
    public final void seekToNextWindow() {
        seekToNextMediaItem();
    }

    @Override // p000.lzc
    public final void seekToPrevious() {
        if (getCurrentTimeline().isEmpty() || isPlayingAd()) {
            return;
        }
        boolean zHasPreviousMediaItem = hasPreviousMediaItem();
        if (isCurrentMediaItemLive() && !isCurrentMediaItemSeekable()) {
            if (zHasPreviousMediaItem) {
                seekToPreviousMediaItemInternal(7);
            }
        } else if (!zHasPreviousMediaItem || getCurrentPosition() > getMaxSeekToPreviousPosition()) {
            seekToCurrentItem(0L, 7);
        } else {
            seekToPreviousMediaItemInternal(7);
        }
    }

    @Override // p000.lzc
    public final void seekToPreviousMediaItem() {
        seekToPreviousMediaItemInternal(6);
    }

    @Override // p000.lzc
    @Deprecated
    public final void seekToPreviousWindow() {
        seekToPreviousMediaItem();
    }

    @Override // p000.lzc
    public final void setMediaItem(aga agaVar) {
        setMediaItems(kx7.m15111of(agaVar));
    }

    @Override // p000.lzc
    public final void setMediaItems(List<aga> list) {
        setMediaItems(list, true);
    }

    @Override // p000.lzc
    public final void setPlaybackSpeed(float f) {
        setPlaybackParameters(getPlaybackParameters().withSpeed(f));
    }

    @Override // p000.lzc
    public final void addMediaItem(aga agaVar) {
        addMediaItems(kx7.m15111of(agaVar));
    }

    @Override // p000.lzc
    public final void seekTo(int i, long j) {
        seekTo(i, j, 10, false);
    }

    @Override // p000.lzc
    public final void setMediaItem(aga agaVar, long j) {
        setMediaItems(kx7.m15111of(agaVar), 0, j);
    }

    @Override // p000.lzc
    public final void seekToDefaultPosition(int i) {
        seekToDefaultPositionInternal(i, 10);
    }

    @Override // p000.lzc
    public final void setMediaItem(aga agaVar, boolean z) {
        setMediaItems(kx7.m15111of(agaVar), z);
    }
}
