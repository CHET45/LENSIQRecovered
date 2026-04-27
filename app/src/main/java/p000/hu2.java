package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public abstract class hu2<T> {

    /* JADX INFO: renamed from: f */
    public static final String f44874f = cj9.tagWithPrefix("ConstraintTracker");

    /* JADX INFO: renamed from: a */
    public final ong f44875a;

    /* JADX INFO: renamed from: b */
    public final Context f44876b;

    /* JADX INFO: renamed from: c */
    public final Object f44877c = new Object();

    /* JADX INFO: renamed from: d */
    public final Set<fu2<T>> f44878d = new LinkedHashSet();

    /* JADX INFO: renamed from: e */
    public T f44879e;

    /* JADX INFO: renamed from: hu2$a */
    public class RunnableC7021a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f44880a;

        public RunnableC7021a(final List val$listenersList) {
            this.f44880a = val$listenersList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f44880a.iterator();
            while (it.hasNext()) {
                ((fu2) it.next()).onConstraintChanged(hu2.this.f44879e);
            }
        }
    }

    public hu2(@efb Context context, @efb ong taskExecutor) {
        this.f44876b = context.getApplicationContext();
        this.f44875a = taskExecutor;
    }

    public void addListener(fu2<T> listener) {
        synchronized (this.f44877c) {
            try {
                if (this.f44878d.add(listener)) {
                    if (this.f44878d.size() == 1) {
                        this.f44879e = getInitialState();
                        cj9.get().debug(f44874f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f44879e), new Throwable[0]);
                        startTracking();
                    }
                    listener.onConstraintChanged(this.f44879e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract T getInitialState();

    public void removeListener(fu2<T> listener) {
        synchronized (this.f44877c) {
            try {
                if (this.f44878d.remove(listener) && this.f44878d.isEmpty()) {
                    stopTracking();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setState(T newState) {
        synchronized (this.f44877c) {
            try {
                T t = this.f44879e;
                if (t != newState && (t == null || !t.equals(newState))) {
                    this.f44879e = newState;
                    this.f44875a.getMainThreadExecutor().execute(new RunnableC7021a(new ArrayList(this.f44878d)));
                }
            } finally {
            }
        }
    }

    public abstract void startTracking();

    public abstract void stopTracking();
}
