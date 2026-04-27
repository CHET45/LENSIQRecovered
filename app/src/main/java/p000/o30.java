package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o30 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C10163a f66355a = new C10163a(null);

    /* JADX INFO: renamed from: o30$a */
    public static final class C10163a {

        /* JADX INFO: renamed from: o30$a$a */
        public static final class a extends tt8 implements qy6<Context, q30> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f66356a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context) {
                super(1);
                this.f66356a = context;
            }

            @Override // p000.qy6
            public final q30 invoke(Context context) {
                md8.checkNotNullParameter(context, "it");
                return new q30(this.f66356a);
            }
        }

        public /* synthetic */ C10163a(jt3 jt3Var) {
            this();
        }

        @do8
        @gib
        @igg({"NewApi", "ClassVerificationFailure"})
        public final o30 obtain(@yfb Context context) {
            md8.checkNotNullParameter(context, "context");
            C2307ch c2307ch = C2307ch.f16504a;
            if (c2307ch.adServicesVersion() >= 4) {
                return new t30(context);
            }
            if (c2307ch.extServicesVersionS() >= 9) {
                return (o30) nn0.f65059a.getManager(context, "AppSetIdManager", new a(context));
            }
            return null;
        }

        private C10163a() {
        }
    }

    @do8
    @gib
    @igg({"NewApi", "ClassVerificationFailure"})
    public static final o30 obtain(@yfb Context context) {
        return f66355a.obtain(context);
    }

    @gib
    public abstract Object getAppSetId(@yfb zy2<? super n30> zy2Var);
}
