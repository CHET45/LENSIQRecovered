package p000;

import java.util.concurrent.atomic.AtomicReference;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@vn8
@p7e({p7e.EnumC10826a.f69935b})
@ia8
public final class p5f<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final AtomicReference<C10800a<T>> f69743a;

    /* JADX INFO: renamed from: p5f$a */
    public static final class C10800a<T> {

        /* JADX INFO: renamed from: a */
        @yfb
        public final jj8 f69744a;

        /* JADX INFO: renamed from: b */
        public final T f69745b;

        public C10800a(@yfb jj8 jj8Var, T t) {
            this.f69744a = jj8Var;
            this.f69745b = t;
        }

        @yfb
        public final jj8 getJob() {
            return this.f69744a;
        }

        public final T getValue() {
            return this.f69745b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: p5f$b */
    @ck3(m4009c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", m4010f = "SessionMutex.kt", m4011i = {0, 1}, m4012l = {66, 68}, m4013m = "invokeSuspend", m4014n = {"newSession", "newSession"}, m4015s = {"L$0", "L$0"})
    public static final class C10801b<R> extends ugg implements gz6<x13, zy2<? super R>, Object> {

        /* JADX INFO: renamed from: a */
        public int f69746a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f69747b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<x13, T> f69748c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AtomicReference<C10800a<T>> f69749d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gz6<T, zy2<? super R>, Object> f69750e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10801b(qy6<? super x13, ? extends T> qy6Var, AtomicReference<C10800a<T>> atomicReference, gz6<? super T, ? super zy2<? super R>, ? extends Object> gz6Var, zy2<? super C10801b> zy2Var) {
            super(2, zy2Var);
            this.f69748c = qy6Var;
            this.f69749d = atomicReference;
            this.f69750e = gz6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C10801b c10801b = new C10801b(this.f69748c, this.f69749d, this.f69750e, zy2Var);
            c10801b.f69747b = obj;
            return c10801b;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super R> zy2Var) {
            return ((C10801b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) throws Throwable {
            C10800a<T> c10800a;
            jj8 job;
            C10800a<T> c10800a2;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f69746a;
            try {
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    x13 x13Var = (x13) this.f69747b;
                    c10800a = new C10800a<>(oj8.getJob(x13Var.getCoroutineContext()), this.f69748c.invoke(x13Var));
                    C10800a<T> andSet = this.f69749d.getAndSet(c10800a);
                    if (andSet != null && (job = andSet.getJob()) != null) {
                        this.f69747b = c10800a;
                        this.f69746a = 1;
                        if (oj8.cancelAndJoin(job, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c10800a2 = (C10800a) this.f69747b;
                        try {
                            y7e.throwOnFailure(obj);
                            v7b.m23844a(this.f69749d, c10800a2, null);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            v7b.m23844a(this.f69749d, c10800a2, null);
                            throw th;
                        }
                    }
                    c10800a = (C10800a) this.f69747b;
                    y7e.throwOnFailure(obj);
                }
                gz6<T, zy2<? super R>, Object> gz6Var = this.f69750e;
                T value = c10800a.getValue();
                this.f69747b = c10800a;
                this.f69746a = 2;
                obj = gz6Var.invoke(value, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c10800a2 = c10800a;
                v7b.m23844a(this.f69749d, c10800a2, null);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                c10800a2 = c10800a;
                v7b.m23844a(this.f69749d, c10800a2, null);
                throw th;
            }
        }
    }

    private /* synthetic */ p5f(AtomicReference atomicReference) {
        this.f69743a = atomicReference;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ p5f m31722boximpl(AtomicReference atomicReference) {
        return new p5f(atomicReference);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static <T> AtomicReference<C10800a<T>> m31724constructorimpl(AtomicReference<C10800a<T>> atomicReference) {
        return atomicReference;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m31725equalsimpl(AtomicReference<C10800a<T>> atomicReference, Object obj) {
        return (obj instanceof p5f) && md8.areEqual(atomicReference, ((p5f) obj).m31731unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31726equalsimpl0(AtomicReference<C10800a<T>> atomicReference, AtomicReference<C10800a<T>> atomicReference2) {
        return md8.areEqual(atomicReference, atomicReference2);
    }

    @gib
    /* JADX INFO: renamed from: getCurrentSession-impl, reason: not valid java name */
    public static final T m31727getCurrentSessionimpl(AtomicReference<C10800a<T>> atomicReference) {
        C10800a<T> c10800a = atomicReference.get();
        if (c10800a != null) {
            return c10800a.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31728hashCodeimpl(AtomicReference<C10800a<T>> atomicReference) {
        return atomicReference.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m31729toStringimpl(AtomicReference<C10800a<T>> atomicReference) {
        return "SessionMutex(currentSessionHolder=" + atomicReference + ')';
    }

    @gib
    /* JADX INFO: renamed from: withSessionCancellingPrevious-impl, reason: not valid java name */
    public static final <R> Object m31730withSessionCancellingPreviousimpl(AtomicReference<C10800a<T>> atomicReference, @yfb qy6<? super x13, ? extends T> qy6Var, @yfb gz6<? super T, ? super zy2<? super R>, ? extends Object> gz6Var, @yfb zy2<? super R> zy2Var) {
        return y13.coroutineScope(new C10801b(qy6Var, atomicReference, gz6Var, null), zy2Var);
    }

    public boolean equals(Object obj) {
        return m31725equalsimpl(this.f69743a, obj);
    }

    public int hashCode() {
        return m31728hashCodeimpl(this.f69743a);
    }

    public String toString() {
        return m31729toStringimpl(this.f69743a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ AtomicReference m31731unboximpl() {
        return this.f69743a;
    }

    @yfb
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> AtomicReference<C10800a<T>> m31723constructorimpl() {
        return m31724constructorimpl(new AtomicReference(null));
    }
}
