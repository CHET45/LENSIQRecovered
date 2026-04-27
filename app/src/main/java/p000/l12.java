package p000;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,366:1\n1#2:367\n*E\n"})
public final class l12 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f55926a;

    /* JADX INFO: renamed from: b */
    public boolean f55927b;

    /* JADX INFO: renamed from: c */
    @yfb
    public List<? extends Annotation> f55928c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final List<String> f55929d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final Set<String> f55930e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final List<f0f> f55931f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final List<List<Annotation>> f55932g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final List<Boolean> f55933h;

    public l12(@yfb String str) {
        md8.checkNotNullParameter(str, "serialName");
        this.f55926a = str;
        this.f55928c = l82.emptyList();
        this.f55929d = new ArrayList();
        this.f55930e = new HashSet();
        this.f55931f = new ArrayList();
        this.f55932g = new ArrayList();
        this.f55933h = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void element$default(l12 l12Var, String str, f0f f0fVar, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            list = l82.emptyList();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        l12Var.element(str, f0fVar, list, z);
    }

    @ph5
    public static /* synthetic */ void getAnnotations$annotations() {
    }

    @ph5
    @q64(level = u64.f86866b, message = "isNullable inside buildSerialDescriptor is deprecated. Please use SerialDescriptor.nullable extension on a builder result.")
    public static /* synthetic */ void isNullable$annotations() {
    }

    public final void element(@yfb String str, @yfb f0f f0fVar, @yfb List<? extends Annotation> list, boolean z) {
        md8.checkNotNullParameter(str, "elementName");
        md8.checkNotNullParameter(f0fVar, "descriptor");
        md8.checkNotNullParameter(list, "annotations");
        if (this.f55930e.add(str)) {
            this.f55929d.add(str);
            this.f55931f.add(f0fVar);
            this.f55932g.add(list);
            this.f55933h.add(Boolean.valueOf(z));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + this.f55926a).toString());
    }

    @yfb
    public final List<Annotation> getAnnotations() {
        return this.f55928c;
    }

    @yfb
    public final List<List<Annotation>> getElementAnnotations$kotlinx_serialization_core() {
        return this.f55932g;
    }

    @yfb
    public final List<f0f> getElementDescriptors$kotlinx_serialization_core() {
        return this.f55931f;
    }

    @yfb
    public final List<String> getElementNames$kotlinx_serialization_core() {
        return this.f55929d;
    }

    @yfb
    public final List<Boolean> getElementOptionality$kotlinx_serialization_core() {
        return this.f55933h;
    }

    @yfb
    public final String getSerialName() {
        return this.f55926a;
    }

    public final boolean isNullable() {
        return this.f55927b;
    }

    public final void setAnnotations(@yfb List<? extends Annotation> list) {
        md8.checkNotNullParameter(list, "<set-?>");
        this.f55928c = list;
    }

    public final void setNullable(boolean z) {
        this.f55927b = z;
    }
}
