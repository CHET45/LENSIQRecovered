package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class ip6 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final ip6 f47830a = new ip6();

    /* JADX INFO: renamed from: b */
    public static final int f47831b = 0;

    /* JADX INFO: renamed from: ip6$a */
    @vw7
    public interface InterfaceC7552a {
        @yfb
        String getAxisName();

        boolean getNeedsDensity();

        float toVariationValue(@gib c64 c64Var);
    }

    /* JADX INFO: renamed from: ip6$b */
    @vw7
    public static final class C7553b implements InterfaceC7552a {

        /* JADX INFO: renamed from: a */
        @yfb
        public final String f47832a;

        /* JADX INFO: renamed from: b */
        public final float f47833b;

        /* JADX INFO: renamed from: c */
        public final boolean f47834c;

        public C7553b(@yfb String str, float f) {
            this.f47832a = str;
            this.f47833b = f;
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7553b)) {
                return false;
            }
            C7553b c7553b = (C7553b) obj;
            return md8.areEqual(getAxisName(), c7553b.getAxisName()) && this.f47833b == c7553b.f47833b;
        }

        @Override // p000.ip6.InterfaceC7552a
        @yfb
        public String getAxisName() {
            return this.f47832a;
        }

        @Override // p000.ip6.InterfaceC7552a
        public boolean getNeedsDensity() {
            return this.f47834c;
        }

        public final float getValue() {
            return this.f47833b;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + Float.hashCode(this.f47833b);
        }

        @yfb
        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.f47833b + ')';
        }

        @Override // p000.ip6.InterfaceC7552a
        public float toVariationValue(@gib c64 c64Var) {
            return this.f47833b;
        }
    }

    /* JADX INFO: renamed from: ip6$c */
    @vw7
    public static final class C7554c implements InterfaceC7552a {

        /* JADX INFO: renamed from: a */
        @yfb
        public final String f47835a;

        /* JADX INFO: renamed from: b */
        public final int f47836b;

        /* JADX INFO: renamed from: c */
        public final boolean f47837c;

        public C7554c(@yfb String str, int i) {
            this.f47835a = str;
            this.f47836b = i;
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7554c)) {
                return false;
            }
            C7554c c7554c = (C7554c) obj;
            return md8.areEqual(getAxisName(), c7554c.getAxisName()) && this.f47836b == c7554c.f47836b;
        }

        @Override // p000.ip6.InterfaceC7552a
        @yfb
        public String getAxisName() {
            return this.f47835a;
        }

        @Override // p000.ip6.InterfaceC7552a
        public boolean getNeedsDensity() {
            return this.f47837c;
        }

        public final int getValue() {
            return this.f47836b;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + this.f47836b;
        }

        @yfb
        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.f47836b + ')';
        }

        @Override // p000.ip6.InterfaceC7552a
        public float toVariationValue(@gib c64 c64Var) {
            return this.f47836b;
        }
    }

    /* JADX INFO: renamed from: ip6$d */
    @dwf({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$SettingTextUnit\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n1#2:374\n*E\n"})
    @vw7
    public static final class C7555d implements InterfaceC7552a {

        /* JADX INFO: renamed from: a */
        @yfb
        public final String f47838a;

        /* JADX INFO: renamed from: b */
        public final long f47839b;

        /* JADX INFO: renamed from: c */
        public final boolean f47840c;

        public /* synthetic */ C7555d(String str, long j, jt3 jt3Var) {
            this(str, j);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7555d)) {
                return false;
            }
            C7555d c7555d = (C7555d) obj;
            return md8.areEqual(getAxisName(), c7555d.getAxisName()) && jwg.m30610equalsimpl0(this.f47839b, c7555d.f47839b);
        }

        @Override // p000.ip6.InterfaceC7552a
        @yfb
        public String getAxisName() {
            return this.f47838a;
        }

        @Override // p000.ip6.InterfaceC7552a
        public boolean getNeedsDensity() {
            return this.f47840c;
        }

        /* JADX INFO: renamed from: getValue-XSAIIZE, reason: not valid java name */
        public final long m30315getValueXSAIIZE() {
            return this.f47839b;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + jwg.m30614hashCodeimpl(this.f47839b);
        }

        @yfb
        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + ((Object) jwg.m30620toStringimpl(this.f47839b)) + ')';
        }

        @Override // p000.ip6.InterfaceC7552a
        public float toVariationValue(@gib c64 c64Var) {
            if (c64Var != null) {
                return jwg.m30613getValueimpl(this.f47839b) * c64Var.getFontScale();
            }
            throw new IllegalArgumentException("density must not be null");
        }

        private C7555d(String str, long j) {
            this.f47838a = str;
            this.f47839b = j;
            this.f47840c = true;
        }
    }

    /* JADX INFO: renamed from: ip6$e */
    @dwf({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,373:1\n10783#2:374\n11008#2,3:375\n11011#2,3:385\n361#3,7:378\n76#4:388\n96#4,5:389\n101#5,2:394\n33#5,6:396\n103#5:402\n*S KotlinDebug\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n*L\n52#1:374\n52#1:375,3\n52#1:385,3\n52#1:378,7\n53#1:388\n53#1:389,5\n60#1:394,2\n60#1:396,6\n60#1:402\n*E\n"})
    @vw7
    public static final class C7556e {

        /* JADX INFO: renamed from: c */
        public static final int f47841c = 0;

        /* JADX INFO: renamed from: a */
        @yfb
        public final List<InterfaceC7552a> f47842a;

        /* JADX INFO: renamed from: b */
        public final boolean f47843b;

        public C7556e(@yfb InterfaceC7552a... interfaceC7552aArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z = false;
            for (InterfaceC7552a interfaceC7552a : interfaceC7552aArr) {
                String axisName = interfaceC7552a.getAxisName();
                Object arrayList = linkedHashMap.get(axisName);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(axisName, arrayList);
                }
                ((List) arrayList).add(interfaceC7552a);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() != 1) {
                    throw new IllegalArgumentException(('\'' + str + "' must be unique. Actual [ [" + v82.joinToString$default(list, null, null, null, 0, null, null, 63, null) + C4584d2.f28243l).toString());
                }
                q82.addAll(arrayList2, list);
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            this.f47842a = arrayList3;
            int size = arrayList3.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (((InterfaceC7552a) arrayList3.get(i)).getNeedsDensity()) {
                    z = true;
                    break;
                }
                i++;
            }
            this.f47843b = z;
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C7556e) && md8.areEqual(this.f47842a, ((C7556e) obj).f47842a);
        }

        public final boolean getNeedsDensity$ui_text_release() {
            return this.f47843b;
        }

        @yfb
        public final List<InterfaceC7552a> getSettings() {
            return this.f47842a;
        }

        public int hashCode() {
            return this.f47842a.hashCode();
        }
    }

    private ip6() {
    }

    @yfb
    public final InterfaceC7552a Setting(@yfb String str, float f) {
        if (str.length() == 4) {
            return new C7553b(str, f);
        }
        throw new IllegalArgumentException(("Name must be exactly four characters. Actual: '" + str + '\'').toString());
    }

    @yfb
    /* JADX INFO: renamed from: Settings-6EWAqTQ, reason: not valid java name */
    public final C7556e m30313Settings6EWAqTQ(@yfb jp6 jp6Var, int i, @yfb InterfaceC7552a... interfaceC7552aArr) {
        fzf fzfVar = new fzf(3);
        fzfVar.add(weight(jp6Var.getWeight()));
        fzfVar.add(italic(i));
        fzfVar.addSpread(interfaceC7552aArr);
        return new C7556e((InterfaceC7552a[]) fzfVar.toArray(new InterfaceC7552a[fzfVar.size()]));
    }

    @yfb
    public final InterfaceC7552a grade(int i) {
        if (-1000 > i || i >= 1001) {
            throw new IllegalArgumentException("'GRAD' must be in -1000..1000");
        }
        return new C7554c("GRAD", i);
    }

    @yfb
    public final InterfaceC7552a italic(float f) {
        if (0.0f <= f && f <= 1.0f) {
            return new C7553b("ital", f);
        }
        throw new IllegalArgumentException(("'ital' must be in 0.0f..1.0f. Actual: " + f).toString());
    }

    @yfb
    /* JADX INFO: renamed from: opticalSizing--R2X_6o, reason: not valid java name */
    public final InterfaceC7552a m30314opticalSizingR2X_6o(long j) {
        if (jwg.m30616isSpimpl(j)) {
            return new C7555d("opsz", j, null);
        }
        throw new IllegalArgumentException("'opsz' must be provided in sp units");
    }

    @yfb
    public final InterfaceC7552a slant(float f) {
        if (-90.0f <= f && f <= 90.0f) {
            return new C7553b("slnt", f);
        }
        throw new IllegalArgumentException(("'slnt' must be in -90f..90f. Actual: " + f).toString());
    }

    @yfb
    public final InterfaceC7552a weight(int i) {
        if (1 <= i && i < 1001) {
            return new C7554c("wght", i);
        }
        throw new IllegalArgumentException(("'wght' value must be in [1, 1000]. Actual: " + i).toString());
    }

    @yfb
    public final InterfaceC7552a width(float f) {
        if (f > 0.0f) {
            return new C7553b("wdth", f);
        }
        throw new IllegalArgumentException(("'wdth' must be strictly > 0.0f. Actual: " + f).toString());
    }
}
