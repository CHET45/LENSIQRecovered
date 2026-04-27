package p000;

import androidx.media3.common.C1213a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p000.peg;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class geg implements xj5 {

    /* JADX INFO: renamed from: o */
    public static final int f39628o = 0;

    /* JADX INFO: renamed from: p */
    public static final int f39629p = 0;

    /* JADX INFO: renamed from: q */
    public static final int f39630q = 1;

    /* JADX INFO: renamed from: r */
    public static final int f39631r = 2;

    /* JADX INFO: renamed from: s */
    public static final int f39632s = 3;

    /* JADX INFO: renamed from: t */
    public static final int f39633t = 4;

    /* JADX INFO: renamed from: u */
    public static final int f39634u = 5;

    /* JADX INFO: renamed from: v */
    public static final int f39635v = 1024;

    /* JADX INFO: renamed from: d */
    public final peg f39636d;

    /* JADX INFO: renamed from: f */
    @hib
    public final C1213a f39638f;

    /* JADX INFO: renamed from: g */
    public final List<C6277b> f39639g;

    /* JADX INFO: renamed from: j */
    public q6h f39642j;

    /* JADX INFO: renamed from: k */
    public int f39643k;

    /* JADX INFO: renamed from: l */
    public int f39644l;

    /* JADX INFO: renamed from: m */
    public long[] f39645m;

    /* JADX INFO: renamed from: n */
    public long f39646n;

    /* JADX INFO: renamed from: e */
    public final t93 f39637e = new t93();

    /* JADX INFO: renamed from: i */
    public byte[] f39641i = t0i.f83321f;

    /* JADX INFO: renamed from: h */
    public final jhc f39640h = new jhc();

    /* JADX INFO: renamed from: geg$b */
    public static class C6277b implements Comparable<C6277b> {

        /* JADX INFO: renamed from: a */
        public final long f39647a;

        /* JADX INFO: renamed from: b */
        public final byte[] f39648b;

        private C6277b(long j, byte[] bArr) {
            this.f39647a = j;
            this.f39648b = bArr;
        }

        @Override // java.lang.Comparable
        public int compareTo(C6277b c6277b) {
            return Long.compare(this.f39647a, c6277b.f39647a);
        }
    }

    public geg(peg pegVar, @hib C1213a c1213a) {
        this.f39636d = pegVar;
        this.f39638f = c1213a != null ? c1213a.buildUpon().setSampleMimeType(rva.f79794T0).setCodecs(c1213a.f8291o).setCueReplacementBehavior(pegVar.getCueReplacementBehavior()).build() : null;
        this.f39639g = new ArrayList();
        this.f39644l = 0;
        this.f39645m = t0i.f83322g;
        this.f39646n = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$parseAndWriteToOutput$0(ba3 ba3Var) {
        C6277b c6277b = new C6277b(ba3Var.f13112b, this.f39637e.encode(ba3Var.f13111a, ba3Var.f13113c));
        this.f39639g.add(c6277b);
        long j = this.f39646n;
        if (j == -9223372036854775807L || ba3Var.f13114d >= j) {
            writeToOutput(c6277b);
        }
    }

    private void parseAndWriteToOutput() throws IOException {
        try {
            long j = this.f39646n;
            this.f39636d.parse(this.f39641i, 0, this.f39643k, j != -9223372036854775807L ? peg.C10937b.cuesAfterThenRemainingCuesBefore(j) : peg.C10937b.allCues(), new qu2() { // from class: feg
                @Override // p000.qu2
                public final void accept(Object obj) {
                    this.f36321a.lambda$parseAndWriteToOutput$0((ba3) obj);
                }
            });
            Collections.sort(this.f39639g);
            this.f39645m = new long[this.f39639g.size()];
            for (int i = 0; i < this.f39639g.size(); i++) {
                this.f39645m[i] = this.f39639g.get(i).f39647a;
            }
            this.f39641i = t0i.f83321f;
        } catch (RuntimeException e) {
            throw yhc.createForMalformedContainer("SubtitleParser failed.", e);
        }
    }

    private boolean readFromInput(ak5 ak5Var) throws IOException {
        byte[] bArr = this.f39641i;
        if (bArr.length == this.f39643k) {
            this.f39641i = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.f39641i;
        int i = this.f39643k;
        int i2 = ak5Var.read(bArr2, i, bArr2.length - i);
        if (i2 != -1) {
            this.f39643k += i2;
        }
        long length = ak5Var.getLength();
        return (length != -1 && ((long) this.f39643k) == length) || i2 == -1;
    }

    private boolean skipInput(ak5 ak5Var) throws IOException {
        return ak5Var.skip((ak5Var.getLength() > (-1L) ? 1 : (ak5Var.getLength() == (-1L) ? 0 : -1)) != 0 ? rd8.checkedCast(ak5Var.getLength()) : 1024) == -1;
    }

    private void writeToOutput() {
        long j = this.f39646n;
        for (int iBinarySearchFloor = j == -9223372036854775807L ? 0 : t0i.binarySearchFloor(this.f39645m, j, true, true); iBinarySearchFloor < this.f39639g.size(); iBinarySearchFloor++) {
            writeToOutput(this.f39639g.get(iBinarySearchFloor));
        }
    }

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        v80.checkState(this.f39644l == 0);
        q6h q6hVarTrack = bk5Var.track(0, 3);
        this.f39642j = q6hVarTrack;
        C1213a c1213a = this.f39638f;
        if (c1213a != null) {
            q6hVarTrack.format(c1213a);
            bk5Var.endTracks();
            bk5Var.seekMap(new l08(new long[]{0}, new long[]{0}, -9223372036854775807L));
        }
        this.f39644l = 1;
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        int i = this.f39644l;
        v80.checkState((i == 0 || i == 5) ? false : true);
        if (this.f39644l == 1) {
            int iCheckedCast = ak5Var.getLength() != -1 ? rd8.checkedCast(ak5Var.getLength()) : 1024;
            if (iCheckedCast > this.f39641i.length) {
                this.f39641i = new byte[iCheckedCast];
            }
            this.f39643k = 0;
            this.f39644l = 2;
        }
        if (this.f39644l == 2 && readFromInput(ak5Var)) {
            parseAndWriteToOutput();
            this.f39644l = 4;
        }
        if (this.f39644l == 3 && skipInput(ak5Var)) {
            writeToOutput();
            this.f39644l = 4;
        }
        return this.f39644l == 4 ? -1 : 0;
    }

    @Override // p000.xj5
    public void release() {
        if (this.f39644l == 5) {
            return;
        }
        this.f39636d.reset();
        this.f39644l = 5;
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        int i = this.f39644l;
        v80.checkState((i == 0 || i == 5) ? false : true);
        this.f39646n = j2;
        if (this.f39644l == 2) {
            this.f39644l = 1;
        }
        if (this.f39644l == 4) {
            this.f39644l = 3;
        }
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        return true;
    }

    private void writeToOutput(C6277b c6277b) {
        v80.checkStateNotNull(this.f39642j);
        int length = c6277b.f39648b.length;
        this.f39640h.reset(c6277b.f39648b);
        this.f39642j.sampleData(this.f39640h, length);
        this.f39642j.sampleMetadata(c6277b.f39647a, 1, length, 0, null);
    }
}
