package p000;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class que {

    /* JADX INFO: renamed from: d */
    public static final int f75830d = 0;

    /* JADX INFO: renamed from: e */
    public static final int f75831e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f75832f = 2;

    /* JADX INFO: renamed from: g */
    public static final int f75833g = 3;

    /* JADX INFO: renamed from: h */
    public static final int f75834h = 2192;

    /* JADX INFO: renamed from: i */
    public static final int f75835i = 2816;

    /* JADX INFO: renamed from: j */
    public static final int f75836j = 2817;

    /* JADX INFO: renamed from: k */
    public static final int f75837k = 2819;

    /* JADX INFO: renamed from: l */
    public static final int f75838l = 2820;

    /* JADX INFO: renamed from: m */
    public static final String f75839m = "SefReader";

    /* JADX INFO: renamed from: n */
    public static final int f75840n = 1397048916;

    /* JADX INFO: renamed from: o */
    public static final int f75841o = 12;

    /* JADX INFO: renamed from: p */
    public static final int f75842p = 8;

    /* JADX INFO: renamed from: q */
    public static final int f75843q = 12;

    /* JADX INFO: renamed from: r */
    public static final azf f75844r = azf.m2775on(':');

    /* JADX INFO: renamed from: s */
    public static final azf f75845s = azf.m2775on('*');

    /* JADX INFO: renamed from: a */
    public final List<C11706a> f75846a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public int f75847b = 0;

    /* JADX INFO: renamed from: c */
    public int f75848c;

    /* JADX INFO: renamed from: que$a */
    public static final class C11706a {

        /* JADX INFO: renamed from: a */
        public final int f75849a;

        /* JADX INFO: renamed from: b */
        public final long f75850b;

        /* JADX INFO: renamed from: c */
        public final int f75851c;

        public C11706a(int i, long j, int i2) {
            this.f75849a = i;
            this.f75850b = j;
            this.f75851c = i2;
        }
    }

    private void checkForSefData(zj5 zj5Var, c5d c5dVar) throws IOException {
        ihc ihcVar = new ihc(8);
        zj5Var.readFully(ihcVar.getData(), 0, 8);
        this.f75848c = ihcVar.readLittleEndianInt() + 8;
        if (ihcVar.readInt() != 1397048916) {
            c5dVar.f15813a = 0L;
        } else {
            c5dVar.f15813a = zj5Var.getPosition() - ((long) (this.f75848c - 12));
            this.f75847b = 2;
        }
    }

    private static int nameToDataType(String str) throws xhc {
        str.hashCode();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw xhc.createForMalformedContainer("Invalid SEF name", null);
        }
    }

    private void readSdrs(zj5 zj5Var, c5d c5dVar) throws IOException {
        long length = zj5Var.getLength();
        int i = this.f75848c - 20;
        ihc ihcVar = new ihc(i);
        zj5Var.readFully(ihcVar.getData(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            ihcVar.skipBytes(2);
            short littleEndianShort = ihcVar.readLittleEndianShort();
            if (littleEndianShort == 2192 || littleEndianShort == 2816 || littleEndianShort == 2817 || littleEndianShort == 2819 || littleEndianShort == 2820) {
                this.f75846a.add(new C11706a(littleEndianShort, (length - ((long) this.f75848c)) - ((long) ihcVar.readLittleEndianInt()), ihcVar.readLittleEndianInt()));
            } else {
                ihcVar.skipBytes(8);
            }
        }
        if (this.f75846a.isEmpty()) {
            c5dVar.f15813a = 0L;
        } else {
            this.f75847b = 3;
            c5dVar.f15813a = this.f75846a.get(0).f75850b;
        }
    }

    private void readSefData(zj5 zj5Var, List<Metadata.Entry> list) throws IOException {
        long position = zj5Var.getPosition();
        int length = (int) ((zj5Var.getLength() - zj5Var.getPosition()) - ((long) this.f75848c));
        ihc ihcVar = new ihc(length);
        zj5Var.readFully(ihcVar.getData(), 0, length);
        for (int i = 0; i < this.f75846a.size(); i++) {
            C11706a c11706a = this.f75846a.get(i);
            ihcVar.setPosition((int) (c11706a.f75850b - position));
            ihcVar.skipBytes(4);
            int littleEndianInt = ihcVar.readLittleEndianInt();
            int iNameToDataType = nameToDataType(ihcVar.readString(littleEndianInt));
            int i2 = c11706a.f75851c - (littleEndianInt + 8);
            if (iNameToDataType == 2192) {
                list.add(readSlowMotionData(ihcVar, i2));
            } else if (iNameToDataType != 2816 && iNameToDataType != 2817 && iNameToDataType != 2819 && iNameToDataType != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static SlowMotionData readSlowMotionData(ihc ihcVar, int i) throws xhc {
        ArrayList arrayList = new ArrayList();
        List<String> listSplitToList = f75845s.splitToList(ihcVar.readString(i));
        for (int i2 = 0; i2 < listSplitToList.size(); i2++) {
            List<String> listSplitToList2 = f75844r.splitToList(listSplitToList.get(i2));
            if (listSplitToList2.size() != 3) {
                throw xhc.createForMalformedContainer(null, null);
            }
            try {
                arrayList.add(new SlowMotionData.Segment(Long.parseLong(listSplitToList2.get(0)), Long.parseLong(listSplitToList2.get(1)), 1 << (Integer.parseInt(listSplitToList2.get(2)) - 1)));
            } catch (NumberFormatException e) {
                throw xhc.createForMalformedContainer(null, e);
            }
        }
        return new SlowMotionData(arrayList);
    }

    public int read(zj5 zj5Var, c5d c5dVar, List<Metadata.Entry> list) throws IOException {
        int i = this.f75847b;
        long j = 0;
        if (i == 0) {
            long length = zj5Var.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            c5dVar.f15813a = j;
            this.f75847b = 1;
        } else if (i == 1) {
            checkForSefData(zj5Var, c5dVar);
        } else if (i == 2) {
            readSdrs(zj5Var, c5dVar);
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            readSefData(zj5Var, list);
            c5dVar.f15813a = 0L;
        }
        return 1;
    }

    public void reset() {
        this.f75846a.clear();
        this.f75847b = 0;
    }
}
