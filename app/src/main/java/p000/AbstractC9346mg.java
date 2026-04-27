package p000;

import android.content.Context;
import p000.yg5;

/* JADX INFO: renamed from: mg */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9346mg {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final b f60906a = new b(null);

    /* JADX INFO: renamed from: mg$b */
    @dwf({"SMAP\nAdSelectionManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSelectionManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/adselection/AdSelectionManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,392:1\n1#2:393\n*E\n"})
    public static final class b {
        public /* synthetic */ b(jt3 jt3Var) {
            this();
        }

        @do8
        @gib
        public final AbstractC9346mg from(@yfb Context context) {
            md8.checkNotNullParameter(context, "context");
            AbstractC6300gg abstractC6300ggObtain = AbstractC6300gg.f39747a.obtain(context);
            if (abstractC6300ggObtain != null) {
                return new a(abstractC6300ggObtain);
            }
            return null;
        }

        private b() {
        }
    }

    @do8
    @gib
    public static final AbstractC9346mg from(@yfb Context context) {
        return f60906a.from(context);
    }

    @yfb
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @yg5.InterfaceC15648a
    public abstract ja9<k37> getAdSelectionDataAsync(@yfb o37 o37Var);

    @yfb
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @yg5.InterfaceC15648a
    public abstract ja9<C16117zg> persistAdSelectionResultAsync(@yfb cqc cqcVar);

    @yg5.InterfaceC15651d
    @yfb
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract ja9<bth> reportEventAsync(@yfb u2e u2eVar);

    @yfb
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract ja9<bth> reportImpressionAsync(@yfb d3e d3eVar);

    @yfb
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @yg5.InterfaceC15648a
    public abstract ja9<C16117zg> selectAdsAsync(@yfb C5796fg c5796fg);

    @yfb
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract ja9<C16117zg> selectAdsAsync(@yfb C15642yf c15642yf);

    @yg5.InterfaceC15651d
    @yfb
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract ja9<bth> updateAdCounterHistogramAsync(@yfb hwh hwhVar);

    /* JADX INFO: renamed from: mg$a */
    public static final class a extends AbstractC9346mg {

        /* JADX INFO: renamed from: b */
        @gib
        public final AbstractC6300gg f60907b;

        /* JADX INFO: renamed from: mg$a$a, reason: collision with other inner class name */
        @ck3(m4009c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$getAdSelectionDataAsync$1", m4010f = "AdSelectionManagerFutures.kt", m4011i = {}, m4012l = {361}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class C16485a extends ugg implements gz6<x13, zy2<? super k37>, Object> {

            /* JADX INFO: renamed from: a */
            public int f60908a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ o37 f60910c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16485a(o37 o37Var, zy2<? super C16485a> zy2Var) {
                super(2, zy2Var);
                this.f60910c = o37Var;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return a.this.new C16485a(this.f60910c, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super k37> zy2Var) {
                return ((C16485a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f60908a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    AbstractC6300gg abstractC6300gg = a.this.f60907b;
                    md8.checkNotNull(abstractC6300gg);
                    o37 o37Var = this.f60910c;
                    this.f60908a = 1;
                    obj = abstractC6300gg.getAdSelectionData(o37Var, this);
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

        /* JADX INFO: renamed from: mg$a$b */
        @ck3(m4009c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$persistAdSelectionResultAsync$1", m4010f = "AdSelectionManagerFutures.kt", m4011i = {}, m4012l = {373}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b extends ugg implements gz6<x13, zy2<? super C16117zg>, Object> {

            /* JADX INFO: renamed from: a */
            public int f60911a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ cqc f60913c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(cqc cqcVar, zy2<? super b> zy2Var) {
                super(2, zy2Var);
                this.f60913c = cqcVar;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return a.this.new b(this.f60913c, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super C16117zg> zy2Var) {
                return ((b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f60911a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    AbstractC6300gg abstractC6300gg = a.this.f60907b;
                    md8.checkNotNull(abstractC6300gg);
                    cqc cqcVar = this.f60913c;
                    this.f60911a = 1;
                    obj = abstractC6300gg.persistAdSelectionResult(cqcVar, this);
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

        /* JADX INFO: renamed from: mg$a$c */
        @ck3(m4009c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$reportEventAsync$1", m4010f = "AdSelectionManagerFutures.kt", m4011i = {}, m4012l = {350}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class c extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f60914a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ u2e f60916c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(u2e u2eVar, zy2<? super c> zy2Var) {
                super(2, zy2Var);
                this.f60916c = u2eVar;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return a.this.new c(this.f60916c, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
                return ((c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f60914a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    AbstractC6300gg abstractC6300gg = a.this.f60907b;
                    md8.checkNotNull(abstractC6300gg);
                    u2e u2eVar = this.f60916c;
                    this.f60914a = 1;
                    if (abstractC6300gg.reportEvent(u2eVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: mg$a$d */
        @ck3(m4009c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1", m4010f = "AdSelectionManagerFutures.kt", m4011i = {}, m4012l = {327}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class d extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f60917a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ d3e f60919c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(d3e d3eVar, zy2<? super d> zy2Var) {
                super(2, zy2Var);
                this.f60919c = d3eVar;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return a.this.new d(this.f60919c, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
                return ((d) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f60917a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    AbstractC6300gg abstractC6300gg = a.this.f60907b;
                    md8.checkNotNull(abstractC6300gg);
                    d3e d3eVar = this.f60919c;
                    this.f60917a = 1;
                    if (abstractC6300gg.reportImpression(d3eVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: mg$a$e */
        @ck3(m4009c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1", m4010f = "AdSelectionManagerFutures.kt", m4011i = {}, m4012l = {306}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class e extends ugg implements gz6<x13, zy2<? super C16117zg>, Object> {

            /* JADX INFO: renamed from: a */
            public int f60920a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C15642yf f60922c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(C15642yf c15642yf, zy2<? super e> zy2Var) {
                super(2, zy2Var);
                this.f60922c = c15642yf;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return a.this.new e(this.f60922c, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super C16117zg> zy2Var) {
                return ((e) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f60920a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    AbstractC6300gg abstractC6300gg = a.this.f60907b;
                    md8.checkNotNull(abstractC6300gg);
                    C15642yf c15642yf = this.f60922c;
                    this.f60920a = 1;
                    obj = abstractC6300gg.selectAds(c15642yf, this);
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

        /* JADX INFO: renamed from: mg$a$f */
        @ck3(m4009c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$2", m4010f = "AdSelectionManagerFutures.kt", m4011i = {}, m4012l = {317}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class f extends ugg implements gz6<x13, zy2<? super C16117zg>, Object> {

            /* JADX INFO: renamed from: a */
            public int f60923a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C5796fg f60925c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(C5796fg c5796fg, zy2<? super f> zy2Var) {
                super(2, zy2Var);
                this.f60925c = c5796fg;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return a.this.new f(this.f60925c, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super C16117zg> zy2Var) {
                return ((f) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f60923a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    AbstractC6300gg abstractC6300gg = a.this.f60907b;
                    md8.checkNotNull(abstractC6300gg);
                    C5796fg c5796fg = this.f60925c;
                    this.f60923a = 1;
                    obj = abstractC6300gg.selectAds(c5796fg, this);
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

        /* JADX INFO: renamed from: mg$a$g */
        @ck3(m4009c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$updateAdCounterHistogramAsync$1", m4010f = "AdSelectionManagerFutures.kt", m4011i = {}, m4012l = {338}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class g extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f60926a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ hwh f60928c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(hwh hwhVar, zy2<? super g> zy2Var) {
                super(2, zy2Var);
                this.f60928c = hwhVar;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return a.this.new g(this.f60928c, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
                return ((g) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f60926a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    AbstractC6300gg abstractC6300gg = a.this.f60907b;
                    md8.checkNotNull(abstractC6300gg);
                    hwh hwhVar = this.f60928c;
                    this.f60926a = 1;
                    if (abstractC6300gg.updateAdCounterHistogram(hwhVar, this) == coroutine_suspended) {
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

        public a(@gib AbstractC6300gg abstractC6300gg) {
            this.f60907b = abstractC6300gg;
        }

        @Override // p000.AbstractC9346mg
        @yfb
        @ih4
        @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        public ja9<k37> getAdSelectionDataAsync(@yfb o37 o37Var) {
            md8.checkNotNullParameter(o37Var, "getAdSelectionDataRequest");
            return c13.asListenableFuture$default(fg1.async$default(y13.CoroutineScope(df4.getDefault()), null, null, new C16485a(o37Var, null), 3, null), null, 1, null);
        }

        @Override // p000.AbstractC9346mg
        @yfb
        @ih4
        @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        public ja9<C16117zg> persistAdSelectionResultAsync(@yfb cqc cqcVar) {
            md8.checkNotNullParameter(cqcVar, "persistAdSelectionResultRequest");
            return c13.asListenableFuture$default(fg1.async$default(y13.CoroutineScope(df4.getDefault()), null, null, new b(cqcVar, null), 3, null), null, 1, null);
        }

        @Override // p000.AbstractC9346mg
        @yfb
        @ih4
        @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        public ja9<bth> reportEventAsync(@yfb u2e u2eVar) {
            md8.checkNotNullParameter(u2eVar, "reportEventRequest");
            return c13.asListenableFuture$default(fg1.async$default(y13.CoroutineScope(df4.getDefault()), null, null, new c(u2eVar, null), 3, null), null, 1, null);
        }

        @Override // p000.AbstractC9346mg
        @yfb
        @ih4
        @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        public ja9<bth> reportImpressionAsync(@yfb d3e d3eVar) {
            md8.checkNotNullParameter(d3eVar, "reportImpressionRequest");
            return c13.asListenableFuture$default(fg1.async$default(y13.CoroutineScope(df4.getDefault()), null, null, new d(d3eVar, null), 3, null), null, 1, null);
        }

        @Override // p000.AbstractC9346mg
        @yfb
        @ih4
        @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        public ja9<C16117zg> selectAdsAsync(@yfb C15642yf c15642yf) {
            md8.checkNotNullParameter(c15642yf, "adSelectionConfig");
            return c13.asListenableFuture$default(fg1.async$default(y13.CoroutineScope(df4.getDefault()), null, null, new e(c15642yf, null), 3, null), null, 1, null);
        }

        @Override // p000.AbstractC9346mg
        @yfb
        @ih4
        @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        public ja9<bth> updateAdCounterHistogramAsync(@yfb hwh hwhVar) {
            md8.checkNotNullParameter(hwhVar, "updateAdCounterHistogramRequest");
            return c13.asListenableFuture$default(fg1.async$default(y13.CoroutineScope(df4.getDefault()), null, null, new g(hwhVar, null), 3, null), null, 1, null);
        }

        @Override // p000.AbstractC9346mg
        @yfb
        @ih4
        @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        public ja9<C16117zg> selectAdsAsync(@yfb C5796fg c5796fg) {
            md8.checkNotNullParameter(c5796fg, "adSelectionFromOutcomesConfig");
            return c13.asListenableFuture$default(fg1.async$default(y13.CoroutineScope(df4.getDefault()), null, null, new f(c5796fg, null), 3, null), null, 1, null);
        }
    }
}
