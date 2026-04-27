package p000;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public class s55 implements wcg, akd {

    /* JADX INFO: renamed from: a */
    @xc7("this")
    public final Map<Class<?>, ConcurrentHashMap<z55<Object>, Executor>> f80706a = new HashMap();

    /* JADX INFO: renamed from: b */
    @xc7("this")
    public Queue<o55<?>> f80707b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final Executor f80708c;

    public s55(Executor executor) {
        this.f80708c = executor;
    }

    private synchronized Set<Map.Entry<z55<Object>, Executor>> getHandlers(o55<?> o55Var) {
        ConcurrentHashMap<z55<Object>, Executor> concurrentHashMap;
        try {
            concurrentHashMap = this.f80706a.get(o55Var.getType());
        } catch (Throwable th) {
            throw th;
        }
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$publish$0(Map.Entry entry, o55 o55Var) {
        ((z55) entry.getKey()).handle(o55Var);
    }

    /* JADX INFO: renamed from: b */
    public void m21738b() {
        Queue<o55<?>> queue;
        synchronized (this) {
            try {
                queue = this.f80707b;
                if (queue != null) {
                    this.f80707b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator<o55<?>> it = queue.iterator();
            while (it.hasNext()) {
                publish(it.next());
            }
        }
    }

    @Override // p000.akd
    public void publish(final o55<?> o55Var) {
        w7d.checkNotNull(o55Var);
        synchronized (this) {
            try {
                Queue<o55<?>> queue = this.f80707b;
                if (queue != null) {
                    queue.add(o55Var);
                    return;
                }
                for (final Map.Entry<z55<Object>, Executor> entry : getHandlers(o55Var)) {
                    entry.getValue().execute(new Runnable() { // from class: q55
                        @Override // java.lang.Runnable
                        public final void run() {
                            s55.lambda$publish$0(entry, o55Var);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.wcg
    public synchronized <T> void subscribe(Class<T> cls, Executor executor, z55<? super T> z55Var) {
        try {
            w7d.checkNotNull(cls);
            w7d.checkNotNull(z55Var);
            w7d.checkNotNull(executor);
            if (!this.f80706a.containsKey(cls)) {
                this.f80706a.put(cls, new ConcurrentHashMap<>());
            }
            this.f80706a.get(cls).put(z55Var, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.wcg
    public synchronized <T> void unsubscribe(Class<T> cls, z55<? super T> z55Var) {
        w7d.checkNotNull(cls);
        w7d.checkNotNull(z55Var);
        if (this.f80706a.containsKey(cls)) {
            ConcurrentHashMap<z55<Object>, Executor> concurrentHashMap = this.f80706a.get(cls);
            concurrentHashMap.remove(z55Var);
            if (concurrentHashMap.isEmpty()) {
                this.f80706a.remove(cls);
            }
        }
    }

    @Override // p000.wcg
    public <T> void subscribe(Class<T> cls, z55<? super T> z55Var) {
        subscribe(cls, this.f80708c, z55Var);
    }
}
