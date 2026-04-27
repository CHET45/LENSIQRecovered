package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
@fgb
public final class ys2 {

    /* JADX INFO: renamed from: a */
    public ArrayList<C15794a> f102883a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public volatile ws2 f102884b = ws2.IDLE;

    /* JADX INFO: renamed from: ys2$a */
    public static final class C15794a {

        /* JADX INFO: renamed from: a */
        public final Runnable f102885a;

        /* JADX INFO: renamed from: b */
        public final Executor f102886b;

        public C15794a(Runnable runnable, Executor executor) {
            this.f102885a = runnable;
            this.f102886b = executor;
        }

        /* JADX INFO: renamed from: a */
        public void m26342a() {
            this.f102886b.execute(this.f102885a);
        }
    }

    /* JADX INFO: renamed from: a */
    public ws2 m26339a() {
        ws2 ws2Var = this.f102884b;
        if (ws2Var != null) {
            return ws2Var;
        }
        throw new UnsupportedOperationException("Channel state API is not implemented");
    }

    /* JADX INFO: renamed from: b */
    public void m26340b(@ofb ws2 ws2Var) {
        v7d.checkNotNull(ws2Var, "newState");
        if (this.f102884b == ws2Var || this.f102884b == ws2.SHUTDOWN) {
            return;
        }
        this.f102884b = ws2Var;
        if (this.f102883a.isEmpty()) {
            return;
        }
        ArrayList<C15794a> arrayList = this.f102883a;
        this.f102883a = new ArrayList<>();
        Iterator<C15794a> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().m26342a();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m26341c(Runnable runnable, Executor executor, ws2 ws2Var) {
        v7d.checkNotNull(runnable, "callback");
        v7d.checkNotNull(executor, "executor");
        v7d.checkNotNull(ws2Var, "source");
        C15794a c15794a = new C15794a(runnable, executor);
        if (this.f102884b != ws2Var) {
            c15794a.m26342a();
        } else {
            this.f102883a.add(c15794a);
        }
    }
}
