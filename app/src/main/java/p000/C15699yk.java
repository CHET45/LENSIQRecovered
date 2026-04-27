package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: yk */
/* JADX INFO: loaded from: classes6.dex */
public class C15699yk {

    /* JADX INFO: renamed from: a */
    public String f101862a;

    /* JADX INFO: renamed from: b */
    public byte[] f101863b;

    /* JADX INFO: renamed from: c */
    public int f101864c;

    /* JADX INFO: renamed from: d */
    public int f101865d;

    /* JADX INFO: renamed from: e */
    public wvi f101866e;

    /* JADX INFO: renamed from: f */
    public u2i f101867f;

    private byte[] cut(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static C15699yk gen(String str, String str2) {
        return gen(str, str2.getBytes(), wvi.TEXT, u2i.STRING);
    }

    public String getKey() {
        return this.f101862a;
    }

    public int getLen() {
        return this.f101864c;
    }

    public int getStatus() {
        return this.f101865d;
    }

    public wvi getType() {
        return this.f101866e;
    }

    public byte[] getValue() {
        return this.f101863b;
    }

    public u2i getVarType() {
        return this.f101867f;
    }

    public void setKey(String str) {
        this.f101862a = str;
    }

    public void setLen(int i) {
        this.f101864c = i;
    }

    public void setStatus(int i) {
        this.f101865d = i;
    }

    public void setType(int i) {
        this.f101866e = wvi.m24846a(i);
    }

    public void setValue(byte[] bArr) {
        this.f101863b = bArr;
    }

    public void setVarType(u2i u2iVar) {
        this.f101867f = u2iVar;
    }

    public String toString() {
        return "AiOutput{key='" + this.f101862a + "', value=" + Arrays.toString(this.f101863b) + ", len=" + this.f101864c + ", type=" + this.f101866e + ", status=" + this.f101865d + ", varType=" + this.f101867f + '}';
    }

    public static C15699yk gen(String str, byte[] bArr, wvi wviVar, u2i u2iVar) {
        C15699yk c15699yk = new C15699yk();
        c15699yk.setKey(str);
        c15699yk.setValue(bArr);
        c15699yk.setLen(bArr.length);
        c15699yk.setType(wviVar);
        c15699yk.setVarType(u2iVar);
        return c15699yk;
    }

    public void setKey(byte[] bArr, int i, int i2) {
        this.f101862a = new String(cut(bArr, i, i2));
    }

    public void setType(wvi wviVar) {
        this.f101866e = wviVar;
    }

    public void setValue(byte[] bArr, int i, int i2) {
        this.f101863b = cut(bArr, i, i2);
    }
}
