package p000;

import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface oe7 {

    /* JADX INFO: renamed from: oe7$a */
    public interface InterfaceC10343a {
        oe7 getTarget();

        void sendToTarget();
    }

    Looper getLooper();

    boolean hasMessages(int i);

    InterfaceC10343a obtainMessage(int i);

    InterfaceC10343a obtainMessage(int i, int i2, int i3);

    InterfaceC10343a obtainMessage(int i, int i2, int i3, @hib Object obj);

    InterfaceC10343a obtainMessage(int i, @hib Object obj);

    boolean post(Runnable runnable);

    boolean postAtFrontOfQueue(Runnable runnable);

    boolean postDelayed(Runnable runnable, long j);

    void removeCallbacksAndMessages(@hib Object obj);

    void removeMessages(int i);

    boolean sendEmptyMessage(int i);

    boolean sendEmptyMessageAtTime(int i, long j);

    boolean sendEmptyMessageDelayed(int i, int i2);

    boolean sendMessageAtFrontOfQueue(InterfaceC10343a interfaceC10343a);
}
