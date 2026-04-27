package p000;

import p000.e0h;

/* JADX INFO: renamed from: th */
/* JADX INFO: loaded from: classes7.dex */
public final class C13023th implements e0h {

    /* JADX INFO: renamed from: a */
    @yfb
    public final e0h f84663a;

    /* JADX INFO: renamed from: b */
    public final long f84664b;

    public /* synthetic */ C13023th(e0h e0hVar, long j, jt3 jt3Var) {
        this(e0hVar, j);
    }

    @Override // p000.e0h
    /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
    public long mo27923elapsedNowUwyO8pc() {
        return bt4.m28087minusLRDsOJo(this.f84663a.mo27923elapsedNowUwyO8pc(), this.f84664b);
    }

    /* JADX INFO: renamed from: getAdjustment-UwyO8pc, reason: not valid java name */
    public final long m32399getAdjustmentUwyO8pc() {
        return this.f84664b;
    }

    @yfb
    public final e0h getMark() {
        return this.f84663a;
    }

    @Override // p000.e0h
    public boolean hasNotPassedNow() {
        return e0h.C5037a.hasNotPassedNow(this);
    }

    @Override // p000.e0h
    public boolean hasPassedNow() {
        return e0h.C5037a.hasPassedNow(this);
    }

    @Override // p000.e0h
    @yfb
    /* JADX INFO: renamed from: minus-LRDsOJo */
    public e0h mo27924minusLRDsOJo(long j) {
        return e0h.C5037a.m28719minusLRDsOJo(this, j);
    }

    @Override // p000.e0h
    @yfb
    /* JADX INFO: renamed from: plus-LRDsOJo */
    public e0h mo27926plusLRDsOJo(long j) {
        return new C13023th(this.f84663a, bt4.m28088plusLRDsOJo(this.f84664b, j), null);
    }

    private C13023th(e0h e0hVar, long j) {
        md8.checkNotNullParameter(e0hVar, "mark");
        this.f84663a = e0hVar;
        this.f84664b = j;
    }
}
