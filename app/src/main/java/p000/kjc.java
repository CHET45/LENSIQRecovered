package p000;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class kjc extends is8<PointF> {

    /* JADX INFO: renamed from: i */
    public final PointF f54298i;

    /* JADX INFO: renamed from: j */
    public final float[] f54299j;

    /* JADX INFO: renamed from: k */
    public final PathMeasure f54300k;

    /* JADX INFO: renamed from: l */
    public jjc f54301l;

    public kjc(List<? extends hs8<PointF>> list) {
        super(list);
        this.f54298i = new PointF();
        this.f54299j = new float[2];
        this.f54300k = new PathMeasure();
    }

    @Override // p000.nr0
    public /* bridge */ /* synthetic */ Object getValue(hs8 hs8Var, float f) {
        return getValue((hs8<PointF>) hs8Var, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public PointF getValue(hs8<PointF> hs8Var, float f) {
        PointF pointF;
        jjc jjcVar = (jjc) hs8Var;
        Path pathM14135a = jjcVar.m14135a();
        if (pathM14135a == null) {
            return hs8Var.f44691b;
        }
        bp9<A> bp9Var = this.f65337e;
        if (bp9Var != 0 && (pointF = (PointF) bp9Var.getValueInternal(jjcVar.f44696g, jjcVar.f44697h.floatValue(), (PointF) jjcVar.f44691b, (PointF) jjcVar.f44692c, m18080d(), f, getProgress())) != null) {
            return pointF;
        }
        if (this.f54301l != jjcVar) {
            this.f54300k.setPath(pathM14135a, false);
            this.f54301l = jjcVar;
        }
        PathMeasure pathMeasure = this.f54300k;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f54299j, null);
        PointF pointF2 = this.f54298i;
        float[] fArr = this.f54299j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f54298i;
    }
}
