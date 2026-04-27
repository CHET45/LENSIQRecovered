package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public abstract class qjc {

    /* JADX INFO: renamed from: a */
    public final boolean f74625a;

    /* JADX INFO: renamed from: b */
    public final boolean f74626b;

    /* JADX INFO: renamed from: qjc$a */
    @vw7
    public static final class C11497a extends qjc {

        /* JADX INFO: renamed from: c */
        public final float f74627c;

        /* JADX INFO: renamed from: d */
        public final float f74628d;

        /* JADX INFO: renamed from: e */
        public final float f74629e;

        /* JADX INFO: renamed from: f */
        public final boolean f74630f;

        /* JADX INFO: renamed from: g */
        public final boolean f74631g;

        /* JADX INFO: renamed from: h */
        public final float f74632h;

        /* JADX INFO: renamed from: i */
        public final float f74633i;

        /* JADX WARN: Illegal instructions before constructor call */
        public C11497a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            boolean z3 = false;
            super(z3, z3, 3, null);
            this.f74627c = f;
            this.f74628d = f2;
            this.f74629e = f3;
            this.f74630f = z;
            this.f74631g = z2;
            this.f74632h = f4;
            this.f74633i = f5;
        }

        public static /* synthetic */ C11497a copy$default(C11497a c11497a, float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c11497a.f74627c;
            }
            if ((i & 2) != 0) {
                f2 = c11497a.f74628d;
            }
            float f6 = f2;
            if ((i & 4) != 0) {
                f3 = c11497a.f74629e;
            }
            float f7 = f3;
            if ((i & 8) != 0) {
                z = c11497a.f74630f;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = c11497a.f74631g;
            }
            boolean z4 = z2;
            if ((i & 32) != 0) {
                f4 = c11497a.f74632h;
            }
            float f8 = f4;
            if ((i & 64) != 0) {
                f5 = c11497a.f74633i;
            }
            return c11497a.copy(f, f6, f7, z3, z4, f8, f5);
        }

        public final float component1() {
            return this.f74627c;
        }

        public final float component2() {
            return this.f74628d;
        }

        public final float component3() {
            return this.f74629e;
        }

        public final boolean component4() {
            return this.f74630f;
        }

        public final boolean component5() {
            return this.f74631g;
        }

        public final float component6() {
            return this.f74632h;
        }

        public final float component7() {
            return this.f74633i;
        }

        @yfb
        public final C11497a copy(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            return new C11497a(f, f2, f3, z, z2, f4, f5);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11497a)) {
                return false;
            }
            C11497a c11497a = (C11497a) obj;
            return Float.compare(this.f74627c, c11497a.f74627c) == 0 && Float.compare(this.f74628d, c11497a.f74628d) == 0 && Float.compare(this.f74629e, c11497a.f74629e) == 0 && this.f74630f == c11497a.f74630f && this.f74631g == c11497a.f74631g && Float.compare(this.f74632h, c11497a.f74632h) == 0 && Float.compare(this.f74633i, c11497a.f74633i) == 0;
        }

        public final float getArcStartX() {
            return this.f74632h;
        }

        public final float getArcStartY() {
            return this.f74633i;
        }

        public final float getHorizontalEllipseRadius() {
            return this.f74627c;
        }

        public final float getTheta() {
            return this.f74629e;
        }

        public final float getVerticalEllipseRadius() {
            return this.f74628d;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f74627c) * 31) + Float.hashCode(this.f74628d)) * 31) + Float.hashCode(this.f74629e)) * 31) + Boolean.hashCode(this.f74630f)) * 31) + Boolean.hashCode(this.f74631g)) * 31) + Float.hashCode(this.f74632h)) * 31) + Float.hashCode(this.f74633i);
        }

        public final boolean isMoreThanHalf() {
            return this.f74630f;
        }

        public final boolean isPositiveArc() {
            return this.f74631g;
        }

        @yfb
        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f74627c + ", verticalEllipseRadius=" + this.f74628d + ", theta=" + this.f74629e + ", isMoreThanHalf=" + this.f74630f + ", isPositiveArc=" + this.f74631g + ", arcStartX=" + this.f74632h + ", arcStartY=" + this.f74633i + ')';
        }
    }

    /* JADX INFO: renamed from: qjc$b */
    @vw7
    public static final class C11498b extends qjc {

        /* JADX INFO: renamed from: c */
        @yfb
        public static final C11498b f74634c = new C11498b();

        /* JADX WARN: Illegal instructions before constructor call */
        private C11498b() {
            boolean z = false;
            super(z, z, 3, null);
        }
    }

    /* JADX INFO: renamed from: qjc$c */
    @vw7
    public static final class C11499c extends qjc {

        /* JADX INFO: renamed from: c */
        public final float f74635c;

        /* JADX INFO: renamed from: d */
        public final float f74636d;

        /* JADX INFO: renamed from: e */
        public final float f74637e;

        /* JADX INFO: renamed from: f */
        public final float f74638f;

        /* JADX INFO: renamed from: g */
        public final float f74639g;

        /* JADX INFO: renamed from: h */
        public final float f74640h;

        public C11499c(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.f74635c = f;
            this.f74636d = f2;
            this.f74637e = f3;
            this.f74638f = f4;
            this.f74639g = f5;
            this.f74640h = f6;
        }

        public static /* synthetic */ C11499c copy$default(C11499c c11499c, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c11499c.f74635c;
            }
            if ((i & 2) != 0) {
                f2 = c11499c.f74636d;
            }
            float f7 = f2;
            if ((i & 4) != 0) {
                f3 = c11499c.f74637e;
            }
            float f8 = f3;
            if ((i & 8) != 0) {
                f4 = c11499c.f74638f;
            }
            float f9 = f4;
            if ((i & 16) != 0) {
                f5 = c11499c.f74639g;
            }
            float f10 = f5;
            if ((i & 32) != 0) {
                f6 = c11499c.f74640h;
            }
            return c11499c.copy(f, f7, f8, f9, f10, f6);
        }

        public final float component1() {
            return this.f74635c;
        }

        public final float component2() {
            return this.f74636d;
        }

        public final float component3() {
            return this.f74637e;
        }

        public final float component4() {
            return this.f74638f;
        }

        public final float component5() {
            return this.f74639g;
        }

        public final float component6() {
            return this.f74640h;
        }

        @yfb
        public final C11499c copy(float f, float f2, float f3, float f4, float f5, float f6) {
            return new C11499c(f, f2, f3, f4, f5, f6);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11499c)) {
                return false;
            }
            C11499c c11499c = (C11499c) obj;
            return Float.compare(this.f74635c, c11499c.f74635c) == 0 && Float.compare(this.f74636d, c11499c.f74636d) == 0 && Float.compare(this.f74637e, c11499c.f74637e) == 0 && Float.compare(this.f74638f, c11499c.f74638f) == 0 && Float.compare(this.f74639g, c11499c.f74639g) == 0 && Float.compare(this.f74640h, c11499c.f74640h) == 0;
        }

        public final float getX1() {
            return this.f74635c;
        }

        public final float getX2() {
            return this.f74637e;
        }

        public final float getX3() {
            return this.f74639g;
        }

        public final float getY1() {
            return this.f74636d;
        }

        public final float getY2() {
            return this.f74638f;
        }

        public final float getY3() {
            return this.f74640h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f74635c) * 31) + Float.hashCode(this.f74636d)) * 31) + Float.hashCode(this.f74637e)) * 31) + Float.hashCode(this.f74638f)) * 31) + Float.hashCode(this.f74639g)) * 31) + Float.hashCode(this.f74640h);
        }

        @yfb
        public String toString() {
            return "CurveTo(x1=" + this.f74635c + ", y1=" + this.f74636d + ", x2=" + this.f74637e + ", y2=" + this.f74638f + ", x3=" + this.f74639g + ", y3=" + this.f74640h + ')';
        }
    }

    /* JADX INFO: renamed from: qjc$d */
    @vw7
    public static final class C11500d extends qjc {

        /* JADX INFO: renamed from: c */
        public final float f74641c;

        /* JADX WARN: Illegal instructions before constructor call */
        public C11500d(float f) {
            boolean z = false;
            super(z, z, 3, null);
            this.f74641c = f;
        }

        public static /* synthetic */ C11500d copy$default(C11500d c11500d, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c11500d.f74641c;
            }
            return c11500d.copy(f);
        }

        public final float component1() {
            return this.f74641c;
        }

        @yfb
        public final C11500d copy(float f) {
            return new C11500d(f);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11500d) && Float.compare(this.f74641c, ((C11500d) obj).f74641c) == 0;
        }

        public final float getX() {
            return this.f74641c;
        }

        public int hashCode() {
            return Float.hashCode(this.f74641c);
        }

        @yfb
        public String toString() {
            return "HorizontalTo(x=" + this.f74641c + ')';
        }
    }

    /* JADX INFO: renamed from: qjc$e */
    @vw7
    public static final class C11501e extends qjc {

        /* JADX INFO: renamed from: c */
        public final float f74642c;

        /* JADX INFO: renamed from: d */
        public final float f74643d;

        /* JADX WARN: Illegal instructions before constructor call */
        public C11501e(float f, float f2) {
            boolean z = false;
            super(z, z, 3, null);
            this.f74642c = f;
            this.f74643d = f2;
        }

        public static /* synthetic */ C11501e copy$default(C11501e c11501e, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c11501e.f74642c;
            }
            if ((i & 2) != 0) {
                f2 = c11501e.f74643d;
            }
            return c11501e.copy(f, f2);
        }

        public final float component1() {
            return this.f74642c;
        }

        public final float component2() {
            return this.f74643d;
        }

        @yfb
        public final C11501e copy(float f, float f2) {
            return new C11501e(f, f2);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11501e)) {
                return false;
            }
            C11501e c11501e = (C11501e) obj;
            return Float.compare(this.f74642c, c11501e.f74642c) == 0 && Float.compare(this.f74643d, c11501e.f74643d) == 0;
        }

        public final float getX() {
            return this.f74642c;
        }

        public final float getY() {
            return this.f74643d;
        }

        public int hashCode() {
            return (Float.hashCode(this.f74642c) * 31) + Float.hashCode(this.f74643d);
        }

        @yfb
        public String toString() {
            return "LineTo(x=" + this.f74642c + ", y=" + this.f74643d + ')';
        }
    }

    /* JADX INFO: renamed from: qjc$f */
    @vw7
    public static final class C11502f extends qjc {

        /* JADX INFO: renamed from: c */
        public final float f74644c;

        /* JADX INFO: renamed from: d */
        public final float f74645d;

        /* JADX WARN: Illegal instructions before constructor call */
        public C11502f(float f, float f2) {
            boolean z = false;
            super(z, z, 3, null);
            this.f74644c = f;
            this.f74645d = f2;
        }

        public static /* synthetic */ C11502f copy$default(C11502f c11502f, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c11502f.f74644c;
            }
            if ((i & 2) != 0) {
                f2 = c11502f.f74645d;
            }
            return c11502f.copy(f, f2);
        }

        public final float component1() {
            return this.f74644c;
        }

        public final float component2() {
            return this.f74645d;
        }

        @yfb
        public final C11502f copy(float f, float f2) {
            return new C11502f(f, f2);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11502f)) {
                return false;
            }
            C11502f c11502f = (C11502f) obj;
            return Float.compare(this.f74644c, c11502f.f74644c) == 0 && Float.compare(this.f74645d, c11502f.f74645d) == 0;
        }

        public final float getX() {
            return this.f74644c;
        }

        public final float getY() {
            return this.f74645d;
        }

        public int hashCode() {
            return (Float.hashCode(this.f74644c) * 31) + Float.hashCode(this.f74645d);
        }

        @yfb
        public String toString() {
            return "MoveTo(x=" + this.f74644c + ", y=" + this.f74645d + ')';
        }
    }

    /* JADX INFO: renamed from: qjc$g */
    @vw7
    public static final class C11503g extends qjc {

        /* JADX INFO: renamed from: c */
        public final float f74646c;

        /* JADX INFO: renamed from: d */
        public final float f74647d;

        /* JADX INFO: renamed from: e */
        public final float f74648e;

        /* JADX INFO: renamed from: f */
        public final float f74649f;

        public C11503g(float f, float f2, float f3, float f4) {
            super(false, true, true ? 1 : 0, null);
            this.f74646c = f;
            this.f74647d = f2;
            this.f74648e = f3;
            this.f74649f = f4;
        }

        public static /* synthetic */ C11503g copy$default(C11503g c11503g, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c11503g.f74646c;
            }
            if ((i & 2) != 0) {
                f2 = c11503g.f74647d;
            }
            if ((i & 4) != 0) {
                f3 = c11503g.f74648e;
            }
            if ((i & 8) != 0) {
                f4 = c11503g.f74649f;
            }
            return c11503g.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.f74646c;
        }

        public final float component2() {
            return this.f74647d;
        }

        public final float component3() {
            return this.f74648e;
        }

        public final float component4() {
            return this.f74649f;
        }

        @yfb
        public final C11503g copy(float f, float f2, float f3, float f4) {
            return new C11503g(f, f2, f3, f4);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11503g)) {
                return false;
            }
            C11503g c11503g = (C11503g) obj;
            return Float.compare(this.f74646c, c11503g.f74646c) == 0 && Float.compare(this.f74647d, c11503g.f74647d) == 0 && Float.compare(this.f74648e, c11503g.f74648e) == 0 && Float.compare(this.f74649f, c11503g.f74649f) == 0;
        }

        public final float getX1() {
            return this.f74646c;
        }

        public final float getX2() {
            return this.f74648e;
        }

        public final float getY1() {
            return this.f74647d;
        }

        public final float getY2() {
            return this.f74649f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f74646c) * 31) + Float.hashCode(this.f74647d)) * 31) + Float.hashCode(this.f74648e)) * 31) + Float.hashCode(this.f74649f);
        }

        @yfb
        public String toString() {
            return "QuadTo(x1=" + this.f74646c + ", y1=" + this.f74647d + ", x2=" + this.f74648e + ", y2=" + this.f74649f + ')';
        }
    }

    /* JADX INFO: renamed from: qjc$h */
    @vw7
    public static final class C11504h extends qjc {

        /* JADX INFO: renamed from: c */
        public final float f74650c;

        /* JADX INFO: renamed from: d */
        public final float f74651d;

        /* JADX INFO: renamed from: e */
        public final float f74652e;

        /* JADX INFO: renamed from: f */
        public final float f74653f;

        public C11504h(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.f74650c = f;
            this.f74651d = f2;
            this.f74652e = f3;
            this.f74653f = f4;
        }

        public static /* synthetic */ C11504h copy$default(C11504h c11504h, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c11504h.f74650c;
            }
            if ((i & 2) != 0) {
                f2 = c11504h.f74651d;
            }
            if ((i & 4) != 0) {
                f3 = c11504h.f74652e;
            }
            if ((i & 8) != 0) {
                f4 = c11504h.f74653f;
            }
            return c11504h.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.f74650c;
        }

        public final float component2() {
            return this.f74651d;
        }

        public final float component3() {
            return this.f74652e;
        }

        public final float component4() {
            return this.f74653f;
        }

        @yfb
        public final C11504h copy(float f, float f2, float f3, float f4) {
            return new C11504h(f, f2, f3, f4);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11504h)) {
                return false;
            }
            C11504h c11504h = (C11504h) obj;
            return Float.compare(this.f74650c, c11504h.f74650c) == 0 && Float.compare(this.f74651d, c11504h.f74651d) == 0 && Float.compare(this.f74652e, c11504h.f74652e) == 0 && Float.compare(this.f74653f, c11504h.f74653f) == 0;
        }

        public final float getX1() {
            return this.f74650c;
        }

        public final float getX2() {
            return this.f74652e;
        }

        public final float getY1() {
            return this.f74651d;
        }

        public final float getY2() {
            return this.f74653f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f74650c) * 31) + Float.hashCode(this.f74651d)) * 31) + Float.hashCode(this.f74652e)) * 31) + Float.hashCode(this.f74653f);
        }

        @yfb
        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f74650c + ", y1=" + this.f74651d + ", x2=" + this.f74652e + ", y2=" + this.f74653f + ')';
        }
    }

    /* JADX INFO: renamed from: qjc$i */
    @vw7
    public static final class C11505i extends qjc {

        /* JADX INFO: renamed from: c */
        public final float f74654c;

        /* JADX INFO: renamed from: d */
        public final float f74655d;

        public C11505i(float f, float f2) {
            super(false, true, true ? 1 : 0, null);
            this.f74654c = f;
            this.f74655d = f2;
        }

        public static /* synthetic */ C11505i copy$default(C11505i c11505i, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c11505i.f74654c;
            }
            if ((i & 2) != 0) {
                f2 = c11505i.f74655d;
            }
            return c11505i.copy(f, f2);
        }

        public final float component1() {
            return this.f74654c;
        }

        public final float component2() {
            return this.f74655d;
        }

        @yfb
        public final C11505i copy(float f, float f2) {
            return new C11505i(f, f2);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11505i)) {
                return false;
            }
            C11505i c11505i = (C11505i) obj;
            return Float.compare(this.f74654c, c11505i.f74654c) == 0 && Float.compare(this.f74655d, c11505i.f74655d) == 0;
        }

        public final float getX() {
            return this.f74654c;
        }

        public final float getY() {
            return this.f74655d;
        }

        public int hashCode() {
            return (Float.hashCode(this.f74654c) * 31) + Float.hashCode(this.f74655d);
        }

        @yfb
        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f74654c + ", y=" + this.f74655d + ')';
        }
    }

    /* JADX INFO: renamed from: qjc$j */
    @vw7
    public static final class C11506j extends qjc {

        /* JADX INFO: renamed from: c */
        public final float f74656c;

        /* JADX INFO: renamed from: d */
        public final float f74657d;

        /* JADX INFO: renamed from: e */
        public final float f74658e;

        /* JADX INFO: renamed from: f */
        public final boolean f74659f;

        /* JADX INFO: renamed from: g */
        public final boolean f74660g;

        /* JADX INFO: renamed from: h */
        public final float f74661h;

        /* JADX INFO: renamed from: i */
        public final float f74662i;

        /* JADX WARN: Illegal instructions before constructor call */
        public C11506j(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            boolean z3 = false;
            super(z3, z3, 3, null);
            this.f74656c = f;
            this.f74657d = f2;
            this.f74658e = f3;
            this.f74659f = z;
            this.f74660g = z2;
            this.f74661h = f4;
            this.f74662i = f5;
        }

        public static /* synthetic */ C11506j copy$default(C11506j c11506j, float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c11506j.f74656c;
            }
            if ((i & 2) != 0) {
                f2 = c11506j.f74657d;
            }
            float f6 = f2;
            if ((i & 4) != 0) {
                f3 = c11506j.f74658e;
            }
            float f7 = f3;
            if ((i & 8) != 0) {
                z = c11506j.f74659f;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = c11506j.f74660g;
            }
            boolean z4 = z2;
            if ((i & 32) != 0) {
                f4 = c11506j.f74661h;
            }
            float f8 = f4;
            if ((i & 64) != 0) {
                f5 = c11506j.f74662i;
            }
            return c11506j.copy(f, f6, f7, z3, z4, f8, f5);
        }

        public final float component1() {
            return this.f74656c;
        }

        public final float component2() {
            return this.f74657d;
        }

        public final float component3() {
            return this.f74658e;
        }

        public final boolean component4() {
            return this.f74659f;
        }

        public final boolean component5() {
            return this.f74660g;
        }

        public final float component6() {
            return this.f74661h;
        }

        public final float component7() {
            return this.f74662i;
        }

        @yfb
        public final C11506j copy(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            return new C11506j(f, f2, f3, z, z2, f4, f5);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11506j)) {
                return false;
            }
            C11506j c11506j = (C11506j) obj;
            return Float.compare(this.f74656c, c11506j.f74656c) == 0 && Float.compare(this.f74657d, c11506j.f74657d) == 0 && Float.compare(this.f74658e, c11506j.f74658e) == 0 && this.f74659f == c11506j.f74659f && this.f74660g == c11506j.f74660g && Float.compare(this.f74661h, c11506j.f74661h) == 0 && Float.compare(this.f74662i, c11506j.f74662i) == 0;
        }

        public final float getArcStartDx() {
            return this.f74661h;
        }

        public final float getArcStartDy() {
            return this.f74662i;
        }

        public final float getHorizontalEllipseRadius() {
            return this.f74656c;
        }

        public final float getTheta() {
            return this.f74658e;
        }

        public final float getVerticalEllipseRadius() {
            return this.f74657d;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f74656c) * 31) + Float.hashCode(this.f74657d)) * 31) + Float.hashCode(this.f74658e)) * 31) + Boolean.hashCode(this.f74659f)) * 31) + Boolean.hashCode(this.f74660g)) * 31) + Float.hashCode(this.f74661h)) * 31) + Float.hashCode(this.f74662i);
        }

        public final boolean isMoreThanHalf() {
            return this.f74659f;
        }

        public final boolean isPositiveArc() {
            return this.f74660g;
        }

        @yfb
        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f74656c + ", verticalEllipseRadius=" + this.f74657d + ", theta=" + this.f74658e + ", isMoreThanHalf=" + this.f74659f + ", isPositiveArc=" + this.f74660g + ", arcStartDx=" + this.f74661h + ", arcStartDy=" + this.f74662i + ')';
        }
    }

    /* JADX INFO: renamed from: qjc$k */
    @vw7
    public static final class C11507k extends qjc {

        /* JADX INFO: renamed from: c */
        public final float f74663c;

        /* JADX INFO: renamed from: d */
        public final float f74664d;

        /* JADX INFO: renamed from: e */
        public final float f74665e;

        /* JADX INFO: renamed from: f */
        public final float f74666f;

        /* JADX INFO: renamed from: g */
        public final float f74667g;

        /* JADX INFO: renamed from: h */
        public final float f74668h;

        public C11507k(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.f74663c = f;
            this.f74664d = f2;
            this.f74665e = f3;
            this.f74666f = f4;
            this.f74667g = f5;
            this.f74668h = f6;
        }

        public static /* synthetic */ C11507k copy$default(C11507k c11507k, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c11507k.f74663c;
            }
            if ((i & 2) != 0) {
                f2 = c11507k.f74664d;
            }
            float f7 = f2;
            if ((i & 4) != 0) {
                f3 = c11507k.f74665e;
            }
            float f8 = f3;
            if ((i & 8) != 0) {
                f4 = c11507k.f74666f;
            }
            float f9 = f4;
            if ((i & 16) != 0) {
                f5 = c11507k.f74667g;
            }
            float f10 = f5;
            if ((i & 32) != 0) {
                f6 = c11507k.f74668h;
            }
            return c11507k.copy(f, f7, f8, f9, f10, f6);
        }

        public final float component1() {
            return this.f74663c;
        }

        public final float component2() {
            return this.f74664d;
        }

        public final float component3() {
            return this.f74665e;
        }

        public final float component4() {
            return this.f74666f;
        }

        public final float component5() {
            return this.f74667g;
        }

        public final float component6() {
            return this.f74668h;
        }

        @yfb
        public final C11507k copy(float f, float f2, float f3, float f4, float f5, float f6) {
            return new C11507k(f, f2, f3, f4, f5, f6);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11507k)) {
                return false;
            }
            C11507k c11507k = (C11507k) obj;
            return Float.compare(this.f74663c, c11507k.f74663c) == 0 && Float.compare(this.f74664d, c11507k.f74664d) == 0 && Float.compare(this.f74665e, c11507k.f74665e) == 0 && Float.compare(this.f74666f, c11507k.f74666f) == 0 && Float.compare(this.f74667g, c11507k.f74667g) == 0 && Float.compare(this.f74668h, c11507k.f74668h) == 0;
        }

        public final float getDx1() {
            return this.f74663c;
        }

        public final float getDx2() {
            return this.f74665e;
        }

        public final float getDx3() {
            return this.f74667g;
        }

        public final float getDy1() {
            return this.f74664d;
        }

        public final float getDy2() {
            return this.f74666f;
        }

        public final float getDy3() {
            return this.f74668h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f74663c) * 31) + Float.hashCode(this.f74664d)) * 31) + Float.hashCode(this.f74665e)) * 31) + Float.hashCode(this.f74666f)) * 31) + Float.hashCode(this.f74667g)) * 31) + Float.hashCode(this.f74668h);
        }

        @yfb
        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f74663c + ", dy1=" + this.f74664d + ", dx2=" + this.f74665e + ", dy2=" + this.f74666f + ", dx3=" + this.f74667g + ", dy3=" + this.f74668h + ')';
        }
    }

    /* JADX INFO: renamed from: qjc$l */
    @vw7
    public static final class C11508l extends qjc {

        /* JADX INFO: renamed from: c */
        public final float f74669c;

        /* JADX WARN: Illegal instructions before constructor call */
        public C11508l(float f) {
            boolean z = false;
            super(z, z, 3, null);
            this.f74669c = f;
        }

        public static /* synthetic */ C11508l copy$default(C11508l c11508l, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c11508l.f74669c;
            }
            return c11508l.copy(f);
        }

        public final float component1() {
            return this.f74669c;
        }

        @yfb
        public final C11508l copy(float f) {
            return new C11508l(f);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11508l) && Float.compare(this.f74669c, ((C11508l) obj).f74669c) == 0;
        }

        public final float getDx() {
            return this.f74669c;
        }

        public int hashCode() {
            return Float.hashCode(this.f74669c);
        }

        @yfb
        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f74669c + ')';
        }
    }

    /* JADX INFO: renamed from: qjc$m */
    @vw7
    public static final class C11509m extends qjc {

        /* JADX INFO: renamed from: c */
        public final float f74670c;

        /* JADX INFO: renamed from: d */
        public final float f74671d;

        /* JADX WARN: Illegal instructions before constructor call */
        public C11509m(float f, float f2) {
            boolean z = false;
            super(z, z, 3, null);
            this.f74670c = f;
            this.f74671d = f2;
        }

        public static /* synthetic */ C11509m copy$default(C11509m c11509m, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c11509m.f74670c;
            }
            if ((i & 2) != 0) {
                f2 = c11509m.f74671d;
            }
            return c11509m.copy(f, f2);
        }

        public final float component1() {
            return this.f74670c;
        }

        public final float component2() {
            return this.f74671d;
        }

        @yfb
        public final C11509m copy(float f, float f2) {
            return new C11509m(f, f2);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11509m)) {
                return false;
            }
            C11509m c11509m = (C11509m) obj;
            return Float.compare(this.f74670c, c11509m.f74670c) == 0 && Float.compare(this.f74671d, c11509m.f74671d) == 0;
        }

        public final float getDx() {
            return this.f74670c;
        }

        public final float getDy() {
            return this.f74671d;
        }

        public int hashCode() {
            return (Float.hashCode(this.f74670c) * 31) + Float.hashCode(this.f74671d);
        }

        @yfb
        public String toString() {
            return "RelativeLineTo(dx=" + this.f74670c + ", dy=" + this.f74671d + ')';
        }
    }

    /* JADX INFO: renamed from: qjc$n */
    @vw7
    public static final class C11510n extends qjc {

        /* JADX INFO: renamed from: c */
        public final float f74672c;

        /* JADX INFO: renamed from: d */
        public final float f74673d;

        /* JADX WARN: Illegal instructions before constructor call */
        public C11510n(float f, float f2) {
            boolean z = false;
            super(z, z, 3, null);
            this.f74672c = f;
            this.f74673d = f2;
        }

        public static /* synthetic */ C11510n copy$default(C11510n c11510n, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c11510n.f74672c;
            }
            if ((i & 2) != 0) {
                f2 = c11510n.f74673d;
            }
            return c11510n.copy(f, f2);
        }

        public final float component1() {
            return this.f74672c;
        }

        public final float component2() {
            return this.f74673d;
        }

        @yfb
        public final C11510n copy(float f, float f2) {
            return new C11510n(f, f2);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11510n)) {
                return false;
            }
            C11510n c11510n = (C11510n) obj;
            return Float.compare(this.f74672c, c11510n.f74672c) == 0 && Float.compare(this.f74673d, c11510n.f74673d) == 0;
        }

        public final float getDx() {
            return this.f74672c;
        }

        public final float getDy() {
            return this.f74673d;
        }

        public int hashCode() {
            return (Float.hashCode(this.f74672c) * 31) + Float.hashCode(this.f74673d);
        }

        @yfb
        public String toString() {
            return "RelativeMoveTo(dx=" + this.f74672c + ", dy=" + this.f74673d + ')';
        }
    }

    /* JADX INFO: renamed from: qjc$o */
    @vw7
    public static final class C11511o extends qjc {

        /* JADX INFO: renamed from: c */
        public final float f74674c;

        /* JADX INFO: renamed from: d */
        public final float f74675d;

        /* JADX INFO: renamed from: e */
        public final float f74676e;

        /* JADX INFO: renamed from: f */
        public final float f74677f;

        public C11511o(float f, float f2, float f3, float f4) {
            super(false, true, true ? 1 : 0, null);
            this.f74674c = f;
            this.f74675d = f2;
            this.f74676e = f3;
            this.f74677f = f4;
        }

        public static /* synthetic */ C11511o copy$default(C11511o c11511o, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c11511o.f74674c;
            }
            if ((i & 2) != 0) {
                f2 = c11511o.f74675d;
            }
            if ((i & 4) != 0) {
                f3 = c11511o.f74676e;
            }
            if ((i & 8) != 0) {
                f4 = c11511o.f74677f;
            }
            return c11511o.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.f74674c;
        }

        public final float component2() {
            return this.f74675d;
        }

        public final float component3() {
            return this.f74676e;
        }

        public final float component4() {
            return this.f74677f;
        }

        @yfb
        public final C11511o copy(float f, float f2, float f3, float f4) {
            return new C11511o(f, f2, f3, f4);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11511o)) {
                return false;
            }
            C11511o c11511o = (C11511o) obj;
            return Float.compare(this.f74674c, c11511o.f74674c) == 0 && Float.compare(this.f74675d, c11511o.f74675d) == 0 && Float.compare(this.f74676e, c11511o.f74676e) == 0 && Float.compare(this.f74677f, c11511o.f74677f) == 0;
        }

        public final float getDx1() {
            return this.f74674c;
        }

        public final float getDx2() {
            return this.f74676e;
        }

        public final float getDy1() {
            return this.f74675d;
        }

        public final float getDy2() {
            return this.f74677f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f74674c) * 31) + Float.hashCode(this.f74675d)) * 31) + Float.hashCode(this.f74676e)) * 31) + Float.hashCode(this.f74677f);
        }

        @yfb
        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f74674c + ", dy1=" + this.f74675d + ", dx2=" + this.f74676e + ", dy2=" + this.f74677f + ')';
        }
    }

    /* JADX INFO: renamed from: qjc$p */
    @vw7
    public static final class C11512p extends qjc {

        /* JADX INFO: renamed from: c */
        public final float f74678c;

        /* JADX INFO: renamed from: d */
        public final float f74679d;

        /* JADX INFO: renamed from: e */
        public final float f74680e;

        /* JADX INFO: renamed from: f */
        public final float f74681f;

        public C11512p(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.f74678c = f;
            this.f74679d = f2;
            this.f74680e = f3;
            this.f74681f = f4;
        }

        public static /* synthetic */ C11512p copy$default(C11512p c11512p, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c11512p.f74678c;
            }
            if ((i & 2) != 0) {
                f2 = c11512p.f74679d;
            }
            if ((i & 4) != 0) {
                f3 = c11512p.f74680e;
            }
            if ((i & 8) != 0) {
                f4 = c11512p.f74681f;
            }
            return c11512p.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.f74678c;
        }

        public final float component2() {
            return this.f74679d;
        }

        public final float component3() {
            return this.f74680e;
        }

        public final float component4() {
            return this.f74681f;
        }

        @yfb
        public final C11512p copy(float f, float f2, float f3, float f4) {
            return new C11512p(f, f2, f3, f4);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11512p)) {
                return false;
            }
            C11512p c11512p = (C11512p) obj;
            return Float.compare(this.f74678c, c11512p.f74678c) == 0 && Float.compare(this.f74679d, c11512p.f74679d) == 0 && Float.compare(this.f74680e, c11512p.f74680e) == 0 && Float.compare(this.f74681f, c11512p.f74681f) == 0;
        }

        public final float getDx1() {
            return this.f74678c;
        }

        public final float getDx2() {
            return this.f74680e;
        }

        public final float getDy1() {
            return this.f74679d;
        }

        public final float getDy2() {
            return this.f74681f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f74678c) * 31) + Float.hashCode(this.f74679d)) * 31) + Float.hashCode(this.f74680e)) * 31) + Float.hashCode(this.f74681f);
        }

        @yfb
        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f74678c + ", dy1=" + this.f74679d + ", dx2=" + this.f74680e + ", dy2=" + this.f74681f + ')';
        }
    }

    /* JADX INFO: renamed from: qjc$q */
    @vw7
    public static final class C11513q extends qjc {

        /* JADX INFO: renamed from: c */
        public final float f74682c;

        /* JADX INFO: renamed from: d */
        public final float f74683d;

        public C11513q(float f, float f2) {
            super(false, true, true ? 1 : 0, null);
            this.f74682c = f;
            this.f74683d = f2;
        }

        public static /* synthetic */ C11513q copy$default(C11513q c11513q, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c11513q.f74682c;
            }
            if ((i & 2) != 0) {
                f2 = c11513q.f74683d;
            }
            return c11513q.copy(f, f2);
        }

        public final float component1() {
            return this.f74682c;
        }

        public final float component2() {
            return this.f74683d;
        }

        @yfb
        public final C11513q copy(float f, float f2) {
            return new C11513q(f, f2);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11513q)) {
                return false;
            }
            C11513q c11513q = (C11513q) obj;
            return Float.compare(this.f74682c, c11513q.f74682c) == 0 && Float.compare(this.f74683d, c11513q.f74683d) == 0;
        }

        public final float getDx() {
            return this.f74682c;
        }

        public final float getDy() {
            return this.f74683d;
        }

        public int hashCode() {
            return (Float.hashCode(this.f74682c) * 31) + Float.hashCode(this.f74683d);
        }

        @yfb
        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f74682c + ", dy=" + this.f74683d + ')';
        }
    }

    /* JADX INFO: renamed from: qjc$r */
    @vw7
    public static final class C11514r extends qjc {

        /* JADX INFO: renamed from: c */
        public final float f74684c;

        /* JADX WARN: Illegal instructions before constructor call */
        public C11514r(float f) {
            boolean z = false;
            super(z, z, 3, null);
            this.f74684c = f;
        }

        public static /* synthetic */ C11514r copy$default(C11514r c11514r, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c11514r.f74684c;
            }
            return c11514r.copy(f);
        }

        public final float component1() {
            return this.f74684c;
        }

        @yfb
        public final C11514r copy(float f) {
            return new C11514r(f);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11514r) && Float.compare(this.f74684c, ((C11514r) obj).f74684c) == 0;
        }

        public final float getDy() {
            return this.f74684c;
        }

        public int hashCode() {
            return Float.hashCode(this.f74684c);
        }

        @yfb
        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f74684c + ')';
        }
    }

    /* JADX INFO: renamed from: qjc$s */
    @vw7
    public static final class C11515s extends qjc {

        /* JADX INFO: renamed from: c */
        public final float f74685c;

        /* JADX WARN: Illegal instructions before constructor call */
        public C11515s(float f) {
            boolean z = false;
            super(z, z, 3, null);
            this.f74685c = f;
        }

        public static /* synthetic */ C11515s copy$default(C11515s c11515s, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c11515s.f74685c;
            }
            return c11515s.copy(f);
        }

        public final float component1() {
            return this.f74685c;
        }

        @yfb
        public final C11515s copy(float f) {
            return new C11515s(f);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11515s) && Float.compare(this.f74685c, ((C11515s) obj).f74685c) == 0;
        }

        public final float getY() {
            return this.f74685c;
        }

        public int hashCode() {
            return Float.hashCode(this.f74685c);
        }

        @yfb
        public String toString() {
            return "VerticalTo(y=" + this.f74685c + ')';
        }
    }

    public /* synthetic */ qjc(boolean z, boolean z2, jt3 jt3Var) {
        this(z, z2);
    }

    public final boolean isCurve() {
        return this.f74625a;
    }

    public final boolean isQuad() {
        return this.f74626b;
    }

    private qjc(boolean z, boolean z2) {
        this.f74625a = z;
        this.f74626b = z2;
    }

    public /* synthetic */ qjc(boolean z, boolean z2, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, null);
    }
}
