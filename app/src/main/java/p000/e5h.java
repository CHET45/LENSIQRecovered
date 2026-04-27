package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e5h {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C5132b f31866a = new C5132b(null);

    /* JADX INFO: renamed from: e5h$a */
    public static final class C5131a extends e5h {

        /* JADX INFO: renamed from: b */
        @yfb
        public final v4h f31867b;

        /* JADX INFO: renamed from: e5h$a$a */
        @ck3(m4009c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1", m4010f = "TopicsManagerFutures.kt", m4011i = {}, m4012l = {55}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super m57>, Object> {

            /* JADX INFO: renamed from: a */
            public int f31868a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ g57 f31870c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g57 g57Var, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f31870c = g57Var;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return C5131a.this.new a(this.f31870c, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super m57> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f31868a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    v4h v4hVar = C5131a.this.f31867b;
                    g57 g57Var = this.f31870c;
                    this.f31868a = 1;
                    obj = v4hVar.getTopics(g57Var, this);
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

        public C5131a(@yfb v4h v4hVar) {
            md8.checkNotNullParameter(v4hVar, "mTopicsManager");
            this.f31867b = v4hVar;
        }

        @Override // p000.e5h
        @yfb
        @ih4
        @j5e("android.permission.ACCESS_ADSERVICES_TOPICS")
        public ja9<m57> getTopicsAsync(@yfb g57 g57Var) {
            md8.checkNotNullParameter(g57Var, "request");
            return c13.asListenableFuture$default(fg1.async$default(y13.CoroutineScope(df4.getMain()), null, null, new a(g57Var, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: e5h$b */
    @dwf({"SMAP\nTopicsManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicsManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
    public static final class C5132b {
        public /* synthetic */ C5132b(jt3 jt3Var) {
            this();
        }

        @do8
        @gib
        public final e5h from(@yfb Context context) {
            md8.checkNotNullParameter(context, "context");
            v4h v4hVarObtain = v4h.f89982a.obtain(context);
            if (v4hVarObtain != null) {
                return new C5131a(v4hVarObtain);
            }
            return null;
        }

        private C5132b() {
        }
    }

    @do8
    @gib
    public static final e5h from(@yfb Context context) {
        return f31866a.from(context);
    }

    @yfb
    @j5e("android.permission.ACCESS_ADSERVICES_TOPICS")
    public abstract ja9<m57> getTopicsAsync(@yfb g57 g57Var);
}
