package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class mj4 {

    /* JADX INFO: renamed from: a */
    public final int f61125a;

    /* JADX INFO: renamed from: b */
    public final int f61126b;

    /* JADX INFO: renamed from: c */
    public final String f61127c;

    private mj4(int i, int i2, String str) {
        this.f61125a = i;
        this.f61126b = i2;
        this.f61127c = str;
    }

    @hib
    public static mj4 parse(ihc ihcVar) {
        String str;
        ihcVar.skipBytes(2);
        int unsignedByte = ihcVar.readUnsignedByte();
        int i = unsignedByte >> 1;
        int unsignedByte2 = ((ihcVar.readUnsignedByte() >> 3) & 31) | ((unsignedByte & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(unsignedByte2 >= 10 ? "." : ".0");
        sb.append(unsignedByte2);
        return new mj4(i, unsignedByte2, sb.toString());
    }
}
