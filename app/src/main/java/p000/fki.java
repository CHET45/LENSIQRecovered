package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class fki implements xdg {

    /* JADX INFO: renamed from: a */
    public final List<tji> f36981a;

    /* JADX INFO: renamed from: b */
    public final long[] f36982b;

    /* JADX INFO: renamed from: c */
    public final long[] f36983c;

    public fki(List<tji> list) {
        this.f36981a = Collections.unmodifiableList(new ArrayList(list));
        this.f36982b = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            tji tjiVar = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f36982b;
            jArr[i2] = tjiVar.f85088b;
            jArr[i2 + 1] = tjiVar.f85089c;
        }
        long[] jArr2 = this.f36982b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f36983c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getCues$0(tji tjiVar, tji tjiVar2) {
        return Long.compare(tjiVar.f85088b, tjiVar2.f85088b);
    }

    @Override // p000.xdg
    public List<o93> getCues(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f36981a.size(); i++) {
            long[] jArr = this.f36982b;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                tji tjiVar = this.f36981a.get(i);
                o93 o93Var = tjiVar.f85087a;
                if (o93Var.f66878e == -3.4028235E38f) {
                    arrayList2.add(tjiVar);
                } else {
                    arrayList.add(o93Var);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: dki
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return fki.lambda$getCues$0((tji) obj, (tji) obj2);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((tji) arrayList2.get(i3)).f85087a.buildUpon().setLine((-1) - i3, 1).build());
        }
        return arrayList;
    }

    @Override // p000.xdg
    public long getEventTime(int i) {
        u80.checkArgument(i >= 0);
        u80.checkArgument(i < this.f36983c.length);
        return this.f36983c[i];
    }

    @Override // p000.xdg
    public int getEventTimeCount() {
        return this.f36983c.length;
    }

    @Override // p000.xdg
    public int getNextEventTimeIndex(long j) {
        int iBinarySearchCeil = x0i.binarySearchCeil(this.f36983c, j, false, false);
        if (iBinarySearchCeil < this.f36983c.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
