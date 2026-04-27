package p000;

import android.graphics.PointF;

/* JADX INFO: renamed from: kx */
/* JADX INFO: loaded from: classes3.dex */
public class C8540kx implements cxa, sw2 {

    /* JADX INFO: renamed from: a */
    @hib
    public final C2094bx f55531a;

    /* JADX INFO: renamed from: b */
    @hib
    public final InterfaceC9576mx<PointF, PointF> f55532b;

    /* JADX INFO: renamed from: c */
    @hib
    public final C5504ex f55533c;

    /* JADX INFO: renamed from: d */
    @hib
    public final C15326xw f55534d;

    /* JADX INFO: renamed from: e */
    @hib
    public final C16264zw f55535e;

    /* JADX INFO: renamed from: f */
    @hib
    public final C15326xw f55536f;

    /* JADX INFO: renamed from: g */
    @hib
    public final C15326xw f55537g;

    /* JADX INFO: renamed from: h */
    @hib
    public final C15326xw f55538h;

    /* JADX INFO: renamed from: i */
    @hib
    public final C15326xw f55539i;

    public C8540kx() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public wdh createAnimation() {
        return new wdh(this);
    }

    @hib
    public C2094bx getAnchorPoint() {
        return this.f55531a;
    }

    @hib
    public C15326xw getEndOpacity() {
        return this.f55539i;
    }

    @hib
    public C16264zw getOpacity() {
        return this.f55535e;
    }

    @hib
    public InterfaceC9576mx<PointF, PointF> getPosition() {
        return this.f55532b;
    }

    @hib
    public C15326xw getRotation() {
        return this.f55534d;
    }

    @hib
    public C5504ex getScale() {
        return this.f55533c;
    }

    @hib
    public C15326xw getSkew() {
        return this.f55536f;
    }

    @hib
    public C15326xw getSkewAngle() {
        return this.f55537g;
    }

    @hib
    public C15326xw getStartOpacity() {
        return this.f55538h;
    }

    @Override // p000.sw2
    @hib
    public gv2 toContent(go9 go9Var, pr0 pr0Var) {
        return null;
    }

    public C8540kx(@hib C2094bx c2094bx, @hib InterfaceC9576mx<PointF, PointF> interfaceC9576mx, @hib C5504ex c5504ex, @hib C15326xw c15326xw, @hib C16264zw c16264zw, @hib C15326xw c15326xw2, @hib C15326xw c15326xw3, @hib C15326xw c15326xw4, @hib C15326xw c15326xw5) {
        this.f55531a = c2094bx;
        this.f55532b = interfaceC9576mx;
        this.f55533c = c5504ex;
        this.f55534d = c15326xw;
        this.f55535e = c16264zw;
        this.f55538h = c15326xw2;
        this.f55539i = c15326xw3;
        this.f55536f = c15326xw4;
        this.f55537g = c15326xw5;
    }
}
