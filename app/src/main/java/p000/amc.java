package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import p000.nud;
import p000.u0b;

/* JADX INFO: loaded from: classes6.dex */
public class amc {

    /* JADX INFO: renamed from: A */
    public static final long f2085A = 86400000;

    /* JADX INFO: renamed from: B */
    public static final long f2086B = 60000;

    /* JADX INFO: renamed from: v */
    public static final String f2087v = "AECRecordManager";

    /* JADX INFO: renamed from: w */
    public static final String f2088w = "mp3";

    /* JADX INFO: renamed from: x */
    public static final String f2089x = "audio_track";

    /* JADX INFO: renamed from: y */
    public static boolean f2090y = false;

    /* JADX INFO: renamed from: z */
    public static final long f2091z = 30000;

    /* JADX INFO: renamed from: a */
    public String f2092a;

    /* JADX INFO: renamed from: b */
    public le0 f2093b;

    /* JADX INFO: renamed from: c */
    public nud f2094c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f2095d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f2096e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f2097f;

    /* JADX INFO: renamed from: g */
    public final AtomicLong f2098g;

    /* JADX INFO: renamed from: h */
    public Handler f2099h;

    /* JADX INFO: renamed from: i */
    public ScheduledExecutorService f2100i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f2101j;

    /* JADX INFO: renamed from: k */
    public u0b f2102k;

    /* JADX INFO: renamed from: l */
    public final AtomicLong f2103l;

    /* JADX INFO: renamed from: m */
    public Context f2104m;

    /* JADX INFO: renamed from: n */
    public final Map<EnumC0331d, Boolean> f2105n;

    /* JADX INFO: renamed from: o */
    public volatile EnumC0331d f2106o;

    /* JADX INFO: renamed from: p */
    public u0b.EnumC13307d f2107p;

    /* JADX INFO: renamed from: q */
    public InterfaceC0330c f2108q;

    /* JADX INFO: renamed from: r */
    public InterfaceC0333f f2109r;

    /* JADX INFO: renamed from: s */
    public int f2110s;

    /* JADX INFO: renamed from: t */
    public final AtomicLong f2111t;

    /* JADX INFO: renamed from: u */
    public final AtomicLong f2112u;

    /* JADX INFO: renamed from: amc$a */
    public class C0328a extends HashMap<EnumC0331d, Boolean> {
        public C0328a() {
            EnumC0331d enumC0331d = EnumC0331d.TRANSLATE;
            Boolean bool = Boolean.TRUE;
            put(enumC0331d, bool);
            put(EnumC0331d.VOICE_CALL, bool);
            EnumC0331d enumC0331d2 = EnumC0331d.BACKGROUND;
            Boolean bool2 = Boolean.FALSE;
            put(enumC0331d2, bool2);
            put(EnumC0331d.DEFAULT, bool2);
        }
    }

    /* JADX INFO: renamed from: amc$b */
    public class CallableC0329b implements Callable<Boolean> {
        public CallableC0329b() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() throws Exception {
            return amc.this.f2102k.isSoundPlaying();
        }
    }

    /* JADX INFO: renamed from: amc$c */
    public interface InterfaceC0330c {
        void onAudioDataAvailable(byte[] bArr);

        void onAudioDataAvailableMain(byte[] bArr);
    }

    /* JADX INFO: renamed from: amc$d */
    public enum EnumC0331d {
        TRANSLATE,
        VOICE_CALL,
        BACKGROUND,
        DEFAULT
    }

    /* JADX INFO: renamed from: amc$e */
    public static class C0332e {

        /* JADX INFO: renamed from: a */
        public static final amc f2120a = new amc(null);

        private C0332e() {
        }
    }

    /* JADX INFO: renamed from: amc$f */
    public interface InterfaceC0333f {
        void onAudioChannelChanged(u0b.EnumC13307d enumC13307d, EnumC0331d enumC0331d);

        void onAutoRecovery(String str, int i);

        void onError(String str, int i);

        void onMp3PlaybackStateChanged(boolean z);

        void onPerformanceMetrics(long j, long j2);

        void onPlaybackStateChanged(boolean z);

        void onRecordingStateChanged(boolean z);
    }

    public /* synthetic */ amc(C0328a c0328a) {
        this();
    }

