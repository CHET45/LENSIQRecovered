package p000;

import java.util.concurrent.CancellationException;
import p000.jj8;

/* JADX INFO: loaded from: classes3.dex */
public final class s61<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final s13<T> f80738a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final gz6<lb9<T>, zy2<? super bth>, Object> f80739b;

    /* JADX INFO: renamed from: c */
    public final long f80740c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final x13 f80741d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final ny6<bth> f80742e;

    /* JADX INFO: renamed from: f */
    @gib
    public jj8 f80743f;

    /* JADX INFO: renamed from: g */
    @gib
    public jj8 f80744g;

    /* JADX INFO: renamed from: s61$a */
    @ck3(m4009c = "androidx.lifecycle.BlockRunner$cancel$1", m4010f = "CoroutineLiveData.kt", m4011i = {}, m4012l = {188}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C12456a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f80745a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ s61<T> f80746b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12456a(s61<T> s61Var, zy2<? super C12456a> zy2Var) {
            super(2, zy2Var);
            this.f80746b = s61Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C12456a(this.f80746b, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C12456a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f80745a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                long j = this.f80746b.f80740c;
                this.f80745a = 1;
                if (p34.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            if (!this.f80746b.f80738a.hasActiveObservers()) {
                jj8 jj8Var = this.f80746b.f80743f;
                if (jj8Var != null) {
                    jj8.C7916a.cancel$default(jj8Var, (CancellationException) null, 1, (Object) null);
                }
                this.f80746b.f80743f = null;
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: s61$b */
    @ck3(m4009c = "androidx.lifecycle.BlockRunner$maybeRun$1", m4010f = "CoroutineLiveData.kt", m4011i = {}, m4012l = {177}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C12457b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f80747a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f80748b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ s61<T> f80749c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12457b(s61<T> s61Var, zy2<? super C12457b> zy2Var) {
            super(2, zy2Var);
            this.f80749c = s61Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C12457b c12457b = new C12457b(this.f80749c, zy2Var);
            c12457b.f80748b = obj;
            return c12457b;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C12457b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f80747a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                mb9 mb9Var = new mb9(this.f80749c.f80738a, ((x13) this.f80748b).getCoroutineContext());
                gz6 gz6Var = this.f80749c.f80739b;
                this.f80747a = 1;
                if (gz6Var.invoke(mb9Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            this.f80749c.f80742e.invoke();
            return bth.f14751a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s61(@yfb s13<T> s13Var, @yfb gz6<? super lb9<T>, ? super zy2<? super bth>, ? extends Object> gz6Var, long j, @yfb x13 x13Var, @yfb ny6<bth> ny6Var) {
        md8.checkNotNullParameter(s13Var, "liveData");
        md8.checkNotNullParameter(gz6Var, "block");
        md8.checkNotNullParameter(x13Var, "scope");
        md8.checkNotNullParameter(ny6Var, "onDone");
        this.f80738a = s13Var;
        this.f80739b = gz6Var;
        this.f80740c = j;
        this.f80741d = x13Var;
        this.f80742e = ny6Var;
    }

    @ir9
    public final void cancel() {
        if (this.f80744g != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
        this.f80744g = fg1.launch$default(this.f80741d, df4.getMain().getImmediate(), null, new C12456a(this, null), 2, null);
    }

    @ir9
    public final void maybeRun() {
        jj8 jj8Var = this.f80744g;
        if (jj8Var != null) {
            jj8.C7916a.cancel$default(jj8Var, (CancellationException) null, 1, (Object) null);
        }
        this.f80744g = null;
        if (this.f80743f != null) {
            return;
        }
        this.f80743f = fg1.launch$default(this.f80741d, null, null, new C12457b(this, null), 3, null);
    }
}
