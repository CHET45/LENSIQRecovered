package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g76 {

    /* JADX INFO: renamed from: g76$a */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", m4010f = "Collection.kt", m4011i = {0}, m4012l = {22}, m4013m = "toCollection", m4014n = {FirebaseAnalytics.C3552d.f23234z}, m4015s = {"L$0"})
    public static final class C6155a<T, C extends Collection<? super T>> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f38943a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f38944b;

        /* JADX INFO: renamed from: c */
        public int f38945c;

        public C6155a(zy2<? super C6155a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f38944b = obj;
            this.f38945c |= Integer.MIN_VALUE;
            return c76.toCollection(null, null, this);
        }
    }

    /* JADX INFO: renamed from: g76$b */
    public static final class C6156b<T> implements t66 {

        /* JADX INFO: Incorrect field signature: TC; */
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Collection f38946a;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        public C6156b(Collection collection) {
            this.f38946a = collection;
        }

        @Override // p000.t66
        public final Object emit(T t, zy2<? super bth> zy2Var) {
            this.f38946a.add(t);
            return bth.f14751a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object toCollection(@p000.yfb p000.y56<? extends T> r4, @p000.yfb C r5, @p000.yfb p000.zy2<? super C> r6) {
        /*
            boolean r0 = r6 instanceof p000.g76.C6155a
            if (r0 == 0) goto L13
            r0 = r6
            g76$a r0 = (p000.g76.C6155a) r0
            int r1 = r0.f38945c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38945c = r1
            goto L18
        L13:
            g76$a r0 = new g76$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f38944b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f38945c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f38943a
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            p000.y7e.throwOnFailure(r6)
            goto L49
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            p000.y7e.throwOnFailure(r6)
            g76$b r6 = new g76$b
            r6.<init>(r5)
            r0.f38943a = r5
            r0.f38945c = r3
            java.lang.Object r4 = r4.collect(r6, r0)
            if (r4 != r1) goto L49
            return r1
        L49:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.g76.toCollection(y56, java.util.Collection, zy2):java.lang.Object");
    }

    @gib
    public static final <T> Object toList(@yfb y56<? extends T> y56Var, @yfb List<T> list, @yfb zy2<? super List<? extends T>> zy2Var) {
        return c76.toCollection(y56Var, list, zy2Var);
    }

    public static /* synthetic */ Object toList$default(y56 y56Var, List list, zy2 zy2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return c76.toList(y56Var, list, zy2Var);
    }

    @gib
    public static final <T> Object toSet(@yfb y56<? extends T> y56Var, @yfb Set<T> set, @yfb zy2<? super Set<? extends T>> zy2Var) {
        return c76.toCollection(y56Var, set, zy2Var);
    }

    public static /* synthetic */ Object toSet$default(y56 y56Var, Set set, zy2 zy2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            set = new LinkedHashSet();
        }
        return c76.toSet(y56Var, set, zy2Var);
    }
}
