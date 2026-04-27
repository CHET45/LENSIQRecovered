package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,651:1\n696#2:652\n702#2:653\n272#3,8:654\n280#3:663\n282#3,4:670\n1#4:662\n33#5,6:664\n33#5,6:674\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n*L\n410#1:652\n411#1:653\n609#1:654,8\n609#1:663\n609#1:670,4\n616#1:664,6\n626#1:674,6\n*E\n"})
@e0g(parameters = 0)
public final class mb7 extends u1i {

    /* JADX INFO: renamed from: u */
    public static final int f60443u = 8;

    /* JADX INFO: renamed from: c */
    @gib
    public float[] f60444c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final List<u1i> f60445d;

    /* JADX INFO: renamed from: e */
    public boolean f60446e;

    /* JADX INFO: renamed from: f */
    public long f60447f;

    /* JADX INFO: renamed from: g */
    @yfb
    public List<? extends qjc> f60448g;

    /* JADX INFO: renamed from: h */
    public boolean f60449h;

    /* JADX INFO: renamed from: i */
    @gib
    public vic f60450i;

    /* JADX INFO: renamed from: j */
    @gib
    public qy6<? super u1i, bth> f60451j;

    /* JADX INFO: renamed from: k */
    @yfb
    public final qy6<u1i, bth> f60452k;

    /* JADX INFO: renamed from: l */
    @yfb
    public String f60453l;

    /* JADX INFO: renamed from: m */
    public float f60454m;

    /* JADX INFO: renamed from: n */
    public float f60455n;

    /* JADX INFO: renamed from: o */
    public float f60456o;

    /* JADX INFO: renamed from: p */
    public float f60457p;

    /* JADX INFO: renamed from: q */
    public float f60458q;

    /* JADX INFO: renamed from: r */
    public float f60459r;

    /* JADX INFO: renamed from: s */
    public float f60460s;

    /* JADX INFO: renamed from: t */
    public boolean f60461t;

    /* JADX INFO: renamed from: mb7$a */
    public static final class C9252a extends tt8 implements qy6<u1i, bth> {
        public C9252a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(u1i u1iVar) {
            invoke2(u1iVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb u1i u1iVar) {
            mb7.this.markTintForVNode(u1iVar);
            qy6<u1i, bth> invalidateListener$ui_release = mb7.this.getInvalidateListener$ui_release();
            if (invalidateListener$ui_release != null) {
                invalidateListener$ui_release.invoke(u1iVar);
            }
        }
    }

    public mb7() {
        super(null);
        this.f60445d = new ArrayList();
        this.f60446e = true;
        this.f60447f = w82.f93556b.m32987getUnspecified0d7_KjU();
        this.f60448g = l3i.getEmptyPath();
        this.f60449h = true;
        this.f60452k = new C9252a();
        this.f60453l = "";
        this.f60457p = 1.0f;
        this.f60458q = 1.0f;
        this.f60461t = true;
    }

    private final boolean getWillClipPath() {
        return !this.f60448g.isEmpty();
    }

    private final void markNotTintable() {
        this.f60446e = false;
        this.f60447f = w82.f93556b.m32987getUnspecified0d7_KjU();
    }

    private final void markTintForBrush(he1 he1Var) {
        if (this.f60446e && he1Var != null) {
            if (he1Var instanceof bvf) {
                m30981markTintForColor8_81llA(((bvf) he1Var).m28160getValue0d7_KjU());
            } else {
                markNotTintable();
            }
        }
    }

    /* JADX INFO: renamed from: markTintForColor-8_81llA, reason: not valid java name */
    private final void m30981markTintForColor8_81llA(long j) {
        if (this.f60446e && j != 16) {
            long j2 = this.f60447f;
            if (j2 == 16) {
                this.f60447f = j;
            } else {
                if (l3i.m30809rgbEqualOWjLjI(j2, j)) {
                    return;
                }
                markNotTintable();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markTintForVNode(u1i u1iVar) {
        if (u1iVar instanceof xic) {
            xic xicVar = (xic) u1iVar;
            markTintForBrush(xicVar.getFill());
            markTintForBrush(xicVar.getStroke());
        } else if (u1iVar instanceof mb7) {
            mb7 mb7Var = (mb7) u1iVar;
            if (mb7Var.f60446e && this.f60446e) {
                m30981markTintForColor8_81llA(mb7Var.f60447f);
            } else {
                markNotTintable();
            }
        }
    }

    private final void updateClipPath() {
        if (getWillClipPath()) {
            vic vicVarPath = this.f60450i;
            if (vicVarPath == null) {
                vicVarPath = C8522ku.Path();
                this.f60450i = vicVarPath;
            }
            yjc.toPath(this.f60448g, vicVarPath);
        }
    }

    private final void updateMatrix() {
        float[] fArrM33183constructorimpl$default = this.f60444c;
        if (fArrM33183constructorimpl$default == null) {
            fArrM33183constructorimpl$default = x3a.m33183constructorimpl$default(null, 1, null);
            this.f60444c = fArrM33183constructorimpl$default;
        } else {
            x3a.m33192resetimpl(fArrM33183constructorimpl$default);
        }
        x3a.m33203translateimpl$default(fArrM33183constructorimpl$default, this.f60455n + this.f60459r, this.f60456o + this.f60460s, 0.0f, 4, null);
        x3a.m33195rotateZimpl(fArrM33183constructorimpl$default, this.f60454m);
        x3a.m33196scaleimpl(fArrM33183constructorimpl$default, this.f60457p, this.f60458q, 1.0f);
        x3a.m33203translateimpl$default(fArrM33183constructorimpl$default, -this.f60455n, -this.f60456o, 0.0f, 4, null);
    }

    @Override // p000.u1i
    public void draw(@yfb ip4 ip4Var) {
        if (this.f60461t) {
            updateMatrix();
            this.f60461t = false;
        }
        if (this.f60449h) {
            updateClipPath();
            this.f60449h = false;
        }
        bp4 drawContext = ip4Var.getDrawContext();
        long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            tp4 transform = drawContext.getTransform();
            float[] fArr = this.f60444c;
            if (fArr != null) {
                transform.mo31603transform58bKbWc(x3a.m33181boximpl(fArr).m33204unboximpl());
            }
            vic vicVar = this.f60450i;
            if (getWillClipPath() && vicVar != null) {
                tp4.m32427clipPathmtrdDE$default(transform, vicVar, 0, 2, null);
            }
            List<u1i> list = this.f60445d;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).draw(ip4Var);
            }
            drawContext.getCanvas().restore();
            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            throw th;
        }
    }

