package p000;

import java.util.Arrays;
import p000.dkh;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class od7 implements cy4 {

    /* JADX INFO: renamed from: q */
    public static final int f67297q = 0;

    /* JADX INFO: renamed from: r */
    public static final int f67298r = 179;

    /* JADX INFO: renamed from: s */
    public static final int f67299s = 181;

    /* JADX INFO: renamed from: t */
    public static final int f67300t = 184;

    /* JADX INFO: renamed from: u */
    public static final int f67301u = 178;

    /* JADX INFO: renamed from: v */
    public static final double[] f67302v = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a */
    public String f67303a;

    /* JADX INFO: renamed from: b */
    public r6h f67304b;

    /* JADX INFO: renamed from: c */
    @hib
    public final wyh f67305c;

    /* JADX INFO: renamed from: d */
    @hib
    public final ihc f67306d;

    /* JADX INFO: renamed from: e */
    @hib
    public final l8b f67307e;

    /* JADX INFO: renamed from: f */
    public final boolean[] f67308f;

    /* JADX INFO: renamed from: g */
    public final C10318a f67309g;

    /* JADX INFO: renamed from: h */
    public long f67310h;

    /* JADX INFO: renamed from: i */
    public boolean f67311i;

    /* JADX INFO: renamed from: j */
    public boolean f67312j;

    /* JADX INFO: renamed from: k */
    public long f67313k;

    /* JADX INFO: renamed from: l */
    public long f67314l;

    /* JADX INFO: renamed from: m */
    public long f67315m;

    /* JADX INFO: renamed from: n */
    public long f67316n;

    /* JADX INFO: renamed from: o */
    public boolean f67317o;

    /* JADX INFO: renamed from: p */
    public boolean f67318p;

    /* JADX INFO: renamed from: od7$a */
    public static final class C10318a {

        /* JADX INFO: renamed from: e */
        public static final byte[] f67319e = {0, 0, 1};

        /* JADX INFO: renamed from: a */
        public boolean f67320a;

        /* JADX INFO: renamed from: b */
        public int f67321b;

        /* JADX INFO: renamed from: c */
        public int f67322c;

        /* JADX INFO: renamed from: d */
        public byte[] f67323d;

        public C10318a(int i) {
            this.f67323d = new byte[i];
        }

        public void onData(byte[] bArr, int i, int i2) {
            if (this.f67320a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f67323d;
                int length = bArr2.length;
                int i4 = this.f67321b;
                if (length < i4 + i3) {
                    this.f67323d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f67323d, this.f67321b, i3);
                this.f67321b += i3;
            }
        }

        public boolean onStartCode(int i, int i2) {
            if (this.f67320a) {
                int i3 = this.f67321b - i2;
                this.f67321b = i3;
                if (this.f67322c != 0 || i != 181) {
                    this.f67320a = false;
                    return true;
                }
                this.f67322c = i3;
            } else if (i == 179) {
                this.f67320a = true;
            }
            byte[] bArr = f67319e;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public void reset() {
            this.f67320a = false;
            this.f67321b = 0;
            this.f67322c = 0;
        }
    }

    public od7() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair<p000.kq6, java.lang.Long> parseCsdBuffer(p000.od7.C10318a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f67323d
            int r1 = r8.f67321b
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
            kq6$b r6 = new kq6$b
            r6.<init>()
            kq6$b r9 = r6.setId(r9)
            java.lang.String r6 = "video/mpeg2"
            kq6$b r9 = r9.setSampleMimeType(r6)
            kq6$b r9 = r9.setWidth(r2)
            kq6$b r9 = r9.setHeight(r4)
            kq6$b r9 = r9.setPixelWidthHeightRatio(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            kq6$b r9 = r9.setInitializationData(r1)
            kq6 r9 = r9.build()
            r1 = r0[r5]
            r1 = r1 & 15
            int r1 = r1 + (-1)
            if (r1 < 0) goto L98
            double[] r2 = p000.od7.f67302v
            int r4 = r2.length
            if (r1 >= r4) goto L98
            r1 = r2[r1]
            int r8 = r8.f67322c
            int r8 = r8 + 9
            r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L90
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L90:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r0 = (long) r3
            goto L9a
        L98:
            r0 = 0
        L9a:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.od7.parseCsdBuffer(od7$a, java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
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
    @Override // p000.cy4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void consume(p000.ihc r21) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.od7.consume(ihc):void");
    }

    @Override // p000.cy4
    public void createTracks(ck5 ck5Var, dkh.C4838e c4838e) {
        c4838e.generateNewId();
        this.f67303a = c4838e.getFormatId();
        this.f67304b = ck5Var.track(c4838e.getTrackId(), 2);
        wyh wyhVar = this.f67305c;
        if (wyhVar != null) {
            wyhVar.createTracks(ck5Var, c4838e);
        }
    }

    @Override // p000.cy4
    public void packetFinished() {
    }

    @Override // p000.cy4
    public void packetStarted(long j, int i) {
        this.f67314l = j;
    }

    @Override // p000.cy4
    public void seek() {
        o8b.clearPrefixFlags(this.f67308f);
        this.f67309g.reset();
        l8b l8bVar = this.f67307e;
        if (l8bVar != null) {
            l8bVar.reset();
        }
        this.f67310h = 0L;
        this.f67311i = false;
        this.f67314l = -9223372036854775807L;
        this.f67316n = -9223372036854775807L;
    }

    public od7(@hib wyh wyhVar) {
        this.f67305c = wyhVar;
        this.f67308f = new boolean[4];
        this.f67309g = new C10318a(128);
        if (wyhVar != null) {
            this.f67307e = new l8b(178, 128);
            this.f67306d = new ihc();
        } else {
            this.f67307e = null;
            this.f67306d = null;
        }
        this.f67314l = -9223372036854775807L;
        this.f67316n = -9223372036854775807L;
    }
}
