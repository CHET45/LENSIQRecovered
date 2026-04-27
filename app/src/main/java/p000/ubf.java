package p000;

import android.graphics.Insets;
import p000.uoi;

/* JADX INFO: loaded from: classes.dex */
@c5e(30)
public interface ubf {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C13464a f87449a = C13464a.f87450a;

    /* JADX INFO: renamed from: ubf$a */
    public static final class C13464a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C13464a f87450a = new C13464a();

        /* JADX INFO: renamed from: b */
        @yfb
        public static final b f87451b = new b();

        /* JADX INFO: renamed from: c */
        @yfb
        public static final d f87452c = new d();

        /* JADX INFO: renamed from: d */
        @yfb
        public static final c f87453d = new c();

        /* JADX INFO: renamed from: e */
        @yfb
        public static final a f87454e = new a();

        /* JADX INFO: renamed from: ubf$a$a */
        public static final class a implements ubf {
            @Override // p000.ubf
            @yfb
            public Insets adjustInsets(@yfb Insets insets, int i) {
                return Insets.of(insets.left, insets.top, insets.right, i);
            }

            @Override // p000.ubf
            /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U */
            public long mo32593consumedOffsetsMKHz9U(long j) {
                return mzb.Offset(0.0f, izb.m30430getYimpl(j));
            }

            @Override // p000.ubf
            /* JADX INFO: renamed from: consumedVelocity-QWom1Mo */
            public long mo32594consumedVelocityQWom1Mo(long j, float f) {
                return j4i.Velocity(0.0f, i4i.m30158getYimpl(j) + f);
            }

            @Override // p000.ubf
            public float motionOf(float f, float f2) {
                return -f2;
            }

            @Override // p000.ubf
            public int valueOf(@yfb Insets insets) {
                return insets.bottom;
            }
        }

        /* JADX INFO: renamed from: ubf$a$b */
        public static final class b implements ubf {
            @Override // p000.ubf
            @yfb
            public Insets adjustInsets(@yfb Insets insets, int i) {
                return Insets.of(i, insets.top, insets.right, insets.bottom);
            }

            @Override // p000.ubf
            /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U */
            public long mo32593consumedOffsetsMKHz9U(long j) {
                return mzb.Offset(izb.m30429getXimpl(j), 0.0f);
            }

            @Override // p000.ubf
            /* JADX INFO: renamed from: consumedVelocity-QWom1Mo */
            public long mo32594consumedVelocityQWom1Mo(long j, float f) {
                return j4i.Velocity(i4i.m30157getXimpl(j) - f, 0.0f);
            }

            @Override // p000.ubf
            public float motionOf(float f, float f2) {
                return f;
            }

            @Override // p000.ubf
            public int valueOf(@yfb Insets insets) {
                return insets.left;
            }
        }

        /* JADX INFO: renamed from: ubf$a$c */
        public static final class c implements ubf {
            @Override // p000.ubf
            @yfb
            public Insets adjustInsets(@yfb Insets insets, int i) {
                return Insets.of(insets.left, insets.top, i, insets.bottom);
            }

            @Override // p000.ubf
            /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U */
            public long mo32593consumedOffsetsMKHz9U(long j) {
                return mzb.Offset(izb.m30429getXimpl(j), 0.0f);
            }

            @Override // p000.ubf
            /* JADX INFO: renamed from: consumedVelocity-QWom1Mo */
            public long mo32594consumedVelocityQWom1Mo(long j, float f) {
                return j4i.Velocity(i4i.m30157getXimpl(j) + f, 0.0f);
            }

            @Override // p000.ubf
            public float motionOf(float f, float f2) {
                return -f;
            }

            @Override // p000.ubf
            public int valueOf(@yfb Insets insets) {
                return insets.right;
            }
        }

        /* JADX INFO: renamed from: ubf$a$d */
        public static final class d implements ubf {
            @Override // p000.ubf
            @yfb
            public Insets adjustInsets(@yfb Insets insets, int i) {
                return Insets.of(insets.left, i, insets.right, insets.bottom);
            }

            @Override // p000.ubf
            /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U */
            public long mo32593consumedOffsetsMKHz9U(long j) {
                return mzb.Offset(0.0f, izb.m30430getYimpl(j));
            }

            @Override // p000.ubf
            /* JADX INFO: renamed from: consumedVelocity-QWom1Mo */
            public long mo32594consumedVelocityQWom1Mo(long j, float f) {
                return j4i.Velocity(0.0f, i4i.m30158getYimpl(j) - f);
            }

            @Override // p000.ubf
            public float motionOf(float f, float f2) {
                return f2;
            }

            @Override // p000.ubf
            public int valueOf(@yfb Insets insets) {
                return insets.top;
            }
        }

        private C13464a() {
        }

        @yfb
        /* JADX INFO: renamed from: chooseCalculator-ni1skBw, reason: not valid java name */
        public final ubf m32595chooseCalculatorni1skBw(int i, @yfb ov8 ov8Var) {
            uoi.C13634a c13634a = uoi.f88691b;
            if (uoi.m32619equalsimpl0(i, c13634a.m32633getLeftJoeWqyM())) {
                return f87451b;
            }
            if (uoi.m32619equalsimpl0(i, c13634a.m32636getTopJoeWqyM())) {
                return f87452c;
            }
            if (uoi.m32619equalsimpl0(i, c13634a.m32634getRightJoeWqyM())) {
                return f87453d;
            }
            if (uoi.m32619equalsimpl0(i, c13634a.m32630getBottomJoeWqyM())) {
                return f87454e;
            }
            if (uoi.m32619equalsimpl0(i, c13634a.m32635getStartJoeWqyM())) {
                return ov8Var == ov8.Ltr ? f87451b : f87453d;
            }
            if (uoi.m32619equalsimpl0(i, c13634a.m32631getEndJoeWqyM())) {
                return ov8Var == ov8.Ltr ? f87453d : f87451b;
            }
            throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed");
        }
    }

    @yfb
    Insets adjustInsets(@yfb Insets insets, int i);

    /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U, reason: not valid java name */
    long mo32593consumedOffsetsMKHz9U(long j);

    /* JADX INFO: renamed from: consumedVelocity-QWom1Mo, reason: not valid java name */
    long mo32594consumedVelocityQWom1Mo(long j, float f);

    default float hideMotion(float f, float f2) {
        return kpd.coerceAtMost(motionOf(f, f2), 0.0f);
    }

    float motionOf(float f, float f2);

    default float showMotion(float f, float f2) {
        return kpd.coerceAtLeast(motionOf(f, f2), 0.0f);
    }

    int valueOf(@yfb Insets insets);
}
