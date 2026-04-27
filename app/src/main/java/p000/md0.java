package p000;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class md0 {

    /* JADX INFO: renamed from: a */
    public final Context f60610a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9295f f60611b;

    /* JADX INFO: renamed from: c */
    public final Handler f60612c;

    /* JADX INFO: renamed from: d */
    @hib
    public final C9292c f60613d;

    /* JADX INFO: renamed from: e */
    public final BroadcastReceiver f60614e;

    /* JADX INFO: renamed from: f */
    @hib
    public final C9293d f60615f;

    /* JADX INFO: renamed from: g */
    @hib
    public hd0 f60616g;

    /* JADX INFO: renamed from: h */
    @hib
    public vd0 f60617h;

    /* JADX INFO: renamed from: i */
    public uc0 f60618i;

    /* JADX INFO: renamed from: j */
    public boolean f60619j;

    /* JADX INFO: renamed from: md0$b */
    @c5e(23)
    public static final class C9291b {
        private C9291b() {
        }

        public static void registerAudioDeviceCallback(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            he0.getAudioManager(context).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void unregisterAudioDeviceCallback(Context context, AudioDeviceCallback audioDeviceCallback) {
            he0.getAudioManager(context).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* JADX INFO: renamed from: md0$c */
    @c5e(23)
    public final class C9292c extends AudioDeviceCallback {
        private C9292c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            md0 md0Var = md0.this;
            md0Var.onNewAudioCapabilities(hd0.m12315b(md0Var.f60610a, md0.this.f60618i, md0.this.f60617h));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (t0i.contains(audioDeviceInfoArr, md0.this.f60617h)) {
                md0.this.f60617h = null;
            }
            md0 md0Var = md0.this;
            md0Var.onNewAudioCapabilities(hd0.m12315b(md0Var.f60610a, md0.this.f60618i, md0.this.f60617h));
        }
    }

    /* JADX INFO: renamed from: md0$d */
    public final class C9293d extends ContentObserver {

        /* JADX INFO: renamed from: a */
        public final ContentResolver f60621a;

        /* JADX INFO: renamed from: b */
        public final Uri f60622b;

        public C9293d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f60621a = contentResolver;
            this.f60622b = uri;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            md0 md0Var = md0.this;
            md0Var.onNewAudioCapabilities(hd0.m12315b(md0Var.f60610a, md0.this.f60618i, md0.this.f60617h));
        }

        public void register() {
            this.f60621a.registerContentObserver(this.f60622b, false, this);
        }

        public void unregister() {
            this.f60621a.unregisterContentObserver(this);
        }
    }

    /* JADX INFO: renamed from: md0$e */
    public final class C9294e extends BroadcastReceiver {
        private C9294e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            md0 md0Var = md0.this;
            md0Var.onNewAudioCapabilities(hd0.m12316c(context, intent, md0Var.f60618i, md0.this.f60617h));
        }
    }

    /* JADX INFO: renamed from: md0$f */
    public interface InterfaceC9295f {
        void onAudioCapabilitiesChanged(hd0 hd0Var);
    }

    @Deprecated
    public md0(Context context, InterfaceC9295f interfaceC9295f) {
        this(context, interfaceC9295f, uc0.f87467h, (AudioDeviceInfo) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNewAudioCapabilities(hd0 hd0Var) {
        if (!this.f60619j || hd0Var.equals(this.f60616g)) {
            return;
        }
        this.f60616g = hd0Var;
        this.f60611b.onAudioCapabilitiesChanged(hd0Var);
    }

    public void overrideCapabilities(hd0 hd0Var) {
        onNewAudioCapabilities(hd0Var);
    }

    public hd0 register() {
        if (this.f60619j) {
            return (hd0) v80.checkNotNull(this.f60616g);
        }
        this.f60619j = true;
        C9293d c9293d = this.f60615f;
        if (c9293d != null) {
            c9293d.register();
        }
        C9292c c9292c = this.f60613d;
        if (c9292c != null) {
            C9291b.registerAudioDeviceCallback(this.f60610a, c9292c, this.f60612c);
        }
        hd0 hd0VarM12316c = hd0.m12316c(this.f60610a, this.f60610a.registerReceiver(this.f60614e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f60612c), this.f60618i, this.f60617h);
        this.f60616g = hd0VarM12316c;
        return hd0VarM12316c;
    }

    public void setAudioAttributes(uc0 uc0Var) {
        this.f60618i = uc0Var;
        onNewAudioCapabilities(hd0.m12315b(this.f60610a, uc0Var, this.f60617h));
    }

    @c5e(23)
    public void setRoutedDevice(@hib AudioDeviceInfo audioDeviceInfo) {
        vd0 vd0Var = this.f60617h;
        if (Objects.equals(audioDeviceInfo, vd0Var == null ? null : vd0Var.f90707a)) {
            return;
        }
        vd0 vd0Var2 = audioDeviceInfo != null ? new vd0(audioDeviceInfo) : null;
        this.f60617h = vd0Var2;
        onNewAudioCapabilities(hd0.m12315b(this.f60610a, this.f60618i, vd0Var2));
    }

    public void unregister() {
        if (this.f60619j) {
            this.f60616g = null;
            C9292c c9292c = this.f60613d;
            if (c9292c != null) {
                C9291b.unregisterAudioDeviceCallback(this.f60610a, c9292c);
            }
            this.f60610a.unregisterReceiver(this.f60614e);
            C9293d c9293d = this.f60615f;
            if (c9293d != null) {
                c9293d.unregister();
            }
            this.f60619j = false;
        }
    }

    public md0(Context context, InterfaceC9295f interfaceC9295f, uc0 uc0Var, @hib AudioDeviceInfo audioDeviceInfo) {
        this(context, interfaceC9295f, uc0Var, audioDeviceInfo != null ? new vd0(audioDeviceInfo) : null);
    }

    public md0(Context context, InterfaceC9295f interfaceC9295f, uc0 uc0Var, @hib vd0 vd0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f60610a = applicationContext;
        this.f60611b = (InterfaceC9295f) v80.checkNotNull(interfaceC9295f);
        this.f60618i = uc0Var;
        this.f60617h = vd0Var;
        Handler handlerCreateHandlerForCurrentOrMainLooper = t0i.createHandlerForCurrentOrMainLooper();
        this.f60612c = handlerCreateHandlerForCurrentOrMainLooper;
        this.f60613d = new C9292c();
        this.f60614e = new C9294e();
        Uri uriM12317d = hd0.m12317d();
        this.f60615f = uriM12317d != null ? new C9293d(handlerCreateHandlerForCurrentOrMainLooper, applicationContext.getContentResolver(), uriM12317d) : null;
    }
}
