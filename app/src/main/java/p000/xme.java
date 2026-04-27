package p000;

/* JADX INFO: loaded from: classes3.dex */
public class xme {

    /* JADX INFO: renamed from: a */
    public float f98543a;

    /* JADX INFO: renamed from: b */
    public float f98544b;

    public xme(float f, float f2) {
        this.f98543a = f;
        this.f98544b = f2;
    }

    public boolean equals(float f, float f2) {
        return this.f98543a == f && this.f98544b == f2;
    }

    public float getScaleX() {
        return this.f98543a;
    }

    public float getScaleY() {
        return this.f98544b;
    }

    public void set(float f, float f2) {
        this.f98543a = f;
        this.f98544b = f2;
    }

    public String toString() {
        return getScaleX() + "x" + getScaleY();
    }

    public xme() {
        this(1.0f, 1.0f);
    }
}
