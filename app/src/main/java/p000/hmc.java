package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,4582:1\n33#2,7:4583\n408#3,3:4590\n354#3,6:4593\n364#3,3:4600\n367#3,2:4604\n412#3,2:4606\n370#3,6:4608\n414#3:4614\n408#3,3:4615\n354#3,6:4618\n364#3,3:4625\n367#3,2:4629\n412#3,2:4631\n370#3,6:4633\n414#3:4639\n408#3,3:4640\n354#3,6:4643\n364#3,3:4650\n367#3,2:4654\n412#3,2:4656\n370#3,6:4658\n414#3:4664\n408#3,3:4665\n354#3,6:4668\n364#3,3:4675\n367#3,2:4679\n412#3,2:4681\n370#3,6:4683\n414#3:4689\n408#3,3:4690\n354#3,6:4693\n364#3,3:4700\n367#3,2:4704\n412#3,2:4706\n370#3,6:4708\n414#3:4714\n1810#4:4599\n1672#4:4603\n1810#4:4624\n1672#4:4628\n1810#4:4649\n1672#4:4653\n1810#4:4674\n1672#4:4678\n1810#4:4699\n1672#4:4703\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n*L\n124#1:4583,7\n171#1:4590,3\n171#1:4593,6\n171#1:4600,3\n171#1:4604,2\n171#1:4606,2\n171#1:4608,6\n171#1:4614\n177#1:4615,3\n177#1:4618,6\n177#1:4625,3\n177#1:4629,2\n177#1:4631,2\n177#1:4633,6\n177#1:4639\n187#1:4640,3\n187#1:4643,6\n187#1:4650,3\n187#1:4654,2\n187#1:4656,2\n187#1:4658,6\n187#1:4664\n193#1:4665,3\n193#1:4668,6\n193#1:4675,3\n193#1:4679,2\n193#1:4681,2\n193#1:4683,6\n193#1:4689\n213#1:4690,3\n213#1:4693,6\n213#1:4700,3\n213#1:4704,2\n213#1:4706,2\n213#1:4708,6\n213#1:4714\n171#1:4599\n171#1:4603\n177#1:4624\n177#1:4628\n187#1:4649\n187#1:4653\n193#1:4674\n193#1:4678\n213#1:4699\n213#1:4703\n*E\n"})
public final class hmc {

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<wq8> f44134a;

    /* JADX INFO: renamed from: b */
    public final int f44135b;

    /* JADX INFO: renamed from: c */
    public int f44136c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final List<wq8> f44137d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final i5b<nb7> f44138e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final fx8 f44139f;

    /* JADX INFO: renamed from: hmc$a */
    public static final class C6910a extends tt8 implements ny6<t6b<Object, wq8>> {
        public C6910a() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ t6b<Object, wq8> invoke() {
            return t6b.m32374boximpl(m30054invokeSAeQiB4());
        }

        @yfb
        /* JADX INFO: renamed from: invoke-SAeQiB4, reason: not valid java name */
        public final s6b<Object, Object> m30054invokeSAeQiB4() {
            s6b<Object, Object> s6bVarMultiMap = gm2.multiMap(hmc.this.getKeyInfos().size());
            hmc hmcVar = hmc.this;
            int size = hmcVar.getKeyInfos().size();
            for (int i = 0; i < size; i++) {
                wq8 wq8Var = hmcVar.getKeyInfos().get(i);
                t6b.m32380putimpl(s6bVarMultiMap, gm2.getJoinedKey(wq8Var), wq8Var);
            }
            return s6bVarMultiMap;
        }
    }

    public hmc(@yfb List<wq8> list, int i) {
        this.f44134a = list;
        this.f44135b = i;
        if (!(i >= 0)) {
            a8d.throwIllegalArgumentException("Invalid start index");
        }
        this.f44137d = new ArrayList();
        i5b<nb7> i5bVar = new i5b<>(0, 1, null);
        int size = list.size();
        int nodes = 0;
        for (int i2 = 0; i2 < size; i2++) {
            wq8 wq8Var = this.f44134a.get(i2);
            i5bVar.set(wq8Var.getLocation(), new nb7(i2, nodes, wq8Var.getNodes()));
            nodes += wq8Var.getNodes();
        }
        this.f44138e = i5bVar;
        this.f44139f = hz8.lazy(new C6910a());
    }

    public final int getGroupIndex() {
        return this.f44136c;
    }

    @yfb
    public final List<wq8> getKeyInfos() {
        return this.f44134a;
    }

    @yfb
    /* JADX INFO: renamed from: getKeyMap-SAeQiB4, reason: not valid java name */
    public final s6b<Object, Object> m30053getKeyMapSAeQiB4() {
        return ((t6b) this.f44139f.getValue()).m32382unboximpl();
    }

    @gib
    public final wq8 getNext(int i, @gib Object obj) {
        return (wq8) t6b.m32379popimpl(m30053getKeyMapSAeQiB4(), obj != null ? new wj8(Integer.valueOf(i), obj) : Integer.valueOf(i));
    }

    public final int getStartIndex() {
        return this.f44135b;
    }

    @yfb
    public final List<wq8> getUsed() {
        return this.f44137d;
    }

    public final int nodePositionOf(@yfb wq8 wq8Var) {
        nb7 nb7Var = this.f44138e.get(wq8Var.getLocation());
        if (nb7Var != null) {
            return nb7Var.getNodeIndex();
        }
        return -1;
    }

    public final boolean recordUsed(@yfb wq8 wq8Var) {
        return this.f44137d.add(wq8Var);
    }

