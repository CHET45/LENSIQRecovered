package p000;

/* JADX INFO: loaded from: classes6.dex */
public class cr0 {

    /* JADX INFO: renamed from: a */
    public final int f27118a;

    /* JADX INFO: renamed from: b */
    public final int f27119b;

    /* JADX INFO: renamed from: c */
    public int f27120c;

    /* JADX INFO: renamed from: d */
    public final String f27121d;

    public cr0(int i, String str) {
        this(i, i, str);
    }

    public int getCode() {
        return this.f27118a;
    }

    public String getMessage() {
        return this.f27121d;
    }

    public int getOpCode() {
        return this.f27120c;
    }

    public int getSubCode() {
        return this.f27119b;
    }

    public cr0 setOpCode(int i) {
        this.f27120c = i;
        return this;
    }

    public String toString() {
        return "BaseError{code=" + this.f27118a + ", subCode=" + this.f27119b + ", opCode=" + this.f27120c + ", message='" + this.f27121d + "'}";
    }

    public cr0(int i, int i2, String str) {
        this.f27118a = i;
        this.f27119b = i2;
        this.f27121d = str;
    }
}
