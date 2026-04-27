package p000;

import android.graphics.Path;
import java.util.List;
import p000.nr0;

/* JADX INFO: loaded from: classes3.dex */
public class q8f implements yic, nr0.InterfaceC10013b {

    /* JADX INFO: renamed from: b */
    public final String f73628b;

    /* JADX INFO: renamed from: c */
    public final boolean f73629c;

    /* JADX INFO: renamed from: d */
    public final go9 f73630d;

    /* JADX INFO: renamed from: e */
    public final x8f f73631e;

    /* JADX INFO: renamed from: f */
    @hib
    public List<z8f> f73632f;

    /* JADX INFO: renamed from: g */
    public boolean f73633g;

    /* JADX INFO: renamed from: a */
    public final Path f73627a = new Path();

    /* JADX INFO: renamed from: h */
    public final eo2 f73634h = new eo2();

    public q8f(go9 go9Var, pr0 pr0Var, b9f b9fVar) {
        this.f73628b = b9fVar.getName();
        this.f73629c = b9fVar.isHidden();
        this.f73630d = go9Var;
        x8f x8fVarCreateAnimation = b9fVar.getShapePath().createAnimation();
        this.f73631e = x8fVarCreateAnimation;
        pr0Var.addAnimation(x8fVarCreateAnimation);
        x8fVarCreateAnimation.addUpdateListener(this);
    }

    private void invalidate() {
        this.f73633g = false;
        this.f73630d.invalidateSelf();
    }

    @Override // p000.gv2
    public String getName() {
        return this.f73628b;
    }

    @Override // p000.yic
    public Path getPath() {
        if (this.f73633g) {
            return this.f73627a;
        }
        this.f73627a.reset();
        if (this.f73629c) {
            this.f73633g = true;
            return this.f73627a;
        }
        Path value = this.f73631e.getValue();
        if (value == null) {
            return this.f73627a;
        }
        this.f73627a.set(value);
        this.f73627a.setFillType(Path.FillType.EVEN_ODD);
        this.f73634h.apply(this.f73627a);
        this.f73633g = true;
        return this.f73627a;
    }

    @Override // p000.nr0.InterfaceC10013b
    public void onValueChanged() {
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // p000.gv2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setContents(java.util.List<p000.gv2> r6, java.util.List<p000.gv2> r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            int r1 = r6.size()
            if (r0 >= r1) goto L39
            java.lang.Object r1 = r6.get(r0)
            gv2 r1 = (p000.gv2) r1
            boolean r2 = r1 instanceof p000.yih
            if (r2 == 0) goto L26
            r2 = r1
            yih r2 = (p000.yih) r2
            g9f$a r3 = r2.m26125b()
            g9f$a r4 = p000.g9f.EnumC6176a.SIMULTANEOUSLY
            if (r3 != r4) goto L26
            eo2 r1 = r5.f73634h
            r1.m10164a(r2)
            r2.m26124a(r5)
            goto L36
        L26:
            boolean r2 = r1 instanceof p000.z8f
            if (r2 == 0) goto L36
            if (r7 != 0) goto L31
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L31:
            z8f r1 = (p000.z8f) r1
            r7.add(r1)
        L36:
            int r0 = r0 + 1
            goto L2
        L39:
            x8f r6 = r5.f73631e
            r6.setShapeModifiers(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q8f.setContents(java.util.List, java.util.List):void");
    }
}