    public final void registerInsert(@yfb wq8 wq8Var, int i) {
        this.f44138e.set(wq8Var.getLocation(), new nb7(-1, i, 0));
    }

    public final void registerMoveNode(int i, int i2, int i3) {
        char c = 7;
        long j = -9187201950435737472L;
        if (i > i2) {
            i5b<nb7> i5bVar = this.f44138e;
            Object[] objArr = i5bVar.f100490c;
            long[] jArr = i5bVar.f100488a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i4 = 0;
            while (true) {
                long j2 = jArr[i4];
                if ((((~j2) << 7) & j2 & j) != j) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j2 & 255) < 128) {
                            nb7 nb7Var = (nb7) objArr[(i4 << 3) + i6];
                            int nodeIndex = nb7Var.getNodeIndex();
                            if (i <= nodeIndex && nodeIndex < i + i3) {
                                nb7Var.setNodeIndex((nodeIndex - i) + i2);
                            } else if (i2 <= nodeIndex && nodeIndex < i) {
                                nb7Var.setNodeIndex(nodeIndex + i3);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i5 != 8) {
                        return;
                    }
                }
                if (i4 == length) {
                    return;
                }
                i4++;
                j = -9187201950435737472L;
            }
        } else {
            if (i2 <= i) {
                return;
            }
            i5b<nb7> i5bVar2 = this.f44138e;
            Object[] objArr2 = i5bVar2.f100490c;
            long[] jArr2 = i5bVar2.f100488a;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i7 = 0;
            while (true) {
                long j3 = jArr2[i7];
                if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((j3 & 255) < 128) {
                            nb7 nb7Var2 = (nb7) objArr2[(i7 << 3) + i9];
                            int nodeIndex2 = nb7Var2.getNodeIndex();
                            if (i <= nodeIndex2 && nodeIndex2 < i + i3) {
                                nb7Var2.setNodeIndex((nodeIndex2 - i) + i2);
                            } else if (i + 1 <= nodeIndex2 && nodeIndex2 < i2) {
                                nb7Var2.setNodeIndex(nodeIndex2 - i3);
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i8 != 8) {
                        return;
                    }
                }
                if (i7 == length2) {
                    return;
                }
                i7++;
                c = 7;
            }
        }
    }

    public final void registerMoveSlot(int i, int i2) {
        char c = 7;
        long j = -9187201950435737472L;
        if (i > i2) {
            i5b<nb7> i5bVar = this.f44138e;
            Object[] objArr = i5bVar.f100490c;
            long[] jArr = i5bVar.f100488a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & j) != j) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((j2 & 255) < 128) {
                            nb7 nb7Var = (nb7) objArr[(i3 << 3) + i5];
                            int slotIndex = nb7Var.getSlotIndex();
                            if (slotIndex == i) {
                                nb7Var.setSlotIndex(i2);
                            } else if (i2 <= slotIndex && slotIndex < i) {
                                nb7Var.setSlotIndex(slotIndex + 1);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        return;
                    }
                }
                if (i3 == length) {
                    return;
                }
                i3++;
                j = -9187201950435737472L;
            }
        } else {
            if (i2 <= i) {
                return;
            }
            i5b<nb7> i5bVar2 = this.f44138e;
            Object[] objArr2 = i5bVar2.f100490c;
            long[] jArr2 = i5bVar2.f100488a;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i6 = 0;
            while (true) {
                long j3 = jArr2[i6];
                if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length2)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((j3 & 255) < 128) {
                            nb7 nb7Var2 = (nb7) objArr2[(i6 << 3) + i8];
                            int slotIndex2 = nb7Var2.getSlotIndex();
                            if (slotIndex2 == i) {
                                nb7Var2.setSlotIndex(i2);
                            } else if (i + 1 <= slotIndex2 && slotIndex2 < i2) {
                                nb7Var2.setSlotIndex(slotIndex2 - 1);
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i7 != 8) {
                        return;
                    }
                }
                if (i6 == length2) {
                    return;
                }
                i6++;
                c = 7;
            }
        }
    }

    public final void setGroupIndex(int i) {
        this.f44136c = i;
    }

    public final int slotPositionOf(@yfb wq8 wq8Var) {
        nb7 nb7Var = this.f44138e.get(wq8Var.getLocation());
        if (nb7Var != null) {
            return nb7Var.getSlotIndex();
        }
        return -1;
    }

    public final boolean updateNodeCount(int i, int i2) {
        int nodeIndex;
        nb7 nb7Var = this.f44138e.get(i);
        if (nb7Var == null) {
            return false;
        }
        int nodeIndex2 = nb7Var.getNodeIndex();
        int nodeCount = i2 - nb7Var.getNodeCount();
        nb7Var.setNodeCount(i2);
        if (nodeCount == 0) {
            return true;
        }
        i5b<nb7> i5bVar = this.f44138e;
        Object[] objArr = i5bVar.f100490c;
        long[] jArr = i5bVar.f100488a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j) < 128) {
                        nb7 nb7Var2 = (nb7) objArr[(i3 << 3) + i5];
                        if (nb7Var2.getNodeIndex() >= nodeIndex2 && !md8.areEqual(nb7Var2, nb7Var) && (nodeIndex = nb7Var2.getNodeIndex() + nodeCount) >= 0) {
                            nb7Var2.setNodeIndex(nodeIndex);
                        }
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return true;
                }
            }
            if (i3 == length) {
                return true;
            }
            i3++;
        }
    }

    public final int updatedNodeCountOf(@yfb wq8 wq8Var) {
        nb7 nb7Var = this.f44138e.get(wq8Var.getLocation());
        return nb7Var != null ? nb7Var.getNodeCount() : wq8Var.getNodes();
    }
}
