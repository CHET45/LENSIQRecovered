package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class ure implements aac {

    /* JADX INFO: renamed from: m */
    public static final int f88872m = 8;

    /* JADX INFO: renamed from: a */
    public final int f88873a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final List<ure> f88874b;

    /* JADX INFO: renamed from: c */
    @gib
    public Float f88875c;

    /* JADX INFO: renamed from: d */
    @gib
    public Float f88876d;

    /* JADX INFO: renamed from: e */
    @gib
    public ire f88877e;

    /* JADX INFO: renamed from: f */
    @gib
    public ire f88878f;

    public ure(int i, @yfb List<ure> list, @gib Float f, @gib Float f2, @gib ire ireVar, @gib ire ireVar2) {
        this.f88873a = i;
        this.f88874b = list;
        this.f88875c = f;
        this.f88876d = f2;
        this.f88877e = ireVar;
        this.f88878f = ireVar2;
    }

    @yfb
    public final List<ure> getAllScopes() {
        return this.f88874b;
    }

    @gib
    public final ire getHorizontalScrollAxisRange() {
        return this.f88877e;
    }

    @gib
    public final Float getOldXValue() {
        return this.f88875c;
    }

    @gib
    public final Float getOldYValue() {
        return this.f88876d;
    }

    public final int getSemanticsNodeId() {
        return this.f88873a;
    }

    @gib
    public final ire getVerticalScrollAxisRange() {
        return this.f88878f;
    }

    @Override // p000.aac
    public boolean isValidOwnerScope() {
        return this.f88874b.contains(this);
    }

    public final void setHorizontalScrollAxisRange(@gib ire ireVar) {
        this.f88877e = ireVar;
    }

    public final void setOldXValue(@gib Float f) {
        this.f88875c = f;
    }

    public final void setOldYValue(@gib Float f) {
        this.f88876d = f;
    }

    public final void setVerticalScrollAxisRange(@gib ire ireVar) {
        this.f88878f = ireVar;
    }
}
