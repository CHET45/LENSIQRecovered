package p000;

import android.content.Context;

/* JADX INFO: renamed from: df */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4774df {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final b f29543a = new b(null);

    /* JADX INFO: renamed from: df$a */
    public static final class a extends AbstractC4774df {

        /* JADX INFO: renamed from: b */
        @yfb
        public final AbstractC15036xe f29544b;

        /* JADX INFO: renamed from: df$a$a, reason: collision with other inner class name */
        @ck3(m4009c = "androidx.privacysandbox.ads.adservices.java.adid.AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1", m4010f = "AdIdManagerFutures.kt", m4011i = {}, m4012l = {54}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class C16428a extends ugg implements gz6<x13, zy2<? super C14563we>, Object> {

            /* JADX INFO: renamed from: a */
            public int f29545a;

            public C16428a(zy2<? super C16428a> zy2Var) {
                super(2, zy2Var);
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return a.this.new C16428a(zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super C14563we> zy2Var) {
                return ((C16428a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f29545a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    AbstractC15036xe abstractC15036xe = a.this.f29544b;
                    this.f29545a = 1;
                    obj = abstractC15036xe.getAdId(this);
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

        public a(@yfb AbstractC15036xe abstractC15036xe) {
            md8.checkNotNullParameter(abstractC15036xe, "mAdIdManager");
            this.f29544b = abstractC15036xe;
        }

        @Override // p000.AbstractC4774df
        @yfb
        @ih4
        @j5e("android.permission.ACCESS_ADSERVICES_AD_ID")
        public ja9<C14563we> getAdIdAsync() {
            return c13.asListenableFuture$default(fg1.async$default(y13.CoroutineScope(df4.getDefault()), null, null, new C16428a(null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: df$b */
    @dwf({"SMAP\nAdIdManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdIdManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/adid/AdIdManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"})
    public static final class b {
        public /* synthetic */ b(jt3 jt3Var) {
            this();
        }

        @do8
        @gib
        public final AbstractC4774df from(@yfb Context context) {
            md8.checkNotNullParameter(context, "context");
            AbstractC15036xe abstractC15036xeObtain = AbstractC15036xe.f97573a.obtain(context);
            if (abstractC15036xeObtain != null) {
                return new a(abstractC15036xeObtain);
            }
            return null;
        }

        private b() {
        }
    }

    @do8
    @gib
    public static final AbstractC4774df from(@yfb Context context) {
        return f29543a.from(context);
    }

    @yfb
    @j5e("android.permission.ACCESS_ADSERVICES_AD_ID")
    public abstract ja9<C14563we> getAdIdAsync();
}
