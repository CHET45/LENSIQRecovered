package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nInlineClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassDescriptor.kt\nkotlinx/serialization/internal/InlineClassDescriptor\n+ 2 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n1#1,44:1\n111#2,10:45\n*S KotlinDebug\n*F\n+ 1 InlineClassDescriptor.kt\nkotlinx/serialization/internal/InlineClassDescriptor\n*L\n22#1:45,10\n*E\n"})
@yjd
public final class d28 extends h1d {

    /* JADX INFO: renamed from: m */
    public final boolean f28262m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d28(@yfb String str, @yfb w27<?> w27Var) {
        super(str, w27Var, 1);
        md8.checkNotNullParameter(str, "name");
        md8.checkNotNullParameter(w27Var, "generatedSerializer");
        this.f28262m = true;
    }

    @Override // p000.h1d
    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d28) {
            f0f f0fVar = (f0f) obj;
            if (md8.areEqual(getSerialName(), f0fVar.getSerialName())) {
                d28 d28Var = (d28) obj;
                if (d28Var.isInline() && Arrays.equals(getTypeParameterDescriptors$kotlinx_serialization_core(), d28Var.getTypeParameterDescriptors$kotlinx_serialization_core()) && getElementsCount() == f0fVar.getElementsCount()) {
                    int elementsCount = getElementsCount();
                    for (int i = 0; i < elementsCount; i++) {
                        if (md8.areEqual(getElementDescriptor(i).getSerialName(), f0fVar.getElementDescriptor(i).getSerialName()) && md8.areEqual(getElementDescriptor(i).getKind(), f0fVar.getElementDescriptor(i).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.h1d
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // p000.h1d, p000.f0f
    public boolean isInline() {
        return this.f28262m;
    }
}
