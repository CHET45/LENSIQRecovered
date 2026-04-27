package p000;

import p000.f2g;

/* JADX INFO: loaded from: classes.dex */
public class aq0 extends oj7 {

    /* JADX INFO: renamed from: n0 */
    public f2g.EnumC5564d f11564n0;

    /* JADX INFO: renamed from: o0 */
    public int f11565o0;

    /* JADX INFO: renamed from: p0 */
    public zp0 f11566p0;

    /* JADX INFO: renamed from: aq0$a */
    public static /* synthetic */ class C1556a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11567a;

        static {
            int[] iArr = new int[f2g.EnumC5564d.values().length];
            f11567a = iArr;
            try {
                iArr[f2g.EnumC5564d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11567a[f2g.EnumC5564d.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11567a[f2g.EnumC5564d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11567a[f2g.EnumC5564d.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11567a[f2g.EnumC5564d.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11567a[f2g.EnumC5564d.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public aq0(f2g f2gVar) {
        super(f2gVar, f2g.EnumC5565e.BARRIER);
    }

    @Override // p000.oj7, p000.gu2, p000.lvd, p000.eo5
    public void apply() {
        getHelperWidget();
        int i = C1556a.f11567a[this.f11564n0.ordinal()];
        int i2 = 3;
        if (i == 3 || i == 4) {
            i2 = 1;
        } else if (i == 5) {
            i2 = 2;
        } else if (i != 6) {
            i2 = 0;
        }
        this.f11566p0.setBarrierType(i2);
        this.f11566p0.setMargin(this.f11565o0);
    }

    @Override // p000.oj7
    public qj7 getHelperWidget() {
        if (this.f11566p0 == null) {
            this.f11566p0 = new zp0();
        }
        return this.f11566p0;
    }

    @Override // p000.gu2
    public gu2 margin(Object obj) {
        margin(this.f67809j0.convertDimension(obj));
        return this;
    }

    public void setBarrierDirection(f2g.EnumC5564d enumC5564d) {
        this.f11564n0 = enumC5564d;
    }

    @Override // p000.gu2
    public gu2 margin(int i) {
        this.f11565o0 = i;
        return this;
    }
}
