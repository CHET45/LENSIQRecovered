package p000;

import java.util.Arrays;
import p000.ckh;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class nd7 implements dy4 {

    /* JADX INFO: renamed from: r */
    public static final int f64032r = 0;

    /* JADX INFO: renamed from: s */
    public static final int f64033s = 179;

    /* JADX INFO: renamed from: t */
    public static final int f64034t = 181;

    /* JADX INFO: renamed from: u */
    public static final int f64035u = 184;

    /* JADX INFO: renamed from: v */
    public static final int f64036v = 178;

    /* JADX INFO: renamed from: w */
    public static final double[] f64037w = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a */
    public String f64038a;

    /* JADX INFO: renamed from: b */
    public q6h f64039b;

    /* JADX INFO: renamed from: c */
    @hib
    public final yyh f64040c;

    /* JADX INFO: renamed from: d */
    public final String f64041d;

    /* JADX INFO: renamed from: e */
    @hib
    public final jhc f64042e;

    /* JADX INFO: renamed from: f */
    @hib
    public final m8b f64043f;

    /* JADX INFO: renamed from: g */
    public final boolean[] f64044g;

    /* JADX INFO: renamed from: h */
    public final C9792a f64045h;

    /* JADX INFO: renamed from: i */
    public long f64046i;

    /* JADX INFO: renamed from: j */
    public boolean f64047j;

    /* JADX INFO: renamed from: k */
    public boolean f64048k;

    /* JADX INFO: renamed from: l */
    public long f64049l;

    /* JADX INFO: renamed from: m */
    public long f64050m;

    /* JADX INFO: renamed from: n */
    public long f64051n;

    /* JADX INFO: renamed from: o */
    public long f64052o;

    /* JADX INFO: renamed from: p */
    public boolean f64053p;

    /* JADX INFO: renamed from: q */
    public boolean f64054q;

    /* JADX INFO: renamed from: nd7$a */
    public static final class C9792a {

        /* JADX INFO: renamed from: e */
        public static final byte[] f64055e = {0, 0, 1};

        /* JADX INFO: renamed from: a */
        public boolean f64056a;

        /* JADX INFO: renamed from: b */
        public int f64057b;

        /* JADX INFO: renamed from: c */
        public int f64058c;

        /* JADX INFO: renamed from: d */
        public byte[] f64059d;

        public C9792a(int i) {
            this.f64059d = new byte[i];
        }

        public void onData(byte[] bArr, int i, int i2) {
            if (this.f64056a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f64059d;
                int length = bArr2.length;
                int i4 = this.f64057b;
                if (length < i4 + i3) {
                    this.f64059d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f64059d, this.f64057b, i3);
                this.f64057b += i3;
            }
        }

        public boolean onStartCode(int i, int i2) {
            if (this.f64056a) {
                int i3 = this.f64057b - i2;
                this.f64057b = i3;
                if (this.f64058c != 0 || i != 181) {
                    this.f64056a = false;
                    return true;
                }
                this.f64058c = i3;
            } else if (i == 179) {
                this.f64056a = true;
            }
            byte[] bArr = f64055e;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public void reset() {
            this.f64056a = false;
            this.f64057b = 0;
            this.f64058c = 0;
        }
    }

    public nd7(String str) {
        this(null, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair<androidx.media3.common.C1213a, java.lang.Long> parseCsdBuffer(p000.nd7.C9792a r8, java.lang.String r9, java.lang.String r10) {
        /*
            byte[] r0 = r8.f64059d
            int r1 = r8.f64057b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r5 = r5 >> r1
            r2 = r2 | r5
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r6
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3e
            r7 = 3
            if (r6 == r7) goto L38
            if (r6 == r1) goto L30
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L30:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
        L35:
            float r6 = (float) r6
            float r1 = r1 / r6
            goto L44
        L38:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L35
        L3e:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
            goto L35
        L44:
            androidx.media3.common.a$b r6 = new androidx.media3.common.a$b
            r6.<init>()
            androidx.media3.common.a$b r9 = r6.setId(r9)
            androidx.media3.common.a$b r9 = r9.setContainerMimeType(r10)
            java.lang.String r10 = "video/mpeg2"
            androidx.media3.common.a$b r9 = r9.setSampleMimeType(r10)
            androidx.media3.common.a$b r9 = r9.setWidth(r2)
            androidx.media3.common.a$b r9 = r9.setHeight(r4)
            androidx.media3.common.a$b r9 = r9.setPixelWidthHeightRatio(r1)
            java.util.List r10 = java.util.Collections.singletonList(r0)
            androidx.media3.common.a$b r9 = r9.setInitializationData(r10)
            androidx.media3.common.a r9 = r9.build()
            r10 = r0[r5]
            r10 = r10 & 15
            int r10 = r10 + (-1)
            if (r10 < 0) goto L9c
            double[] r1 = p000.nd7.f64037w
            int r2 = r1.length
            if (r10 >= r2) goto L9c
            r4 = r1[r10]
            int r8 = r8.f64058c
            int r8 = r8 + 9
            r8 = r0[r8]
            r10 = r8 & 96
            int r10 = r10 >> r3
            r8 = r8 & 31
            if (r10 == r8) goto L94
            double r0 = (double) r10
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r2
            int r8 = r8 + 1
            double r2 = (double) r8
            double r0 = r0 / r2
            double r4 = r4 * r0
        L94:
            r0 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 / r4
            long r0 = (long) r0
            goto L9e
        L9c:
            r0 = 0
        L9e:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nd7.parseCsdBuffer(nd7$a, java.lang.String, java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0144  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.dy4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void consume(p000.jhc r21) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nd7.consume(jhc):void");
    }

    @Override // p000.dy4
    public void createTracks(bk5 bk5Var, ckh.C2372e c2372e) {
        c2372e.generateNewId();
        this.f64038a = c2372e.getFormatId();
        this.f64039b = bk5Var.track(c2372e.getTrackId(), 2);
        yyh yyhVar = this.f64040c;
        if (yyhVar != null) {
            yyhVar.createTracks(bk5Var, c2372e);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.dy4
    public void packetFinished(boolean z) {
        v80.checkStateNotNull(this.f64039b);
        if (z) {
            boolean z2 = this.f64053p;
            this.f64039b.sampleMetadata(this.f64052o, z2 ? 1 : 0, (int) (this.f64046i - this.f64051n), 0, null);
        }
    }

    @Override // p000.dy4
    public void packetStarted(long j, int i) {
        this.f64050m = j;
    }

    @Override // p000.dy4
    public void seek() {
        n8b.clearPrefixFlags(this.f64044g);
        this.f64045h.reset();
        m8b m8bVar = this.f64043f;
        if (m8bVar != null) {
            m8bVar.reset();
        }
        this.f64046i = 0L;
        this.f64047j = false;
        this.f64050m = -9223372036854775807L;
        this.f64052o = -9223372036854775807L;
    }

    public nd7(@hib yyh yyhVar, String str) {
        this.f64040c = yyhVar;
        this.f64041d = str;
        this.f64044g = new boolean[4];
        this.f64045h = new C9792a(128);
        if (yyhVar != null) {
            this.f64043f = new m8b(178, 128);
            this.f64042e = new jhc();
        } else {
            this.f64043f = null;
            this.f64042e = null;
        }
        this.f64050m = -9223372036854775807L;
        this.f64052o = -9223372036854775807L;
    }
}
