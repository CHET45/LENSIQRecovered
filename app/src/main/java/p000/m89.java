package p000;

import p000.kx7;

/* JADX INFO: loaded from: classes3.dex */
public final class m89 implements um0 {

    /* JADX INFO: renamed from: a */
    public final kx7<um0> f60185a;

    /* JADX INFO: renamed from: b */
    public final int f60186b;

    private m89(int i, kx7<um0> kx7Var) {
        this.f60186b = i;
        this.f60185a = kx7Var;
    }

    @hib
    private static um0 createBox(int i, int i2, jhc jhcVar) {
        switch (i) {
            case 1718776947:
                return v5g.parseFrom(i2, jhcVar);
            case 1751742049:
                return ym0.parseFrom(jhcVar);
            case 1752331379:
                return an0.parseFrom(jhcVar);
            case 1852994675:
                return b6g.parseFrom(jhcVar);
            default:
                return null;
        }
    }

    public static m89 parseFrom(int i, jhc jhcVar) {
        kx7.C8541a c8541a = new kx7.C8541a();
        int iLimit = jhcVar.limit();
        int trackType = -2;
        while (jhcVar.bytesLeft() > 8) {
            int littleEndianInt = jhcVar.readLittleEndianInt();
            int position = jhcVar.getPosition() + jhcVar.readLittleEndianInt();
            jhcVar.setLimit(position);
            um0 from = littleEndianInt == 1414744396 ? parseFrom(jhcVar.readLittleEndianInt(), jhcVar) : createBox(littleEndianInt, trackType, jhcVar);
            if (from != null) {
                if (from.getType() == 1752331379) {
                    trackType = ((an0) from).getTrackType();
                }
                c8541a.add(from);
            }
            jhcVar.setPosition(position);
            jhcVar.setLimit(iLimit);
        }
        return new m89(i, c8541a.build());
    }

    @hib
    public <T extends um0> T getChild(Class<T> cls) {
        quh<um0> it = this.f60185a.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    @Override // p000.um0
    public int getType() {
        return this.f60186b;
    }
}
