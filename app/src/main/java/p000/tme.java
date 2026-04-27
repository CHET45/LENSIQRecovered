package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class tme extends is8<xme> {

    /* JADX INFO: renamed from: i */
    public final xme f85330i;

    public tme(List<hs8<xme>> list) {
        super(list);
        this.f85330i = new xme();
    }

    @Override // p000.nr0
    public /* bridge */ /* synthetic */ Object getValue(hs8 hs8Var, float f) {
        return getValue((hs8<xme>) hs8Var, f);
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
    @Override // p000.nr0
    public xme getValue(hs8<xme> hs8Var, float f) {
        xme xmeVar;
        xme xmeVar2;
        xme xmeVar3 = hs8Var.f44691b;
        if (xmeVar3 == null || (xmeVar = hs8Var.f44692c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        xme xmeVar4 = xmeVar3;
        xme xmeVar5 = xmeVar;
        bp9<A> bp9Var = this.f65337e;
        if (bp9Var != 0 && (xmeVar2 = (xme) bp9Var.getValueInternal(hs8Var.f44696g, hs8Var.f44697h.floatValue(), xmeVar4, xmeVar5, f, m18080d(), getProgress())) != null) {
            return xmeVar2;
        }
        this.f85330i.set(awa.lerp(xmeVar4.getScaleX(), xmeVar5.getScaleX(), f), awa.lerp(xmeVar4.getScaleY(), xmeVar5.getScaleY(), f));
        return this.f85330i;
    }
}
