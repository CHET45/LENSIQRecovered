package p000;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nPluginGeneratedSerialDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n160#2:135\n160#2:139\n1797#3,3:136\n1797#3,3:140\n*S KotlinDebug\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n128#1:135\n129#1:139\n128#1:136,3\n129#1:140,3\n*E\n"})
public final class i1d {
    public static final /* synthetic */ <SD extends f0f> boolean equalsImpl(SD sd, Object obj, qy6<? super SD, Boolean> qy6Var) {
        md8.checkNotNullParameter(sd, "<this>");
        md8.checkNotNullParameter(qy6Var, "typeParamsAreEqual");
        if (sd == obj) {
            return true;
        }
        md8.reifiedOperationMarker(3, "SD");
        if (!(obj instanceof f0f)) {
            return false;
        }
        f0f f0fVar = (f0f) obj;
        if (!md8.areEqual(sd.getSerialName(), f0fVar.getSerialName()) || !qy6Var.invoke(obj).booleanValue() || sd.getElementsCount() != f0fVar.getElementsCount()) {
            return false;
        }
        int elementsCount = sd.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            if (!md8.areEqual(sd.getElementDescriptor(i).getSerialName(), f0fVar.getElementDescriptor(i).getSerialName()) || !md8.areEqual(sd.getElementDescriptor(i).getKind(), f0fVar.getElementDescriptor(i).getKind())) {
                return false;
            }
        }
        return true;
    }

    public static final int hashCodeImpl(@yfb f0f f0fVar, @yfb f0f[] f0fVarArr) {
        md8.checkNotNullParameter(f0fVar, "<this>");
        md8.checkNotNullParameter(f0fVarArr, "typeParams");
        int iHashCode = (f0fVar.getSerialName().hashCode() * 31) + Arrays.hashCode(f0fVarArr);
        Iterable<f0f> elementDescriptors = k0f.getElementDescriptors(f0fVar);
        Iterator<f0f> it = elementDescriptors.iterator();
        int iHashCode2 = 1;
        int i = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i2 = i * 31;
            String serialName = it.next().getSerialName();
            if (serialName != null) {
                iHashCode3 = serialName.hashCode();
            }
            i = i2 + iHashCode3;
        }
        Iterator<f0f> it2 = elementDescriptors.iterator();
        while (it2.hasNext()) {
            int i3 = iHashCode2 * 31;
            u0f kind = it2.next().getKind();
            iHashCode2 = i3 + (kind != null ? kind.hashCode() : 0);
        }
        return (((iHashCode * 31) + i) * 31) + iHashCode2;
    }
}
