package p000;

import androidx.media3.common.C1213a;
import p000.eta;

/* JADX INFO: loaded from: classes3.dex */
public final class mua {

    /* JADX INFO: renamed from: A */
    public static final int f62206A = 1885823344;

    /* JADX INFO: renamed from: B */
    public static final int f62207B = 1936683886;

    /* JADX INFO: renamed from: C */
    public static final int f62208C = 1953919848;

    /* JADX INFO: renamed from: D */
    public static final int f62209D = 757935405;

    /* JADX INFO: renamed from: E */
    public static final int f62210E = 3;

    /* JADX INFO: renamed from: F */
    public static final int f62211F = 169;

    /* JADX INFO: renamed from: G */
    public static final int f62212G = 253;

    /* JADX INFO: renamed from: a */
    public static final String f62213a = "MetadataUtil";

    /* JADX INFO: renamed from: b */
    public static final int f62214b = 7233901;

    /* JADX INFO: renamed from: c */
    public static final int f62215c = 7631467;

    /* JADX INFO: renamed from: d */
    public static final int f62216d = 6516084;

    /* JADX INFO: renamed from: e */
    public static final int f62217e = 6578553;

    /* JADX INFO: renamed from: f */
    public static final int f62218f = 4280916;

    /* JADX INFO: renamed from: g */
    public static final int f62219g = 7630703;

    /* JADX INFO: renamed from: h */
    public static final int f62220h = 6384738;

    /* JADX INFO: renamed from: i */
    public static final int f62221i = 6516589;

    /* JADX INFO: renamed from: j */
    public static final int f62222j = 7828084;

    /* JADX INFO: renamed from: k */
    public static final int f62223k = 7108978;

    /* JADX INFO: renamed from: l */
    public static final int f62224l = 6776174;

    /* JADX INFO: renamed from: m */
    public static final int f62225m = 1668249202;

    /* JADX INFO: renamed from: n */
    public static final int f62226n = 1735291493;

    /* JADX INFO: renamed from: o */
    public static final int f62227o = 6779504;

    /* JADX INFO: renamed from: p */
    public static final int f62228p = 1684632427;

    /* JADX INFO: renamed from: q */
    public static final int f62229q = 1953655662;

    /* JADX INFO: renamed from: r */
    public static final int f62230r = 1953329263;

    /* JADX INFO: renamed from: s */
    public static final int f62231s = 1668311404;

    /* JADX INFO: renamed from: t */
    public static final int f62232t = 1631670868;

    /* JADX INFO: renamed from: u */
    public static final int f62233u = 1936682605;

    /* JADX INFO: renamed from: v */
    public static final int f62234v = 1936679276;

    /* JADX INFO: renamed from: w */
    public static final int f62235w = 1936679282;

    /* JADX INFO: renamed from: x */
    public static final int f62236x = 1936679265;

    /* JADX INFO: renamed from: y */
    public static final int f62237y = 1936679791;

    /* JADX INFO: renamed from: z */
    public static final int f62238z = 1920233063;

    private mua() {
    }

    @hib
    public static pba findMdtaMetadataEntryWithKey(eta etaVar, String str) {
        for (int i = 0; i < etaVar.length(); i++) {
            eta.InterfaceC5464a interfaceC5464a = etaVar.get(i);
            if (interfaceC5464a instanceof pba) {
                pba pbaVar = (pba) interfaceC5464a;
                if (pbaVar.f70231a.equals(str)) {
                    return pbaVar;
                }
            }
        }
        return null;
    }

    @hib
    private static vb2 parseCommentAttribute(int i, jhc jhcVar) {
        int i2 = jhcVar.readInt();
        if (jhcVar.readInt() == 1684108385) {
            jhcVar.skipBytes(8);
            String nullTerminatedString = jhcVar.readNullTerminatedString(i2 - 16);
            return new vb2("und", nullTerminatedString, nullTerminatedString);
        }
        xh9.m25148w("MetadataUtil", "Failed to parse comment attribute: " + y0b.getBoxTypeString(i));
        return null;
    }

