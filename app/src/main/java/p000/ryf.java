package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ryf extends myf {

    /* JADX INFO: renamed from: a */
    public final List<C12372c> f80112a;

    /* JADX INFO: renamed from: ryf$b */
    public static final class C12371b {

        /* JADX INFO: renamed from: a */
        public final int f80113a;

        /* JADX INFO: renamed from: b */
        public final long f80114b;

        private C12371b(int i, long j) {
            this.f80113a = i;
            this.f80114b = j;
        }
    }

    /* JADX INFO: renamed from: ryf$c */
    public static final class C12372c {

        /* JADX INFO: renamed from: a */
        public final long f80115a;

        /* JADX INFO: renamed from: b */
        public final boolean f80116b;

        /* JADX INFO: renamed from: c */
        public final boolean f80117c;

        /* JADX INFO: renamed from: d */
        public final boolean f80118d;

        /* JADX INFO: renamed from: e */
        public final long f80119e;

        /* JADX INFO: renamed from: f */
        public final List<C12371b> f80120f;

        /* JADX INFO: renamed from: g */
        public final boolean f80121g;

        /* JADX INFO: renamed from: h */
        public final long f80122h;

        /* JADX INFO: renamed from: i */
        public final int f80123i;

        /* JADX INFO: renamed from: j */
        public final int f80124j;

        /* JADX INFO: renamed from: k */
        public final int f80125k;

        private C12372c(long j, boolean z, boolean z2, boolean z3, List<C12371b> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f80115a = j;
            this.f80116b = z;
            this.f80117c = z2;
            this.f80118d = z3;
            this.f80120f = Collections.unmodifiableList(list);
            this.f80119e = j2;
            this.f80121g = z4;
            this.f80122h = j3;
            this.f80123i = i;
            this.f80124j = i2;
            this.f80125k = i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C12372c parseFromSection(jhc jhcVar) {
            ArrayList arrayList;
            boolean z;
            long j;
            boolean z2;
            long j2;
            int i;
            int i2;
            int unsignedByte;
            boolean z3;
            boolean z4;
            long unsignedInt;
            long unsignedInt2 = jhcVar.readUnsignedInt();
            boolean z5 = (jhcVar.readUnsignedByte() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z5) {
                arrayList = arrayList2;
                z = false;
                j = -9223372036854775807L;
                z2 = false;
                j2 = -9223372036854775807L;
                i = 0;
                i2 = 0;
                unsignedByte = 0;
                z3 = false;
            } else {
                int unsignedByte2 = jhcVar.readUnsignedByte();
                boolean z6 = (unsignedByte2 & 128) != 0;
                boolean z7 = (unsignedByte2 & 64) != 0;
                boolean z8 = (unsignedByte2 & 32) != 0;
                long unsignedInt3 = z7 ? jhcVar.readUnsignedInt() : -9223372036854775807L;
                if (!z7) {
                    int unsignedByte3 = jhcVar.readUnsignedByte();
                    ArrayList arrayList3 = new ArrayList(unsignedByte3);
                    for (int i3 = 0; i3 < unsignedByte3; i3++) {
                        arrayList3.add(new C12371b(jhcVar.readUnsignedByte(), jhcVar.readUnsignedInt()));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long unsignedByte4 = jhcVar.readUnsignedByte();
                    boolean z9 = (128 & unsignedByte4) != 0;
                    unsignedInt = ((((unsignedByte4 & 1) << 32) | jhcVar.readUnsignedInt()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    unsignedInt = -9223372036854775807L;
                }
                int unsignedShort = jhcVar.readUnsignedShort();
                int unsignedByte5 = jhcVar.readUnsignedByte();
                z3 = z7;
                unsignedByte = jhcVar.readUnsignedByte();
                j2 = unsignedInt;
                arrayList = arrayList2;
                long j3 = unsignedInt3;
                i = unsignedShort;
                i2 = unsignedByte5;
                j = j3;
                boolean z10 = z6;
                z2 = z4;
                z = z10;
            }
            return new C12372c(unsignedInt2, z5, z, z3, arrayList, j, z2, j2, i, i2, unsignedByte);
        }
    }

    private ryf(List<C12372c> list) {
        this.f80112a = Collections.unmodifiableList(list);
    }

    /* JADX INFO: renamed from: a */
    public static ryf m21604a(jhc jhcVar) {
        int unsignedByte = jhcVar.readUnsignedByte();
        ArrayList arrayList = new ArrayList(unsignedByte);
        for (int i = 0; i < unsignedByte; i++) {
            arrayList.add(C12372c.parseFromSection(jhcVar));
        }
        return new ryf(arrayList);
    }
}
