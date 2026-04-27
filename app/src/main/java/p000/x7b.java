package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p000.e13;
import p000.y7b;

/* JADX INFO: loaded from: classes.dex */
@f0g
public final class x7b {

    /* JADX INFO: renamed from: c */
    public static final int f97082c = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final AtomicReference<C14968c> f97083a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b */
    @yfb
    public final y7b f97084b = e8b.Mutex$default(false, 1, null);

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: x7b$a */
    @ck3(m4009c = "androidx.compose.foundation.MutatorMutex$mutate$2", m4010f = "MutatorMutex.kt", m4011i = {0, 0, 1, 1}, m4012l = {220, 132}, m4013m = "invokeSuspend", m4014n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, m4015s = {"L$0", "L$1", "L$0", "L$1"})
    @dwf({"SMAP\nMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutate$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,214:1\n120#2,10:215\n*S KotlinDebug\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutate$2\n*L\n130#1:215,10\n*E\n"})
    public static final class C14966a<R> extends ugg implements gz6<x13, zy2<? super R>, Object> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ qy6<zy2<? super R>, Object> f97085C;

        /* JADX INFO: renamed from: a */
        public Object f97086a;

        /* JADX INFO: renamed from: b */
        public Object f97087b;

        /* JADX INFO: renamed from: c */
        public Object f97088c;

