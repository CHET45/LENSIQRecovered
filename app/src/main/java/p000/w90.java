package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ArrayBlockingQueue;
import p000.p4d;

/* JADX INFO: loaded from: classes.dex */
public final class w90 {

    /* JADX INFO: renamed from: e */
    public static final String f93632e = "AsyncLayoutInflater";

    /* JADX INFO: renamed from: a */
    public LayoutInflater f93633a;

    /* JADX INFO: renamed from: d */
    public Handler.Callback f93636d = new C14482a();

    /* JADX INFO: renamed from: b */
    public Handler f93634b = new Handler(this.f93636d);

    /* JADX INFO: renamed from: c */
    public C14485d f93635c = C14485d.getInstance();

    /* JADX INFO: renamed from: w90$a */
    public class C14482a implements Handler.Callback {
        public C14482a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            C14484c c14484c = (C14484c) message.obj;
            if (c14484c.f93642d == null) {
                c14484c.f93642d = w90.this.f93633a.inflate(c14484c.f93641c, c14484c.f93640b, false);
            }
            c14484c.f93643e.onInflateFinished(c14484c.f93642d, c14484c.f93641c, c14484c.f93640b);
            w90.this.f93635c.releaseRequest(c14484c);
            return true;
        }
    }

    /* JADX INFO: renamed from: w90$b */
    public static class C14483b extends LayoutInflater {

        /* JADX INFO: renamed from: a */
        public static final String[] f93638a = {"android.widget.", "android.webkit.", "android.app."};

        public C14483b(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new C14483b(context);
        }

        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            View viewCreateView;
            for (String str2 : f93638a) {
                try {
                    viewCreateView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (viewCreateView != null) {
                    return viewCreateView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* JADX INFO: renamed from: w90$c */
    public static class C14484c {

        /* JADX INFO: renamed from: a */
        public w90 f93639a;

        /* JADX INFO: renamed from: b */
        public ViewGroup f93640b;

        /* JADX INFO: renamed from: c */
        public int f93641c;

        /* JADX INFO: renamed from: d */
        public View f93642d;

        /* JADX INFO: renamed from: e */
        public InterfaceC14486e f93643e;
    }

    /* JADX INFO: renamed from: w90$d */
    public static class C14485d extends Thread {

        /* JADX INFO: renamed from: c */
        public static final C14485d f93644c;

        /* JADX INFO: renamed from: a */
        public ArrayBlockingQueue<C14484c> f93645a = new ArrayBlockingQueue<>(10);

        /* JADX INFO: renamed from: b */
        public p4d.C10793c<C14484c> f93646b = new p4d.C10793c<>(10);

        static {
            C14485d c14485d = new C14485d();
            f93644c = c14485d;
            c14485d.start();
        }

        private C14485d() {
        }

        public static C14485d getInstance() {
            return f93644c;
        }

        public void enqueue(C14484c c14484c) {
            try {
                this.f93645a.put(c14484c);
            } catch (InterruptedException e) {
                throw new RuntimeException("Failed to enqueue async inflate request", e);
            }
        }

        public C14484c obtainRequest() {
            C14484c c14484cAcquire = this.f93646b.acquire();
            return c14484cAcquire == null ? new C14484c() : c14484cAcquire;
        }

        public void releaseRequest(C14484c c14484c) {
            c14484c.f93643e = null;
            c14484c.f93639a = null;
            c14484c.f93640b = null;
            c14484c.f93641c = 0;
            c14484c.f93642d = null;
            this.f93646b.release(c14484c);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                runInner();
            }
        }

        public void runInner() {
            try {
                C14484c c14484cTake = this.f93645a.take();
                try {
                    c14484cTake.f93642d = c14484cTake.f93639a.f93633a.inflate(c14484cTake.f93641c, c14484cTake.f93640b, false);
                } catch (RuntimeException e) {
                    Log.w(w90.f93632e, "Failed to inflate resource in the background! Retrying on the UI thread", e);
                }
                Message.obtain(c14484cTake.f93639a.f93634b, 0, c14484cTake).sendToTarget();
            } catch (InterruptedException e2) {
                Log.w(w90.f93632e, e2);
            }
        }
    }

    /* JADX INFO: renamed from: w90$e */
    public interface InterfaceC14486e {
        void onInflateFinished(@efb View view, @uw8 int i, @hib ViewGroup viewGroup);
    }

    public w90(@efb Context context) {
        this.f93633a = new C14483b(context);
    }

    @erh
    public void inflate(@uw8 int i, @hib ViewGroup viewGroup, @efb InterfaceC14486e interfaceC14486e) {
        if (interfaceC14486e == null) {
            throw new NullPointerException("callback argument may not be null!");
        }
        C14484c c14484cObtainRequest = this.f93635c.obtainRequest();
        c14484cObtainRequest.f93639a = this;
        c14484cObtainRequest.f93641c = i;
        c14484cObtainRequest.f93640b = viewGroup;
        c14484cObtainRequest.f93643e = interfaceC14486e;
        this.f93635c.enqueue(c14484cObtainRequest);
    }
}
