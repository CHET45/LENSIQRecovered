package p000;

import android.content.Context;
import p000.yg5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hb3 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C6784a f43064a = new C6784a(null);

    /* JADX INFO: renamed from: hb3$a */
    public static final class C6784a {

        /* JADX INFO: renamed from: hb3$a$a */
        public static final class a extends tt8 implements qy6<Context, jb3> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f43065a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context) {
                super(1);
                this.f43065a = context;
            }

            @Override // p000.qy6
            public final jb3 invoke(Context context) {
                md8.checkNotNullParameter(context, "it");
                return new jb3(this.f43065a);
            }
        }

        public /* synthetic */ C6784a(jt3 jt3Var) {
            this();
        }

        @do8
        @gib
        @igg({"NewApi", "ClassVerificationFailure"})
        public final hb3 obtain(@yfb Context context) {
            md8.checkNotNullParameter(context, "context");
            C2307ch c2307ch = C2307ch.f16504a;
            if (c2307ch.adServicesVersion() >= 4) {
                return new mb3(context);
            }
            if (c2307ch.extServicesVersionS() >= 9) {
                return (hb3) nn0.f65059a.getManager(context, "CustomAudienceManager", new a(context));
            }
            return null;
        }

        private C6784a() {
        }
    }

    @do8
    @gib
    @igg({"NewApi", "ClassVerificationFailure"})
    public static final hb3 obtain(@yfb Context context) {
        return f43064a.obtain(context);
    }

    @gib
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @yg5.InterfaceC15648a
    public abstract Object fetchAndJoinCustomAudience(@yfb qq5 qq5Var, @yfb zy2<? super bth> zy2Var);

    @gib
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract Object joinCustomAudience(@yfb vj8 vj8Var, @yfb zy2<? super bth> zy2Var);

    @gib
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract Object leaveCustomAudience(@yfb o39 o39Var, @yfb zy2<? super bth> zy2Var);
}
