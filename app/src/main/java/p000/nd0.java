package p000;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class nd0 {

    /* JADX INFO: renamed from: a */
    public final Context f64001a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9789f f64002b;

    /* JADX INFO: renamed from: c */
    public final Handler f64003c;

    /* JADX INFO: renamed from: d */
    @hib
    public final C9786c f64004d;

    /* JADX INFO: renamed from: e */
    @hib
    public final BroadcastReceiver f64005e;

    /* JADX INFO: renamed from: f */
    @hib
    public final C9787d f64006f;

    /* JADX INFO: renamed from: g */
    @hib
    public ld0 f64007g;

    /* JADX INFO: renamed from: h */
    public boolean f64008h;

    /* JADX INFO: renamed from: nd0$b */
    @c5e(23)
    public static final class C9785b {
        private C9785b() {
        }

        @ih4
        public static void registerAudioDeviceCallback(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ((AudioManager) u80.checkNotNull((AudioManager) context.getSystemService("audio"))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        @ih4
        public static void unregisterAudioDeviceCallback(Context context, AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager) u80.checkNotNull((AudioManager) context.getSystemService("audio"))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* JADX INFO: renamed from: nd0$c */
    @c5e(23)
    public final class C9786c extends AudioDeviceCallback {
        private C9786c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            nd0 nd0Var = nd0.this;
            nd0Var.onNewAudioCapabilities(ld0.getCapabilities(nd0Var.f64001a));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            nd0 nd0Var = nd0.this;
            nd0Var.onNewAudioCapabilities(ld0.getCapabilities(nd0Var.f64001a));
        }
    }

    /* JADX INFO: renamed from: nd0$d */
    public final class C9787d extends ContentObserver {

        /* JADX INFO: renamed from: a */
        public final ContentResolver f64010a;

        /* JADX INFO: renamed from: b */
        public final Uri f64011b;

        public C9787d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f64010a = contentResolver;
            this.f64011b = uri;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            nd0 nd0Var = nd0.this;
            nd0Var.onNewAudioCapabilities(ld0.getCapabilities(nd0Var.f64001a));
        }

        public void register() {
            this.f64010a.registerContentObserver(this.f64011b, false, this);
        }

        public void unregister() {
            this.f64010a.unregisterContentObserver(this);
        }
    }

    /* JADX INFO: renamed from: nd0$e */
    public final class C9788e extends BroadcastReceiver {
        private C9788e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            nd0.this.onNewAudioCapabilities(ld0.m16093b(context, intent));
        }
    }

    /* JADX INFO: renamed from: nd0$f */
    public interface InterfaceC9789f {
        void onAudioCapabilitiesChanged(ld0 ld0Var);
    }

    public nd0(Context context, InterfaceC9789f interfaceC9789f) {
        Context applicationContext = context.getApplicationContext();
        this.f64001a = applicationContext;
        this.f64002b = (InterfaceC9789f) u80.checkNotNull(interfaceC9789f);
        Handler handlerCreateHandlerForCurrentOrMainLooper = x0i.createHandlerForCurrentOrMainLooper();
        this.f64003c = handlerCreateHandlerForCurrentOrMainLooper;
        int i = x0i.f95978a;
        byte b = 0;
        this.f64004d = i >= 23 ? new C9786c() : null;
        this.f64005e = i >= 21 ? new C9788e() : null;
        Uri uriM16094c = ld0.m16094c();
        this.f64006f = uriM16094c != null ? new C9787d(handlerCreateHandlerForCurrentOrMainLooper, applicationContext.getContentResolver(), uriM16094c) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNewAudioCapabilities(ld0 ld0Var) {
        if (!this.f64008h || ld0Var.equals(this.f64007g)) {
            return;
        }
        this.f64007g = ld0Var;
        this.f64002b.onAudioCapabilitiesChanged(ld0Var);
    }

    public ld0 register() {
        C9786c c9786c;
        if (this.f64008h) {
            return (ld0) u80.checkNotNull(this.f64007g);
        }
        this.f64008h = true;
        C9787d c9787d = this.f64006f;
        if (c9787d != null) {
            c9787d.register();
        }
        if (x0i.f95978a >= 23 && (c9786c = this.f64004d) != null) {
            C9785b.registerAudioDeviceCallback(this.f64001a, c9786c, this.f64003c);
        }
        ld0 ld0VarM16093b = ld0.m16093b(this.f64001a, this.f64005e != null ? this.f64001a.registerReceiver(this.f64005e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f64003c) : null);
        this.f64007g = ld0VarM16093b;
        return ld0VarM16093b;
    }

    public void unregister() {
        C9786c c9786c;
        if (this.f64008h) {
            this.f64007g = null;
            if (x0i.f95978a >= 23 && (c9786c = this.f64004d) != null) {
                C9785b.unregisterAudioDeviceCallback(this.f64001a, c9786c);
            }
            BroadcastReceiver broadcastReceiver = this.f64005e;
            if (broadcastReceiver != null) {
                this.f64001a.unregisterReceiver(broadcastReceiver);
            }
            C9787d c9787d = this.f64006f;
            if (c9787d != null) {
                c9787d.unregister();
            }
            this.f64008h = false;
        }
    }
}
