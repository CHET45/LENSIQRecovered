package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u30 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C13343b f86695a = new C13343b(null);

    /* JADX INFO: renamed from: u30$a */
    public static final class C13342a extends u30 {

        /* JADX INFO: renamed from: b */
        @yfb
        public final o30 f86696b;

        /* JADX INFO: renamed from: u30$a$a */
        @ck3(m4009c = "androidx.privacysandbox.ads.adservices.java.appsetid.AppSetIdManagerFutures$Api33Ext4JavaImpl$getAppSetIdAsync$1", m4010f = "AppSetIdManagerFutures.kt", m4011i = {}, m4012l = {49}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super n30>, Object> {

            /* JADX INFO: renamed from: a */
            public int f86697a;

            public a(zy2<? super a> zy2Var) {
                super(2, zy2Var);
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return C13342a.this.new a(zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super n30> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f86697a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    o30 o30Var = C13342a.this.f86696b;
                    this.f86697a = 1;
                    obj = o30Var.getAppSetId(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                return obj;
            }
        }

        public C13342a(@yfb o30 o30Var) {
            md8.checkNotNullParameter(o30Var, "mAppSetIdManager");
            this.f86696b = o30Var;
        }

        @Override // p000.u30
        @yfb
        @ih4
        public ja9<n30> getAppSetIdAsync() {
            return c13.asListenableFuture$default(fg1.async$default(y13.CoroutineScope(df4.getDefault()), null, null, new a(null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: u30$b */
    @dwf({"SMAP\nAppSetIdManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSetIdManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/appsetid/AppSetIdManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
    public static final class C13343b {
        public /* synthetic */ C13343b(jt3 jt3Var) {
            this();
        }

        @do8
        @gib
        public final u30 from(@yfb Context context) {
            md8.checkNotNullParameter(context, "context");
            o30 o30VarObtain = o30.f66355a.obtain(context);
            if (o30VarObtain != null) {
                return new C13342a(o30VarObtain);
            }
            return null;
        }

        private C13343b() {
        }
    }

    @do8
    @gib
    public static final u30 from(@yfb Context context) {
        return f86695a.from(context);
    }

    @yfb
    public abstract ja9<n30> getAppSetIdAsync();
}
