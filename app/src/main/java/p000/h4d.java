package p000;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class h4d implements sw2 {

    /* JADX INFO: renamed from: a */
    public final String f42339a;

    /* JADX INFO: renamed from: b */
    public final EnumC6708a f42340b;

    /* JADX INFO: renamed from: c */
    public final C15326xw f42341c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9576mx<PointF, PointF> f42342d;

    /* JADX INFO: renamed from: e */
    public final C15326xw f42343e;

    /* JADX INFO: renamed from: f */
    public final C15326xw f42344f;

    /* JADX INFO: renamed from: g */
    public final C15326xw f42345g;

    /* JADX INFO: renamed from: h */
    public final C15326xw f42346h;

    /* JADX INFO: renamed from: i */
    public final C15326xw f42347i;

    /* JADX INFO: renamed from: j */
    public final boolean f42348j;

    /* JADX INFO: renamed from: k */
    public final boolean f42349k;

    /* JADX INFO: renamed from: h4d$a */
    public enum EnumC6708a {
        STAR(1),
        POLYGON(2);


        /* JADX INFO: renamed from: a */
        public final int f42353a;

        EnumC6708a(int i) {
            this.f42353a = i;
        }

        public static EnumC6708a forValue(int i) {
            for (EnumC6708a enumC6708a : values()) {
                if (enumC6708a.f42353a == i) {
                    return enumC6708a;
                }
            }
            return null;
        }
    }

    public h4d(String str, EnumC6708a enumC6708a, C15326xw c15326xw, InterfaceC9576mx<PointF, PointF> interfaceC9576mx, C15326xw c15326xw2, C15326xw c15326xw3, C15326xw c15326xw4, C15326xw c15326xw5, C15326xw c15326xw6, boolean z, boolean z2) {
        this.f42339a = str;
        this.f42340b = enumC6708a;
        this.f42341c = c15326xw;
        this.f42342d = interfaceC9576mx;
        this.f42343e = c15326xw2;
        this.f42344f = c15326xw3;
        this.f42345g = c15326xw4;
        this.f42346h = c15326xw5;
        this.f42347i = c15326xw6;
        this.f42348j = z;
        this.f42349k = z2;
    }

    public C15326xw getInnerRadius() {
        return this.f42344f;
    }

    public C15326xw getInnerRoundedness() {
        return this.f42346h;
    }

    public String getName() {
        return this.f42339a;
    }

    public C15326xw getOuterRadius() {
        return this.f42345g;
    }

    public C15326xw getOuterRoundedness() {
        return this.f42347i;
    }

    public C15326xw getPoints() {
        return this.f42341c;
    }

    public InterfaceC9576mx<PointF, PointF> getPosition() {
        return this.f42342d;
    }

    public C15326xw getRotation() {
        return this.f42343e;
    }

    public EnumC6708a getType() {
        return this.f42340b;
    }

    public boolean isHidden() {
        return this.f42348j;
    }

    public boolean isReversed() {
        return this.f42349k;
    }

    @Override // p000.sw2
    public gv2 toContent(go9 go9Var, pr0 pr0Var) {
        return new g4d(go9Var, pr0Var, this);
    }
}
