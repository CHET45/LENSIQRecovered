package p000;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
public final class c89 {

    /* JADX INFO: renamed from: c89$a */
    @ck3(m4009c = "kotlinx.coroutines.flow.LintKt$retry$1", m4010f = "Lint.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C2235a extends ugg implements gz6<Throwable, zy2<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a */
        public int f15965a;

        public C2235a(zy2<? super C2235a> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return new C2235a(zy2Var);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f15965a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return wc1.boxBoolean(true);
        }

        @Override // p000.gz6
        public final Object invoke(Throwable th, zy2<? super Boolean> zy2Var) {
            return ((C2235a) create(th, zy2Var)).invokeSuspend(bth.f14751a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ y56 m3840a(q9f q9fVar, long j, gz6 gz6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        if ((i & 2) != 0) {
            gz6Var = new C2235a(null);
        }
        md8.checkNotNull(q9fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>");
        return c76.retry(q9fVar, j, gz6Var);
    }

    @q64(level = u64.f86866b, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @i2e(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    public static final void cancel(@yfb t66<?> t66Var, @gib CancellationException cancellationException) {
        c76.noImpl();
        throw new us8();
    }

    public static /* synthetic */ void cancel$default(t66 t66Var, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        cancel(t66Var, cancellationException);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Applying 'cancellable' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @i2e(expression = "this", imports = {}))
    public static final <T> y56<T> cancellable(@yfb q9f<? extends T> q9fVar) {
        c76.noImpl();
        throw new us8();
    }

    @t28
    @q64(level = u64.f86865a, message = "SharedFlow never completes, so this operator typically has not effect, it can only catch exceptions from 'onSubscribe' operator", replaceWith = @i2e(expression = "this", imports = {}))
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    private static final <T> y56<T> m28226catch(q9f<? extends T> q9fVar, kz6<? super t66<? super T>, ? super Throwable, ? super zy2<? super bth>, ? extends Object> kz6Var) {
        md8.checkNotNull(q9fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.catch>");
        return c76.m28222catch(q9fVar, kz6Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Applying 'conflate' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @i2e(expression = "this", imports = {}))
    public static final <T> y56<T> conflate(@yfb l2g<? extends T> l2gVar) {
        c76.noImpl();
        throw new us8();
    }

    @t28
    @q64(level = u64.f86865a, message = "SharedFlow never completes, so this terminal operation never completes.")
    private static final <T> Object count(q9f<? extends T> q9fVar, zy2<? super Integer> zy2Var) {
        md8.checkNotNull(q9fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.count>");
        o28.mark(0);
        Object objCount = c76.count(q9fVar, zy2Var);
        o28.mark(1);
        return objCount;
    }

    @yfb
    @q64(level = u64.f86866b, message = "Applying 'distinctUntilChanged' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @i2e(expression = "this", imports = {}))
    public static final <T> y56<T> distinctUntilChanged(@yfb l2g<? extends T> l2gVar) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    @q64(level = u64.f86866b, message = "Applying 'flowOn' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @i2e(expression = "this", imports = {}))
    public static final <T> y56<T> flowOn(@yfb q9f<? extends T> q9fVar, @yfb e13 e13Var) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    public static final e13 getCoroutineContext(@yfb t66<?> t66Var) {
        c76.noImpl();
        throw new us8();
    }

    @q64(level = u64.f86866b, message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly", replaceWith = @i2e(expression = "currentCoroutineContext()", imports = {}))
    public static /* synthetic */ void getCoroutineContext$annotations(t66 t66Var) {
    }

    public static final boolean isActive(@yfb t66<?> t66Var) {
        c76.noImpl();
        throw new us8();
    }

    @q64(level = u64.f86866b, message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default.", replaceWith = @i2e(expression = "currentCoroutineContext().isActive", imports = {}))
    public static /* synthetic */ void isActive$annotations(t66 t66Var) {
    }

    @t28
    @q64(level = u64.f86865a, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @i2e(expression = "this", imports = {}))
    private static final <T> y56<T> retry(q9f<? extends T> q9fVar, long j, gz6<? super Throwable, ? super zy2<? super Boolean>, ? extends Object> gz6Var) {
        md8.checkNotNull(q9fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>");
        return c76.retry(q9fVar, j, gz6Var);
    }

    @t28
    @q64(level = u64.f86865a, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @i2e(expression = "this", imports = {}))
    private static final <T> y56<T> retryWhen(q9f<? extends T> q9fVar, oz6<? super t66<? super T>, ? super Throwable, ? super Long, ? super zy2<? super Boolean>, ? extends Object> oz6Var) {
        md8.checkNotNull(q9fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retryWhen>");
        return c76.retryWhen(q9fVar, oz6Var);
    }

    @t28
    @q64(level = u64.f86865a, message = "SharedFlow never completes, so this terminal operation never completes.")
    private static final <T> Object toList(q9f<? extends T> q9fVar, zy2<? super List<? extends T>> zy2Var) {
        md8.checkNotNull(q9fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>");
        o28.mark(0);
        Object list$default = g76.toList$default(q9fVar, null, zy2Var, 1, null);
        o28.mark(1);
        return list$default;
    }

    @t28
    @q64(level = u64.f86865a, message = "SharedFlow never completes, so this terminal operation never completes.")
    private static final <T> Object toSet(q9f<? extends T> q9fVar, zy2<? super Set<? extends T>> zy2Var) {
        md8.checkNotNull(q9fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>");
        o28.mark(0);
        Object set$default = g76.toSet$default(q9fVar, null, zy2Var, 1, null);
        o28.mark(1);
        return set$default;
    }

    @t28
    private static final <T> Object toList(q9f<? extends T> q9fVar, List<T> list, zy2<?> zy2Var) {
        md8.checkNotNull(q9fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>");
        o28.mark(0);
        c76.toList(q9fVar, list, zy2Var);
        o28.mark(1);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    @t28
    private static final <T> Object toSet(q9f<? extends T> q9fVar, Set<T> set, zy2<?> zy2Var) {
        md8.checkNotNull(q9fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>");
        o28.mark(0);
        c76.toSet(q9fVar, set, zy2Var);
        o28.mark(1);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }
}
