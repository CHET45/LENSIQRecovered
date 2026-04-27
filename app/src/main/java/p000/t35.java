package p000;

import java.util.Iterator;
import p000.u0f;
import p000.xag;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumDescriptor\n+ 2 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n16#2:149\n160#3:150\n1797#4,3:151\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumDescriptor\n*L\n28#1:149\n46#1:150\n46#1:151,3\n*E\n"})
@yjd
public final class t35 extends h1d {

    /* JADX INFO: renamed from: m */
    @yfb
    public final u0f f83605m;

    /* JADX INFO: renamed from: n */
    @yfb
    public final fx8 f83606n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t35(@yfb final String str, final int i) {
        super(str, null, i, 2, null);
        md8.checkNotNullParameter(str, "name");
        this.f83605m = u0f.C13312b.f86523a;
        this.f83606n = hz8.lazy(new ny6() { // from class: s35
            @Override // p000.ny6
            public final Object invoke() {
                return t35.elementDescriptors_delegate$lambda$0(i, str, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0f[] elementDescriptors_delegate$lambda$0(int i, String str, t35 t35Var) {
        f0f[] f0fVarArr = new f0f[i];
        for (int i2 = 0; i2 < i; i2++) {
            f0fVarArr[i2] = n0f.buildSerialDescriptor$default(str + a18.f100c + t35Var.getElementName(i2), xag.C15020d.f97390a, new f0f[0], null, 8, null);
        }
        return f0fVarArr;
    }

    private final f0f[] getElementDescriptors() {
        return (f0f[]) this.f83606n.getValue();
    }

    @Override // p000.h1d
    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f0f)) {
            return false;
        }
        f0f f0fVar = (f0f) obj;
        return f0fVar.getKind() == u0f.C13312b.f86523a && md8.areEqual(getSerialName(), f0fVar.getSerialName()) && md8.areEqual(hyc.cachedSerialNames(this), hyc.cachedSerialNames(f0fVar));
    }

    @Override // p000.h1d, p000.f0f
    @yfb
    public f0f getElementDescriptor(int i) {
        return getElementDescriptors()[i];
    }

    @Override // p000.h1d, p000.f0f
    @yfb
    public u0f getKind() {
        return this.f83605m;
    }

    @Override // p000.h1d
    public int hashCode() {
        int iHashCode = getSerialName().hashCode();
        Iterator<String> it = k0f.getElementNames(this).iterator();
        int iHashCode2 = 1;
        while (it.hasNext()) {
            int i = iHashCode2 * 31;
            String next = it.next();
            iHashCode2 = i + (next != null ? next.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // p000.h1d
    @yfb
    public String toString() {
        return v82.joinToString$default(k0f.getElementNames(this), ", ", getSerialName() + '(', c0b.f15434d, 0, null, null, 56, null);
    }
}
