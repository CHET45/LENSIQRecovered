package p000;

import p000.u0f;
import p000.xag;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nWriteMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,53:1\n36#1,9:54\n*S KotlinDebug\n*F\n+ 1 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n26#1:54,9\n*E\n"})
public final class dsi {
    @yfb
    public static final f0f carrierDescriptor(@yfb f0f f0fVar, @yfb n2f n2fVar) {
        f0f f0fVarCarrierDescriptor;
        md8.checkNotNullParameter(f0fVar, "<this>");
        md8.checkNotNullParameter(n2fVar, "module");
        if (!md8.areEqual(f0fVar.getKind(), u0f.C13311a.f86522a)) {
            return f0fVar.isInline() ? carrierDescriptor(f0fVar.getElementDescriptor(0), n2fVar) : f0fVar;
        }
        f0f contextualDescriptor = kx2.getContextualDescriptor(n2fVar, f0fVar);
        return (contextualDescriptor == null || (f0fVarCarrierDescriptor = carrierDescriptor(contextualDescriptor, n2fVar)) == null) ? f0fVar : f0fVarCarrierDescriptor;
    }

    public static final <T, R1 extends T, R2 extends T> T selectMapMode(@yfb bk8 bk8Var, @yfb f0f f0fVar, @yfb ny6<? extends R1> ny6Var, @yfb ny6<? extends R2> ny6Var2) {
        md8.checkNotNullParameter(bk8Var, "<this>");
        md8.checkNotNullParameter(f0fVar, "mapDescriptor");
        md8.checkNotNullParameter(ny6Var, "ifMap");
        md8.checkNotNullParameter(ny6Var2, "ifList");
        f0f f0fVarCarrierDescriptor = carrierDescriptor(f0fVar.getElementDescriptor(0), bk8Var.getSerializersModule());
        u0f kind = f0fVarCarrierDescriptor.getKind();
        if ((kind instanceof jbd) || md8.areEqual(kind, u0f.C13312b.f86523a)) {
            return ny6Var.invoke();
        }
        if (bk8Var.getConfiguration().getAllowStructuredMapKeys()) {
            return ny6Var2.invoke();
        }
        throw il8.InvalidKeyKindException(f0fVarCarrierDescriptor);
    }

    @yfb
    public static final csi switchMode(@yfb bk8 bk8Var, @yfb f0f f0fVar) {
        md8.checkNotNullParameter(bk8Var, "<this>");
        md8.checkNotNullParameter(f0fVar, g55.f38798g);
        u0f kind = f0fVar.getKind();
        if (kind instanceof w3d) {
            return csi.f27319f;
        }
        if (md8.areEqual(kind, xag.C15018b.f97388a)) {
            return csi.f27317d;
        }
        if (!md8.areEqual(kind, xag.C15019c.f97389a)) {
            return csi.f27316c;
        }
        f0f f0fVarCarrierDescriptor = carrierDescriptor(f0fVar.getElementDescriptor(0), bk8Var.getSerializersModule());
        u0f kind2 = f0fVarCarrierDescriptor.getKind();
        if ((kind2 instanceof jbd) || md8.areEqual(kind2, u0f.C13312b.f86523a)) {
            return csi.f27318e;
        }
        if (bk8Var.getConfiguration().getAllowStructuredMapKeys()) {
            return csi.f27317d;
        }
        throw il8.InvalidKeyKindException(f0fVarCarrierDescriptor);
    }
}
