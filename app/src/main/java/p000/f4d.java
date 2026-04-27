package p000;

import java.util.List;
import p000.r2f;
import p000.u0f;
import p000.xag;

/* JADX INFO: loaded from: classes7.dex */
public final class f4d implements r2f {

    /* JADX INFO: renamed from: a */
    public final boolean f35327a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f35328b;

    public f4d(boolean z, @yfb String str) {
        md8.checkNotNullParameter(str, "discriminator");
        this.f35327a = z;
        this.f35328b = str;
    }

    private final void checkDiscriminatorCollisions(f0f f0fVar, oo8<?> oo8Var) {
        int elementsCount = f0fVar.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            String elementName = f0fVar.getElementName(i);
            if (md8.areEqual(elementName, this.f35328b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + oo8Var + " has property '" + elementName + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void checkKind(f0f f0fVar, oo8<?> oo8Var) {
        u0f kind = f0fVar.getKind();
        if ((kind instanceof w3d) || md8.areEqual(kind, u0f.C13311a.f86522a)) {
            throw new IllegalArgumentException("Serializer for " + oo8Var.getSimpleName() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (this.f35327a) {
            return;
        }
        if (md8.areEqual(kind, xag.C15018b.f97388a) || md8.areEqual(kind, xag.C15019c.f97389a) || (kind instanceof jbd) || (kind instanceof u0f.C13312b)) {
            throw new IllegalArgumentException("Serializer for " + oo8Var.getSimpleName() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
        }
    }

    @Override // p000.r2f
    public <T> void contextual(@yfb oo8<T> oo8Var, @yfb qy6<? super List<? extends lp8<?>>, ? extends lp8<?>> qy6Var) {
        md8.checkNotNullParameter(oo8Var, "kClass");
        md8.checkNotNullParameter(qy6Var, "provider");
    }

    @Override // p000.r2f
    public <Base, Sub extends Base> void polymorphic(@yfb oo8<Base> oo8Var, @yfb oo8<Sub> oo8Var2, @yfb lp8<Sub> lp8Var) {
        md8.checkNotNullParameter(oo8Var, "baseClass");
        md8.checkNotNullParameter(oo8Var2, "actualClass");
        md8.checkNotNullParameter(lp8Var, "actualSerializer");
        f0f descriptor = lp8Var.getDescriptor();
        checkKind(descriptor, oo8Var2);
        if (this.f35327a) {
            return;
        }
        checkDiscriminatorCollisions(descriptor, oo8Var2);
    }

    @Override // p000.r2f
    @q64(level = u64.f86865a, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @i2e(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
    public <Base> void polymorphicDefault(@yfb oo8<Base> oo8Var, @yfb qy6<? super String, ? extends t74<? extends Base>> qy6Var) {
        r2f.C11853a.polymorphicDefault(this, oo8Var, qy6Var);
    }

    @Override // p000.r2f
    public <Base> void polymorphicDefaultDeserializer(@yfb oo8<Base> oo8Var, @yfb qy6<? super String, ? extends t74<? extends Base>> qy6Var) {
        md8.checkNotNullParameter(oo8Var, "baseClass");
        md8.checkNotNullParameter(qy6Var, "defaultDeserializerProvider");
    }

    @Override // p000.r2f
    public <Base> void polymorphicDefaultSerializer(@yfb oo8<Base> oo8Var, @yfb qy6<? super Base, ? extends e1f<? super Base>> qy6Var) {
        md8.checkNotNullParameter(oo8Var, "baseClass");
        md8.checkNotNullParameter(qy6Var, "defaultSerializerProvider");
    }

    @Override // p000.r2f
    public <T> void contextual(@yfb oo8<T> oo8Var, @yfb lp8<T> lp8Var) {
        r2f.C11853a.contextual(this, oo8Var, lp8Var);
    }
}