        /* JADX INFO: renamed from: d */
        public int f97089d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f97090e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ j7b f97091f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ x7b f97092m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14966a(j7b j7bVar, x7b x7bVar, qy6<? super zy2<? super R>, ? extends Object> qy6Var, zy2<? super C14966a> zy2Var) {
            super(2, zy2Var);
            this.f97091f = j7bVar;
            this.f97092m = x7bVar;
            this.f97085C = qy6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C14966a c14966a = new C14966a(this.f97091f, this.f97092m, this.f97085C, zy2Var);
            c14966a.f97090e = obj;
            return c14966a;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super R> zy2Var) {
            return ((C14966a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, y7b] */
        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            y7b y7bVar;
            qy6<zy2<? super R>, Object> qy6Var;
            C14968c c14968c;
            x7b x7bVar;
            C14968c c14968c2;
            Throwable th;
            x7b x7bVar2;
            y7b y7bVar2;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            ?? r1 = this.f97089d;
            try {
                try {
                    if (r1 == 0) {
                        y7e.throwOnFailure(obj);
                        x13 x13Var = (x13) this.f97090e;
                        j7b j7bVar = this.f97091f;
                        e13.InterfaceC5040b interfaceC5040b = x13Var.getCoroutineContext().get(jj8.f50715A);
                        md8.checkNotNull(interfaceC5040b);
                        C14968c c14968c3 = new C14968c(j7bVar, (jj8) interfaceC5040b);
                        this.f97092m.tryMutateOrCancel(c14968c3);
                        y7bVar = this.f97092m.f97084b;
                        qy6<zy2<? super R>, Object> qy6Var2 = this.f97085C;
                        x7b x7bVar3 = this.f97092m;
                        this.f97090e = c14968c3;
                        this.f97086a = y7bVar;
                        this.f97087b = qy6Var2;
                        this.f97088c = x7bVar3;
                        this.f97089d = 1;
                        if (y7bVar.lock(null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        qy6Var = qy6Var2;
                        c14968c = c14968c3;
                        x7bVar = x7bVar3;
                    } else {
                        if (r1 != 1) {
                            if (r1 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            x7bVar2 = (x7b) this.f97087b;
                            y7bVar2 = (y7b) this.f97086a;
                            c14968c2 = (C14968c) this.f97090e;
                            try {
                                y7e.throwOnFailure(obj);
                                v7b.m23844a(x7bVar2.f97083a, c14968c2, null);
                                y7bVar2.unlock(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                v7b.m23844a(x7bVar2.f97083a, c14968c2, null);
                                throw th;
                            }
                        }
                        x7bVar = (x7b) this.f97088c;
                        qy6Var = (qy6) this.f97087b;
                        y7b y7bVar3 = (y7b) this.f97086a;
                        c14968c = (C14968c) this.f97090e;
                        y7e.throwOnFailure(obj);
                        y7bVar = y7bVar3;
                    }
                    this.f97090e = c14968c;
                    this.f97086a = y7bVar;
                    this.f97087b = x7bVar;
                    this.f97088c = null;
                    this.f97089d = 2;
                    Object objInvoke = qy6Var.invoke(this);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    x7bVar2 = x7bVar;
                    y7bVar2 = y7bVar;
                    obj = objInvoke;
                    c14968c2 = c14968c;
                    v7b.m23844a(x7bVar2.f97083a, c14968c2, null);
                    y7bVar2.unlock(null);
                    return obj;
                } catch (Throwable th3) {
                    c14968c2 = c14968c;
                    th = th3;
                    x7bVar2 = x7bVar;
                    v7b.m23844a(x7bVar2.f97083a, c14968c2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r1.unlock(null);
                throw th4;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: x7b$b */
    @ck3(m4009c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", m4010f = "MutatorMutex.kt", m4011i = {0, 0, 1, 1}, m4012l = {220, 173}, m4013m = "invokeSuspend", m4014n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, m4015s = {"L$0", "L$1", "L$0", "L$1"})
    @dwf({"SMAP\nMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutateWith$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,214:1\n120#2,10:215\n*S KotlinDebug\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutateWith$2\n*L\n171#1:215,10\n*E\n"})
    public static final class C14967b<R> extends ugg implements gz6<x13, zy2<? super R>, Object> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ x7b f97093C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ gz6<T, zy2<? super R>, Object> f97094F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ T f97095H;

        /* JADX INFO: renamed from: a */
        public Object f97096a;

        /* JADX INFO: renamed from: b */
        public Object f97097b;

        /* JADX INFO: renamed from: c */
        public Object f97098c;

        /* JADX INFO: renamed from: d */
        public Object f97099d;

        /* JADX INFO: renamed from: e */
        public int f97100e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f97101f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ j7b f97102m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14967b(j7b j7bVar, x7b x7bVar, gz6<? super T, ? super zy2<? super R>, ? extends Object> gz6Var, T t, zy2<? super C14967b> zy2Var) {
            super(2, zy2Var);
            this.f97102m = j7bVar;
            this.f97093C = x7bVar;
            this.f97094F = gz6Var;
            this.f97095H = t;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C14967b c14967b = new C14967b(this.f97102m, this.f97093C, this.f97094F, this.f97095H, zy2Var);
            c14967b.f97101f = obj;
            return c14967b;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super R> zy2Var) {
            return ((C14967b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, y7b] */
        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            y7b y7bVar;
            gz6 gz6Var;
            Object obj2;
            C14968c c14968c;
            x7b x7bVar;
            C14968c c14968c2;
            Throwable th;
            x7b x7bVar2;
            y7b y7bVar2;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            ?? r1 = this.f97100e;
            try {
                try {
                    if (r1 == 0) {
                        y7e.throwOnFailure(obj);
                        x13 x13Var = (x13) this.f97101f;
                        j7b j7bVar = this.f97102m;
                        e13.InterfaceC5040b interfaceC5040b = x13Var.getCoroutineContext().get(jj8.f50715A);
                        md8.checkNotNull(interfaceC5040b);
                        C14968c c14968c3 = new C14968c(j7bVar, (jj8) interfaceC5040b);
                        this.f97093C.tryMutateOrCancel(c14968c3);
                        y7bVar = this.f97093C.f97084b;
                        gz6Var = this.f97094F;
                        Object obj3 = this.f97095H;
                        x7b x7bVar3 = this.f97093C;
                        this.f97101f = c14968c3;
                        this.f97096a = y7bVar;
                        this.f97097b = gz6Var;
                        this.f97098c = obj3;
                        this.f97099d = x7bVar3;
                        this.f97100e = 1;
                        if (y7bVar.lock(null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj2 = obj3;
                        c14968c = c14968c3;
                        x7bVar = x7bVar3;
                    } else {
                        if (r1 != 1) {
                            if (r1 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            x7bVar2 = (x7b) this.f97097b;
                            y7bVar2 = (y7b) this.f97096a;
                            c14968c2 = (C14968c) this.f97101f;
                            try {
                                y7e.throwOnFailure(obj);
                                v7b.m23844a(x7bVar2.f97083a, c14968c2, null);
                                y7bVar2.unlock(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                v7b.m23844a(x7bVar2.f97083a, c14968c2, null);
                                throw th;
                            }
                        }
                        x7bVar = (x7b) this.f97099d;
                        obj2 = this.f97098c;
                        gz6Var = (gz6) this.f97097b;
                        y7b y7bVar3 = (y7b) this.f97096a;
                        c14968c = (C14968c) this.f97101f;
                        y7e.throwOnFailure(obj);
                        y7bVar = y7bVar3;
                    }
                    this.f97101f = c14968c;
                    this.f97096a = y7bVar;
                    this.f97097b = x7bVar;
                    this.f97098c = null;
                    this.f97099d = null;
                    this.f97100e = 2;
                    Object objInvoke = gz6Var.invoke(obj2, this);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    x7bVar2 = x7bVar;
                    y7bVar2 = y7bVar;
                    obj = objInvoke;
                    c14968c2 = c14968c;
                    v7b.m23844a(x7bVar2.f97083a, c14968c2, null);
                    y7bVar2.unlock(null);
                    return obj;
                } catch (Throwable th3) {
                    c14968c2 = c14968c;
                    th = th3;
                    x7bVar2 = x7bVar;
                    v7b.m23844a(x7bVar2.f97083a, c14968c2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r1.unlock(null);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: x7b$c */
    public static final class C14968c {

        /* JADX INFO: renamed from: a */
        @yfb
        public final j7b f97103a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final jj8 f97104b;

        public C14968c(@yfb j7b j7bVar, @yfb jj8 jj8Var) {
            this.f97103a = j7bVar;
            this.f97104b = jj8Var;
        }

        public final boolean canInterrupt(@yfb C14968c c14968c) {
            return this.f97103a.compareTo(c14968c.f97103a) >= 0;
        }

        public final void cancel() {
            this.f97104b.cancel((CancellationException) new p7b());
        }

        @yfb
        public final jj8 getJob() {
            return this.f97104b;
        }

        @yfb
        public final j7b getPriority() {
            return this.f97103a;
        }
    }

    public static /* synthetic */ Object mutate$default(x7b x7bVar, j7b j7bVar, qy6 qy6Var, zy2 zy2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            j7bVar = j7b.Default;
        }
        return x7bVar.mutate(j7bVar, qy6Var, zy2Var);
    }

    public static /* synthetic */ Object mutateWith$default(x7b x7bVar, Object obj, j7b j7bVar, gz6 gz6Var, zy2 zy2Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            j7bVar = j7b.Default;
        }
        return x7bVar.mutateWith(obj, j7bVar, gz6Var, zy2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryMutateOrCancel(C14968c c14968c) {
        C14968c c14968c2;
        do {
            c14968c2 = this.f97083a.get();
            if (c14968c2 != null && !c14968c.canInterrupt(c14968c2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!v7b.m23844a(this.f97083a, c14968c2, c14968c));
        if (c14968c2 != null) {
            c14968c2.cancel();
        }
    }

    @gib
    public final <R> Object mutate(@yfb j7b j7bVar, @yfb qy6<? super zy2<? super R>, ? extends Object> qy6Var, @yfb zy2<? super R> zy2Var) {
        return y13.coroutineScope(new C14966a(j7bVar, this, qy6Var, null), zy2Var);
    }

    @gib
    public final <T, R> Object mutateWith(T t, @yfb j7b j7bVar, @yfb gz6<? super T, ? super zy2<? super R>, ? extends Object> gz6Var, @yfb zy2<? super R> zy2Var) {
        return y13.coroutineScope(new C14967b(j7bVar, this, gz6Var, t, null), zy2Var);
    }

    @yjd
    public final boolean tryLock() {
        return y7b.C15538a.tryLock$default(this.f97084b, null, 1, null);
    }

    public final boolean tryMutate(@yfb ny6<bth> ny6Var) {
        boolean zTryLock = tryLock();
        if (zTryLock) {
            try {
                ny6Var.invoke();
            } finally {
                o28.finallyStart(1);
                unlock();
                o28.finallyEnd(1);
            }
        }
        return zTryLock;
    }

    @yjd
    public final void unlock() {
        y7b.C15538a.unlock$default(this.f97084b, null, 1, null);
    }
}
