package p000;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class l1f implements Externalizable {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C8575a f55942b = new C8575a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public Map<?, ?> f55943a;

    /* JADX INFO: renamed from: l1f$a */
    public static final class C8575a {
        public /* synthetic */ C8575a(jt3 jt3Var) {
            this();
        }

        private C8575a() {
        }
    }

    public l1f(@yfb Map<?, ?> map) {
        md8.checkNotNullParameter(map, "map");
        this.f55943a = map;
    }

    private final Object readResolve() {
        return this.f55943a;
    }

    @Override // java.io.Externalizable
    public void readExternal(@yfb ObjectInput objectInput) throws IOException {
        md8.checkNotNullParameter(objectInput, "input");
        byte b = objectInput.readByte();
        if (b != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b));
        }
        int i = objectInput.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Illegal size value: " + i + a18.f100c);
        }
        Map mapCreateMapBuilder = wt9.createMapBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            mapCreateMapBuilder.put(objectInput.readObject(), objectInput.readObject());
        }
        this.f55943a = wt9.build(mapCreateMapBuilder);
    }

    @Override // java.io.Externalizable
    public void writeExternal(@yfb ObjectOutput objectOutput) throws IOException {
        md8.checkNotNullParameter(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.f55943a.size());
        for (Map.Entry<?, ?> entry : this.f55943a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }

    public l1f() {
        this(xt9.emptyMap());
    }
}
