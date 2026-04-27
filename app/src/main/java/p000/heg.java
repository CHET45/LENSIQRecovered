package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class heg implements yj5 {

    /* JADX INFO: renamed from: o */
    public static final int f43329o = 0;

    /* JADX INFO: renamed from: p */
    public static final int f43330p = 1;

    /* JADX INFO: renamed from: q */
    public static final int f43331q = 2;

    /* JADX INFO: renamed from: r */
    public static final int f43332r = 3;

    /* JADX INFO: renamed from: s */
    public static final int f43333s = 4;

    /* JADX INFO: renamed from: t */
    public static final int f43334t = 5;

    /* JADX INFO: renamed from: u */
    public static final int f43335u = 1024;

    /* JADX INFO: renamed from: d */
    public final zdg f43336d;

    /* JADX INFO: renamed from: g */
    public final kq6 f43339g;

    /* JADX INFO: renamed from: j */
    public ck5 f43342j;

    /* JADX INFO: renamed from: k */
    public r6h f43343k;

    /* JADX INFO: renamed from: l */
    public int f43344l;

    /* JADX INFO: renamed from: e */
    public final s93 f43337e = new s93();

    /* JADX INFO: renamed from: f */
    public final ihc f43338f = new ihc();

    /* JADX INFO: renamed from: h */
    public final List<Long> f43340h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final List<ihc> f43341i = new ArrayList();

    /* JADX INFO: renamed from: m */
    public int f43345m = 0;

    /* JADX INFO: renamed from: n */
    public long f43346n = -9223372036854775807L;

    public heg(zdg zdgVar, kq6 kq6Var) {
        this.f43336d = zdgVar;
        this.f43339g = kq6Var.buildUpon().setSampleMimeType(sva.f83047o0).setCodecs(kq6Var.f54989M).build();
    }

    private void decode() throws pl3, IOException {
        try {
            ieg iegVarDequeueInputBuffer = this.f43336d.dequeueInputBuffer();
            while (iegVarDequeueInputBuffer == null) {
                Thread.sleep(5L);
                iegVarDequeueInputBuffer = this.f43336d.dequeueInputBuffer();
            }
            iegVarDequeueInputBuffer.ensureSpaceForWrite(this.f43344l);
            iegVarDequeueInputBuffer.f82162d.put(this.f43338f.getData(), 0, this.f43344l);
            iegVarDequeueInputBuffer.f82162d.limit(this.f43344l);
            this.f43336d.queueInputBuffer(iegVarDequeueInputBuffer);
            keg kegVarDequeueOutputBuffer = this.f43336d.dequeueOutputBuffer();
            while (kegVarDequeueOutputBuffer == null) {
                Thread.sleep(5L);
                kegVarDequeueOutputBuffer = this.f43336d.dequeueOutputBuffer();
            }
            for (int i = 0; i < kegVarDequeueOutputBuffer.getEventTimeCount(); i++) {
                byte[] bArrEncode = this.f43337e.encode(kegVarDequeueOutputBuffer.getCues(kegVarDequeueOutputBuffer.getEventTime(i)));
                this.f43340h.add(Long.valueOf(kegVarDequeueOutputBuffer.getEventTime(i)));
                this.f43341i.add(new ihc(bArrEncode));
            }
            kegVarDequeueOutputBuffer.release();
        } catch (beg e) {
            throw xhc.createForMalformedContainer("SubtitleDecoder failed.", e);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    private boolean readFromInput(zj5 zj5Var) throws IOException {
        int iCapacity = this.f43338f.capacity();
        int i = this.f43344l;
        if (iCapacity == i) {
            this.f43338f.ensureCapacity(i + 1024);
        }
        int i2 = zj5Var.read(this.f43338f.getData(), this.f43344l, this.f43338f.capacity() - this.f43344l);
        if (i2 != -1) {
            this.f43344l += i2;
        }
        long length = zj5Var.getLength();
        return (length != -1 && ((long) this.f43344l) == length) || i2 == -1;
    }

    private boolean skipInput(zj5 zj5Var) throws IOException {
        return zj5Var.skip((zj5Var.getLength() > (-1L) ? 1 : (zj5Var.getLength() == (-1L) ? 0 : -1)) != 0 ? rd8.checkedCast(zj5Var.getLength()) : 1024) == -1;
    }

    private void writeToOutput() {
        u80.checkStateNotNull(this.f43343k);
        u80.checkState(this.f43340h.size() == this.f43341i.size());
        long j = this.f43346n;
        for (int iBinarySearchFloor = j == -9223372036854775807L ? 0 : x0i.binarySearchFloor((List<? extends Comparable<? super Long>>) this.f43340h, Long.valueOf(j), true, true); iBinarySearchFloor < this.f43341i.size(); iBinarySearchFloor++) {
            ihc ihcVar = this.f43341i.get(iBinarySearchFloor);
            ihcVar.setPosition(0);
            int length = ihcVar.getData().length;
            this.f43343k.sampleData(ihcVar, length);
            this.f43343k.sampleMetadata(this.f43340h.get(iBinarySearchFloor).longValue(), 1, length, 0, null);
        }
    }

    @Override // p000.yj5
    public void init(ck5 ck5Var) {
        u80.checkState(this.f43345m == 0);
        this.f43342j = ck5Var;
        this.f43343k = ck5Var.track(0, 3);
        this.f43342j.endTracks();
        this.f43342j.seekMap(new k08(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.f43343k.format(this.f43339g);
        this.f43345m = 1;
    }

    @Override // p000.yj5
    public int read(zj5 zj5Var, c5d c5dVar) throws pl3, IOException {
        int i = this.f43345m;
        u80.checkState((i == 0 || i == 5) ? false : true);
        if (this.f43345m == 1) {
            this.f43338f.reset(zj5Var.getLength() != -1 ? rd8.checkedCast(zj5Var.getLength()) : 1024);
            this.f43344l = 0;
            this.f43345m = 2;
        }
        if (this.f43345m == 2 && readFromInput(zj5Var)) {
            decode();
            writeToOutput();
            this.f43345m = 4;
        }
        if (this.f43345m == 3 && skipInput(zj5Var)) {
            writeToOutput();
            this.f43345m = 4;
        }
        return this.f43345m == 4 ? -1 : 0;
    }

    @Override // p000.yj5
    public void release() {
        if (this.f43345m == 5) {
            return;
        }
        this.f43336d.release();
        this.f43345m = 5;
    }

    @Override // p000.yj5
    public void seek(long j, long j2) {
        int i = this.f43345m;
        u80.checkState((i == 0 || i == 5) ? false : true);
        this.f43346n = j2;
        if (this.f43345m == 2) {
            this.f43345m = 1;
        }
        if (this.f43345m == 4) {
            this.f43345m = 3;
        }
    }

    @Override // p000.yj5
    public boolean sniff(zj5 zj5Var) throws IOException {
        return true;
    }
}
