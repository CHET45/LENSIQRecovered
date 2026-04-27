package p000;

/* JADX INFO: loaded from: classes7.dex */
public class nhc {

    /* JADX INFO: renamed from: a */
    public int f64552a;

    /* JADX INFO: renamed from: b */
    public String f64553b;

    public nhc(int i, String str) {
        this.f64552a = i;
        this.f64553b = str;
    }

    public String getErrorMessage() {
        return this.f64553b;
    }

    public int getPosition() {
        return this.f64552a;
    }

    public String toString() {
        return this.f64552a + ": " + this.f64553b;
    }

    public nhc(int i, String str, Object... objArr) {
        this.f64553b = String.format(str, objArr);
        this.f64552a = i;
    }
}
