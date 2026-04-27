package p000;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.4")
public final class gmh implements mp8 {

    /* JADX INFO: renamed from: C */
    public static final int f40301C = 4;

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C6428a f40302e = new C6428a(null);

    /* JADX INFO: renamed from: f */
    public static final int f40303f = 1;

    /* JADX INFO: renamed from: m */
    public static final int f40304m = 2;

    /* JADX INFO: renamed from: a */
    @yfb
    public final ro8 f40305a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final List<pp8> f40306b;

    /* JADX INFO: renamed from: c */
    @gib
    public final mp8 f40307c;

    /* JADX INFO: renamed from: d */
    public final int f40308d;

    /* JADX INFO: renamed from: gmh$a */
    public static final class C6428a {
        public /* synthetic */ C6428a(jt3 jt3Var) {
            this();
        }

        private C6428a() {
        }
    }

    /* JADX INFO: renamed from: gmh$b */
    public /* synthetic */ class C6429b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f40309a;

        static {
            int[] iArr = new int[rp8.values().length];
            try {
                iArr[rp8.f78978a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rp8.f78979b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rp8.f78980c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40309a = iArr;
        }
    }

    @jjf(version = "1.6")
    public gmh(@yfb ro8 ro8Var, @yfb List<pp8> list, @gib mp8 mp8Var, int i) {
        md8.checkNotNullParameter(ro8Var, "classifier");
        md8.checkNotNullParameter(list, "arguments");
        this.f40305a = ro8Var;
        this.f40306b = list;
        this.f40307c = mp8Var;
        this.f40308d = i;
    }

    private final String asString(boolean z) {
        String name;
        ro8 classifier = getClassifier();
        oo8 oo8Var = classifier instanceof oo8 ? (oo8) classifier : null;
        Class<?> javaClass = oo8Var != null ? hn8.getJavaClass(oo8Var) : null;
        if (javaClass == null) {
            name = getClassifier().toString();
        } else if ((this.f40308d & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (javaClass.isArray()) {
            name = getArrayClassName(javaClass);
        } else if (z && javaClass.isPrimitive()) {
            ro8 classifier2 = getClassifier();
            md8.checkNotNull(classifier2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = hn8.getJavaObjectType((oo8) classifier2).getName();
        } else {
            name = javaClass.getName();
        }
        String str = name + (getArguments().isEmpty() ? "" : v82.joinToString$default(getArguments(), ", ", "<", ">", 0, null, new qy6() { // from class: fmh
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return gmh.asString$lambda$0(this.f37141a, (pp8) obj);
            }
        }, 24, null)) + (isMarkedNullable() ? "?" : "");
        mp8 mp8Var = this.f40307c;
        if (!(mp8Var instanceof gmh)) {
            return str;
        }
        String strAsString = ((gmh) mp8Var).asString(true);
        if (md8.areEqual(strAsString, str)) {
            return str;
        }
        if (md8.areEqual(strAsString, str + '?')) {
            return str + '!';
        }
        return '(' + str + ".." + strAsString + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence asString$lambda$0(gmh gmhVar, pp8 pp8Var) {
        md8.checkNotNullParameter(pp8Var, "it");
        return gmhVar.asString(pp8Var);
    }

    private final String getArrayClassName(Class<?> cls) {
        return md8.areEqual(cls, boolean[].class) ? "kotlin.BooleanArray" : md8.areEqual(cls, char[].class) ? "kotlin.CharArray" : md8.areEqual(cls, byte[].class) ? "kotlin.ByteArray" : md8.areEqual(cls, short[].class) ? "kotlin.ShortArray" : md8.areEqual(cls, int[].class) ? "kotlin.IntArray" : md8.areEqual(cls, float[].class) ? "kotlin.FloatArray" : md8.areEqual(cls, long[].class) ? "kotlin.LongArray" : md8.areEqual(cls, double[].class) ? "kotlin.DoubleArray" : u72.f86923a;
    }

    @jjf(version = "1.6")
    public static /* synthetic */ void getFlags$kotlin_stdlib$annotations() {
    }

    @jjf(version = "1.6")
    public static /* synthetic */ void getPlatformTypeUpperBound$kotlin_stdlib$annotations() {
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof gmh) {
            gmh gmhVar = (gmh) obj;
            if (md8.areEqual(getClassifier(), gmhVar.getClassifier()) && md8.areEqual(getArguments(), gmhVar.getArguments()) && md8.areEqual(this.f40307c, gmhVar.f40307c) && this.f40308d == gmhVar.f40308d) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.mo8
    @yfb
    public List<Annotation> getAnnotations() {
        return l82.emptyList();
    }

    @Override // p000.mp8
    @yfb
    public List<pp8> getArguments() {
        return this.f40306b;
    }

    @Override // p000.mp8
    @yfb
    public ro8 getClassifier() {
        return this.f40305a;
    }

    public final int getFlags$kotlin_stdlib() {
        return this.f40308d;
    }

    @gib
    public final mp8 getPlatformTypeUpperBound$kotlin_stdlib() {
        return this.f40307c;
    }

    public int hashCode() {
        return (((getClassifier().hashCode() * 31) + getArguments().hashCode()) * 31) + Integer.hashCode(this.f40308d);
    }

    @Override // p000.mp8
    public boolean isMarkedNullable() {
        return (this.f40308d & 1) != 0;
    }

    @yfb
    public String toString() {
        return asString(false) + vvd.f92391b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gmh(@yfb ro8 ro8Var, @yfb List<pp8> list, boolean z) {
        this(ro8Var, list, null, z ? 1 : 0);
        md8.checkNotNullParameter(ro8Var, "classifier");
        md8.checkNotNullParameter(list, "arguments");
    }

    private final String asString(pp8 pp8Var) {
        String strValueOf;
        if (pp8Var.getVariance() == null) {
            return "*";
        }
        mp8 type = pp8Var.getType();
        gmh gmhVar = type instanceof gmh ? (gmh) type : null;
        if (gmhVar == null || (strValueOf = gmhVar.asString(true)) == null) {
            strValueOf = String.valueOf(pp8Var.getType());
        }
        rp8 variance = pp8Var.getVariance();
        int i = variance == null ? -1 : C6429b.f40309a[variance.ordinal()];
        if (i == 1) {
            return strValueOf;
        }
        if (i == 2) {
            return "in " + strValueOf;
        }
        if (i == 3) {
            return "out " + strValueOf;
        }
        throw new ceb();
    }
}
