package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class aug extends is8<vh4> {

    /* JADX INFO: renamed from: aug$a */
    public class C1613a extends bp9<vh4> {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ io9 f11902d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ bp9 f11903e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ vh4 f11904f;

        public C1613a(io9 io9Var, bp9 bp9Var, vh4 vh4Var) {
            this.f11902d = io9Var;
            this.f11903e = bp9Var;
            this.f11904f = vh4Var;
        }

        @Override // p000.bp9
        public vh4 getValue(io9<vh4> io9Var) {
            this.f11902d.set(io9Var.getStartFrame(), io9Var.getEndFrame(), io9Var.getStartValue().f91177a, io9Var.getEndValue().f91177a, io9Var.getLinearKeyframeProgress(), io9Var.getInterpolatedKeyframeProgress(), io9Var.getOverallProgress());
            String str = (String) this.f11903e.getValue(this.f11902d);
            vh4 endValue = io9Var.getInterpolatedKeyframeProgress() == 1.0f ? io9Var.getEndValue() : io9Var.getStartValue();
            this.f11904f.set(str, endValue.f91178b, endValue.f91179c, endValue.f91180d, endValue.f91181e, endValue.f91182f, endValue.f91183g, endValue.f91184h, endValue.f91185i, endValue.f91186j, endValue.f91187k);
            return this.f11904f;
        }
    }

    public aug(List<hs8<vh4>> list) {
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
    @Override // p000.nr0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public vh4 getValue(hs8<vh4> hs8Var, float f) {
        vh4 vh4Var;
        bp9<A> bp9Var = this.f65337e;
        if (bp9Var == 0) {
            return (f != 1.0f || (vh4Var = hs8Var.f44692c) == null) ? hs8Var.f44691b : vh4Var;
        }
        float f2 = hs8Var.f44696g;
        Float f3 = hs8Var.f44697h;
        float fFloatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
        vh4 vh4Var2 = hs8Var.f44691b;
        vh4 vh4Var3 = vh4Var2;
        vh4 vh4Var4 = hs8Var.f44692c;
        return (vh4) bp9Var.getValueInternal(f2, fFloatValue, vh4Var3, vh4Var4 == null ? vh4Var2 : vh4Var4, f, m18079c(), getProgress());
    }

    public void setStringValueCallback(bp9<String> bp9Var) {
        super.setValueCallback(new C1613a(new io9(), bp9Var, new vh4()));
    }
}