    @yfb
    public final List<qjc> getClipPathData() {
        return this.f60448g;
    }

    @Override // p000.u1i
    @gib
    public qy6<u1i, bth> getInvalidateListener$ui_release() {
        return this.f60451j;
    }

    @yfb
    public final String getName() {
        return this.f60453l;
    }

    public final int getNumChildren() {
        return this.f60445d.size();
    }

    public final float getPivotX() {
        return this.f60455n;
    }

    public final float getPivotY() {
        return this.f60456o;
    }

    public final float getRotation() {
        return this.f60454m;
    }

    public final float getScaleX() {
        return this.f60457p;
    }

    public final float getScaleY() {
        return this.f60458q;
    }

    /* JADX INFO: renamed from: getTintColor-0d7_KjU, reason: not valid java name */
    public final long m30982getTintColor0d7_KjU() {
        return this.f60447f;
    }

    public final float getTranslationX() {
        return this.f60459r;
    }

    public final float getTranslationY() {
        return this.f60460s;
    }

    public final void insertAt(int i, @yfb u1i u1iVar) {
        if (i < getNumChildren()) {
            this.f60445d.set(i, u1iVar);
        } else {
            this.f60445d.add(u1iVar);
        }
        markTintForVNode(u1iVar);
        u1iVar.setInvalidateListener$ui_release(this.f60452k);
        invalidate();
    }

    public final boolean isTintable() {
        return this.f60446e;
    }

    public final void move(int i, int i2, int i3) {
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                u1i u1iVar = this.f60445d.get(i);
                this.f60445d.remove(i);
                this.f60445d.add(i2, u1iVar);
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                u1i u1iVar2 = this.f60445d.get(i);
                this.f60445d.remove(i);
                this.f60445d.add(i2 - 1, u1iVar2);
                i4++;
            }
        }
        invalidate();
    }

    public final void remove(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (i < this.f60445d.size()) {
                this.f60445d.get(i).setInvalidateListener$ui_release(null);
                this.f60445d.remove(i);
            }
        }
        invalidate();
    }

    public final void setClipPathData(@yfb List<? extends qjc> list) {
        this.f60448g = list;
        this.f60449h = true;
        invalidate();
    }

    @Override // p000.u1i
    public void setInvalidateListener$ui_release(@gib qy6<? super u1i, bth> qy6Var) {
        this.f60451j = qy6Var;
    }

    public final void setName(@yfb String str) {
        this.f60453l = str;
        invalidate();
    }

    public final void setPivotX(float f) {
        this.f60455n = f;
        this.f60461t = true;
        invalidate();
    }

    public final void setPivotY(float f) {
        this.f60456o = f;
        this.f60461t = true;
        invalidate();
    }

    public final void setRotation(float f) {
        this.f60454m = f;
        this.f60461t = true;
        invalidate();
    }

    public final void setScaleX(float f) {
        this.f60457p = f;
        this.f60461t = true;
        invalidate();
    }

    public final void setScaleY(float f) {
        this.f60458q = f;
        this.f60461t = true;
        invalidate();
    }

    public final void setTranslationX(float f) {
        this.f60459r = f;
        this.f60461t = true;
        invalidate();
    }

    public final void setTranslationY(float f) {
        this.f60460s = f;
        this.f60461t = true;
        invalidate();
    }

    @yfb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VGroup: ");
        sb.append(this.f60453l);
        List<u1i> list = this.f60445d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            u1i u1iVar = list.get(i);
            sb.append("\t");
            sb.append(u1iVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
