package p000;

import java.util.Arrays;
import p000.xag;

/* JADX INFO: loaded from: classes7.dex */
public final class em8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public Object[] f33473a = new Object[8];

    /* JADX INFO: renamed from: b */
    @yfb
    public int[] f33474b;

    /* JADX INFO: renamed from: c */
    public int f33475c;

    /* JADX INFO: renamed from: em8$a */
    public static final class C5384a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C5384a f33476a = new C5384a();

        private C5384a() {
        }
    }

    public em8() {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.f33474b = iArr;
        this.f33475c = -1;
    }

    private final String prettyString(Object obj) {
        String serialName;
        f0f f0fVar = obj instanceof f0f ? (f0f) obj : null;
        return (f0fVar == null || (serialName = f0fVar.getSerialName()) == null) ? String.valueOf(obj) : serialName;
    }

    private final void resize() {
        int i = this.f33475c * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.f33473a, i);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        this.f33473a = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.f33474b, i);
        md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        this.f33474b = iArrCopyOf;
    }

    @yfb
    public final String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i = this.f33475c + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.f33473a[i2];
            if (obj instanceof f0f) {
                f0f f0fVar = (f0f) obj;
                if (!md8.areEqual(f0fVar.getKind(), xag.C15018b.f97388a)) {
                    int i3 = this.f33474b[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(f0fVar.getElementName(i3));
                    }
                } else if (this.f33474b[i2] != -1) {
                    sb.append("[");
                    sb.append(this.f33474b[i2]);
                    sb.append("]");
                }
            } else if (obj != C5384a.f33476a) {
                sb.append("[");
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append("]");
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void popDescriptor() {
        int i = this.f33475c;
        int[] iArr = this.f33474b;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            this.f33475c = i - 1;
        }
        int i2 = this.f33475c;
        if (i2 != -1) {
            this.f33475c = i2 - 1;
        }
    }

    public final void pushDescriptor(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "sd");
        int i = this.f33475c + 1;
        this.f33475c = i;
        if (i == this.f33473a.length) {
            resize();
        }
        this.f33473a[i] = f0fVar;
    }

    public final void resetCurrentMapKey() {
        int[] iArr = this.f33474b;
        int i = this.f33475c;
        if (iArr[i] == -2) {
            this.f33473a[i] = C5384a.f33476a;
        }
    }

    @yfb
    public String toString() {
        return getPath();
    }

    public final void updateCurrentMapKey(@gib Object obj) {
        int[] iArr = this.f33474b;
        int i = this.f33475c;
        if (iArr[i] != -2) {
            int i2 = i + 1;
            this.f33475c = i2;
            if (i2 == this.f33473a.length) {
                resize();
            }
        }
        Object[] objArr = this.f33473a;
        int i3 = this.f33475c;
        objArr[i3] = obj;
        this.f33474b[i3] = -2;
    }

    public final void updateDescriptorIndex(int i) {
        this.f33474b[this.f33475c] = i;
    }
}
