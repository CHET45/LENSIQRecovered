package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gki implements ydg {

    /* JADX INFO: renamed from: a */
    public final List<uji> f40066a;

    /* JADX INFO: renamed from: b */
    public final long[] f40067b;

    /* JADX INFO: renamed from: c */
    public final long[] f40068c;

    public gki(List<uji> list) {
        this.f40066a = Collections.unmodifiableList(new ArrayList(list));
        this.f40067b = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            uji ujiVar = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f40067b;
            jArr[i2] = ujiVar.f88181b;
            jArr[i2 + 1] = ujiVar.f88182c;
        }
        long[] jArr2 = this.f40067b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f40068c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getCues$0(uji ujiVar, uji ujiVar2) {
        return Long.compare(ujiVar.f88181b, ujiVar2.f88181b);
    }

    @Override // p000.ydg
    public List<n93> getCues(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f40066a.size(); i++) {
            long[] jArr = this.f40067b;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                uji ujiVar = this.f40066a.get(i);
                n93 n93Var = ujiVar.f88180a;
                if (n93Var.f63707e == -3.4028235E38f) {
                    arrayList2.add(ujiVar);
                } else {
                    arrayList.add(n93Var);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: eki
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return gki.lambda$getCues$0((uji) obj, (uji) obj2);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((uji) arrayList2.get(i3)).f88180a.buildUpon().setLine((-1) - i3, 1).build());
        }
        return arrayList;
    }

    @Override // p000.ydg
    public long getEventTime(int i) {
        v80.checkArgument(i >= 0);
        v80.checkArgument(i < this.f40068c.length);
        return this.f40068c[i];
    }

    @Override // p000.ydg
    public int getEventTimeCount() {
        return this.f40068c.length;
    }

    @Override // p000.ydg
    public int getNextEventTimeIndex(long j) {
        int iBinarySearchCeil = t0i.binarySearchCeil(this.f40068c, j, false, false);
        if (iBinarySearchCeil < this.f40068c.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
