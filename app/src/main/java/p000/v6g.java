package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class v6g {

    /* JADX INFO: renamed from: i */
    public static final String f90110i = "StreamVolumeManager";

    /* JADX INFO: renamed from: j */
    public static final String f90111j = "android.media.VOLUME_CHANGED_ACTION";

    /* JADX INFO: renamed from: a */
    public final Context f90112a;

    /* JADX INFO: renamed from: b */
    public final Handler f90113b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13892b f90114c;

    /* JADX INFO: renamed from: d */
    public final AudioManager f90115d;

    /* JADX INFO: renamed from: e */
    @hib
    public C13893c f90116e;

    /* JADX INFO: renamed from: f */
    public int f90117f;

    /* JADX INFO: renamed from: g */
    public int f90118g;

    /* JADX INFO: renamed from: h */
    public boolean f90119h;

    /* JADX INFO: renamed from: v6g$b */
    public interface InterfaceC13892b {
        void onStreamTypeChanged(int i);

        void onStreamVolumeChanged(int i, boolean z);
    }

    /* JADX INFO: renamed from: v6g$c */
    public final class C13893c extends BroadcastReceiver {
        private C13893c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = v6g.this.f90113b;
            final v6g v6gVar = v6g.this;
            handler.post(new Runnable() { // from class: w6g
                @Override // java.lang.Runnable
                public final void run() {
                    v6g.m23827b(v6gVar);
                }
            });
        }
    }

    public v6g(Context context, Handler handler, InterfaceC13892b interfaceC13892b) {
        Context applicationContext = context.getApplicationContext();
        this.f90112a = applicationContext;
        this.f90113b = handler;
        this.f90114c = interfaceC13892b;
        AudioManager audioManager = (AudioManager) u80.checkStateNotNull((AudioManager) applicationContext.getSystemService("audio"));
        this.f90115d = audioManager;
        this.f90117f = 3;
        this.f90118g = getVolumeFromManager(audioManager, 3);
        this.f90119h = getMutedFromManager(audioManager, this.f90117f);
        C13893c c13893c = new C13893c();
        try {
            applicationContext.registerReceiver(c13893c, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f90116e = c13893c;
        } catch (RuntimeException e) {
            yh9.m25920w("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m23827b(v6g v6gVar) {
        v6gVar.updateVolumeAndNotifyIfChanged();
    }

    private static boolean getMutedFromManager(AudioManager audioManager, int i) {
        return x0i.f95978a >= 23 ? audioManager.isStreamMute(i) : getVolumeFromManager(audioManager, i) == 0;
    }

    private static int getVolumeFromManager(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            yh9.m25920w("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateVolumeAndNotifyIfChanged() {
        int volumeFromManager = getVolumeFromManager(this.f90115d, this.f90117f);
        boolean mutedFromManager = getMutedFromManager(this.f90115d, this.f90117f);
        if (this.f90118g == volumeFromManager && this.f90119h == mutedFromManager) {
            return;
        }
        this.f90118g = volumeFromManager;
        this.f90119h = mutedFromManager;
        this.f90114c.onStreamVolumeChanged(volumeFromManager, mutedFromManager);
    }

    public void decreaseVolume(int i) {
        if (this.f90118g <= getMinVolume()) {
            return;
        }
        this.f90115d.adjustStreamVolume(this.f90117f, -1, i);
        updateVolumeAndNotifyIfChanged();
    }

    public int getMaxVolume() {
        return this.f90115d.getStreamMaxVolume(this.f90117f);
    }

    public int getMinVolume() {
        if (x0i.f95978a >= 28) {
            return this.f90115d.getStreamMinVolume(this.f90117f);
        }
        return 0;
    }

    public int getVolume() {
        return this.f90118g;
    }

    public void increaseVolume(int i) {
        if (this.f90118g >= getMaxVolume()) {
            return;
        }
        this.f90115d.adjustStreamVolume(this.f90117f, 1, i);
        updateVolumeAndNotifyIfChanged();
    }

    public boolean isMuted() {
        return this.f90119h;
    }

    public void release() {
        C13893c c13893c = this.f90116e;
        if (c13893c != null) {
            try {
                this.f90112a.unregisterReceiver(c13893c);
            } catch (RuntimeException e) {
                yh9.m25920w("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.f90116e = null;
        }
    }

    public void setMuted(boolean z, int i) {
        if (x0i.f95978a >= 23) {
            this.f90115d.adjustStreamVolume(this.f90117f, z ? -100 : 100, i);
        } else {
            this.f90115d.setStreamMute(this.f90117f, z);
        }
        updateVolumeAndNotifyIfChanged();
    }

    public void setStreamType(int i) {
        if (this.f90117f == i) {
            return;
        }
        this.f90117f = i;
        updateVolumeAndNotifyIfChanged();
        this.f90114c.onStreamTypeChanged(i);
    }

    public void setVolume(int i, int i2) {
        if (i < getMinVolume() || i > getMaxVolume()) {
            return;
        }
        this.f90115d.setStreamVolume(this.f90117f, i, i2);
        updateVolumeAndNotifyIfChanged();
    }
}
