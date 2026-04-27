package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import p000.oe7;

/* JADX INFO: loaded from: classes3.dex */
public final class fjg implements oe7 {

    /* JADX INFO: renamed from: b */
    public static final int f36872b = 50;

    /* JADX INFO: renamed from: c */
    @xc7("messagePool")
    public static final List<C5857b> f36873c = new ArrayList(50);

    /* JADX INFO: renamed from: a */
    public final Handler f36874a;

    /* JADX INFO: renamed from: fjg$b */
    public static final class C5857b implements oe7.InterfaceC10343a {

        /* JADX INFO: renamed from: a */
        @hib
        public Message f36875a;

        /* JADX INFO: renamed from: b */
        @hib
        public fjg f36876b;

        private C5857b() {
        }

        private void recycle() {
            this.f36875a = null;
            this.f36876b = null;
            fjg.recycleMessage(this);
        }

        @Override // p000.oe7.InterfaceC10343a
        public oe7 getTarget() {
            return (oe7) v80.checkNotNull(this.f36876b);
        }

        public boolean sendAtFrontOfQueue(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) v80.checkNotNull(this.f36875a));
            recycle();
            return zSendMessageAtFrontOfQueue;
        }

        @Override // p000.oe7.InterfaceC10343a
        public void sendToTarget() {
            ((Message) v80.checkNotNull(this.f36875a)).sendToTarget();
            recycle();
        }

        @op1
        public C5857b setMessage(Message message, fjg fjgVar) {
            this.f36875a = message;
            this.f36876b = fjgVar;
            return this;
        }
    }

    public fjg(Handler handler) {
        this.f36874a = handler;
    }

    private static C5857b obtainSystemMessage() {
        C5857b c5857b;
        List<C5857b> list = f36873c;
        synchronized (list) {
            try {
                c5857b = list.isEmpty() ? new C5857b() : list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5857b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void recycleMessage(C5857b c5857b) {
        List<C5857b> list = f36873c;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(c5857b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.oe7
    public Looper getLooper() {
        return this.f36874a.getLooper();
    }

    @Override // p000.oe7
    public boolean hasMessages(int i) {
        v80.checkArgument(i != 0);
        return this.f36874a.hasMessages(i);
    }

    @Override // p000.oe7
    public oe7.InterfaceC10343a obtainMessage(int i) {
        return obtainSystemMessage().setMessage(this.f36874a.obtainMessage(i), this);
    }

    @Override // p000.oe7
    public boolean post(Runnable runnable) {
        return this.f36874a.post(runnable);
    }

    @Override // p000.oe7
    public boolean postAtFrontOfQueue(Runnable runnable) {
        return this.f36874a.postAtFrontOfQueue(runnable);
    }

    @Override // p000.oe7
    public boolean postDelayed(Runnable runnable, long j) {
        return this.f36874a.postDelayed(runnable, j);
    }

    @Override // p000.oe7
    public void removeCallbacksAndMessages(@hib Object obj) {
        this.f36874a.removeCallbacksAndMessages(obj);
    }

    @Override // p000.oe7
    public void removeMessages(int i) {
        v80.checkArgument(i != 0);
        this.f36874a.removeMessages(i);
    }

    @Override // p000.oe7
    public boolean sendEmptyMessage(int i) {
        return this.f36874a.sendEmptyMessage(i);
    }

    @Override // p000.oe7
    public boolean sendEmptyMessageAtTime(int i, long j) {
        return this.f36874a.sendEmptyMessageAtTime(i, j);
    }

    @Override // p000.oe7
    public boolean sendEmptyMessageDelayed(int i, int i2) {
        return this.f36874a.sendEmptyMessageDelayed(i, i2);
    }

    @Override // p000.oe7
    public boolean sendMessageAtFrontOfQueue(oe7.InterfaceC10343a interfaceC10343a) {
        return ((C5857b) interfaceC10343a).sendAtFrontOfQueue(this.f36874a);
    }

    @Override // p000.oe7
    public oe7.InterfaceC10343a obtainMessage(int i, @hib Object obj) {
        return obtainSystemMessage().setMessage(this.f36874a.obtainMessage(i, obj), this);
    }

    @Override // p000.oe7
    public oe7.InterfaceC10343a obtainMessage(int i, int i2, int i3) {
        return obtainSystemMessage().setMessage(this.f36874a.obtainMessage(i, i2, i3), this);
    }

    @Override // p000.oe7
    public oe7.InterfaceC10343a obtainMessage(int i, int i2, int i3, @hib Object obj) {
        return obtainSystemMessage().setMessage(this.f36874a.obtainMessage(i, i2, i3, obj), this);
    }
}
