package p000;

import java.util.List;
import p000.q1h;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class bt0 implements izc {

    /* JADX INFO: renamed from: c1 */
    public final q1h.C11272d f14707c1 = new q1h.C11272d();

    private int getRepeatModeForNavigation() {
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            return 0;
        }
        return repeatMode;
    }

    private void ignoreSeek(int i) {
        mo1848a(-1, -9223372036854775807L, i, false);
    }

    private void repeatCurrentMediaItem(int i) {
        mo1848a(getCurrentMediaItemIndex(), -9223372036854775807L, i, true);
    }

    private void seekToCurrentItem(long j, int i) {
        mo1848a(getCurrentMediaItemIndex(), j, i, false);
    }

    private void seekToDefaultPositionInternal(int i, int i2) {
        mo1848a(i, -9223372036854775807L, i2, false);
    }

    private void seekToNextMediaItemInternal(int i) {
        int nextMediaItemIndex = getNextMediaItemIndex();
        if (nextMediaItemIndex == -1) {
            ignoreSeek(i);
        } else if (nextMediaItemIndex == getCurrentMediaItemIndex()) {
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
            ignoreSeek(i);
        } else if (previousMediaItemIndex == getCurrentMediaItemIndex()) {
            repeatCurrentMediaItem(i);
        } else {
            seekToDefaultPositionInternal(previousMediaItemIndex, i);
        }
    }

    @vp6
    /* JADX INFO: renamed from: a */
    public abstract void mo1848a(int i, long j, int i2, boolean z);

    @Override // p000.izc
    public final void addMediaItem(int i, nfa nfaVar) {
        addMediaItems(i, kx7.m15111of(nfaVar));
    }

    @Override // p000.izc
    public final void addMediaItems(List<nfa> list) {
        addMediaItems(Integer.MAX_VALUE, list);
    }

    @Override // p000.izc
    public final boolean canAdvertiseSession() {
        return true;
    }

    @Override // p000.izc
    public final void clearMediaItems() {
        removeMediaItems(0, Integer.MAX_VALUE);
    }

    @Override // p000.izc
    public final int getBufferedPercentage() {
        long bufferedPosition = getBufferedPosition();
        long duration = getDuration();
        if (bufferedPosition == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return t0i.constrainValue(t0i.percentInt(bufferedPosition, duration), 0, 100);
    }

    @Override // p000.izc
    public final long getContentDuration() {
        q1h currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -9223372036854775807L;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f14707c1).getDurationMs();
    }

    @Override // p000.izc
    public final long getCurrentLiveOffset() {
        q1h currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty() || currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f14707c1).f72976f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (this.f14707c1.getCurrentUnixTimeMs() - this.f14707c1.f72976f) - getContentPosition();
    }

    @Override // p000.izc
    @hib
    public final Object getCurrentManifest() {
        q1h currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f14707c1).f72974d;
    }

    @Override // p000.izc
    @hib
    public final nfa getCurrentMediaItem() {
        q1h currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f14707c1).f72973c;
    }

    @Override // p000.izc
    @Deprecated
    public final int getCurrentWindowIndex() {
        return getCurrentMediaItemIndex();
    }

    @Override // p000.izc
    public final nfa getMediaItemAt(int i) {
        return getCurrentTimeline().getWindow(i, this.f14707c1).f72973c;
    }

    @Override // p000.izc
    public final int getMediaItemCount() {
        return getCurrentTimeline().getWindowCount();
    }

    @Override // p000.izc
    public final int getNextMediaItemIndex() {
        q1h currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -1;
        }
        return currentTimeline.getNextWindowIndex(getCurrentMediaItemIndex(), getRepeatModeForNavigation(), getShuffleModeEnabled());
    }

    @Override // p000.izc
    @Deprecated
    public final int getNextWindowIndex() {
        return getNextMediaItemIndex();
    }

    @Override // p000.izc
    public final int getPreviousMediaItemIndex() {
        q1h currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -1;
        }
        return currentTimeline.getPreviousWindowIndex(getCurrentMediaItemIndex(), getRepeatModeForNavigation(), getShuffleModeEnabled());
    }

    @Override // p000.izc
    @Deprecated
    public final int getPreviousWindowIndex() {
        return getPreviousMediaItemIndex();
    }

    @Override // p000.izc
    public final boolean hasNextMediaItem() {
        return getNextMediaItemIndex() != -1;
    }

    @Override // p000.izc
    public final boolean hasPreviousMediaItem() {
        return getPreviousMediaItemIndex() != -1;
    }

    @Override // p000.izc
    public final boolean isCommandAvailable(int i) {
        return getAvailableCommands().contains(i);
    }

    @Override // p000.izc
    public final boolean isCurrentMediaItemDynamic() {
        q1h currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f14707c1).f72979i;
    }

    @Override // p000.izc
    public final boolean isCurrentMediaItemLive() {
        q1h currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f14707c1).isLive();
    }

    @Override // p000.izc
    public final boolean isCurrentMediaItemSeekable() {
        q1h currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f14707c1).f72978h;
    }

    @Override // p000.izc
    @Deprecated
    public final boolean isCurrentWindowDynamic() {
        return isCurrentMediaItemDynamic();
    }

    @Override // p000.izc
    @Deprecated
    public final boolean isCurrentWindowLive() {
        return isCurrentMediaItemLive();
    }

    @Override // p000.izc
    @Deprecated
    public final boolean isCurrentWindowSeekable() {
        return isCurrentMediaItemSeekable();
    }

    @Override // p000.izc
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && getPlayWhenReady() && getPlaybackSuppressionReason() == 0;
    }

    @Override // p000.izc
    public final void moveMediaItem(int i, int i2) {
        if (i != i2) {
            moveMediaItems(i, i + 1, i2);
        }
    }

    @Override // p000.izc
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // p000.izc
    public final void play() {
        setPlayWhenReady(true);
    }

    @Override // p000.izc
    public final void removeMediaItem(int i) {
        removeMediaItems(i, i + 1);
    }

    @Override // p000.izc
    public final void replaceMediaItem(int i, nfa nfaVar) {
        replaceMediaItems(i, i + 1, kx7.m15111of(nfaVar));
    }

    @Override // p000.izc
    public final void seekBack() {
        seekToOffset(-getSeekBackIncrement(), 11);
    }

    @Override // p000.izc
    public final void seekForward() {
        seekToOffset(getSeekForwardIncrement(), 12);
    }

    @Override // p000.izc
    public final void seekTo(long j) {
        seekToCurrentItem(j, 5);
    }

    @Override // p000.izc
    public final void seekToDefaultPosition() {
        seekToDefaultPositionInternal(getCurrentMediaItemIndex(), 4);
    }

    @Override // p000.izc
    public final void seekToNext() {
        if (getCurrentTimeline().isEmpty() || isPlayingAd()) {
            ignoreSeek(9);
            return;
        }
        if (hasNextMediaItem()) {
            seekToNextMediaItemInternal(9);
        } else if (isCurrentMediaItemLive() && isCurrentMediaItemDynamic()) {
            seekToDefaultPositionInternal(getCurrentMediaItemIndex(), 9);
        } else {
            ignoreSeek(9);
        }
    }

    @Override // p000.izc
    public final void seekToNextMediaItem() {
        seekToNextMediaItemInternal(8);
    }

    @Override // p000.izc
    public final void seekToPrevious() {
        if (getCurrentTimeline().isEmpty() || isPlayingAd()) {
            ignoreSeek(7);
            return;
        }
        boolean zHasPreviousMediaItem = hasPreviousMediaItem();
        if (isCurrentMediaItemLive() && !isCurrentMediaItemSeekable()) {
            if (zHasPreviousMediaItem) {
                seekToPreviousMediaItemInternal(7);
                return;
            } else {
                ignoreSeek(7);
                return;
            }
        }
        if (!zHasPreviousMediaItem || getCurrentPosition() > getMaxSeekToPreviousPosition()) {
            seekToCurrentItem(0L, 7);
        } else {
            seekToPreviousMediaItemInternal(7);
        }
    }

    @Override // p000.izc
    public final void seekToPreviousMediaItem() {
        seekToPreviousMediaItemInternal(6);
    }

    @Override // p000.izc
    public final void setMediaItem(nfa nfaVar) {
        setMediaItems(kx7.m15111of(nfaVar));
    }

    @Override // p000.izc
    public final void setMediaItems(List<nfa> list) {
        setMediaItems(list, true);
    }

    @Override // p000.izc
    public final void setPlaybackSpeed(float f) {
        setPlaybackParameters(getPlaybackParameters().withSpeed(f));
    }

    @Override // p000.izc
    public final void addMediaItem(nfa nfaVar) {
        addMediaItems(kx7.m15111of(nfaVar));
    }

    @Override // p000.izc
    public final void seekTo(int i, long j) {
        mo1848a(i, j, 10, false);
    }

    @Override // p000.izc
    public final void setMediaItem(nfa nfaVar, long j) {
        setMediaItems(kx7.m15111of(nfaVar), 0, j);
    }

    @Override // p000.izc
    public final void seekToDefaultPosition(int i) {
        seekToDefaultPositionInternal(i, 10);
    }

    @Override // p000.izc
    public final void setMediaItem(nfa nfaVar, boolean z) {
        setMediaItems(kx7.m15111of(nfaVar), z);
    }
}
