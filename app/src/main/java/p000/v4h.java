package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v4h {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C13867a f89982a = new C13867a(null);

    /* JADX INFO: renamed from: v4h$a */
    public static final class C13867a {

        /* JADX INFO: renamed from: v4h$a$a */
        public static final class a extends tt8 implements qy6<Context, x4h> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f89983a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context) {
                super(1);
                this.f89983a = context;
            }

            @Override // p000.qy6
            public final x4h invoke(Context context) {
                md8.checkNotNullParameter(context, "it");
                return new x4h(this.f89983a);
            }
        }

        /* JADX INFO: renamed from: v4h$a$b */
        public static final class b extends tt8 implements qy6<Context, y4h> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f89984a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Context context) {
                super(1);
                this.f89984a = context;
            }

            @Override // p000.qy6
            public final y4h invoke(Context context) {
                md8.checkNotNullParameter(context, "it");
                return new y4h(this.f89984a);
            }
        }

        public /* synthetic */ C13867a(jt3 jt3Var) {
            this();
        }

        @do8
        @gib
        @igg({"NewApi", "ClassVerificationFailure"})
        public final v4h obtain(@yfb Context context) {
            md8.checkNotNullParameter(context, "context");
            C2307ch c2307ch = C2307ch.f16504a;
            if (c2307ch.adServicesVersion() >= 11) {
                return new b5h(context);
            }
            if (c2307ch.adServicesVersion() >= 5) {
                return new d5h(context);
            }
            if (c2307ch.adServicesVersion() == 4) {
                return new c5h(context);
            }
            if (c2307ch.extServicesVersionS() >= 11) {
                return (v4h) nn0.f65059a.getManager(context, "TopicsManager", new a(context));
            }
            if (c2307ch.extServicesVersionS() >= 9) {
                return (v4h) nn0.f65059a.getManager(context, "TopicsManager", new b(context));
            }
            return null;
        }

        private C13867a() {
        }
    }

    @do8
    @gib
    @igg({"NewApi", "ClassVerificationFailure"})
    public static final v4h obtain(@yfb Context context) {
        return f89982a.obtain(context);
    }

    @gib
    @j5e("android.permission.ACCESS_ADSERVICES_TOPICS")
    public abstract Object getTopics(@yfb g57 g57Var, @yfb zy2<? super m57> zy2Var);
}
