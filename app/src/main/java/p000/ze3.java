package p000;

import com.google.android.exoplayer2.offline.AbstractC3062f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p000.dic;
import p000.ml1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ze3 extends AbstractC3062f<af3> {

    /* JADX INFO: renamed from: n */
    public final tu0 f104888n;

    /* JADX INFO: renamed from: ze3$a */
    public class C16102a extends nde<lz1, IOException> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ ih3 f104889C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ int f104890F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ n3e f104891H;

        public C16102a(ih3 ih3Var, int i, n3e n3eVar) {
            this.f104889C = ih3Var;
            this.f104890F = i;
            this.f104891H = n3eVar;
        }

        @Override // p000.nde
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public lz1 mo5583b() throws IOException {
            return gf3.loadChunkIndex(this.f104889C, this.f104890F, this.f104891H);
        }
    }

    public ze3(aga agaVar, ml1.C9395d c9395d) {
        this(agaVar, c9395d, new p63());
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void addSegmentsForAdaptationSet(p000.ih3 r27, p000.C8362kh r28, long r29, long r31, boolean r33, java.util.ArrayList<com.google.android.exoplayer2.offline.AbstractC3062f.c> r34) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r26 = this;
            r7 = r26
            r8 = r28
            r9 = r33
            r10 = r34
            r0 = 0
            r11 = r0
        La:
            java.util.List<n3e> r0 = r8.f54058c
            int r0 = r0.size()
            if (r11 >= r0) goto Lbd
            java.util.List<n3e> r0 = r8.f54058c
            java.lang.Object r0 = r0.get(r11)
            n3e r0 = (p000.n3e) r0
            int r1 = r8.f54057b     // Catch: java.io.IOException -> Lb2
            r12 = r27
            ff3 r13 = r7.getSegmentIndex(r12, r1, r0, r9)     // Catch: java.io.IOException -> Lae
            if (r13 == 0) goto La2
            r14 = r31
            long r16 = r13.getSegmentCount(r14)
            r1 = -1
            int r1 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r1 == 0) goto L9a
            tu0 r1 = r7.f104888n
            kx7<ru0> r2 = r0.f63196d
            ru0 r1 = r1.selectBaseUrl(r2)
            java.lang.Object r1 = p000.x0i.castNonNull(r1)
            ru0 r1 = (p000.ru0) r1
            java.lang.String r6 = r1.f79575a
            hpd r18 = r0.getInitializationUri()
            if (r18 == 0) goto L58
            r1 = r26
            r2 = r0
            r3 = r6
            r4 = r29
            r19 = r6
            r6 = r18
            com.google.android.exoplayer2.offline.f$c r1 = r1.createSegment(r2, r3, r4, r6)
            r10.add(r1)
            goto L5a
        L58:
            r19 = r6
        L5a:
            hpd r6 = r0.getIndexUri()
            if (r6 == 0) goto L6e
            r1 = r26
            r2 = r0
            r3 = r19
            r4 = r29
            com.google.android.exoplayer2.offline.f$c r1 = r1.createSegment(r2, r3, r4, r6)
            r10.add(r1)
        L6e:
            long r1 = r13.getFirstSegmentNum()
            long r16 = r1 + r16
            r20 = 1
            long r16 = r16 - r20
            r4 = r1
        L79:
            int r1 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r1 > 0) goto Lb8
            long r1 = r13.getTimeUs(r4)
            long r22 = r29 + r1
            hpd r6 = r13.getSegmentUrl(r4)
            r1 = r26
            r2 = r0
            r3 = r19
            r24 = r4
            r4 = r22
            com.google.android.exoplayer2.offline.f$c r1 = r1.createSegment(r2, r3, r4, r6)
            r10.add(r1)
            long r4 = r24 + r20
            goto L79
        L9a:
            fl4 r0 = new fl4
            java.lang.String r1 = "Unbounded segment index"
            r0.<init>(r1)
            throw r0
        La2:
            r14 = r31
            fl4 r0 = new fl4     // Catch: java.io.IOException -> Lac
            java.lang.String r1 = "Missing segment index"
            r0.<init>(r1)     // Catch: java.io.IOException -> Lac
            throw r0     // Catch: java.io.IOException -> Lac
        Lac:
            r0 = move-exception
            goto Lb6
        Lae:
            r0 = move-exception
        Laf:
            r14 = r31
            goto Lb6
        Lb2:
            r0 = move-exception
            r12 = r27
            goto Laf
        Lb6:
            if (r9 == 0) goto Lbc
        Lb8:
            int r11 = r11 + 1
            goto La
        Lbc:
            throw r0
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ze3.addSegmentsForAdaptationSet(ih3, kh, long, long, boolean, java.util.ArrayList):void");
    }

    private AbstractC3062f.c createSegment(n3e n3eVar, String str, long j, hpd hpdVar) {
        return new AbstractC3062f.c(j, gf3.buildDataSpec(n3eVar, str, hpdVar, 0, ox7.m19076of()));
    }

    @hib
    private ff3 getSegmentIndex(ih3 ih3Var, int i, n3e n3eVar, boolean z) throws InterruptedException, IOException {
        ff3 index = n3eVar.getIndex();
        if (index != null) {
            return index;
        }
        lz1 lz1Var = (lz1) m5587b(new C16102a(ih3Var, i, n3eVar), z);
        if (lz1Var == null) {
            return null;
        }
        return new hf3(lz1Var, n3eVar.f63197e);
    }

    @Override // com.google.android.exoplayer2.offline.AbstractC3062f
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public List<AbstractC3062f.c> mo5589e(ih3 ih3Var, af3 af3Var, boolean z) throws InterruptedException, IOException {
        ArrayList<AbstractC3062f.c> arrayList = new ArrayList<>();
        for (int i = 0; i < af3Var.getPeriodCount(); i++) {
            vnc period = af3Var.getPeriod(i);
            long jMsToUs = x0i.msToUs(period.f91793b);
            long periodDurationUs = af3Var.getPeriodDurationUs(i);
            int i2 = 0;
            for (List<C8362kh> list = period.f91794c; i2 < list.size(); list = list) {
                addSegmentsForAdaptationSet(ih3Var, list.get(i2), jMsToUs, periodDurationUs, z, arrayList);
                i2++;
            }
        }
        return arrayList;
    }

    public ze3(aga agaVar, ml1.C9395d c9395d, Executor executor) {
        this(agaVar, new bf3(), c9395d, executor, 20000L);
    }

    @Deprecated
    public ze3(aga agaVar, dic.InterfaceC4797a<af3> interfaceC4797a, ml1.C9395d c9395d, Executor executor) {
        this(agaVar, interfaceC4797a, c9395d, executor, 20000L);
    }

    public ze3(aga agaVar, dic.InterfaceC4797a<af3> interfaceC4797a, ml1.C9395d c9395d, Executor executor, long j) {
        super(agaVar, interfaceC4797a, c9395d, executor, j);
        this.f104888n = new tu0();
    }
}
