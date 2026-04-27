package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class n79 {

    /* JADX INFO: renamed from: a */
    public final int f63440a;

    /* JADX INFO: renamed from: b */
    public Object[] f63441b;

    /* JADX INFO: renamed from: c */
    public Object[] f63442c;

    /* JADX INFO: renamed from: d */
    public volatile int f63443d;

    /* JADX INFO: renamed from: e */
    public int f63444e;

    public n79(int i) {
        this.f63440a = i;
    }

    public void add(Object obj) {
        if (this.f63443d == 0) {
            Object[] objArr = new Object[this.f63440a + 1];
            this.f63441b = objArr;
            this.f63442c = objArr;
            objArr[0] = obj;
            this.f63444e = 1;
            this.f63443d = 1;
            return;
        }
        int i = this.f63444e;
        int i2 = this.f63440a;
        if (i != i2) {
            this.f63442c[i] = obj;
            this.f63444e = i + 1;
            this.f63443d++;
        } else {
            Object[] objArr2 = new Object[i2 + 1];
            objArr2[0] = obj;
            this.f63442c[i2] = objArr2;
            this.f63442c = objArr2;
            this.f63444e = 1;
            this.f63443d++;
        }
    }

    public Object[] head() {
        return this.f63441b;
    }

    public int size() {
        return this.f63443d;
    }

    public String toString() {
        int i = this.f63440a;
        int i2 = this.f63443d;
        ArrayList arrayList = new ArrayList(i2 + 1);
        Object[] objArrHead = head();
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            arrayList.add(objArrHead[i4]);
            i3++;
            i4++;
            if (i4 == i) {
                objArrHead = (Object[]) objArrHead[i];
                i4 = 0;
            }
        }
        return arrayList.toString();
    }
}
