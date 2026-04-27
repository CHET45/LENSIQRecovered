package p000;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes4.dex */
public enum lkd {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: C */
    public static final SparseArray<lkd> f57986C;

    /* JADX INFO: renamed from: a */
    public final int f57994a;

    static {
        lkd lkdVar = DEFAULT;
        lkd lkdVar2 = UNMETERED_ONLY;
        lkd lkdVar3 = UNMETERED_OR_DAILY;
        lkd lkdVar4 = FAST_IF_RADIO_AWAKE;
        lkd lkdVar5 = NEVER;
        lkd lkdVar6 = UNRECOGNIZED;
        SparseArray<lkd> sparseArray = new SparseArray<>();
        f57986C = sparseArray;
        sparseArray.put(0, lkdVar);
        sparseArray.put(1, lkdVar2);
        sparseArray.put(2, lkdVar3);
        sparseArray.put(3, lkdVar4);
        sparseArray.put(4, lkdVar5);
        sparseArray.put(-1, lkdVar6);
    }

    lkd(int i) {
        this.f57994a = i;
    }

    @hib
    public static lkd forNumber(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return UNMETERED_ONLY;
        }
        if (i == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i != 4) {
            return null;
        }
        return NEVER;
    }

    public final int getNumber() {
        return this.f57994a;
    }
}
