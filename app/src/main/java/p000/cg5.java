package p000;

import com.google.auto.value.AutoValue;
import p000.tk0;

/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class cg5 {

    /* JADX INFO: renamed from: cg5$a */
    @AutoValue.Builder
    public static abstract class AbstractC2303a {
        @efb
        public abstract cg5 build();

        @efb
        public abstract AbstractC2303a setClearBlob(@hib byte[] bArr);

        @efb
        public abstract AbstractC2303a setEncryptedBlob(@hib byte[] bArr);
    }

    @efb
    public static AbstractC2303a builder() {
        return new tk0.C13079b();
    }

    @hib
    public abstract byte[] getClearBlob();

    @hib
    public abstract byte[] getEncryptedBlob();
}
