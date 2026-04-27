package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public final class u59 implements vli {

    /* JADX INFO: renamed from: b */
    @yfb
    public final vli f86839b;

    /* JADX INFO: renamed from: c */
    public final int f86840c;

    public /* synthetic */ u59(vli vliVar, int i, jt3 jt3Var) {
        this(vliVar, i);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u59)) {
            return false;
        }
        u59 u59Var = (u59) obj;
        return md8.areEqual(this.f86839b, u59Var.f86839b) && uoi.m32619equalsimpl0(this.f86840c, u59Var.f86840c);
    }

    @Override // p000.vli
    public int getBottom(@yfb c64 c64Var) {
        if (uoi.m32620hasAnybkgdKaI$foundation_layout_release(this.f86840c, uoi.f88691b.m32630getBottomJoeWqyM())) {
            return this.f86839b.getBottom(c64Var);
        }
        return 0;
    }

    @yfb
    public final vli getInsets() {
        return this.f86839b;
    }

    @Override // p000.vli
    public int getLeft(@yfb c64 c64Var, @yfb ov8 ov8Var) {
        if (uoi.m32620hasAnybkgdKaI$foundation_layout_release(this.f86840c, ov8Var == ov8.Ltr ? uoi.f88691b.m32626getAllowLeftInLtrJoeWqyM$foundation_layout_release() : uoi.f88691b.m32627getAllowLeftInRtlJoeWqyM$foundation_layout_release())) {
            return this.f86839b.getLeft(c64Var, ov8Var);
        }
        return 0;
    }

    @Override // p000.vli
    public int getRight(@yfb c64 c64Var, @yfb ov8 ov8Var) {
        if (uoi.m32620hasAnybkgdKaI$foundation_layout_release(this.f86840c, ov8Var == ov8.Ltr ? uoi.f88691b.m32628getAllowRightInLtrJoeWqyM$foundation_layout_release() : uoi.f88691b.m32629getAllowRightInRtlJoeWqyM$foundation_layout_release())) {
            return this.f86839b.getRight(c64Var, ov8Var);
        }
        return 0;
    }

    /* JADX INFO: renamed from: getSides-JoeWqyM, reason: not valid java name */
    public final int m32539getSidesJoeWqyM() {
        return this.f86840c;
    }

    @Override // p000.vli
    public int getTop(@yfb c64 c64Var) {
        if (uoi.m32620hasAnybkgdKaI$foundation_layout_release(this.f86840c, uoi.f88691b.m32636getTopJoeWqyM())) {
            return this.f86839b.getTop(c64Var);
        }
        return 0;
    }

    public int hashCode() {
        return (this.f86839b.hashCode() * 31) + uoi.m32621hashCodeimpl(this.f86840c);
    }

    @yfb
    public String toString() {
        return '(' + this.f86839b + " only " + ((Object) uoi.m32623toStringimpl(this.f86840c)) + ')';
    }

    private u59(vli vliVar, int i) {
        this.f86839b = vliVar;
        this.f86840c = i;
    }
}
