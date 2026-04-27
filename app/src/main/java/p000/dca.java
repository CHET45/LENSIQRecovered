package p000;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import p000.yg5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dca {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C4734a f29287a = new C4734a(null);

    /* JADX INFO: renamed from: b */
    public static final int f29288b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f29289c = 1;

    /* JADX INFO: renamed from: dca$a */
    public static final class C4734a {

        /* JADX INFO: renamed from: dca$a$a */
        public static final class a extends tt8 implements qy6<Context, fca> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f29290a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context) {
                super(1);
                this.f29290a = context;
            }

            @Override // p000.qy6
            public final fca invoke(Context context) {
                md8.checkNotNullParameter(context, "it");
                return new fca(this.f29290a);
            }
        }

        public /* synthetic */ C4734a(jt3 jt3Var) {
            this();
        }

        @do8
        @gib
        @igg({"NewApi", "ClassVerificationFailure"})
        public final dca obtain(@yfb Context context) {
            md8.checkNotNullParameter(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            C2307ch c2307ch = C2307ch.f16504a;
            sb.append(c2307ch.adServicesVersion());
            if (c2307ch.adServicesVersion() >= 5) {
                return new ica(context);
            }
            if (c2307ch.extServicesVersionS() >= 9) {
                return (dca) nn0.f65059a.getManager(context, "MeasurementManager", new a(context));
            }
            return null;
        }

        private C4734a() {
        }
    }

    @do8
    @gib
    @igg({"NewApi", "ClassVerificationFailure"})
    public static final dca obtain(@yfb Context context) {
        return f29287a.obtain(context);
    }

    @gib
    public abstract Object deleteRegistrations(@yfb s54 s54Var, @yfb zy2<? super bth> zy2Var);

    @gib
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object getMeasurementApiStatus(@yfb zy2<? super Integer> zy2Var);

    @gib
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object registerSource(@yfb Uri uri, @gib InputEvent inputEvent, @yfb zy2<? super bth> zy2Var);

    @gib
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @yg5.InterfaceC15652e
    public abstract Object registerSource(@yfb nwf nwfVar, @yfb zy2<? super bth> zy2Var);

    @gib
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object registerTrigger(@yfb Uri uri, @yfb zy2<? super bth> zy2Var);

    @gib
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object registerWebSource(@yfb cji cjiVar, @yfb zy2<? super bth> zy2Var);

    @gib
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object registerWebTrigger(@yfb lji ljiVar, @yfb zy2<? super bth> zy2Var);
}
