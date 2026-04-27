package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class s3i {

    /* JADX INFO: renamed from: a */
    public final double[] f80588a;

    public s3i(@hib double[] dArr) {
        this.f80588a = dArr == null ? new double[0] : (double[]) dArr.clone();
    }

    @efb
    /* JADX INFO: renamed from: a */
    public List<Double> m21697a() {
        ArrayList arrayList = new ArrayList(this.f80588a.length);
        int i = 0;
        while (true) {
            double[] dArr = this.f80588a;
            if (i >= dArr.length) {
                return arrayList;
            }
            arrayList.add(i, Double.valueOf(dArr[i]));
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f80588a, ((s3i) obj).f80588a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f80588a);
    }

    @efb
    public double[] toArray() {
        return (double[]) this.f80588a.clone();
    }
}
