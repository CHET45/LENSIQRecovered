package p000;

import android.media.AudioTrack;
import android.os.HandlerThread;
import android.os.Process;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class le0 extends HandlerThread {

    /* JADX INFO: renamed from: L */
    public static final String f57315L = "AudioPlayerThread";

    /* JADX INFO: renamed from: M */
    public static final int f57316M = 10;

    /* JADX INFO: renamed from: C */
    public final AtomicInteger f57317C;

    /* JADX INFO: renamed from: F */
    public mp7 f57318F;

    /* JADX INFO: renamed from: H */
    public final int f57319H;

    /* JADX INFO: renamed from: a */
    public AudioTrack f57320a;

    /* JADX INFO: renamed from: b */
    public final LinkedBlockingQueue<byte[]> f57321b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f57322c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f57323d;

    /* JADX INFO: renamed from: e */
    public final AtomicInteger f57324e;

    /* JADX INFO: renamed from: f */
    public final AtomicInteger f57325f;

    /* JADX INFO: renamed from: m */
    public final AtomicBoolean f57326m;

    public le0(int i) {
        super(f57315L);
        this.f57321b = new LinkedBlockingQueue<>();
        this.f57322c = new AtomicBoolean(true);
        this.f57323d = new AtomicBoolean(false);
        this.f57324e = new AtomicInteger(0);
        this.f57325f = new AtomicInteger(0);
        this.f57326m = new AtomicBoolean(false);
        this.f57317C = new AtomicInteger(0);
        this.f57319H = i;
        Process.setThreadPriority(-16);
    }

    private boolean processNextAudioData() {
        try {
            if (this.f57321b.isEmpty()) {
                return true;
            }
            byte[] bArrPoll = this.f57321b.poll(50L, TimeUnit.MILLISECONDS);
            int iDecrementAndGet = this.f57317C.decrementAndGet() + this.f57325f.get();
            if (this.f57318F != null && this.f57326m.get() && iDecrementAndGet == 0) {
                this.f57318F.audioPlayEnd();
                this.f57317C.set(0);
                this.f57325f.set(0);
                this.f57326m.set(false);
            }
            if (bArrPoll != null && bArrPoll.length != 0) {
                ji9.m14109e(f57315L, "processNextAudioData: " + this.f57320a.write(bArrPoll, 0, bArrPoll.length) + pl8.f71328a + bArrPoll.length);
            }
            return true;
        } catch (InterruptedException unused) {
            this.f57322c.set(false);
        } catch (Exception e) {
            ji9.m14109e(f57315L, "Error processing audio data: " + e.getMessage());
            this.f57324e.incrementAndGet();
        }
        return false;
    }

    private void releaseResources() {
        AudioTrack audioTrack = this.f57320a;
        if (audioTrack != null) {
            try {
                if (audioTrack.getState() == 1) {
                    this.f57320a.stop();
                    this.f57320a.release();
                }
            } catch (Exception e) {
                ji9.m14109e(f57315L, "Error releasing AudioTrack: " + e.getMessage());
            }
            this.f57320a = null;
        }
    }

    private void sleepWhilePaused() {
        try {
            Thread.sleep(50L);
        } catch (InterruptedException unused) {
            this.f57322c.set(false);
        }
    }

    public void addAudioData(byte[] bArr) {
        if (!this.f57322c.get() || bArr == null || bArr.length <= 0) {
            return;
        }
        this.f57321b.offer(bArr);
        this.f57325f.incrementAndGet();
    }

    public void clearAudioQueue() {
        this.f57321b.clear();
        AudioTrack audioTrack = this.f57320a;
        if (audioTrack != null) {
            audioTrack.stop();
            this.f57320a.flush();
            this.f57320a.play();
        }
        this.f57317C.set(0);
        this.f57325f.set(0);
        this.f57326m.set(false);
    }

    public int getErrorCount() {
        return this.f57324e.get();
    }

    public boolean isPlaying() {
        return this.f57322c.get() && !this.f57323d.get();
    }

    public Boolean isSoundPlaying() {
        return Boolean.valueOf(!this.f57321b.isEmpty() && this.f57320a.getPlayState() == 3);
    }

    public void pausePlayback() {
        this.f57323d.set(true);
        AudioTrack audioTrack = this.f57320a;
        if (audioTrack == null || audioTrack.getState() != 1) {
            return;
        }
        try {
            this.f57320a.pause();
        } catch (Exception e) {
            ji9.m14109e(f57315L, "Error pausing playback: " + e.getMessage());
        }
    }

    public void resumePlayback() {
        this.f57323d.set(false);
        AudioTrack audioTrack = this.f57320a;
        if (audioTrack == null || audioTrack.getState() != 1) {
            return;
        }
        try {
            this.f57320a.play();
        } catch (Exception e) {
            ji9.m14109e(f57315L, "Error resuming playback: " + e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.le0.run():void");
    }

    public void setAudioPlayerTime(mp7 mp7Var) {
        this.f57318F = mp7Var;
    }

    public void setIsAudioEnd(boolean z) {
        for (int i = 0; i < 8; i++) {
            addAudioData(new byte[j02.f49207m]);
        }
        this.f57326m.set(z);
    }

    public void setVolume(boolean z) {
        AudioTrack audioTrack = this.f57320a;
        if (audioTrack != null) {
            if (z) {
                audioTrack.setVolume(0.0f);
            } else {
                audioTrack.setVolume(1.0f);
            }
        }
    }

    public void shutdown() {
        this.f57321b.clear();
        this.f57317C.set(0);
        this.f57325f.set(0);
        this.f57326m.set(false);
        this.f57322c.set(false);
        interrupt();
    }
}
