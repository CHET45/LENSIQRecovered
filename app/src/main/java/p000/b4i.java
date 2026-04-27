package p000;

import p000.AbstractC16313zy;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class b4i<V extends AbstractC16313zy> {

    /* JADX INFO: renamed from: d */
    public static final int f12689d = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final V f12690a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final hv4 f12691b;

    /* JADX INFO: renamed from: c */
    public final int f12692c;

    public /* synthetic */ b4i(AbstractC16313zy abstractC16313zy, hv4 hv4Var, int i, jt3 jt3Var) {
        this(abstractC16313zy, hv4Var, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-2NF0KzA$default, reason: not valid java name */
    public static /* synthetic */ b4i m27951copy2NF0KzA$default(b4i b4iVar, AbstractC16313zy abstractC16313zy, hv4 hv4Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            abstractC16313zy = b4iVar.f12690a;
        }
        if ((i2 & 2) != 0) {
            hv4Var = b4iVar.f12691b;
        }
        if ((i2 & 4) != 0) {
            i = b4iVar.f12692c;
        }
        return b4iVar.m27953copy2NF0KzA(abstractC16313zy, hv4Var, i);
    }

    @yfb
    public final V component1() {
        return this.f12690a;
    }

    @yfb
    public final hv4 component2() {
        return this.f12691b;
    }

    /* JADX INFO: renamed from: component3--9T-Mq4, reason: not valid java name */
    public final int m27952component39TMq4() {
        return this.f12692c;
    }

    @yfb
    /* JADX INFO: renamed from: copy-2NF0KzA, reason: not valid java name */
    public final b4i<V> m27953copy2NF0KzA(@yfb V v, @yfb hv4 hv4Var, int i) {
        return new b4i<>(v, hv4Var, i, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4i)) {
            return false;
        }
        b4i b4iVar = (b4i) obj;
        return md8.areEqual(this.f12690a, b4iVar.f12690a) && md8.areEqual(this.f12691b, b4iVar.f12691b) && w40.m32870equalsimpl0(this.f12692c, b4iVar.f12692c);
    }

    /* JADX INFO: renamed from: getArcMode--9T-Mq4, reason: not valid java name */
    public final int m27954getArcMode9TMq4() {
        return this.f12692c;
    }

    @yfb
    public final hv4 getEasing() {
        return this.f12691b;
    }

    @yfb
    public final V getVectorValue() {
        return this.f12690a;
    }

    public int hashCode() {
        return (((this.f12690a.hashCode() * 31) + this.f12691b.hashCode()) * 31) + w40.m32871hashCodeimpl(this.f12692c);
    }

    @yfb
    public String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f12690a + ", easing=" + this.f12691b + ", arcMode=" + ((Object) w40.m32872toStringimpl(this.f12692c)) + ')';
    }

    private b4i(V v, hv4 hv4Var, int i) {
        this.f12690a = v;
        this.f12691b = hv4Var;
        this.f12692c = i;
    }
}
