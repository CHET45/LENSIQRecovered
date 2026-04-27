package p000;

import android.adservices.common.FrequencyCapFilters;
import android.adservices.common.KeyedFrequencyCap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.e5e;
import p000.p7e;
import p000.yg5;

/* JADX INFO: loaded from: classes3.dex */
@yg5.InterfaceC15651d
public final class qx6 {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C11756b f76258e = new C11756b(null);

    /* JADX INFO: renamed from: f */
    public static final int f76259f = 0;

    /* JADX INFO: renamed from: g */
    public static final int f76260g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f76261h = 2;

    /* JADX INFO: renamed from: i */
    public static final int f76262i = 3;

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<gs8> f76263a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final List<gs8> f76264b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final List<gs8> f76265c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final List<gs8> f76266d;

    /* JADX INFO: renamed from: qx6$a */
    @p7e({p7e.EnumC10826a.f69934a})
    @i8e(EnumC11189pz.f72536a)
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC11755a {
    }

    /* JADX INFO: renamed from: qx6$b */
    public static final class C11756b {
        public /* synthetic */ C11756b(jt3 jt3Var) {
            this();
        }

        private C11756b() {
        }
    }

    @yn8
    public qx6() {
        this(null, null, null, null, 15, null);
    }

    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 8), @e5e(extension = 31, version = 9)})
    private final List<KeyedFrequencyCap> convertToAdServices(List<gs8> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<gs8> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().convertToAdServices$ads_adservices_release());
        }
        return arrayList;
    }

    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 8), @e5e(extension = 31, version = 9)})
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public final FrequencyCapFilters convertToAdServices$ads_adservices_release() {
        FrequencyCapFilters frequencyCapFiltersBuild = px6.m19834a().setKeyedFrequencyCapsForWinEvents(convertToAdServices(this.f76263a)).setKeyedFrequencyCapsForImpressionEvents(convertToAdServices(this.f76264b)).setKeyedFrequencyCapsForViewEvents(convertToAdServices(this.f76265c)).setKeyedFrequencyCapsForClickEvents(convertToAdServices(this.f76266d)).build();
        md8.checkNotNullExpressionValue(frequencyCapFiltersBuild, "Builder()\n            .s…   )\n            .build()");
        return frequencyCapFiltersBuild;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx6)) {
            return false;
        }
        qx6 qx6Var = (qx6) obj;
        return md8.areEqual(this.f76263a, qx6Var.f76263a) && md8.areEqual(this.f76264b, qx6Var.f76264b) && md8.areEqual(this.f76265c, qx6Var.f76265c) && md8.areEqual(this.f76266d, qx6Var.f76266d);
    }

    @yfb
    public final List<gs8> getKeyedFrequencyCapsForClickEvents() {
        return this.f76266d;
    }

    @yfb
    public final List<gs8> getKeyedFrequencyCapsForImpressionEvents() {
        return this.f76264b;
    }

    @yfb
    public final List<gs8> getKeyedFrequencyCapsForViewEvents() {
        return this.f76265c;
    }

    @yfb
    public final List<gs8> getKeyedFrequencyCapsForWinEvents() {
        return this.f76263a;
    }

    public int hashCode() {
        return (((((this.f76263a.hashCode() * 31) + this.f76264b.hashCode()) * 31) + this.f76265c.hashCode()) * 31) + this.f76266d.hashCode();
    }

    @yfb
    public String toString() {
        return "FrequencyCapFilters: keyedFrequencyCapsForWinEvents=" + this.f76263a + ", keyedFrequencyCapsForImpressionEvents=" + this.f76264b + ", keyedFrequencyCapsForViewEvents=" + this.f76265c + ", keyedFrequencyCapsForClickEvents=" + this.f76266d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public qx6(@yfb List<gs8> list) {
        this(list, null, null, null, 14, null);
        md8.checkNotNullParameter(list, "keyedFrequencyCapsForWinEvents");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public qx6(@yfb List<gs8> list, @yfb List<gs8> list2) {
        this(list, list2, null, null, 12, null);
        md8.checkNotNullParameter(list, "keyedFrequencyCapsForWinEvents");
        md8.checkNotNullParameter(list2, "keyedFrequencyCapsForImpressionEvents");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public qx6(@yfb List<gs8> list, @yfb List<gs8> list2, @yfb List<gs8> list3) {
        this(list, list2, list3, null, 8, null);
        md8.checkNotNullParameter(list, "keyedFrequencyCapsForWinEvents");
        md8.checkNotNullParameter(list2, "keyedFrequencyCapsForImpressionEvents");
        md8.checkNotNullParameter(list3, "keyedFrequencyCapsForViewEvents");
    }

    @yn8
    public qx6(@yfb List<gs8> list, @yfb List<gs8> list2, @yfb List<gs8> list3, @yfb List<gs8> list4) {
        md8.checkNotNullParameter(list, "keyedFrequencyCapsForWinEvents");
        md8.checkNotNullParameter(list2, "keyedFrequencyCapsForImpressionEvents");
        md8.checkNotNullParameter(list3, "keyedFrequencyCapsForViewEvents");
        md8.checkNotNullParameter(list4, "keyedFrequencyCapsForClickEvents");
        this.f76263a = list;
        this.f76264b = list2;
        this.f76265c = list3;
        this.f76266d = list4;
    }

    public /* synthetic */ qx6(List list, List list2, List list3, List list4, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? l82.emptyList() : list, (i & 2) != 0 ? l82.emptyList() : list2, (i & 4) != 0 ? l82.emptyList() : list3, (i & 8) != 0 ? l82.emptyList() : list4);
    }
}
