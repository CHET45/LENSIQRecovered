package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class img {

    /* JADX INFO: renamed from: A */
    public static final img f47508A;

    /* JADX INFO: renamed from: B */
    public static final img f47509B;

    /* JADX INFO: renamed from: C */
    public static final img f47510C;

    /* JADX INFO: renamed from: D */
    public static final img f47511D;

    /* JADX INFO: renamed from: e */
    public static final float f47512e = 0.26f;

    /* JADX INFO: renamed from: f */
    public static final float f47513f = 0.45f;

    /* JADX INFO: renamed from: g */
    public static final float f47514g = 0.55f;

    /* JADX INFO: renamed from: h */
    public static final float f47515h = 0.74f;

    /* JADX INFO: renamed from: i */
    public static final float f47516i = 0.3f;

    /* JADX INFO: renamed from: j */
    public static final float f47517j = 0.5f;

    /* JADX INFO: renamed from: k */
    public static final float f47518k = 0.7f;

    /* JADX INFO: renamed from: l */
    public static final float f47519l = 0.3f;

    /* JADX INFO: renamed from: m */
    public static final float f47520m = 0.4f;

    /* JADX INFO: renamed from: n */
    public static final float f47521n = 1.0f;

    /* JADX INFO: renamed from: o */
    public static final float f47522o = 0.35f;

    /* JADX INFO: renamed from: p */
    public static final float f47523p = 0.24f;

    /* JADX INFO: renamed from: q */
    public static final float f47524q = 0.52f;

    /* JADX INFO: renamed from: r */
    public static final float f47525r = 0.24f;

    /* JADX INFO: renamed from: s */
    public static final int f47526s = 0;

    /* JADX INFO: renamed from: t */
    public static final int f47527t = 1;

    /* JADX INFO: renamed from: u */
    public static final int f47528u = 2;

    /* JADX INFO: renamed from: v */
    public static final int f47529v = 0;

    /* JADX INFO: renamed from: w */
    public static final int f47530w = 1;

    /* JADX INFO: renamed from: x */
    public static final int f47531x = 2;

    /* JADX INFO: renamed from: y */
    public static final img f47532y;

    /* JADX INFO: renamed from: z */
    public static final img f47533z;

    /* JADX INFO: renamed from: a */
    public final float[] f47534a;

    /* JADX INFO: renamed from: b */
    public final float[] f47535b;

    /* JADX INFO: renamed from: c */
    public final float[] f47536c;

    /* JADX INFO: renamed from: d */
    public boolean f47537d;

    static {
        img imgVar = new img();
        f47532y = imgVar;
        setDefaultLightLightnessValues(imgVar);
        setDefaultVibrantSaturationValues(imgVar);
        img imgVar2 = new img();
        f47533z = imgVar2;
        setDefaultNormalLightnessValues(imgVar2);
        setDefaultVibrantSaturationValues(imgVar2);
        img imgVar3 = new img();
        f47508A = imgVar3;
        setDefaultDarkLightnessValues(imgVar3);
        setDefaultVibrantSaturationValues(imgVar3);
        img imgVar4 = new img();
        f47509B = imgVar4;
        setDefaultLightLightnessValues(imgVar4);
        setDefaultMutedSaturationValues(imgVar4);
        img imgVar5 = new img();
        f47510C = imgVar5;
        setDefaultNormalLightnessValues(imgVar5);
        setDefaultMutedSaturationValues(imgVar5);
        img imgVar6 = new img();
        f47511D = imgVar6;
        setDefaultDarkLightnessValues(imgVar6);
        setDefaultMutedSaturationValues(imgVar6);
    }

    public img() {
        float[] fArr = new float[3];
        this.f47534a = fArr;
        float[] fArr2 = new float[3];
        this.f47535b = fArr2;
        this.f47536c = new float[3];
        this.f47537d = true;
        setTargetDefaultValues(fArr);
        setTargetDefaultValues(fArr2);
        setDefaultWeights();
    }

    private static void setDefaultDarkLightnessValues(img imgVar) {
        float[] fArr = imgVar.f47535b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void setDefaultLightLightnessValues(img imgVar) {
        float[] fArr = imgVar.f47535b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void setDefaultMutedSaturationValues(img imgVar) {
        float[] fArr = imgVar.f47534a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    private static void setDefaultNormalLightnessValues(img imgVar) {
        float[] fArr = imgVar.f47535b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void setDefaultVibrantSaturationValues(img imgVar) {
        float[] fArr = imgVar.f47534a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private void setDefaultWeights() {
        float[] fArr = this.f47536c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    private static void setTargetDefaultValues(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    /* JADX INFO: renamed from: a */
    public void m13192a() {
        int length = this.f47536c.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            float f2 = this.f47536c[i];
            if (f2 > 0.0f) {
                f += f2;
            }
        }
        if (f != 0.0f) {
            int length2 = this.f47536c.length;
            for (int i2 = 0; i2 < length2; i2++) {
                float[] fArr = this.f47536c;
                float f3 = fArr[i2];
                if (f3 > 0.0f) {
                    fArr[i2] = f3 / f;
                }
            }
        }
    }

    public float getLightnessWeight() {
        return this.f47536c[1];
    }

    @y46(from = 0.0d, m25645to = 1.0d)
    public float getMaximumLightness() {
        return this.f47535b[2];
    }

    @y46(from = 0.0d, m25645to = 1.0d)
    public float getMaximumSaturation() {
        return this.f47534a[2];
    }

    @y46(from = 0.0d, m25645to = 1.0d)
    public float getMinimumLightness() {
        return this.f47535b[0];
    }

    @y46(from = 0.0d, m25645to = 1.0d)
    public float getMinimumSaturation() {
        return this.f47534a[0];
    }

    public float getPopulationWeight() {
        return this.f47536c[2];
    }

    public float getSaturationWeight() {
        return this.f47536c[0];
    }

    @y46(from = 0.0d, m25645to = 1.0d)
    public float getTargetLightness() {
        return this.f47535b[1];
    }

    @y46(from = 0.0d, m25645to = 1.0d)
    public float getTargetSaturation() {
        return this.f47534a[1];
    }

    public boolean isExclusive() {
        return this.f47537d;
    }

    /* JADX INFO: renamed from: img$a */
    public static final class C7507a {

        /* JADX INFO: renamed from: a */
        public final img f47538a;

        public C7507a() {
            this.f47538a = new img();
        }

        @efb
        public img build() {
            return this.f47538a;
        }

        @efb
        public C7507a setExclusive(boolean z) {
            this.f47538a.f47537d = z;
            return this;
        }

        @efb
        public C7507a setLightnessWeight(@y46(from = 0.0d) float f) {
            this.f47538a.f47536c[1] = f;
            return this;
        }

        @efb
        public C7507a setMaximumLightness(@y46(from = 0.0d, m25645to = 1.0d) float f) {
            this.f47538a.f47535b[2] = f;
            return this;
        }

        @efb
        public C7507a setMaximumSaturation(@y46(from = 0.0d, m25645to = 1.0d) float f) {
            this.f47538a.f47534a[2] = f;
            return this;
        }

        @efb
        public C7507a setMinimumLightness(@y46(from = 0.0d, m25645to = 1.0d) float f) {
            this.f47538a.f47535b[0] = f;
            return this;
        }

        @efb
        public C7507a setMinimumSaturation(@y46(from = 0.0d, m25645to = 1.0d) float f) {
            this.f47538a.f47534a[0] = f;
            return this;
        }

        @efb
        public C7507a setPopulationWeight(@y46(from = 0.0d) float f) {
            this.f47538a.f47536c[2] = f;
            return this;
        }

        @efb
        public C7507a setSaturationWeight(@y46(from = 0.0d) float f) {
            this.f47538a.f47536c[0] = f;
            return this;
        }

        @efb
        public C7507a setTargetLightness(@y46(from = 0.0d, m25645to = 1.0d) float f) {
            this.f47538a.f47535b[1] = f;
            return this;
        }

        @efb
        public C7507a setTargetSaturation(@y46(from = 0.0d, m25645to = 1.0d) float f) {
            this.f47538a.f47534a[1] = f;
            return this;
        }

        public C7507a(@efb img imgVar) {
            this.f47538a = new img(imgVar);
        }
    }

    public img(@efb img imgVar) {
        float[] fArr = new float[3];
        this.f47534a = fArr;
        float[] fArr2 = new float[3];
        this.f47535b = fArr2;
        float[] fArr3 = new float[3];
        this.f47536c = fArr3;
        this.f47537d = true;
        System.arraycopy(imgVar.f47534a, 0, fArr, 0, fArr.length);
        System.arraycopy(imgVar.f47535b, 0, fArr2, 0, fArr2.length);
        System.arraycopy(imgVar.f47536c, 0, fArr3, 0, fArr3.length);
    }
}
