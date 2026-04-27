package p000;

/* JADX INFO: loaded from: classes3.dex */
public enum iqa {
    LOW(0.5f),
    NORMAL(1.0f),
    HIGH(1.5f);


    /* JADX INFO: renamed from: a */
    public final float f47969a;

    iqa(float f) {
        this.f47969a = f;
    }

    public float getMultiplier() {
        return this.f47969a;
    }
}
