package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p000.hga;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ptg extends cr7 {

    /* JADX INFO: renamed from: b */
    @hib
    public final String f72006b;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public final String f72007c;

    /* JADX INFO: renamed from: d */
    public final kx7<String> f72008d;

    public ptg(String str, @hib String str2, List<String> list) {
        super(str);
        v80.checkArgument(!list.isEmpty());
        this.f72006b = str2;
        kx7<String> kx7VarCopyOf = kx7.copyOf((Collection) list);
        this.f72008d = kx7VarCopyOf;
        this.f72007c = kx7VarCopyOf.get(0);
    }

    private static List<Integer> parseId3v2point4TimestampFrameForDate(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ptg.class != obj.getClass()) {
            return false;
        }
        ptg ptgVar = (ptg) obj;
        return Objects.equals(this.f27130a, ptgVar.f27130a) && Objects.equals(this.f72006b, ptgVar.f72006b) && this.f72008d.equals(ptgVar.f72008d);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f27130a.hashCode()) * 31;
        String str = this.f72006b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f72008d.hashCode();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p000.eta.InterfaceC5464a
    public void populateMediaMetadata(hga.C6845b c6845b) {
        String str = this.f27130a;
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b = 11;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    b = 12;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b = 13;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b = 14;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b = 15;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b = 16;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b = 17;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b = 18;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b = 19;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b = 20;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b = 21;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b = 22;
                }
                break;
        }
        try {
            switch (b) {
                case 0:
                case 10:
                    c6845b.setAlbumTitle(this.f72008d.get(0));
                    break;
                case 1:
                case 11:
                    c6845b.setComposer(this.f72008d.get(0));
                    break;
                case 2:
                case 13:
                    String str2 = this.f72008d.get(0);
                    c6845b.setRecordingMonth(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).setRecordingDay(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 18:
                    c6845b.setArtist(this.f72008d.get(0));
                    break;
                case 4:
                case 19:
                    c6845b.setAlbumArtist(this.f72008d.get(0));
                    break;
                case 5:
                case 20:
                    c6845b.setConductor(this.f72008d.get(0));
                    break;
                case 6:
                case 21:
                    String[] strArrSplit = t0i.split(this.f72008d.get(0), pj4.f71071b);
                    c6845b.setTrackNumber(Integer.valueOf(Integer.parseInt(strArrSplit[0]))).setTotalTrackCount(strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null);
                    break;
                case 7:
                case 17:
                    c6845b.setTitle(this.f72008d.get(0));
                    break;
                case 8:
                case 16:
                    c6845b.setWriter(this.f72008d.get(0));
                    break;
                case 9:
                case 22:
                    c6845b.setRecordingYear(Integer.valueOf(Integer.parseInt(this.f72008d.get(0))));
                    break;
                case 12:
                    Integer numTryParse = rd8.tryParse(this.f72008d.get(0));
                    if (numTryParse != null) {
                        String strResolveV1Genre = hr7.resolveV1Genre(numTryParse.intValue());
                        if (strResolveV1Genre != null) {
                            c6845b.setGenre(strResolveV1Genre);
                        }
                    } else {
                        c6845b.setGenre(this.f72008d.get(0));
                    }
                    break;
                case 14:
                    List<Integer> id3v2point4TimestampFrameForDate = parseId3v2point4TimestampFrameForDate(this.f72008d.get(0));
                    int size = id3v2point4TimestampFrameForDate.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c6845b.setRecordingDay(id3v2point4TimestampFrameForDate.get(2));
                            }
                        }
                        c6845b.setRecordingMonth(id3v2point4TimestampFrameForDate.get(1));
                    }
                    c6845b.setRecordingYear(id3v2point4TimestampFrameForDate.get(0));
                    break;
                case 15:
                    List<Integer> id3v2point4TimestampFrameForDate2 = parseId3v2point4TimestampFrameForDate(this.f72008d.get(0));
                    int size2 = id3v2point4TimestampFrameForDate2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c6845b.setReleaseDay(id3v2point4TimestampFrameForDate2.get(2));
                            }
                        }
                        c6845b.setReleaseMonth(id3v2point4TimestampFrameForDate2.get(1));
                    }
                    c6845b.setReleaseYear(id3v2point4TimestampFrameForDate2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // p000.cr7
    public String toString() {
        return this.f27130a + ": description=" + this.f72006b + ": values=" + this.f72008d;
    }

    @Deprecated
    @p28(imports = {"com.google.common.collect.ImmutableList"}, replacement = "this(id, description, ImmutableList.of(value))")
    public ptg(String str, @hib String str2, String str3) {
        this(str, str2, kx7.m15111of(str3));
    }
}
