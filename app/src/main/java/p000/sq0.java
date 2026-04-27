package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class sq0<T> {

    /* JADX INFO: renamed from: a */
    public final ArrayList<T> f82579a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final Handler f82580b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public void m22184a(qp7<T> qp7Var) {
        if (qp7Var == null) {
            return;
        }
        ko1 ko1Var = new ko1(this.f82579a, qp7Var);
        if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
            ko1Var.run();
        } else {
            this.f82580b.post(ko1Var);
        }
    }

    public boolean addCallback(T t) {
        if (t == null) {
            return false;
        }
        boolean zContains = this.f82579a.contains(t);
        return !zContains ? this.f82579a.add(t) : zContains;
    }

    public void release() {
        this.f82579a.clear();
        this.f82580b.removeCallbacksAndMessages(null);
    }

    public boolean removeCallback(T t) {
        if (t == null || this.f82579a.isEmpty()) {
            return false;
        }
        return this.f82579a.remove(t);
    }
}
