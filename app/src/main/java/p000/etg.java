package p000;

/* JADX INFO: loaded from: classes8.dex */
public class etg extends dg3 {
    public etg() {
        super(o5c.TEXT);
    }

    @Override // p000.dg3, p000.ov6
    public void isValid() throws ud8 {
        super.isValid();
        if (!ww1.isValidUTF8(getPayloadData())) {
            throw new ud8(1007, "Received text is no valid utf8 string!");
        }
    }
}
