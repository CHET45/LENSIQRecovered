package p000;

import androidx.appcompat.widget.C0546a;
import java.text.MessageFormat;
import java.util.logging.Level;
import p000.da8;
import p000.pu1;

/* JADX INFO: loaded from: classes7.dex */
public final class qu1 extends pu1 {

    /* JADX INFO: renamed from: a */
    public final zu1 f75760a;

    /* JADX INFO: renamed from: b */
    public final q0h f75761b;

    /* JADX INFO: renamed from: qu1$a */
    public static /* synthetic */ class C11696a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f75762a;

        static {
            int[] iArr = new int[pu1.EnumC11124a.values().length];
            f75762a = iArr;
            try {
                iArr[pu1.EnumC11124a.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f75762a[pu1.EnumC11124a.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f75762a[pu1.EnumC11124a.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public qu1(zu1 zu1Var, q0h q0hVar) {
        this.f75760a = (zu1) v7d.checkNotNull(zu1Var, "tracer");
        this.f75761b = (q0h) v7d.checkNotNull(q0hVar, C0546a.f3357s);
    }

    /* JADX INFO: renamed from: a */
    public static void m20662a(cb8 cb8Var, pu1.EnumC11124a enumC11124a, String str) {
        Level javaLogLevel = toJavaLogLevel(enumC11124a);
        if (zu1.f106090f.isLoggable(javaLogLevel)) {
            zu1.m27089d(cb8Var, javaLogLevel, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m20663b(cb8 cb8Var, pu1.EnumC11124a enumC11124a, String str, Object... objArr) {
        Level javaLogLevel = toJavaLogLevel(enumC11124a);
        if (zu1.f106090f.isLoggable(javaLogLevel)) {
            zu1.m27089d(cb8Var, javaLogLevel, MessageFormat.format(str, objArr));
        }
    }

    private boolean isTraceable(pu1.EnumC11124a enumC11124a) {
        return enumC11124a != pu1.EnumC11124a.DEBUG && this.f75760a.m27091c();
    }

    private static Level toJavaLogLevel(pu1.EnumC11124a enumC11124a) {
        int i = C11696a.f75762a[enumC11124a.ordinal()];
        return (i == 1 || i == 2) ? Level.FINE : i != 3 ? Level.FINEST : Level.FINER;
    }

    private static da8.C4686c.b.EnumC16427b toTracerSeverity(pu1.EnumC11124a enumC11124a) {
        int i = C11696a.f75762a[enumC11124a.ordinal()];
        return i != 1 ? i != 2 ? da8.C4686c.b.EnumC16427b.CT_INFO : da8.C4686c.b.EnumC16427b.CT_WARNING : da8.C4686c.b.EnumC16427b.CT_ERROR;
    }

    private void trace(pu1.EnumC11124a enumC11124a, String str) {
        if (enumC11124a == pu1.EnumC11124a.DEBUG) {
            return;
        }
        this.f75760a.m27093f(new da8.C4686c.b.a().setDescription(str).setSeverity(toTracerSeverity(enumC11124a)).setTimestampNanos(this.f75761b.currentTimeNanos()).build());
    }

    @Override // p000.pu1
    public void log(pu1.EnumC11124a enumC11124a, String str) {
        m20662a(this.f75760a.m27090b(), enumC11124a, str);
        if (isTraceable(enumC11124a)) {
            trace(enumC11124a, str);
        }
    }

    @Override // p000.pu1
    public void log(pu1.EnumC11124a enumC11124a, String str, Object... objArr) {
        log(enumC11124a, (isTraceable(enumC11124a) || zu1.f106090f.isLoggable(toJavaLogLevel(enumC11124a))) ? MessageFormat.format(str, objArr) : null);
    }
}
