package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p000.eta;
import p000.srf;

/* JADX INFO: loaded from: classes3.dex */
public final class pue {

    /* JADX INFO: renamed from: d */
    public static final int f72141d = 0;

    /* JADX INFO: renamed from: e */
    public static final int f72142e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f72143f = 2;

    /* JADX INFO: renamed from: g */
    public static final int f72144g = 3;

    /* JADX INFO: renamed from: h */
    public static final int f72145h = 2192;

    /* JADX INFO: renamed from: i */
    public static final int f72146i = 2816;

    /* JADX INFO: renamed from: j */
    public static final int f72147j = 2817;

    /* JADX INFO: renamed from: k */
    public static final int f72148k = 2819;

    /* JADX INFO: renamed from: l */
    public static final int f72149l = 2820;

    /* JADX INFO: renamed from: m */
    public static final String f72150m = "SefReader";

    /* JADX INFO: renamed from: n */
    public static final int f72151n = 1397048916;

    /* JADX INFO: renamed from: o */
    public static final int f72152o = 12;

    /* JADX INFO: renamed from: p */
    public static final int f72153p = 8;

    /* JADX INFO: renamed from: q */
    public static final int f72154q = 12;

    /* JADX INFO: renamed from: r */
    public static final azf f72155r = azf.m2775on(':');

    /* JADX INFO: renamed from: s */
    public static final azf f72156s = azf.m2775on('*');

    /* JADX INFO: renamed from: a */
    public final List<C11131a> f72157a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public int f72158b = 0;

    /* JADX INFO: renamed from: c */
    public int f72159c;

    /* JADX INFO: renamed from: pue$a */
    public static final class C11131a {

        /* JADX INFO: renamed from: a */
        public final int f72160a;

        /* JADX INFO: renamed from: b */
        public final long f72161b;

        /* JADX INFO: renamed from: c */
        public final int f72162c;

        public C11131a(int i, long j, int i2) {
            this.f72160a = i;
            this.f72161b = j;
            this.f72162c = i2;
        }
    }

    private void checkForSefData(ak5 ak5Var, d5d d5dVar) throws IOException {
        jhc jhcVar = new jhc(8);
        ak5Var.readFully(jhcVar.getData(), 0, 8);
        this.f72159c = jhcVar.readLittleEndianInt() + 8;
        if (jhcVar.readInt() != 1397048916) {
            d5dVar.f28476a = 0L;
        } else {
            d5dVar.f28476a = ak5Var.getPosition() - ((long) (this.f72159c - 12));
            this.f72158b = 2;
        }
    }

    private static int nameToDataType(String str) throws yhc {
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
                throw yhc.createForMalformedContainer("Invalid SEF name", null);
        }
    }

    private void readSdrs(ak5 ak5Var, d5d d5dVar) throws IOException {
        long length = ak5Var.getLength();
        int i = this.f72159c - 20;
        jhc jhcVar = new jhc(i);
        ak5Var.readFully(jhcVar.getData(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            jhcVar.skipBytes(2);
            short littleEndianShort = jhcVar.readLittleEndianShort();
            if (littleEndianShort == 2192 || littleEndianShort == 2816 || littleEndianShort == 2817 || littleEndianShort == 2819 || littleEndianShort == 2820) {
                this.f72157a.add(new C11131a(littleEndianShort, (length - ((long) this.f72159c)) - ((long) jhcVar.readLittleEndianInt()), jhcVar.readLittleEndianInt()));
            } else {
                jhcVar.skipBytes(8);
            }
        }
        if (this.f72157a.isEmpty()) {
            d5dVar.f28476a = 0L;
        } else {
            this.f72158b = 3;
            d5dVar.f28476a = this.f72157a.get(0).f72161b;
        }
    }

    private void readSefData(ak5 ak5Var, List<eta.InterfaceC5464a> list) throws IOException {
        long position = ak5Var.getPosition();
        int length = (int) ((ak5Var.getLength() - ak5Var.getPosition()) - ((long) this.f72159c));
        jhc jhcVar = new jhc(length);
        ak5Var.readFully(jhcVar.getData(), 0, length);
        for (int i = 0; i < this.f72157a.size(); i++) {
            C11131a c11131a = this.f72157a.get(i);
            jhcVar.setPosition((int) (c11131a.f72161b - position));
            jhcVar.skipBytes(4);
            int littleEndianInt = jhcVar.readLittleEndianInt();
            int iNameToDataType = nameToDataType(jhcVar.readString(littleEndianInt));
            int i2 = c11131a.f72162c - (littleEndianInt + 8);
            if (iNameToDataType == 2192) {
                list.add(readSlowMotionData(jhcVar, i2));
            } else if (iNameToDataType != 2816 && iNameToDataType != 2817 && iNameToDataType != 2819 && iNameToDataType != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static srf readSlowMotionData(jhc jhcVar, int i) throws yhc {
        ArrayList arrayList = new ArrayList();
        List<String> listSplitToList = f72156s.splitToList(jhcVar.readString(i));
        for (int i2 = 0; i2 < listSplitToList.size(); i2++) {
            List<String> listSplitToList2 = f72155r.splitToList(listSplitToList.get(i2));
            if (listSplitToList2.size() != 3) {
                throw yhc.createForMalformedContainer(null, null);
            }
            try {
                arrayList.add(new srf.C12760a(Long.parseLong(listSplitToList2.get(0)), Long.parseLong(listSplitToList2.get(1)), 1 << (Integer.parseInt(listSplitToList2.get(2)) - 1)));
            } catch (NumberFormatException e) {
                throw yhc.createForMalformedContainer(null, e);
            }
        }
        return new srf(arrayList);
    }

    public int read(ak5 ak5Var, d5d d5dVar, List<eta.InterfaceC5464a> list) throws IOException {
        int i = this.f72158b;
        long j = 0;
        if (i == 0) {
            long length = ak5Var.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            d5dVar.f28476a = j;
            this.f72158b = 1;
        } else if (i == 1) {
            checkForSefData(ak5Var, d5dVar);
        } else if (i == 2) {
            readSdrs(ak5Var, d5dVar);
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            readSefData(ak5Var, list);
            d5dVar.f28476a = 0L;
        }
        return 1;
    }

    public void reset() {
        this.f72157a.clear();
        this.f72158b = 0;
    }
}
