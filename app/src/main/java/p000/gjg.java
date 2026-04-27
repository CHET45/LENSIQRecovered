package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import p000.pe7;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class gjg implements pe7 {

    /* JADX INFO: renamed from: b */
    public static final int f39958b = 50;

    /* JADX INFO: renamed from: c */
    @xc7("messagePool")
    public static final List<C6344b> f39959c = new ArrayList(50);

    /* JADX INFO: renamed from: a */
    public final Handler f39960a;

    /* JADX INFO: renamed from: gjg$b */
    public static final class C6344b implements pe7.InterfaceC10931a {

        /* JADX INFO: renamed from: a */
        @hib
        public Message f39961a;

        /* JADX INFO: renamed from: b */
        @hib
        public gjg f39962b;

        private C6344b() {
        }

        private void recycle() {
            this.f39961a = null;
            this.f39962b = null;
            gjg.recycleMessage(this);
        }

        @Override // p000.pe7.InterfaceC10931a
        public pe7 getTarget() {
            return (pe7) u80.checkNotNull(this.f39962b);
        }

        public boolean sendAtFrontOfQueue(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) u80.checkNotNull(this.f39961a));
            recycle();
            return zSendMessageAtFrontOfQueue;
        }

        @Override // p000.pe7.InterfaceC10931a
        public void sendToTarget() {
            ((Message) u80.checkNotNull(this.f39961a)).sendToTarget();
            recycle();
        }

        @op1
        public C6344b setMessage(Message message, gjg gjgVar) {
            this.f39961a = message;
            this.f39962b = gjgVar;
            return this;
        }
    }

    public gjg(Handler handler) {
        this.f39960a = handler;
    }

    private static C6344b obtainSystemMessage() {
        C6344b c6344b;
        List<C6344b> list = f39959c;
        synchronized (list) {
            try {
                c6344b = list.isEmpty() ? new C6344b() : list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6344b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void recycleMessage(C6344b c6344b) {
        List<C6344b> list = f39959c;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(c6344b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.pe7
    public Looper getLooper() {
        return this.f39960a.getLooper();
    }

    @Override // p000.pe7
    public boolean hasMessages(int i) {
        return this.f39960a.hasMessages(i);
    }

    @Override // p000.pe7
    public pe7.InterfaceC10931a obtainMessage(int i) {
        return obtainSystemMessage().setMessage(this.f39960a.obtainMessage(i), this);
    }

    @Override // p000.pe7
    public boolean post(Runnable runnable) {
        return this.f39960a.post(runnable);
    }

    @Override // p000.pe7
    public boolean postAtFrontOfQueue(Runnable runnable) {
        return this.f39960a.postAtFrontOfQueue(runnable);
    }

    @Override // p000.pe7
    public boolean postDelayed(Runnable runnable, long j) {
        return this.f39960a.postDelayed(runnable, j);
    }

    @Override // p000.pe7
    public void removeCallbacksAndMessages(@hib Object obj) {
        this.f39960a.removeCallbacksAndMessages(obj);
    }

    @Override // p000.pe7
    public void removeMessages(int i) {
        this.f39960a.removeMessages(i);
    }

    @Override // p000.pe7
    public boolean sendEmptyMessage(int i) {
        return this.f39960a.sendEmptyMessage(i);
    }

    @Override // p000.pe7
    public boolean sendEmptyMessageAtTime(int i, long j) {
        return this.f39960a.sendEmptyMessageAtTime(i, j);
    }

    @Override // p000.pe7
    public boolean sendEmptyMessageDelayed(int i, int i2) {
        return this.f39960a.sendEmptyMessageDelayed(i, i2);
    }

    @Override // p000.pe7
    public boolean sendMessageAtFrontOfQueue(pe7.InterfaceC10931a interfaceC10931a) {
        return ((C6344b) interfaceC10931a).sendAtFrontOfQueue(this.f39960a);
    }

    @Override // p000.pe7
    public pe7.InterfaceC10931a obtainMessage(int i, @hib Object obj) {
        return obtainSystemMessage().setMessage(this.f39960a.obtainMessage(i, obj), this);
    }

    @Override // p000.pe7
    public pe7.InterfaceC10931a obtainMessage(int i, int i2, int i3) {
        return obtainSystemMessage().setMessage(this.f39960a.obtainMessage(i, i2, i3), this);
    }

    @Override // p000.pe7
    public pe7.InterfaceC10931a obtainMessage(int i, int i2, int i3, @hib Object obj) {
        return obtainSystemMessage().setMessage(this.f39960a.obtainMessage(i, i2, i3, obj), this);
    }
}
