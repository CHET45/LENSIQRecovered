package p000;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/SerializedCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,718:1\n1#2:719\n*E\n"})
public final class j1f implements Externalizable {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C7717a f49360c = new C7717a(null);

    /* JADX INFO: renamed from: d */
    public static final int f49361d = 0;

    /* JADX INFO: renamed from: e */
    public static final int f49362e = 1;
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public Collection<?> f49363a;

    /* JADX INFO: renamed from: b */
    public final int f49364b;

    /* JADX INFO: renamed from: j1f$a */
    public static final class C7717a {
        public /* synthetic */ C7717a(jt3 jt3Var) {
            this();
        }

        private C7717a() {
        }
    }

    public j1f(@yfb Collection<?> collection, int i) {
        md8.checkNotNullParameter(collection, "collection");
        this.f49363a = collection;
        this.f49364b = i;
    }

    private final Object readResolve() {
        return this.f49363a;
    }

    @Override // java.io.Externalizable
    public void readExternal(@yfb ObjectInput objectInput) throws IOException {
        List listBuild;
        md8.checkNotNullParameter(objectInput, "input");
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b) + a18.f100c);
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i2 + a18.f100c);
        }
        int i3 = 0;
        if (i == 0) {
            List listCreateListBuilder = k82.createListBuilder(i2);
            while (i3 < i2) {
                listCreateListBuilder.add(objectInput.readObject());
                i3++;
            }
            listBuild = k82.build(listCreateListBuilder);
        } else {
            if (i != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i + a18.f100c);
            }
            Set setCreateSetBuilder = v6f.createSetBuilder(i2);
            while (i3 < i2) {
                setCreateSetBuilder.add(objectInput.readObject());
                i3++;
            }
            listBuild = v6f.build(setCreateSetBuilder);
        }
        this.f49363a = listBuild;
    }

    @Override // java.io.Externalizable
    public void writeExternal(@yfb ObjectOutput objectOutput) throws IOException {
        md8.checkNotNullParameter(objectOutput, "output");
        objectOutput.writeByte(this.f49364b);
        objectOutput.writeInt(this.f49363a.size());
        Iterator<?> it = this.f49363a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public j1f() {
        this(l82.emptyList(), 0);
    }
}
