package p000;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class n1d extends is8<PointF> {

    /* JADX INFO: renamed from: i */
    public final PointF f62996i;

    public n1d(List<hs8<PointF>> list) {
        super(list);
        this.f62996i = new PointF();
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
    public PointF mo17720e(hs8<PointF> hs8Var, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = hs8Var.f44691b;
        if (pointF3 == null || (pointF = hs8Var.f44692c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        bp9<A> bp9Var = this.f65337e;
        if (bp9Var != 0 && (pointF2 = (PointF) bp9Var.getValueInternal(hs8Var.f44696g, hs8Var.f44697h.floatValue(), pointF4, pointF5, f, m18080d(), getProgress())) != null) {
            return pointF2;
        }
        PointF pointF6 = this.f62996i;
        float f4 = pointF4.x;
        float f5 = f4 + (f2 * (pointF5.x - f4));
        float f6 = pointF4.y;
        pointF6.set(f5, f6 + (f3 * (pointF5.y - f6)));
        return this.f62996i;
    }

    @Override // p000.nr0
    public /* bridge */ /* synthetic */ Object getValue(hs8 hs8Var, float f) {
        return getValue((hs8<PointF>) hs8Var, f);
    }

    @Override // p000.nr0
    public PointF getValue(hs8<PointF> hs8Var, float f) {
        return mo17720e(hs8Var, f, f, f);
    }
}
