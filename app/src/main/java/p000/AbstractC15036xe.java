package p000;

import android.content.Context;

/* JADX INFO: renamed from: xe */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15036xe {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final a f97573a = new a(null);

    /* JADX INFO: renamed from: xe$a */
    public static final class a {

        /* JADX INFO: renamed from: xe$a$a, reason: collision with other inner class name */
        public static final class C16558a extends tt8 implements qy6<Context, C16100ze> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f97574a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16558a(Context context) {
                super(1);
                this.f97574a = context;
            }

            @Override // p000.qy6
            public final C16100ze invoke(Context context) {
                md8.checkNotNullParameter(context, "it");
                return new C16100ze(this.f97574a);
            }
        }

        public /* synthetic */ a(jt3 jt3Var) {
            this();
        }

        @do8
        @gib
        @igg({"NewApi", "ClassVerificationFailure"})
        public final AbstractC15036xe obtain(@yfb Context context) {
            md8.checkNotNullParameter(context, "context");
            C2307ch c2307ch = C2307ch.f16504a;
            if (c2307ch.adServicesVersion() >= 4) {
                return new C2295cf(context);
            }
            if (c2307ch.extServicesVersionS() >= 9) {
                return (AbstractC15036xe) nn0.f65059a.getManager(context, "AdIdManager", new C16558a(context));
            }
            return null;
        }

        private a() {
        }
    }

    @do8
    @gib
    @igg({"NewApi", "ClassVerificationFailure"})
    public static final AbstractC15036xe obtain(@yfb Context context) {
        return f97573a.obtain(context);
    }

    @gib
    @j5e("android.permission.ACCESS_ADSERVICES_AD_ID")
    public abstract Object getAdId(@yfb zy2<? super C14563we> zy2Var);
}
