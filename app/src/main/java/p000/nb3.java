package p000;

import android.content.Context;
import p000.yg5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nb3 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C9770b f63874a = new C9770b(null);

    /* JADX INFO: renamed from: nb3$a */
    public static final class C9769a extends nb3 {

        /* JADX INFO: renamed from: b */
        @gib
        public final hb3 f63875b;

        /* JADX INFO: renamed from: nb3$a$a */
        @ck3(m4009c = "androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures$Api33Ext4JavaImpl$fetchAndJoinCustomAudienceAsync$1", m4010f = "CustomAudienceManagerFutures.kt", m4011i = {}, m4012l = {156}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f63876a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ qq5 f63878c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(qq5 qq5Var, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f63878c = qq5Var;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return C9769a.this.new a(this.f63878c, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f63876a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    hb3 hb3Var = C9769a.this.f63875b;
                    md8.checkNotNull(hb3Var);
                    qq5 qq5Var = this.f63878c;
                    this.f63876a = 1;
                    if (hb3Var.fetchAndJoinCustomAudience(qq5Var, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: nb3$a$b */
        @ck3(m4009c = "androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1", m4010f = "CustomAudienceManagerFutures.kt", m4011i = {}, m4012l = {145}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f63879a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ vj8 f63881c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(vj8 vj8Var, zy2<? super b> zy2Var) {
                super(2, zy2Var);
                this.f63881c = vj8Var;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return C9769a.this.new b(this.f63881c, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
                return ((b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f63879a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    hb3 hb3Var = C9769a.this.f63875b;
                    md8.checkNotNull(hb3Var);
                    vj8 vj8Var = this.f63881c;
                    this.f63879a = 1;
                    if (hb3Var.joinCustomAudience(vj8Var, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: nb3$a$c */
        @ck3(m4009c = "androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1", m4010f = "CustomAudienceManagerFutures.kt", m4011i = {}, m4012l = {166}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class c extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f63882a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ o39 f63884c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(o39 o39Var, zy2<? super c> zy2Var) {
                super(2, zy2Var);
                this.f63884c = o39Var;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return C9769a.this.new c(this.f63884c, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
                return ((c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f63882a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    hb3 hb3Var = C9769a.this.f63875b;
                    md8.checkNotNull(hb3Var);
                    o39 o39Var = this.f63884c;
                    this.f63882a = 1;
                    if (hb3Var.leaveCustomAudience(o39Var, this) == coroutine_suspended) {
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

        public C9769a(@gib hb3 hb3Var) {
            this.f63875b = hb3Var;
        }

        @Override // p000.nb3
        @yfb
        @ih4
        @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        public ja9<bth> fetchAndJoinCustomAudienceAsync(@yfb qq5 qq5Var) {
            md8.checkNotNullParameter(qq5Var, "request");
            return c13.asListenableFuture$default(fg1.async$default(y13.CoroutineScope(df4.getDefault()), null, null, new a(qq5Var, null), 3, null), null, 1, null);
        }

        @Override // p000.nb3
        @yfb
        @ih4
        @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        public ja9<bth> joinCustomAudienceAsync(@yfb vj8 vj8Var) {
            md8.checkNotNullParameter(vj8Var, "request");
            return c13.asListenableFuture$default(fg1.async$default(y13.CoroutineScope(df4.getDefault()), null, null, new b(vj8Var, null), 3, null), null, 1, null);
        }

        @Override // p000.nb3
        @yfb
        @ih4
        @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        public ja9<bth> leaveCustomAudienceAsync(@yfb o39 o39Var) {
            md8.checkNotNullParameter(o39Var, "request");
            return c13.asListenableFuture$default(fg1.async$default(y13.CoroutineScope(df4.getDefault()), null, null, new c(o39Var, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: nb3$b */
    @dwf({"SMAP\nCustomAudienceManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomAudienceManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/customaudience/CustomAudienceManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n1#2:185\n*E\n"})
    public static final class C9770b {
        public /* synthetic */ C9770b(jt3 jt3Var) {
            this();
        }

        @do8
        @gib
        public final nb3 from(@yfb Context context) {
            md8.checkNotNullParameter(context, "context");
            hb3 hb3VarObtain = hb3.f43064a.obtain(context);
            if (hb3VarObtain != null) {
                return new C9769a(hb3VarObtain);
            }
            return null;
        }

        private C9770b() {
        }
    }

    @do8
    @gib
    public static final nb3 from(@yfb Context context) {
        return f63874a.from(context);
    }

    @yfb
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @yg5.InterfaceC15648a
    public abstract ja9<bth> fetchAndJoinCustomAudienceAsync(@yfb qq5 qq5Var);

    @yfb
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract ja9<bth> joinCustomAudienceAsync(@yfb vj8 vj8Var);

    @yfb
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract ja9<bth> leaveCustomAudienceAsync(@yfb o39 o39Var);
}
