package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000.d8b;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n369#2,12:315\n1#3:327\n*S KotlinDebug\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n*L\n171#1:315,12\n*E\n"})
public class d8b extends jye implements y7b {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28744i = AtomicReferenceFieldUpdater.newUpdater(d8b.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h */
    @yfb
    public final kz6<pve<?>, Object, Object, kz6<Throwable, Object, e13, bth>> f28745h;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: renamed from: d8b$a */
    @dwf({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n1#2:315\n*E\n"})
    public final class C4666a implements dq1<bth>, wgi {

        /* JADX INFO: renamed from: a */
        @un8
        @yfb
        public final fq1<bth> f28746a;

        /* JADX INFO: renamed from: b */
        @gib
        @un8
        public final Object f28747b;

        /* JADX WARN: Multi-variable type inference failed */
        public C4666a(@yfb fq1<? super bth> fq1Var, @gib Object obj) {
            this.f28746a = fq1Var;
            this.f28747b = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bth resume$lambda$6(d8b d8bVar, C4666a c4666a, Throwable th) {
            d8bVar.unlock(c4666a.f28747b);
            return bth.f14751a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bth tryResume$lambda$3(d8b d8bVar, C4666a c4666a, Throwable th, bth bthVar, e13 e13Var) {
            d8b.getOwner$volatile$FU().set(d8bVar, c4666a.f28747b);
            d8bVar.unlock(c4666a.f28747b);
            return bth.f14751a;
        }

        @Override // p000.dq1
        public boolean cancel(@gib Throwable th) {
            return this.f28746a.cancel(th);
        }

        @Override // p000.dq1
        @la8
        public void completeResume(@yfb Object obj) {
            this.f28746a.completeResume(obj);
        }

        @Override // p000.zy2
        @yfb
        public e13 getContext() {
            return this.f28746a.getContext();
        }

        @Override // p000.dq1
        @la8
        public void initCancellability() {
            this.f28746a.initCancellability();
        }

        @Override // p000.dq1
        public void invokeOnCancellation(@yfb qy6<? super Throwable, bth> qy6Var) {
            this.f28746a.invokeOnCancellation(qy6Var);
        }

        @Override // p000.dq1
        public boolean isActive() {
            return this.f28746a.isActive();
        }

        @Override // p000.dq1
        public boolean isCancelled() {
            return this.f28746a.isCancelled();
        }

        @Override // p000.dq1
        public boolean isCompleted() {
            return this.f28746a.isCompleted();
        }

        @q64(level = u64.f86865a, message = "Use the overload that also accepts the `value` and the coroutine context in lambda", replaceWith = @i2e(expression = "resume(value) { cause, _, _ -> onCancellation(cause) }", imports = {}))
        /* JADX INFO: renamed from: resume, reason: avoid collision after fix types in other method */
        public void resume2(@yfb bth bthVar, @gib qy6<? super Throwable, bth> qy6Var) {
            this.f28746a.resume(bthVar, qy6Var);
        }

        @Override // p000.dq1
        @wg5
        public void resumeUndispatched(@yfb m13 m13Var, @yfb bth bthVar) {
            this.f28746a.resumeUndispatched(m13Var, bthVar);
        }

        @Override // p000.dq1
        @wg5
        public void resumeUndispatchedWithException(@yfb m13 m13Var, @yfb Throwable th) {
            this.f28746a.resumeUndispatchedWithException(m13Var, th);
        }

        @Override // p000.zy2
        public void resumeWith(@yfb Object obj) {
            this.f28746a.resumeWith(obj);
        }

        @Override // p000.dq1
        @gib
        @la8
        public Object tryResume(@yfb bth bthVar, @gib Object obj) {
            return this.f28746a.tryResume(bthVar, obj);
        }

        @Override // p000.dq1
        @gib
        @la8
        public Object tryResumeWithException(@yfb Throwable th) {
            return this.f28746a.tryResumeWithException(th);
        }

        @Override // p000.wgi
        public void invokeOnCancellation(@yfb sue<?> sueVar, int i) {
            this.f28746a.invokeOnCancellation(sueVar, i);
        }

        @Override // p000.dq1
        public /* bridge */ /* synthetic */ void resume(bth bthVar, qy6 qy6Var) {
            resume2(bthVar, (qy6<? super Throwable, bth>) qy6Var);
        }

        @Override // p000.dq1
        public /* bridge */ /* synthetic */ void resume(Object obj, kz6 kz6Var) {
            resume((bth) obj, (kz6<? super Throwable, ? super bth, ? super e13, bth>) kz6Var);
        }

        @Override // p000.dq1
        public /* bridge */ /* synthetic */ Object tryResume(Object obj, Object obj2, kz6 kz6Var) {
            return tryResume((bth) obj, obj2, (kz6<? super Throwable, ? super bth, ? super e13, bth>) kz6Var);
        }

        public <R extends bth> void resume(@yfb R r, @gib kz6<? super Throwable, ? super R, ? super e13, bth> kz6Var) {
            d8b.getOwner$volatile$FU().set(d8b.this, this.f28747b);
            fq1<bth> fq1Var = this.f28746a;
            final d8b d8bVar = d8b.this;
            fq1Var.resume(r, new qy6() { // from class: c8b
                @Override // p000.qy6
                public final Object invoke(Object obj) {
                    return d8b.C4666a.resume$lambda$6(d8bVar, this, (Throwable) obj);
                }
            });
        }

        @gib
        public <R extends bth> Object tryResume(@yfb R r, @gib Object obj, @gib kz6<? super Throwable, ? super R, ? super e13, bth> kz6Var) {
            final d8b d8bVar = d8b.this;
            Object objTryResume = this.f28746a.tryResume(r, obj, new kz6() { // from class: b8b
                @Override // p000.kz6
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return d8b.C4666a.tryResume$lambda$3(d8bVar, this, (Throwable) obj2, (bth) obj3, (e13) obj4);
                }
            });
            if (objTryResume != null) {
                d8b.getOwner$volatile$FU().set(d8b.this, this.f28747b);
            }
            return objTryResume;
        }
    }

    /* JADX INFO: renamed from: d8b$b */
    @dwf({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$SelectInstanceWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n1#2:315\n*E\n"})
    public final class C4667b<Q> implements qve<Q> {

        /* JADX INFO: renamed from: a */
        @un8
        @yfb
        public final qve<Q> f28749a;

        /* JADX INFO: renamed from: b */
        @gib
        @un8
        public final Object f28750b;

        public C4667b(@yfb qve<Q> qveVar, @gib Object obj) {
            this.f28749a = qveVar;
            this.f28750b = obj;
        }

        @Override // p000.pve
        public void disposeOnCompletion(@yfb yf4 yf4Var) {
            this.f28749a.disposeOnCompletion(yf4Var);
        }

        @Override // p000.pve
        @yfb
        public e13 getContext() {
            return this.f28749a.getContext();
        }

        @Override // p000.wgi
        public void invokeOnCancellation(@yfb sue<?> sueVar, int i) {
            this.f28749a.invokeOnCancellation(sueVar, i);
        }

        @Override // p000.pve
        public void selectInRegistrationPhase(@gib Object obj) {
            d8b.getOwner$volatile$FU().set(d8b.this, this.f28750b);
            this.f28749a.selectInRegistrationPhase(obj);
        }

        @Override // p000.pve
        public boolean trySelect(@yfb Object obj, @gib Object obj2) {
            boolean zTrySelect = this.f28749a.trySelect(obj, obj2);
            d8b d8bVar = d8b.this;
            if (zTrySelect) {
                d8b.getOwner$volatile$FU().set(d8bVar, this.f28750b);
            }
            return zTrySelect;
        }
    }

    /* JADX INFO: renamed from: d8b$c */
    public /* synthetic */ class C4668c extends n07 implements kz6<d8b, pve<?>, Object, bth> {

        /* JADX INFO: renamed from: a */
        public static final C4668c f28752a = new C4668c();

        public C4668c() {
            super(3, d8b.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ bth invoke(d8b d8bVar, pve<?> pveVar, Object obj) {
            invoke2(d8bVar, pveVar, obj);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(d8b d8bVar, pve<?> pveVar, Object obj) {
            d8bVar.m8979h(pveVar, obj);
        }
    }

    /* JADX INFO: renamed from: d8b$d */
    public /* synthetic */ class C4669d extends n07 implements kz6<d8b, Object, Object, Object> {

        /* JADX INFO: renamed from: a */
        public static final C4669d f28753a = new C4669d();

        public C4669d() {
            super(3, d8b.class, "onLockProcessResult", "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // p000.kz6
        public final Object invoke(d8b d8bVar, Object obj, Object obj2) {
            return d8bVar.m8978g(obj, obj2);
        }
    }

    public d8b(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : e8b.f32117a;
        this.f28745h = new kz6() { // from class: a8b
            @Override // p000.kz6
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return d8b.onSelectCancellationUnlockConstructor$lambda$1(this.f620a, (pve) obj, obj2, obj3);
            }
        };
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m8977f(d8b d8bVar, Object obj, zy2<? super bth> zy2Var) {
        Object objLockSuspend;
        return (!d8bVar.tryLock(obj) && (objLockSuspend = d8bVar.lockSuspend(obj, zy2Var)) == pd8.getCOROUTINE_SUSPENDED()) ? objLockSuspend : bth.f14751a;
    }

    public static /* synthetic */ void getOnLock$annotations() {
    }

    private final /* synthetic */ Object getOwner$volatile() {
        return this.owner$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater getOwner$volatile$FU() {
        return f28744i;
    }

    private final int holdsLockImpl(Object obj) {
        while (isLocked()) {
            Object obj2 = f28744i.get(this);
            if (obj2 != e8b.f32117a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object lockSuspend(Object obj, zy2<? super bth> zy2Var) {
        fq1 orCreateCancellableContinuation = hq1.getOrCreateCancellableContinuation(od8.intercepted(zy2Var));
        try {
            m14385b(new C4666a(orCreateCancellableContinuation, obj));
            Object result = orCreateCancellableContinuation.getResult();
            if (result == pd8.getCOROUTINE_SUSPENDED()) {
                jk3.probeCoroutineSuspended(zy2Var);
            }
            return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kz6 onSelectCancellationUnlockConstructor$lambda$1(final d8b d8bVar, pve pveVar, final Object obj, Object obj2) {
        return new kz6() { // from class: z7b
            @Override // p000.kz6
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return d8b.onSelectCancellationUnlockConstructor$lambda$1$lambda$0(this.f104333a, obj, (Throwable) obj3, obj4, (e13) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth onSelectCancellationUnlockConstructor$lambda$1$lambda$0(d8b d8bVar, Object obj, Throwable th, Object obj2, e13 e13Var) {
        d8bVar.unlock(obj);
        return bth.f14751a;
    }

    private final /* synthetic */ void setOwner$volatile(Object obj) {
        this.owner$volatile = obj;
    }

    private final int tryLockImpl(Object obj) {
        while (!tryAcquire()) {
            if (obj == null) {
                return 1;
            }
            int iHoldsLockImpl = holdsLockImpl(obj);
            if (iHoldsLockImpl == 1) {
                return 2;
            }
            if (iHoldsLockImpl == 2) {
                return 1;
            }
        }
        f28744i.set(this, obj);
        return 0;
    }

    @gib
    /* JADX INFO: renamed from: g */
    public Object m8978g(@gib Object obj, @gib Object obj2) {
        if (!md8.areEqual(obj2, e8b.f32118b)) {
            return this;
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // p000.y7b
    @yfb
    public lve<Object, y7b> getOnLock() {
        C4668c c4668c = C4668c.f28752a;
        md8.checkNotNull(c4668c, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        kz6 kz6Var = (kz6) qlh.beforeCheckcastToFunctionOfArity(c4668c, 3);
        C4669d c4669d = C4669d.f28753a;
        md8.checkNotNull(c4669d, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new mve(this, kz6Var, (kz6) qlh.beforeCheckcastToFunctionOfArity(c4669d, 3), this.f28745h);
    }

    /* JADX INFO: renamed from: h */
    public void m8979h(@yfb pve<?> pveVar, @gib Object obj) {
        if (obj != null && holdsLock(obj)) {
            pveVar.selectInRegistrationPhase(e8b.f32118b);
        } else {
            md8.checkNotNull(pveVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
            m14386c(new C4667b((qve) pveVar, obj), obj);
        }
    }

    @Override // p000.y7b
    public boolean holdsLock(@yfb Object obj) {
        return holdsLockImpl(obj) == 1;
    }

    @Override // p000.y7b
    public boolean isLocked() {
        return getAvailablePermits() == 0;
    }

    @Override // p000.y7b
    @gib
    public Object lock(@gib Object obj, @yfb zy2<? super bth> zy2Var) {
        return m8977f(this, obj, zy2Var);
    }

    @yfb
    public String toString() {
        return "Mutex@" + kk3.getHexAddress(this) + "[isLocked=" + isLocked() + ",owner=" + f28744i.get(this) + C4584d2.f28243l;
    }

    @Override // p000.y7b
    public boolean tryLock(@gib Object obj) {
        int iTryLockImpl = tryLockImpl(obj);
        if (iTryLockImpl == 0) {
            return true;
        }
        if (iTryLockImpl == 1) {
            return false;
        }
        if (iTryLockImpl != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // p000.y7b
    public void unlock(@gib Object obj) {
        while (isLocked()) {
            Object obj2 = f28744i.get(this);
            if (obj2 != e8b.f32117a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (C0051a4.m134a(f28744i, this, obj2, e8b.f32117a)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }
}
