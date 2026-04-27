package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class m79 {

    /* JADX INFO: renamed from: a */
    public final int f60142a;

    /* JADX INFO: renamed from: b */
    public Object[] f60143b;

    /* JADX INFO: renamed from: c */
    public Object[] f60144c;

    /* JADX INFO: renamed from: d */
    public volatile int f60145d;

    /* JADX INFO: renamed from: e */
    public int f60146e;

    public m79(int capacityHint) {
        this.f60142a = capacityHint;
    }

    public void add(Object o) {
        if (this.f60145d == 0) {
            Object[] objArr = new Object[this.f60142a + 1];
            this.f60143b = objArr;
            this.f60144c = objArr;
            objArr[0] = o;
            this.f60146e = 1;
            this.f60145d = 1;
            return;
        }
        int i = this.f60146e;
        int i2 = this.f60142a;
        if (i != i2) {
            this.f60144c[i] = o;
            this.f60146e = i + 1;
            this.f60145d++;
        } else {
            Object[] objArr2 = new Object[i2 + 1];
            objArr2[0] = o;
            this.f60144c[i2] = objArr2;
            this.f60144c = objArr2;
            this.f60146e = 1;
            this.f60145d++;
        }
    }

    public Object[] head() {
        return this.f60143b;
    }

    public int size() {
        return this.f60145d;
    }

    public String toString() {
        int i = this.f60142a;
        int i2 = this.f60145d;
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
