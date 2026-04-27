package p000;

import android.content.Context;
import p000.yg5;

/* JADX INFO: renamed from: gg */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6300gg {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final a f39747a = new a(null);

    /* JADX INFO: renamed from: gg$a */
    public static final class a {

        /* JADX INFO: renamed from: gg$a$a, reason: collision with other inner class name */
        public static final class C16450a extends tt8 implements qy6<Context, C7267ig> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f39748a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16450a(Context context) {
                super(1);
                this.f39748a = context;
            }

            @Override // p000.qy6
            public final C7267ig invoke(Context context) {
                md8.checkNotNullParameter(context, "it");
                return new C7267ig(this.f39748a);
            }
        }

        public /* synthetic */ a(jt3 jt3Var) {
            this();
        }

        @do8
        @gib
        @igg({"NewApi", "ClassVerificationFailure"})
        public final AbstractC6300gg obtain(@yfb Context context) {
            md8.checkNotNullParameter(context, "context");
            C2307ch c2307ch = C2307ch.f16504a;
            if (c2307ch.adServicesVersion() >= 4) {
                return new C8807lg(context);
            }
            if (c2307ch.extServicesVersionS() >= 9) {
                return (AbstractC6300gg) nn0.f65059a.getManager(context, "AdSelectionManager", new C16450a(context));
            }
            return null;
        }

        private a() {
        }
    }

    @do8
    @gib
    @igg({"NewApi", "ClassVerificationFailure"})
    public static final AbstractC6300gg obtain(@yfb Context context) {
        return f39747a.obtain(context);
    }

    @gib
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @yg5.InterfaceC15648a
    public abstract Object getAdSelectionData(@yfb o37 o37Var, @yfb zy2<? super k37> zy2Var);

    @gib
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @yg5.InterfaceC15648a
    public abstract Object persistAdSelectionResult(@yfb cqc cqcVar, @yfb zy2<? super C16117zg> zy2Var);

    @gib
    @yg5.InterfaceC15651d
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract Object reportEvent(@yfb u2e u2eVar, @yfb zy2<? super bth> zy2Var);

    @gib
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract Object reportImpression(@yfb d3e d3eVar, @yfb zy2<? super bth> zy2Var);

    @gib
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @yg5.InterfaceC15648a
    public abstract Object selectAds(@yfb C5796fg c5796fg, @yfb zy2<? super C16117zg> zy2Var);

    @gib
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract Object selectAds(@yfb C15642yf c15642yf, @yfb zy2<? super C16117zg> zy2Var);

    @gib
    @yg5.InterfaceC15651d
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract Object updateAdCounterHistogram(@yfb hwh hwhVar, @yfb zy2<? super bth> zy2Var);
}
