package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class nj4 {

    /* JADX INFO: renamed from: a */
    public final int f64746a;

    /* JADX INFO: renamed from: b */
    public final int f64747b;

    /* JADX INFO: renamed from: c */
    public final String f64748c;

    private nj4(int i, int i2, String str) {
        this.f64746a = i;
        this.f64747b = i2;
        this.f64748c = str;
    }

    @hib
    public static nj4 parse(jhc jhcVar) {
        String str;
        jhcVar.skipBytes(2);
        int unsignedByte = jhcVar.readUnsignedByte();
        int i = unsignedByte >> 1;
        int unsignedByte2 = ((jhcVar.readUnsignedByte() >> 3) & 31) | ((unsignedByte & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i < 10 ? ".0" : ".");
        sb.append(i);
        sb.append(unsignedByte2 < 10 ? ".0" : ".");
        sb.append(unsignedByte2);
        return new nj4(i, unsignedByte2, sb.toString());
    }
}