    @r6c(markerClass = {ovh.class})
    private void applyModuleChannelConfig() {
        if (this.f2102k == null) {
            return;
        }
        Boolean bool = this.f2105n.get(this.f2106o);
        if (bool != null && bool.booleanValue()) {
            this.f2102k.switchToAudioMode(this.f2107p);
            ji9.m14108d(f2087v, "Applied channel config for module " + this.f2106o + ": " + this.f2107p);
            return;
        }
        u0b u0bVar = this.f2102k;
        u0b.EnumC13307d enumC13307d = u0b.EnumC13307d.EARPIECE;
        u0bVar.switchToAudioMode(enumC13307d);
        this.f2107p = enumC13307d;
        ji9.m14108d(f2087v, "Module " + this.f2106o + " channel switch disabled, reset to speaker");
    }

    public static amc getInstance() {
        return C0332e.f2120a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addMp3AudioData$8(byte[] bArr) {
        u0b u0bVar;
        if (!this.f2101j || (u0bVar = this.f2102k) == null || bArr == null || bArr.length <= 0) {
            return;
        }
        u0bVar.addAudioData(bArr);
        this.f2103l.set(System.currentTimeMillis());
        ji9.m14108d(f2087v, "MP3 data added to manager queue");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearMp3AudioQueue$12() {
        ji9.m14110i(f2087v, "Clearing MP3 audio queue");
        u0b u0bVar = this.f2102k;
        if (u0bVar != null) {
            u0bVar.clearAudioQueue(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$monitorPerformance$2(long j) {
        this.f2109r.onPerformanceMetrics(this.f2098g.get(), j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyAutoRecovery$6(String str, int i) {
        this.f2109r.onAutoRecovery(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyError$5(String str, int i) {
        this.f2109r.onError(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyMp3PlaybackStateChanged$13(boolean z) {
        this.f2109r.onMp3PlaybackStateChanged(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyPlaybackStateChanged$4(boolean z) {
        this.f2109r.onPlaybackStateChanged(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyRecordingStateChanged$7(boolean z) {
        this.f2109r.onRecordingStateChanged(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onProcessedAudioData$3(byte[] bArr) {
        this.f2108q.onAudioDataAvailableMain(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pauseMp3Playback$9() {
        u0b u0bVar = this.f2102k;
        if (u0bVar != null) {
            u0bVar.pausePlayback();
            this.f2101j = false;
            notifyMp3PlaybackStateChanged(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resumeMp3Playback$10() {
        u0b u0bVar = this.f2102k;
        if (u0bVar != null) {
            u0bVar.resumePlayback();
            this.f2101j = true;
            notifyMp3PlaybackStateChanged(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startMonitoringTasks$0() {
        try {
            monitorPerformance();
        } catch (Exception e) {
            ji9.m14109e(f2087v, "Performance monitoring error: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startMonitoringTasks$1() {
        try {
            watchdogCheck();
        } catch (Exception e) {
            ji9.m14109e(f2087v, "Watchdog check error: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopMp3Playback$11() {
        u0b u0bVar = this.f2102k;
        if (u0bVar != null) {
            u0bVar.shutdown();
            this.f2102k = null;
            this.f2101j = false;
            notifyMp3PlaybackStateChanged(false);
            ji9.m14110i(f2087v, "MP3 playback stopped");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$switchAudioChannel$14(u0b.EnumC13307d enumC13307d) {
        try {
            this.f2102k.switchToAudioMode(enumC13307d);
            this.f2107p = enumC13307d;
            ji9.m14110i(f2087v, "Audio channel switched to: " + enumC13307d + " (module: " + this.f2106o + c0b.f15434d);
            InterfaceC0333f interfaceC0333f = this.f2109r;
            if (interfaceC0333f != null) {
                interfaceC0333f.onAudioChannelChanged(enumC13307d, this.f2106o);
            }
        } catch (Exception e) {
            ji9.m14109e(f2087v, "Failed to switch audio channel: " + e.getMessage());
            notifyError("Channel switch failed: " + e.getMessage(), 1006);
        }
    }

    private void monitorPerformance() {
        this.f2098g.addAndGet(30000L);
        Runtime runtime = Runtime.getRuntime();
        final long jFreeMemory = runtime.totalMemory() - runtime.freeMemory();
        double dMaxMemory = (jFreeMemory / runtime.maxMemory()) * 100.0d;
        if (this.f2109r != null) {
            this.f2099h.post(new Runnable() { // from class: rlc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f78646a.lambda$monitorPerformance$2(jFreeMemory);
                }
            });
        }
        if (this.f2098g.get() > 86400000) {
            ji9.m14111w(f2087v, "Maximum continuous running time reached, performing soft restart");
            softRestart();
        }
        if (dMaxMemory > 80.0d) {
            ji9.m14111w(f2087v, "High memory usage detected: " + String.format("%.1f", Double.valueOf(dMaxMemory)) + yv7.f103133a);
            System.gc();
        }
    }

    private void notifyAutoRecovery(final String str, final int i) {
        if (this.f2109r != null) {
            this.f2099h.post(new Runnable() { // from class: xlc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f98433a.lambda$notifyAutoRecovery$6(str, i);
                }
            });
        }
    }

    private void notifyError(final String str, final int i) {
        if (this.f2109r != null) {
            this.f2099h.post(new Runnable() { // from class: olc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68082a.lambda$notifyError$5(str, i);
                }
            });
        }
    }

    private void notifyMp3PlaybackStateChanged(final boolean z) {
        if (this.f2109r != null) {
            this.f2099h.post(new Runnable() { // from class: wlc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f94649a.lambda$notifyMp3PlaybackStateChanged$13(z);
                }
            });
        }
    }

    private void notifyPlaybackStateChanged(final boolean z) {
        if (this.f2109r != null) {
            this.f2099h.post(new Runnable() { // from class: tlc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f85269a.lambda$notifyPlaybackStateChanged$4(z);
                }
            });
        }
    }

    private void notifyRecordingStateChanged(final boolean z) {
        if (this.f2109r != null) {
            this.f2099h.post(new Runnable() { // from class: ylc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f102025a.lambda$notifyRecordingStateChanged$7(z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProcessedAudioData(final byte[] bArr) {
        if (this.f2108q == null || bArr == null) {
            return;
        }
        this.f2112u.set(System.currentTimeMillis());
        this.f2099h.post(new Runnable() { // from class: klc
            @Override // java.lang.Runnable
            public final void run() {
                this.f54622a.lambda$onProcessedAudioData$3(bArr);
            }
        });
        this.f2108q.onAudioDataAvailable(bArr);
    }

    private void restartMp3Playback() {
        boolean z = this.f2101j;
        stopMp3Playback();
        if (z) {
            startMp3Playback();
            notifyAutoRecovery("MP3 Playback thread restarted", 2004);
        }
    }

    private void restartPlayback() {
        boolean z = this.f2096e;
        stopPlayback();
        stopMp3Playback();
        if (z) {
            startPlayback();
            notifyAutoRecovery("Playback thread restarted", 2002);
        }
    }

    private void restartRecording() {
        boolean z = this.f2097f;
        stopRecording();
        if (z) {
            startRecording();
            notifyAutoRecovery("Recording thread restarted", 2003);
        }
    }

    private <T> T runOnMainThreadWithResult(Callable<T> callable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            try {
                return callable.call();
            } catch (Exception e) {
                ji9.m14109e(f2087v, "Error executing on main thread: " + e.getMessage());
                return null;
            }
        }
        FutureTask futureTask = new FutureTask(callable);
        this.f2099h.post(futureTask);
        try {
            return (T) futureTask.get(2L, TimeUnit.SECONDS);
        } catch (TimeoutException unused) {
            ji9.m14109e(f2087v, "Timeout waiting for main thread execution");
            return null;
        } catch (Exception e2) {
            ji9.m14109e(f2087v, "Error waiting for main thread execution: " + e2.getMessage());
            return null;
        }
    }

    private void softRestart() {
        boolean z = this.f2096e;
        stopPlayback();
        if (z) {
            startPlayback();
        }
        this.f2098g.set(0L);
        notifyAutoRecovery("Soft restart completed due to long running time", 2001);
    }

    private void startMonitoringTasks() {
        ScheduledExecutorService scheduledExecutorService = this.f2100i;
        Runnable runnable = new Runnable() { // from class: mlc
            @Override // java.lang.Runnable
            public final void run() {
                this.f61427a.lambda$startMonitoringTasks$0();
            }
        };
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        scheduledExecutorService.scheduleWithFixedDelay(runnable, 30000L, 30000L, timeUnit);
        this.f2100i.scheduleWithFixedDelay(new Runnable() { // from class: nlc
            @Override // java.lang.Runnable
            public final void run() {
                this.f64893a.lambda$startMonitoringTasks$1();
            }
        }, 10000L, 10000L, timeUnit);
    }

    private void watchdogCheck() {
        nud nudVar;
        le0 le0Var;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f2096e && jCurrentTimeMillis - this.f2111t.get() > 60000 && (le0Var = this.f2093b) != null && !le0Var.isAlive()) {
            ji9.m14111w(f2087v, "Player thread appears to be stuck, restarting...");
            restartPlayback();
        }
        if (!this.f2097f || jCurrentTimeMillis - this.f2112u.get() <= 60000 || (nudVar = this.f2094c) == null || nudVar.isAlive()) {
            return;
        }
        ji9.m14111w(f2087v, "Recording thread appears to be stuck, restarting...");
        restartRecording();
    }

    public void addAudioData(byte[] bArr) {
        le0 le0Var;
        if (!this.f2096e || (le0Var = this.f2093b) == null || bArr == null || bArr.length <= 0) {
            return;
        }
        le0Var.addAudioData(bArr);
        this.f2111t.set(System.currentTimeMillis());
    }

    @r6c(markerClass = {ovh.class})
    public void addMp3AudioData(final byte[] bArr) {
        this.f2099h.post(new Runnable() { // from class: llc
            @Override // java.lang.Runnable
            public final void run() {
                this.f58144a.lambda$addMp3AudioData$8(bArr);
            }
        });
    }

    public void clearAudioQueue() {
        ji9.m14110i(f2087v, "clearAudioQueue: clearAudioQueue  -----  1");
        if (this.f2093b != null) {
            ji9.m14110i(f2087v, "clearAudioQueue: clearAudioQueue  -----  2");
            this.f2093b.clearAudioQueue();
        }
        if (this.f2102k != null) {
            ji9.m14110i(f2087v, "clearAudioQueue: mp3PlayerThread  -----  2");
            this.f2102k.clearAudioQueue(true);
        }
    }

    public void clearMp3AudioQueue() {
        this.f2099h.post(new Runnable() { // from class: vlc
            @Override // java.lang.Runnable
            public final void run() {
                this.f91613a.lambda$clearMp3AudioQueue$12();
            }
        });
    }

    public EnumC0331d getCurrentActiveModule() {
        return this.f2106o;
    }

    public u0b.EnumC13307d getCurrentChannelMode() {
        return this.f2107p;
    }

    @r6c(markerClass = {ovh.class})
    public int getMp3QueueSize() {
        u0b u0bVar = this.f2102k;
        if (u0bVar != null) {
            return u0bVar.getQueueSize();
        }
        return 0;
    }

    public long getRunningTime() {
        return this.f2098g.get();
    }

    public void initialize(Context context) {
        initialize(context, 16000, false);
    }

    public boolean isInitialized() {
        return this.f2095d;
    }

    public boolean isMp3Playing() {
        return this.f2101j;
    }

    @r6c(markerClass = {ovh.class})
    public Boolean isMp3SoundPlaying() {
        u0b u0bVar = this.f2102k;
        return Boolean.valueOf(u0bVar != null && u0bVar.isSoundPlaying().booleanValue());
    }

    public boolean isPlaying() {
        return this.f2096e;
    }

    public boolean isRecording() {
        return this.f2097f;
    }

    public Boolean isSoundPlaying() {
        try {
            if (this.f2092a.equals(f2089x)) {
                le0 le0Var = this.f2093b;
                if (le0Var != null) {
                    return le0Var.isSoundPlaying();
                }
            } else if (this.f2102k != null) {
                return (Boolean) runOnMainThreadWithResult(new CallableC0329b());
            }
            return Boolean.FALSE;
        } catch (Exception e) {
            ji9.m14109e(f2087v, e.getMessage());
            return Boolean.FALSE;
        }
    }

    public void pauseMp3Playback() {
        this.f2099h.post(new Runnable() { // from class: qlc
            @Override // java.lang.Runnable
            public final void run() {
                this.f74850a.lambda$pauseMp3Playback$9();
            }
        });
    }

    public void pausePlayback() {
        le0 le0Var;
        if (!this.f2096e || (le0Var = this.f2093b) == null) {
            return;
        }
        le0Var.pausePlayback();
        notifyPlaybackStateChanged(false);
    }

    public void pauseRecording() {
        nud nudVar;
        if (!this.f2097f || (nudVar = this.f2094c) == null) {
            return;
        }
        nudVar.pauseRecording();
        notifyRecordingStateChanged(false);
    }

    public void release() {
        ScheduledExecutorService scheduledExecutorService = this.f2100i;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this.f2100i.shutdown();
            try {
                if (!this.f2100i.awaitTermination(5L, TimeUnit.SECONDS)) {
                    this.f2100i.shutdownNow();
                }
            } catch (InterruptedException unused) {
                this.f2100i.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }
        stopPlayback();
    }

    public void resumeMp3Playback() {
        this.f2099h.post(new Runnable() { // from class: ulc
            @Override // java.lang.Runnable
            public final void run() {
                this.f88400a.lambda$resumeMp3Playback$10();
            }
        });
    }

    public void resumePlayback() {
        le0 le0Var;
        if (!this.f2096e || (le0Var = this.f2093b) == null) {
            return;
        }
        le0Var.resumePlayback();
        notifyPlaybackStateChanged(true);
    }

    public void resumeRecording() {
        nud nudVar;
        if (!this.f2097f || (nudVar = this.f2094c) == null) {
            return;
        }
        nudVar.resumeRecording();
        notifyRecordingStateChanged(true);
    }

    public void setAudioDataCallback(InterfaceC0330c interfaceC0330c) {
        this.f2108q = interfaceC0330c;
    }

    public void setAudioPlayerTime(mp7 mp7Var) {
        if (this.f2092a.equals(f2089x)) {
            le0 le0Var = this.f2093b;
            if (le0Var != null) {
                le0Var.setAudioPlayerTime(mp7Var);
                return;
            }
            return;
        }
        u0b u0bVar = this.f2102k;
        if (u0bVar != null) {
            u0bVar.setAudioPlayerTime(mp7Var);
        }
    }

    public void setCurrentActiveModule(EnumC0331d enumC0331d) {
        this.f2106o = enumC0331d;
        ji9.m14108d(f2087v, "Current active module set to: " + enumC0331d);
        applyModuleChannelConfig();
    }

    public void setIsAudioEnd(boolean z) {
        if (this.f2092a.equals(f2089x)) {
            le0 le0Var = this.f2093b;
            if (le0Var != null) {
                le0Var.setIsAudioEnd(z);
                return;
            }
            return;
        }
        u0b u0bVar = this.f2102k;
        if (u0bVar != null) {
            u0bVar.setIsAudioEnd(z);
        }
    }

    public void setModuleChannelSwitchEnable(EnumC0331d enumC0331d, boolean z) {
        this.f2105n.put(enumC0331d, Boolean.valueOf(z));
        ji9.m14108d(f2087v, "Module " + enumC0331d + " channel switch enable: " + z);
        if (this.f2106o == enumC0331d) {
            applyModuleChannelConfig();
        }
    }

    public void setStateCallback(InterfaceC0333f interfaceC0333f) {
        this.f2109r = interfaceC0333f;
    }

    public void setVolume(boolean z) {
        f2090y = z;
        le0 le0Var = this.f2093b;
        if (le0Var != null) {
            le0Var.setVolume(z);
        }
        u0b u0bVar = this.f2102k;
        if (u0bVar != null) {
            u0bVar.setVolume(f2090y);
        }
    }

    @r6c(markerClass = {ovh.class})
    public void startMp3Playback() {
        if (this.f2101j) {
            return;
        }
        try {
            if (this.f2102k == null) {
                Context context = this.f2104m;
                if (context == null) {
                    throw new IllegalStateException("Context not initialized. Call initialize(Context) first.");
                }
                this.f2102k = new u0b(context);
                applyModuleChannelConfig();
            }
            this.f2101j = true;
            this.f2103l.set(System.currentTimeMillis());
            notifyMp3PlaybackStateChanged(true);
            ji9.m14110i(f2087v, "MP3 playback started");
        } catch (Exception e) {
            notifyError("Failed to start MP3 playback: " + e.getMessage(), 1005);
        }
    }

    public void startPlayback() {
        if (this.f2096e) {
            return;
        }
        try {
            this.f2092a = f2089x;
            if (this.f2093b == null) {
                this.f2093b = new le0(this.f2110s);
            }
            this.f2093b.start();
            this.f2096e = true;
            this.f2111t.set(System.currentTimeMillis());
            notifyPlaybackStateChanged(true);
        } catch (Exception e) {
            notifyError("Failed to start playback: " + e.getMessage(), 1001);
        }
    }

    public void startRecording() {
        if (this.f2097f) {
            return;
        }
        try {
            if (this.f2094c == null) {
                this.f2094c = new nud(16000, new nud.InterfaceC10065a() { // from class: zlc
                    @Override // p000.nud.InterfaceC10065a
                    public final void onAudioDataAvailable(byte[] bArr) {
                        this.f105424a.onProcessedAudioData(bArr);
                    }
                });
            }
            this.f2094c.start();
            this.f2097f = true;
            this.f2112u.set(System.currentTimeMillis());
            notifyRecordingStateChanged(true);
        } catch (Exception e) {
            notifyError("Failed to start recording: " + e.getMessage(), 1002);
        }
    }

    public void stopMp3Playback() {
        this.f2099h.post(new Runnable() { // from class: plc
            @Override // java.lang.Runnable
            public final void run() {
                this.f71349a.lambda$stopMp3Playback$11();
            }
        });
    }

    public void stopPlayback() {
        le0 le0Var;
        if (!this.f2096e || (le0Var = this.f2093b) == null) {
            return;
        }
        le0Var.shutdown();
        this.f2093b = null;
        this.f2096e = false;
        notifyPlaybackStateChanged(false);
    }

    public void stopRecording() {
        nud nudVar;
        if (!this.f2097f || (nudVar = this.f2094c) == null) {
            return;
        }
        nudVar.stopRecording();
        this.f2094c = null;
        this.f2097f = false;
        notifyRecordingStateChanged(false);
    }

    @r6c(markerClass = {ovh.class})
    public void switchAudioChannel(final u0b.EnumC13307d enumC13307d) {
        Boolean bool = this.f2105n.get(this.f2106o);
        if (bool == null || !bool.booleanValue()) {
            ji9.m14111w(f2087v, "Audio channel switch is disabled for module: " + this.f2106o);
            return;
        }
        if (this.f2102k == null) {
            ji9.m14111w(f2087v, "Mp3PlayerThread not initialized, cannot switch channel");
        } else {
            this.f2099h.post(new Runnable() { // from class: slc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f82189a.lambda$switchAudioChannel$14(enumC13307d);
                }
            });
        }
    }

    private amc() {
        this.f2092a = f2088w;
        this.f2095d = false;
        this.f2096e = false;
        this.f2097f = false;
        this.f2098g = new AtomicLong(0L);
        this.f2101j = false;
        this.f2103l = new AtomicLong(System.currentTimeMillis());
        this.f2105n = new C0328a();
        this.f2106o = EnumC0331d.DEFAULT;
        this.f2107p = u0b.EnumC13307d.EARPIECE;
        this.f2110s = 16000;
        this.f2111t = new AtomicLong(System.currentTimeMillis());
        this.f2112u = new AtomicLong(System.currentTimeMillis());
    }

    public void initialize(Context context, int i, boolean z) {
        if (this.f2095d) {
            ji9.m14111w(f2087v, "AECRecordManager is already initialized");
            return;
        }
        this.f2104m = context.getApplicationContext();
        this.f2110s = i;
        this.f2099h = new Handler(Looper.getMainLooper());
        if (z) {
            this.f2100i = Executors.newSingleThreadScheduledExecutor();
            startMonitoringTasks();
        }
        this.f2095d = true;
        ji9.m14110i(f2087v, "AECRecordManager initialized successfully");
    }
}
