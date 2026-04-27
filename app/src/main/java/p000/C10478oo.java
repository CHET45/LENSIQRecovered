package p000;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: oo */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class C10478oo implements InterfaceC6718h6 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final a f68210b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f68211c = 8;

    /* JADX INFO: renamed from: d */
    @Deprecated
    public static final int f68212d = 1;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public static final int f68213e = 2;

    /* JADX INFO: renamed from: f */
    @Deprecated
    public static final int f68214f = 4;

    /* JADX INFO: renamed from: a */
    @yfb
    public final AccessibilityManager f68215a;

    /* JADX INFO: renamed from: oo$a */
    public static final class a {
        public /* synthetic */ a(jt3 jt3Var) {
            this();
        }

        private a() {
        }
    }

    public C10478oo(@yfb Context context) {
        Object systemService = context.getSystemService("accessibility");
        md8.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f68215a = (AccessibilityManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.InterfaceC6718h6
    public long calculateRecommendedTimeoutMillis(long j, boolean z, boolean z2, boolean z3) {
        int i = z;
        if (j >= 2147483647L) {
            return j;
        }
        if (z2) {
            i = (z ? 1 : 0) | 2;
        }
        if (z3) {
            i = (i == true ? 1 : 0) | 4;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int recommendedTimeoutMillis = s00.f80239a.getRecommendedTimeoutMillis(this.f68215a, (int) j, i);
            if (recommendedTimeoutMillis != Integer.MAX_VALUE) {
                return recommendedTimeoutMillis;
            }
        } else if (!z3 || !this.f68215a.isTouchExplorationEnabled()) {
            return j;
        }
        return Long.MAX_VALUE;
    }
}
