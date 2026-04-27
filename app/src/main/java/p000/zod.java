package p000;

import android.os.SystemClock;
import java.util.List;
import java.util.Random;
import p000.l7h;
import p000.pf5;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class zod extends ou0 {

    /* JADX INFO: renamed from: j */
    public final Random f105619j;

    /* JADX INFO: renamed from: k */
    public int f105620k;

    public zod(g6h g6hVar, int[] iArr, int i, Random random) {
        super(g6hVar, iArr, i);
        this.f105619j = random;
        this.f105620k = random.nextInt(this.f68742d);
    }

    @Override // p000.pf5
    public int getSelectedIndex() {
        return this.f105620k;
    }

    @Override // p000.pf5
    @hib
    public Object getSelectionData() {
        return null;
    }

    @Override // p000.pf5
    public int getSelectionReason() {
        return 3;
    }

    @Override // p000.pf5
    public void updateSelectedTrack(long j, long j2, long j3, List<? extends xca> list, ada[] adaVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = 0;
        for (int i2 = 0; i2 < this.f68742d; i2++) {
            if (!isTrackExcluded(i2, jElapsedRealtime)) {
                i++;
            }
        }
        this.f105620k = this.f105619j.nextInt(i);
        if (i != this.f68742d) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.f68742d; i4++) {
                if (!isTrackExcluded(i4, jElapsedRealtime)) {
                    int i5 = i3 + 1;
                    if (this.f105620k == i3) {
                        this.f105620k = i4;
                        return;
                    }
                    i3 = i5;
                }
            }
        }
    }

    /* JADX INFO: renamed from: zod$a */
    public static final class C16203a implements pf5.InterfaceC10941b {

        /* JADX INFO: renamed from: a */
        public final Random f105621a;

        public C16203a() {
            this.f105621a = new Random();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ pf5 lambda$createTrackSelections$0(pf5.C10940a c10940a) {
            return new zod(c10940a.f70594a, c10940a.f70595b, c10940a.f70596c, this.f105621a);
        }

        @Override // p000.pf5.InterfaceC10941b
        public pf5[] createTrackSelections(pf5.C10940a[] c10940aArr, vp0 vp0Var, vna.C14175b c14175b, t1h t1hVar) {
            return l7h.createTrackSelectionsForDefinitions(c10940aArr, new l7h.InterfaceC8708a() { // from class: wod
                @Override // p000.l7h.InterfaceC8708a
                public final pf5 createAdaptiveTrackSelection(pf5.C10940a c10940a) {
                    return this.f94970a.lambda$createTrackSelections$0(c10940a);
                }
            });
        }

        public C16203a(int i) {
            this.f105621a = new Random(i);
        }
    }
}
