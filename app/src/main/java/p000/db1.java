package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class db1 extends nfc {
    @Override // p000.nfc
    public List<v5d> getValueSources(mfc mfcVar) {
        return Arrays.asList(v5d.forValue("true", Boolean.TRUE), v5d.forValue("false", Boolean.FALSE));
    }
}
