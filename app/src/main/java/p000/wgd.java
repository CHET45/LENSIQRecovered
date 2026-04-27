package p000;

import android.adservices.signals.ProtectedSignalsManager;
import android.content.Context;
import p000.yg5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wgd {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C14595a f94210a = new C14595a(null);

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f94211b = "ProtectedSignalsManager";

    /* JADX INFO: renamed from: wgd$a */
    public static final class C14595a {
        public /* synthetic */ C14595a(jt3 jt3Var) {
            this();
        }

        @gib
        @yg5.InterfaceC15650c
        @do8
        @igg({"NewApi"})
        public final wgd obtain(@yfb Context context) {
            md8.checkNotNullParameter(context, "context");
            if (C2307ch.f16504a.adServicesVersion() < 12) {
                return null;
            }
            ProtectedSignalsManager protectedSignalsManager = ProtectedSignalsManager.get(context);
            md8.checkNotNullExpressionValue(protectedSignalsManager, "get(context)");
            return new chd(protectedSignalsManager);
        }

        private C14595a() {
        }
    }

    @gib
    @yg5.InterfaceC15650c
    @do8
    @igg({"NewApi"})
    public static final wgd obtain(@yfb Context context) {
        return f94210a.obtain(context);
    }

    @gib
    @yg5.InterfaceC15650c
    @j5e("android.permission.ACCESS_ADSERVICES_PROTECTED_SIGNALS")
    public abstract Object updateSignals(@yfb lwh lwhVar, @yfb zy2<? super bth> zy2Var);
}
