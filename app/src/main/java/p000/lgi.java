package p000;

import p000.eta;
import p000.hga;

/* JADX INFO: loaded from: classes3.dex */
@ovh
@Deprecated
public class lgi implements eta.InterfaceC5464a {

    /* JADX INFO: renamed from: a */
    public final String f57531a;

    /* JADX INFO: renamed from: b */
    public final String f57532b;

    public lgi(String str, String str2) {
        this.f57531a = i80.toUpperCase(str);
        this.f57532b = str2;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lgi lgiVar = (lgi) obj;
        return this.f57531a.equals(lgiVar.f57531a) && this.f57532b.equals(lgiVar.f57532b);
    }

    public int hashCode() {
        return ((527 + this.f57531a.hashCode()) * 31) + this.f57532b.hashCode();
    }

    @Override // p000.eta.InterfaceC5464a
    public void populateMediaMetadata(hga.C6845b c6845b) {
        String str = this.f57531a;
        str.hashCode();
        switch (str) {
            case "TOTALTRACKS":
                Integer numTryParse = rd8.tryParse(this.f57532b);
                if (numTryParse != null) {
                    c6845b.setTotalTrackCount(numTryParse);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numTryParse2 = rd8.tryParse(this.f57532b);
                if (numTryParse2 != null) {
                    c6845b.setTotalDiscCount(numTryParse2);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numTryParse3 = rd8.tryParse(this.f57532b);
                if (numTryParse3 != null) {
                    c6845b.setTrackNumber(numTryParse3);
                    break;
                }
                break;
            case "ALBUM":
                c6845b.setAlbumTitle(this.f57532b);
                break;
            case "GENRE":
                c6845b.setGenre(this.f57532b);
                break;
            case "TITLE":
                c6845b.setTitle(this.f57532b);
                break;
            case "DESCRIPTION":
                c6845b.setDescription(this.f57532b);
                break;
            case "DISCNUMBER":
                Integer numTryParse4 = rd8.tryParse(this.f57532b);
                if (numTryParse4 != null) {
                    c6845b.setDiscNumber(numTryParse4);
                    break;
                }
                break;
            case "ALBUMARTIST":
                c6845b.setAlbumArtist(this.f57532b);
                break;
            case "ARTIST":
                c6845b.setArtist(this.f57532b);
                break;
        }
    }

    public String toString() {
        return "VC: " + this.f57531a + "=" + this.f57532b;
    }
}
