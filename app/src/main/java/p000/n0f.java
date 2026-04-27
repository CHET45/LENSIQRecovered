package p000;

import java.lang.annotation.Annotation;
import java.util.List;
import p000.xag;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,366:1\n1#2:367\n*E\n"})
public final class n0f {
    @yfb
    public static final f0f PrimitiveSerialDescriptor(@yfb String str, @yfb jbd jbdVar) {
        md8.checkNotNullParameter(str, "serialName");
        md8.checkNotNullParameter(jbdVar, "kind");
        if (m9g.isBlank(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return ubd.PrimitiveDescriptorSafe(str, jbdVar);
    }

    @ph5
    @yfb
    public static final f0f SerialDescriptor(@yfb String str, @yfb f0f f0fVar) {
        md8.checkNotNullParameter(str, "serialName");
        md8.checkNotNullParameter(f0fVar, "original");
        if (m9g.isBlank(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (f0fVar.getKind() instanceof jbd) {
            throw new IllegalArgumentException("For primitive descriptors please use 'PrimitiveSerialDescriptor' instead");
        }
        if (!md8.areEqual(str, f0fVar.getSerialName())) {
            return new hri(str, f0fVar);
        }
        throw new IllegalArgumentException(("The name of the wrapped descriptor (" + str + ") cannot be the same as the name of the original descriptor (" + f0fVar.getSerialName() + ')').toString());
    }

    @yfb
    public static final f0f buildClassSerialDescriptor(@yfb String str, @yfb f0f[] f0fVarArr, @yfb qy6<? super l12, bth> qy6Var) {
        md8.checkNotNullParameter(str, "serialName");
        md8.checkNotNullParameter(f0fVarArr, "typeParameters");
        md8.checkNotNullParameter(qy6Var, "builderAction");
        if (m9g.isBlank(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        l12 l12Var = new l12(str);
        qy6Var.invoke(l12Var);
        return new j0f(str, xag.C15017a.f97387a, l12Var.getElementNames$kotlinx_serialization_core().size(), e80.toList(f0fVarArr), l12Var);
    }

    public static /* synthetic */ f0f buildClassSerialDescriptor$default(String str, f0f[] f0fVarArr, qy6 qy6Var, int i, Object obj) {
        if ((i & 4) != 0) {
            qy6Var = new qy6() { // from class: l0f
                @Override // p000.qy6
                public final Object invoke(Object obj2) {
                    return n0f.buildClassSerialDescriptor$lambda$0((l12) obj2);
                }
            };
        }
        return buildClassSerialDescriptor(str, f0fVarArr, qy6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth buildClassSerialDescriptor$lambda$0(l12 l12Var) {
        md8.checkNotNullParameter(l12Var, "<this>");
        return bth.f14751a;
    }

    @nb8
    @yfb
    public static final f0f buildSerialDescriptor(@yfb String str, @yfb u0f u0fVar, @yfb f0f[] f0fVarArr, @yfb qy6<? super l12, bth> qy6Var) {
        md8.checkNotNullParameter(str, "serialName");
        md8.checkNotNullParameter(u0fVar, "kind");
        md8.checkNotNullParameter(f0fVarArr, "typeParameters");
        md8.checkNotNullParameter(qy6Var, "builder");
        if (m9g.isBlank(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (md8.areEqual(u0fVar, xag.C15017a.f97387a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        l12 l12Var = new l12(str);
        qy6Var.invoke(l12Var);
        return new j0f(str, u0fVar, l12Var.getElementNames$kotlinx_serialization_core().size(), e80.toList(f0fVarArr), l12Var);
    }

    public static /* synthetic */ f0f buildSerialDescriptor$default(String str, u0f u0fVar, f0f[] f0fVarArr, qy6 qy6Var, int i, Object obj) {
        if ((i & 8) != 0) {
            qy6Var = new qy6() { // from class: m0f
                @Override // p000.qy6
                public final Object invoke(Object obj2) {
                    return n0f.buildSerialDescriptor$lambda$6((l12) obj2);
                }
            };
        }
        return buildSerialDescriptor(str, u0fVar, f0fVarArr, qy6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth buildSerialDescriptor$lambda$6(l12 l12Var) {
        md8.checkNotNullParameter(l12Var, "<this>");
        return bth.f14751a;
    }

    public static final /* synthetic */ <T> void element(l12 l12Var, String str, List<? extends Annotation> list, boolean z) {
        md8.checkNotNullParameter(l12Var, "<this>");
        md8.checkNotNullParameter(str, "elementName");
        md8.checkNotNullParameter(list, "annotations");
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        l12Var.element(str, i2f.serializer((mp8) null).getDescriptor(), list, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void element$default(l12 l12Var, String str, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            list = l82.emptyList();
        }
        if ((i & 4) != 0) {
            z = false;
        }
        md8.checkNotNullParameter(l12Var, "<this>");
        md8.checkNotNullParameter(str, "elementName");
        md8.checkNotNullParameter(list, "annotations");
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        l12Var.element(str, i2f.serializer((mp8) null).getDescriptor(), list, z);
    }

    @yfb
    public static final f0f getNonNullOriginal(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "<this>");
        return f0fVar instanceof g0f ? ((g0f) f0fVar).getOriginal$kotlinx_serialization_core() : f0fVar;
    }

    @ph5
    public static /* synthetic */ void getNonNullOriginal$annotations(f0f f0fVar) {
    }

    @yfb
    public static final f0f getNullable(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "<this>");
        return f0fVar.isNullable() ? f0fVar : new g0f(f0fVar);
    }

    public static /* synthetic */ void getNullable$annotations(f0f f0fVar) {
    }

    @ph5
    @yfb
    public static final f0f listSerialDescriptor(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "elementDescriptor");
        return new q60(f0fVar);
    }

    @ph5
    @yfb
    public static final f0f mapSerialDescriptor(@yfb f0f f0fVar, @yfb f0f f0fVar2) {
        md8.checkNotNullParameter(f0fVar, "keyDescriptor");
        md8.checkNotNullParameter(f0fVar2, "valueDescriptor");
        return new mh7(f0fVar, f0fVar2);
    }

    public static final /* synthetic */ <T> f0f serialDescriptor() {
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return i2f.serializer((mp8) null).getDescriptor();
    }

    @ph5
    @yfb
    public static final f0f setSerialDescriptor(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "elementDescriptor");
        return new th7(f0fVar);
    }

    @ph5
    public static final /* synthetic */ <T> f0f listSerialDescriptor() {
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return listSerialDescriptor(i2f.serializer((mp8) null).getDescriptor());
    }

    @ph5
    public static final /* synthetic */ <K, V> f0f mapSerialDescriptor() {
        md8.reifiedOperationMarker(6, "K");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        f0f descriptor = i2f.serializer((mp8) null).getDescriptor();
        md8.reifiedOperationMarker(6, k95.f53074X4);
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return mapSerialDescriptor(descriptor, i2f.serializer((mp8) null).getDescriptor());
    }

    @yfb
    public static final f0f serialDescriptor(@yfb mp8 mp8Var) {
        md8.checkNotNullParameter(mp8Var, "type");
        return i2f.serializer(mp8Var).getDescriptor();
    }

    @ph5
    public static final /* synthetic */ <T> f0f setSerialDescriptor() {
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return setSerialDescriptor(i2f.serializer((mp8) null).getDescriptor());
    }
}
