package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import p000.kad;
import p000.v7e;

/* JADX INFO: loaded from: classes3.dex */
@c5e(16)
@dwf({"SMAP\nCredentialManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CredentialManager.kt\nandroidx/credentials/CredentialManager\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,450:1\n314#2,11:451\n314#2,11:462\n314#2,11:473\n314#2,11:484\n314#2,11:495\n*S KotlinDebug\n*F\n+ 1 CredentialManager.kt\nandroidx/credentials/CredentialManager\n*L\n115#1:451,11\n163#1:462,11\n205#1:473,11\n246#1:484,11\n290#1:495,11\n*E\n"})
@igg({"ObsoleteSdkInt"})
public interface q63 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C11313a f73308a = C11313a.f73309a;

    /* JADX INFO: renamed from: q63$a */
    public static final class C11313a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C11313a f73309a = new C11313a();

        private C11313a() {
        }

        @do8
        @yfb
        public final q63 create(@yfb Context context) {
            md8.checkNotNullParameter(context, "context");
            return new s63(context);
        }
    }

    /* JADX INFO: renamed from: q63$b */
    public static final class C11314b extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CancellationSignal f73310a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11314b(CancellationSignal cancellationSignal) {
            super(1);
            this.f73310a = cancellationSignal;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib Throwable th) {
            this.f73310a.cancel();
        }
    }

    /* JADX INFO: renamed from: q63$c */
    public static final class C11315c implements r63<Void, y12> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dq1<bth> f73311a;

        /* JADX WARN: Multi-variable type inference failed */
        public C11315c(dq1<? super bth> dq1Var) {
            this.f73311a = dq1Var;
        }

        @Override // p000.r63
        public void onError(@yfb y12 y12Var) {
            md8.checkNotNullParameter(y12Var, "e");
            dq1<bth> dq1Var = this.f73311a;
            v7e.C13927a c13927a = v7e.f90266b;
            dq1Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(y12Var)));
        }

        @Override // p000.r63
        public void onResult(@gib Void r2) {
            dq1<bth> dq1Var = this.f73311a;
            v7e.C13927a c13927a = v7e.f90266b;
            dq1Var.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
        }
    }

    /* JADX INFO: renamed from: q63$d */
    public static final class C11316d extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CancellationSignal f73312a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11316d(CancellationSignal cancellationSignal) {
            super(1);
            this.f73312a = cancellationSignal;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib Throwable th) {
            this.f73312a.cancel();
        }
    }

    /* JADX INFO: renamed from: q63$e */
    public static final class C11317e implements r63<q53, l53> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dq1<q53> f73313a;

        /* JADX WARN: Multi-variable type inference failed */
        public C11317e(dq1<? super q53> dq1Var) {
            this.f73313a = dq1Var;
        }

        @Override // p000.r63
        public void onError(@yfb l53 l53Var) {
            md8.checkNotNullParameter(l53Var, "e");
            dq1<q53> dq1Var = this.f73313a;
            v7e.C13927a c13927a = v7e.f90266b;
            dq1Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(l53Var)));
        }

        @Override // p000.r63
        public void onResult(@yfb q53 q53Var) {
            md8.checkNotNullParameter(q53Var, "result");
            dq1<q53> dq1Var = this.f73313a;
            v7e.C13927a c13927a = v7e.f90266b;
            dq1Var.resumeWith(v7e.m32723constructorimpl(q53Var));
        }
    }

    /* JADX INFO: renamed from: q63$f */
    public static final class C11318f extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CancellationSignal f73314a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11318f(CancellationSignal cancellationSignal) {
            super(1);
            this.f73314a = cancellationSignal;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib Throwable th) {
            this.f73314a.cancel();
        }
    }

    /* JADX INFO: renamed from: q63$g */
    public static final class C11319g implements r63<a47, w37> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dq1<a47> f73315a;

        /* JADX WARN: Multi-variable type inference failed */
        public C11319g(dq1<? super a47> dq1Var) {
            this.f73315a = dq1Var;
        }

        @Override // p000.r63
        public void onError(@yfb w37 w37Var) {
            md8.checkNotNullParameter(w37Var, "e");
            dq1<a47> dq1Var = this.f73315a;
            v7e.C13927a c13927a = v7e.f90266b;
            dq1Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(w37Var)));
        }

        @Override // p000.r63
        public void onResult(@yfb a47 a47Var) {
            md8.checkNotNullParameter(a47Var, "result");
            dq1<a47> dq1Var = this.f73315a;
            v7e.C13927a c13927a = v7e.f90266b;
            dq1Var.resumeWith(v7e.m32723constructorimpl(a47Var));
        }
    }

    /* JADX INFO: renamed from: q63$h */
    public static final class C11320h extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CancellationSignal f73316a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11320h(CancellationSignal cancellationSignal) {
            super(1);
            this.f73316a = cancellationSignal;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib Throwable th) {
            this.f73316a.cancel();
        }
    }

    /* JADX INFO: renamed from: q63$i */
    public static final class C11321i implements r63<a47, w37> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dq1<a47> f73317a;

        /* JADX WARN: Multi-variable type inference failed */
        public C11321i(dq1<? super a47> dq1Var) {
            this.f73317a = dq1Var;
        }

        @Override // p000.r63
        public void onError(@yfb w37 w37Var) {
            md8.checkNotNullParameter(w37Var, "e");
            dq1<a47> dq1Var = this.f73317a;
            v7e.C13927a c13927a = v7e.f90266b;
            dq1Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(w37Var)));
        }

        @Override // p000.r63
        public void onResult(@yfb a47 a47Var) {
            md8.checkNotNullParameter(a47Var, "result");
            dq1<a47> dq1Var = this.f73317a;
            v7e.C13927a c13927a = v7e.f90266b;
            dq1Var.resumeWith(v7e.m32723constructorimpl(a47Var));
        }
    }

    /* JADX INFO: renamed from: q63$j */
    public static final class C11322j extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CancellationSignal f73318a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11322j(CancellationSignal cancellationSignal) {
            super(1);
            this.f73318a = cancellationSignal;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib Throwable th) {
            this.f73318a.cancel();
        }
    }

    /* JADX INFO: renamed from: q63$k */
    public static final class C11323k implements r63<kad, w37> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dq1<kad> f73319a;

        /* JADX WARN: Multi-variable type inference failed */
        public C11323k(dq1<? super kad> dq1Var) {
            this.f73319a = dq1Var;
        }

        @Override // p000.r63
        public void onError(@yfb w37 w37Var) {
            md8.checkNotNullParameter(w37Var, "e");
            dq1<kad> dq1Var = this.f73319a;
            v7e.C13927a c13927a = v7e.f90266b;
            dq1Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(w37Var)));
        }

        @Override // p000.r63
        public void onResult(@yfb kad kadVar) {
            md8.checkNotNullParameter(kadVar, "result");
            dq1<kad> dq1Var = this.f73319a;
            v7e.C13927a c13927a = v7e.f90266b;
            dq1Var.resumeWith(v7e.m32723constructorimpl(kadVar));
        }
    }

    static /* synthetic */ Object clearCredentialState$suspendImpl(q63 q63Var, b22 b22Var, zy2<? super bth> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        CancellationSignal cancellationSignal = new CancellationSignal();
        fq1Var.invokeOnCancellation(new C11314b(cancellationSignal));
        q63Var.clearCredentialStateAsync(b22Var, cancellationSignal, new p63(), new C11315c(fq1Var));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
    }

    @do8
    @yfb
    static q63 create(@yfb Context context) {
        return f73308a.create(context);
    }

    static /* synthetic */ Object createCredential$suspendImpl(q63 q63Var, Context context, p53 p53Var, zy2<? super q53> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        CancellationSignal cancellationSignal = new CancellationSignal();
        fq1Var.invokeOnCancellation(new C11316d(cancellationSignal));
        q63Var.createCredentialAsync(context, p53Var, cancellationSignal, new p63(), new C11317e(fq1Var));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result;
    }

    static /* synthetic */ Object getCredential$suspendImpl(q63 q63Var, Context context, z37 z37Var, zy2<? super a47> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        CancellationSignal cancellationSignal = new CancellationSignal();
        fq1Var.invokeOnCancellation(new C11318f(cancellationSignal));
        q63Var.getCredentialAsync(context, z37Var, cancellationSignal, new p63(), new C11319g(fq1Var));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result;
    }

    @c5e(34)
    static /* synthetic */ Object prepareGetCredential$suspendImpl(q63 q63Var, z37 z37Var, zy2<? super kad> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        CancellationSignal cancellationSignal = new CancellationSignal();
        fq1Var.invokeOnCancellation(new C11322j(cancellationSignal));
        q63Var.prepareGetCredentialAsync(z37Var, cancellationSignal, new p63(), new C11323k(fq1Var));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result;
    }

    @gib
    default Object clearCredentialState(@yfb b22 b22Var, @yfb zy2<? super bth> zy2Var) {
        return clearCredentialState$suspendImpl(this, b22Var, zy2Var);
    }

    void clearCredentialStateAsync(@yfb b22 b22Var, @gib CancellationSignal cancellationSignal, @yfb Executor executor, @yfb r63<Void, y12> r63Var);

    @gib
    default Object createCredential(@yfb Context context, @yfb p53 p53Var, @yfb zy2<? super q53> zy2Var) {
        return createCredential$suspendImpl(this, context, p53Var, zy2Var);
    }

    void createCredentialAsync(@yfb Context context, @yfb p53 p53Var, @gib CancellationSignal cancellationSignal, @yfb Executor executor, @yfb r63<q53, l53> r63Var);

    @c5e(34)
    @yfb
    PendingIntent createSettingsPendingIntent();

    @gib
    default Object getCredential(@yfb Context context, @yfb z37 z37Var, @yfb zy2<? super a47> zy2Var) {
        return getCredential$suspendImpl(this, context, z37Var, zy2Var);
    }

    @c5e(34)
    void getCredentialAsync(@yfb Context context, @yfb kad.C8269b c8269b, @gib CancellationSignal cancellationSignal, @yfb Executor executor, @yfb r63<a47, w37> r63Var);

    void getCredentialAsync(@yfb Context context, @yfb z37 z37Var, @gib CancellationSignal cancellationSignal, @yfb Executor executor, @yfb r63<a47, w37> r63Var);

    @c5e(34)
    @gib
    default Object prepareGetCredential(@yfb z37 z37Var, @yfb zy2<? super kad> zy2Var) {
        return prepareGetCredential$suspendImpl(this, z37Var, zy2Var);
    }

    @c5e(34)
    void prepareGetCredentialAsync(@yfb z37 z37Var, @gib CancellationSignal cancellationSignal, @yfb Executor executor, @yfb r63<kad, w37> r63Var);

    @c5e(34)
    @gib
    default Object getCredential(@yfb Context context, @yfb kad.C8269b c8269b, @yfb zy2<? super a47> zy2Var) {
        return getCredential$suspendImpl(this, context, c8269b, zy2Var);
    }

    @c5e(34)
    static /* synthetic */ Object getCredential$suspendImpl(q63 q63Var, Context context, kad.C8269b c8269b, zy2<? super a47> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        CancellationSignal cancellationSignal = new CancellationSignal();
        fq1Var.invokeOnCancellation(new C11320h(cancellationSignal));
        q63Var.getCredentialAsync(context, c8269b, cancellationSignal, new p63(), new C11321i(fq1Var));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result;
    }
}
