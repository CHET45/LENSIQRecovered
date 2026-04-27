package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xgd {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C15057a f97724a = new C15057a(null);

    /* JADX INFO: renamed from: xgd$a */
    @dwf({"SMAP\nProtectedSignalsManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtectedSignalsManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/signals/ProtectedSignalsManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
    public static final class C15057a {
        public /* synthetic */ C15057a(jt3 jt3Var) {
            this();
        }

        @do8
        @gib
        public final xgd from(@yfb Context context) {
            md8.checkNotNullParameter(context, "context");
            wgd wgdVarObtain = wgd.f94210a.obtain(context);
            if (wgdVarObtain != null) {
                return new C15058b(wgdVarObtain);
            }
            return null;
        }

        private C15057a() {
        }
    }

    /* JADX INFO: renamed from: xgd$b */
    public static final class C15058b extends xgd {

        /* JADX INFO: renamed from: b */
        @gib
        public final wgd f97725b;

        /* JADX INFO: renamed from: xgd$b$a */
        @ck3(m4009c = "androidx.privacysandbox.ads.adservices.java.signals.ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1", m4010f = "ProtectedSignalsManagerFutures.kt", m4011i = {}, m4012l = {111}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f97726a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ lwh f97728c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(lwh lwhVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f97728c = lwhVar;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return C15058b.this.new a(this.f97728c, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f97726a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    wgd wgdVar = C15058b.this.f97725b;
                    md8.checkNotNull(wgdVar);
                    lwh lwhVar = this.f97728c;
                    this.f97726a = 1;
                    if (wgdVar.updateSignals(lwhVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                return bth.f14751a;
            }
        }

        public C15058b(@gib wgd wgdVar) {
            this.f97725b = wgdVar;
        }

        @Override // p000.xgd
        @yfb
        @ih4
        @j5e("android.permission.ACCESS_ADSERVICES_PROTECTED_SIGNALS")
        public ja9<bth> updateSignalsAsync(@yfb lwh lwhVar) {
            md8.checkNotNullParameter(lwhVar, "request");
            return c13.asListenableFuture$default(fg1.async$default(y13.CoroutineScope(df4.getDefault()), null, null, new a(lwhVar, null), 3, null), null, 1, null);
        }
    }

    @do8
    @gib
    public static final xgd from(@yfb Context context) {
        return f97724a.from(context);
    }

    @yfb
    @j5e("android.permission.ACCESS_ADSERVICES_PROTECTED_SIGNALS")
    public abstract ja9<bth> updateSignalsAsync(@yfb lwh lwhVar);
}
