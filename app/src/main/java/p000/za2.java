package p000;

import p000.w82;

/* JADX INFO: loaded from: classes.dex */
public final class za2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final qy6<ia2, alh<w82, C15879yy>> f104538a = C16045a.f104539a;

    /* JADX INFO: renamed from: za2$a */
    public static final class C16045a extends tt8 implements qy6<ia2, alh<w82, C15879yy>> {

        /* JADX INFO: renamed from: a */
        public static final C16045a f104539a = new C16045a();

        /* JADX INFO: renamed from: za2$a$a */
        @dwf({"SMAP\nColorVectorConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorVectorConverter.kt\nandroidx/compose/animation/ColorVectorConverterKt$ColorToVector$1$1\n+ 2 Color.kt\nandroidx/compose/ui/graphics/Color\n*L\n1#1,58:1\n231#2,13:59\n*S KotlinDebug\n*F\n+ 1 ColorVectorConverter.kt\nandroidx/compose/animation/ColorVectorConverterKt$ColorToVector$1$1\n*L\n35#1:59,13\n*E\n"})
        public static final class a extends tt8 implements qy6<w82, C15879yy> {

            /* JADX INFO: renamed from: a */
            public static final a f104540a = new a();

            public a() {
                super(1);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ C15879yy invoke(w82 w82Var) {
                return m33502invoke8_81llA(w82Var.m32961unboximpl());
            }

            @yfb
            /* JADX INFO: renamed from: invoke-8_81llA, reason: not valid java name */
            public final C15879yy m33502invoke8_81llA(long j) {
                long jM32948convertvNxB06k = w82.m32948convertvNxB06k(j, ra2.f77522a.getOklab());
                return new C15879yy(w82.m32953getAlphaimpl(jM32948convertvNxB06k), w82.m32957getRedimpl(jM32948convertvNxB06k), w82.m32956getGreenimpl(jM32948convertvNxB06k), w82.m32954getBlueimpl(jM32948convertvNxB06k));
            }
        }

        /* JADX INFO: renamed from: za2$a$b */
        @dwf({"SMAP\nColorVectorConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorVectorConverter.kt\nandroidx/compose/animation/ColorVectorConverterKt$ColorToVector$1$2\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,58:1\n71#2,16:59\n71#2,16:75\n71#2,16:91\n71#2,16:107\n*S KotlinDebug\n*F\n+ 1 ColorVectorConverter.kt\nandroidx/compose/animation/ColorVectorConverterKt$ColorToVector$1$2\n*L\n40#1:59,16\n41#1:75,16\n42#1:91,16\n43#1:107,16\n*E\n"})
        public static final class b extends tt8 implements qy6<C15879yy, w82> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ia2 f104541a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ia2 ia2Var) {
                super(1);
                this.f104541a = ia2Var;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ w82 invoke(C15879yy c15879yy) {
                return w82.m32941boximpl(m33503invokevNxB06k(c15879yy));
            }

            /* JADX INFO: renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m33503invokevNxB06k(@yfb C15879yy c15879yy) {
                float v2 = c15879yy.getV2();
                if (v2 < 0.0f) {
                    v2 = 0.0f;
                }
                if (v2 > 1.0f) {
                    v2 = 1.0f;
                }
                float v3 = c15879yy.getV3();
                if (v3 < -0.5f) {
                    v3 = -0.5f;
                }
                if (v3 > 0.5f) {
                    v3 = 0.5f;
                }
                float v4 = c15879yy.getV4();
                float f = v4 >= -0.5f ? v4 : -0.5f;
                float f2 = f <= 0.5f ? f : 0.5f;
                float v1 = c15879yy.getV1();
                float f3 = v1 >= 0.0f ? v1 : 0.0f;
                return w82.m32948convertvNxB06k(j92.Color(v2, v3, f2, f3 <= 1.0f ? f3 : 1.0f, ra2.f77522a.getOklab()), this.f104541a);
            }
        }

        public C16045a() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final alh<w82, C15879yy> invoke(@yfb ia2 ia2Var) {
            return g3i.TwoWayConverter(a.f104540a, new b(ia2Var));
        }
    }

    @yfb
    public static final qy6<ia2, alh<w82, C15879yy>> getVectorConverter(@yfb w82.C14471a c14471a) {
        return f104538a;
    }
}
