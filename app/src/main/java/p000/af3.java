package p000;

import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class af3 implements av5<af3> {

    /* JADX INFO: renamed from: a */
    public final long f1280a;

    /* JADX INFO: renamed from: b */
    public final long f1281b;

    /* JADX INFO: renamed from: c */
    public final long f1282c;

    /* JADX INFO: renamed from: d */
    public final boolean f1283d;

    /* JADX INFO: renamed from: e */
    public final long f1284e;

    /* JADX INFO: renamed from: f */
    public final long f1285f;

    /* JADX INFO: renamed from: g */
    public final long f1286g;

    /* JADX INFO: renamed from: h */
    public final long f1287h;

    /* JADX INFO: renamed from: i */
    @hib
    public final kzh f1288i;

    /* JADX INFO: renamed from: j */
    @hib
    public final j4f f1289j;

    /* JADX INFO: renamed from: k */
    @hib
    public final Uri f1290k;

    /* JADX INFO: renamed from: l */
    @hib
    public final hed f1291l;

    /* JADX INFO: renamed from: m */
    public final List<vnc> f1292m;

    public af3(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, @hib hed hedVar, @hib kzh kzhVar, @hib j4f j4fVar, @hib Uri uri, List<vnc> list) {
        this.f1280a = j;
        this.f1281b = j2;
        this.f1282c = j3;
        this.f1283d = z;
        this.f1284e = j4;
        this.f1285f = j5;
        this.f1286g = j6;
        this.f1287h = j7;
        this.f1291l = hedVar;
        this.f1288i = kzhVar;
        this.f1290k = uri;
        this.f1289j = j4fVar;
        this.f1292m = list == null ? Collections.emptyList() : list;
    }

    private static ArrayList<C8362kh> copyAdaptationSets(List<C8362kh> list, LinkedList<StreamKey> linkedList) {
        StreamKey streamKeyPoll = linkedList.poll();
        int i = streamKeyPoll.f19772a;
        ArrayList<C8362kh> arrayList = new ArrayList<>();
        do {
            int i2 = streamKeyPoll.f19773b;
            C8362kh c8362kh = list.get(i2);
            List<n3e> list2 = c8362kh.f54058c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(streamKeyPoll.f19774c));
                streamKeyPoll = linkedList.poll();
                if (streamKeyPoll.f19772a != i) {
                    break;
                }
            } while (streamKeyPoll.f19773b == i2);
            arrayList.add(new C8362kh(c8362kh.f54056a, c8362kh.f54057b, arrayList2, c8362kh.f54059d, c8362kh.f54060e, c8362kh.f54061f));
        } while (streamKeyPoll.f19772a == i);
        linkedList.addFirst(streamKeyPoll);
        return arrayList;
    }

    @Override // p000.av5
    public /* bridge */ /* synthetic */ af3 copy(List list) {
        return copy((List<StreamKey>) list);
    }

    public final vnc getPeriod(int i) {
        return this.f1292m.get(i);
    }

    public final int getPeriodCount() {
        return this.f1292m.size();
    }

    public final long getPeriodDurationMs(int i) {
        long j;
        long j2;
        if (i == this.f1292m.size() - 1) {
            j = this.f1281b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = this.f1292m.get(i).f91793b;
        } else {
            j = this.f1292m.get(i + 1).f91793b;
            j2 = this.f1292m.get(i).f91793b;
        }
        return j - j2;
    }

    public final long getPeriodDurationUs(int i) {
        return x0i.msToUs(getPeriodDurationMs(i));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.av5
    public final af3 copy(List<StreamKey> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        while (true) {
            if (i >= getPeriodCount()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).f19772a != i) {
                long periodDurationMs = getPeriodDurationMs(i);
                if (periodDurationMs != -9223372036854775807L) {
                    j += periodDurationMs;
                }
            } else {
                vnc period = getPeriod(i);
                arrayList.add(new vnc(period.f91792a, period.f91793b - j, copyAdaptationSets(period.f91794c, linkedList), period.f91795d));
            }
            i++;
        }
        long j2 = this.f1281b;
        return new af3(this.f1280a, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, this.f1282c, this.f1283d, this.f1284e, this.f1285f, this.f1286g, this.f1287h, this.f1291l, this.f1288i, this.f1289j, this.f1290k, arrayList);
    }
}