    @hib
    private static p10 parseCoverArt(jhc jhcVar) {
        int i = jhcVar.readInt();
        if (jhcVar.readInt() != 1684108385) {
            xh9.m25148w("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int fullBoxFlags = rc1.parseFullBoxFlags(jhcVar.readInt());
        String str = fullBoxFlags == 13 ? "image/jpeg" : fullBoxFlags == 14 ? "image/png" : null;
        if (str == null) {
            xh9.m25148w("MetadataUtil", "Unrecognized cover art flags: " + fullBoxFlags);
            return null;
        }
        jhcVar.skipBytes(4);
        int i2 = i - 16;
        byte[] bArr = new byte[i2];
        jhcVar.readBytes(bArr, 0, i2);
        return new p10(str, null, 3, bArr);
    }

    @hib
    public static eta.InterfaceC5464a parseIlstElement(jhc jhcVar) {
        int position = jhcVar.getPosition() + jhcVar.readInt();
        int i = jhcVar.readInt();
        int i2 = (i >> 24) & 255;
        try {
            if (i2 == 169 || i2 == 253) {
                int i3 = 16777215 & i;
                if (i3 == 6516084) {
                    return parseCommentAttribute(i, jhcVar);
                }
                if (i3 == 7233901 || i3 == 7631467) {
                    return parseTextAttribute(i, "TIT2", jhcVar);
                }
                if (i3 == 6516589 || i3 == 7828084) {
                    return parseTextAttribute(i, "TCOM", jhcVar);
                }
                if (i3 == 6578553) {
                    return parseTextAttribute(i, "TDRC", jhcVar);
                }
                if (i3 == 4280916) {
                    return parseTextAttribute(i, "TPE1", jhcVar);
                }
                if (i3 == 7630703) {
                    return parseTextAttribute(i, "TSSE", jhcVar);
                }
                if (i3 == 6384738) {
                    return parseTextAttribute(i, "TALB", jhcVar);
                }
                if (i3 == 7108978) {
                    return parseTextAttribute(i, "USLT", jhcVar);
                }
                if (i3 == 6776174) {
                    return parseTextAttribute(i, "TCON", jhcVar);
                }
                if (i3 == 6779504) {
                    return parseTextAttribute(i, "TIT1", jhcVar);
                }
            } else {
                if (i == 1735291493) {
                    return parseStandardGenreAttribute(jhcVar);
                }
                if (i == 1684632427) {
                    return parseIndexAndCountAttribute(i, "TPOS", jhcVar);
                }
                if (i == 1953655662) {
                    return parseIndexAndCountAttribute(i, "TRCK", jhcVar);
                }
                if (i == 1953329263) {
                    return parseIntegerAttribute(i, "TBPM", jhcVar, true, false);
                }
                if (i == 1668311404) {
                    return parseIntegerAttribute(i, "TCMP", jhcVar, true, true);
                }
                if (i == 1668249202) {
                    return parseCoverArt(jhcVar);
                }
                if (i == 1631670868) {
                    return parseTextAttribute(i, "TPE2", jhcVar);
                }
                if (i == 1936682605) {
                    return parseTextAttribute(i, "TSOT", jhcVar);
                }
                if (i == 1936679276) {
                    return parseTextAttribute(i, "TSOA", jhcVar);
                }
                if (i == 1936679282) {
                    return parseTextAttribute(i, "TSOP", jhcVar);
                }
                if (i == 1936679265) {
                    return parseTextAttribute(i, "TSO2", jhcVar);
                }
                if (i == 1936679791) {
                    return parseTextAttribute(i, "TSOC", jhcVar);
                }
                if (i == 1920233063) {
                    return parseIntegerAttribute(i, "ITUNESADVISORY", jhcVar, false, false);
                }
                if (i == 1885823344) {
                    return parseIntegerAttribute(i, "ITUNESGAPLESS", jhcVar, false, true);
                }
                if (i == 1936683886) {
                    return parseTextAttribute(i, "TVSHOWSORT", jhcVar);
                }
                if (i == 1953919848) {
                    return parseTextAttribute(i, "TVSHOW", jhcVar);
                }
                if (i == 757935405) {
                    return parseInternalAttribute(jhcVar, position);
                }
            }
            xh9.m25142d("MetadataUtil", "Skipped unknown metadata entry: " + y0b.getBoxTypeString(i));
            jhcVar.setPosition(position);
            return null;
        } finally {
            jhcVar.setPosition(position);
        }
    }

    @hib
    private static ptg parseIndexAndCountAttribute(int i, String str, jhc jhcVar) {
        int i2 = jhcVar.readInt();
        if (jhcVar.readInt() == 1684108385 && i2 >= 22) {
            jhcVar.skipBytes(10);
            int unsignedShort = jhcVar.readUnsignedShort();
            if (unsignedShort > 0) {
                String str2 = "" + unsignedShort;
                int unsignedShort2 = jhcVar.readUnsignedShort();
                if (unsignedShort2 > 0) {
                    str2 = str2 + pj4.f71071b + unsignedShort2;
                }
                return new ptg(str, (String) null, kx7.m15111of(str2));
            }
        }
        xh9.m25148w("MetadataUtil", "Failed to parse index/count attribute: " + y0b.getBoxTypeString(i));
        return null;
    }

    @hib
    private static cr7 parseIntegerAttribute(int i, String str, jhc jhcVar, boolean z, boolean z2) {
        int integerAttribute = parseIntegerAttribute(jhcVar);
        if (z2) {
            integerAttribute = Math.min(1, integerAttribute);
        }
        if (integerAttribute >= 0) {
            return z ? new ptg(str, (String) null, kx7.m15111of(Integer.toString(integerAttribute))) : new vb2("und", str, Integer.toString(integerAttribute));
        }
        xh9.m25148w("MetadataUtil", "Failed to parse uint8 attribute: " + y0b.getBoxTypeString(i));
        return null;
    }

    @hib
    private static cr7 parseInternalAttribute(jhc jhcVar, int i) {
        String nullTerminatedString = null;
        String nullTerminatedString2 = null;
        int i2 = -1;
        int i3 = -1;
        while (jhcVar.getPosition() < i) {
            int position = jhcVar.getPosition();
            int i4 = jhcVar.readInt();
            int i5 = jhcVar.readInt();
            jhcVar.skipBytes(4);
            if (i5 == 1835360622) {
                nullTerminatedString = jhcVar.readNullTerminatedString(i4 - 12);
            } else if (i5 == 1851878757) {
                nullTerminatedString2 = jhcVar.readNullTerminatedString(i4 - 12);
            } else {
                if (i5 == 1684108385) {
                    i2 = position;
                    i3 = i4;
                }
                jhcVar.skipBytes(i4 - 12);
            }
        }
        if (nullTerminatedString == null || nullTerminatedString2 == null || i2 == -1) {
            return null;
        }
        jhcVar.setPosition(i2);
        jhcVar.skipBytes(16);
        return new ra8(nullTerminatedString, nullTerminatedString2, jhcVar.readNullTerminatedString(i3 - 16));
    }

    @hib
    public static pba parseMdtaMetadataEntryFromIlst(jhc jhcVar, int i, String str) {
        while (true) {
            int position = jhcVar.getPosition();
            if (position >= i) {
                return null;
            }
            int i2 = jhcVar.readInt();
            if (jhcVar.readInt() == 1684108385) {
                int i3 = jhcVar.readInt();
                int i4 = jhcVar.readInt();
                int i5 = i2 - 16;
                byte[] bArr = new byte[i5];
                jhcVar.readBytes(bArr, 0, i5);
                return new pba(str, bArr, i4, i3);
            }
            jhcVar.setPosition(position + i2);
        }
    }

    @hib
    private static ptg parseStandardGenreAttribute(jhc jhcVar) {
        String strResolveV1Genre = hr7.resolveV1Genre(parseIntegerAttribute(jhcVar) - 1);
        if (strResolveV1Genre != null) {
            return new ptg("TCON", (String) null, kx7.m15111of(strResolveV1Genre));
        }
        xh9.m25148w("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    @hib
    private static ptg parseTextAttribute(int i, String str, jhc jhcVar) {
        int i2 = jhcVar.readInt();
        if (jhcVar.readInt() == 1684108385) {
            jhcVar.skipBytes(8);
            return new ptg(str, (String) null, kx7.m15111of(jhcVar.readNullTerminatedString(i2 - 16)));
        }
        xh9.m25148w("MetadataUtil", "Failed to parse text attribute: " + y0b.getBoxTypeString(i));
        return null;
    }

    public static void setFormatGaplessInfo(int i, o27 o27Var, C1213a.b bVar) {
        if (i == 1 && o27Var.hasGaplessInfo()) {
            bVar.setEncoderDelay(o27Var.f66276a).setEncoderPadding(o27Var.f66277b);
        }
    }

    public static void setFormatMetadata(int i, @hib eta etaVar, C1213a.b bVar, @hib eta etaVar2, eta... etaVarArr) {
        if (etaVar2 == null) {
            etaVar2 = new eta(new eta.InterfaceC5464a[0]);
        }
        if (etaVar != null) {
            for (int i2 = 0; i2 < etaVar.length(); i2++) {
                eta.InterfaceC5464a interfaceC5464a = etaVar.get(i2);
                if (interfaceC5464a instanceof pba) {
                    pba pbaVar = (pba) interfaceC5464a;
                    if (!pbaVar.f70231a.equals("com.android.capture.fps")) {
                        etaVar2 = etaVar2.copyWithAppendedEntries(pbaVar);
                    } else if (i == 2) {
                        etaVar2 = etaVar2.copyWithAppendedEntries(pbaVar);
                    }
                }
            }
        }
        for (eta etaVar3 : etaVarArr) {
            etaVar2 = etaVar2.copyWithAppendedEntriesFrom(etaVar3);
        }
        if (etaVar2.length() > 0) {
            bVar.setMetadata(etaVar2);
        }
    }

    private static int parseIntegerAttribute(jhc jhcVar) {
        int i = jhcVar.readInt();
        if (jhcVar.readInt() == 1684108385) {
            jhcVar.skipBytes(8);
            int i2 = i - 16;
            if (i2 == 1) {
                return jhcVar.readUnsignedByte();
            }
            if (i2 == 2) {
                return jhcVar.readUnsignedShort();
            }
            if (i2 != 3) {
                if (i2 == 4 && (jhcVar.peekUnsignedByte() & 128) == 0) {
                    return jhcVar.readUnsignedIntToInt();
                }
            } else {
                return jhcVar.readUnsignedInt24();
            }
        }
        xh9.m25148w("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }
}
