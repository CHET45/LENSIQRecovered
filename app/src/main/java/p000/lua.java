package p000;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import p000.kq6;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class lua {

    /* JADX INFO: renamed from: A */
    public static final int f58792A = 1885823344;

    /* JADX INFO: renamed from: B */
    public static final int f58793B = 1936683886;

    /* JADX INFO: renamed from: C */
    public static final int f58794C = 1953919848;

    /* JADX INFO: renamed from: D */
    public static final int f58795D = 757935405;

    /* JADX INFO: renamed from: E */
    public static final int f58796E = 3;

    /* JADX INFO: renamed from: F */
    @fdi
    public static final String[] f58797F = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", go7.f40472L0, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* JADX INFO: renamed from: G */
    public static final int f58798G = 169;

    /* JADX INFO: renamed from: H */
    public static final int f58799H = 253;

    /* JADX INFO: renamed from: a */
    public static final String f58800a = "MetadataUtil";

    /* JADX INFO: renamed from: b */
    public static final int f58801b = 7233901;

    /* JADX INFO: renamed from: c */
    public static final int f58802c = 7631467;

    /* JADX INFO: renamed from: d */
    public static final int f58803d = 6516084;

    /* JADX INFO: renamed from: e */
    public static final int f58804e = 6578553;

    /* JADX INFO: renamed from: f */
    public static final int f58805f = 4280916;

    /* JADX INFO: renamed from: g */
    public static final int f58806g = 7630703;

    /* JADX INFO: renamed from: h */
    public static final int f58807h = 6384738;

    /* JADX INFO: renamed from: i */
    public static final int f58808i = 6516589;

    /* JADX INFO: renamed from: j */
    public static final int f58809j = 7828084;

    /* JADX INFO: renamed from: k */
    public static final int f58810k = 7108978;

    /* JADX INFO: renamed from: l */
    public static final int f58811l = 6776174;

    /* JADX INFO: renamed from: m */
    public static final int f58812m = 1668249202;

    /* JADX INFO: renamed from: n */
    public static final int f58813n = 1735291493;

    /* JADX INFO: renamed from: o */
    public static final int f58814o = 6779504;

    /* JADX INFO: renamed from: p */
    public static final int f58815p = 1684632427;

    /* JADX INFO: renamed from: q */
    public static final int f58816q = 1953655662;

    /* JADX INFO: renamed from: r */
    public static final int f58817r = 1953329263;

    /* JADX INFO: renamed from: s */
    public static final int f58818s = 1668311404;

    /* JADX INFO: renamed from: t */
    public static final int f58819t = 1631670868;

    /* JADX INFO: renamed from: u */
    public static final int f58820u = 1936682605;

    /* JADX INFO: renamed from: v */
    public static final int f58821v = 1936679276;

    /* JADX INFO: renamed from: w */
    public static final int f58822w = 1936679282;

    /* JADX INFO: renamed from: x */
    public static final int f58823x = 1936679265;

    /* JADX INFO: renamed from: y */
    public static final int f58824y = 1936679791;

    /* JADX INFO: renamed from: z */
    public static final int f58825z = 1920233063;

    private lua() {
    }

    @hib
    private static CommentFrame parseCommentAttribute(int i, ihc ihcVar) {
        int i2 = ihcVar.readInt();
        if (ihcVar.readInt() == 1684108385) {
            ihcVar.skipBytes(8);
            String nullTerminatedString = ihcVar.readNullTerminatedString(i2 - 16);
            return new CommentFrame("und", nullTerminatedString, nullTerminatedString);
        }
        yh9.m25919w("MetadataUtil", "Failed to parse comment attribute: " + ib0.getAtomTypeString(i));
        return null;
    }

    @hib
    private static ApicFrame parseCoverArt(ihc ihcVar) {
        int i = ihcVar.readInt();
        if (ihcVar.readInt() != 1684108385) {
            yh9.m25919w("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int fullAtomFlags = ib0.parseFullAtomFlags(ihcVar.readInt());
        String str = fullAtomFlags == 13 ? "image/jpeg" : fullAtomFlags == 14 ? "image/png" : null;
        if (str == null) {
            yh9.m25919w("MetadataUtil", "Unrecognized cover art flags: " + fullAtomFlags);
            return null;
        }
        ihcVar.skipBytes(4);
        int i2 = i - 16;
        byte[] bArr = new byte[i2];
        ihcVar.readBytes(bArr, 0, i2);
        return new ApicFrame(str, null, 3, bArr);
    }

    @hib
    public static Metadata.Entry parseIlstElement(ihc ihcVar) {
        int position = ihcVar.getPosition() + ihcVar.readInt();
        int i = ihcVar.readInt();
        int i2 = (i >> 24) & 255;
        try {
            if (i2 == 169 || i2 == 253) {
                int i3 = 16777215 & i;
                if (i3 == 6516084) {
                    return parseCommentAttribute(i, ihcVar);
                }
                if (i3 == 7233901 || i3 == 7631467) {
                    return parseTextAttribute(i, "TIT2", ihcVar);
                }
                if (i3 == 6516589 || i3 == 7828084) {
                    return parseTextAttribute(i, "TCOM", ihcVar);
                }
                if (i3 == 6578553) {
                    return parseTextAttribute(i, "TDRC", ihcVar);
                }
                if (i3 == 4280916) {
                    return parseTextAttribute(i, "TPE1", ihcVar);
                }
                if (i3 == 7630703) {
                    return parseTextAttribute(i, "TSSE", ihcVar);
                }
                if (i3 == 6384738) {
                    return parseTextAttribute(i, "TALB", ihcVar);
                }
                if (i3 == 7108978) {
                    return parseTextAttribute(i, "USLT", ihcVar);
                }
                if (i3 == 6776174) {
                    return parseTextAttribute(i, "TCON", ihcVar);
                }
                if (i3 == 6779504) {
                    return parseTextAttribute(i, "TIT1", ihcVar);
                }
            } else {
                if (i == 1735291493) {
                    return parseStandardGenreAttribute(ihcVar);
                }
                if (i == 1684632427) {
                    return parseIndexAndCountAttribute(i, "TPOS", ihcVar);
                }
                if (i == 1953655662) {
                    return parseIndexAndCountAttribute(i, "TRCK", ihcVar);
                }
                if (i == 1953329263) {
                    return parseUint8Attribute(i, "TBPM", ihcVar, true, false);
                }
                if (i == 1668311404) {
                    return parseUint8Attribute(i, "TCMP", ihcVar, true, true);
                }
                if (i == 1668249202) {
                    return parseCoverArt(ihcVar);
                }
                if (i == 1631670868) {
                    return parseTextAttribute(i, "TPE2", ihcVar);
                }
                if (i == 1936682605) {
                    return parseTextAttribute(i, "TSOT", ihcVar);
                }
                if (i == 1936679276) {
                    return parseTextAttribute(i, "TSO2", ihcVar);
                }
                if (i == 1936679282) {
                    return parseTextAttribute(i, "TSOA", ihcVar);
                }
                if (i == 1936679265) {
                    return parseTextAttribute(i, "TSOP", ihcVar);
                }
                if (i == 1936679791) {
                    return parseTextAttribute(i, "TSOC", ihcVar);
                }
                if (i == 1920233063) {
                    return parseUint8Attribute(i, "ITUNESADVISORY", ihcVar, false, false);
                }
                if (i == 1885823344) {
                    return parseUint8Attribute(i, "ITUNESGAPLESS", ihcVar, false, true);
                }
                if (i == 1936683886) {
                    return parseTextAttribute(i, "TVSHOWSORT", ihcVar);
                }
                if (i == 1953919848) {
                    return parseTextAttribute(i, "TVSHOW", ihcVar);
                }
                if (i == 757935405) {
                    return parseInternalAttribute(ihcVar, position);
                }
            }
            yh9.m25913d("MetadataUtil", "Skipped unknown metadata entry: " + ib0.getAtomTypeString(i));
            ihcVar.setPosition(position);
            return null;
        } finally {
            ihcVar.setPosition(position);
        }
    }

    @hib
    private static TextInformationFrame parseIndexAndCountAttribute(int i, String str, ihc ihcVar) {
        int i2 = ihcVar.readInt();
        if (ihcVar.readInt() == 1684108385 && i2 >= 22) {
            ihcVar.skipBytes(10);
            int unsignedShort = ihcVar.readUnsignedShort();
            if (unsignedShort > 0) {
                String str2 = "" + unsignedShort;
                int unsignedShort2 = ihcVar.readUnsignedShort();
                if (unsignedShort2 > 0) {
                    str2 = str2 + pj4.f71071b + unsignedShort2;
                }
                return new TextInformationFrame(str, (String) null, kx7.m15111of(str2));
            }
        }
        yh9.m25919w("MetadataUtil", "Failed to parse index/count attribute: " + ib0.getAtomTypeString(i));
        return null;
    }

    @hib
    private static Id3Frame parseInternalAttribute(ihc ihcVar, int i) {
        String nullTerminatedString = null;
        String nullTerminatedString2 = null;
        int i2 = -1;
        int i3 = -1;
        while (ihcVar.getPosition() < i) {
            int position = ihcVar.getPosition();
            int i4 = ihcVar.readInt();
            int i5 = ihcVar.readInt();
            ihcVar.skipBytes(4);
            if (i5 == 1835360622) {
                nullTerminatedString = ihcVar.readNullTerminatedString(i4 - 12);
            } else if (i5 == 1851878757) {
                nullTerminatedString2 = ihcVar.readNullTerminatedString(i4 - 12);
            } else {
                if (i5 == 1684108385) {
                    i2 = position;
                    i3 = i4;
                }
                ihcVar.skipBytes(i4 - 12);
            }
        }
        if (nullTerminatedString == null || nullTerminatedString2 == null || i2 == -1) {
            return null;
        }
        ihcVar.setPosition(i2);
        ihcVar.skipBytes(16);
        return new InternalFrame(nullTerminatedString, nullTerminatedString2, ihcVar.readNullTerminatedString(i3 - 16));
    }

    @hib
    public static MdtaMetadataEntry parseMdtaMetadataEntryFromIlst(ihc ihcVar, int i, String str) {
        while (true) {
            int position = ihcVar.getPosition();
            if (position >= i) {
                return null;
            }
            int i2 = ihcVar.readInt();
            if (ihcVar.readInt() == 1684108385) {
                int i3 = ihcVar.readInt();
                int i4 = ihcVar.readInt();
                int i5 = i2 - 16;
                byte[] bArr = new byte[i5];
                ihcVar.readBytes(bArr, 0, i5);
                return new MdtaMetadataEntry(str, bArr, i4, i3);
            }
            ihcVar.setPosition(position + i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    @p000.hib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.exoplayer2.metadata.id3.TextInformationFrame parseStandardGenreAttribute(p000.ihc r3) {
        /*
            int r3 = parseUint8AttributeValue(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = p000.lua.f58797F
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L20
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame
            java.lang.String r2 = "TCON"
            kx7 r3 = p000.kx7.m15111of(r3)
            r1.<init>(r2, r0, r3)
            return r1
        L20:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            p000.yh9.m25919w(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lua.parseStandardGenreAttribute(ihc):com.google.android.exoplayer2.metadata.id3.TextInformationFrame");
    }

    @hib
    private static TextInformationFrame parseTextAttribute(int i, String str, ihc ihcVar) {
        int i2 = ihcVar.readInt();
        if (ihcVar.readInt() == 1684108385) {
            ihcVar.skipBytes(8);
            return new TextInformationFrame(str, (String) null, kx7.m15111of(ihcVar.readNullTerminatedString(i2 - 16)));
        }
        yh9.m25919w("MetadataUtil", "Failed to parse text attribute: " + ib0.getAtomTypeString(i));
        return null;
    }

    @hib
    private static Id3Frame parseUint8Attribute(int i, String str, ihc ihcVar, boolean z, boolean z2) {
        int uint8AttributeValue = parseUint8AttributeValue(ihcVar);
        if (z2) {
            uint8AttributeValue = Math.min(1, uint8AttributeValue);
        }
        if (uint8AttributeValue >= 0) {
            return z ? new TextInformationFrame(str, (String) null, kx7.m15111of(Integer.toString(uint8AttributeValue))) : new CommentFrame("und", str, Integer.toString(uint8AttributeValue));
        }
        yh9.m25919w("MetadataUtil", "Failed to parse uint8 attribute: " + ib0.getAtomTypeString(i));
        return null;
    }

    private static int parseUint8AttributeValue(ihc ihcVar) {
        ihcVar.skipBytes(4);
        if (ihcVar.readInt() == 1684108385) {
            ihcVar.skipBytes(8);
            return ihcVar.readUnsignedByte();
        }
        yh9.m25919w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static void setFormatGaplessInfo(int i, n27 n27Var, kq6.C8497b c8497b) {
        if (i == 1 && n27Var.hasGaplessInfo()) {
            c8497b.setEncoderDelay(n27Var.f63053a).setEncoderPadding(n27Var.f63054b);
        }
    }

    public static void setFormatMetadata(int i, @hib Metadata metadata, @hib Metadata metadata2, kq6.C8497b c8497b, Metadata... metadataArr) {
        Metadata metadata3 = new Metadata(new Metadata.Entry[0]);
        if (i != 1 || metadata == null) {
            metadata = metadata3;
        }
        if (metadata2 != null) {
            for (int i2 = 0; i2 < metadata2.length(); i2++) {
                Metadata.Entry entry = metadata2.get(i2);
                if (entry instanceof MdtaMetadataEntry) {
                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entry;
                    if (!mdtaMetadataEntry.f19663a.equals("com.android.capture.fps")) {
                        metadata = metadata.copyWithAppendedEntries(mdtaMetadataEntry);
                    } else if (i == 2) {
                        metadata = metadata.copyWithAppendedEntries(mdtaMetadataEntry);
                    }
                }
            }
        }
        for (Metadata metadata4 : metadataArr) {
            metadata = metadata.copyWithAppendedEntriesFrom(metadata4);
        }
        if (metadata.length() > 0) {
            c8497b.setMetadata(metadata);
        }
    }
}
