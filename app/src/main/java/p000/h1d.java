package p000;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.f0f;
import p000.xag;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nPluginGeneratedSerialDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptor\n+ 2 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 3 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,134:1\n16#2:135\n21#2:136\n16#2:137\n16#2:138\n111#3,10:139\n11165#4:149\n11500#4,3:150\n*S KotlinDebug\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptor\n*L\n76#1:135\n79#1:136\n81#1:137\n82#1:138\n93#1:139,10\n40#1:149\n40#1:150,3\n*E\n"})
@yjd
public class h1d implements f0f, xm1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f42001a;

    /* JADX INFO: renamed from: b */
    @gib
    public final w27<?> f42002b;

    /* JADX INFO: renamed from: c */
    public final int f42003c;

    /* JADX INFO: renamed from: d */
    public int f42004d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final String[] f42005e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final List<Annotation>[] f42006f;

    /* JADX INFO: renamed from: g */
    @gib
    public List<Annotation> f42007g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final boolean[] f42008h;

    /* JADX INFO: renamed from: i */
    @yfb
    public Map<String, Integer> f42009i;

    /* JADX INFO: renamed from: j */
    @yfb
    public final fx8 f42010j;

    /* JADX INFO: renamed from: k */
    @yfb
    public final fx8 f42011k;

    /* JADX INFO: renamed from: l */
    @yfb
    public final fx8 f42012l;

    public h1d(@yfb String str, @gib w27<?> w27Var, int i) {
        md8.checkNotNullParameter(str, "serialName");
        this.f42001a = str;
        this.f42002b = w27Var;
        this.f42003c = i;
        this.f42004d = -1;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.f42005e = strArr;
        int i3 = this.f42003c;
        this.f42006f = new List[i3];
        this.f42008h = new boolean[i3];
        this.f42009i = xt9.emptyMap();
        g39 g39Var = g39.f38326b;
        this.f42010j = hz8.lazy(g39Var, new ny6() { // from class: e1d
            @Override // p000.ny6
            public final Object invoke() {
                return h1d.childSerializers_delegate$lambda$0(this.f31561a);
            }
        });
        this.f42011k = hz8.lazy(g39Var, new ny6() { // from class: f1d
            @Override // p000.ny6
            public final Object invoke() {
                return h1d.typeParameterDescriptors_delegate$lambda$2(this.f34710a);
            }
        });
        this.f42012l = hz8.lazy(g39Var, new ny6() { // from class: g1d
            @Override // p000.ny6
            public final Object invoke() {
                return Integer.valueOf(h1d._hashCode_delegate$lambda$3(this.f38272a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _hashCode_delegate$lambda$3(h1d h1dVar) {
        return i1d.hashCodeImpl(h1dVar, h1dVar.getTypeParameterDescriptors$kotlinx_serialization_core());
    }

    public static /* synthetic */ void addElement$default(h1d h1dVar, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        h1dVar.addElement(str, z);
    }

    private final Map<String, Integer> buildIndices() {
        HashMap map = new HashMap();
        int length = this.f42005e.length;
        for (int i = 0; i < length; i++) {
            map.put(this.f42005e[i], Integer.valueOf(i));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lp8[] childSerializers_delegate$lambda$0(h1d h1dVar) {
        lp8<?>[] lp8VarArrChildSerializers;
        w27<?> w27Var = h1dVar.f42002b;
        return (w27Var == null || (lp8VarArrChildSerializers = w27Var.childSerializers()) == null) ? j1d.f49358a : lp8VarArrChildSerializers;
    }

    private final lp8<?>[] getChildSerializers() {
        return (lp8[]) this.f42010j.getValue();
    }

    private final int get_hashCode() {
        return ((Number) this.f42012l.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$6(h1d h1dVar, int i) {
        return h1dVar.getElementName(i) + ": " + h1dVar.getElementDescriptor(i).getSerialName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0f[] typeParameterDescriptors_delegate$lambda$2(h1d h1dVar) {
        ArrayList arrayList;
        lp8<?>[] lp8VarArrTypeParametersSerializers;
        w27<?> w27Var = h1dVar.f42002b;
        if (w27Var == null || (lp8VarArrTypeParametersSerializers = w27Var.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(lp8VarArrTypeParametersSerializers.length);
            for (lp8<?> lp8Var : lp8VarArrTypeParametersSerializers) {
                arrayList.add(lp8Var.getDescriptor());
            }
        }
        return hyc.compactArray(arrayList);
    }

    public final void addElement(@yfb String str, boolean z) {
        md8.checkNotNullParameter(str, "name");
        String[] strArr = this.f42005e;
        int i = this.f42004d + 1;
        this.f42004d = i;
        strArr[i] = str;
        this.f42008h[i] = z;
        this.f42006f[i] = null;
        if (i == this.f42003c - 1) {
            this.f42009i = buildIndices();
        }
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h1d) {
            f0f f0fVar = (f0f) obj;
            if (md8.areEqual(getSerialName(), f0fVar.getSerialName()) && Arrays.equals(getTypeParameterDescriptors$kotlinx_serialization_core(), ((h1d) obj).getTypeParameterDescriptors$kotlinx_serialization_core()) && getElementsCount() == f0fVar.getElementsCount()) {
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
        List<Annotation> list = this.f42007g;
        return list == null ? l82.emptyList() : list;
    }

    @Override // p000.f0f
    @yfb
    public List<Annotation> getElementAnnotations(int i) {
        List<Annotation> list = this.f42006f[i];
        return list == null ? l82.emptyList() : list;
    }

    @Override // p000.f0f
    @yfb
    public f0f getElementDescriptor(int i) {
        return getChildSerializers()[i].getDescriptor();
    }

    @Override // p000.f0f
    public int getElementIndex(@yfb String str) {
        md8.checkNotNullParameter(str, "name");
        Integer num = this.f42009i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p000.f0f
    @yfb
    public String getElementName(int i) {
        return this.f42005e[i];
    }

    @Override // p000.f0f
    public final int getElementsCount() {
        return this.f42003c;
    }

    @Override // p000.f0f
    @yfb
    public u0f getKind() {
        return xag.C15017a.f97387a;
    }

    @Override // p000.f0f
    @yfb
    public String getSerialName() {
        return this.f42001a;
    }

    @Override // p000.xm1
    @yfb
    public Set<String> getSerialNames() {
        return this.f42009i.keySet();
    }

    @yfb
    public final f0f[] getTypeParameterDescriptors$kotlinx_serialization_core() {
        return (f0f[]) this.f42011k.getValue();
    }

    public int hashCode() {
        return get_hashCode();
    }

    @Override // p000.f0f
    public boolean isElementOptional(int i) {
        return this.f42008h[i];
    }

    @Override // p000.f0f
    public boolean isInline() {
        return f0f.C5539a.isInline(this);
    }

    @Override // p000.f0f
    public boolean isNullable() {
        return f0f.C5539a.isNullable(this);
    }

    public final void pushAnnotation(@yfb Annotation annotation) {
        md8.checkNotNullParameter(annotation, sm7.f82233c);
        List<Annotation> arrayList = this.f42006f[this.f42004d];
        if (arrayList == null) {
            arrayList = new ArrayList<>(1);
            this.f42006f[this.f42004d] = arrayList;
        }
        arrayList.add(annotation);
    }

    public final void pushClassAnnotation(@yfb Annotation annotation) {
        md8.checkNotNullParameter(annotation, "a");
        if (this.f42007g == null) {
            this.f42007g = new ArrayList(1);
        }
        List<Annotation> list = this.f42007g;
        md8.checkNotNull(list);
        list.add(annotation);
    }

    @yfb
    public String toString() {
        return v82.joinToString$default(kpd.until(0, this.f42003c), ", ", getSerialName() + '(', c0b.f15434d, 0, null, new qy6() { // from class: d1d
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return h1d.toString$lambda$6(this.f28225a, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    public /* synthetic */ h1d(String str, w27 w27Var, int i, int i2, jt3 jt3Var) {
        this(str, (i2 & 2) != 0 ? null : w27Var, i);
    }
}
