package p000;

/* JADX INFO: loaded from: classes8.dex */
public abstract class pz2 extends ov6 {
    public pz2(o5c o5cVar) {
        super(o5cVar);
    }

    @Override // p000.ov6
    public void isValid() throws ud8 {
        if (!isFin()) {
            throw new xd8("Control frame cant have fin==false set");
        }
        if (isRSV1()) {
            throw new xd8("Control frame cant have rsv1==true set");
        }
        if (isRSV2()) {
            throw new xd8("Control frame cant have rsv2==true set");
        }
        if (isRSV3()) {
            throw new xd8("Control frame cant have rsv3==true set");
        }
    }
}
