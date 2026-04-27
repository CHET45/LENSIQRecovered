package p000;

import java.lang.annotation.Annotation;
import p000.u0f;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nPolymorphic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n*L\n1#1,107:1\n1#2:108\n271#3,8:109\n*S KotlinDebug\n*F\n+ 1 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n*L\n81#1:109,8\n*E\n"})
public final class x3d {

    /* JADX INFO: renamed from: x3d$a */
    public /* synthetic */ class C14909a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f96162a;

        static {
            int[] iArr = new int[b12.values().length];
            try {
                iArr[b12.f12368a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b12.f12370c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b12.f12369b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f96162a = iArr;
        }
    }

    public static final void checkKind(@yfb u0f u0fVar) {
        md8.checkNotNullParameter(u0fVar, "kind");
        if (u0fVar instanceof u0f.C13312b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (u0fVar instanceof jbd) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (u0fVar instanceof w3d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    @yfb
    public static final String classDiscriminator(@yfb f0f f0fVar, @yfb bk8 bk8Var) {
        md8.checkNotNullParameter(f0fVar, "<this>");
        md8.checkNotNullParameter(bk8Var, "json");
        for (Annotation annotation : f0fVar.getAnnotations()) {
            if (annotation instanceof gk8) {
                return ((gk8) annotation).discriminator();
            }
        }
        return bk8Var.getConfiguration().getClassDiscriminator();
    }

    public static final <T> T decodeSerializableValuePolymorphic(@yfb ok8 ok8Var, @yfb t74<? extends T> t74Var, @yfb ny6<String> ny6Var) {
        fm8 jsonPrimitive;
        md8.checkNotNullParameter(ok8Var, "<this>");
        md8.checkNotNullParameter(t74Var, "deserializer");
        md8.checkNotNullParameter(ny6Var, "path");
        if (!(t74Var instanceof AbstractC12880t3) || ok8Var.getJson().getConfiguration().getUseArrayPolymorphism()) {
            return t74Var.deserialize(ok8Var);
        }
        AbstractC12880t3 abstractC12880t3 = (AbstractC12880t3) t74Var;
        String strClassDiscriminator = classDiscriminator(abstractC12880t3.getDescriptor(), ok8Var.getJson());
        sk8 sk8VarDecodeJsonElement = ok8Var.decodeJsonElement();
        String serialName = abstractC12880t3.getDescriptor().getSerialName();
        if (sk8VarDecodeJsonElement instanceof am8) {
            am8 am8Var = (am8) sk8VarDecodeJsonElement;
            sk8 sk8Var = (sk8) am8Var.get((Object) strClassDiscriminator);
            try {
                t74 t74VarFindPolymorphicSerializer = e4d.findPolymorphicSerializer((AbstractC12880t3) t74Var, ok8Var, (sk8Var == null || (jsonPrimitive = uk8.getJsonPrimitive(sk8Var)) == null) ? null : uk8.getContentOrNull(jsonPrimitive));
                md8.checkNotNull(t74VarFindPolymorphicSerializer, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return (T) aih.readPolymorphicJson(ok8Var.getJson(), strClassDiscriminator, am8Var, t74VarFindPolymorphicSerializer);
            } catch (d1f e) {
                String message = e.getMessage();
                md8.checkNotNull(message);
                throw il8.JsonDecodingException(-1, message, am8Var.toString());
            }
        }
        throw il8.JsonDecodingException(-1, "Expected " + vvd.getOrCreateKotlinClass(am8.class).getSimpleName() + ", but had " + vvd.getOrCreateKotlinClass(sk8VarDecodeJsonElement.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + ny6Var.invoke(), sk8VarDecodeJsonElement.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void encodePolymorphically(@p000.yfb p000.el8 r3, @p000.yfb p000.e1f<? super T> r4, T r5, @p000.yfb p000.gz6<? super java.lang.String, ? super java.lang.String, p000.bth> r6) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.x3d.encodePolymorphically(el8, e1f, java.lang.Object, gz6):void");
    }

    @yfb
    public static final Void throwJsonElementPolymorphicException(@gib String str, @yfb sk8 sk8Var) {
        md8.checkNotNullParameter(sk8Var, "element");
        throw new fl8("Class with serial name " + str + " cannot be serialized polymorphically because it is represented as " + vvd.getOrCreateKotlinClass(sk8Var.getClass()).getSimpleName() + ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateIfSealed(e1f<?> e1fVar, e1f<?> e1fVar2, String str) {
        if ((e1fVar instanceof nse) && ll8.jsonCachedSerialNames(e1fVar2.getDescriptor()).contains(str)) {
            String serialName = ((nse) e1fVar).getDescriptor().getSerialName();
            throw new IllegalStateException(("Sealed class '" + e1fVar2.getDescriptor().getSerialName() + "' cannot be serialized as base class '" + serialName + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}
