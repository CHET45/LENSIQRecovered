package p000;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.f0f;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 5 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n1#1,366:1\n37#2,2:367\n37#2,2:369\n1557#3:371\n1628#3,3:372\n16#4:375\n16#4:376\n16#4:377\n21#4:378\n111#5,10:379\n*S KotlinDebug\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorImpl\n*L\n336#1:367,2\n338#1:369,2\n340#1:371\n340#1:372,3\n344#1:375\n346#1:376\n347#1:377\n348#1:378\n351#1:379,10\n*E\n"})
public final class j0f implements f0f, xm1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f49304a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final u0f f49305b;

    /* JADX INFO: renamed from: c */
    public final int f49306c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final List<Annotation> f49307d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final Set<String> f49308e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final String[] f49309f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final f0f[] f49310g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final List<Annotation>[] f49311h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final boolean[] f49312i;

    /* JADX INFO: renamed from: j */
    @yfb
    public final Map<String, Integer> f49313j;

    /* JADX INFO: renamed from: k */
    @yfb
    public final f0f[] f49314k;

    /* JADX INFO: renamed from: l */
    @yfb
    public final fx8 f49315l;

    public j0f(@yfb String str, @yfb u0f u0fVar, int i, @yfb List<? extends f0f> list, @yfb l12 l12Var) {
        md8.checkNotNullParameter(str, "serialName");
        md8.checkNotNullParameter(u0fVar, "kind");
        md8.checkNotNullParameter(list, "typeParameters");
        md8.checkNotNullParameter(l12Var, "builder");
        this.f49304a = str;
        this.f49305b = u0fVar;
        this.f49306c = i;
        this.f49307d = l12Var.getAnnotations();
        this.f49308e = v82.toHashSet(l12Var.getElementNames$kotlinx_serialization_core());
        String[] strArr = (String[]) l12Var.getElementNames$kotlinx_serialization_core().toArray(new String[0]);
        this.f49309f = strArr;
        this.f49310g = hyc.compactArray(l12Var.getElementDescriptors$kotlinx_serialization_core());
        this.f49311h = (List[]) l12Var.getElementAnnotations$kotlinx_serialization_core().toArray(new List[0]);
        this.f49312i = v82.toBooleanArray(l12Var.getElementOptionality$kotlinx_serialization_core());
        Iterable<q08> iterableWithIndex = e80.withIndex(strArr);
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(iterableWithIndex, 10));
        for (q08 q08Var : iterableWithIndex) {
            arrayList.add(vkh.m24050to(q08Var.getValue(), Integer.valueOf(q08Var.getIndex())));
        }
        this.f49313j = xt9.toMap(arrayList);
        this.f49314k = hyc.compactArray(list);
        this.f49315l = hz8.lazy(new ny6() { // from class: h0f
            @Override // p000.ny6
            public final Object invoke() {
                return Integer.valueOf(j0f._hashCode_delegate$lambda$1(this.f41932a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _hashCode_delegate$lambda$1(j0f j0fVar) {
        return i1d.hashCodeImpl(j0fVar, j0fVar.f49314k);
    }

    private final int get_hashCode() {
        return ((Number) this.f49315l.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$3(j0f j0fVar, int i) {
        return j0fVar.getElementName(i) + ": " + j0fVar.getElementDescriptor(i).getSerialName();
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0f) {
            f0f f0fVar = (f0f) obj;
            if (md8.areEqual(getSerialName(), f0fVar.getSerialName()) && Arrays.equals(this.f49314k, ((j0f) obj).f49314k) && getElementsCount() == f0fVar.getElementsCount()) {
                int elementsCount = getElementsCount();
                for (int i = 0; i < elementsCount; i++) {
                    if (md8.areEqual(getElementDescriptor(i).getSerialName(), f0fVar.getElementDescriptor(i).getSerialName()) && md8.areEqual(getElementDescriptor(i).getKind(), f0fVar.getElementDescriptor(i).getKind())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p000.f0f
    @yfb
    public List<Annotation> getAnnotations() {
        return this.f49307d;
    }

    @Override // p000.f0f
    @yfb
    public List<Annotation> getElementAnnotations(int i) {
        return this.f49311h[i];
    }

    @Override // p000.f0f
    @yfb
    public f0f getElementDescriptor(int i) {
        return this.f49310g[i];
    }

    @Override // p000.f0f
    public int getElementIndex(@yfb String str) {
        md8.checkNotNullParameter(str, "name");
        Integer num = this.f49313j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p000.f0f
    @yfb
    public String getElementName(int i) {
        return this.f49309f[i];
    }

    @Override // p000.f0f
    public int getElementsCount() {
        return this.f49306c;
    }

    @Override // p000.f0f
    @yfb
    public u0f getKind() {
        return this.f49305b;
    }

    @Override // p000.f0f
    @yfb
    public String getSerialName() {
        return this.f49304a;
    }

    @Override // p000.xm1
    @yfb
    public Set<String> getSerialNames() {
        return this.f49308e;
    }

    public int hashCode() {
        return get_hashCode();
    }

    @Override // p000.f0f
    public boolean isElementOptional(int i) {
        return this.f49312i[i];
    }

    @Override // p000.f0f
    public boolean isInline() {
        return f0f.C5539a.isInline(this);
    }

    @Override // p000.f0f
    public boolean isNullable() {
        return f0f.C5539a.isNullable(this);
    }

    @yfb
    public String toString() {
        return v82.joinToString$default(kpd.until(0, getElementsCount()), ", ", getSerialName() + '(', c0b.f15434d, 0, null, new qy6() { // from class: i0f
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return j0f.toString$lambda$3(this.f45407a, ((Integer) obj).intValue());
            }
        }, 24, null);
    }
}
