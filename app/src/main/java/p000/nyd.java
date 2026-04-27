package p000;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.AbstractC3595a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.abg;
import p000.di4;
import p000.f2h;
import p000.fa9;
import p000.fr5;
import p000.ga3;
import p000.jhi;
import p000.m70;
import p000.m7d;
import p000.mmg;
import p000.n7c;
import p000.nh4;
import p000.qw0;
import p000.rm2;
import p000.smg;
import p000.yag;
import p000.yri;
import p000.zi4;

/* JADX INFO: loaded from: classes5.dex */
public final class nyd {

    /* JADX INFO: renamed from: a */
    public final qi3 f66077a;

    /* JADX INFO: renamed from: b */
    public final String f66078b;

    /* JADX INFO: renamed from: nyd$a */
    public static /* synthetic */ class C10118a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66079a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f66080b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f66081c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f66082d;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ int[] f66083e;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ int[] f66084f;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ int[] f66085g;

        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ int[] f66086h;

        /* JADX INFO: renamed from: i */
        public static final /* synthetic */ int[] f66087i;

        /* JADX INFO: renamed from: j */
        public static final /* synthetic */ int[] f66088j;

        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ int[] f66089k;

        /* JADX INFO: renamed from: l */
        public static final /* synthetic */ int[] f66090l;

        /* JADX INFO: renamed from: m */
        public static final /* synthetic */ int[] f66091m;

