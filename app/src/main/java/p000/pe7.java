package p000;

import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface pe7 {

    /* JADX INFO: renamed from: pe7$a */
    public interface InterfaceC10931a {
        pe7 getTarget();

        void sendToTarget();
    }

    Looper getLooper();

    boolean hasMessages(int i);

    InterfaceC10931a obtainMessage(int i);

    InterfaceC10931a obtainMessage(int i, int i2, int i3);

    InterfaceC10931a obtainMessage(int i, int i2, int i3, @hib Object obj);

    InterfaceC10931a obtainMessage(int i, @hib Object obj);

    boolean post(Runnable runnable);

    boolean postAtFrontOfQueue(Runnable runnable);

    boolean postDelayed(Runnable runnable, long j);

    void removeCallbacksAndMessages(@hib Object obj);

    void removeMessages(int i);

    boolean sendEmptyMessage(int i);

    boolean sendEmptyMessageAtTime(int i, long j);

    boolean sendEmptyMessageDelayed(int i, int i2);

    boolean sendMessageAtFrontOfQueue(InterfaceC10931a interfaceC10931a);
}
