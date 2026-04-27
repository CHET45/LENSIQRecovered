package p000;

import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.asi;
import p000.gdb;
import p000.ir5;
import p000.k6a;
import p000.lmg;
import p000.mmg;
import p000.nh4;
import p000.nld;
import p000.nth;
import p000.sh1;
import p000.vz7;
import p000.yri;
import p000.zi4;

/* JADX INFO: loaded from: classes5.dex */
public final class ud9 {

    /* JADX INFO: renamed from: a */
    public final nyd f87652a;

    /* JADX INFO: renamed from: ud9$a */
    public static /* synthetic */ class C13507a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f87653a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f87654b;

        static {
            int[] iArr = new int[lmg.EnumC8904c.values().length];
            f87654b = iArr;
            try {
                iArr[lmg.EnumC8904c.DOCUMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87654b[lmg.EnumC8904c.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[k6a.EnumC8215c.values().length];
            f87653a = iArr2;
            try {
                iArr2[k6a.EnumC8215c.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f87653a[k6a.EnumC8215c.NO_DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f87653a[k6a.EnumC8215c.UNKNOWN_DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public ud9(nyd nydVar) {
        this.f87652a = nydVar;
    }

    private t4b decodeDocument(nh4 nh4Var, boolean z) {
        t4b t4bVarNewFoundDocument = t4b.newFoundDocument(this.f87652a.decodeKey(nh4Var.getName()), this.f87652a.decodeVersion(nh4Var.getUpdateTime()), nkb.fromMap(nh4Var.getFieldsMap()));
        return z ? t4bVarNewFoundDocument.setHasCommittedMutations() : t4bVarNewFoundDocument;
    }

    private t4b decodeNoDocument(gdb gdbVar, boolean z) {
        t4b t4bVarNewNoDocument = t4b.newNoDocument(this.f87652a.decodeKey(gdbVar.getName()), this.f87652a.decodeVersion(gdbVar.getReadTime()));
        return z ? t4bVarNewNoDocument.setHasCommittedMutations() : t4bVarNewNoDocument;
    }

    private t4b decodeUnknownDocument(nth nthVar) {
        return t4b.newUnknownDocument(this.f87652a.decodeKey(nthVar.getName()), this.f87652a.decodeVersion(nthVar.getVersion()));
    }

    private nh4 encodeDocument(ph4 ph4Var) {
        nh4.C9874b c9874bNewBuilder = nh4.newBuilder();
        c9874bNewBuilder.setName(this.f87652a.encodeKey(ph4Var.getKey()));
        c9874bNewBuilder.putAllFields(ph4Var.getData().getFieldsMap());
        c9874bNewBuilder.setUpdateTime(this.f87652a.encodeTimestamp(ph4Var.getVersion().getTimestamp()));
        return c9874bNewBuilder.build();
    }

    private gdb encodeNoDocument(ph4 ph4Var) {
        gdb.C6261b c6261bNewBuilder = gdb.newBuilder();
        c6261bNewBuilder.setName(this.f87652a.encodeKey(ph4Var.getKey()));
        c6261bNewBuilder.setReadTime(this.f87652a.encodeTimestamp(ph4Var.getVersion().getTimestamp()));
        return c6261bNewBuilder.build();
    }

    private nth encodeUnknownDocument(ph4 ph4Var) {
        nth.C10059b c10059bNewBuilder = nth.newBuilder();
        c10059bNewBuilder.setName(this.f87652a.encodeKey(ph4Var.getKey()));
        c10059bNewBuilder.setVersion(this.f87652a.encodeTimestamp(ph4Var.getVersion().getTimestamp()));
        return c10059bNewBuilder.build();
    }

    /* JADX INFO: renamed from: a */
    public t4b m23250a(k6a k6aVar) {
        int i = C13507a.f87653a[k6aVar.getDocumentTypeCase().ordinal()];
        if (i == 1) {
            return decodeDocument(k6aVar.getDocument(), k6aVar.getHasCommittedMutations());
        }
        if (i == 2) {
            return decodeNoDocument(k6aVar.getNoDocument(), k6aVar.getHasCommittedMutations());
        }
        if (i == 3) {
            return decodeUnknownDocument(k6aVar.getUnknownDocument());
        }
        throw r80.fail("Unknown MaybeDocument %s", k6aVar);
    }

    /* JADX INFO: renamed from: b */
    public n7b m23251b(asi asiVar) {
        int batchId = asiVar.getBatchId();
        Timestamp timestampDecodeTimestamp = this.f87652a.decodeTimestamp(asiVar.getLocalWriteTime());
        int baseWritesCount = asiVar.getBaseWritesCount();
        ArrayList arrayList = new ArrayList(baseWritesCount);
        for (int i = 0; i < baseWritesCount; i++) {
            arrayList.add(this.f87652a.decodeMutation(asiVar.getBaseWrites(i)));
        }
        ArrayList arrayList2 = new ArrayList(asiVar.getWritesCount());
        int i2 = 0;
        while (i2 < asiVar.getWritesCount()) {
            yri writes = asiVar.getWrites(i2);
            int i3 = i2 + 1;
            if (i3 >= asiVar.getWritesCount() || !asiVar.getWrites(i3).hasTransform()) {
                arrayList2.add(this.f87652a.decodeMutation(writes));
            } else {
                r80.hardAssert(asiVar.getWrites(i2).hasUpdate(), "TransformMutation should be preceded by a patch or set mutation", new Object[0]);
                yri.C15790b c15790bNewBuilder = yri.newBuilder(writes);
                Iterator<zi4.C16149c> it = asiVar.getWrites(i3).getTransform().getFieldTransformsList().iterator();
                while (it.hasNext()) {
                    c15790bNewBuilder.addUpdateTransforms(it.next());
                }
                arrayList2.add(this.f87652a.decodeMutation(c15790bNewBuilder.build()));
                i2 = i3;
            }
            i2++;
        }
        return new n7b(batchId, timestampDecodeTimestamp, arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: c */
    public vmg m23252c(lmg lmgVar) {
        kmg kmgVarDecodeDocumentsTarget;
        int targetId = lmgVar.getTargetId();
        euf eufVarDecodeVersion = this.f87652a.decodeVersion(lmgVar.getSnapshotVersion());
        euf eufVarDecodeVersion2 = this.f87652a.decodeVersion(lmgVar.getLastLimboFreeSnapshotVersion());
        vj1 resumeToken = lmgVar.getResumeToken();
        long lastListenSequenceNumber = lmgVar.getLastListenSequenceNumber();
        int i = C13507a.f87654b[lmgVar.getTargetTypeCase().ordinal()];
        if (i == 1) {
            kmgVarDecodeDocumentsTarget = this.f87652a.decodeDocumentsTarget(lmgVar.getDocuments());
        } else {
            if (i != 2) {
                throw r80.fail("Unknown targetType %d", lmgVar.getTargetTypeCase());
            }
            kmgVarDecodeDocumentsTarget = this.f87652a.decodeQueryTarget(lmgVar.getQuery());
        }
        return new vmg(kmgVarDecodeDocumentsTarget, targetId, lastListenSequenceNumber, pmd.LISTEN, eufVarDecodeVersion, eufVarDecodeVersion2, resumeToken, null);
    }

    /* JADX INFO: renamed from: d */
    public k6a m23253d(ph4 ph4Var) {
        k6a.C8214b c8214bNewBuilder = k6a.newBuilder();
        if (ph4Var.isNoDocument()) {
            c8214bNewBuilder.setNoDocument(encodeNoDocument(ph4Var));
        } else if (ph4Var.isFoundDocument()) {
            c8214bNewBuilder.setDocument(encodeDocument(ph4Var));
        } else {
            if (!ph4Var.isUnknownDocument()) {
                throw r80.fail("Cannot encode invalid document %s", ph4Var);
            }
            c8214bNewBuilder.setUnknownDocument(encodeUnknownDocument(ph4Var));
        }
        c8214bNewBuilder.setHasCommittedMutations(ph4Var.hasCommittedMutations());
        return c8214bNewBuilder.build();
    }

    public th1 decodeBundledQuery(sh1 sh1Var) {
        return new th1(this.f87652a.decodeQueryTarget(sh1Var.getParent(), sh1Var.getStructuredQuery()), sh1Var.getLimitType().equals(sh1.EnumC12575c.FIRST) ? nld.EnumC9924a.LIMIT_TO_FIRST : nld.EnumC9924a.LIMIT_TO_LAST);
    }

    public List<ir5.AbstractC7573c> decodeFieldIndexSegments(vz7 vz7Var) {
        ArrayList arrayList = new ArrayList();
        for (vz7.C14308c c14308c : vz7Var.getFieldsList()) {
            arrayList.add(ir5.AbstractC7573c.create(wr5.fromServerFormat(c14308c.getFieldPath()), c14308c.getValueModeCase().equals(vz7.C14308c.d.ARRAY_CONFIG) ? ir5.AbstractC7573c.a.CONTAINS : c14308c.getOrder().equals(vz7.C14308c.c.ASCENDING) ? ir5.AbstractC7573c.a.ASCENDING : ir5.AbstractC7573c.a.DESCENDING));
        }
        return arrayList;
    }

    public m7b decodeMutation(yri yriVar) {
        return this.f87652a.decodeMutation(yriVar);
    }

    /* JADX INFO: renamed from: e */
    public asi m23254e(n7b n7bVar) {
        asi.C1599b c1599bNewBuilder = asi.newBuilder();
        c1599bNewBuilder.setBatchId(n7bVar.getBatchId());
        c1599bNewBuilder.setLocalWriteTime(this.f87652a.encodeTimestamp(n7bVar.getLocalWriteTime()));
        Iterator<m7b> it = n7bVar.getBaseMutations().iterator();
        while (it.hasNext()) {
            c1599bNewBuilder.addBaseWrites(this.f87652a.encodeMutation(it.next()));
        }
        Iterator<m7b> it2 = n7bVar.getMutations().iterator();
        while (it2.hasNext()) {
            c1599bNewBuilder.addWrites(this.f87652a.encodeMutation(it2.next()));
        }
        return c1599bNewBuilder.build();
    }

    public sh1 encodeBundledQuery(th1 th1Var) {
        mmg.C9419e c9419eEncodeQueryTarget = this.f87652a.encodeQueryTarget(th1Var.getTarget());
        sh1.C12574b c12574bNewBuilder = sh1.newBuilder();
        c12574bNewBuilder.setLimitType(th1Var.getLimitType().equals(nld.EnumC9924a.LIMIT_TO_FIRST) ? sh1.EnumC12575c.FIRST : sh1.EnumC12575c.LAST);
        c12574bNewBuilder.setParent(c9419eEncodeQueryTarget.getParent());
        c12574bNewBuilder.setStructuredQuery(c9419eEncodeQueryTarget.getStructuredQuery());
        return c12574bNewBuilder.build();
    }

    public vz7 encodeFieldIndexSegments(List<ir5.AbstractC7573c> list) {
        vz7.C14307b c14307bNewBuilder = vz7.newBuilder();
        c14307bNewBuilder.setQueryScope(vz7.EnumC14310e.COLLECTION_GROUP);
        for (ir5.AbstractC7573c abstractC7573c : list) {
            vz7.C14308c.b bVarNewBuilder = vz7.C14308c.newBuilder();
            bVarNewBuilder.setFieldPath(abstractC7573c.getFieldPath().canonicalString());
            if (abstractC7573c.getKind() == ir5.AbstractC7573c.a.CONTAINS) {
                bVarNewBuilder.setArrayConfig(vz7.C14308c.a.CONTAINS);
            } else if (abstractC7573c.getKind() == ir5.AbstractC7573c.a.ASCENDING) {
                bVarNewBuilder.setOrder(vz7.C14308c.c.ASCENDING);
            } else {
                bVarNewBuilder.setOrder(vz7.C14308c.c.DESCENDING);
            }
            c14307bNewBuilder.addFields(bVarNewBuilder);
        }
        return c14307bNewBuilder.build();
    }

    public yri encodeMutation(m7b m7bVar) {
        return this.f87652a.encodeMutation(m7bVar);
    }

    /* JADX INFO: renamed from: f */
    public lmg m23255f(vmg vmgVar) {
        pmd pmdVar = pmd.LISTEN;
        r80.hardAssert(pmdVar.equals(vmgVar.getPurpose()), "Only queries with purpose %s may be stored, got %s", pmdVar, vmgVar.getPurpose());
        lmg.C8903b c8903bNewBuilder = lmg.newBuilder();
        c8903bNewBuilder.setTargetId(vmgVar.getTargetId()).setLastListenSequenceNumber(vmgVar.getSequenceNumber()).setLastLimboFreeSnapshotVersion(this.f87652a.encodeVersion(vmgVar.getLastLimboFreeSnapshotVersion())).setSnapshotVersion(this.f87652a.encodeVersion(vmgVar.getSnapshotVersion())).setResumeToken(vmgVar.getResumeToken());
        kmg target = vmgVar.getTarget();
        if (target.isDocumentQuery()) {
            c8903bNewBuilder.setDocuments(this.f87652a.encodeDocumentsTarget(target));
        } else {
            c8903bNewBuilder.setQuery(this.f87652a.encodeQueryTarget(target));
        }
        return c8903bNewBuilder.build();
    }
}
