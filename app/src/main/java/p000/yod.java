package p000;

import android.os.SystemClock;
import java.util.List;
import java.util.Random;
import p000.k7h;
import p000.of5;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class yod extends pu0 {

    /* JADX INFO: renamed from: k */
    public final Random f102430k;

    /* JADX INFO: renamed from: l */
    public int f102431l;

    public yod(h6h h6hVar, int[] iArr, int i, Random random) {
        super(h6hVar, iArr, i);
        this.f102430k = random;
        this.f102431l = random.nextInt(this.f72063d);
    }

    @Override // p000.of5
    public int getSelectedIndex() {
        return this.f102431l;
    }

    @Override // p000.of5
    @hib
    public Object getSelectionData() {
        return null;
    }

    @Override // p000.of5
    public int getSelectionReason() {
        return 3;
    }

    @Override // p000.of5
    public void updateSelectedTrack(long j, long j2, long j3, List<? extends yca> list, zca[] zcaVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = 0;
        for (int i2 = 0; i2 < this.f72063d; i2++) {
            if (!isTrackExcluded(i2, jElapsedRealtime)) {
                i++;
            }
        }
        this.f102431l = this.f102430k.nextInt(i);
        if (i != this.f72063d) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.f72063d; i4++) {
                if (!isTrackExcluded(i4, jElapsedRealtime)) {
                    int i5 = i3 + 1;
                    if (this.f102431l == i3) {
                        this.f102431l = i4;
                        return;
                    }
                    i3 = i5;
                }
            }
        }
    }

    /* JADX INFO: renamed from: yod$a */
    public static final class C15746a implements of5.InterfaceC10356b {

        /* JADX INFO: renamed from: a */
        public final Random f102432a;

        public C15746a() {
            this.f102432a = new Random();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ of5 lambda$createTrackSelections$0(of5.C10355a c10355a) {
            return new yod(c10355a.f67489a, c10355a.f67490b, c10355a.f67491c, this.f102432a);
        }

        @Override // p000.of5.InterfaceC10356b
        public of5[] createTrackSelections(of5.C10355a[] c10355aArr, up0 up0Var, una.C13612b c13612b, q1h q1hVar) {
            return k7h.createTrackSelectionsForDefinitions(c10355aArr, new k7h.InterfaceC8224a() { // from class: xod
                @Override // p000.k7h.InterfaceC8224a
                public final of5 createAdaptiveTrackSelection(of5.C10355a c10355a) {
                    return this.f98828a.lambda$createTrackSelections$0(c10355a);
                }
            });
        }

        public C15746a(int i) {
            this.f102432a = new Random(i);
        }
    }
}
