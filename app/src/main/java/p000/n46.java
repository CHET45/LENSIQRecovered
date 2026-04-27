package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class n46 extends is8<Float> {
    public n46(List<hs8<Float>> list) {
        super(list);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: f */
    public float m17775f(hs8<Float> hs8Var, float f) {
        Float f2;
        if (hs8Var.f44691b == null || hs8Var.f44692c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        bp9<A> bp9Var = this.f65337e;
        return (bp9Var == 0 || (f2 = (Float) bp9Var.getValueInternal(hs8Var.f44696g, hs8Var.f44697h.floatValue(), hs8Var.f44691b, hs8Var.f44692c, f, m18080d(), getProgress())) == null) ? awa.lerp(hs8Var.getStartValueFloat(), hs8Var.getEndValueFloat(), f) : f2.floatValue();
    }

    @Override // p000.nr0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Float getValue(hs8<Float> hs8Var, float f) {
        return Float.valueOf(m17775f(hs8Var, f));
    }

    public float getFloatValue() {
        return m17775f(m18078a(), m18079c());
    }
}
