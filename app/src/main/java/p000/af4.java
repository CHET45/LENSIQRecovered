package p000;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes5.dex */
@vx4
public abstract class af4 {

    /* JADX INFO: renamed from: af4$b */
    public static final class C0201b extends af4 {

        /* JADX INFO: renamed from: a */
        public static final C0201b f1293a = new C0201b();

        private C0201b() {
        }

        @Override // p000.af4
        /* JADX INFO: renamed from: a */
        public void mo472a(Object event, Iterator<vcg> subscribers) {
            v7d.checkNotNull(event);
            while (subscribers.hasNext()) {
                subscribers.next().m23920c(event);
            }
        }
    }

    /* JADX INFO: renamed from: af4$c */
    public static final class C0202c extends af4 {

        /* JADX INFO: renamed from: a */
        public final ConcurrentLinkedQueue<a> f1294a;

        /* JADX INFO: renamed from: af4$c$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public final Object f1295a;

            /* JADX INFO: renamed from: b */
            public final vcg f1296b;

            private a(Object event, vcg subscriber) {
                this.f1295a = event;
                this.f1296b = subscriber;
            }
        }

        private C0202c() {
            this.f1294a = dod.newConcurrentLinkedQueue();
        }

        @Override // p000.af4
        /* JADX INFO: renamed from: a */
        public void mo472a(Object event, Iterator<vcg> subscribers) {
            v7d.checkNotNull(event);
            while (subscribers.hasNext()) {
                this.f1294a.add(new a(event, subscribers.next()));
            }
            while (true) {
                a aVarPoll = this.f1294a.poll();
                if (aVarPoll == null) {
                    return;
                } else {
                    aVarPoll.f1296b.m23920c(aVarPoll.f1295a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: af4$d */
    public static final class C0203d extends af4 {

        /* JADX INFO: renamed from: a */
        public final ThreadLocal<Queue<c>> f1297a;

        /* JADX INFO: renamed from: b */
        public final ThreadLocal<Boolean> f1298b;

        /* JADX INFO: renamed from: af4$d$a */
        public class a extends ThreadLocal<Queue<c>> {
            public a(final C0203d this$0) {
            }

            @Override // java.lang.ThreadLocal
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Queue<c> initialValue() {
                return dod.newArrayDeque();
            }
        }

        /* JADX INFO: renamed from: af4$d$b */
        public class b extends ThreadLocal<Boolean> {
            public b(final C0203d this$0) {
            }

            @Override // java.lang.ThreadLocal
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean initialValue() {
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: renamed from: af4$d$c */
        public static final class c {

            /* JADX INFO: renamed from: a */
            public final Object f1299a;

            /* JADX INFO: renamed from: b */
            public final Iterator<vcg> f1300b;

            private c(Object event, Iterator<vcg> subscribers) {
                this.f1299a = event;
                this.f1300b = subscribers;
            }
        }

        private C0203d() {
            this.f1297a = new a(this);
            this.f1298b = new b(this);
        }

        @Override // p000.af4
        /* JADX INFO: renamed from: a */
        public void mo472a(Object event, Iterator<vcg> subscribers) {
            v7d.checkNotNull(event);
            v7d.checkNotNull(subscribers);
            Queue<c> queue = this.f1297a.get();
            queue.offer(new c(event, subscribers));
            if (this.f1298b.get().booleanValue()) {
                return;
            }
            this.f1298b.set(Boolean.TRUE);
            while (true) {
                try {
                    c cVarPoll = queue.poll();
                    if (cVarPoll == null) {
                        return;
                    }
                    while (cVarPoll.f1300b.hasNext()) {
                        ((vcg) cVarPoll.f1300b.next()).m23920c(cVarPoll.f1299a);
                    }
                } finally {
                    this.f1298b.remove();
                    this.f1297a.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static af4 m469b() {
        return C0201b.f1293a;
    }

    /* JADX INFO: renamed from: c */
    public static af4 m470c() {
        return new C0202c();
    }

    /* JADX INFO: renamed from: d */
    public static af4 m471d() {
        return new C0203d();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo472a(Object event, Iterator<vcg> subscribers);
}
