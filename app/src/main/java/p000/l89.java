package p000;

import p000.kx7;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l89 implements tm0 {

    /* JADX INFO: renamed from: a */
    public final kx7<tm0> f56771a;

    /* JADX INFO: renamed from: b */
    public final int f56772b;

    private l89(int i, kx7<tm0> kx7Var) {
        this.f56772b = i;
        this.f56771a = kx7Var;
    }

    @hib
    private static tm0 createBox(int i, int i2, ihc ihcVar) {
        switch (i) {
            case 1718776947:
                return u5g.parseFrom(i2, ihcVar);
            case 1751742049:
                return xm0.parseFrom(ihcVar);
            case 1752331379:
                return zm0.parseFrom(ihcVar);
            case 1852994675:
                return a6g.parseFrom(ihcVar);
            default:
                return null;
        }
    }

    public static l89 parseFrom(int i, ihc ihcVar) {
        kx7.C8541a c8541a = new kx7.C8541a();
        int iLimit = ihcVar.limit();
        int trackType = -2;
        while (ihcVar.bytesLeft() > 8) {
            int littleEndianInt = ihcVar.readLittleEndianInt();
            int position = ihcVar.getPosition() + ihcVar.readLittleEndianInt();
            ihcVar.setLimit(position);
            tm0 from = littleEndianInt == 1414744396 ? parseFrom(ihcVar.readLittleEndianInt(), ihcVar) : createBox(littleEndianInt, trackType, ihcVar);
            if (from != null) {
                if (from.getType() == 1752331379) {
                    trackType = ((zm0) from).getTrackType();
                }
                c8541a.add(from);
            }
            ihcVar.setPosition(position);
            ihcVar.setLimit(iLimit);
        }
        return new l89(i, c8541a.build());
    }

    @hib
    public <T extends tm0> T getChild(Class<T> cls) {
        quh<tm0> it = this.f56771a.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    @Override // p000.tm0
    public int getType() {
        return this.f56772b;
    }
}
