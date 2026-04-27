package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class cd0 {

    /* JADX INFO: renamed from: a */
    public final Context f16266a;

    /* JADX INFO: renamed from: b */
    public final RunnableC2275a f16267b;

    /* JADX INFO: renamed from: c */
    public boolean f16268c;

    /* JADX INFO: renamed from: cd0$a */
    public final class RunnableC2275a extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2276b f16269a;

        /* JADX INFO: renamed from: b */
        public final Handler f16270b;

        public RunnableC2275a(Handler handler, InterfaceC2276b interfaceC2276b) {
            this.f16270b = handler;
            this.f16269a = interfaceC2276b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f16270b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (cd0.this.f16268c) {
                this.f16269a.onAudioBecomingNoisy();
            }
        }
    }

    /* JADX INFO: renamed from: cd0$b */
    public interface InterfaceC2276b {
        void onAudioBecomingNoisy();
    }

    public cd0(Context context, Handler handler, InterfaceC2276b interfaceC2276b) {
        this.f16266a = context.getApplicationContext();
        this.f16267b = new RunnableC2275a(handler, interfaceC2276b);
    }

    public void setEnabled(boolean z) {
        if (z && !this.f16268c) {
            this.f16266a.registerReceiver(this.f16267b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f16268c = true;
        } else {
            if (z || !this.f16268c) {
                return;
            }
            this.f16266a.unregisterReceiver(this.f16267b);
            this.f16268c = false;
        }
    }
}
