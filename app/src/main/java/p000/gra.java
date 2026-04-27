package p000;

import android.R;

/* JADX INFO: loaded from: classes.dex */
public enum gra {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);


    /* JADX INFO: renamed from: a */
    public final int f40834a;

    /* JADX INFO: renamed from: b */
    public final int f40835b;

    /* JADX INFO: renamed from: gra$a */
    public /* synthetic */ class C6472a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f40836a;

        static {
            int[] iArr = new int[gra.values().length];
            try {
                iArr[gra.Copy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gra.Paste.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gra.Cut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[gra.SelectAll.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f40836a = iArr;
        }
    }

    gra(int i) {
        this.f40834a = i;
        this.f40835b = i;
    }

    public final int getId() {
        return this.f40834a;
    }

    public final int getOrder() {
        return this.f40835b;
    }

    public final int getTitleResource() {
        int i = C6472a.f40836a[ordinal()];
        if (i == 1) {
            return R.string.copy;
        }
        if (i == 2) {
            return R.string.paste;
        }
        if (i == 3) {
            return R.string.cut;
        }
        if (i == 4) {
            return R.string.selectAll;
        }
        throw new ceb();
    }
}
