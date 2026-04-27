package p000;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import p000.yg5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jca {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C7870b f50301a = new C7870b(null);

    /* JADX INFO: renamed from: jca$b */
    @dwf({"SMAP\nMeasurementManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurementManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/measurement/MeasurementManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1#2:209\n*E\n"})
    public static final class C7870b {
        public /* synthetic */ C7870b(jt3 jt3Var) {
            this();
        }

        @do8
        @gib
        public final jca from(@yfb Context context) {
            md8.checkNotNullParameter(context, "context");
            dca dcaVarObtain = dca.f29287a.obtain(context);
            if (dcaVarObtain != null) {
                return new C7869a(dcaVarObtain);
            }
            return null;
        }

        private C7870b() {
        }
    }

    @do8
    @gib
    public static final jca from(@yfb Context context) {
        return f50301a.from(context);
    }

    @yfb
    public abstract ja9<bth> deleteRegistrationsAsync(@yfb s54 s54Var);

    @yfb
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract ja9<Integer> getMeasurementApiStatusAsync();

    @yfb
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract ja9<bth> registerSourceAsync(@yfb Uri uri, @gib InputEvent inputEvent);

    @yfb
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @yg5.InterfaceC15652e
    public abstract ja9<bth> registerSourceAsync(@yfb nwf nwfVar);

    @yfb
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract ja9<bth> registerTriggerAsync(@yfb Uri uri);

    @yfb
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract ja9<bth> registerWebSourceAsync(@yfb cji cjiVar);

    @yfb
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract ja9<bth> registerWebTriggerAsync(@yfb lji ljiVar);

    /* JADX INFO: renamed from: jca$a */
    public static final class C7869a extends jca {

        /* JADX INFO: renamed from: b */
        @yfb
        public final dca f50302b;

        /* JADX INFO: renamed from: jca$a$a */
        @ck3(m4009c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", m4010f = "MeasurementManagerFutures.kt", m4011i = {}, m4012l = {132}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f50303a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ s54 f50305c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(s54 s54Var, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f50305c = s54Var;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return C7869a.this.new a(this.f50305c, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f50303a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    dca dcaVar = C7869a.this.f50302b;
                    s54 s54Var = this.f50305c;
                    this.f50303a = 1;
                    if (dcaVar.deleteRegistrations(s54Var, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: jca$a$b */
        @ck3(m4009c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", m4010f = "MeasurementManagerFutures.kt", m4011i = {}, m4012l = {190}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b extends ugg implements gz6<x13, zy2<? super Integer>, Object> {

            /* JADX INFO: renamed from: a */
            public int f50306a;

            public b(zy2<? super b> zy2Var) {
                super(2, zy2Var);
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return C7869a.this.new b(zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super Integer> zy2Var) {
                return ((b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f50306a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    dca dcaVar = C7869a.this.f50302b;
                    this.f50306a = 1;
                    obj = dcaVar.getMeasurementApiStatus(this);
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

        /* JADX INFO: renamed from: jca$a$c */
        @ck3(m4009c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", m4010f = "MeasurementManagerFutures.kt", m4011i = {}, m4012l = {143}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class c extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f50308a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Uri f50310c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ InputEvent f50311d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Uri uri, InputEvent inputEvent, zy2<? super c> zy2Var) {
                super(2, zy2Var);
                this.f50310c = uri;
                this.f50311d = inputEvent;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return C7869a.this.new c(this.f50310c, this.f50311d, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
                return ((c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f50308a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    dca dcaVar = C7869a.this.f50302b;
                    Uri uri = this.f50310c;
                    InputEvent inputEvent = this.f50311d;
                    this.f50308a = 1;
                    if (dcaVar.registerSource(uri, inputEvent, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: jca$a$d */
        @ck3(m4009c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$2", m4010f = "MeasurementManagerFutures.kt", m4011i = {}, m4012l = {154}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class d extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f50312a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ nwf f50314c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(nwf nwfVar, zy2<? super d> zy2Var) {
                super(2, zy2Var);
                this.f50314c = nwfVar;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return C7869a.this.new d(this.f50314c, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
                return ((d) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f50312a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    dca dcaVar = C7869a.this.f50302b;
                    nwf nwfVar = this.f50314c;
                    this.f50312a = 1;
                    if (dcaVar.registerSource(nwfVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: jca$a$e */
        @ck3(m4009c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", m4010f = "MeasurementManagerFutures.kt", m4011i = {}, m4012l = {162}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class e extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f50315a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Uri f50317c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Uri uri, zy2<? super e> zy2Var) {
                super(2, zy2Var);
                this.f50317c = uri;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return C7869a.this.new e(this.f50317c, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
                return ((e) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f50315a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    dca dcaVar = C7869a.this.f50302b;
                    Uri uri = this.f50317c;
                    this.f50315a = 1;
                    if (dcaVar.registerTrigger(uri, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: jca$a$f */
        @ck3(m4009c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", m4010f = "MeasurementManagerFutures.kt", m4011i = {}, m4012l = {172}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class f extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f50318a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ cji f50320c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(cji cjiVar, zy2<? super f> zy2Var) {
                super(2, zy2Var);
                this.f50320c = cjiVar;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return C7869a.this.new f(this.f50320c, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
                return ((f) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f50318a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    dca dcaVar = C7869a.this.f50302b;
                    cji cjiVar = this.f50320c;
                    this.f50318a = 1;
                    if (dcaVar.registerWebSource(cjiVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: jca$a$g */
        @ck3(m4009c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", m4010f = "MeasurementManagerFutures.kt", m4011i = {}, m4012l = {182}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class g extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f50321a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ lji f50323c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(lji ljiVar, zy2<? super g> zy2Var) {
                super(2, zy2Var);
                this.f50323c = ljiVar;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return C7869a.this.new g(this.f50323c, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
                return ((g) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f50321a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    dca dcaVar = C7869a.this.f50302b;
                    lji ljiVar = this.f50323c;
                    this.f50321a = 1;
                    if (dcaVar.registerWebTrigger(ljiVar, this) == coroutine_suspended) {
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

        public C7869a(@yfb dca dcaVar) {
            md8.checkNotNullParameter(dcaVar, "mMeasurementManager");
            this.f50302b = dcaVar;
        }

        @Override // p000.jca
        @yfb
        @ih4
        @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        public ja9<bth> deleteRegistrationsAsync(@yfb s54 s54Var) {
            md8.checkNotNullParameter(s54Var, "deletionRequest");
            return c13.asListenableFuture$default(fg1.async$default(y13.CoroutineScope(df4.getDefault()), null, null, new a(s54Var, null), 3, null), null, 1, null);
        }

        @Override // p000.jca
        @yfb
        @ih4
        @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        public ja9<Integer> getMeasurementApiStatusAsync() {
            return c13.asListenableFuture$default(fg1.async$default(y13.CoroutineScope(df4.getDefault()), null, null, new b(null), 3, null), null, 1, null);
        }

        @Override // p000.jca
        @yfb
        @ih4
        @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        public ja9<bth> registerSourceAsync(@yfb Uri uri, @gib InputEvent inputEvent) {
            md8.checkNotNullParameter(uri, "attributionSource");
            return c13.asListenableFuture$default(fg1.async$default(y13.CoroutineScope(df4.getDefault()), null, null, new c(uri, inputEvent, null), 3, null), null, 1, null);
        }

        @Override // p000.jca
        @yfb
        @ih4
        @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        public ja9<bth> registerTriggerAsync(@yfb Uri uri) {
            md8.checkNotNullParameter(uri, "trigger");
            return c13.asListenableFuture$default(fg1.async$default(y13.CoroutineScope(df4.getDefault()), null, null, new e(uri, null), 3, null), null, 1, null);
        }

        @Override // p000.jca
        @yfb
        @ih4
        @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        public ja9<bth> registerWebSourceAsync(@yfb cji cjiVar) {
            md8.checkNotNullParameter(cjiVar, "request");
            return c13.asListenableFuture$default(fg1.async$default(y13.CoroutineScope(df4.getDefault()), null, null, new f(cjiVar, null), 3, null), null, 1, null);
        }

        @Override // p000.jca
        @yfb
        @ih4
        @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        public ja9<bth> registerWebTriggerAsync(@yfb lji ljiVar) {
            md8.checkNotNullParameter(ljiVar, "request");
            return c13.asListenableFuture$default(fg1.async$default(y13.CoroutineScope(df4.getDefault()), null, null, new g(ljiVar, null), 3, null), null, 1, null);
        }

        @Override // p000.jca
        @ih4
        @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @yfb
        @yg5.InterfaceC15652e
        public ja9<bth> registerSourceAsync(@yfb nwf nwfVar) {
            md8.checkNotNullParameter(nwfVar, "request");
            return c13.asListenableFuture$default(fg1.async$default(y13.CoroutineScope(df4.getDefault()), null, null, new d(nwfVar, null), 3, null), null, 1, null);
        }
    }
}
