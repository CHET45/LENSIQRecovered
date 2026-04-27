package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p000.e13;

/* JADX INFO: loaded from: classes.dex */
@f0g
public final class w7b {

    /* JADX INFO: renamed from: c */
    public static final int f93504c = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final AtomicReference<C14460a> f93505a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b */
    @yfb
    public final y7b f93506b = e8b.Mutex$default(false, 1, null);

    /* JADX INFO: renamed from: w7b$a */
    public static final class C14460a {

        /* JADX INFO: renamed from: a */
        @yfb
        public final k7b f93507a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final jj8 f93508b;

        public C14460a(@yfb k7b k7bVar, @yfb jj8 jj8Var) {
            this.f93507a = k7bVar;
            this.f93508b = jj8Var;
        }

        public final boolean canInterrupt(@yfb C14460a c14460a) {
            return this.f93507a.compareTo(c14460a.f93507a) >= 0;
        }

        public final void cancel() {
            this.f93508b.cancel((CancellationException) new q7b());
        }

        @yfb
        public final jj8 getJob() {
            return this.f93508b;
        }

        @yfb
        public final k7b getPriority() {
            return this.f93507a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: w7b$b */
    @ck3(m4009c = "androidx.compose.animation.core.MutatorMutex$mutate$2", m4010f = "InternalMutatorMutex.kt", m4011i = {0, 0, 1, 1}, m4012l = {184, 132}, m4013m = "invokeSuspend", m4014n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, m4015s = {"L$0", "L$1", "L$0", "L$1"})
    @dwf({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutate$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,178:1\n120#2,10:179\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutate$2\n*L\n130#1:179,10\n*E\n"})
    public static final class C14461b<R> extends ugg implements gz6<x13, zy2<? super R>, Object> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ qy6<zy2<? super R>, Object> f93509C;

        /* JADX INFO: renamed from: a */
        public Object f93510a;

        /* JADX INFO: renamed from: b */
        public Object f93511b;

        /* JADX INFO: renamed from: c */
        public Object f93512c;

        /* JADX INFO: renamed from: d */
        public int f93513d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f93514e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ k7b f93515f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ w7b f93516m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14461b(k7b k7bVar, w7b w7bVar, qy6<? super zy2<? super R>, ? extends Object> qy6Var, zy2<? super C14461b> zy2Var) {
            super(2, zy2Var);
            this.f93515f = k7bVar;
            this.f93516m = w7bVar;
            this.f93509C = qy6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C14461b c14461b = new C14461b(this.f93515f, this.f93516m, this.f93509C, zy2Var);
            c14461b.f93514e = obj;
            return c14461b;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super R> zy2Var) {
            return ((C14461b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, y7b] */
        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            y7b y7bVar;
            qy6<zy2<? super R>, Object> qy6Var;
            C14460a c14460a;
            w7b w7bVar;
            C14460a c14460a2;
            Throwable th;
            w7b w7bVar2;
            y7b y7bVar2;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            ?? r1 = this.f93513d;
            try {
                try {
                    if (r1 == 0) {
                        y7e.throwOnFailure(obj);
                        x13 x13Var = (x13) this.f93514e;
                        k7b k7bVar = this.f93515f;
                        e13.InterfaceC5040b interfaceC5040b = x13Var.getCoroutineContext().get(jj8.f50715A);
                        md8.checkNotNull(interfaceC5040b);
                        C14460a c14460a3 = new C14460a(k7bVar, (jj8) interfaceC5040b);
                        this.f93516m.tryMutateOrCancel(c14460a3);
                        y7bVar = this.f93516m.f93506b;
                        qy6<zy2<? super R>, Object> qy6Var2 = this.f93509C;
                        w7b w7bVar3 = this.f93516m;
                        this.f93514e = c14460a3;
                        this.f93510a = y7bVar;
                        this.f93511b = qy6Var2;
                        this.f93512c = w7bVar3;
                        this.f93513d = 1;
                        if (y7bVar.lock(null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        qy6Var = qy6Var2;
                        c14460a = c14460a3;
                        w7bVar = w7bVar3;
                    } else {
                        if (r1 != 1) {
                            if (r1 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            w7bVar2 = (w7b) this.f93511b;
                            y7bVar2 = (y7b) this.f93510a;
                            c14460a2 = (C14460a) this.f93514e;
                            try {
                                y7e.throwOnFailure(obj);
                                v7b.m23844a(w7bVar2.f93505a, c14460a2, null);
                                y7bVar2.unlock(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                v7b.m23844a(w7bVar2.f93505a, c14460a2, null);
                                throw th;
                            }
                        }
                        w7bVar = (w7b) this.f93512c;
                        qy6Var = (qy6) this.f93511b;
                        y7b y7bVar3 = (y7b) this.f93510a;
                        c14460a = (C14460a) this.f93514e;
                        y7e.throwOnFailure(obj);
                        y7bVar = y7bVar3;
                    }
                    this.f93514e = c14460a;
                    this.f93510a = y7bVar;
                    this.f93511b = w7bVar;
                    this.f93512c = null;
                    this.f93513d = 2;
                    Object objInvoke = qy6Var.invoke(this);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    w7bVar2 = w7bVar;
                    y7bVar2 = y7bVar;
                    obj = objInvoke;
                    c14460a2 = c14460a;
                    v7b.m23844a(w7bVar2.f93505a, c14460a2, null);
                    y7bVar2.unlock(null);
                    return obj;
                } catch (Throwable th3) {
                    c14460a2 = c14460a;
                    th = th3;
                    w7bVar2 = w7bVar;
                    v7b.m23844a(w7bVar2.f93505a, c14460a2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r1.unlock(null);
                throw th4;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: w7b$c */
    @ck3(m4009c = "androidx.compose.animation.core.MutatorMutex$mutateWith$2", m4010f = "InternalMutatorMutex.kt", m4011i = {0, 0, 1, 1}, m4012l = {184, 171}, m4013m = "invokeSuspend", m4014n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, m4015s = {"L$0", "L$1", "L$0", "L$1"})
    @dwf({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutateWith$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,178:1\n120#2,10:179\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutateWith$2\n*L\n169#1:179,10\n*E\n"})
    public static final class C14462c<R> extends ugg implements gz6<x13, zy2<? super R>, Object> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ w7b f93517C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ gz6<T, zy2<? super R>, Object> f93518F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ T f93519H;

        /* JADX INFO: renamed from: a */
        public Object f93520a;

        /* JADX INFO: renamed from: b */
        public Object f93521b;

        /* JADX INFO: renamed from: c */
        public Object f93522c;

        /* JADX INFO: renamed from: d */
        public Object f93523d;

        /* JADX INFO: renamed from: e */
        public int f93524e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f93525f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ k7b f93526m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14462c(k7b k7bVar, w7b w7bVar, gz6<? super T, ? super zy2<? super R>, ? extends Object> gz6Var, T t, zy2<? super C14462c> zy2Var) {
            super(2, zy2Var);
            this.f93526m = k7bVar;
            this.f93517C = w7bVar;
            this.f93518F = gz6Var;
            this.f93519H = t;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C14462c c14462c = new C14462c(this.f93526m, this.f93517C, this.f93518F, this.f93519H, zy2Var);
            c14462c.f93525f = obj;
            return c14462c;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super R> zy2Var) {
            return ((C14462c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, y7b] */
        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            y7b y7bVar;
            gz6 gz6Var;
            Object obj2;
            C14460a c14460a;
            w7b w7bVar;
            C14460a c14460a2;
            Throwable th;
            w7b w7bVar2;
            y7b y7bVar2;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            ?? r1 = this.f93524e;
            try {
                try {
                    if (r1 == 0) {
                        y7e.throwOnFailure(obj);
                        x13 x13Var = (x13) this.f93525f;
                        k7b k7bVar = this.f93526m;
                        e13.InterfaceC5040b interfaceC5040b = x13Var.getCoroutineContext().get(jj8.f50715A);
                        md8.checkNotNull(interfaceC5040b);
                        C14460a c14460a3 = new C14460a(k7bVar, (jj8) interfaceC5040b);
                        this.f93517C.tryMutateOrCancel(c14460a3);
                        y7bVar = this.f93517C.f93506b;
                        gz6Var = this.f93518F;
                        Object obj3 = this.f93519H;
                        w7b w7bVar3 = this.f93517C;
                        this.f93525f = c14460a3;
                        this.f93520a = y7bVar;
                        this.f93521b = gz6Var;
                        this.f93522c = obj3;
                        this.f93523d = w7bVar3;
                        this.f93524e = 1;
                        if (y7bVar.lock(null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj2 = obj3;
                        c14460a = c14460a3;
                        w7bVar = w7bVar3;
                    } else {
                        if (r1 != 1) {
                            if (r1 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            w7bVar2 = (w7b) this.f93521b;
                            y7bVar2 = (y7b) this.f93520a;
                            c14460a2 = (C14460a) this.f93525f;
                            try {
                                y7e.throwOnFailure(obj);
                                v7b.m23844a(w7bVar2.f93505a, c14460a2, null);
                                y7bVar2.unlock(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                v7b.m23844a(w7bVar2.f93505a, c14460a2, null);
                                throw th;
                            }
                        }
                        w7bVar = (w7b) this.f93523d;
                        obj2 = this.f93522c;
                        gz6Var = (gz6) this.f93521b;
                        y7b y7bVar3 = (y7b) this.f93520a;
                        c14460a = (C14460a) this.f93525f;
                        y7e.throwOnFailure(obj);
                        y7bVar = y7bVar3;
                    }
                    this.f93525f = c14460a;
                    this.f93520a = y7bVar;
                    this.f93521b = w7bVar;
                    this.f93522c = null;
                    this.f93523d = null;
                    this.f93524e = 2;
                    Object objInvoke = gz6Var.invoke(obj2, this);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    w7bVar2 = w7bVar;
                    y7bVar2 = y7bVar;
                    obj = objInvoke;
                    c14460a2 = c14460a;
                    v7b.m23844a(w7bVar2.f93505a, c14460a2, null);
                    y7bVar2.unlock(null);
                    return obj;
                } catch (Throwable th3) {
                    c14460a2 = c14460a;
                    th = th3;
                    w7bVar2 = w7bVar;
                    v7b.m23844a(w7bVar2.f93505a, c14460a2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r1.unlock(null);
                throw th4;
            }
        }
    }

    public static /* synthetic */ Object mutate$default(w7b w7bVar, k7b k7bVar, qy6 qy6Var, zy2 zy2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            k7bVar = k7b.Default;
        }
        return w7bVar.mutate(k7bVar, qy6Var, zy2Var);
    }

    public static /* synthetic */ Object mutateWith$default(w7b w7bVar, Object obj, k7b k7bVar, gz6 gz6Var, zy2 zy2Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            k7bVar = k7b.Default;
        }
        return w7bVar.mutateWith(obj, k7bVar, gz6Var, zy2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryMutateOrCancel(C14460a c14460a) {
        C14460a c14460a2;
        do {
            c14460a2 = this.f93505a.get();
            if (c14460a2 != null && !c14460a.canInterrupt(c14460a2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!v7b.m23844a(this.f93505a, c14460a2, c14460a));
        if (c14460a2 != null) {
            c14460a2.cancel();
        }
    }

    @gib
    public final <R> Object mutate(@yfb k7b k7bVar, @yfb qy6<? super zy2<? super R>, ? extends Object> qy6Var, @yfb zy2<? super R> zy2Var) {
        return y13.coroutineScope(new C14461b(k7bVar, this, qy6Var, null), zy2Var);
    }

    @gib
    public final <T, R> Object mutateWith(T t, @yfb k7b k7bVar, @yfb gz6<? super T, ? super zy2<? super R>, ? extends Object> gz6Var, @yfb zy2<? super R> zy2Var) {
        return y13.coroutineScope(new C14462c(k7bVar, this, gz6Var, t, null), zy2Var);
    }
}
