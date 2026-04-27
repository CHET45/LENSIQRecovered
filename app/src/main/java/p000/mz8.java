package p000;

import p000.b11;
import p000.jvd;
import p000.lz8;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class mz8 implements oxa<b11>, b11 {

    /* JADX INFO: renamed from: m */
    public static final int f62849m = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final oz8 f62850a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final lz8 f62851b;

    /* JADX INFO: renamed from: c */
    public final boolean f62852c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final ov8 f62853d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final t7c f62854e;

    /* JADX INFO: renamed from: f */
    @yfb
    public static final C9613b f62848f = new C9613b(null);

    /* JADX INFO: renamed from: C */
    @yfb
    public static final C9612a f62847C = new C9612a();

    /* JADX INFO: renamed from: mz8$a */
    public static final class C9612a implements b11.InterfaceC1694a {

        /* JADX INFO: renamed from: a */
        public final boolean f62855a;

        @Override // p000.b11.InterfaceC1694a
        public boolean getHasMoreContent() {
            return this.f62855a;
        }
    }

    /* JADX INFO: renamed from: mz8$b */
    public static final class C9613b {
        public /* synthetic */ C9613b(jt3 jt3Var) {
            this();
        }

        private C9613b() {
        }
    }

    /* JADX INFO: renamed from: mz8$c */
    public /* synthetic */ class C9614c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f62856a;

        static {
            int[] iArr = new int[ov8.values().length];
            try {
                iArr[ov8.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ov8.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f62856a = iArr;
        }
    }

    /* JADX INFO: renamed from: mz8$d */
    public static final class C9615d implements b11.InterfaceC1694a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jvd.C8121h<lz8.C9042a> f62858b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f62859c;

        public C9615d(jvd.C8121h<lz8.C9042a> c8121h, int i) {
            this.f62858b = c8121h;
            this.f62859c = i;
        }

        @Override // p000.b11.InterfaceC1694a
        public boolean getHasMoreContent() {
            return mz8.this.m31095hasMoreContentFR3nfPY(this.f62858b.f52110a, this.f62859c);
        }
    }

    public mz8(@yfb oz8 oz8Var, @yfb lz8 lz8Var, boolean z, @yfb ov8 ov8Var, @yfb t7c t7cVar) {
        this.f62850a = oz8Var;
        this.f62851b = lz8Var;
        this.f62852c = z;
        this.f62853d = ov8Var;
        this.f62854e = t7cVar;
    }

    /* JADX INFO: renamed from: addNextInterval-FR3nfPY, reason: not valid java name */
    private final lz8.C9042a m31094addNextIntervalFR3nfPY(lz8.C9042a c9042a, int i) {
        int start = c9042a.getStart();
        int end = c9042a.getEnd();
        if (m31096isForward4vf7U8o(i)) {
            end++;
        } else {
            start--;
        }
        return this.f62851b.addInterval(start, end);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: hasMoreContent-FR3nfPY, reason: not valid java name */
    public final boolean m31095hasMoreContentFR3nfPY(lz8.C9042a c9042a, int i) {
        if (m31097isOppositeToOrientation4vf7U8o(i)) {
            return false;
        }
        if (m31096isForward4vf7U8o(i)) {
            if (c9042a.getEnd() >= this.f62850a.getItemCount() - 1) {
                return false;
            }
        } else if (c9042a.getStart() <= 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: isForward-4vf7U8o, reason: not valid java name */
    private final boolean m31096isForward4vf7U8o(int i) {
        b11.C1695b.a aVar = b11.C1695b.f12360b;
        if (b11.C1695b.m27931equalsimpl0(i, aVar.m27937getBeforehoxUOeE())) {
            return false;
        }
        if (!b11.C1695b.m27931equalsimpl0(i, aVar.m27936getAfterhoxUOeE())) {
            if (b11.C1695b.m27931equalsimpl0(i, aVar.m27935getAbovehoxUOeE())) {
                return this.f62852c;
            }
            if (b11.C1695b.m27931equalsimpl0(i, aVar.m27938getBelowhoxUOeE())) {
                if (this.f62852c) {
                    return false;
                }
            } else if (b11.C1695b.m27931equalsimpl0(i, aVar.m27939getLefthoxUOeE())) {
                int i2 = C9614c.f62856a[this.f62853d.ordinal()];
                if (i2 == 1) {
                    return this.f62852c;
                }
                if (i2 != 2) {
                    throw new ceb();
                }
                if (this.f62852c) {
                    return false;
                }
            } else {
                if (!b11.C1695b.m27931equalsimpl0(i, aVar.m27940getRighthoxUOeE())) {
                    nz8.unsupportedDirection();
                    throw new us8();
                }
                int i3 = C9614c.f62856a[this.f62853d.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        return this.f62852c;
                    }
                    throw new ceb();
                }
                if (this.f62852c) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: isOppositeToOrientation-4vf7U8o, reason: not valid java name */
    private final boolean m31097isOppositeToOrientation4vf7U8o(int i) {
        b11.C1695b.a aVar = b11.C1695b.f12360b;
        if (!(b11.C1695b.m27931equalsimpl0(i, aVar.m27935getAbovehoxUOeE()) ? true : b11.C1695b.m27931equalsimpl0(i, aVar.m27938getBelowhoxUOeE()))) {
            if (!(b11.C1695b.m27931equalsimpl0(i, aVar.m27939getLefthoxUOeE()) ? true : b11.C1695b.m27931equalsimpl0(i, aVar.m27940getRighthoxUOeE()))) {
                if (!(b11.C1695b.m27931equalsimpl0(i, aVar.m27937getBeforehoxUOeE()) ? true : b11.C1695b.m27931equalsimpl0(i, aVar.m27936getAfterhoxUOeE()))) {
                    nz8.unsupportedDirection();
                    throw new us8();
                }
            } else if (this.f62854e == t7c.Vertical) {
                return true;
            }
        } else if (this.f62854e == t7c.Horizontal) {
            return true;
        }
        return false;
    }

    @Override // p000.oxa
    @yfb
    public aid<b11> getKey() {
        return c11.getModifierLocalBeyondBoundsLayout();
    }

    @Override // p000.b11
    @gib
    /* JADX INFO: renamed from: layout-o7g1Pn8 */
    public <T> T mo27927layouto7g1Pn8(int i, @yfb qy6<? super b11.InterfaceC1694a, ? extends T> qy6Var) {
        if (this.f62850a.getItemCount() <= 0 || !this.f62850a.getHasVisibleItems()) {
            return qy6Var.invoke(f62847C);
        }
        int lastPlacedIndex = m31096isForward4vf7U8o(i) ? this.f62850a.getLastPlacedIndex() : this.f62850a.getFirstPlacedIndex();
        jvd.C8121h c8121h = new jvd.C8121h();
        c8121h.f52110a = (T) this.f62851b.addInterval(lastPlacedIndex, lastPlacedIndex);
        T tInvoke = null;
        while (tInvoke == null && m31095hasMoreContentFR3nfPY((lz8.C9042a) c8121h.f52110a, i)) {
            T t = (T) m31094addNextIntervalFR3nfPY((lz8.C9042a) c8121h.f52110a, i);
            this.f62851b.removeInterval((lz8.C9042a) c8121h.f52110a);
            c8121h.f52110a = t;
            this.f62850a.remeasure();
            tInvoke = qy6Var.invoke(new C9615d(c8121h, i));
        }
        this.f62851b.removeInterval((lz8.C9042a) c8121h.f52110a);
        this.f62850a.remeasure();
        return tInvoke;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.oxa
    @yfb
    public b11 getValue() {
        return this;
    }
}
