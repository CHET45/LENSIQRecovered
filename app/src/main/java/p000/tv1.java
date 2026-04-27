package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCharDirectionality.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1202#2,2:125\n1230#2,4:127\n*S KotlinDebug\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality\n*L\n118#1:125,2\n118#1:127,4\n*E\n"})
public final class tv1 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C13251a f86047b;

    /* JADX INFO: renamed from: c */
    @yfb
    public static final fx8<Map<Integer, tv1>> f86049c;

    /* JADX INFO: renamed from: d2 */
    public static final /* synthetic */ tv1[] f86052d2;

    /* JADX INFO: renamed from: e2 */
    public static final /* synthetic */ v35 f86054e2;

    /* JADX INFO: renamed from: a */
    public final int f86057a;

    /* JADX INFO: renamed from: d */
    public static final tv1 f86051d = new tv1("UNDEFINED", 0, -1);

    /* JADX INFO: renamed from: e */
    public static final tv1 f86053e = new tv1("LEFT_TO_RIGHT", 1, 0);

    /* JADX INFO: renamed from: f */
    public static final tv1 f86055f = new tv1("RIGHT_TO_LEFT", 2, 1);

    /* JADX INFO: renamed from: m */
    public static final tv1 f86056m = new tv1("RIGHT_TO_LEFT_ARABIC", 3, 2);

    /* JADX INFO: renamed from: C */
    public static final tv1 f86033C = new tv1("EUROPEAN_NUMBER", 4, 3);

    /* JADX INFO: renamed from: F */
    public static final tv1 f86034F = new tv1("EUROPEAN_NUMBER_SEPARATOR", 5, 4);

    /* JADX INFO: renamed from: H */
    public static final tv1 f86035H = new tv1("EUROPEAN_NUMBER_TERMINATOR", 6, 5);

    /* JADX INFO: renamed from: L */
    public static final tv1 f86036L = new tv1("ARABIC_NUMBER", 7, 6);

    /* JADX INFO: renamed from: M */
    public static final tv1 f86037M = new tv1("COMMON_NUMBER_SEPARATOR", 8, 7);

    /* JADX INFO: renamed from: N */
    public static final tv1 f86039N = new tv1("NONSPACING_MARK", 9, 8);

    /* JADX INFO: renamed from: Q */
    public static final tv1 f86040Q = new tv1("BOUNDARY_NEUTRAL", 10, 9);

    /* JADX INFO: renamed from: X */
    public static final tv1 f86042X = new tv1("PARAGRAPH_SEPARATOR", 11, 10);

    /* JADX INFO: renamed from: Y */
    public static final tv1 f86043Y = new tv1("SEGMENT_SEPARATOR", 12, 11);

    /* JADX INFO: renamed from: Z */
    public static final tv1 f86044Z = new tv1("WHITESPACE", 13, 12);

    /* JADX INFO: renamed from: M1 */
    public static final tv1 f86038M1 = new tv1("OTHER_NEUTRALS", 14, 13);

    /* JADX INFO: renamed from: V1 */
    public static final tv1 f86041V1 = new tv1("LEFT_TO_RIGHT_EMBEDDING", 15, 14);

    /* JADX INFO: renamed from: Z1 */
    public static final tv1 f86045Z1 = new tv1("LEFT_TO_RIGHT_OVERRIDE", 16, 15);

    /* JADX INFO: renamed from: a2 */
    public static final tv1 f86046a2 = new tv1("RIGHT_TO_LEFT_EMBEDDING", 17, 16);

    /* JADX INFO: renamed from: b2 */
    public static final tv1 f86048b2 = new tv1("RIGHT_TO_LEFT_OVERRIDE", 18, 17);

    /* JADX INFO: renamed from: c2 */
    public static final tv1 f86050c2 = new tv1("POP_DIRECTIONAL_FORMAT", 19, 18);

    /* JADX INFO: renamed from: tv1$a */
    public static final class C13251a {
        public /* synthetic */ C13251a(jt3 jt3Var) {
            this();
        }

        private final Map<Integer, tv1> getDirectionalityMap() {
            return (Map) tv1.f86049c.getValue();
        }

        @yfb
        public final tv1 valueOf(int i) {
            tv1 tv1Var = getDirectionalityMap().get(Integer.valueOf(i));
            if (tv1Var != null) {
                return tv1Var;
            }
            throw new IllegalArgumentException("Directionality #" + i + " is not defined.");
        }

        private C13251a() {
        }
    }

    private static final /* synthetic */ tv1[] $values() {
        return new tv1[]{f86051d, f86053e, f86055f, f86056m, f86033C, f86034F, f86035H, f86036L, f86037M, f86039N, f86040Q, f86042X, f86043Y, f86044Z, f86038M1, f86041V1, f86045Z1, f86046a2, f86048b2, f86050c2};
    }

    static {
        tv1[] tv1VarArr$values = $values();
        f86052d2 = tv1VarArr$values;
        f86054e2 = x35.enumEntries(tv1VarArr$values);
        f86047b = new C13251a(null);
        f86049c = hz8.lazy(new ny6() { // from class: sv1
            @Override // p000.ny6
            public final Object invoke() {
                return tv1.directionalityMap_delegate$lambda$1();
            }
        });
    }

    private tv1(String str, int i, int i2) {
        this.f86057a = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map directionalityMap_delegate$lambda$1() {
        v35<tv1> entries = getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(m82.collectionSizeOrDefault(entries, 10)), 16));
        for (tv1 tv1Var : entries) {
            linkedHashMap.put(Integer.valueOf(tv1Var.f86057a), tv1Var);
        }
        return linkedHashMap;
    }

    @yfb
    public static v35<tv1> getEntries() {
        return f86054e2;
    }

    public static tv1 valueOf(String str) {
        return (tv1) Enum.valueOf(tv1.class, str);
    }

    public static tv1[] values() {
        return (tv1[]) f86052d2.clone();
    }

    public final int getValue() {
        return this.f86057a;
    }
}