        static {
            int[] iArr = new int[fa9.EnumC5706c.values().length];
            f66091m = iArr;
            try {
                iArr[fa9.EnumC5706c.TARGET_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66091m[fa9.EnumC5706c.DOCUMENT_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66091m[fa9.EnumC5706c.DOCUMENT_DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66091m[fa9.EnumC5706c.DOCUMENT_REMOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66091m[fa9.EnumC5706c.FILTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f66091m[fa9.EnumC5706c.RESPONSETYPE_NOT_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[smg.EnumC12665c.values().length];
            f66090l = iArr2;
            try {
                iArr2[smg.EnumC12665c.NO_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f66090l[smg.EnumC12665c.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f66090l[smg.EnumC12665c.REMOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f66090l[smg.EnumC12665c.CURRENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f66090l[smg.EnumC12665c.RESET.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f66090l[smg.EnumC12665c.UNRECOGNIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr3 = new int[abg.EnumC0158g.values().length];
            f66089k = iArr3;
            try {
                iArr3[abg.EnumC0158g.ASCENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f66089k[abg.EnumC0158g.DESCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr4 = new int[abg.C0159h.b.values().length];
            f66088j = iArr4;
            try {
                iArr4[abg.C0159h.b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f66088j[abg.C0159h.b.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f66088j[abg.C0159h.b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f66088j[abg.C0159h.b.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f66088j[abg.C0159h.b.GREATER_THAN_OR_EQUAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f66088j[abg.C0159h.b.GREATER_THAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f66088j[abg.C0159h.b.ARRAY_CONTAINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f66088j[abg.C0159h.b.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f66088j[abg.C0159h.b.ARRAY_CONTAINS_ANY.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f66088j[abg.C0159h.b.NOT_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr5 = new int[fr5.EnumC5939b.values().length];
            f66087i = iArr5;
            try {
                iArr5[fr5.EnumC5939b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f66087i[fr5.EnumC5939b.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f66087i[fr5.EnumC5939b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f66087i[fr5.EnumC5939b.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f66087i[fr5.EnumC5939b.GREATER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f66087i[fr5.EnumC5939b.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f66087i[fr5.EnumC5939b.ARRAY_CONTAINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f66087i[fr5.EnumC5939b.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f66087i[fr5.EnumC5939b.ARRAY_CONTAINS_ANY.ordinal()] = 9;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f66087i[fr5.EnumC5939b.NOT_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused34) {
            }
            int[] iArr6 = new int[abg.C0169r.c.values().length];
            f66086h = iArr6;
            try {
                iArr6[abg.C0169r.c.IS_NAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f66086h[abg.C0169r.c.IS_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f66086h[abg.C0169r.c.IS_NOT_NAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f66086h[abg.C0169r.c.IS_NOT_NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused38) {
            }
            int[] iArr7 = new int[abg.C0163l.b.values().length];
            f66085g = iArr7;
            try {
                iArr7[abg.C0163l.b.COMPOSITE_FILTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f66085g[abg.C0163l.b.FIELD_FILTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f66085g[abg.C0163l.b.UNARY_FILTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            int[] iArr8 = new int[abg.C0156e.b.values().length];
            f66084f = iArr8;
            try {
                iArr8[abg.C0156e.b.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f66084f[abg.C0156e.b.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            int[] iArr9 = new int[rm2.EnumC12152a.values().length];
            f66083e = iArr9;
            try {
                iArr9[rm2.EnumC12152a.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f66083e[rm2.EnumC12152a.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            int[] iArr10 = new int[pmd.values().length];
            f66082d = iArr10;
            try {
                iArr10[pmd.LISTEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f66082d[pmd.EXISTENCE_FILTER_MISMATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f66082d[pmd.EXISTENCE_FILTER_MISMATCH_BLOOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f66082d[pmd.LIMBO_RESOLUTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused49) {
            }
            int[] iArr11 = new int[zi4.C16149c.c.values().length];
            f66081c = iArr11;
            try {
                iArr11[zi4.C16149c.c.SET_TO_SERVER_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f66081c[zi4.C16149c.c.APPEND_MISSING_ELEMENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f66081c[zi4.C16149c.c.REMOVE_ALL_FROM_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f66081c[zi4.C16149c.c.INCREMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused53) {
            }
            int[] iArr12 = new int[m7d.EnumC9215c.values().length];
            f66080b = iArr12;
            try {
                iArr12[m7d.EnumC9215c.UPDATE_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f66080b[m7d.EnumC9215c.EXISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f66080b[m7d.EnumC9215c.CONDITIONTYPE_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused56) {
            }
            int[] iArr13 = new int[yri.EnumC15791c.values().length];
            f66079a = iArr13;
            try {
                iArr13[yri.EnumC15791c.UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f66079a[yri.EnumC15791c.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f66079a[yri.EnumC15791c.VERIFY.ordinal()] = 3;
            } catch (NoSuchFieldError unused59) {
            }
        }
    }

    public nyd(qi3 qi3Var) {
        this.f66077a = qi3Var;
        this.f66078b = encodedDatabaseId(qi3Var).canonicalString();
    }

    private or5 decodeDocumentMask(di4 di4Var) {
        int fieldPathsCount = di4Var.getFieldPathsCount();
        HashSet hashSet = new HashSet(fieldPathsCount);
        for (int i = 0; i < fieldPathsCount; i++) {
            hashSet.add(wr5.fromServerFormat(di4Var.getFieldPaths(i)));
        }
        return or5.fromSet(hashSet);
    }

    private fr5.EnumC5939b decodeFieldFilterOperator(abg.C0159h.b bVar) {
        switch (C10118a.f66088j[bVar.ordinal()]) {
            case 1:
                return fr5.EnumC5939b.LESS_THAN;
            case 2:
                return fr5.EnumC5939b.LESS_THAN_OR_EQUAL;
            case 3:
                return fr5.EnumC5939b.EQUAL;
            case 4:
                return fr5.EnumC5939b.NOT_EQUAL;
            case 5:
                return fr5.EnumC5939b.GREATER_THAN_OR_EQUAL;
            case 6:
                return fr5.EnumC5939b.GREATER_THAN;
            case 7:
                return fr5.EnumC5939b.ARRAY_CONTAINS;
            case 8:
                return fr5.EnumC5939b.IN;
            case 9:
                return fr5.EnumC5939b.ARRAY_CONTAINS_ANY;
            case 10:
                return fr5.EnumC5939b.NOT_IN;
            default:
                throw r80.fail("Unhandled FieldFilter.operator %d", bVar);
        }
    }

    private bs5 decodeFieldTransform(zi4.C16149c c16149c) {
        int i = C10118a.f66081c[c16149c.getTransformTypeCase().ordinal()];
        if (i == 1) {
            r80.hardAssert(c16149c.getSetToServerValue() == zi4.C16149c.b.REQUEST_TIME, "Unknown transform setToServerValue: %s", c16149c.getSetToServerValue());
            return new bs5(wr5.fromServerFormat(c16149c.getFieldPath()), a4f.getInstance());
        }
        if (i == 2) {
            return new bs5(wr5.fromServerFormat(c16149c.getFieldPath()), new m70.C9167b(c16149c.getAppendMissingElements().getValuesList()));
        }
        if (i == 3) {
            return new bs5(wr5.fromServerFormat(c16149c.getFieldPath()), new m70.C9166a(c16149c.getRemoveAllFromArray().getValuesList()));
        }
        if (i == 4) {
            return new bs5(wr5.fromServerFormat(c16149c.getFieldPath()), new jjb(c16149c.getIncrement()));
        }
        throw r80.fail("Unknown FieldTransform proto: %s", c16149c);
    }

    private List<su5> decodeFilters(abg.C0163l c0163l) {
        su5 su5VarM18214d = m18214d(c0163l);
        if (su5VarM18214d instanceof rm2) {
            rm2 rm2Var = (rm2) su5VarM18214d;
            if (rm2Var.isFlatConjunction()) {
                return rm2Var.getFilters();
            }
        }
        return Collections.singletonList(su5VarM18214d);
    }

    private t4b decodeFoundDocument(qw0 qw0Var) {
        r80.hardAssert(qw0Var.getResultCase().equals(qw0.EnumC11721c.FOUND), "Tried to deserialize a found document from a missing document.", new Object[0]);
        ci4 ci4VarDecodeKey = decodeKey(qw0Var.getFound().getName());
        nkb nkbVarFromMap = nkb.fromMap(qw0Var.getFound().getFieldsMap());
        euf eufVarDecodeVersion = decodeVersion(qw0Var.getFound().getUpdateTime());
        r80.hardAssert(!eufVarDecodeVersion.equals(euf.f34067b), "Got a document response with no snapshot version", new Object[0]);
        return t4b.newFoundDocument(ci4VarDecodeKey, eufVarDecodeVersion, nkbVarFromMap);
    }

    private t4b decodeMissingDocument(qw0 qw0Var) {
        r80.hardAssert(qw0Var.getResultCase().equals(qw0.EnumC11721c.MISSING), "Tried to deserialize a missing document from a found document.", new Object[0]);
        ci4 ci4VarDecodeKey = decodeKey(qw0Var.getMissing());
        euf eufVarDecodeVersion = decodeVersion(qw0Var.getReadTime());
        r80.hardAssert(!eufVarDecodeVersion.equals(euf.f34067b), "Got a no document response with no snapshot version", new Object[0]);
        return t4b.newNoDocument(ci4VarDecodeKey, eufVarDecodeVersion);
    }

    private n7c decodeOrderBy(abg.C0165n c0165n) {
        n7c.EnumC9722a enumC9722a;
        wr5 wr5VarFromServerFormat = wr5.fromServerFormat(c0165n.getField().getFieldPath());
        int i = C10118a.f66089k[c0165n.getDirection().ordinal()];
        if (i == 1) {
            enumC9722a = n7c.EnumC9722a.ASCENDING;
        } else {
            if (i != 2) {
                throw r80.fail("Unrecognized direction %d", c0165n.getDirection());
            }
            enumC9722a = n7c.EnumC9722a.DESCENDING;
        }
        return n7c.getInstance(enumC9722a, wr5VarFromServerFormat);
    }

    private n7d decodePrecondition(m7d m7dVar) {
        int i = C10118a.f66080b[m7dVar.getConditionTypeCase().ordinal()];
        if (i == 1) {
            return n7d.updateTime(decodeVersion(m7dVar.getUpdateTime()));
        }
        if (i == 2) {
            return n7d.exists(m7dVar.getExists());
        }
        if (i == 3) {
            return n7d.f63462c;
        }
        throw r80.fail("Unknown precondition", new Object[0]);
    }

    private s6e decodeQueryPath(String str) {
        s6e s6eVarDecodeResourceName = decodeResourceName(str);
        return s6eVarDecodeResourceName.length() == 4 ? s6e.f80844b : extractLocalPathFromResourceName(s6eVarDecodeResourceName);
    }

    private s6e decodeResourceName(String str) {
        s6e s6eVarFromString = s6e.fromString(str);
        r80.hardAssert(isValidResourceName(s6eVarFromString), "Tried to deserialize invalid key %s", s6eVarFromString);
        return s6eVarFromString;
    }

    private su5 decodeUnaryFilter(abg.C0169r c0169r) {
        wr5 wr5VarFromServerFormat = wr5.fromServerFormat(c0169r.getField().getFieldPath());
        int i = C10118a.f66086h[c0169r.getOp().ordinal()];
        if (i == 1) {
            return fr5.create(wr5VarFromServerFormat, fr5.EnumC5939b.EQUAL, s2i.f80458b);
        }
        if (i == 2) {
            return fr5.create(wr5VarFromServerFormat, fr5.EnumC5939b.EQUAL, s2i.f80459c);
        }
        if (i == 3) {
            return fr5.create(wr5VarFromServerFormat, fr5.EnumC5939b.NOT_EQUAL, s2i.f80458b);
        }
        if (i == 4) {
            return fr5.create(wr5VarFromServerFormat, fr5.EnumC5939b.NOT_EQUAL, s2i.f80459c);
        }
        throw r80.fail("Unrecognized UnaryFilter.operator %d", c0169r.getOp());
    }

    private di4 encodeDocumentMask(or5 or5Var) {
        di4.C4792b c4792bNewBuilder = di4.newBuilder();
        Iterator<wr5> it = or5Var.getMask().iterator();
        while (it.hasNext()) {
            c4792bNewBuilder.addFieldPaths(it.next().canonicalString());
        }
        return c4792bNewBuilder.build();
    }

    private abg.C0159h.b encodeFieldFilterOperator(fr5.EnumC5939b enumC5939b) {
        switch (C10118a.f66087i[enumC5939b.ordinal()]) {
            case 1:
                return abg.C0159h.b.LESS_THAN;
            case 2:
                return abg.C0159h.b.LESS_THAN_OR_EQUAL;
            case 3:
                return abg.C0159h.b.EQUAL;
            case 4:
                return abg.C0159h.b.NOT_EQUAL;
            case 5:
                return abg.C0159h.b.GREATER_THAN;
            case 6:
                return abg.C0159h.b.GREATER_THAN_OR_EQUAL;
            case 7:
                return abg.C0159h.b.ARRAY_CONTAINS;
            case 8:
                return abg.C0159h.b.IN;
            case 9:
                return abg.C0159h.b.ARRAY_CONTAINS_ANY;
            case 10:
                return abg.C0159h.b.NOT_IN;
            default:
                throw r80.fail("Unknown operator %d", enumC5939b);
        }
    }

    private abg.C0161j encodeFieldPath(wr5 wr5Var) {
        return abg.C0161j.newBuilder().setFieldPath(wr5Var.canonicalString()).build();
    }

    private zi4.C16149c encodeFieldTransform(bs5 bs5Var) {
        xdh operation = bs5Var.getOperation();
        if (operation instanceof a4f) {
            return zi4.C16149c.newBuilder().setFieldPath(bs5Var.getFieldPath().canonicalString()).setSetToServerValue(zi4.C16149c.b.REQUEST_TIME).build();
        }
        if (operation instanceof m70.C9167b) {
            return zi4.C16149c.newBuilder().setFieldPath(bs5Var.getFieldPath().canonicalString()).setAppendMissingElements(o70.newBuilder().addAllValues(((m70.C9167b) operation).getElements())).build();
        }
        if (operation instanceof m70.C9166a) {
            return zi4.C16149c.newBuilder().setFieldPath(bs5Var.getFieldPath().canonicalString()).setRemoveAllFromArray(o70.newBuilder().addAllValues(((m70.C9166a) operation).getElements())).build();
        }
        if (operation instanceof jjb) {
            return zi4.C16149c.newBuilder().setFieldPath(bs5Var.getFieldPath().canonicalString()).setIncrement(((jjb) operation).getOperand()).build();
        }
        throw r80.fail("Unknown transform: %s", operation);
    }

    private abg.C0163l encodeFilters(List<su5> list) {
        return m18217g(new rm2(list, rm2.EnumC12152a.AND));
    }

    @hib
    private String encodeLabel(pmd pmdVar) {
        int i = C10118a.f66082d[pmdVar.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return "existence-filter-mismatch";
        }
        if (i == 3) {
            return "existence-filter-mismatch-bloom";
        }
        if (i == 4) {
            return "limbo-document";
        }
        throw r80.fail("Unrecognized query purpose: %s", pmdVar);
    }

    private abg.C0165n encodeOrderBy(n7c n7cVar) {
        abg.C0165n.a aVarNewBuilder = abg.C0165n.newBuilder();
        if (n7cVar.getDirection().equals(n7c.EnumC9722a.ASCENDING)) {
            aVarNewBuilder.setDirection(abg.EnumC0158g.ASCENDING);
        } else {
            aVarNewBuilder.setDirection(abg.EnumC0158g.DESCENDING);
        }
        aVarNewBuilder.setField(encodeFieldPath(n7cVar.getField()));
        return aVarNewBuilder.build();
    }

    private m7d encodePrecondition(n7d n7dVar) {
        r80.hardAssert(!n7dVar.isNone(), "Can't serialize an empty precondition", new Object[0]);
        m7d.C9214b c9214bNewBuilder = m7d.newBuilder();
        if (n7dVar.getUpdateTime() != null) {
            return c9214bNewBuilder.setUpdateTime(encodeVersion(n7dVar.getUpdateTime())).build();
        }
        if (n7dVar.getExists() != null) {
            return c9214bNewBuilder.setExists(n7dVar.getExists().booleanValue()).build();
        }
        throw r80.fail("Unknown Precondition", new Object[0]);
    }

    private String encodeQueryPath(s6e s6eVar) {
        return encodeResourceName(this.f66077a, s6eVar);
    }

    private String encodeResourceName(qi3 qi3Var, s6e s6eVar) {
        return encodedDatabaseId(qi3Var).append("documents").append(s6eVar).canonicalString();
    }

    private static s6e encodedDatabaseId(qi3 qi3Var) {
        return s6e.fromSegments(Arrays.asList("projects", qi3Var.getProjectId(), "databases", qi3Var.getDatabaseId()));
    }

    private static s6e extractLocalPathFromResourceName(s6e s6eVar) {
        r80.hardAssert(s6eVar.length() > 4 && s6eVar.getSegment(4).equals("documents"), "Tried to deserialize invalid key %s", s6eVar);
        return s6eVar.popFirst(5);
    }

    private n4g fromStatus(m4g m4gVar) {
        return n4g.fromCodeValue(m4gVar.getCode()).withDescription(m4gVar.getMessage());
    }

    private static boolean isValidResourceName(s6e s6eVar) {
        return s6eVar.length() >= 4 && s6eVar.getSegment(0).equals("projects") && s6eVar.getSegment(2).equals("databases");
    }

    @fdi
    /* JADX INFO: renamed from: a */
    public rm2 m18211a(abg.C0156e c0156e) {
        ArrayList arrayList = new ArrayList();
        Iterator<abg.C0163l> it = c0156e.getFiltersList().iterator();
        while (it.hasNext()) {
            arrayList.add(m18214d(it.next()));
        }
        return new rm2(arrayList, m18212b(c0156e.getOp()));
    }

    /* JADX INFO: renamed from: b */
    public rm2.EnumC12152a m18212b(abg.C0156e.b bVar) {
        int i = C10118a.f66084f[bVar.ordinal()];
        if (i == 1) {
            return rm2.EnumC12152a.AND;
        }
        if (i == 2) {
            return rm2.EnumC12152a.OR;
        }
        throw r80.fail("Only AND and OR composite filter types are supported.", new Object[0]);
    }

    @fdi
    /* JADX INFO: renamed from: c */
    public fr5 m18213c(abg.C0159h c0159h) {
        return fr5.create(wr5.fromServerFormat(c0159h.getField().getFieldPath()), decodeFieldFilterOperator(c0159h.getOp()), c0159h.getValue());
    }

    @fdi
    /* JADX INFO: renamed from: d */
    public su5 m18214d(abg.C0163l c0163l) {
        int i = C10118a.f66085g[c0163l.getFilterTypeCase().ordinal()];
        if (i == 1) {
            return m18211a(c0163l.getCompositeFilter());
        }
        if (i == 2) {
            return m18213c(c0163l.getFieldFilter());
        }
        if (i == 3) {
            return decodeUnaryFilter(c0163l.getUnaryFilter());
        }
        throw r80.fail("Unrecognized Filter.filterType %d", c0163l.getFilterTypeCase());
    }

    public String databaseName() {
        return this.f66078b;
    }

    public kmg decodeDocumentsTarget(mmg.C9417c c9417c) {
        int documentsCount = c9417c.getDocumentsCount();
        r80.hardAssert(documentsCount == 1, "DocumentsTarget contained other than 1 document %d", Integer.valueOf(documentsCount));
        return nld.atPath(decodeQueryPath(c9417c.getDocuments(0))).toTarget();
    }

    public ci4 decodeKey(String str) {
        s6e s6eVarDecodeResourceName = decodeResourceName(str);
        r80.hardAssert(s6eVarDecodeResourceName.getSegment(1).equals(this.f66077a.getProjectId()), "Tried to deserialize key from different project.", new Object[0]);
        r80.hardAssert(s6eVarDecodeResourceName.getSegment(3).equals(this.f66077a.getDatabaseId()), "Tried to deserialize key from different database.", new Object[0]);
        return ci4.fromPath(extractLocalPathFromResourceName(s6eVarDecodeResourceName));
    }

    public t4b decodeMaybeDocument(qw0 qw0Var) {
        if (qw0Var.getResultCase().equals(qw0.EnumC11721c.FOUND)) {
            return decodeFoundDocument(qw0Var);
        }
        if (qw0Var.getResultCase().equals(qw0.EnumC11721c.MISSING)) {
            return decodeMissingDocument(qw0Var);
        }
        throw new IllegalArgumentException("Unknown result case: " + qw0Var.getResultCase());
    }

    public m7b decodeMutation(yri yriVar) {
        n7d n7dVarDecodePrecondition = yriVar.hasCurrentDocument() ? decodePrecondition(yriVar.getCurrentDocument()) : n7d.f63462c;
        ArrayList arrayList = new ArrayList();
        Iterator<zi4.C16149c> it = yriVar.getUpdateTransformsList().iterator();
        while (it.hasNext()) {
            arrayList.add(decodeFieldTransform(it.next()));
        }
        int i = C10118a.f66079a[yriVar.getOperationCase().ordinal()];
        if (i == 1) {
            return yriVar.hasUpdateMask() ? new uic(decodeKey(yriVar.getUpdate().getName()), nkb.fromMap(yriVar.getUpdate().getFieldsMap()), decodeDocumentMask(yriVar.getUpdateMask()), n7dVarDecodePrecondition, arrayList) : new q6f(decodeKey(yriVar.getUpdate().getName()), nkb.fromMap(yriVar.getUpdate().getFieldsMap()), n7dVarDecodePrecondition, arrayList);
        }
        if (i == 2) {
            return new c54(decodeKey(yriVar.getDelete()), n7dVarDecodePrecondition);
        }
        if (i == 3) {
            return new u4i(decodeKey(yriVar.getVerify()), n7dVarDecodePrecondition);
        }
        throw r80.fail("Unknown mutation operation: %d", yriVar.getOperationCase());
    }

    public u7b decodeMutationResult(ksi ksiVar, euf eufVar) {
        euf eufVarDecodeVersion = decodeVersion(ksiVar.getUpdateTime());
        if (!euf.f34067b.equals(eufVarDecodeVersion)) {
            eufVar = eufVarDecodeVersion;
        }
        int transformResultsCount = ksiVar.getTransformResultsCount();
        ArrayList arrayList = new ArrayList(transformResultsCount);
        for (int i = 0; i < transformResultsCount; i++) {
            arrayList.add(ksiVar.getTransformResults(i));
        }
        return new u7b(eufVar, arrayList);
    }

    public kmg decodeQueryTarget(String str, abg abgVar) {
        s6e s6eVar;
        String collectionId;
        List listEmptyList;
        s6e s6eVarDecodeQueryPath = decodeQueryPath(str);
        int fromCount = abgVar.getFromCount();
        if (fromCount <= 0) {
            s6eVar = s6eVarDecodeQueryPath;
            collectionId = null;
        } else {
            r80.hardAssert(fromCount == 1, "StructuredQuery.from with more than one collection is not supported.", new Object[0]);
            abg.C0154c from = abgVar.getFrom(0);
            if (from.getAllDescendants()) {
                s6eVar = s6eVarDecodeQueryPath;
                collectionId = from.getCollectionId();
            } else {
                s6eVarDecodeQueryPath = s6eVarDecodeQueryPath.append(from.getCollectionId());
                s6eVar = s6eVarDecodeQueryPath;
                collectionId = null;
            }
        }
        List<su5> listDecodeFilters = abgVar.hasWhere() ? decodeFilters(abgVar.getWhere()) : Collections.emptyList();
        int orderByCount = abgVar.getOrderByCount();
        if (orderByCount > 0) {
            ArrayList arrayList = new ArrayList(orderByCount);
            for (int i = 0; i < orderByCount; i++) {
                arrayList.add(decodeOrderBy(abgVar.getOrderBy(i)));
            }
            listEmptyList = arrayList;
        } else {
            listEmptyList = Collections.emptyList();
        }
        return new kmg(s6eVar, collectionId, listDecodeFilters, listEmptyList, abgVar.hasLimit() ? abgVar.getLimit().getValue() : -1L, abgVar.hasStartAt() ? new gc1(abgVar.getStartAt().getValuesList(), abgVar.getStartAt().getBefore()) : null, abgVar.hasEndAt() ? new gc1(abgVar.getEndAt().getValuesList(), !abgVar.getEndAt().getBefore()) : null);
    }

    public Timestamp decodeTimestamp(f2h f2hVar) {
        return new Timestamp(f2hVar.getSeconds(), f2hVar.getNanos());
    }

    public euf decodeVersion(f2h f2hVar) {
        return (f2hVar.getSeconds() == 0 && f2hVar.getNanos() == 0) ? euf.f34067b : new euf(decodeTimestamp(f2hVar));
    }

    public euf decodeVersionFromListenResponse(fa9 fa9Var) {
        if (fa9Var.getResponseTypeCase() == fa9.EnumC5706c.TARGET_CHANGE && fa9Var.getTargetChange().getTargetIdsCount() == 0) {
            return decodeVersion(fa9Var.getTargetChange().getReadTime());
        }
        return euf.f34067b;
    }

    public jhi decodeWatchChange(fa9 fa9Var) {
        jhi.EnumC7908e enumC7908e;
        jhi c7907d;
        int i = C10118a.f66091m[fa9Var.getResponseTypeCase().ordinal()];
        n4g n4gVarFromStatus = null;
        if (i == 1) {
            smg targetChange = fa9Var.getTargetChange();
            int i2 = C10118a.f66090l[targetChange.getTargetChangeType().ordinal()];
            if (i2 == 1) {
                enumC7908e = jhi.EnumC7908e.NoChange;
            } else if (i2 == 2) {
                enumC7908e = jhi.EnumC7908e.Added;
            } else if (i2 == 3) {
                enumC7908e = jhi.EnumC7908e.Removed;
                n4gVarFromStatus = fromStatus(targetChange.getCause());
            } else if (i2 == 4) {
                enumC7908e = jhi.EnumC7908e.Current;
            } else {
                if (i2 != 5) {
                    throw new IllegalArgumentException("Unknown target change type");
                }
                enumC7908e = jhi.EnumC7908e.Reset;
            }
            c7907d = new jhi.C7907d(enumC7908e, targetChange.getTargetIdsList(), targetChange.getResumeToken(), n4gVarFromStatus);
        } else if (i == 2) {
            sh4 documentChange = fa9Var.getDocumentChange();
            List<Integer> targetIdsList = documentChange.getTargetIdsList();
            List<Integer> removedTargetIdsList = documentChange.getRemovedTargetIdsList();
            ci4 ci4VarDecodeKey = decodeKey(documentChange.getDocument().getName());
            euf eufVarDecodeVersion = decodeVersion(documentChange.getDocument().getUpdateTime());
            r80.hardAssert(!eufVarDecodeVersion.equals(euf.f34067b), "Got a document change without an update time", new Object[0]);
            t4b t4bVarNewFoundDocument = t4b.newFoundDocument(ci4VarDecodeKey, eufVarDecodeVersion, nkb.fromMap(documentChange.getDocument().getFieldsMap()));
            c7907d = new jhi.C7905b(targetIdsList, removedTargetIdsList, t4bVarNewFoundDocument.getKey(), t4bVarNewFoundDocument);
        } else {
            if (i == 3) {
                xh4 documentDelete = fa9Var.getDocumentDelete();
                List<Integer> removedTargetIdsList2 = documentDelete.getRemovedTargetIdsList();
                t4b t4bVarNewNoDocument = t4b.newNoDocument(decodeKey(documentDelete.getDocument()), decodeVersion(documentDelete.getReadTime()));
                return new jhi.C7905b(Collections.emptyList(), removedTargetIdsList2, t4bVarNewNoDocument.getKey(), t4bVarNewNoDocument);
            }
            if (i != 4) {
                if (i != 5) {
                    throw new IllegalArgumentException("Unknown change type set");
                }
                o95 filter = fa9Var.getFilter();
                return new jhi.C7906c(filter.getTargetId(), new p95(filter.getCount(), filter.getUnchangedNames()));
            }
            vi4 documentRemove = fa9Var.getDocumentRemove();
            c7907d = new jhi.C7905b(Collections.emptyList(), documentRemove.getRemovedTargetIdsList(), decodeKey(documentRemove.getDocument()), null);
        }
        return c7907d;
    }

    @fdi
    /* JADX INFO: renamed from: e */
    public abg.C0163l m18215e(rm2 rm2Var) {
        ArrayList arrayList = new ArrayList(rm2Var.getFilters().size());
        Iterator<su5> it = rm2Var.getFilters().iterator();
        while (it.hasNext()) {
            arrayList.add(m18217g(it.next()));
        }
        if (arrayList.size() == 1) {
            return (abg.C0163l) arrayList.get(0);
        }
        abg.C0156e.a aVarNewBuilder = abg.C0156e.newBuilder();
        aVarNewBuilder.setOp(m18216f(rm2Var.getOperator()));
        aVarNewBuilder.addAllFilters(arrayList);
        return abg.C0163l.newBuilder().setCompositeFilter(aVarNewBuilder).build();
    }

    public nh4 encodeDocument(ci4 ci4Var, nkb nkbVar) {
        nh4.C9874b c9874bNewBuilder = nh4.newBuilder();
        c9874bNewBuilder.setName(encodeKey(ci4Var));
        c9874bNewBuilder.putAllFields(nkbVar.getFieldsMap());
        return c9874bNewBuilder.build();
    }

    public mmg.C9417c encodeDocumentsTarget(kmg kmgVar) {
        mmg.C9417c.a aVarNewBuilder = mmg.C9417c.newBuilder();
        aVarNewBuilder.addDocuments(encodeQueryPath(kmgVar.getPath()));
        return aVarNewBuilder.build();
    }

    public String encodeKey(ci4 ci4Var) {
        return encodeResourceName(this.f66077a, ci4Var.getPath());
    }

    @hib
    public Map<String, String> encodeListenRequestLabels(vmg vmgVar) {
        String strEncodeLabel = encodeLabel(vmgVar.getPurpose());
        if (strEncodeLabel == null) {
            return null;
        }
        HashMap map = new HashMap(1);
        map.put("goog-listen-tags", strEncodeLabel);
        return map;
    }

    public yri encodeMutation(m7b m7bVar) {
        yri.C15790b c15790bNewBuilder = yri.newBuilder();
        if (m7bVar instanceof q6f) {
            c15790bNewBuilder.setUpdate(encodeDocument(m7bVar.getKey(), ((q6f) m7bVar).getValue()));
        } else if (m7bVar instanceof uic) {
            c15790bNewBuilder.setUpdate(encodeDocument(m7bVar.getKey(), ((uic) m7bVar).getValue()));
            c15790bNewBuilder.setUpdateMask(encodeDocumentMask(m7bVar.getFieldMask()));
        } else if (m7bVar instanceof c54) {
            c15790bNewBuilder.setDelete(encodeKey(m7bVar.getKey()));
        } else {
            if (!(m7bVar instanceof u4i)) {
                throw r80.fail("unknown mutation type %s", m7bVar.getClass());
            }
            c15790bNewBuilder.setVerify(encodeKey(m7bVar.getKey()));
        }
        Iterator<bs5> it = m7bVar.getFieldTransforms().iterator();
        while (it.hasNext()) {
            c15790bNewBuilder.addUpdateTransforms(encodeFieldTransform(it.next()));
        }
        if (!m7bVar.getPrecondition().isNone()) {
            c15790bNewBuilder.setCurrentDocument(encodePrecondition(m7bVar.getPrecondition()));
        }
        return c15790bNewBuilder.build();
    }

    public mmg.C9419e encodeQueryTarget(kmg kmgVar) {
        mmg.C9419e.a aVarNewBuilder = mmg.C9419e.newBuilder();
        abg.C0153b c0153bNewBuilder = abg.newBuilder();
        s6e path = kmgVar.getPath();
        if (kmgVar.getCollectionGroup() != null) {
            r80.hardAssert(path.length() % 2 == 0, "Collection Group queries should be within a document path or root.", new Object[0]);
            aVarNewBuilder.setParent(encodeQueryPath(path));
            abg.C0154c.a aVarNewBuilder2 = abg.C0154c.newBuilder();
            aVarNewBuilder2.setCollectionId(kmgVar.getCollectionGroup());
            aVarNewBuilder2.setAllDescendants(true);
            c0153bNewBuilder.addFrom(aVarNewBuilder2);
        } else {
            r80.hardAssert(path.length() % 2 != 0, "Document queries with filters are not supported.", new Object[0]);
            aVarNewBuilder.setParent(encodeQueryPath(path.popLast()));
            abg.C0154c.a aVarNewBuilder3 = abg.C0154c.newBuilder();
            aVarNewBuilder3.setCollectionId(path.getLastSegment());
            c0153bNewBuilder.addFrom(aVarNewBuilder3);
        }
        if (kmgVar.getFilters().size() > 0) {
            c0153bNewBuilder.setWhere(encodeFilters(kmgVar.getFilters()));
        }
        Iterator<n7c> it = kmgVar.getOrderBy().iterator();
        while (it.hasNext()) {
            c0153bNewBuilder.addOrderBy(encodeOrderBy(it.next()));
        }
        if (kmgVar.hasLimit()) {
            c0153bNewBuilder.setLimit(t58.newBuilder().setValue((int) kmgVar.getLimit()));
        }
        if (kmgVar.getStartAt() != null) {
            ga3.C6183b c6183bNewBuilder = ga3.newBuilder();
            c6183bNewBuilder.addAllValues(kmgVar.getStartAt().getPosition());
            c6183bNewBuilder.setBefore(kmgVar.getStartAt().isInclusive());
            c0153bNewBuilder.setStartAt(c6183bNewBuilder);
        }
        if (kmgVar.getEndAt() != null) {
            ga3.C6183b c6183bNewBuilder2 = ga3.newBuilder();
            c6183bNewBuilder2.addAllValues(kmgVar.getEndAt().getPosition());
            c6183bNewBuilder2.setBefore(!kmgVar.getEndAt().isInclusive());
            c0153bNewBuilder.setEndAt(c6183bNewBuilder2);
        }
        aVarNewBuilder.setStructuredQuery(c0153bNewBuilder);
        return aVarNewBuilder.build();
    }

    public mmg encodeTarget(vmg vmgVar) {
        mmg.C9416b c9416bNewBuilder = mmg.newBuilder();
        kmg target = vmgVar.getTarget();
        if (target.isDocumentQuery()) {
            c9416bNewBuilder.setDocuments(encodeDocumentsTarget(target));
        } else {
            c9416bNewBuilder.setQuery(encodeQueryTarget(target));
        }
        c9416bNewBuilder.setTargetId(vmgVar.getTargetId());
        if (!vmgVar.getResumeToken().isEmpty() || vmgVar.getSnapshotVersion().compareTo(euf.f34067b) <= 0) {
            c9416bNewBuilder.setResumeToken(vmgVar.getResumeToken());
        } else {
            c9416bNewBuilder.setReadTime(encodeTimestamp(vmgVar.getSnapshotVersion().getTimestamp()));
        }
        if (vmgVar.getExpectedCount() != null && (!vmgVar.getResumeToken().isEmpty() || vmgVar.getSnapshotVersion().compareTo(euf.f34067b) > 0)) {
            c9416bNewBuilder.setExpectedCount(t58.newBuilder().setValue(vmgVar.getExpectedCount().intValue()));
        }
        return c9416bNewBuilder.build();
    }

    public f2h encodeTimestamp(Timestamp timestamp) {
        f2h.C5567b c5567bNewBuilder = f2h.newBuilder();
        c5567bNewBuilder.setSeconds(timestamp.getSeconds());
        c5567bNewBuilder.setNanos(timestamp.getNanoseconds());
        return c5567bNewBuilder.build();
    }

    public f2h encodeVersion(euf eufVar) {
        return encodeTimestamp(eufVar.getTimestamp());
    }

    /* JADX INFO: renamed from: f */
    public abg.C0156e.b m18216f(rm2.EnumC12152a enumC12152a) {
        int i = C10118a.f66083e[enumC12152a.ordinal()];
        if (i == 1) {
            return abg.C0156e.b.AND;
        }
        if (i == 2) {
            return abg.C0156e.b.OR;
        }
        throw r80.fail("Unrecognized composite filter type.", new Object[0]);
    }

    @fdi
    /* JADX INFO: renamed from: g */
    public abg.C0163l m18217g(su5 su5Var) {
        if (su5Var instanceof fr5) {
            return m18219i((fr5) su5Var);
        }
        if (su5Var instanceof rm2) {
            return m18215e((rm2) su5Var);
        }
        throw r80.fail("Unrecognized filter type %s", su5Var.toString());
    }

    /* JADX INFO: renamed from: h */
    public yag m18218h(mmg.C9419e c9419e, List<AbstractC3595a> list, HashMap<String, String> map) {
        yag.C15596d c15596dNewBuilder = yag.newBuilder();
        c15596dNewBuilder.setStructuredQuery(c9419e.getStructuredQuery());
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i = 1;
        for (AbstractC3595a abstractC3595a : list) {
            if (!hashSet.contains(abstractC3595a.getAlias())) {
                hashSet.add(abstractC3595a.getAlias());
                StringBuilder sb = new StringBuilder();
                sb.append("aggregate_");
                int i2 = i + 1;
                sb.append(i);
                String string = sb.toString();
                map.put(string, abstractC3595a.getAlias());
                yag.C15594b.c cVarNewBuilder = yag.C15594b.newBuilder();
                abg.C0161j c0161jBuild = abg.C0161j.newBuilder().setFieldPath(abstractC3595a.getFieldPath()).build();
                if (abstractC3595a instanceof AbstractC3595a.c) {
                    cVarNewBuilder.setCount(yag.C15594b.d.getDefaultInstance());
                } else if (abstractC3595a instanceof AbstractC3595a.d) {
                    cVarNewBuilder.setSum(yag.C15594b.g.newBuilder().setField(c0161jBuild).build());
                } else {
                    if (!(abstractC3595a instanceof AbstractC3595a.b)) {
                        throw new RuntimeException("Unsupported aggregation");
                    }
                    cVarNewBuilder.setAvg(yag.C15594b.a.newBuilder().setField(c0161jBuild).build());
                }
                cVarNewBuilder.setAlias(string);
                arrayList.add(cVarNewBuilder.build());
                i = i2;
            }
        }
        c15596dNewBuilder.addAllAggregations(arrayList);
        return (yag) c15596dNewBuilder.build();
    }

    @fdi
    /* JADX INFO: renamed from: i */
    public abg.C0163l m18219i(fr5 fr5Var) {
        fr5.EnumC5939b operator = fr5Var.getOperator();
        fr5.EnumC5939b enumC5939b = fr5.EnumC5939b.EQUAL;
        if (operator == enumC5939b || fr5Var.getOperator() == fr5.EnumC5939b.NOT_EQUAL) {
            abg.C0169r.a aVarNewBuilder = abg.C0169r.newBuilder();
            aVarNewBuilder.setField(encodeFieldPath(fr5Var.getField()));
            if (s2i.isNanValue(fr5Var.getValue())) {
                aVarNewBuilder.setOp(fr5Var.getOperator() == enumC5939b ? abg.C0169r.c.IS_NAN : abg.C0169r.c.IS_NOT_NAN);
                return abg.C0163l.newBuilder().setUnaryFilter(aVarNewBuilder).build();
            }
            if (s2i.isNullValue(fr5Var.getValue())) {
                aVarNewBuilder.setOp(fr5Var.getOperator() == enumC5939b ? abg.C0169r.c.IS_NULL : abg.C0169r.c.IS_NOT_NULL);
                return abg.C0163l.newBuilder().setUnaryFilter(aVarNewBuilder).build();
            }
        }
        abg.C0159h.a aVarNewBuilder2 = abg.C0159h.newBuilder();
        aVarNewBuilder2.setField(encodeFieldPath(fr5Var.getField()));
        aVarNewBuilder2.setOp(encodeFieldFilterOperator(fr5Var.getOperator()));
        aVarNewBuilder2.setValue(fr5Var.getValue());
        return abg.C0163l.newBuilder().setFieldFilter(aVarNewBuilder2).build();
    }

    public boolean isLocalResourceName(s6e s6eVar) {
        return isValidResourceName(s6eVar) && s6eVar.getSegment(1).equals(this.f66077a.getProjectId()) && s6eVar.getSegment(3).equals(this.f66077a.getDatabaseId());
    }

    public kmg decodeQueryTarget(mmg.C9419e c9419e) {
        return decodeQueryTarget(c9419e.getParent(), c9419e.getStructuredQuery());
    }
}
